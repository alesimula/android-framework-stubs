package android.media.tv;

public final class StreamEventResponse extends android.media.tv.BroadcastInfoResponse implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.tv.StreamEventResponse> CREATOR = null;
    private static final int RESPONSE_TYPE = 5;
    private final byte[] mData = null;
    private final int mEventId = 0;
    private final long mNptMillis = 0L;
    public StreamEventResponse(int p0, int p1, int p2, int p3, long p4, byte[] p5) { super(0, (android.os.Parcel)null); }
    private StreamEventResponse(android.os.Parcel p0) { super(0, (android.os.Parcel)null); }
    static android.media.tv.StreamEventResponse createFromParcelBody(android.os.Parcel p0) { return null; }
    public int describeContents() { return 0; }
    public byte[] getData() { return null; }
    public int getEventId() { return 0; }
    public long getNptMillis() { return 0L; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
