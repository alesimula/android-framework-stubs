package android.security.keymaster;

public class KeymasterBlob implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.security.keymaster.KeymasterBlob> CREATOR = null;
    public byte[] blob;
    protected KeymasterBlob(android.os.Parcel p0) {}
    public KeymasterBlob(byte[] p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
