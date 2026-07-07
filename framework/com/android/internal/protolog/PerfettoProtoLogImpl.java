package com.android.internal.protolog;

public abstract class PerfettoProtoLogImpl extends com.android.internal.protolog.IProtoLogClient.Stub implements com.android.internal.protolog.common.IProtoLog, com.android.internal.protolog.ProtoLogDataSource.Instance.ProtoLogTracingInstanceStartCallback, com.android.internal.protolog.ProtoLogDataSource.Instance.ProtoLogTracingInstanceStopCallback, android.tracing.perfetto.DataSource.TracingInstanceFlushCallback, com.android.internal.protolog.ProtoLogNative.NativeDataSourceListener {
    private static final java.lang.String LOG_TAG = "ProtoLog";
    public static int MAX_INTERNED_STRINGS_SIZE_BYTES_BEFORE_RESET;
    public static final java.lang.String NULL_STRING = "null";
    private static final int STACK_SIZE_TO_PROTO_LOG_ENTRY_CALL = 6;
    private final java.util.Set<java.lang.Integer> mActiveTracingInstances = null;
    private volatile boolean mAsyncInitInProgress;
    private final java.lang.Object mAsyncInitLock = null;
    private final com.android.internal.protolog.ProtoLogCacheUpdater mCacheUpdater = null;
    private final java.util.Map<java.lang.String, java.lang.Integer> mCollectStackTraceGroupCounts = null;
    private final java.util.concurrent.locks.ReadWriteLock mConfigUpdaterLock = null;
    private com.android.internal.protolog.ProtoLogConfigurationClient mConfigurationClient;
    @java.lang.Deprecated
    private com.android.internal.protolog.IProtoLogConfigurationService mConfigurationService;
    protected final com.android.internal.protolog.ProtoLogDataSource mDataSource = null;
    private final int[] mDefaultLogLevelCounts = null;
    private final java.lang.Object mEnableLock = null;
    private volatile boolean mEnabledCalled;
    private final java.util.concurrent.LinkedBlockingDeque<java.lang.Runnable> mExecutorQueue = null;
    private final java.util.concurrent.CountDownLatch mFirstTracingInstanceStartLatch = null;
    private final java.util.TreeMap<java.lang.String, com.android.internal.protolog.common.IProtoLogGroup> mLogGroups = null;
    private final java.lang.Object mLogGroupsLock = null;
    private final java.util.Map<java.lang.String, int[]> mLogLevelCounts = null;
    private boolean mLogcatReady;
    public final java.util.concurrent.ExecutorService mSingleThreadedExecutor = null;
    private final java.util.concurrent.atomic.AtomicInteger mTracingInstances = null;
    protected PerfettoProtoLogImpl(com.android.internal.protolog.ProtoLogDataSource p0, com.android.internal.protolog.ProtoLogCacheUpdater p1, com.android.internal.protolog.common.IProtoLogGroup[] p2) { super(); }
    protected PerfettoProtoLogImpl(com.android.internal.protolog.ProtoLogDataSource p0, com.android.internal.protolog.ProtoLogCacheUpdater p1, com.android.internal.protolog.common.IProtoLogGroup[] p2, java.util.concurrent.ExecutorService p3) { super(); }
    private java.lang.String collectStackTrace() { return null; }
    private void disconnectFromConfigurationServiceAsync() {}
    private static com.android.internal.protolog.IProtoLogConfigurationService getConfigurationService() { return null; }
    private java.lang.Long hash(com.android.internal.protolog.common.LogLevel p0, java.lang.String p1, java.lang.String p2) { return null; }
    private long internProtoMessage(android.tracing.perfetto.TracingContext<com.android.internal.protolog.ProtoLogDataSource.Instance, com.android.internal.protolog.ProtoLogDataSource.TlsState, com.android.internal.protolog.ProtoLogDataSource.IncrementalState> p0, com.android.internal.protolog.common.LogLevel p1, com.android.internal.protolog.common.IProtoLogGroup p2, java.lang.String p3) { return 0L; }
    private int internStacktraceString(android.tracing.perfetto.TracingContext<com.android.internal.protolog.ProtoLogDataSource.Instance, com.android.internal.protolog.ProtoLogDataSource.TlsState, com.android.internal.protolog.ProtoLogDataSource.IncrementalState> p0, java.lang.String p1) { return 0; }
    private int internString(android.tracing.perfetto.TracingContext<com.android.internal.protolog.ProtoLogDataSource.Instance, com.android.internal.protolog.ProtoLogDataSource.TlsState, com.android.internal.protolog.ProtoLogDataSource.IncrementalState> p0, java.util.Map<java.lang.String, java.lang.Integer> p1, long p2, java.lang.String p3) { return 0; }
    private int internStringArg(android.tracing.perfetto.TracingContext<com.android.internal.protolog.ProtoLogDataSource.Instance, com.android.internal.protolog.ProtoLogDataSource.TlsState, com.android.internal.protolog.ProtoLogDataSource.IncrementalState> p0, java.lang.String p1) { return 0; }
    private void log(com.android.internal.protolog.common.LogLevel p0, com.android.internal.protolog.common.IProtoLogGroup p1, com.android.internal.protolog.PerfettoProtoLogImpl.Message p2, java.lang.Object[] p3) {}
    private static void logAndPrintln(java.io.PrintWriter p0, java.lang.String p1) {}
    private void logToLogcat(java.lang.String p0, com.android.internal.protolog.common.LogLevel p1, com.android.internal.protolog.PerfettoProtoLogImpl.Message p2, java.lang.Object[] p3) {}
    private void logToLogcat(java.lang.String p0, com.android.internal.protolog.common.LogLevel p1, java.lang.String p2, java.lang.Object[] p3) {}
    private void logToProto(com.android.internal.protolog.common.LogLevel p0, com.android.internal.protolog.common.IProtoLogGroup p1, com.android.internal.protolog.PerfettoProtoLogImpl.Message p2, java.lang.Object[] p3, long p4, java.lang.String p5) {}
    private void logToProtoNative(com.android.internal.protolog.common.LogLevel p0, com.android.internal.protolog.common.IProtoLogGroup p1, com.android.internal.protolog.PerfettoProtoLogImpl.Message p2, java.lang.Object[] p3) {}
    private void onTracingInstanceStartLocked(com.android.internal.protolog.ProtoLogDataSource.ProtoLogConfig p0) {}
    private void onTracingInstanceStopLocked(com.android.internal.protolog.ProtoLogDataSource.ProtoLogConfig p0) {}
    private void queueTracingInstanceAddition(int p0) {}
    private void queueTracingInstanceRemoval(int p0) {}
    private void registerGroupsLocally(com.android.internal.protolog.common.IProtoLogGroup[] p0) {}
    private void registerGroupsWithConfigurationServiceAsync(com.android.internal.protolog.common.IProtoLogGroup... p0) {}
    private int setTextLogging(boolean p0, com.android.internal.protolog.common.ILogger p1, java.lang.String... p2) { return 0; }
    private void snapshotMutableArgsToStringInPlace(java.lang.Object[] p0) {}
    private int unknownCommand(java.io.PrintWriter p0) { return 0; }
    private void verifyNoCollisionsOrDuplicates(com.android.internal.protolog.common.IProtoLogGroup[] p0) {}
    private void waitForExistingBackgroundTasksToComplete() {}
    protected abstract com.android.internal.protolog.IProtoLogConfigurationService.RegisterClientArgs createConfigurationServiceRegisterClientArgs();
    public void disable() {}
    @java.lang.Deprecated
    abstract void dumpViewerConfig();
    public void enable() {}
    public void enable(boolean p0) {}
    public void enable(boolean p0, com.android.internal.protolog.IProtoLogConfigurationService p1) {}
    abstract java.lang.String getLogcatMessageString(com.android.internal.protolog.PerfettoProtoLogImpl.Message p0);
    public java.util.List<com.android.internal.protolog.common.IProtoLogGroup> getRegisteredGroups() { return null; }
    protected java.lang.String getViewerConfigPath() { return null; }
    public boolean isEnabled(com.android.internal.protolog.common.IProtoLogGroup p0, com.android.internal.protolog.common.LogLevel p1) { return false; }
    public boolean isProtoEnabled() { return false; }
    public void log(com.android.internal.protolog.common.LogLevel p0, com.android.internal.protolog.common.IProtoLogGroup p1, long p2, long p3, java.lang.Object[] p4) {}
    public void log(com.android.internal.protolog.common.LogLevel p0, com.android.internal.protolog.common.IProtoLogGroup p1, java.lang.String p2, java.lang.Object... p3) {}
    @java.lang.Deprecated
    public int onShellCommand(android.os.ShellCommand p0) { return 0; }
    public void onTracingFlush() {}
    public void onTracingInstanceStart(int p0, com.android.internal.protolog.ProtoLogDataSource.ProtoLogConfig p1) {}
    public void onTracingInstanceStart(java.lang.String p0, int p1, byte[] p2) {}
    public void onTracingInstanceStop(int p0, com.android.internal.protolog.ProtoLogDataSource.ProtoLogConfig p1) {}
    public void onTracingInstanceStop(java.lang.String p0, int p1, byte[] p2) {}
    public void passToLogcat(java.lang.String p0, com.android.internal.protolog.common.LogLevel p1, java.lang.String p2) {}
    protected void readyToLogToLogcat() {}
    public void registerGroups(com.android.internal.protolog.common.IProtoLogGroup... p0) {}
    public int startLoggingToLogcat(java.lang.String[] p0, com.android.internal.protolog.common.ILogger p1) { return 0; }
    public int stopLoggingToLogcat(java.lang.String[] p0, com.android.internal.protolog.common.ILogger p1) { return 0; }
    public void toggleLogcat(boolean p0, java.lang.String[] p1) {}
    protected boolean validateGroups(com.android.internal.protolog.common.ILogger p0, java.lang.String[] p1) { return false; }
    public void waitForInitialization() {}

    protected static class Message {
        private final java.lang.Long mMessageHash = null;
        private final long mMessageMask = 0L;
        private final java.lang.String mMessageString = null;
        private Message(long p0, long p1) {}
        private Message(java.lang.String p0) throws com.android.internal.protolog.common.InvalidFormatStringException {}
        private long getMessageMask() { return 0L; }
        protected java.lang.String getMessage() { return null; }
        protected java.lang.String getMessage(com.android.internal.protolog.ProtoLogViewerConfigReader p0) { return null; }
        protected java.lang.Long getMessageHash() { return null; }
    }
}
