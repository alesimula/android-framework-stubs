package com.android.internal.protolog;

public class ProcessedPerfettoProtoLogImpl extends com.android.internal.protolog.PerfettoProtoLogImpl {
    private static final java.lang.String LOG_TAG = "PerfettoProtoLogImpl";
    private final java.util.concurrent.ConcurrentHashMap<java.lang.Long, java.lang.String> mFallbackDecodedMessages = null;
    private final java.lang.String mViewerConfigFilePath = null;
    @java.lang.Deprecated
    private final com.android.internal.protolog.ViewerConfigInputStreamProvider mViewerConfigInputStreamProvider = null;
    private final com.android.internal.protolog.ProtoLogViewerConfigReader mViewerConfigReader = null;
    public ProcessedPerfettoProtoLogImpl(com.android.internal.protolog.ProtoLogDataSource p0, java.lang.String p1, com.android.internal.protolog.ProtoLogCacheUpdater p2, com.android.internal.protolog.common.IProtoLogGroup[] p3) throws android.os.ServiceManager.ServiceNotFoundException { super((com.android.internal.protolog.ProtoLogDataSource)null, (com.android.internal.protolog.ProtoLogCacheUpdater)null, (com.android.internal.protolog.common.IProtoLogGroup[])null); }
    public ProcessedPerfettoProtoLogImpl(com.android.internal.protolog.ProtoLogDataSource p0, java.lang.String p1, com.android.internal.protolog.ViewerConfigInputStreamProvider p2, com.android.internal.protolog.ProtoLogCacheUpdater p3, com.android.internal.protolog.common.IProtoLogGroup[] p4) throws android.os.ServiceManager.ServiceNotFoundException { super((com.android.internal.protolog.ProtoLogDataSource)null, (com.android.internal.protolog.ProtoLogCacheUpdater)null, (com.android.internal.protolog.common.IProtoLogGroup[])null); }
    public ProcessedPerfettoProtoLogImpl(com.android.internal.protolog.ProtoLogDataSource p0, java.lang.String p1, com.android.internal.protolog.ViewerConfigInputStreamProvider p2, com.android.internal.protolog.ProtoLogViewerConfigReader p3, com.android.internal.protolog.ProtoLogCacheUpdater p4, com.android.internal.protolog.common.IProtoLogGroup[] p5) { super((com.android.internal.protolog.ProtoLogDataSource)null, (com.android.internal.protolog.ProtoLogCacheUpdater)null, (com.android.internal.protolog.common.IProtoLogGroup[])null); }
    public ProcessedPerfettoProtoLogImpl(com.android.internal.protolog.ProtoLogDataSource p0, java.lang.String p1, com.android.internal.protolog.ViewerConfigInputStreamProvider p2, com.android.internal.protolog.ProtoLogViewerConfigReader p3, com.android.internal.protolog.ProtoLogCacheUpdater p4, com.android.internal.protolog.common.IProtoLogGroup[] p5, java.util.concurrent.ExecutorService p6) { super((com.android.internal.protolog.ProtoLogDataSource)null, (com.android.internal.protolog.ProtoLogCacheUpdater)null, (com.android.internal.protolog.common.IProtoLogGroup[])null); }
    private java.lang.String getReasonForFailureToGetMessageString(com.android.internal.protolog.PerfettoProtoLogImpl.Message p0) { return null; }
    private void loadLogcatGroupsViewerConfig(com.android.internal.protolog.common.IProtoLogGroup[] p0) {}
    protected com.android.internal.protolog.IProtoLogConfigurationService.RegisterClientArgs createConfigurationServiceRegisterClientArgs() { return null; }
    @java.lang.Deprecated
    void dumpViewerConfig() {}
    java.lang.String getLogcatMessageString(com.android.internal.protolog.PerfettoProtoLogImpl.Message p0) { return null; }
    protected java.lang.String getViewerConfigPath() { return null; }
    public int startLoggingToLogcat(java.lang.String[] p0, com.android.internal.protolog.common.ILogger p1) { return 0; }
    public int stopLoggingToLogcat(java.lang.String[] p0, com.android.internal.protolog.common.ILogger p1) { return 0; }
}
