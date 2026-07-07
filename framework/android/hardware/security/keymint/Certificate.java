package android.hardware.security.keymint;

public class Certificate implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.security.keymint.Certificate> CREATOR = null;
    public byte[] encodedCertificate;
    public Certificate() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
