package android.content.pm.permission;

public class SplitPermissionInfoParcelable implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.pm.permission.SplitPermissionInfoParcelable> CREATOR = null;
    private final java.lang.String mFeatureFlag = null;
    private final boolean mFeatureFlagNegated = false;
    private final java.util.List<java.lang.String> mNewPermissions = null;
    private final java.lang.String mSplitPermission = null;
    private final int mTargetSdk = 0;
    protected SplitPermissionInfoParcelable(android.os.Parcel p0) {}
    public SplitPermissionInfoParcelable(java.lang.String p0, java.util.List<java.lang.String> p1, int p2, java.lang.String p3, boolean p4) {}
    @java.lang.Deprecated
    private void __metadata() {}
    private void onConstructed() {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String getFeatureFlag() { return null; }
    public java.util.List<java.lang.String> getNewPermissions() { return null; }
    public java.lang.String getSplitPermission() { return null; }
    public int getTargetSdk() { return 0; }
    public int hashCode() { return 0; }
    public boolean isFeatureFlagNegated() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
