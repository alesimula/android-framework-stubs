package android.graphics.drawable;

public class GradientDrawable extends android.graphics.drawable.Drawable {
    public static final int ARC = 4;
    private static final int BUTT = 0;
    private static final float DEFAULT_INNER_RADIUS_RATIO = 3.0f;
    private static final android.graphics.drawable.GradientDrawable.Orientation DEFAULT_ORIENTATION = null;
    private static final float DEFAULT_THICKNESS_RATIO = 9.0f;
    public static final int LINE = 2;
    public static final int LINEAR_GRADIENT = 0;
    public static final int OVAL = 1;
    public static final int RADIAL_GRADIENT = 1;
    private static final int RADIUS_TYPE_FRACTION = 1;
    private static final int RADIUS_TYPE_FRACTION_PARENT = 2;
    private static final int RADIUS_TYPE_PIXELS = 0;
    public static final int RECTANGLE = 0;
    public static final int RING = 3;
    private static final int ROUND = 1;
    private static final int SQUARE = 2;
    public static final int SWEEP_GRADIENT = 2;
    public static boolean sWrapNegativeAngleMeasurements;
    private int mAlpha;
    private android.graphics.Path mArcOutlinePath;
    private android.graphics.Path mArcPath;
    private android.graphics.BlendModeColorFilter mBlendModeColorFilter;
    private android.graphics.ColorFilter mColorFilter;
    private final android.graphics.Paint mFillPaint = null;
    private boolean mGradientIsDirty;
    private float mGradientRadius;
    private android.graphics.drawable.GradientDrawable.GradientState mGradientState;
    private android.graphics.Paint mLayerPaint;
    private boolean mMutated;
    private android.graphics.Rect mPadding;
    private final android.graphics.Path mPath = null;
    private boolean mPathIsDirty;
    private final android.graphics.RectF mRect = null;
    private android.graphics.Path mRingPath;
    private android.graphics.Paint mStrokePaint;
    public GradientDrawable() { super(); }
    private GradientDrawable(android.graphics.drawable.GradientDrawable.GradientState p0, android.content.res.Resources p1) { super(); }
    public GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation p0, int[] p1) { super(); }
    private void applyThemeChildElements(android.content.res.Resources.Theme p0) {}
    private void buildPathIfDirty() {}
    private android.graphics.Path buildRing(android.graphics.drawable.GradientDrawable.GradientState p0) { return null; }
    private boolean ensureValidRect() { return false; }
    private static float getFloatOrFraction(android.content.res.TypedArray p0, int p1, float p2) { return 0.0f; }
    private android.graphics.Paint.Cap getStrokeLineCapForPaint(int p0) { return null; }
    private void inflateChildElements(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    static boolean isOpaque(int p0) { return false; }
    private boolean isOpaqueForState() { return false; }
    private int modulateAlpha(int p0) { return 0; }
    private void setStrokeInternal(int p0, int p1, float p2, float p3) {}
    private void updateDrawableCorners(android.content.res.TypedArray p0) {}
    private void updateGradientDrawableGradient(android.content.res.Resources p0, android.content.res.TypedArray p1) {}
    private void updateGradientDrawablePadding(android.content.res.TypedArray p0) {}
    private void updateGradientDrawableSize(android.content.res.TypedArray p0) {}
    private void updateGradientDrawableSolid(android.content.res.TypedArray p0) {}
    private void updateGradientDrawableStroke(android.content.res.TypedArray p0) {}
    private void updateLocalState(android.content.res.Resources p0) {}
    private void updateStateFromTypedArray(android.content.res.TypedArray p0) {}
    public void applyTheme(android.content.res.Resources.Theme p0) {}
    public boolean canApplyTheme() { return false; }
    public void clearMutated() {}
    public void draw(android.graphics.Canvas p0) {}
    public int getAlpha() { return 0; }
    public int getChangingConfigurations() { return 0; }
    public android.content.res.ColorStateList getColor() { return null; }
    public android.graphics.ColorFilter getColorFilter() { return null; }
    public int[] getColors() { return null; }
    public android.graphics.drawable.Drawable.ConstantState getConstantState() { return null; }
    public float[] getCornerRadii() { return null; }
    public float getCornerRadius() { return 0.0f; }
    public float getGradientCenterX() { return 0.0f; }
    public float getGradientCenterY() { return 0.0f; }
    public float getGradientRadius() { return 0.0f; }
    public int getGradientType() { return 0; }
    public int getInnerRadius() { return 0; }
    public float getInnerRadiusRatio() { return 0.0f; }
    public int getIntrinsicHeight() { return 0; }
    public int getIntrinsicWidth() { return 0; }
    public int getOpacity() { return 0; }
    public android.graphics.Insets getOpticalInsets() { return null; }
    public android.graphics.drawable.GradientDrawable.Orientation getOrientation() { return null; }
    public void getOutline(android.graphics.Outline p0) {}
    public boolean getPadding(android.graphics.Rect p0) { return false; }
    public int getShape() { return 0; }
    public int getStrokeCap() { return 0; }
    public int getThickness() { return 0; }
    public float getThicknessRatio() { return 0.0f; }
    public boolean getUseLevel() { return false; }
    public boolean hasFocusStateSpecified() { return false; }
    public void inflate(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public boolean isStateful() { return false; }
    public android.graphics.drawable.Drawable mutate() { return null; }
    protected void onBoundsChange(android.graphics.Rect p0) {}
    protected boolean onLevelChange(int p0) { return false; }
    protected boolean onStateChange(int[] p0) { return false; }
    public void setAlpha(int p0) {}
    public void setAntiAlias(boolean p0) {}
    public void setColor(int p0) {}
    public void setColor(android.content.res.ColorStateList p0) {}
    public void setColorFilter(android.graphics.ColorFilter p0) {}
    public void setColors(int[] p0) {}
    public void setColors(int[] p0, float[] p1) {}
    public void setCornerRadii(float[] p0) {}
    public void setCornerRadius(float p0) {}
    public void setDither(boolean p0) {}
    public void setGradientCenter(float p0, float p1) {}
    public void setGradientRadius(float p0) {}
    public void setGradientType(int p0) {}
    public void setInnerRadius(int p0) {}
    public void setInnerRadiusRatio(float p0) {}
    public void setOrientation(android.graphics.drawable.GradientDrawable.Orientation p0) {}
    public void setPadding(int p0, int p1, int p2, int p3) {}
    public void setShape(int p0) {}
    public void setSize(int p0, int p1) {}
    public void setStroke(int p0, int p1) {}
    public void setStroke(int p0, int p1, float p2, float p3) {}
    public void setStroke(int p0, android.content.res.ColorStateList p1) {}
    public void setStroke(int p0, android.content.res.ColorStateList p1, float p2, float p3) {}
    public void setStrokeCap(int p0) {}
    public void setThickness(int p0) {}
    public void setThicknessRatio(float p0) {}
    public void setTintBlendMode(android.graphics.BlendMode p0) {}
    public void setTintList(android.content.res.ColorStateList p0) {}
    public void setUseLevel(boolean p0) {}
    public void setXfermode(android.graphics.Xfermode p0) {}

    static final class GradientState extends android.graphics.drawable.Drawable.ConstantState {
        public int mAngle;
        int[] mAttrCorners;
        int[] mAttrGradient;
        int[] mAttrPadding;
        int[] mAttrSize;
        int[] mAttrSolid;
        int[] mAttrStroke;
        android.graphics.BlendMode mBlendMode;
        float mCenterX;
        float mCenterY;
        public int mChangingConfigurations;
        int mDensity;
        public boolean mDither;
        public int mGradient;
        public android.content.res.ColorStateList[] mGradientColors;
        float mGradientRadius;
        int mGradientRadiusType;
        public int mHeight;
        public int mInnerRadius;
        public float mInnerRadiusRatio;
        boolean mOpaqueOverBounds;
        boolean mOpaqueOverShape;
        public android.graphics.Insets mOpticalInsets;
        public android.graphics.drawable.GradientDrawable.Orientation mOrientation;
        public android.graphics.Rect mPadding;
        public float[] mPositions;
        public float mRadius;
        public float[] mRadiusArray;
        public int mShape;
        public android.content.res.ColorStateList mSolidColors;
        public int mStrokeCap;
        public android.content.res.ColorStateList mStrokeColors;
        public float mStrokeDashGap;
        public float mStrokeDashWidth;
        public int mStrokeWidth;
        public int[] mTempColors;
        public float[] mTempPositions;
        int[] mThemeAttrs;
        public int mThickness;
        public float mThicknessRatio;
        android.content.res.ColorStateList mTint;
        boolean mUseLevel;
        boolean mUseLevelForShape;
        public int mWidth;
        public GradientState(android.graphics.drawable.GradientDrawable.GradientState p0, android.content.res.Resources p1) { super(); }
        public GradientState(android.graphics.drawable.GradientDrawable.Orientation p0, int[] p1) { super(); }
        private void applyDensityScaling(int p0, int p1) {}
        private void computeOpacity() {}
        public boolean canApplyTheme() { return false; }
        public int getChangingConfigurations() { return 0; }
        public android.graphics.drawable.GradientDrawable.Orientation getOrientation() { return null; }
        public boolean hasCenterColor() { return false; }
        public android.graphics.drawable.Drawable newDrawable() { return null; }
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources p0) { return null; }
        public void setCornerRadii(float[] p0) {}
        public void setCornerRadius(float p0) {}
        public final void setDensity(int p0) {}
        public void setGradientCenter(float p0, float p1) {}
        public void setGradientColors(int[] p0) {}
        public void setGradientRadius(float p0, int p1) {}
        public void setGradientType(int p0) {}
        public void setShape(int p0) {}
        public void setSize(int p0, int p1) {}
        public void setSolidColors(android.content.res.ColorStateList p0) {}
        public void setStroke(int p0, android.content.res.ColorStateList p1, float p2, float p3) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface GradientType {
    }

    public static enum Orientation {
        BL_TR,
        BOTTOM_TOP,
        BR_TL,
        LEFT_RIGHT,
        RIGHT_LEFT,
        TL_BR,
        TOP_BOTTOM,
        TR_BL;
        private static final android.graphics.drawable.GradientDrawable.Orientation[] $VALUES = null;
        private Orientation() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RadiusType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Shape {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface StrokeCap {
    }
}
