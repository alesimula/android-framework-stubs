package android.media.tv;

public final class TsRequest extends android.media.tv.BroadcastInfoRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.tv.TsRequest> CREATOR = null;
    private static final int REQUEST_TYPE = 1;
    private final int mTsPid = 0;
    public TsRequest(int p0, int p1, int p2) { super(0, (android.os.Parcel)null); }
    TsRequest(android.os.Parcel p0) { super(0, (android.os.Parcel)null); }
    static android.media.tv.TsRequest createFromParcelBody(android.os.Parcel p0) { return null; }
    public int describeContents() { return 0; }
    public int getTsPid() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
