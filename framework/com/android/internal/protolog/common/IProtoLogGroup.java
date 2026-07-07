package com.android.internal.protolog.common;

public interface IProtoLogGroup {
    public int getId();
    public java.lang.String getTag();
    public boolean isEnabled();
    public boolean isLogToLogcat();
    public java.lang.String name();
    public void setLogToLogcat(boolean p0);
}
