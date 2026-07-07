package android.content.pm;

@android.annotation.SystemApi
public final class UsesPermissionPurposeInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.pm.UsesPermissionPurposeInfo> CREATOR = null;
    private java.util.Set<java.lang.String> mGeneralPurposes;
    private final java.lang.String mPermissionName = null;
    private int mPurposeStringResource;
    private java.util.Set<java.lang.String> mPurposes;
    UsesPermissionPurposeInfo(android.os.Parcel p0) {}
    public UsesPermissionPurposeInfo(java.lang.String p0, java.util.Set<java.lang.String> p1, java.util.Set<java.lang.String> p2, int p3) {}
    @java.lang.Deprecated
    private void __metadata() {}
    private void onConstructed() {}
    static android.util.ArraySet<java.lang.String> unparcelGeneralPurposes(android.os.Parcel p0) { return null; }
    static android.util.ArraySet<java.lang.String> unparcelPurposes(android.os.Parcel p0) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.Set<java.lang.String> getGeneralPurposes() { return null; }
    public java.lang.String getPermissionName() { return null; }
    public int getPurposeStringResource() { return 0; }
    public java.util.Set<java.lang.String> getPurposes() { return null; }
    public int hashCode() { return 0; }
    void parcelGeneralPurposes(android.os.Parcel p0, int p1) {}
    void parcelPurposes(android.os.Parcel p0, int p1) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
