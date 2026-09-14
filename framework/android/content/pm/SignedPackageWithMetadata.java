package android.content.pm;

@android.annotation.SystemApi
public final class SignedPackageWithMetadata implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.pm.SignedPackageWithMetadata> CREATOR = null;
    private final android.os.Bundle mMetadata = null;
    private final android.content.pm.SignedPackage mSignedPackage = null;
    public SignedPackageWithMetadata(android.content.pm.SignedPackage p0, android.os.Bundle p1) {}
    private SignedPackageWithMetadata(android.os.Parcel p0) {}
    private static boolean bundleEquals(android.os.Bundle p0, android.os.Bundle p1) { return false; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.os.Bundle getMetadata() { return null; }
    public android.content.pm.SignedPackage getSignedPackage() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
