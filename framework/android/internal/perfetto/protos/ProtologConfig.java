package android.internal.perfetto.protos;

public final class ProtologConfig {
    public static final int PROTOLOG_LEVEL_DEBUG = 1;
    public static final int PROTOLOG_LEVEL_ERROR = 5;
    public static final int PROTOLOG_LEVEL_INFO = 3;
    public static final int PROTOLOG_LEVEL_UNDEFINED = 0;
    public static final int PROTOLOG_LEVEL_VERBOSE = 2;
    public static final int PROTOLOG_LEVEL_WARN = 4;
    public static final int PROTOLOG_LEVEL_WTF = 6;
    public ProtologConfig() {}

    public final class ProtoLogConfig {
        public static final int DEFAULT = 0;
        public static final long DEFAULT_LOG_FROM_LEVEL = 1159641169923L;
        public static final int ENABLE_ALL = 1;
        public static final long GROUP_OVERRIDES = 2246267895809L;
        public static final long TRACING_MODE = 1159641169922L;
        public ProtoLogConfig(android.internal.perfetto.protos.ProtologConfig p0) {}
    }

    public final class ProtoLogGroup {
        public static final long COLLECT_STACKTRACE = 1133871366147L;
        public static final long GROUP_NAME = 1138166333441L;
        public static final long LOG_FROM = 1159641169922L;
        public ProtoLogGroup(android.internal.perfetto.protos.ProtologConfig p0) {}
    }
}
