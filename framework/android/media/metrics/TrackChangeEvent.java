package android.media.metrics;

public final class TrackChangeEvent extends android.media.metrics.Event implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.metrics.TrackChangeEvent> CREATOR = null;
    public static final int TRACK_CHANGE_REASON_ADAPTIVE = 4;
    public static final int TRACK_CHANGE_REASON_INITIAL = 2;
    public static final int TRACK_CHANGE_REASON_MANUAL = 3;
    public static final int TRACK_CHANGE_REASON_OTHER = 1;
    public static final int TRACK_CHANGE_REASON_UNKNOWN = 0;
    public static final int TRACK_STATE_OFF = 0;
    public static final int TRACK_STATE_ON = 1;
    public static final int TRACK_TYPE_AUDIO = 0;
    public static final int TRACK_TYPE_TEXT = 2;
    public static final int TRACK_TYPE_VIDEO = 1;
    private final int mAudioSampleRate = 0;
    private final int mBitrate = 0;
    private final int mChannelCount = 0;
    private final java.lang.String mCodecName = null;
    private final java.lang.String mContainerMimeType = null;
    private final int mHeight = 0;
    private final java.lang.String mLanguage = null;
    private final java.lang.String mLanguageRegion = null;
    private final int mReason = 0;
    private final java.lang.String mSampleMimeType = null;
    private final int mState = 0;
    private final long mTimeSinceCreatedMillis = 0L;
    private final int mType = 0;
    private final float mVideoFrameRate = 0.0f;
    private final int mWidth = 0;
    private TrackChangeEvent(int p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, int p5, long p6, int p7, java.lang.String p8, java.lang.String p9, int p10, int p11, int p12, int p13, float p14, android.os.Bundle p15) { super(); }
    private TrackChangeEvent(android.os.Parcel p0) { super(); }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getAudioSampleRate() { return 0; }
    public int getBitrate() { return 0; }
    public int getChannelCount() { return 0; }
    public java.lang.String getCodecName() { return null; }
    public java.lang.String getContainerMimeType() { return null; }
    public int getHeight() { return 0; }
    public java.lang.String getLanguage() { return null; }
    public java.lang.String getLanguageRegion() { return null; }
    public android.os.Bundle getMetricsBundle() { return null; }
    public java.lang.String getSampleMimeType() { return null; }
    public long getTimeSinceCreatedMillis() { return 0L; }
    public int getTrackChangeReason() { return 0; }
    public int getTrackState() { return 0; }
    public int getTrackType() { return 0; }
    public float getVideoFrameRate() { return 0.0f; }
    public int getWidth() { return 0; }
    public int hashCode() { return 0; }
    public android.media.metrics.reported.ReportedTrackChangeEvent toReportable() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private int mAudioSampleRate;
        private int mBitrate;
        private long mBuilderFieldsSet;
        private int mChannelCount;
        private java.lang.String mCodecName;
        private java.lang.String mContainerMimeType;
        private int mHeight;
        private java.lang.String mLanguage;
        private java.lang.String mLanguageRegion;
        private android.os.Bundle mMetricsBundle;
        private int mReason;
        private java.lang.String mSampleMimeType;
        private int mState;
        private long mTimeSinceCreatedMillis;
        private final int mType = 0;
        private float mVideoFrameRate;
        private int mWidth;
        public Builder(int p0) {}
        private void checkNotUsed() {}
        public android.media.metrics.TrackChangeEvent build() { return null; }
        public android.media.metrics.TrackChangeEvent.Builder setAudioSampleRate(int p0) { return null; }
        public android.media.metrics.TrackChangeEvent.Builder setBitrate(int p0) { return null; }
        public android.media.metrics.TrackChangeEvent.Builder setChannelCount(int p0) { return null; }
        public android.media.metrics.TrackChangeEvent.Builder setCodecName(java.lang.String p0) { return null; }
        public android.media.metrics.TrackChangeEvent.Builder setContainerMimeType(java.lang.String p0) { return null; }
        public android.media.metrics.TrackChangeEvent.Builder setHeight(int p0) { return null; }
        public android.media.metrics.TrackChangeEvent.Builder setLanguage(java.lang.String p0) { return null; }
        public android.media.metrics.TrackChangeEvent.Builder setLanguageRegion(java.lang.String p0) { return null; }
        public android.media.metrics.TrackChangeEvent.Builder setMetricsBundle(android.os.Bundle p0) { return null; }
        public android.media.metrics.TrackChangeEvent.Builder setSampleMimeType(java.lang.String p0) { return null; }
        public android.media.metrics.TrackChangeEvent.Builder setTimeSinceCreatedMillis(long p0) { return null; }
        public android.media.metrics.TrackChangeEvent.Builder setTrackChangeReason(int p0) { return null; }
        public android.media.metrics.TrackChangeEvent.Builder setTrackState(int p0) { return null; }
        public android.media.metrics.TrackChangeEvent.Builder setVideoFrameRate(float p0) { return null; }
        public android.media.metrics.TrackChangeEvent.Builder setWidth(int p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TrackChangeReason {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TrackState {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TrackType {
    }
}
