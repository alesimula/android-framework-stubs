package android.media.tv;

public final class TimelineResponse extends android.media.tv.BroadcastInfoResponse implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.tv.TimelineResponse> CREATOR = null;
    private static final int RESPONSE_TYPE = 8;
    private final java.lang.String mSelector = null;
    private final long mTicks = 0L;
    private final int mUnitsPerSecond = 0;
    private final int mUnitsPerTick = 0;
    private final long mWallClock = 0L;
    public TimelineResponse(int p0, int p1, int p2, java.lang.String p3, int p4, int p5, long p6, long p7) { super(0, (android.os.Parcel)null); }
    TimelineResponse(android.os.Parcel p0) { super(0, (android.os.Parcel)null); }
    static android.media.tv.TimelineResponse createFromParcelBody(android.os.Parcel p0) { return null; }
    public int describeContents() { return 0; }
    public android.net.Uri getSelector() { return null; }
    public long getTicks() { return 0L; }
    public int getUnitsPerSecond() { return 0; }
    public int getUnitsPerTick() { return 0; }
    public long getWallClock() { return 0L; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
