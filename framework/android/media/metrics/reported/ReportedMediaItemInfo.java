package android.media.metrics.reported;

public class ReportedMediaItemInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.metrics.reported.ReportedMediaItemInfo> CREATOR = null;
    public int audioChannelCount;
    public long audioSampleCount;
    public int audioSampleRateHz;
    public long clipDurationMillis;
    public java.lang.String[] codecNames;
    public java.lang.String containerMimeType;
    public long dataTypes;
    public long durationMillis;
    public java.lang.String[] sampleMimeTypes;
    public int sourceType;
    public int videoDataSpace;
    public float videoFrameRate;
    public long videoSampleCount;
    public android.media.metrics.reported.ReportedMediaItemInfo.Size videoSize;
    public ReportedMediaItemInfo() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class Size implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.media.metrics.reported.ReportedMediaItemInfo.Size> CREATOR = null;
        public int height;
        public int width;
        public Size() {}
        public int describeContents() { return 0; }
        public final void readFromParcel(android.os.Parcel p0) {}
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
