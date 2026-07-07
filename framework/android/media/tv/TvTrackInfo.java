package android.media.tv;

public final class TvTrackInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.tv.TvTrackInfo> CREATOR = null;
    public static final java.lang.String DEFAULT_AUDIO_TRACK_ID = "default_audio_track_id";
    public static final java.lang.String EXTRA_BUNDLE_KEY_AUDIO_AC4_APD_TYPE = "extra_audio_ac4_apd_type";
    public static final java.lang.String EXTRA_BUNDLE_KEY_AUDIO_ANALOG_AUDIO_MODE = "analog_audio_mode";
    public static final java.lang.String EXTRA_BUNDLE_KEY_AUDIO_EDITORIAL_CLASS = "extra_audio_editorial_class";
    public static final java.lang.String EXTRA_BUNDLE_KEY_AUDIO_MIX_TYPE = "extra_audio_mix_type";
    public static final java.lang.String EXTRA_BUNDLE_KEY_AUDIO_TYPE = "extra_audio_type";
    public static final java.lang.String EXTRA_BUNDLE_KEY_COMPONENT_TAG = "component_tag";
    public static final java.lang.String EXTRA_BUNDLE_KEY_PID = "pid";
    public static final java.lang.String EXTRA_BUNDLE_KEY_VIDEO_HDR_TYPE = "video_hdr_type";
    public static final int TYPE_AUDIO = 0;
    public static final int TYPE_SUBTITLE = 2;
    public static final int TYPE_VIDEO = 1;
    private final int mAudioChannelCount = 0;
    private final boolean mAudioDescription = false;
    private final int mAudioSampleRate = 0;
    private final java.lang.CharSequence mDescription = null;
    private final java.lang.String mEncoding = null;
    private final boolean mEncrypted = false;
    private final android.os.Bundle mExtra = null;
    private final boolean mHardOfHearing = false;
    private final java.lang.String mId = null;
    private final java.lang.String mLanguage = null;
    private final boolean mSpokenSubtitle = false;
    private final int mType = 0;
    private final byte mVideoActiveFormatDescription = 0;
    private final float mVideoFrameRate = 0.0f;
    private final int mVideoHeight = 0;
    private final float mVideoPixelAspectRatio = 0.0f;
    private final int mVideoWidth = 0;
    private TvTrackInfo(int p0, java.lang.String p1, java.lang.String p2, java.lang.CharSequence p3, java.lang.String p4, boolean p5, int p6, int p7, boolean p8, boolean p9, boolean p10, int p11, int p12, float p13, float p14, byte p15, android.os.Bundle p16) {}
    private TvTrackInfo(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public final int getAudioChannelCount() { return 0; }
    public final int getAudioSampleRate() { return 0; }
    public final java.lang.CharSequence getDescription() { return null; }
    public java.lang.String getEncoding() { return null; }
    public final android.os.Bundle getExtra() { return null; }
    public final java.lang.String getId() { return null; }
    public final java.lang.String getLanguage() { return null; }
    public final int getType() { return 0; }
    public final byte getVideoActiveFormatDescription() { return 0; }
    public final float getVideoFrameRate() { return 0.0f; }
    public final int getVideoHeight() { return 0; }
    public final float getVideoPixelAspectRatio() { return 0.0f; }
    public final int getVideoWidth() { return 0; }
    public int hashCode() { return 0; }
    public boolean isAudioDescription() { return false; }
    public boolean isEncrypted() { return false; }
    public boolean isHardOfHearing() { return false; }
    public boolean isSpokenSubtitle() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private int mAudioChannelCount;
        private boolean mAudioDescription;
        private int mAudioSampleRate;
        private java.lang.CharSequence mDescription;
        private java.lang.String mEncoding;
        private boolean mEncrypted;
        private android.os.Bundle mExtra;
        private boolean mHardOfHearing;
        private final java.lang.String mId = null;
        private java.lang.String mLanguage;
        private boolean mSpokenSubtitle;
        private final int mType = 0;
        private byte mVideoActiveFormatDescription;
        private float mVideoFrameRate;
        private int mVideoHeight;
        private float mVideoPixelAspectRatio;
        private int mVideoWidth;
        public Builder(int p0, java.lang.String p1) {}
        public android.media.tv.TvTrackInfo build() { return null; }
        public android.media.tv.TvTrackInfo.Builder setAudioChannelCount(int p0) { return null; }
        public android.media.tv.TvTrackInfo.Builder setAudioDescription(boolean p0) { return null; }
        public android.media.tv.TvTrackInfo.Builder setAudioSampleRate(int p0) { return null; }
        public android.media.tv.TvTrackInfo.Builder setDescription(java.lang.CharSequence p0) { return null; }
        public android.media.tv.TvTrackInfo.Builder setEncoding(java.lang.String p0) { return null; }
        public android.media.tv.TvTrackInfo.Builder setEncrypted(boolean p0) { return null; }
        public android.media.tv.TvTrackInfo.Builder setExtra(android.os.Bundle p0) { return null; }
        public android.media.tv.TvTrackInfo.Builder setHardOfHearing(boolean p0) { return null; }
        public android.media.tv.TvTrackInfo.Builder setLanguage(java.lang.String p0) { return null; }
        public android.media.tv.TvTrackInfo.Builder setSpokenSubtitle(boolean p0) { return null; }
        public android.media.tv.TvTrackInfo.Builder setVideoActiveFormatDescription(byte p0) { return null; }
        public android.media.tv.TvTrackInfo.Builder setVideoFrameRate(float p0) { return null; }
        public android.media.tv.TvTrackInfo.Builder setVideoHeight(int p0) { return null; }
        public android.media.tv.TvTrackInfo.Builder setVideoPixelAspectRatio(float p0) { return null; }
        public android.media.tv.TvTrackInfo.Builder setVideoWidth(int p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Type {
    }
}
