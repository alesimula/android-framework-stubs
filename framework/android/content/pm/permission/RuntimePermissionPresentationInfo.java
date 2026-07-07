package android.content.pm.permission;

@android.annotation.SystemApi
@java.lang.Deprecated
public final class RuntimePermissionPresentationInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.pm.permission.RuntimePermissionPresentationInfo> CREATOR = null;
    private static final int FLAG_GRANTED = 1;
    private static final int FLAG_STANDARD = 2;
    private final int mFlags = 0;
    private final java.lang.CharSequence mLabel = null;
    private RuntimePermissionPresentationInfo(android.os.Parcel p0) {}
    public RuntimePermissionPresentationInfo(java.lang.CharSequence p0, boolean p1, boolean p2) {}
    public int describeContents() { return 0; }
    public java.lang.CharSequence getLabel() { return null; }
    public boolean isGranted() { return false; }
    public boolean isStandard() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
