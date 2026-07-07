package android.permission;

@android.annotation.SystemApi
public final class PermissionGroupUsage implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.permission.PermissionGroupUsage> CREATOR = null;
    private final boolean mActive = false;
    private final java.lang.CharSequence mAttributionLabel = null;
    private final java.lang.CharSequence mAttributionTag = null;
    private final long mLastAccessTimeMillis = 0L;
    private final java.lang.String mPackageName = null;
    private final java.lang.String mPermissionGroupName = null;
    private final java.lang.String mPersistentDeviceId = null;
    private final boolean mPhoneCall = false;
    private final java.lang.CharSequence mProxyLabel = null;
    private final int mUid = 0;
    PermissionGroupUsage(android.os.Parcel p0) {}
    public PermissionGroupUsage(java.lang.String p0, int p1, long p2, java.lang.String p3, boolean p4, boolean p5, java.lang.CharSequence p6, java.lang.CharSequence p7, java.lang.CharSequence p8, java.lang.String p9) {}
    @java.lang.Deprecated
    private void __metadata() {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.CharSequence getAttributionLabel() { return null; }
    public java.lang.CharSequence getAttributionTag() { return null; }
    public long getLastAccessTimeMillis() { return 0L; }
    public java.lang.String getPackageName() { return null; }
    public java.lang.String getPermissionGroupName() { return null; }
    public java.lang.String getPersistentDeviceId() { return null; }
    public java.lang.CharSequence getProxyLabel() { return null; }
    public int getUid() { return 0; }
    public int hashCode() { return 0; }
    public boolean isActive() { return false; }
    public boolean isPhoneCall() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
