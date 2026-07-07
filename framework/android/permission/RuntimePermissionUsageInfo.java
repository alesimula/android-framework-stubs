package android.permission;

@android.annotation.SystemApi
public final class RuntimePermissionUsageInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.permission.RuntimePermissionUsageInfo> CREATOR = null;
    private final java.lang.String mName = null;
    private final int mNumUsers = 0;
    private RuntimePermissionUsageInfo(android.os.Parcel p0) {}
    public RuntimePermissionUsageInfo(java.lang.String p0, int p1) {}
    public int describeContents() { return 0; }
    public int getAppAccessCount() { return 0; }
    public java.lang.String getName() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
