package android.service.voice;

@android.annotation.SystemApi
public final class HotwordDetectedResult implements android.os.Parcelable {
    public static final int AUDIO_CHANNEL_UNSET = -1;
    public static final int BACKGROUND_AUDIO_POWER_UNSET = -1;
    public static final int CONFIDENCE_LEVEL_HIGH = 5;
    public static final int CONFIDENCE_LEVEL_LOW = 1;
    public static final int CONFIDENCE_LEVEL_LOW_MEDIUM = 2;
    public static final int CONFIDENCE_LEVEL_MEDIUM = 3;
    public static final int CONFIDENCE_LEVEL_MEDIUM_HIGH = 4;
    public static final int CONFIDENCE_LEVEL_NONE = 0;
    public static final int CONFIDENCE_LEVEL_VERY_HIGH = 6;
    public static final android.os.Parcelable.Creator<android.service.voice.HotwordDetectedResult> CREATOR = null;
    private static final java.lang.String EXTRA_PROXIMITY = "android.service.voice.extra.PROXIMITY";
    public static final int HOTWORD_OFFSET_UNSET = -1;
    private static final int LIMIT_AUDIO_CHANNEL_MAX_VALUE = 63;
    private static final int LIMIT_HOTWORD_OFFSET_MAX_VALUE = 3600000;
    public static final int PROXIMITY_FAR = 2;
    public static final int PROXIMITY_NEAR = 1;
    public static final int PROXIMITY_UNKNOWN = -1;
    private static int sMaxBundleSize;
    private int mAudioChannel;
    private final java.util.List<android.service.voice.HotwordAudioStream> mAudioStreams = null;
    private final int mBackgroundAudioPower = 0;
    private final int mConfidenceLevel = 0;
    private final android.os.PersistableBundle mExtras = null;
    private boolean mHotwordDetectionPersonalized;
    private int mHotwordDurationMillis;
    private int mHotwordOffsetMillis;
    private final int mHotwordPhraseId = 0;
    private android.media.MediaSyncEvent mMediaSyncEvent;
    private final int mPersonalizedScore = 0;
    private final int mScore = 0;
    private final int mSpeakerId = 0;
    HotwordDetectedResult(int p0, int p1, android.media.MediaSyncEvent p2, int p3, int p4, int p5, boolean p6, int p7, int p8, int p9, java.util.List<android.service.voice.HotwordAudioStream> p10, android.os.PersistableBundle p11, int p12) {}
    HotwordDetectedResult(android.os.Parcel p0) {}
    @java.lang.Deprecated
    private void __metadata() {}
    private static int bitCount(long p0) { return 0; }
    public static java.lang.String confidenceLevelToString(int p0) { return null; }
    private int convertToProximityLevel(double p0) { return 0; }
    private static java.util.List<android.service.voice.HotwordAudioStream> defaultAudioStreams() { return null; }
    private static int defaultBackgroundAudioPower() { return 0; }
    private static int defaultConfidenceLevel() { return 0; }
    private static android.os.PersistableBundle defaultExtras() { return null; }
    private static int defaultHotwordPhraseId() { return 0; }
    private static int defaultPersonalizedScore() { return 0; }
    private static int defaultScore() { return 0; }
    private static int defaultSpeakerId() { return 0; }
    public static int getMaxBackgroundAudioPower() { return 0; }
    public static int getMaxBundleSize() { return 0; }
    public static int getMaxHotwordPhraseId() { return 0; }
    public static int getMaxScore() { return 0; }
    public static int getMaxSpeakerId() { return 0; }
    public static int getParcelableSize(android.os.Parcelable p0) { return 0; }
    public static int getUsageSize(android.service.voice.HotwordDetectedResult p0) { return 0; }
    static java.lang.String limitToString(int p0) { return null; }
    private void onConstructed() {}
    public static java.lang.String proximityToString(int p0) { return null; }
    public android.service.voice.HotwordDetectedResult.Builder buildUpon() { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getAudioChannel() { return 0; }
    public java.util.List<android.service.voice.HotwordAudioStream> getAudioStreams() { return null; }
    public int getBackgroundAudioPower() { return 0; }
    public int getConfidenceLevel() { return 0; }
    public android.os.PersistableBundle getExtras() { return null; }
    public int getHotwordDurationMillis() { return 0; }
    public int getHotwordOffsetMillis() { return 0; }
    public int getHotwordPhraseId() { return 0; }
    public android.media.MediaSyncEvent getMediaSyncEvent() { return null; }
    public int getPersonalizedScore() { return 0; }
    public int getProximity() { return 0; }
    public int getScore() { return 0; }
    public int getSpeakerId() { return 0; }
    public int hashCode() { return 0; }
    public boolean isHotwordDetectionPersonalized() { return false; }
    public void setProximity(double p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    static abstract class BaseBuilder {
        BaseBuilder() {}
        public android.service.voice.HotwordDetectedResult.Builder setAudioStreams(java.util.List<android.service.voice.HotwordAudioStream> p0) { return null; }
    }

    public static final class Builder extends android.service.voice.HotwordDetectedResult.BaseBuilder {
        private int mAudioChannel;
        private java.util.List<android.service.voice.HotwordAudioStream> mAudioStreams;
        private int mBackgroundAudioPower;
        private long mBuilderFieldsSet;
        private int mConfidenceLevel;
        private android.os.PersistableBundle mExtras;
        private boolean mHotwordDetectionPersonalized;
        private int mHotwordDurationMillis;
        private int mHotwordOffsetMillis;
        private int mHotwordPhraseId;
        private android.media.MediaSyncEvent mMediaSyncEvent;
        private int mPersonalizedScore;
        private int mScore;
        private int mSpeakerId;
        public Builder() { super(); }
        private void checkNotUsed() {}
        public android.service.voice.HotwordDetectedResult build() { return null; }
        public android.service.voice.HotwordDetectedResult.Builder setAudioChannel(int p0) { return null; }
        public android.service.voice.HotwordDetectedResult.Builder setBackgroundAudioPower(int p0) { return null; }
        public android.service.voice.HotwordDetectedResult.Builder setConfidenceLevel(int p0) { return null; }
        public android.service.voice.HotwordDetectedResult.Builder setExtras(android.os.PersistableBundle p0) { return null; }
        public android.service.voice.HotwordDetectedResult.Builder setHotwordDetectionPersonalized(boolean p0) { return null; }
        public android.service.voice.HotwordDetectedResult.Builder setHotwordDurationMillis(int p0) { return null; }
        public android.service.voice.HotwordDetectedResult.Builder setHotwordOffsetMillis(int p0) { return null; }
        public android.service.voice.HotwordDetectedResult.Builder setHotwordPhraseId(int p0) { return null; }
        public android.service.voice.HotwordDetectedResult.Builder setMediaSyncEvent(android.media.MediaSyncEvent p0) { return null; }
        public android.service.voice.HotwordDetectedResult.Builder setPersonalizedScore(int p0) { return null; }
        public android.service.voice.HotwordDetectedResult.Builder setScore(int p0) { return null; }
        public android.service.voice.HotwordDetectedResult.Builder setSpeakerId(int p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ConfidenceLevel {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface HotwordConfidenceLevelValue {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface Limit {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Proximity {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ProximityValue {
    }
}
