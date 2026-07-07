package android.gsi;

public class AvbPublicKey implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.gsi.AvbPublicKey> CREATOR = null;
    public byte[] bytes;
    public byte[] sha1;
    public AvbPublicKey() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
