package android.media.tv;

public final class StreamEventRequest extends android.media.tv.BroadcastInfoRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.tv.StreamEventRequest> CREATOR = null;
    private static final int REQUEST_TYPE = 5;
    private final java.lang.String mEventName = null;
    private final android.net.Uri mTargetUri = null;
    public StreamEventRequest(int p0, int p1, android.net.Uri p2, java.lang.String p3) { super(0, (android.os.Parcel)null); }
    StreamEventRequest(android.os.Parcel p0) { super(0, (android.os.Parcel)null); }
    static android.media.tv.StreamEventRequest createFromParcelBody(android.os.Parcel p0) { return null; }
    public int describeContents() { return 0; }
    public java.lang.String getEventName() { return null; }
    public android.net.Uri getTargetUri() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
