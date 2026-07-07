package android.hardware.input;

@android.annotation.SystemApi
public final class ViewBehaviorConfig implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.input.ViewBehaviorConfig> CREATOR = null;
    private final int mPrimaryDirectionalMotionAxis = 0;
    private final boolean mShouldSmoothScroll = false;
    private ViewBehaviorConfig(int p0, boolean p1) {}
    public ViewBehaviorConfig(android.hardware.input.ViewBehaviorConfig p0) {}
    private ViewBehaviorConfig(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getPrimaryDirectionalMotionAxis() { return 0; }
    public int hashCode() { return 0; }
    public boolean shouldSmoothScroll() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.SystemApi
    public static final class Builder {
        private int mPrimaryDirectionalMotionAxis;
        private boolean mShouldSmoothScroll;
        public Builder() {}
        public android.hardware.input.ViewBehaviorConfig build() { return null; }
        public android.hardware.input.ViewBehaviorConfig.Builder setPrimaryDirectionalMotionAxis(int p0) { return null; }
        public android.hardware.input.ViewBehaviorConfig.Builder setShouldSmoothScroll(boolean p0) { return null; }
    }
}
