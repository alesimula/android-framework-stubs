package com.android.internal.protolog;

public class LogcatOnlyProtoLogImpl implements com.android.internal.protolog.common.IProtoLog {
    private static final java.lang.String LOG_TAG = null;
    public LogcatOnlyProtoLogImpl() {}
    public java.util.List<com.android.internal.protolog.common.IProtoLogGroup> getRegisteredGroups() { return null; }
    public boolean isEnabled(com.android.internal.protolog.common.IProtoLogGroup p0, com.android.internal.protolog.common.LogLevel p1) { return false; }
    public boolean isProtoEnabled() { return false; }
    public void log(com.android.internal.protolog.common.LogLevel p0, com.android.internal.protolog.common.IProtoLogGroup p1, long p2, long p3, java.lang.Object[] p4) {}
    public void log(com.android.internal.protolog.common.LogLevel p0, com.android.internal.protolog.common.IProtoLogGroup p1, java.lang.String p2, java.lang.Object[] p3) {}
    public void registerGroups(com.android.internal.protolog.common.IProtoLogGroup... p0) {}
    public int startLoggingToLogcat(java.lang.String[] p0, com.android.internal.protolog.common.ILogger p1) { return 0; }
    public int stopLoggingToLogcat(java.lang.String[] p0, com.android.internal.protolog.common.ILogger p1) { return 0; }
}
