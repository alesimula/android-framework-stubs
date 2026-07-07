package com.android.internal.pm.pkg.component;

public class ParsedUsesPermissionImpl implements com.android.internal.pm.pkg.component.ParsedUsesPermission, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.android.internal.pm.pkg.component.ParsedUsesPermissionImpl> CREATOR = null;
    static com.android.internal.util.Parcelling<java.util.Set<java.lang.String>> sParcellingForGeneralPurposes;
    static com.android.internal.util.Parcelling<java.lang.String> sParcellingForName;
    static com.android.internal.util.Parcelling<java.util.Set<java.lang.String>> sParcellingForPurposes;
    private java.util.Set<java.lang.String> generalPurposes;
    private java.lang.String name;
    private int purposeStringResource;
    private java.util.Set<java.lang.String> purposes;
    private int usesPermissionFlags;
    protected ParsedUsesPermissionImpl(android.os.Parcel p0) {}
    public ParsedUsesPermissionImpl(java.lang.String p0, int p1, int p2, java.util.Set<java.lang.String> p3, java.util.Set<java.lang.String> p4) {}
    @java.lang.Deprecated
    private void __metadata() {}
    public int describeContents() { return 0; }
    public java.util.Set<java.lang.String> getGeneralPurposes() { return null; }
    public java.lang.String getName() { return null; }
    public int getPurposeStringResource() { return 0; }
    public java.util.Set<java.lang.String> getPurposes() { return null; }
    public int getUsesPermissionFlags() { return 0; }
    public com.android.internal.pm.pkg.component.ParsedUsesPermissionImpl setGeneralPurposes(java.util.Set<java.lang.String> p0) { return null; }
    public com.android.internal.pm.pkg.component.ParsedUsesPermissionImpl setName(java.lang.String p0) { return null; }
    public com.android.internal.pm.pkg.component.ParsedUsesPermissionImpl setPurposeStringResource(int p0) { return null; }
    public com.android.internal.pm.pkg.component.ParsedUsesPermissionImpl setPurposes(java.util.Set<java.lang.String> p0) { return null; }
    public com.android.internal.pm.pkg.component.ParsedUsesPermissionImpl setUsesPermissionFlags(int p0) { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
