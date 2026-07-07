package android.media;

public class RecordClientInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.RecordClientInfo> CREATOR = null;
    public int portId;
    public int riid;
    public int session;
    public boolean silenced;
    public int source;
    public int uid;
    public RecordClientInfo() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
