package android.os;

public final class VibrationAttributes implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.VibrationAttributes> CREATOR = null;
    public static final int FLAG_ALL_SUPPORTED = 31;
    public static final int FLAG_BYPASS_INTERRUPTION_POLICY = 1;
    public static final int FLAG_BYPASS_USER_VIBRATION_INTENSITY_OFF = 2;
    public static final int FLAG_INVALIDATE_SETTINGS_CACHE = 4;
    public static final int FLAG_NO_FALLBACK_FOR_TIMELINED_COMPOSITION = 16;
    public static final int FLAG_PIPELINED_EFFECT = 8;
    private static final java.lang.String TAG = "VibrationAttributes";
    public static final int USAGE_ACCESSIBILITY = 66;
    public static final int USAGE_ALARM = 17;
    public static final int USAGE_CLASS_ALARM = 1;
    public static final int USAGE_CLASS_FEEDBACK = 2;
    public static final int USAGE_CLASS_MASK = 15;
    public static final int USAGE_CLASS_MEDIA = 3;
    public static final int USAGE_CLASS_UNKNOWN = 0;
    public static final int USAGE_COMMUNICATION_REQUEST = 65;
    public static final int USAGE_FILTER_MATCH_ALL = -1;
    public static final int USAGE_GESTURE_INPUT = 98;
    public static final int USAGE_HARDWARE_FEEDBACK = 50;
    public static final int USAGE_IME_FEEDBACK = 82;
    public static final int USAGE_MEDIA = 19;
    public static final int USAGE_NOTIFICATION = 49;
    public static final int USAGE_PHYSICAL_EMULATION = 34;
    public static final int USAGE_RINGTONE = 33;
    public static final int USAGE_TOUCH = 18;
    public static final int USAGE_UNKNOWN = 0;
    private final int mFlags = 0;
    private final int mOriginalAudioUsage = 0;
    private final int mUsage = 0;
    private VibrationAttributes(int p0, int p1, int p2) {}
    private VibrationAttributes(android.os.Parcel p0) {}
    public static android.os.VibrationAttributes createForUsage(int p0) { return null; }
    public static java.lang.String usageToString(int p0) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getAudioUsage() { return 0; }
    public int getFlags() { return 0; }
    public int getOriginalAudioUsage() { return 0; }
    public int getUsage() { return 0; }
    public int getUsageClass() { return 0; }
    public int hashCode() { return 0; }
    public boolean isFlagSet(int p0) { return false; }
    public java.lang.String toString() { return null; }
    public java.lang.String usageToString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private int mFlags;
        private int mOriginalAudioUsage;
        private int mUsage;
        public Builder() {}
        public Builder(android.media.AudioAttributes p0) {}
        public Builder(android.os.VibrationAttributes p0) {}
        private void setFlags(android.media.AudioAttributes p0) {}
        private void setUsage(android.media.AudioAttributes p0) {}
        public android.os.VibrationAttributes build() { return null; }
        public android.os.VibrationAttributes.Builder setFlags(int p0) { return null; }
        public android.os.VibrationAttributes.Builder setFlags(int p0, int p1) { return null; }
        public android.os.VibrationAttributes.Builder setUsage(int p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Flag {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Usage {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UsageClass {
    }
}
