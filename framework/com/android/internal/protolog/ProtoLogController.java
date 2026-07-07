package com.android.internal.protolog;

public class ProtoLogController {
    private final java.util.Set<com.android.internal.protolog.common.IProtoLogGroup> mGroups = null;
    private final java.lang.Object mInitLock = null;
    com.android.internal.protolog.common.IProtoLog mProtoLogInstance;
    public ProtoLogController() {}
    private void assertForCollisions(java.util.Set<com.android.internal.protolog.common.IProtoLogGroup> p0) {}
    private void init(boolean p0, com.android.internal.protolog.common.IProtoLogGroup... p1) {}
    protected com.android.internal.protolog.PerfettoProtoLogImpl createAndEnableNewPerfettoProtoLogImpl(com.android.internal.protolog.ProtoLogDataSource p0, com.android.internal.protolog.common.IProtoLogGroup[] p1, boolean p2) { return null; }
    protected com.android.internal.protolog.common.IProtoLog createLogcatOnlyInstance() { return null; }
    public com.android.internal.protolog.common.IProtoLog getProtoLogInstance() { return null; }
    public java.util.Set<com.android.internal.protolog.common.IProtoLogGroup> getRegisteredGroups() { return null; }
    public void init(com.android.internal.protolog.common.IProtoLogGroup... p0) {}
    public void initAsync(com.android.internal.protolog.common.IProtoLogGroup... p0) {}
    public void registerLogGroupInProcess(com.android.internal.protolog.common.IProtoLogGroup... p0) {}
    protected boolean shouldLogOnlyToLogcat() { return false; }
    public void tearDown() {}
}
