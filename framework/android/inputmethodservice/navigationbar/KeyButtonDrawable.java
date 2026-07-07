package android.inputmethodservice.navigationbar;

final class KeyButtonDrawable extends android.graphics.drawable.Drawable {
    public static final android.util.FloatProperty<android.inputmethodservice.navigationbar.KeyButtonDrawable> KEY_DRAWABLE_ROTATE = null;
    public static final android.util.FloatProperty<android.inputmethodservice.navigationbar.KeyButtonDrawable> KEY_DRAWABLE_TRANSLATE_Y = null;
    private android.graphics.drawable.AnimatedVectorDrawable mAnimatedDrawable;
    private final android.graphics.drawable.Drawable.Callback mAnimatedDrawableCallback = null;
    private final android.graphics.Paint mIconPaint = null;
    private final android.graphics.Paint mShadowPaint = null;
    private final android.inputmethodservice.navigationbar.KeyButtonDrawable.ShadowDrawableState mState = null;
    KeyButtonDrawable(android.graphics.drawable.Drawable p0, int p1, int p2, boolean p3, android.graphics.Color p4) { super(); }
    private KeyButtonDrawable(android.graphics.drawable.Drawable p0, android.inputmethodservice.navigationbar.KeyButtonDrawable.ShadowDrawableState p1) { super(); }
    public static android.inputmethodservice.navigationbar.KeyButtonDrawable create(android.content.Context p0, int p1, int p2, int p3, boolean p4, android.graphics.Color p5) { return null; }
    private void regenerateBitmapIconCache() {}
    private void regenerateBitmapShadowCache() {}
    private void setDrawableBounds(android.graphics.drawable.Drawable p0) {}
    private void updateShadowAlpha() {}
    public boolean canAnimate() { return false; }
    public boolean canApplyTheme() { return false; }
    public void clearAnimationCallbacks() {}
    public void draw(android.graphics.Canvas p0) {}
    public android.graphics.drawable.Drawable.ConstantState getConstantState() { return null; }
    public float getDarkIntensity() { return 0.0f; }
    int getDrawableBackgroundColor() { return 0; }
    public int getIntrinsicHeight() { return 0; }
    public int getIntrinsicWidth() { return 0; }
    public int getOpacity() { return 0; }
    public float getRotation() { return 0.0f; }
    public float getTranslationX() { return 0.0f; }
    public float getTranslationY() { return 0.0f; }
    boolean hasOvalBg() { return false; }
    public void jumpToCurrentState() {}
    public void resetAnimation() {}
    public void setAlpha(int p0) {}
    public void setColorFilter(android.graphics.ColorFilter p0) {}
    public void setDarkIntensity(float p0) {}
    public void setRotation(float p0) {}
    public void setShadowProperties(int p0, int p1, int p2, int p3) {}
    public void setTranslation(float p0, float p1) {}
    public void setTranslationX(float p0) {}
    public void setTranslationY(float p0) {}
    public boolean setVisible(boolean p0, boolean p1) { return false; }
    public void startAnimation() {}

    private static class ShadowDrawableState extends android.graphics.drawable.Drawable.ConstantState {
        int mAlpha;
        int mBaseHeight;
        int mBaseWidth;
        int mChangingConfigurations;
        android.graphics.drawable.Drawable.ConstantState mChildState;
        final int mDarkColor = 0;
        float mDarkIntensity;
        boolean mHorizontalFlip;
        boolean mIsHardwareBitmap;
        android.graphics.Bitmap mLastDrawnIcon;
        android.graphics.Bitmap mLastDrawnShadow;
        final int mLightColor = 0;
        final android.graphics.Color mOvalBackgroundColor = null;
        float mRotateDegrees;
        int mShadowColor;
        int mShadowOffsetX;
        int mShadowOffsetY;
        int mShadowSize;
        final boolean mSupportsAnimation = false;
        float mTranslationX;
        float mTranslationY;
        ShadowDrawableState(int p0, int p1, boolean p2, boolean p3, android.graphics.Color p4) { super(); }
        public boolean canApplyTheme() { return false; }
        public int getChangingConfigurations() { return 0; }
        public android.graphics.drawable.Drawable newDrawable() { return null; }
    }
}
