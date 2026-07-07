package android.security.identity;

public class AuthKeyParcel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.security.identity.AuthKeyParcel> CREATOR = null;
    public byte[] x509cert;
    public AuthKeyParcel() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
