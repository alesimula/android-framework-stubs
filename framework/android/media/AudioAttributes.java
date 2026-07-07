package android.media;

public final class AudioAttributes implements android.os.Parcelable {
    public static final int ALLOW_CAPTURE_BY_ALL = 1;
    public static final int ALLOW_CAPTURE_BY_NONE = 3;
    public static final int ALLOW_CAPTURE_BY_SYSTEM = 2;
    private static final int ALL_PARCEL_FLAGS = 1;
    private static final int ATTR_PARCEL_IS_NULL_BUNDLE = -1977;
    private static final int ATTR_PARCEL_IS_VALID_BUNDLE = 1980;
    private static final android.util.IntArray CONTENT_TYPES = null;
    public static final int CONTENT_TYPE_MOVIE = 3;
    public static final int CONTENT_TYPE_MUSIC = 2;
    public static final int CONTENT_TYPE_SONIFICATION = 4;
    public static final int CONTENT_TYPE_SPEECH = 1;
    @android.annotation.SystemApi
    public static final int CONTENT_TYPE_ULTRASOUND = 1997;
    public static final int CONTENT_TYPE_UNKNOWN = 0;
    public static final android.os.Parcelable.Creator<android.media.AudioAttributes> CREATOR = null;
    private static final int FLAG_ALL = 129023;
    private static final int FLAG_ALL_API_SET = 465;
    private static final int FLAG_ALL_PUBLIC = 273;
    public static final int FLAG_AUDIBILITY_ENFORCED = 1;
    @android.annotation.SystemApi
    public static final int FLAG_BEACON = 8;
    @android.annotation.SystemApi
    public static final int FLAG_BYPASS_INTERRUPTION_POLICY = 64;
    @android.annotation.SystemApi
    public static final int FLAG_BYPASS_MUTE = 128;
    public static final int FLAG_CALL_REDIRECTION = 65536;
    public static final int FLAG_CAPTURE_PRIVATE = 8192;
    public static final int FLAG_CONTENT_SPATIALIZED = 16384;
    public static final int FLAG_DEEP_BUFFER = 512;
    public static final int FLAG_HW_AV_SYNC = 16;
    @android.annotation.SystemApi
    public static final int FLAG_HW_HOTWORD = 32;
    public static final int FLAG_LOW_LATENCY = 256;
    public static final int FLAG_MUTE_HAPTIC = 2048;
    private static final android.util.SparseArray<java.lang.String> FLAG_NAMES = null;
    public static final int FLAG_NEVER_SPATIALIZE = 32768;
    public static final int FLAG_NO_MEDIA_PROJECTION = 1024;
    public static final int FLAG_NO_SYSTEM_CAPTURE = 4096;
    public static final int FLAG_SCO = 4;
    public static final int FLAG_SECURE = 2;
    public static final int FLATTEN_TAGS = 1;
    private static final java.lang.String KEY_TEST_ID = "key_test_id";
    public static final android.util.IntArray SDK_USAGES = null;
    public static final int SPATIALIZATION_BEHAVIOR_AUTO = 0;
    public static final int SPATIALIZATION_BEHAVIOR_NEVER = 1;
    public static final int SUPPRESSIBLE_ALARM = 4;
    public static final int SUPPRESSIBLE_CALL = 2;
    public static final int SUPPRESSIBLE_MEDIA = 5;
    public static final int SUPPRESSIBLE_NEVER = 3;
    public static final int SUPPRESSIBLE_NOTIFICATION = 1;
    public static final int SUPPRESSIBLE_SYSTEM = 6;
    public static final android.util.SparseIntArray SUPPRESSIBLE_USAGES = null;
    private static final int SYSTEM_USAGE_OFFSET = 1000;
    private static final java.lang.String TAG = "AudioAttributes";
    public static final int USAGE_ALARM = 4;
    @android.annotation.SystemApi
    public static final int USAGE_ANNOUNCEMENT = 1003;
    public static final int USAGE_ASSISTANCE_ACCESSIBILITY = 11;
    public static final int USAGE_ASSISTANCE_NAVIGATION_GUIDANCE = 12;
    public static final int USAGE_ASSISTANCE_SONIFICATION = 13;
    public static final int USAGE_ASSISTANT = 16;
    @android.annotation.SystemApi
    public static final int USAGE_CALL_ASSISTANT = 17;
    @android.annotation.SystemApi
    public static final int USAGE_EMERGENCY = 1000;
    public static final int USAGE_GAME = 14;
    private static final int USAGE_INVALID = -1;
    public static final int USAGE_MEDIA = 1;
    public static final int USAGE_NOTIFICATION = 5;
    @java.lang.Deprecated
    public static final int USAGE_NOTIFICATION_COMMUNICATION_DELAYED = 9;
    @java.lang.Deprecated
    public static final int USAGE_NOTIFICATION_COMMUNICATION_INSTANT = 8;
    @java.lang.Deprecated
    public static final int USAGE_NOTIFICATION_COMMUNICATION_REQUEST = 7;
    public static final int USAGE_NOTIFICATION_EVENT = 10;
    public static final int USAGE_NOTIFICATION_RINGTONE = 6;
    @android.annotation.SystemApi
    public static final int USAGE_SAFETY = 1001;
    @android.annotation.SystemApi
    public static final int USAGE_SPEAKER_CLEANUP = 1004;
    public static final int USAGE_UNKNOWN = 0;
    @android.annotation.SystemApi
    public static final int USAGE_VEHICLE_STATUS = 1002;
    public static final int USAGE_VIRTUAL_SOURCE = 15;
    public static final int USAGE_VOICE_COMMUNICATION = 2;
    public static final int USAGE_VOICE_COMMUNICATION_SIGNALLING = 3;
    public static final long VALUE_TEST_ID_NONE = -9223372036854775808L;
    private android.os.Bundle mBundle;
    private int mContentType;
    private int mFlags;
    private java.lang.String mFormattedTags;
    private int mSource;
    private java.util.HashSet<java.lang.String> mTags;
    private int mUsage;
    private AudioAttributes() {}
    private AudioAttributes(android.os.Parcel p0) {}
    public static int capturePolicyToFlags(int p0, int p1) { return 0; }
    private java.lang.String flagsToString() { return null; }
    public static int[] getSdkUsages() { return null; }
    public static int getSuppressibleUsage(int p0) { return 0; }
    public static boolean isHiddenUsage(int p0) { return false; }
    public static boolean isSdkContentType(int p0) { return false; }
    public static boolean isSdkUsage(int p0) { return false; }
    @android.annotation.SystemApi
    public static boolean isSystemUsage(int p0) { return false; }
    public static int toLegacyStreamType(android.media.AudioAttributes p0) { return 0; }
    private static int toVolumeStreamType(boolean p0, android.media.AudioAttributes p1) { return 0; }
    private static int usageForStreamType(int p0) { return 0; }
    public static java.lang.String usageToString(int p0) { return null; }
    public static java.lang.String usageToXsdString(int p0) { return null; }
    public static int xsdStringToUsage(java.lang.String p0) { return 0; }
    public boolean areHapticChannelsMuted() { return false; }
    public java.lang.String contentTypeToString() { return null; }
    public int describeContents() { return 0; }
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    @android.annotation.SystemApi
    public int getAllFlags() { return 0; }
    public int getAllowedCapturePolicy() { return 0; }
    @android.annotation.SystemApi
    public android.os.Bundle getBundle() { return null; }
    @android.annotation.SystemApi
    public int getCapturePreset() { return 0; }
    public int getContentType() { return 0; }
    public int getFlags() { return 0; }
    public int getSpatializationBehavior() { return 0; }
    @android.annotation.SystemApi
    public int getSystemUsage() { return 0; }
    public java.util.Set<java.lang.String> getTags() { return null; }
    public long getTestId() { return 0L; }
    public int getUsage() { return 0; }
    public int getVolumeControlStream() { return 0; }
    public int hashCode() { return 0; }
    public boolean isContentSpatialized() { return false; }
    public boolean isForCallRedirection() { return false; }
    public java.lang.String toString() { return null; }
    public java.lang.String usageToString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AttributeContentType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AttributeSdkUsage {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AttributeSystemUsage {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AttributeUsage {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AttrInternalContentType {
    }

    public static class Builder {
        private static final int PRIVACY_SENSITIVE_DEFAULT = -1;
        private static final int PRIVACY_SENSITIVE_DISABLED = 0;
        private static final int PRIVACY_SENSITIVE_ENABLED = 1;
        private android.os.Bundle mBundle;
        private int mContentType;
        private int mFlags;
        private boolean mIsContentSpatialized;
        private boolean mMuteHapticChannels;
        private int mPrivacySensitive;
        private int mSource;
        private int mSpatializationBehavior;
        private int mSystemUsage;
        private java.util.HashSet<java.lang.String> mTags;
        private int mUsage;
        public Builder() {}
        public Builder(android.media.AudioAttributes p0) {}
        @android.annotation.SystemApi
        public android.media.AudioAttributes.Builder addBundle(android.os.Bundle p0) { return null; }
        public android.media.AudioAttributes.Builder addTag(java.lang.String p0) { return null; }
        public android.media.AudioAttributes build() { return null; }
        public android.media.AudioAttributes.Builder replaceFlags(int p0) { return null; }
        public android.media.AudioAttributes.Builder replaceTags(java.util.HashSet<java.lang.String> p0) { return null; }
        public android.media.AudioAttributes.Builder setAllowedCapturePolicy(int p0) { return null; }
        @android.annotation.SystemApi
        public android.media.AudioAttributes.Builder setCapturePreset(int p0) { return null; }
        public android.media.AudioAttributes.Builder setContentType(int p0) { return null; }
        public android.media.AudioAttributes.Builder setFlags(int p0) { return null; }
        public android.media.AudioAttributes.Builder setForCallRedirection() { return null; }
        public android.media.AudioAttributes.Builder setHapticChannelsMuted(boolean p0) { return null; }
        @android.annotation.SystemApi
        public android.media.AudioAttributes.Builder setHotwordModeEnabled(boolean p0) { return null; }
        @android.annotation.SystemApi
        public android.media.AudioAttributes.Builder setInternalCapturePreset(int p0) { return null; }
        @android.annotation.SystemApi
        public android.media.AudioAttributes.Builder setInternalContentType(int p0) { return null; }
        public android.media.AudioAttributes.Builder setInternalLegacyStreamType(int p0) { return null; }
        public android.media.AudioAttributes.Builder setIsContentSpatialized(boolean p0) { return null; }
        public android.media.AudioAttributes.Builder setLegacyStreamType(int p0) { return null; }
        public android.media.AudioAttributes.Builder setPrivacySensitive(boolean p0) { return null; }
        public android.media.AudioAttributes.Builder setSpatializationBehavior(int p0) { return null; }
        @android.annotation.SystemApi
        public android.media.AudioAttributes.Builder setSystemUsage(int p0) { return null; }
        public android.media.AudioAttributes.Builder setTestId(long p0) { return null; }
        public android.media.AudioAttributes.Builder setUsage(int p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CapturePolicy {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SpatializationBehavior {
    }

    private static final class XsdHolder {
        static final java.util.Map<java.lang.String, java.lang.Integer> sInstance = null;
        private XsdHolder() {}
    }
}
