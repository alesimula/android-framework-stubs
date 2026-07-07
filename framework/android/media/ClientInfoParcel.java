package android.media;

public class ClientInfoParcel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.ClientInfoParcel> CREATOR = null;
    public long id;
    public int importance;
    public java.lang.String name;
    public int pid;
    public int uid;
    public ClientInfoParcel() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
