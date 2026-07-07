package com.android.internal.pm.pkg.component;

public class ParsedPermissionImpl extends com.android.internal.pm.pkg.component.ParsedComponentImpl implements com.android.internal.pm.pkg.component.ParsedPermission, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.android.internal.pm.pkg.component.ParsedPermissionImpl> CREATOR = null;
    private static final com.android.internal.util.Parcelling.BuiltIn.ForStringSet sForStringSet = null;
    private java.lang.String backgroundPermission;
    private java.lang.String group;
    private java.util.Set<java.lang.String> knownCerts;
    private com.android.internal.pm.pkg.component.ParsedPermissionGroup parsedPermissionGroup;
    private int protectionLevel;
    private int requestRes;
    private int requiresGeneralPurposeTargetSdkVersion;
    private int requiresPurposeStringTargetSdkVersion;
    private int requiresPurposeTargetSdkVersion;
    private boolean tree;
    private java.util.List<com.android.internal.pm.pkg.component.ParsedValidGeneralPurpose> validGeneralPurposes;
    private java.util.List<com.android.internal.pm.pkg.component.ParsedValidPurpose> validPurposes;
    public ParsedPermissionImpl() { super(); }
    protected ParsedPermissionImpl(android.os.Parcel p0) { super(); }
    public ParsedPermissionImpl(java.lang.String p0, java.lang.String p1, int p2, int p3, int p4, int p5, int p6, boolean p7, com.android.internal.pm.pkg.component.ParsedPermissionGroup p8, java.util.Set<java.lang.String> p9, java.util.List<com.android.internal.pm.pkg.component.ParsedValidPurpose> p10, java.util.List<com.android.internal.pm.pkg.component.ParsedValidGeneralPurpose> p11) { super(); }
    @java.lang.Deprecated
    private void __metadata() {}
    public int describeContents() { return 0; }
    public java.lang.String getBackgroundPermission() { return null; }
    public java.lang.String getGroup() { return null; }
    public java.util.Set<java.lang.String> getKnownCerts() { return null; }
    public com.android.internal.pm.pkg.component.ParsedPermissionGroup getParsedPermissionGroup() { return null; }
    public int getProtectionLevel() { return 0; }
    public int getRequestRes() { return 0; }
    public int getRequiresGeneralPurposeTargetSdkVersion() { return 0; }
    public int getRequiresPurposeStringTargetSdkVersion() { return 0; }
    public int getRequiresPurposeTargetSdkVersion() { return 0; }
    public java.util.List<com.android.internal.pm.pkg.component.ParsedValidGeneralPurpose> getValidGeneralPurposes() { return null; }
    public java.util.List<com.android.internal.pm.pkg.component.ParsedValidPurpose> getValidPurposes() { return null; }
    public boolean isTree() { return false; }
    public com.android.internal.pm.pkg.component.ParsedPermissionImpl setBackgroundPermission(java.lang.String p0) { return null; }
    public com.android.internal.pm.pkg.component.ParsedPermissionImpl setGroup(java.lang.String p0) { return null; }
    protected void setKnownCert(java.lang.String p0) {}
    public com.android.internal.pm.pkg.component.ParsedPermissionImpl setKnownCerts(java.util.Set<java.lang.String> p0) { return null; }
    protected void setKnownCerts(java.lang.String[] p0) {}
    public com.android.internal.pm.pkg.component.ParsedPermissionImpl setParsedPermissionGroup(com.android.internal.pm.pkg.component.ParsedPermissionGroup p0) { return null; }
    public com.android.internal.pm.pkg.component.ParsedPermissionImpl setProtectionLevel(int p0) { return null; }
    public com.android.internal.pm.pkg.component.ParsedPermissionImpl setRequestRes(int p0) { return null; }
    public com.android.internal.pm.pkg.component.ParsedPermissionImpl setRequiresGeneralPurposeTargetSdkVersion(int p0) { return null; }
    public com.android.internal.pm.pkg.component.ParsedPermissionImpl setRequiresPurposeStringTargetSdkVersion(int p0) { return null; }
    public com.android.internal.pm.pkg.component.ParsedPermissionImpl setRequiresPurposeTargetSdkVersion(int p0) { return null; }
    public com.android.internal.pm.pkg.component.ParsedPermissionImpl setTree(boolean p0) { return null; }
    public com.android.internal.pm.pkg.component.ParsedPermissionImpl setValidGeneralPurposes(java.util.List<com.android.internal.pm.pkg.component.ParsedValidGeneralPurpose> p0) { return null; }
    public com.android.internal.pm.pkg.component.ParsedPermissionImpl setValidPurposes(java.util.List<com.android.internal.pm.pkg.component.ParsedValidPurpose> p0) { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
