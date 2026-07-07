package android.service.notification;

public final class ZenDeviceEffects implements android.os.Parcelable {
    private static final float BRIGHTNESS_CAP_MAX = 1.0f;
    private static final float BRIGHTNESS_CAP_MIN = 0.0f;
    public static final android.os.Parcelable.Creator<android.service.notification.ZenDeviceEffects> CREATOR = null;
    public static final int FIELD_BRIGHTNESS_CAP = 4096;
    public static final int FIELD_DIM_WALLPAPER = 4;
    public static final int FIELD_DISABLE_AUTO_BRIGHTNESS = 16;
    public static final int FIELD_DISABLE_TAP_TO_WAKE = 32;
    public static final int FIELD_DISABLE_TILT_TO_WAKE = 64;
    public static final int FIELD_DISABLE_TOUCH = 128;
    public static final int FIELD_EXTRA_EFFECTS = 1024;
    public static final int FIELD_GRAYSCALE = 1;
    public static final int FIELD_MAXIMIZE_DOZE = 512;
    public static final int FIELD_MINIMIZE_RADIO_USAGE = 256;
    public static final int FIELD_NIGHT_LIGHT = 2048;
    public static final int FIELD_NIGHT_MODE = 8;
    public static final int FIELD_SUPPRESS_AMBIENT_DISPLAY = 2;
    private static final int MAX_EFFECTS_LENGTH = 2000;
    private final java.lang.Float mBrightnessCap = null;
    private final boolean mDimWallpaper = false;
    private final boolean mDisableAutoBrightness = false;
    private final boolean mDisableTapToWake = false;
    private final boolean mDisableTiltToWake = false;
    private final boolean mDisableTouch = false;
    private final java.util.Set<java.lang.String> mExtraEffects = null;
    private final boolean mGrayscale = false;
    private final boolean mMaximizeDoze = false;
    private final boolean mMinimizeRadioUsage = false;
    private final boolean mNightLight = false;
    private final boolean mNightMode = false;
    private final boolean mSuppressAmbientDisplay = false;
    private ZenDeviceEffects(boolean p0, boolean p1, boolean p2, boolean p3, boolean p4, boolean p5, boolean p6, boolean p7, boolean p8, boolean p9, boolean p10, java.lang.Float p11, java.util.Set<java.lang.String> p12) {}
    public static java.lang.String fieldsToString(int p0) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.Float getBrightnessCap() { return null; }
    public java.util.Set<java.lang.String> getExtraEffects() { return null; }
    public boolean hasEffects() { return false; }
    public int hashCode() { return 0; }
    public boolean shouldDimWallpaper() { return false; }
    public boolean shouldDisableAutoBrightness() { return false; }
    public boolean shouldDisableTapToWake() { return false; }
    public boolean shouldDisableTiltToWake() { return false; }
    public boolean shouldDisableTouch() { return false; }
    public boolean shouldDisplayGrayscale() { return false; }
    public boolean shouldMaximizeDoze() { return false; }
    public boolean shouldMinimizeRadioUsage() { return false; }
    public boolean shouldSuppressAmbientDisplay() { return false; }
    public boolean shouldUseNightLight() { return false; }
    public boolean shouldUseNightMode() { return false; }
    public java.lang.String toString() { return null; }
    public void validate() {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private java.lang.Float mBrightnessCap;
        private boolean mDimWallpaper;
        private boolean mDisableAutoBrightness;
        private boolean mDisableTapToWake;
        private boolean mDisableTiltToWake;
        private boolean mDisableTouch;
        private final java.util.HashSet<java.lang.String> mExtraEffects = null;
        private boolean mGrayscale;
        private boolean mMaximizeDoze;
        private boolean mMinimizeRadioUsage;
        private boolean mNightLight;
        private boolean mNightMode;
        private boolean mSuppressAmbientDisplay;
        public Builder() {}
        public Builder(android.service.notification.ZenDeviceEffects p0) {}
        public android.service.notification.ZenDeviceEffects.Builder add(android.service.notification.ZenDeviceEffects p0) { return null; }
        public android.service.notification.ZenDeviceEffects.Builder addExtraEffect(java.lang.String p0) { return null; }
        public android.service.notification.ZenDeviceEffects.Builder addExtraEffects(java.util.Set<java.lang.String> p0) { return null; }
        public android.service.notification.ZenDeviceEffects build() { return null; }
        public android.service.notification.ZenDeviceEffects.Builder setBrightnessCap(java.lang.Float p0) { return null; }
        public android.service.notification.ZenDeviceEffects.Builder setExtraEffects(java.util.Set<java.lang.String> p0) { return null; }
        public android.service.notification.ZenDeviceEffects.Builder setShouldDimWallpaper(boolean p0) { return null; }
        public android.service.notification.ZenDeviceEffects.Builder setShouldDisableAutoBrightness(boolean p0) { return null; }
        public android.service.notification.ZenDeviceEffects.Builder setShouldDisableTapToWake(boolean p0) { return null; }
        public android.service.notification.ZenDeviceEffects.Builder setShouldDisableTiltToWake(boolean p0) { return null; }
        public android.service.notification.ZenDeviceEffects.Builder setShouldDisableTouch(boolean p0) { return null; }
        public android.service.notification.ZenDeviceEffects.Builder setShouldDisplayGrayscale(boolean p0) { return null; }
        public android.service.notification.ZenDeviceEffects.Builder setShouldMaximizeDoze(boolean p0) { return null; }
        public android.service.notification.ZenDeviceEffects.Builder setShouldMinimizeRadioUsage(boolean p0) { return null; }
        public android.service.notification.ZenDeviceEffects.Builder setShouldSuppressAmbientDisplay(boolean p0) { return null; }
        public android.service.notification.ZenDeviceEffects.Builder setShouldUseNightLight(boolean p0) { return null; }
        public android.service.notification.ZenDeviceEffects.Builder setShouldUseNightMode(boolean p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ModifiableField {
    }
}
