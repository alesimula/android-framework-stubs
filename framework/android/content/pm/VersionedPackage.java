package android.content.pm;

public final class VersionedPackage implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.pm.VersionedPackage> CREATOR = null;
    private final java.lang.String mPackageName = null;
    private final long mVersionCode = 0L;
    private VersionedPackage(android.os.Parcel p0) {}
    public VersionedPackage(java.lang.String p0, int p1) {}
    public VersionedPackage(java.lang.String p0, long p1) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public long getLongVersionCode() { return 0L; }
    public java.lang.String getPackageName() { return null; }
    @java.lang.Deprecated
    public int getVersionCode() { return 0; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VersionCode {
    }
}
