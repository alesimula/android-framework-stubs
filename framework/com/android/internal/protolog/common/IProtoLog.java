package com.android.internal.protolog.common;

public interface IProtoLog {
    public java.util.List<com.android.internal.protolog.common.IProtoLogGroup> getRegisteredGroups();
    public boolean isEnabled(com.android.internal.protolog.common.IProtoLogGroup p0, com.android.internal.protolog.common.LogLevel p1);
    public boolean isProtoEnabled();
    public void log(com.android.internal.protolog.common.LogLevel p0, com.android.internal.protolog.common.IProtoLogGroup p1, long p2, long p3, java.lang.Object[] p4);
    public void log(com.android.internal.protolog.common.LogLevel p0, com.android.internal.protolog.common.IProtoLogGroup p1, java.lang.String p2, java.lang.Object... p3);
    public void registerGroups(com.android.internal.protolog.common.IProtoLogGroup... p0);
    public int startLoggingToLogcat(java.lang.String[] p0, com.android.internal.protolog.common.ILogger p1);
    public int stopLoggingToLogcat(java.lang.String[] p0, com.android.internal.protolog.common.ILogger p1);
}
