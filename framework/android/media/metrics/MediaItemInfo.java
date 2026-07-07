package android.media.metrics;

public final class MediaItemInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.metrics.MediaItemInfo> CREATOR = null;
    public static final long DATA_TYPE_AUDIO = 4L;
    public static final long DATA_TYPE_DEPTH = 16L;
    public static final long DATA_TYPE_GAIN_MAP = 32L;
    public static final long DATA_TYPE_GAPLESS = 256L;
    public static final long DATA_TYPE_HIGH_DYNAMIC_RANGE_VIDEO = 1024L;
    public static final long DATA_TYPE_HIGH_FRAME_RATE = 64L;
    public static final long DATA_TYPE_IMAGE = 1L;
    public static final long DATA_TYPE_METADATA = 8L;
    public static final long DATA_TYPE_SPATIAL_AUDIO = 512L;
    public static final long DATA_TYPE_SPEED_SETTING_CUE_POINTS = 128L;
    public static final long DATA_TYPE_VIDEO = 2L;
    public static final int SOURCE_TYPE_CAMERA = 2;
    public static final int SOURCE_TYPE_EDITING_SESSION = 3;
    public static final int SOURCE_TYPE_GALLERY = 1;
    public static final int SOURCE_TYPE_GENERATED = 7;
    public static final int SOURCE_TYPE_LOCAL_FILE = 4;
    public static final int SOURCE_TYPE_REMOTE_FILE = 5;
    public static final int SOURCE_TYPE_REMOTE_LIVE_STREAM = 6;
    public static final int SOURCE_TYPE_UNSPECIFIED = 0;
    public static final int VALUE_UNSPECIFIED = -1;
    private final int mAudioChannelCount = 0;
    private final long mAudioSampleCount = 0L;
    private final int mAudioSampleRateHz = 0;
    private final long mClipDurationMillis = 0L;
    private final java.util.List<java.lang.String> mCodecNames = null;
    private final java.lang.String mContainerMimeType = null;
    private final long mDataTypes = 0L;
    private final long mDurationMillis = 0L;
    private final java.util.List<java.lang.String> mSampleMimeTypes = null;
    private final int mSourceType = 0;
    private final int mVideoDataSpace = 0;
    private final float mVideoFrameRate = 0.0f;
    private final long mVideoSampleCount = 0L;
    private final android.util.Size mVideoSize = null;
    private MediaItemInfo(int p0, long p1, long p2, long p3, java.lang.String p4, java.util.List<java.lang.String> p5, java.util.List<java.lang.String> p6, int p7, int p8, long p9, android.util.Size p10, int p11, float p12, long p13) {}
    public MediaItemInfo(android.media.metrics.reported.ReportedMediaItemInfo p0) {}
    private MediaItemInfo(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getAudioChannelCount() { return 0; }
    public long getAudioSampleCount() { return 0L; }
    public int getAudioSampleRateHz() { return 0; }
    public long getClipDurationMillis() { return 0L; }
    public java.util.List<java.lang.String> getCodecNames() { return null; }
    public java.lang.String getContainerMimeType() { return null; }
    public long getDataTypes() { return 0L; }
    public long getDurationMillis() { return 0L; }
    public java.util.List<java.lang.String> getSampleMimeTypes() { return null; }
    public int getSourceType() { return 0; }
    public int getVideoDataSpace() { return 0; }
    public float getVideoFrameRate() { return 0.0f; }
    public long getVideoSampleCount() { return 0L; }
    public android.util.Size getVideoSize() { return null; }
    public int hashCode() { return 0; }
    public android.media.metrics.reported.ReportedMediaItemInfo toReportable() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private int mAudioChannelCount;
        private long mAudioSampleCount;
        private int mAudioSampleRateHz;
        private long mClipDurationMillis;
        private final java.util.ArrayList<java.lang.String> mCodecNames = null;
        private java.lang.String mContainerMimeType;
        private long mDataTypes;
        private long mDurationMillis;
        private final java.util.ArrayList<java.lang.String> mSampleMimeTypes = null;
        private int mSourceType;
        private int mVideoDataSpace;
        private float mVideoFrameRate;
        private long mVideoSampleCount;
        private android.util.Size mVideoSize;
        public Builder() {}
        public android.media.metrics.MediaItemInfo.Builder addCodecName(java.lang.String p0) { return null; }
        public android.media.metrics.MediaItemInfo.Builder addDataType(long p0) { return null; }
        public android.media.metrics.MediaItemInfo.Builder addSampleMimeType(java.lang.String p0) { return null; }
        public android.media.metrics.MediaItemInfo build() { return null; }
        public android.media.metrics.MediaItemInfo.Builder setAudioChannelCount(int p0) { return null; }
        public android.media.metrics.MediaItemInfo.Builder setAudioSampleCount(long p0) { return null; }
        public android.media.metrics.MediaItemInfo.Builder setAudioSampleRateHz(int p0) { return null; }
        public android.media.metrics.MediaItemInfo.Builder setClipDurationMillis(long p0) { return null; }
        public android.media.metrics.MediaItemInfo.Builder setContainerMimeType(java.lang.String p0) { return null; }
        public android.media.metrics.MediaItemInfo.Builder setDurationMillis(long p0) { return null; }
        public android.media.metrics.MediaItemInfo.Builder setSourceType(int p0) { return null; }
        public android.media.metrics.MediaItemInfo.Builder setVideoDataSpace(int p0) { return null; }
        public android.media.metrics.MediaItemInfo.Builder setVideoFrameRate(float p0) { return null; }
        public android.media.metrics.MediaItemInfo.Builder setVideoSampleCount(long p0) { return null; }
        public android.media.metrics.MediaItemInfo.Builder setVideoSize(android.util.Size p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DataType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SourceType {
    }
}
