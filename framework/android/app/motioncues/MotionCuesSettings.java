package android.app.motioncues;

@android.annotation.SystemApi
public final class MotionCuesSettings implements android.os.Parcelable {
    @android.annotation.SystemApi
    public static final android.os.Parcelable.Creator<android.app.motioncues.MotionCuesSettings> CREATOR = null;
    private final int mHorizontalSpacingDp = 0;
    private final int mMarginSizeDp = 0;
    private final int mRadiusDp = 0;
    private final int mVerticalSpacingDp = 0;
    private MotionCuesSettings(android.app.motioncues.MotionCuesSettings.Builder p0) {}
    private MotionCuesSettings(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    @android.annotation.SystemApi
    public int getHorizontalSpacingDp() { return 0; }
    @android.annotation.SystemApi
    public int getMarginSizeDp() { return 0; }
    @android.annotation.SystemApi
    public int getRadiusDp() { return 0; }
    @android.annotation.SystemApi
    public int getVerticalSpacingDp() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.SystemApi
    public static final class Builder {
        private int mHorizontalSpacingDp;
        private int mMarginSizeDp;
        private int mRadiusDp;
        private int mVerticalSpacingDp;
        @android.annotation.SystemApi
        public Builder() {}
        @android.annotation.SystemApi
        public Builder(android.app.motioncues.MotionCuesSettings p0) {}
        @android.annotation.SystemApi
        public android.app.motioncues.MotionCuesSettings build() { return null; }
        @android.annotation.SystemApi
        public android.app.motioncues.MotionCuesSettings.Builder setHorizontalSpacingDp(int p0) { return null; }
        @android.annotation.SystemApi
        public android.app.motioncues.MotionCuesSettings.Builder setMarginSizeDp(int p0) { return null; }
        @android.annotation.SystemApi
        public android.app.motioncues.MotionCuesSettings.Builder setRadiusDp(int p0) { return null; }
        @android.annotation.SystemApi
        public android.app.motioncues.MotionCuesSettings.Builder setVerticalSpacingDp(int p0) { return null; }
    }
}
