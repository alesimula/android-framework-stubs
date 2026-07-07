package android.hardware.lights;

public final class Light implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.lights.Light> CREATOR = null;
    public static final int LIGHT_CAPABILITY_ANIMATION = 4;
    public static final int LIGHT_CAPABILITY_BRIGHTNESS = 1;
    public static final int LIGHT_CAPABILITY_COLOR_RGB = 2;
    @java.lang.Deprecated
    public static final int LIGHT_CAPABILITY_RGB = 0;
    public static final int LIGHT_TYPE_APPLICATION = 10;
    public static final int LIGHT_TYPE_CAMERA = 9;
    public static final int LIGHT_TYPE_INPUT = 10001;
    public static final int LIGHT_TYPE_KEYBOARD_BACKLIGHT = 10003;
    public static final int LIGHT_TYPE_KEYBOARD_MIC_MUTE = 10004;
    public static final int LIGHT_TYPE_KEYBOARD_VOLUME_MUTE = 10005;
    public static final int LIGHT_TYPE_MICROPHONE = 8;
    public static final int LIGHT_TYPE_PLAYER_ID = 10002;
    private final int mCapabilities = 0;
    private final int mId = 0;
    private final long mMinUpdatePeriodMillis = 0L;
    private final java.lang.String mName = null;
    private final int mOrdinal = 0;
    private final int[] mPreferredBrightnessLevels = null;
    private final int mType = 0;
    public Light(int p0, java.lang.String p1, int p2, int p3, int p4, int[] p5) {}
    public Light(int p0, java.lang.String p1, int p2, int p3, int p4, int[] p5, long p6) {}
    private Light(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getCapabilities() { return 0; }
    public int getId() { return 0; }
    public long getMinUpdatePeriodMillis() { return 0L; }
    public java.lang.String getName() { return null; }
    public int getOrdinal() { return 0; }
    public int[] getPreferredBrightnessLevels() { return null; }
    public int getType() { return 0; }
    public boolean hasAnimationControl() { return false; }
    public boolean hasBrightnessControl() { return false; }
    public boolean hasRgbControl() { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private int mCapabilities;
        private int mId;
        private long mMinUpdatePeriodMillis;
        private java.lang.String mName;
        private int mOrdinal;
        private int[] mPreferredBrightnessLevels;
        private int mType;
        public Builder(int p0, int p1, int p2) {}
        public android.hardware.lights.Light build() { return null; }
        public android.hardware.lights.Light.Builder setCapabilities(int p0) { return null; }
        public android.hardware.lights.Light.Builder setMinUpdatePeriodMillis(long p0) { return null; }
        public android.hardware.lights.Light.Builder setName(java.lang.String p0) { return null; }
        public android.hardware.lights.Light.Builder setPreferredBrightnessLevels(int[] p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LightCapability {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LightType {
    }
}
