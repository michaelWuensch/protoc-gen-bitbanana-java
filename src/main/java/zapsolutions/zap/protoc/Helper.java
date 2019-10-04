package zapsolutions.zap.protoc;

import com.google.protobuf.DescriptorProtos;

public class Helper {

    public static Constants.StreamingType getStreamingType(DescriptorProtos.MethodDescriptorProto methodDescriptorProto) {
        if (methodDescriptorProto.getClientStreaming()) {
            if (methodDescriptorProto.getServerStreaming()) {
                return Constants.StreamingType.TYPE_BIDIRECT;
            } else {
                return Constants.StreamingType.TYPE_CLIENT;
            }
        } else {
            if (methodDescriptorProto.getServerStreaming()) {
                return Constants.StreamingType.TYPE_SERVER;
            } else {
                return Constants.StreamingType.TYPE_UNARY;
            }
        }
    }
}
