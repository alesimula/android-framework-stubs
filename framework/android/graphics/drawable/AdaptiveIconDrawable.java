package android.graphics.drawable;

public class AdaptiveIconDrawable extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable.Callback {
    private static final int BACKGROUND_ID = 0;
    private static final float BANNER_THRESHOLD_ASPECT_RATIO = 1.3799999952316284f;
    private static final float DEFAULT_VIEW_PORT_SCALE = 0.6666666865348816f;
    private static final float EXTRA_INSET_PERCENTAGE = 0.25f;
    private static final int FOREGROUND_ID = 1;
    public static final float MASK_SIZE = 100.0f;
    private static final int MONOCHROME_ID = 2;
    private static final float SAFEZONE_SCALE = 0.9166666865348816f;
    private static android.graphics.Path sMask;
    private static android.graphics.Path sMaskBanner;
    private final android.graphics.Canvas mCanvas = null;
    private boolean mChildRequestedInvalidation;
    private android.graphics.Rect mHotspotBounds;
    android.graphics.drawable.AdaptiveIconDrawable.LayerState mLayerState;
    private android.graphics.Bitmap mLayersBitmap;
    private android.graphics.Shader mLayersShader;
    private final android.graphics.Path mMask = null;
    private final android.graphics.Matrix mMaskMatrix = null;
    private final android.graphics.Path mMaskScaleOnly = null;
    private boolean mMutated;
    private android.graphics.Paint mPaint;
    private boolean mSuspendChildInvalidation;
    private final android.graphics.Rect mTmpOutRect = null;
    private final android.graphics.Region mTransparentRegion = null;
    AdaptiveIconDrawable() { super(); }
    AdaptiveIconDrawable(android.graphics.drawable.AdaptiveIconDrawable.LayerState p0, android.content.res.Resources p1) { super(); }
    public AdaptiveIconDrawable(android.graphics.drawable.Drawable p0, android.graphics.drawable.Drawable p1) { super(); }
    public AdaptiveIconDrawable(android.graphics.drawable.Drawable p0, android.graphics.drawable.Drawable p1, android.graphics.drawable.Drawable p2) { super(); }
    private void addLayer(int p0, android.graphics.drawable.AdaptiveIconDrawable.ChildDrawable p1) {}
    private android.graphics.drawable.AdaptiveIconDrawable.ChildDrawable createChildDrawable(android.graphics.drawable.Drawable p0) { return null; }
    public static float getExtraInsetFraction() { return 0.0f; }
    public static float getExtraInsetPercentage() { return 0.0f; }
    private int getMaxIntrinsicHeight() { return 0; }
    private int getMaxIntrinsicWidth() { return 0; }
    private void inflateLayers(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    private void resumeChildInvalidation() {}
    private void suspendChildInvalidation() {}
    private void updateLayerBounds(android.graphics.Rect p0) {}
    private void updateLayerBoundsInternal(android.graphics.Rect p0) {}
    private void updateLayerFromTypedArray(android.graphics.drawable.AdaptiveIconDrawable.ChildDrawable p0, android.content.res.TypedArray p1) {}
    private void updateMaskBoundsInternal(android.graphics.Rect p0) {}
    public void applyTheme(android.content.res.Resources.Theme p0) {}
    public boolean canApplyTheme() { return false; }
    public void clearMutated() {}
    android.graphics.drawable.AdaptiveIconDrawable.LayerState createConstantState(android.graphics.drawable.AdaptiveIconDrawable.LayerState p0, android.content.res.Resources p1) { return null; }
    public void draw(android.graphics.Canvas p0) {}
    public int getAlpha() { return 0; }
    public android.graphics.drawable.Drawable getBackground() { return null; }
    public int getChangingConfigurations() { return 0; }
    public android.graphics.drawable.Drawable.ConstantState getConstantState() { return null; }
    public android.graphics.drawable.Drawable getForeground() { return null; }
    public void getHotspotBounds(android.graphics.Rect p0) {}
    public android.graphics.Path getIconMask() { return null; }
    public int getIntrinsicHeight() { return 0; }
    public int getIntrinsicWidth() { return 0; }
    public android.graphics.drawable.Drawable getMonochrome() { return null; }
    public int getOpacity() { return 0; }
    public void getOutline(android.graphics.Outline p0) {}
    public android.graphics.Region getSafeZone() { return null; }
    public int getSourceDrawableResId() { return 0; }
    public android.graphics.Region getTransparentRegion() { return null; }
    public boolean hasFocusStateSpecified() { return false; }
    public void inflate(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public void invalidateDrawable(android.graphics.drawable.Drawable p0) {}
    public void invalidateSelf() {}
    public boolean isAutoMirrored() { return false; }
    public boolean isProjected() { return false; }
    public boolean isStateful() { return false; }
    public void jumpToCurrentState() {}
    public android.graphics.drawable.Drawable mutate() { return null; }
    protected void onBoundsChange(android.graphics.Rect p0) {}
    protected boolean onLevelChange(int p0) { return false; }
    protected boolean onStateChange(int[] p0) { return false; }
    public void scheduleDrawable(android.graphics.drawable.Drawable p0, java.lang.Runnable p1, long p2) {}
    public void setAlpha(int p0) {}
    public void setAutoMirrored(boolean p0) {}
    public void setColorFilter(android.graphics.ColorFilter p0) {}
    public void setDither(boolean p0) {}
    public void setHotspot(float p0, float p1) {}
    public void setHotspotBounds(int p0, int p1, int p2, int p3) {}
    public void setOpacity(int p0) {}
    public void setTintBlendMode(android.graphics.BlendMode p0) {}
    public void setTintList(android.content.res.ColorStateList p0) {}
    public boolean setVisible(boolean p0, boolean p1) { return false; }
    public void unscheduleDrawable(android.graphics.drawable.Drawable p0, java.lang.Runnable p1) {}

    static class ChildDrawable {
        public int mDensity;
        public android.graphics.drawable.Drawable mDrawable;
        public int[] mThemeAttrs;
        ChildDrawable(int p0) {}
        ChildDrawable(android.graphics.drawable.AdaptiveIconDrawable.ChildDrawable p0, android.graphics.drawable.AdaptiveIconDrawable p1, android.content.res.Resources p2) {}
        public boolean canApplyTheme() { return false; }
        public final void setDensity(int p0) {}
    }

    static class LayerState extends android.graphics.drawable.Drawable.ConstantState {
        static final int N_CHILDREN = 3;
        private boolean mAutoMirrored;
        int mChangingConfigurations;
        private boolean mCheckedOpacity;
        private boolean mCheckedStateful;
        android.graphics.drawable.AdaptiveIconDrawable.ChildDrawable[] mChildren;
        int mChildrenChangingConfigurations;
        int mDensity;
        private boolean mIsStateful;
        private int mOpacity;
        int mOpacityOverride;
        int mSourceDrawableId;
        int mSrcDensityOverride;
        private int[] mThemeAttrs;
        LayerState(android.graphics.drawable.AdaptiveIconDrawable.LayerState p0, android.graphics.drawable.AdaptiveIconDrawable p1, android.content.res.Resources p2) { super(); }
        public boolean canApplyTheme() { return false; }
        public final boolean canConstantState() { return false; }
        public int getChangingConfigurations() { return 0; }
        public final int getOpacity() { return 0; }
        public final boolean hasFocusStateSpecified() { return false; }
        public void invalidateCache() {}
        public final boolean isStateful() { return false; }
        public android.graphics.drawable.Drawable newDrawable() { return null; }
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources p0) { return null; }
        public final void setDensity(int p0) {}
    }
}
