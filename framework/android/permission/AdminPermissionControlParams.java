package android.permission;

@android.annotation.SystemApi
public final class AdminPermissionControlParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.permission.AdminPermissionControlParams> CREATOR = null;
    private final boolean mCanAdminGrantSensorsPermissions = false;
    private final int mGrantState = 0;
    private final java.lang.String mGranteePackageName = null;
    private final java.lang.String mPermission = null;
    public AdminPermissionControlParams(java.lang.String p0, java.lang.String p1, int p2, boolean p3) {}
    public boolean canAdminGrantSensorsPermissions() { return false; }
    public int describeContents() { return 0; }
    public int getGrantState() { return 0; }
    public java.lang.String getGranteePackageName() { return null; }
    public java.lang.String getPermission() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
