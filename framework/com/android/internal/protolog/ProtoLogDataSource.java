package com.android.internal.protolog;

public class ProtoLogDataSource extends android.tracing.perfetto.DataSource<com.android.internal.protolog.ProtoLogDataSource.Instance, com.android.internal.protolog.ProtoLogDataSource.TlsState, com.android.internal.protolog.ProtoLogDataSource.IncrementalState> {
    private static final java.lang.String DATASOURCE_NAME = "android.protolog";
    private static final java.lang.String TAG = "ProtoLogDataSource";
    private final java.util.Set<com.android.internal.protolog.ProtoLogDataSource.Instance.ProtoLogTracingInstanceStartCallback> mOnStartCallbacks = null;
    private final java.util.Set<com.android.internal.protolog.ProtoLogDataSource.Instance.ProtoLogTracingInstanceStopCallback> mOnStopCallbacks = null;
    private final java.util.Map<java.lang.Integer, com.android.internal.protolog.ProtoLogDataSource.ProtoLogConfig> mRunningInstances = null;
    public ProtoLogDataSource() { super(null); }
    public ProtoLogDataSource(java.lang.String p0) { super(null); }
    private void executeOnStartCallbacks(int p0, com.android.internal.protolog.ProtoLogDataSource.ProtoLogConfig p1) {}
    private void executeOnStopCallbacks(int p0, com.android.internal.protolog.ProtoLogDataSource.ProtoLogConfig p1) {}
    private static com.android.internal.protolog.common.LogLevel logLevelFromInt(int p0) { return null; }
    private static com.android.internal.protolog.ProtoLogDataSource.ProtoLogConfig readProtoLogConfig(android.util.proto.ProtoInputStream p0) throws java.io.IOException { return null; }
    public com.android.internal.protolog.ProtoLogDataSource.IncrementalState createIncrementalState(android.tracing.perfetto.CreateIncrementalStateArgs<com.android.internal.protolog.ProtoLogDataSource.Instance> p0) { return null; }
    public com.android.internal.protolog.ProtoLogDataSource.Instance createInstance(android.util.proto.ProtoInputStream p0, int p1) { return null; }
    public com.android.internal.protolog.ProtoLogDataSource.TlsState createTlsState(android.tracing.perfetto.CreateTlsStateArgs<com.android.internal.protolog.ProtoLogDataSource.Instance> p0) { return null; }
    public void registerOnStartCallback(com.android.internal.protolog.ProtoLogDataSource.Instance.ProtoLogTracingInstanceStartCallback p0) {}
    public void registerOnStopCallback(com.android.internal.protolog.ProtoLogDataSource.Instance.ProtoLogTracingInstanceStopCallback p0) {}
    public void unregisterOnStartCallback(com.android.internal.protolog.ProtoLogDataSource.Instance.ProtoLogTracingInstanceStartCallback p0) {}
    public void unregisterOnStopCallback(com.android.internal.protolog.ProtoLogDataSource.Instance.ProtoLogTracingInstanceStopCallback p0) {}

    public static class GroupConfig {
        public final boolean collectStackTrace = false;
        public final com.android.internal.protolog.common.LogLevel logFrom = null;
        public GroupConfig(com.android.internal.protolog.common.LogLevel p0, boolean p1) {}
    }

    public static class IncrementalState {
        public final java.util.Map<java.lang.String, java.lang.Integer> argumentInterningMap = null;
        public boolean clearReported;
        public long internedStringsSizeBytes;
        public final java.util.Set<java.lang.Integer> protologGroupInterningSet = null;
        public final java.util.Set<java.lang.Long> protologMessageInterningSet = null;
        public final java.util.Map<java.lang.String, java.lang.Integer> stacktraceInterningMap = null;
        public IncrementalState() {}
        public void reset() {}
    }

    public static class Instance extends android.tracing.perfetto.DataSourceInstance {
        private final com.android.internal.protolog.ProtoLogDataSource.ProtoLogConfig mConfig = null;
        private final int mInstanceIndex = 0;
        private final com.android.internal.protolog.ProtoLogDataSource.Instance.ProtoLogTracingInstanceStartCallback mOnStart = null;
        private final com.android.internal.protolog.ProtoLogDataSource.Instance.ProtoLogTracingInstanceStopCallback mOnStop = null;
        public Instance(android.tracing.perfetto.DataSource<com.android.internal.protolog.ProtoLogDataSource.Instance, com.android.internal.protolog.ProtoLogDataSource.TlsState, com.android.internal.protolog.ProtoLogDataSource.IncrementalState> p0, int p1, com.android.internal.protolog.ProtoLogDataSource.ProtoLogConfig p2, com.android.internal.protolog.ProtoLogDataSource.Instance.ProtoLogTracingInstanceStartCallback p3, com.android.internal.protolog.ProtoLogDataSource.Instance.ProtoLogTracingInstanceStopCallback p4) { super(null, 0); }
        public void onFlush(android.tracing.perfetto.FlushCallbackArguments p0) {}
        public void onStart(android.tracing.perfetto.StartCallbackArguments p0) {}
        public void onStop(android.tracing.perfetto.StopCallbackArguments p0) {}

        @java.lang.FunctionalInterface
        public static interface ProtoLogTracingInstanceStartCallback {
            public void onTracingInstanceStart(int p0, com.android.internal.protolog.ProtoLogDataSource.ProtoLogConfig p1);
        }

        @java.lang.FunctionalInterface
        public static interface ProtoLogTracingInstanceStopCallback {
            public void onTracingInstanceStop(int p0, com.android.internal.protolog.ProtoLogDataSource.ProtoLogConfig p1);
        }
    }

    public static class ProtoLogConfig {
        private static final com.android.internal.protolog.ProtoLogDataSource.ProtoLogConfig DEFAULT = null;
        private final com.android.internal.protolog.common.LogLevel mDefaultLogFromLevel = null;
        private final java.util.Map<java.lang.String, com.android.internal.protolog.ProtoLogDataSource.GroupConfig> mGroupConfigs = null;
        private ProtoLogConfig(com.android.internal.protolog.common.LogLevel p0, java.util.Map<java.lang.String, com.android.internal.protolog.ProtoLogDataSource.GroupConfig> p1) {}
        public static com.android.internal.protolog.ProtoLogDataSource.ProtoLogConfig parseFrom(byte[] p0) throws java.io.IOException { return null; }
        public com.android.internal.protolog.ProtoLogDataSource.GroupConfig getConfigFor(java.lang.String p0) { return null; }
        public com.android.internal.protolog.ProtoLogDataSource.GroupConfig getDefaultGroupConfig() { return null; }
        public java.util.Set<java.lang.String> getGroupTagsWithOverriddenConfigs() { return null; }
    }

    public static class TlsState {
        private final com.android.internal.protolog.ProtoLogDataSource.ProtoLogConfig mConfig = null;
        private TlsState(com.android.internal.protolog.ProtoLogDataSource.ProtoLogConfig p0) {}
        private com.android.internal.protolog.ProtoLogDataSource.GroupConfig getConfigFor(java.lang.String p0) { return null; }
        public com.android.internal.protolog.common.LogLevel getLogFromLevel(java.lang.String p0) { return null; }
        public boolean getShouldCollectStacktrace(java.lang.String p0) { return false; }
    }
}
