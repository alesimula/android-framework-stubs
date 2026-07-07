package android.os.allowlist;

@android.annotation.SystemApi
public final class SignedPackageMultiMap implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.allowlist.SignedPackageMultiMap> CREATOR = null;
    private final java.util.Map<android.content.pm.SignedPackage, java.util.List<android.content.pm.SignedPackage>> mMap = null;
    private SignedPackageMultiMap(android.os.Parcel p0) {}
    public SignedPackageMultiMap(java.util.Map<android.content.pm.SignedPackage, java.util.List<android.content.pm.SignedPackage>> p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.Map<android.content.pm.SignedPackage, java.util.List<android.content.pm.SignedPackage>> getMap() { return null; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
