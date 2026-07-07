package com.android.internal.compat;

public final class CompatibilityOverrideConfig implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.android.internal.compat.CompatibilityOverrideConfig> CREATOR = null;
    public final java.util.Map<java.lang.Long, android.app.compat.PackageOverride> overrides = null;
    private CompatibilityOverrideConfig(android.os.Parcel p0) {}
    public CompatibilityOverrideConfig(java.util.Map<java.lang.Long, android.app.compat.PackageOverride> p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
