package android.media.metrics.reported;

public class ReportedTrackChangeEvent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.metrics.reported.ReportedTrackChangeEvent> CREATOR = null;
    public int audioSampleRate;
    public int bitrate;
    public int channelCount;
    public java.lang.String codecName;
    public java.lang.String containerMimeType;
    public int height;
    public java.lang.String language;
    public java.lang.String languageRegion;
    public java.lang.String sampleMimeType;
    public long timeSinceCreatedMillis;
    public int trackChangeReason;
    public int trackState;
    public int trackType;
    public float videoFrameRate;
    public int width;
    public ReportedTrackChangeEvent() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
