package android.hardware.display;

public final class BrightnessRangeOverrideRequest implements android.os.Parcelable {
    public static final long ANIMATION_DURATION_UNSET = -1L;
    public static final float BRIGHTNESS_UNSET = -1.0f;
    public static final android.os.Parcelable.Creator<android.hardware.display.BrightnessRangeOverrideRequest> CREATOR = null;
    public static final int REASON_NONE = 0;
    public static final int REASON_SHELL_REQUEST = 2;
    public static final int REASON_USER_AUTHENTICATION = 1;
    private final long mAnimationDurationMillis = 0L;
    private final int mBrightnessUnit = 0;
    private final float mMaxBrightness = 0.0f;
    private final float mMinBrightness = 0.0f;
    private final int mReason = 0;
    private BrightnessRangeOverrideRequest(int p0, float p1, float p2, int p3, long p4) {}
    public static java.lang.String reasonToString(int p0) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public long getAnimationDurationMillis() { return 0L; }
    public int getBrightnessUnit() { return 0; }
    public float getMaxBrightness() { return 0.0f; }
    public float getMinBrightness() { return 0.0f; }
    public int getReason() { return 0; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Reason {
    }

    public static final class Builder {
        private long mAnimationDurationMillis;
        private int mBrightnessUnit;
        private float mMaxBrightness;
        private float mMinBrightness;
        private final int mReason = 0;
        public Builder(int p0) {}
        public android.hardware.display.BrightnessRangeOverrideRequest build() { return null; }
        public android.hardware.display.BrightnessRangeOverrideRequest.Builder setAnimationDurationMillis(long p0) { return null; }
        public android.hardware.display.BrightnessRangeOverrideRequest.Builder setBrightnessUnit(int p0) { return null; }
        public android.hardware.display.BrightnessRangeOverrideRequest.Builder setMaxBrightness(float p0) { return null; }
        public android.hardware.display.BrightnessRangeOverrideRequest.Builder setMinBrightness(float p0) { return null; }
    }
}
