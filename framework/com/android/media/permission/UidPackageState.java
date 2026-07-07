package com.android.media.permission;

public class UidPackageState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.android.media.permission.UidPackageState> CREATOR = null;
    public java.util.List<com.android.media.permission.UidPackageState.PackageState> packageStates;
    public int uid;
    public UidPackageState() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class PackageState implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.android.media.permission.UidPackageState.PackageState> CREATOR = null;
        public boolean isPlaybackCaptureAllowed;
        public java.lang.String packageName;
        public int pccId;
        public int targetSdk;
        public PackageState() {}
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public final void readFromParcel(android.os.Parcel p0) {}
        public java.lang.String toString() { return null; }
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
