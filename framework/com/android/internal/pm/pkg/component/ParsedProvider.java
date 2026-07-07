package com.android.internal.pm.pkg.component;

public interface ParsedProvider extends com.android.internal.pm.pkg.component.ParsedMainComponent {
    public java.lang.String getAuthority();
    public int getInitOrder();
    public java.util.List<android.content.pm.PathPermission> getPathPermissions();
    public java.lang.String getReadPermission();
    public java.util.List<android.os.PatternMatcher> getUriPermissionPatterns();
    public java.lang.String getWritePermission();
    public boolean isForceUriPermissions();
    public boolean isGrantUriPermissions();
    public boolean isMultiProcess();
    public boolean isSyncable();
}
