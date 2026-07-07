package com.android.internal.protolog;

public class ProtoLogConfigurationClient extends com.android.internal.protolog.IProtoLogClient.Stub {
    private static final java.lang.String LOG_TAG = "ProtoLogConfigListener";
    private com.android.internal.protolog.IProtoLogConfigurationService mConfigService;
    private final java.util.concurrent.ExecutorService mExecutor = null;
    private final java.util.Map<java.lang.String, com.android.internal.protolog.common.IProtoLogGroup> mGroups = null;
    private final com.android.internal.protolog.ProtoLogConfigurationClient.LogcatToggleListener mLogcatToggleListener = null;
    private final java.util.concurrent.CountDownLatch mRegisteredLatch = null;
    private boolean mStarted;
    private final java.lang.String mViewerConfigFile = null;
    public ProtoLogConfigurationClient(java.lang.String p0, com.android.internal.protolog.ProtoLogConfigurationClient.LogcatToggleListener p1) { super(); }
    public ProtoLogConfigurationClient(java.lang.String p0, com.android.internal.protolog.ProtoLogConfigurationClient.LogcatToggleListener p1, java.util.concurrent.ExecutorService p2) { super(); }
    private static com.android.internal.protolog.IProtoLogConfigurationService getConfigurationService() { return null; }
    private void registerGroupsWithConfigurationServiceAsync(com.android.internal.protolog.common.IProtoLogGroup... p0) {}
    public void addGroups(com.android.internal.protolog.common.IProtoLogGroup[] p0) {}
    public void start(com.android.internal.protolog.common.IProtoLogGroup[] p0, boolean p1, com.android.internal.protolog.IProtoLogConfigurationService p2) {}
    public void stop() {}
    public void toggleLogcat(boolean p0, java.lang.String[] p1) {}
    public void waitForRegistration() {}

    public static interface LogcatToggleListener {
        public void onLogcatToggle(boolean p0, java.lang.String[] p1);
    }
}
