package android.window;

public final class PictureInPictureSurfaceTransaction implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.window.PictureInPictureSurfaceTransaction> CREATOR = null;
    private static final float NOT_SET = -1.0f;
    public final float mAlpha = 0.0f;
    private final android.gui.BorderSettings mBorderSettings = null;
    private final android.gui.BoxShadowSettings mBoxShadowSettings = null;
    public final float mCornerRadius = 0.0f;
    public final float[] mFloat9 = null;
    public final android.graphics.PointF mPosition = null;
    public final float mRotation = 0.0f;
    public final float mShadowRadius = 0.0f;
    private boolean mShouldDisableCanAffectSystemUiFlags;
    private final android.graphics.Rect mWindowCrop = null;
    private PictureInPictureSurfaceTransaction(float p0, android.graphics.PointF p1, float[] p2, float p3, float p4, float p5, android.graphics.Rect p6, android.gui.BoxShadowSettings p7, android.gui.BorderSettings p8) {}
    private PictureInPictureSurfaceTransaction(android.os.Parcel p0) {}
    public PictureInPictureSurfaceTransaction(android.window.PictureInPictureSurfaceTransaction p0) {}
    public static void apply(android.window.PictureInPictureSurfaceTransaction p0, android.view.SurfaceControl p1, android.view.SurfaceControl.Transaction p2) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.graphics.Matrix getMatrix() { return null; }
    public boolean getShouldDisableCanAffectSystemUiFlags() { return false; }
    public boolean hasBorderSettingsSet() { return false; }
    public boolean hasBoxShadowSettingsSet() { return false; }
    public boolean hasCornerRadiusSet() { return false; }
    public boolean hasShadowRadiusSet() { return false; }
    public int hashCode() { return 0; }
    public void setShouldDisableCanAffectSystemUiFlags(boolean p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class Builder {
        private float mAlpha;
        private android.gui.BorderSettings mBorderSettings;
        private android.gui.BoxShadowSettings mBoxShadowSettings;
        private float mCornerRadius;
        private float[] mFloat9;
        private android.graphics.PointF mPosition;
        private float mRotation;
        private float mShadowRadius;
        private android.graphics.Rect mWindowCrop;
        public Builder() {}
        public android.window.PictureInPictureSurfaceTransaction build() { return null; }
        public android.window.PictureInPictureSurfaceTransaction.Builder setAlpha(float p0) { return null; }
        public android.window.PictureInPictureSurfaceTransaction.Builder setBorderSettings(android.gui.BorderSettings p0) { return null; }
        public android.window.PictureInPictureSurfaceTransaction.Builder setBoxShadowSettings(android.gui.BoxShadowSettings p0) { return null; }
        public android.window.PictureInPictureSurfaceTransaction.Builder setCornerRadius(float p0) { return null; }
        public android.window.PictureInPictureSurfaceTransaction.Builder setPosition(float p0, float p1) { return null; }
        public android.window.PictureInPictureSurfaceTransaction.Builder setShadowRadius(float p0) { return null; }
        public android.window.PictureInPictureSurfaceTransaction.Builder setTransform(float[] p0, float p1) { return null; }
        public android.window.PictureInPictureSurfaceTransaction.Builder setWindowCrop(android.graphics.Rect p0) { return null; }
    }
}
