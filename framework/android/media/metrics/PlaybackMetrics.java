package android.media.metrics;

public final class PlaybackMetrics implements android.os.Parcelable {
    public static final int CONTENT_TYPE_AD = 2;
    public static final int CONTENT_TYPE_MAIN = 1;
    public static final int CONTENT_TYPE_OTHER = 3;
    public static final int CONTENT_TYPE_UNKNOWN = 0;
    public static final android.os.Parcelable.Creator<android.media.metrics.PlaybackMetrics> CREATOR = null;
    public static final int DRM_TYPE_CLEARKEY = 6;
    public static final int DRM_TYPE_NONE = 0;
    public static final int DRM_TYPE_OTHER = 1;
    public static final int DRM_TYPE_PLAY_READY = 2;
    public static final int DRM_TYPE_WIDEVINE_L1 = 3;
    public static final int DRM_TYPE_WIDEVINE_L3 = 4;
    public static final int DRM_TYPE_WV_L3_FALLBACK = 5;
    public static final int PLAYBACK_TYPE_LIVE = 2;
    public static final int PLAYBACK_TYPE_OTHER = 3;
    public static final int PLAYBACK_TYPE_UNKNOWN = 0;
    public static final int PLAYBACK_TYPE_VOD = 1;
    public static final int STREAM_SOURCE_DEVICE = 2;
    public static final int STREAM_SOURCE_MIXED = 3;
    public static final int STREAM_SOURCE_NETWORK = 1;
    public static final int STREAM_SOURCE_UNKNOWN = 0;
    public static final int STREAM_TYPE_DASH = 3;
    public static final int STREAM_TYPE_HLS = 4;
    public static final int STREAM_TYPE_OTHER = 1;
    public static final int STREAM_TYPE_PROGRESSIVE = 2;
    public static final int STREAM_TYPE_SS = 5;
    public static final int STREAM_TYPE_UNKNOWN = 0;
    private final int mAudioUnderrunCount = 0;
    private final int mContentType = 0;
    private final byte[] mDrmSessionId = null;
    private final int mDrmType = 0;
    private final long[] mExperimentIds = null;
    private final long mLocalBytesRead = 0L;
    private final long mMediaDurationMillis = 0L;
    private final android.os.Bundle mMetricsBundle = null;
    private final long mNetworkBytesRead = 0L;
    private final long mNetworkTransferDurationMillis = 0L;
    private final int mPlaybackType = 0;
    private final java.lang.String mPlayerName = null;
    private final java.lang.String mPlayerVersion = null;
    private final int mStreamSource = 0;
    private final int mStreamType = 0;
    private final int mVideoFramesDropped = 0;
    private final int mVideoFramesPlayed = 0;
    public PlaybackMetrics(long p0, int p1, int p2, int p3, int p4, int p5, java.lang.String p6, java.lang.String p7, long[] p8, int p9, int p10, int p11, long p12, long p13, long p14, byte[] p15, android.os.Bundle p16) {}
    PlaybackMetrics(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getAudioUnderrunCount() { return 0; }
    public int getContentType() { return 0; }
    public byte[] getDrmSessionId() { return null; }
    public int getDrmType() { return 0; }
    public long[] getExperimentIds() { return null; }
    public long getLocalBytesRead() { return 0L; }
    public long getMediaDurationMillis() { return 0L; }
    public android.os.Bundle getMetricsBundle() { return null; }
    public long getNetworkBytesRead() { return 0L; }
    public long getNetworkTransferDurationMillis() { return 0L; }
    public int getPlaybackType() { return 0; }
    public java.lang.String getPlayerName() { return null; }
    public java.lang.String getPlayerVersion() { return null; }
    public int getStreamSource() { return 0; }
    public int getStreamType() { return 0; }
    public int getVideoFramesDropped() { return 0; }
    public int getVideoFramesPlayed() { return 0; }
    public int hashCode() { return 0; }
    public android.media.metrics.reported.ReportedPlaybackMetrics toReportable() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private int mAudioUnderrunCount;
        private int mContentType;
        private byte[] mDrmSessionId;
        private int mDrmType;
        private java.util.List<java.lang.Long> mExperimentIds;
        private long mLocalBytesRead;
        private long mMediaDurationMillis;
        private android.os.Bundle mMetricsBundle;
        private long mNetworkBytesRead;
        private long mNetworkTransferDurationMillis;
        private int mPlaybackType;
        private java.lang.String mPlayerName;
        private java.lang.String mPlayerVersion;
        private int mStreamSource;
        private int mStreamType;
        private int mVideoFramesDropped;
        private int mVideoFramesPlayed;
        public Builder() {}
        private long[] idsToLongArray() { return null; }
        public android.media.metrics.PlaybackMetrics.Builder addExperimentId(long p0) { return null; }
        public android.media.metrics.PlaybackMetrics build() { return null; }
        public android.media.metrics.PlaybackMetrics.Builder setAudioUnderrunCount(int p0) { return null; }
        public android.media.metrics.PlaybackMetrics.Builder setContentType(int p0) { return null; }
        public android.media.metrics.PlaybackMetrics.Builder setDrmSessionId(byte[] p0) { return null; }
        public android.media.metrics.PlaybackMetrics.Builder setDrmType(int p0) { return null; }
        public android.media.metrics.PlaybackMetrics.Builder setLocalBytesRead(long p0) { return null; }
        public android.media.metrics.PlaybackMetrics.Builder setMediaDurationMillis(long p0) { return null; }
        public android.media.metrics.PlaybackMetrics.Builder setMetricsBundle(android.os.Bundle p0) { return null; }
        public android.media.metrics.PlaybackMetrics.Builder setNetworkBytesRead(long p0) { return null; }
        public android.media.metrics.PlaybackMetrics.Builder setNetworkTransferDurationMillis(long p0) { return null; }
        public android.media.metrics.PlaybackMetrics.Builder setPlaybackType(int p0) { return null; }
        public android.media.metrics.PlaybackMetrics.Builder setPlayerName(java.lang.String p0) { return null; }
        public android.media.metrics.PlaybackMetrics.Builder setPlayerVersion(java.lang.String p0) { return null; }
        public android.media.metrics.PlaybackMetrics.Builder setStreamSource(int p0) { return null; }
        public android.media.metrics.PlaybackMetrics.Builder setStreamType(int p0) { return null; }
        public android.media.metrics.PlaybackMetrics.Builder setVideoFramesDropped(int p0) { return null; }
        public android.media.metrics.PlaybackMetrics.Builder setVideoFramesPlayed(int p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ContentType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DrmType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PlaybackType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface StreamSource {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface StreamType {
    }
}
