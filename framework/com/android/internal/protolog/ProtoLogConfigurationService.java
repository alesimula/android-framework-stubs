package com.android.internal.protolog;

public interface ProtoLogConfigurationService extends com.android.internal.protolog.IProtoLogConfigurationService {
    public void disableProtoLogToLogcat(java.io.PrintWriter p0, java.lang.String... p1);
    public void enableProtoLogToLogcat(java.io.PrintWriter p0, java.lang.String... p1);
    public java.lang.String[] getGroups();
    public boolean isLoggingToLogcat(java.lang.String p0);
}
