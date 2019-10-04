package zapsolutions.zap.protoc;

public class Constants {

    static final class Defaults {
        static final String EMPTY = "";
        static final String SPACE = " ";
        static final String TAB = "\t";
        static final String NEWLINE = "\n";
        static final String SEMICOLON = ";";
        static final String BRACKET_OPEN = "(";
        static final String BRACKET_CLOSE = ")";
        static final String BRACES_OPEN = "{";
        static final String BRACES_CLOSE = "}";
    }

    static final class Java {
        static final String CLASS = "class";
        static final String OVERRIDE = "@Override";
        static final String PUBLIC = "public";
        static final String PRIVATE = "private";
        static final String IMPORT = "import";
        static final String PACKAGE = "package";
        static final String INTERFACE = "interface";
        static final String IMPLEMENTS = "implements";

    }

    static final class ClassNames {
        static final String FQ_NAME_ZAP_LND = "zapsolutions.zap.lnd";
        static final String FQ_NAME_LNRPC = "com.github.lightningnetwork.lnd.lnrpc";
        static final String FQ_NAME_OBSERVABLE = "io.reactivex.rxjava3.core.Observable";
        static final String FQ_NAME_LNDMOBILE = "lndmobile.Lndmobile";
        static final String FQ_NAME_PROTOCOL_EX = "com.google.protobuf.InvalidProtocolBufferException";
        static final String FQ_NAME_GRPC_CHANNEL = "io.grpc.Channel";
        static final String FQ_NAME_GRPC_CREDENTIALS = "io.grpc.CallCredentials";
    }

    static final class ReturnType {
        static String TYPED_OBSERVABLE = "Observable<%s> ";
    }

    enum StreamingType {
        TYPE_BIDIRECT,
        TYPE_CLIENT,
        TYPE_SERVER,
        TYPE_UNARY
    }
}
