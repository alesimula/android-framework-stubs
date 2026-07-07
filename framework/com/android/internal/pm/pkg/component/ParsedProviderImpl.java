package com.android.internal.pm.pkg.component;

public class ParsedProviderImpl extends com.android.internal.pm.pkg.component.ParsedMainComponentImpl implements com.android.internal.pm.pkg.component.ParsedProvider, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.android.internal.pm.pkg.component.ParsedProviderImpl> CREATOR = null;
    private java.lang.String authority;
    private boolean forceUriPermissions;
    private boolean grantUriPermissions;
    private int initOrder;
    private boolean multiProcess;
    private java.util.List<android.content.pm.PathPermission> pathPermissions;
    private java.lang.String readPermission;
    private boolean syncable;
    private java.util.List<android.os.PatternMatcher> uriPermissionPatterns;
    private java.lang.String writePermission;
    public ParsedProviderImpl() { super(); }
    protected ParsedProviderImpl(android.os.Parcel p0) { super(); }
    public ParsedProviderImpl(com.android.internal.pm.pkg.component.ParsedProvider p0) { super(); }
    public ParsedProviderImpl(java.lang.String p0, boolean p1, java.lang.String p2, java.lang.String p3, boolean p4, boolean p5, boolean p6, int p7, java.util.List<android.os.PatternMatcher> p8, java.util.List<android.content.pm.PathPermission> p9) { super(); }
    @java.lang.Deprecated
    private void __metadata() {}
    public com.android.internal.pm.pkg.component.ParsedProviderImpl addPathPermission(android.content.pm.PathPermission p0) { return null; }
    public com.android.internal.pm.pkg.component.ParsedProviderImpl addUriPermissionPattern(android.os.PatternMatcher p0) { return null; }
    public int describeContents() { return 0; }
    public java.lang.String getAuthority() { return null; }
    public int getInitOrder() { return 0; }
    public java.util.List<android.content.pm.PathPermission> getPathPermissions() { return null; }
    public java.lang.String getReadPermission() { return null; }
    public java.util.List<android.os.PatternMatcher> getUriPermissionPatterns() { return null; }
    public java.lang.String getWritePermission() { return null; }
    public boolean isForceUriPermissions() { return false; }
    public boolean isGrantUriPermissions() { return false; }
    public boolean isMultiProcess() { return false; }
    public boolean isSyncable() { return false; }
    public com.android.internal.pm.pkg.component.ParsedProviderImpl setAuthority(java.lang.String p0) { return null; }
    public com.android.internal.pm.pkg.component.ParsedProviderImpl setForceUriPermissions(boolean p0) { return null; }
    public com.android.internal.pm.pkg.component.ParsedProviderImpl setGrantUriPermissions(boolean p0) { return null; }
    public com.android.internal.pm.pkg.component.ParsedProviderImpl setInitOrder(int p0) { return null; }
    public com.android.internal.pm.pkg.component.ParsedProviderImpl setMultiProcess(boolean p0) { return null; }
    public com.android.internal.pm.pkg.component.ParsedProviderImpl setReadPermission(java.lang.String p0) { return null; }
    public com.android.internal.pm.pkg.component.ParsedProviderImpl setSyncable(boolean p0) { return null; }
    public com.android.internal.pm.pkg.component.ParsedProviderImpl setWritePermission(java.lang.String p0) { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
