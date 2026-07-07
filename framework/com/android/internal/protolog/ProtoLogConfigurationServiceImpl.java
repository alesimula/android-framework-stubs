package com.android.internal.protolog;

public class ProtoLogConfigurationServiceImpl extends com.android.internal.protolog.IProtoLogConfigurationService.Stub implements com.android.internal.protolog.ProtoLogConfigurationService, android.os.IBinder.DeathRecipient {
    private static final java.lang.String LOG_TAG = "ProtoLogConfigurationService";
    private final java.util.Map<android.os.IBinder, com.android.internal.protolog.ProtoLogConfigurationServiceImpl.ClientRecord> mClientRecords = null;
    private final java.util.Map<java.lang.String, java.lang.Integer> mConfigFileCounts = null;
    private final java.lang.Object mConfigLock = null;
    private final com.android.internal.protolog.ProtoLogDataSource mDataSource = null;
    private final java.util.Map<java.lang.String, java.lang.Boolean> mLogGroupToLogcatStatus = null;
    private final java.util.Set<java.lang.String> mRegisteredGroups = null;
    private final java.util.Set<java.lang.Integer> mRunningInstances = null;
    private final com.android.internal.protolog.ProtoLogConfigurationServiceImpl.ViewerConfigFileTracer mViewerConfigFileTracer = null;
    public ProtoLogConfigurationServiceImpl() { super(); }
    public ProtoLogConfigurationServiceImpl(com.android.internal.protolog.ProtoLogConfigurationServiceImpl.ViewerConfigFileTracer p0) { super(); }
    public ProtoLogConfigurationServiceImpl(com.android.internal.protolog.ProtoLogDataSource p0) { super(); }
    public ProtoLogConfigurationServiceImpl(com.android.internal.protolog.ProtoLogDataSource p0, com.android.internal.protolog.ProtoLogConfigurationServiceImpl.ViewerConfigFileTracer p1) { super(); }
    private static void dumpViewerConfig(com.android.internal.protolog.ProtoLogDataSource p0, java.lang.String p1) {}
    private void onTracingInstanceFlush() {}
    private void onTracingInstanceStart(int p0, com.android.internal.protolog.ProtoLogDataSource.ProtoLogConfig p1) {}
    private void onTracingInstanceStop(int p0, com.android.internal.protolog.ProtoLogDataSource.ProtoLogConfig p1) {}
    private void registerGroupsLocked(com.android.internal.protolog.IProtoLogClient p0, java.lang.String[] p1, boolean[] p2) throws android.os.RemoteException {}
    private void toggleProtoLogToLogcat(java.io.PrintWriter p0, boolean p1, java.lang.String[] p2) {}
    public void binderDied() {}
    public void binderDied(android.os.IBinder p0) {}
    public void disableProtoLogToLogcat(java.io.PrintWriter p0, java.lang.String... p1) {}
    public void enableProtoLogToLogcat(java.io.PrintWriter p0, java.lang.String... p1) {}
    public java.lang.String[] getGroups() { return null; }
    public boolean isLoggingToLogcat(java.lang.String p0) { return false; }
    public void onShellCommand(java.io.FileDescriptor p0, java.io.FileDescriptor p1, java.io.FileDescriptor p2, java.lang.String[] p3, android.os.ShellCallback p4, android.os.ResultReceiver p5) throws android.os.RemoteException {}
    public void registerClient(com.android.internal.protolog.IProtoLogClient p0, com.android.internal.protolog.IProtoLogConfigurationService.RegisterClientArgs p1) throws android.os.RemoteException {}
    public void registerGroups(com.android.internal.protolog.IProtoLogClient p0, com.android.internal.protolog.IProtoLogConfigurationService.RegisterGroupsArgs p1) throws android.os.RemoteException {}
    public void unregisterClient(com.android.internal.protolog.IProtoLogClient p0) {}

    private static final class ClientRecord {
        public final com.android.internal.protolog.IProtoLogClient client = null;
        public final java.lang.String configFile = null;
        public final java.util.Set<java.lang.String> groups = null;
        public ClientRecord(com.android.internal.protolog.IProtoLogClient p0, java.lang.String p1) {}
    }

    @java.lang.FunctionalInterface
    public static interface ViewerConfigFileTracer {
        public void trace(com.android.internal.protolog.ProtoLogDataSource p0, java.lang.String p1);
    }
}
