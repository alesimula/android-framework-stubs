package android.graphics.drawable;

public class RippleDrawable extends android.graphics.drawable.LayerDrawable {
    private static final int BACKGROUND_OPACITY_DURATION = 80;
    private static final int DEFAULT_EFFECT_COLOR = -1912602625;
    private static final boolean FORCE_PATTERNED_STYLE = true;
    private static final android.view.animation.LinearInterpolator LINEAR_INTERPOLATOR = null;
    private static final int MASK_CONTENT = 1;
    private static final int MASK_EXPLICIT = 2;
    private static final int MASK_NONE = 0;
    private static final int MASK_UNKNOWN = -1;
    private static final int MAX_RIPPLES = 10;
    public static final int RADIUS_AUTO = -1;
    public static final int STYLE_PATTERNED = 1;
    public static final int STYLE_SOLID = 0;
    private static final java.lang.String TAG = "RippleDrawable";
    private boolean mAddRipple;
    private android.graphics.drawable.RippleBackground mBackground;
    private android.animation.ValueAnimator mBackgroundAnimation;
    private float mBackgroundOpacity;
    private int mDensity;
    private final android.graphics.Rect mDirtyBounds = null;
    private final android.graphics.Rect mDrawingBounds = null;
    private boolean mExitingAnimation;
    private android.graphics.drawable.RippleForeground[] mExitingRipples;
    private int mExitingRipplesCount;
    private android.graphics.PorterDuffColorFilter mFocusColorFilter;
    private boolean mForceSoftware;
    private boolean mHasPending;
    private boolean mHasValidMask;
    private final android.graphics.Rect mHotspotBounds = null;
    private android.graphics.drawable.Drawable mMask;
    private android.graphics.Bitmap mMaskBuffer;
    private android.graphics.Canvas mMaskCanvas;
    private android.graphics.PorterDuffColorFilter mMaskColorFilter;
    private android.graphics.Matrix mMaskMatrix;
    private android.graphics.BitmapShader mMaskShader;
    private boolean mOverrideBounds;
    private float mPendingX;
    private float mPendingY;
    private android.graphics.drawable.RippleForeground mRipple;
    private boolean mRippleActive;
    private android.graphics.Paint mRipplePaint;
    private boolean mRunBackgroundAnimation;
    private java.util.ArrayList<android.graphics.drawable.RippleAnimationSession> mRunningAnimations;
    private android.graphics.drawable.RippleDrawable.RippleState mState;
    private float mTargetBackgroundOpacity;
    private final android.graphics.Rect mTempRect = null;
    RippleDrawable() { super((android.graphics.drawable.Drawable[])null); }
    public RippleDrawable(android.content.res.ColorStateList p0, android.graphics.drawable.Drawable p1, android.graphics.drawable.Drawable p2) { super((android.graphics.drawable.Drawable[])null); }
    private RippleDrawable(android.graphics.drawable.RippleDrawable.RippleState p0, android.content.res.Resources p1) { super((android.graphics.drawable.Drawable[])null); }
    private void cancelExitingRipples() {}
    private void clearHotspots() {}
    private float computeRadius() { return 0.0f; }
    private android.graphics.drawable.RippleAnimationSession.AnimationProperties<java.lang.Float, android.graphics.Paint> createAnimationProperties(float p0, float p1, float p2, float p3, float p4, float p5) { return null; }
    private void drawBackgroundAndRipples(android.graphics.Canvas p0) {}
    private void drawContent(android.graphics.Canvas p0) {}
    private void drawMask(android.graphics.Canvas p0) {}
    private void drawPatterned(android.graphics.Canvas p0) {}
    private void drawPatternedBackground(android.graphics.Canvas p0, float p1, float p2) {}
    private void drawSolid(android.graphics.Canvas p0) {}
    private void endPatternedAnimations() {}
    private void enterPatternedBackgroundAnimation(boolean p0, boolean p1, boolean p2) {}
    private void exitPatternedAnimation() {}
    private void exitPatternedBackgroundAnimation() {}
    private int getComputedRadius() { return 0; }
    private int getMaskType() { return 0; }
    private boolean isBounded() { return false; }
    private void onHotspotBoundsChanged() {}
    private void pruneRipples() {}
    private void setRippleActive(boolean p0) {}
    private void startBackgroundAnimation() {}
    private void startPatternedAnimation() {}
    private void tryRippleEnter() {}
    private void tryRippleExit() {}
    private void updateLocalState() {}
    private void updateMaskShaderIfNeeded() {}
    private void updateStateFromTypedArray(android.content.res.TypedArray p0) throws org.xmlpull.v1.XmlPullParserException {}
    private void verifyRequiredAttributes(android.content.res.TypedArray p0) throws org.xmlpull.v1.XmlPullParserException {}
    public void applyTheme(android.content.res.Resources.Theme p0) {}
    public boolean canApplyTheme() { return false; }
    android.graphics.drawable.RippleDrawable.RippleState createConstantState(android.graphics.drawable.LayerDrawable.LayerState p0, android.content.res.Resources p1) { return null; }
    public void draw(android.graphics.Canvas p0) {}
    public android.graphics.drawable.Drawable.ConstantState getConstantState() { return null; }
    public android.graphics.Rect getDirtyBounds() { return null; }
    public android.content.res.ColorStateList getEffectColor() { return null; }
    public void getHotspotBounds(android.graphics.Rect p0) {}
    public int getOpacity() { return 0; }
    public void getOutline(android.graphics.Outline p0) {}
    public int getRadius() { return 0; }
    public float getTargetBackgroundOpacity() { return 0.0f; }
    public boolean hasFocusStateSpecified() { return false; }
    public void inflate(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public void invalidateSelf() {}
    void invalidateSelf(boolean p0) {}
    public boolean isProjected() { return false; }
    public boolean isStateful() { return false; }
    public void jumpToCurrentState() {}
    public android.graphics.drawable.Drawable mutate() { return null; }
    protected void onBoundsChange(android.graphics.Rect p0) {}
    protected boolean onStateChange(int[] p0) { return false; }
    public void setBackgroundActive(boolean p0, boolean p1, boolean p2, boolean p3) {}
    public void setColor(android.content.res.ColorStateList p0) {}
    public boolean setDrawableByLayerId(int p0, android.graphics.drawable.Drawable p1) { return false; }
    public void setEffectColor(android.content.res.ColorStateList p0) {}
    public void setForceSoftware(boolean p0) {}
    public void setHotspot(float p0, float p1) {}
    public void setHotspotBounds(int p0, int p1, int p2, int p3) {}
    public void setPaddingMode(int p0) {}
    public void setRadius(int p0) {}
    public boolean setVisible(boolean p0, boolean p1) { return false; }
    android.graphics.Paint updateRipplePaint() { return null; }

    static class RippleState extends android.graphics.drawable.LayerDrawable.LayerState {
        android.content.res.ColorStateList mColor;
        android.content.res.ColorStateList mEffectColor;
        int mMaxRadius;
        int mRippleStyle;
        int[] mTouchThemeAttrs;
        public RippleState(android.graphics.drawable.LayerDrawable.LayerState p0, android.graphics.drawable.RippleDrawable p1, android.content.res.Resources p2) { super(null, null, null); }
        private void applyDensityScaling(int p0, int p1) {}
        public boolean canApplyTheme() { return false; }
        public int getChangingConfigurations() { return 0; }
        public android.graphics.drawable.Drawable newDrawable() { return null; }
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources p0) { return null; }
        protected void onDensityChanged(int p0, int p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.FIELD})
    public static @interface RippleStyle {
    }
}
