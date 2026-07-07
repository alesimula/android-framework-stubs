package android.media.metrics.reported;

public class ReportedPlaybackMetrics implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.metrics.reported.ReportedPlaybackMetrics> CREATOR = null;
    public int audioUnderrunCount;
    public int contentType;
    public byte[] drmSessionId;
    public int drmType;
    public long[] experimentIds;
    public long localBytesRead;
    public long mediaDurationMillis;
    public long networkBytesRead;
    public long networkTransferDurationMillis;
    public int playbackType;
    public java.lang.String playerName;
    public java.lang.String playerVersion;
    public int streamSource;
    public int streamType;
    public int videoFramesDropped;
    public int videoFramesPlayed;
    public ReportedPlaybackMetrics() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
