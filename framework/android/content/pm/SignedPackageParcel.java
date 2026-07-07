package android.content.pm;

public class SignedPackageParcel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.pm.SignedPackageParcel> CREATOR = null;
    public byte[] certificateDigest;
    public java.lang.String packageName;
    public SignedPackageParcel() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
