package com.android.internal.tracing.winscope.protos;

public final class Protolog {
    public static final int PROTOLOG_LEVEL_DEBUG = 1;
    public static final int PROTOLOG_LEVEL_ERROR = 5;
    public static final int PROTOLOG_LEVEL_INFO = 3;
    public static final int PROTOLOG_LEVEL_UNDEFINED = 0;
    public static final int PROTOLOG_LEVEL_VERBOSE = 2;
    public static final int PROTOLOG_LEVEL_WARN = 4;
    public static final int PROTOLOG_LEVEL_WTF = 6;
    public Protolog() {}

    public final class ProtoLogMessage {
        public static final long BOOLEAN_PARAMS = 2220498092037L;
        public static final long DOUBLE_PARAMS = 2203318222852L;
        public static final long MESSAGE_ID = 1125281431553L;
        public static final long SINT64_PARAMS = 2276332666883L;
        public static final long STACKTRACE_IID = 1155346202630L;
        public static final long STR_PARAM_IIDS = 2254857830402L;
        public ProtoLogMessage(com.android.internal.tracing.winscope.protos.Protolog p0) {}
    }

    public final class ProtoLogViewerConfig {
        public static final long GROUPS = 2246267895810L;
        public static final long MESSAGES = 2246267895809L;
        public ProtoLogViewerConfig(com.android.internal.tracing.winscope.protos.Protolog p0) {}

        public final class Group {
            public static final long ID = 1155346202625L;
            public static final long NAME = 1138166333442L;
            public static final long TAG = 1138166333443L;
            public Group(com.android.internal.tracing.winscope.protos.Protolog.ProtoLogViewerConfig p0) {}
        }

        public final class MessageData {
            public static final long GROUP_ID = 1155346202628L;
            public static final long LEVEL = 1159641169923L;
            public static final long LOCATION = 1138166333445L;
            public static final long MESSAGE = 1138166333442L;
            public static final long MESSAGE_ID = 1125281431553L;
            public MessageData(com.android.internal.tracing.winscope.protos.Protolog.ProtoLogViewerConfig p0) {}
        }
    }
}
