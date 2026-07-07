package android.media.tv.tunerresourcemanager;

public class TunerDemuxRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.tv.tunerresourcemanager.TunerDemuxRequest> CREATOR = null;
    public int clientId;
    public int desiredFilterTypes;
    public TunerDemuxRequest() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
