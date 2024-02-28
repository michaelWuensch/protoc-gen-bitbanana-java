package app.michaelwuensch.bitbanana.protoc;

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
        static final String FQ_NAME_BITBANANA_LND = "app.michaelwuensch.bitbanana.backends.lnd";
        static final String FQ_NAME_BITBANANA_CORE_LIGHTNING = "app.michaelwuensch.bitbanana.backends.coreLightning";
        static final String FQ_NAME_RPC_PACKAGE_PREFIX_LND = "com.github.lightningnetwork.lnd";
        static final String FQ_NAME_RPC_PACKAGE_PREFIX_CORE_LIGHTNING = "com.github.ElementsProject.lightning";
        static final String FQ_NAME_OBSERVABLE = "io.reactivex.rxjava3.core.Observable";
        static final String FQ_NAME_SINGLE = "io.reactivex.rxjava3.core.Single";
        static final String FQ_NAME_LNDMOBILE = "lndmobile.Lndmobile";
        static final String FQ_NAME_DEFAULT_OBSERVABLE = "app.michaelwuensch.bitbanana.backends.DefaultObservable";
        static final String FQ_NAME_DEFAULT_SINGLE = "app.michaelwuensch.bitbanana.backends.DefaultSingle";
        static final String FQ_NAME_REMOTE_STREAM_OBSERVER = "app.michaelwuensch.bitbanana.backends.RemoteStreamObserver";
        static final String FQ_NAME_REMOTE_SINGLE_OBSERVER = "app.michaelwuensch.bitbanana.backends.RemoteSingleObserver";
        static final String FQ_NAME_PROTOCOL_EX = "com.google.protobuf.InvalidProtocolBufferException";
        static final String FQ_NAME_GRPC_CHANNEL = "io.grpc.Channel";
        static final String FQ_NAME_GRPC_CREDENTIALS = "io.grpc.CallCredentials";
    }

    static final class ReturnType {
        static String TYPED_OBSERVABLE = "Observable<%s> ";
        static String TYPED_SINGLE = "Single<%s> ";
    }

    enum StreamingType {
        TYPE_BIDIRECT,
        TYPE_CLIENT,
        TYPE_SERVER,
        TYPE_UNARY
    }
}
