package android.media;

public class MediaResourceParcel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.MediaResourceParcel> CREATOR = null;
    public byte[] id;
    public int subType;
    public int type;
    public long value;
    public MediaResourceParcel() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
