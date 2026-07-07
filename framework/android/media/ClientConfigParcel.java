package android.media;

public class ClientConfigParcel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.ClientConfigParcel> CREATOR = null;
    public android.media.ClientInfoParcel clientInfo;
    public int codecType;
    public int height;
    public long id;
    public boolean isEncoder;
    public long timeStamp;
    public int width;
    public ClientConfigParcel() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
