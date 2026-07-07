package com.android.internal.pm.pkg.component;

public final class ParsedAllowComponentAccessPolicyImpl implements com.android.internal.pm.pkg.component.ParsedAllowComponentAccessPolicy, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.android.internal.pm.pkg.component.ParsedAllowComponentAccessPolicyImpl> CREATOR = null;
    private java.util.List<android.content.pm.SignedPackage> mParsedAllowlistedSignedPackages;
    private ParsedAllowComponentAccessPolicyImpl(android.os.Parcel p0) {}
    public ParsedAllowComponentAccessPolicyImpl(java.util.List<android.content.pm.SignedPackage> p0) {}
    @java.lang.Deprecated
    private void __metadata() {}
    public int describeContents() { return 0; }
    public java.util.List<android.content.pm.SignedPackage> getParsedAllowlistedSignedPackages() { return null; }
    public com.android.internal.pm.pkg.component.ParsedAllowComponentAccessPolicyImpl setParsedAllowlistedSignedPackages(java.util.List<android.content.pm.SignedPackage> p0) { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
