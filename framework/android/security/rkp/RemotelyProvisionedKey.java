package android.security.rkp;

public class RemotelyProvisionedKey implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.security.rkp.RemotelyProvisionedKey> CREATOR = null;
    public byte[] encodedCertChain;
    public byte[] keyBlob;
    public RemotelyProvisionedKey() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
