package android.content.res;

public final class CameraCompatibilityInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.res.CameraCompatibilityInfo> CREATOR = null;
    private final int mDisplayRotationSandbox = 0;
    private final int mRotateAndCropRotation = 0;
    private final boolean mShouldAllowTransformInverseDisplay = false;
    private final boolean mShouldLetterboxForCameraCompat = false;
    private final boolean mShouldOverrideLensFacingFrontToBack = false;
    private final boolean mShouldOverrideSensorOrientation = false;
    private CameraCompatibilityInfo(android.content.res.CameraCompatibilityInfo.Builder p0) {}
    private CameraCompatibilityInfo(android.os.Parcel p0) {}
    public static boolean isCameraCompatModeActive(android.content.res.CameraCompatibilityInfo p0) { return false; }
    public void applyToConfigurationIfNeeded(android.content.res.Configuration p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getDisplayRotationSandbox() { return 0; }
    public int getRotateAndCropRotation() { return 0; }
    public int hashCode() { return 0; }
    public boolean shouldAllowTransformInverseDisplay() { return false; }
    public boolean shouldLetterboxForCameraCompat() { return false; }
    public boolean shouldOverrideLensFacingFrontToBack() { return false; }
    public boolean shouldOverrideSensorOrientation() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private int mDisplayRotationSandbox;
        private int mRotateAndCropRotation;
        private boolean mShouldAllowTransformInverseDisplay;
        private boolean mShouldLetterboxForCameraCompat;
        private boolean mShouldOverrideLensFacingFrontToBack;
        private boolean mShouldOverrideSensorOrientation;
        public Builder() {}
        public android.content.res.CameraCompatibilityInfo build() { return null; }
        public android.content.res.CameraCompatibilityInfo.Builder setDisplayRotationSandbox(int p0) { return null; }
        public android.content.res.CameraCompatibilityInfo.Builder setRotateAndCropRotation(int p0) { return null; }
        public android.content.res.CameraCompatibilityInfo.Builder setShouldAllowTransformInverseDisplay(boolean p0) { return null; }
        public android.content.res.CameraCompatibilityInfo.Builder setShouldLetterboxForCameraCompat(boolean p0) { return null; }
        public android.content.res.CameraCompatibilityInfo.Builder setShouldOverrideLensFacingFrontToBack(boolean p0) { return null; }
        public android.content.res.CameraCompatibilityInfo.Builder setShouldOverrideSensorOrientation(boolean p0) { return null; }
    }
}
