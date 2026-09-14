package android.os.allowlist;

@android.annotation.SystemApi
public final class SignedPackageWithMetadataMultiMap implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.allowlist.SignedPackageWithMetadataMultiMap> CREATOR = null;
    private final java.util.Map<android.content.pm.SignedPackageWithMetadata, java.util.List<android.content.pm.SignedPackageWithMetadata>> mMap = null;
    private SignedPackageWithMetadataMultiMap(android.os.Parcel p0) {}
    public SignedPackageWithMetadataMultiMap(java.util.Map<android.content.pm.SignedPackageWithMetadata, java.util.List<android.content.pm.SignedPackageWithMetadata>> p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.Map<android.content.pm.SignedPackageWithMetadata, java.util.List<android.content.pm.SignedPackageWithMetadata>> getMap() { return null; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
