package zapsolutions.zap.protoc;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.compiler.PluginProtos;

import java.io.IOException;

public class ProtocPlugin {

    static final class ReturnType {
        static String VOID = "void ";
    }

    private static final String PACKAGE_NAME = "package zapsolutions.zap.lnd";

    private static final String NEWLINE = "\n";
    private static final String SEMICOLON = ";";
    private static final String COMMA = ",";
    private static final String BRACKET_OPEN = "(";
    private static final String BRACKET_CLOSE = ")";
    private static final String BRACES_OPEN = "{";
    private static final String BRACES_CLOSE = "}";

    public static void main(String[] args) throws IOException {

        PluginProtos.CodeGeneratorRequest codeGeneratorRequest = PluginProtos.CodeGeneratorRequest.parseFrom(System.in);
        PluginProtos.CodeGeneratorResponse.Builder responseBuilder = PluginProtos.CodeGeneratorResponse.newBuilder();


        codeGeneratorRequest.getProtoFileList().forEach((DescriptorProtos.FileDescriptorProto fileDescriptorProto) -> {
            // interfaces for each service in own file
            fileDescriptorProto.getServiceList().forEach((DescriptorProtos.ServiceDescriptorProto serviceDescriptor) -> {
                PluginProtos.CodeGeneratorResponse.File.Builder builder = responseBuilder.addFileBuilder();
                generateInterface(builder, serviceDescriptor);
                builder.build();
            });
        });


        PluginProtos.CodeGeneratorResponse response = responseBuilder.build();
        response.writeTo(System.out);
    }

    private static void generateInterface(PluginProtos.CodeGeneratorResponse.File.Builder fileBuilder, DescriptorProtos.ServiceDescriptorProto serviceDescriptorProto) {
        StringBuilder fileContent = new StringBuilder();
        String serviceName = "Lnd" + serviceDescriptorProto.getName() + "Service";
        fileBuilder.setName(serviceName + ".java");

        // heading
        fileContent.append(PACKAGE_NAME + SEMICOLON);
        fileContent.append(NEWLINE);

        // start interface
        fileContent.append("interface ").append(serviceName);
        fileContent.append(BRACES_OPEN);
        fileContent.append(NEWLINE);

        // methods
        serviceDescriptorProto.getMethodList().forEach((DescriptorProtos.MethodDescriptorProto methodDescriptor)
                -> appendMethod(fileContent, methodDescriptor));

        // end interface
        fileContent.append(BRACES_CLOSE);

        fileBuilder.setContent(fileContent.toString());
    }

    private static void appendMethod(StringBuilder data, DescriptorProtos.MethodDescriptorProto methodDescriptorProto) {
        String inputParam = methodDescriptorProto.getInputType().replace(".lnrpc", "com.github.lightningnetwork.lnd.lnrpc");
        String callback = "lndmobile.Callback callback";
        data.append(ReturnType.VOID).append(methodDescriptorProto.getName()).append(BRACKET_OPEN).append(inputParam).append(COMMA).append(callback).append(BRACKET_CLOSE).append(SEMICOLON);
        data.append(NEWLINE);
    }
}