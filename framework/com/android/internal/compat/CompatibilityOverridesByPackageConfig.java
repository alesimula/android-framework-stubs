package com.android.internal.compat;

public final class CompatibilityOverridesByPackageConfig implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.android.internal.compat.CompatibilityOverridesByPackageConfig> CREATOR = null;
    public final java.util.Map<java.lang.String, com.android.internal.compat.CompatibilityOverrideConfig> packageNameToOverrides = null;
    private CompatibilityOverridesByPackageConfig(android.os.Parcel p0) {}
    public CompatibilityOverridesByPackageConfig(java.util.Map<java.lang.String, com.android.internal.compat.CompatibilityOverrideConfig> p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
