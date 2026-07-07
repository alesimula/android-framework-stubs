package android.app.wallpapereffectsgeneration;

@android.annotation.SystemApi
public final class CameraAttributes implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.wallpapereffectsgeneration.CameraAttributes> CREATOR = null;
    private float[] mAnchorPointInOutputUvSpace;
    private float[] mAnchorPointInWorldSpace;
    private float mCameraOrbitPitchDegrees;
    private float mCameraOrbitYawDegrees;
    private float mDollyDistanceInWorldSpace;
    private float mFrustumFarInWorldSpace;
    private float mFrustumNearInWorldSpace;
    private float mVerticalFovDegrees;
    private CameraAttributes(android.os.Parcel p0) {}
    private CameraAttributes(float[] p0, float[] p1, float p2, float p3, float p4, float p5, float p6, float p7) {}
    public int describeContents() { return 0; }
    public float[] getAnchorPointInOutputUvSpace() { return null; }
    public float[] getAnchorPointInWorldSpace() { return null; }
    public float getCameraOrbitPitchDegrees() { return 0.0f; }
    public float getCameraOrbitYawDegrees() { return 0.0f; }
    public float getDollyDistanceInWorldSpace() { return 0.0f; }
    public float getFrustumFarInWorldSpace() { return 0.0f; }
    public float getFrustumNearInWorldSpace() { return 0.0f; }
    public float getVerticalFovDegrees() { return 0.0f; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.SystemApi
    public static final class Builder {
        private float[] mAnchorPointInOutputUvSpace;
        private float[] mAnchorPointInWorldSpace;
        private float mCameraOrbitPitchDegrees;
        private float mCameraOrbitYawDegrees;
        private float mDollyDistanceInWorldSpace;
        private float mFrustumFarInWorldSpace;
        private float mFrustumNearInWorldSpace;
        private float mVerticalFovDegrees;
        @android.annotation.SystemApi
        public Builder(float[] p0, float[] p1) {}
        public android.app.wallpapereffectsgeneration.CameraAttributes build() { return null; }
        public android.app.wallpapereffectsgeneration.CameraAttributes.Builder setCameraOrbitPitchDegrees(float p0) { return null; }
        public android.app.wallpapereffectsgeneration.CameraAttributes.Builder setCameraOrbitYawDegrees(float p0) { return null; }
        public android.app.wallpapereffectsgeneration.CameraAttributes.Builder setDollyDistanceInWorldSpace(float p0) { return null; }
        public android.app.wallpapereffectsgeneration.CameraAttributes.Builder setFrustumFarInWorldSpace(float p0) { return null; }
        public android.app.wallpapereffectsgeneration.CameraAttributes.Builder setFrustumNearInWorldSpace(float p0) { return null; }
        public android.app.wallpapereffectsgeneration.CameraAttributes.Builder setVerticalFovDegrees(float p0) { return null; }
    }
}
