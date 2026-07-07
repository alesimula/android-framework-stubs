package android.companion.virtual;

@android.annotation.SystemApi
public final class ViewConfigurationParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.companion.virtual.ViewConfigurationParams> CREATOR = null;
    public static final int INVALID_VALUE = -1;
    private final int mDoubleTapMinTimeMillis = 0;
    private final int mDoubleTapTimeoutMillis = 0;
    private final int mLongPressTimeoutMillis = 0;
    private final int mMaximumFlingVelocityPixelsPerSecond = 0;
    private final int mMinimumFlingVelocityPixelsPerSecond = 0;
    private final int mMultiPressTimeoutMillis = 0;
    private final float mScrollFriction = 0.0f;
    private final int mTapTimeoutMillis = 0;
    private final int mTouchSlopPixels = 0;
    private ViewConfigurationParams(int p0, int p1, int p2, float p3, int p4, int p5, int p6, int p7, int p8) {}
    private ViewConfigurationParams(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.time.Duration getDoubleTapMinTimeDuration() { return null; }
    public java.time.Duration getDoubleTapTimeoutDuration() { return null; }
    public java.time.Duration getLongPressTimeoutDuration() { return null; }
    public int getMaximumFlingVelocityPixelsPerSecond() { return 0; }
    public int getMinimumFlingVelocityPixelsPerSecond() { return 0; }
    public java.time.Duration getMultiPressTimeoutDuration() { return null; }
    public float getScrollFriction() { return 0.0f; }
    public java.time.Duration getTapTimeoutDuration() { return null; }
    public int getTouchSlopPixels() { return 0; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private int mDoubleTapMinTimeMillis;
        private int mDoubleTapTimeoutMillis;
        private int mLongPressTimeoutMillis;
        private int mMaximumFlingVelocityPixelsPerSecond;
        private int mMinimumFlingVelocityPixelsPerSecond;
        private int mMultiPressTimeoutMillis;
        private float mScrollFriction;
        private int mTapTimeoutMillis;
        private int mTouchSlopPixels;
        public Builder() {}
        public android.companion.virtual.ViewConfigurationParams build() { return null; }
        public android.companion.virtual.ViewConfigurationParams.Builder setDoubleTapMinTimeDuration(java.time.Duration p0) { return null; }
        public android.companion.virtual.ViewConfigurationParams.Builder setDoubleTapTimeoutDuration(java.time.Duration p0) { return null; }
        public android.companion.virtual.ViewConfigurationParams.Builder setLongPressTimeoutDuration(java.time.Duration p0) { return null; }
        public android.companion.virtual.ViewConfigurationParams.Builder setMaximumFlingVelocityPixelsPerSecond(int p0) { return null; }
        public android.companion.virtual.ViewConfigurationParams.Builder setMinimumFlingVelocityPixelsPerSecond(int p0) { return null; }
        public android.companion.virtual.ViewConfigurationParams.Builder setMultiPressTimeoutDuration(java.time.Duration p0) { return null; }
        public android.companion.virtual.ViewConfigurationParams.Builder setScrollFriction(float p0) { return null; }
        public android.companion.virtual.ViewConfigurationParams.Builder setTapTimeoutDuration(java.time.Duration p0) { return null; }
        public android.companion.virtual.ViewConfigurationParams.Builder setTouchSlopPixels(int p0) { return null; }
    }
}
