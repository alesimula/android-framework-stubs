package android.content.pm;

public class PermissionGroupInfo extends android.content.pm.PackageItemInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.pm.PermissionGroupInfo> CREATOR = null;
    public static final int FLAG_PERSONAL_INFO = 1;
    @android.annotation.SystemApi
    public final int backgroundRequestDetailResourceId = 0;
    @android.annotation.SystemApi
    public final int backgroundRequestResourceId = 0;
    public int descriptionRes;
    public int flags;
    public java.lang.CharSequence nonLocalizedDescription;
    public int priority;
    @android.annotation.SystemApi
    public final int requestDetailResourceId = 0;
    @android.annotation.SystemApi
    public int requestRes;
    @java.lang.Deprecated
    public PermissionGroupInfo() { super(); }
    public PermissionGroupInfo(int p0, int p1, int p2) { super(); }
    @java.lang.Deprecated
    public PermissionGroupInfo(android.content.pm.PermissionGroupInfo p0) { super(); }
    private PermissionGroupInfo(android.os.Parcel p0) { super(); }
    public int describeContents() { return 0; }
    public java.lang.CharSequence loadDescription(android.content.pm.PackageManager p0) { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Flags {
    }
}
