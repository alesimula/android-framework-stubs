package android.graphics.drawable;

public class LayerDrawable extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable.Callback {
    public static final int INSET_UNDEFINED = -2147483648;
    private static final java.lang.String LOG_TAG = "LayerDrawable";
    public static final int PADDING_MODE_NEST = 0;
    public static final int PADDING_MODE_STACK = 1;
    private boolean mChildRequestedInvalidation;
    private android.graphics.Rect mHotspotBounds;
    android.graphics.drawable.LayerDrawable.LayerState mLayerState;
    private boolean mMutated;
    private int[] mPaddingB;
    private int[] mPaddingL;
    private int[] mPaddingR;
    private int[] mPaddingT;
    private boolean mSuspendChildInvalidation;
    private final android.graphics.Rect mTmpContainer = null;
    private final android.graphics.Rect mTmpOutRect = null;
    private final android.graphics.Rect mTmpRect = null;
    LayerDrawable() { super(); }
    LayerDrawable(android.graphics.drawable.LayerDrawable.LayerState p0, android.content.res.Resources p1) { super(); }
    public LayerDrawable(android.graphics.drawable.Drawable[] p0) { super(); }
    LayerDrawable(android.graphics.drawable.Drawable[] p0, android.graphics.drawable.LayerDrawable.LayerState p1) { super(); }
    private void computeNestedPadding(android.graphics.Rect p0) {}
    private void computeStackedPadding(android.graphics.Rect p0) {}
    private android.graphics.drawable.LayerDrawable.ChildDrawable createLayer(android.graphics.drawable.Drawable p0) { return null; }
    private android.graphics.drawable.Drawable getFirstNonNullDrawable() { return null; }
    private void inflateLayers(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    private boolean refreshChildPadding(int p0, android.graphics.drawable.LayerDrawable.ChildDrawable p1) { return false; }
    private static int resolveGravity(int p0, int p1, int p2, int p3, int p4) { return 0; }
    private void resumeChildInvalidation() {}
    private void setLayerInsetInternal(int p0, int p1, int p2, int p3, int p4, int p5, int p6) {}
    private void suspendChildInvalidation() {}
    private void updateLayerBounds(android.graphics.Rect p0) {}
    private void updateLayerBoundsInternal(android.graphics.Rect p0) {}
    private void updateLayerFromTypedArray(android.graphics.drawable.LayerDrawable.ChildDrawable p0, android.content.res.TypedArray p1) {}
    private void updateStateFromTypedArray(android.content.res.TypedArray p0) {}
    public int addLayer(android.graphics.drawable.Drawable p0) { return 0; }
    int addLayer(android.graphics.drawable.LayerDrawable.ChildDrawable p0) { return 0; }
    android.graphics.drawable.LayerDrawable.ChildDrawable addLayer(android.graphics.drawable.Drawable p0, int[] p1, int p2, int p3, int p4, int p5, int p6) { return null; }
    public void applyTheme(android.content.res.Resources.Theme p0) {}
    public boolean canApplyTheme() { return false; }
    public void clearMutated() {}
    android.graphics.drawable.LayerDrawable.LayerState createConstantState(android.graphics.drawable.LayerDrawable.LayerState p0, android.content.res.Resources p1) { return null; }
    public void draw(android.graphics.Canvas p0) {}
    void ensurePadding() {}
    public android.graphics.drawable.Drawable findDrawableByLayerId(int p0) { return null; }
    public int findIndexByLayerId(int p0) { return 0; }
    public int getAlpha() { return 0; }
    public int getBottomPadding() { return 0; }
    public int getChangingConfigurations() { return 0; }
    public android.graphics.drawable.Drawable.ConstantState getConstantState() { return null; }
    public android.graphics.drawable.Drawable getDrawable(int p0) { return null; }
    public int getEndPadding() { return 0; }
    public void getHotspotBounds(android.graphics.Rect p0) {}
    public int getId(int p0) { return 0; }
    public int getIntrinsicHeight() { return 0; }
    public int getIntrinsicWidth() { return 0; }
    public int getLayerGravity(int p0) { return 0; }
    public int getLayerHeight(int p0) { return 0; }
    public int getLayerInsetBottom(int p0) { return 0; }
    public int getLayerInsetEnd(int p0) { return 0; }
    public int getLayerInsetLeft(int p0) { return 0; }
    public int getLayerInsetRight(int p0) { return 0; }
    public int getLayerInsetStart(int p0) { return 0; }
    public int getLayerInsetTop(int p0) { return 0; }
    public int getLayerWidth(int p0) { return 0; }
    public int getLeftPadding() { return 0; }
    public int getNumberOfLayers() { return 0; }
    public int getOpacity() { return 0; }
    public void getOutline(android.graphics.Outline p0) {}
    public boolean getPadding(android.graphics.Rect p0) { return false; }
    public int getPaddingMode() { return 0; }
    public int getRightPadding() { return 0; }
    public int getStartPadding() { return 0; }
    public int getTopPadding() { return 0; }
    public boolean hasFocusStateSpecified() { return false; }
    public void inflate(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public void invalidateDrawable(android.graphics.drawable.Drawable p0) {}
    public boolean isAutoMirrored() { return false; }
    public boolean isProjected() { return false; }
    public boolean isStateful() { return false; }
    public void jumpToCurrentState() {}
    public android.graphics.drawable.Drawable mutate() { return null; }
    protected void onBoundsChange(android.graphics.Rect p0) {}
    public boolean onLayoutDirectionChanged(int p0) { return false; }
    protected boolean onLevelChange(int p0) { return false; }
    protected boolean onStateChange(int[] p0) { return false; }
    void refreshPadding() {}
    public void scheduleDrawable(android.graphics.drawable.Drawable p0, java.lang.Runnable p1, long p2) {}
    public void setAlpha(int p0) {}
    public void setAutoMirrored(boolean p0) {}
    public void setColorFilter(android.graphics.ColorFilter p0) {}
    public void setDither(boolean p0) {}
    public void setDrawable(int p0, android.graphics.drawable.Drawable p1) {}
    public boolean setDrawableByLayerId(int p0, android.graphics.drawable.Drawable p1) { return false; }
    public void setHotspot(float p0, float p1) {}
    public void setHotspotBounds(int p0, int p1, int p2, int p3) {}
    public void setId(int p0, int p1) {}
    public void setLayerGravity(int p0, int p1) {}
    public void setLayerHeight(int p0, int p1) {}
    public void setLayerInset(int p0, int p1, int p2, int p3, int p4) {}
    public void setLayerInsetBottom(int p0, int p1) {}
    public void setLayerInsetEnd(int p0, int p1) {}
    public void setLayerInsetLeft(int p0, int p1) {}
    public void setLayerInsetRelative(int p0, int p1, int p2, int p3, int p4) {}
    public void setLayerInsetRight(int p0, int p1) {}
    public void setLayerInsetStart(int p0, int p1) {}
    public void setLayerInsetTop(int p0, int p1) {}
    public void setLayerSize(int p0, int p1, int p2) {}
    public void setLayerWidth(int p0, int p1) {}
    public void setOpacity(int p0) {}
    public void setPadding(int p0, int p1, int p2, int p3) {}
    public void setPaddingMode(int p0) {}
    public void setPaddingRelative(int p0, int p1, int p2, int p3) {}
    public void setTintBlendMode(android.graphics.BlendMode p0) {}
    public void setTintList(android.content.res.ColorStateList p0) {}
    public boolean setVisible(boolean p0, boolean p1) { return false; }
    public void unscheduleDrawable(android.graphics.drawable.Drawable p0, java.lang.Runnable p1) {}

    static class ChildDrawable {
        public int mDensity;
        public android.graphics.drawable.Drawable mDrawable;
        public int mGravity;
        public int mHeight;
        public int mId;
        public int mInsetB;
        public int mInsetE;
        public int mInsetL;
        public int mInsetR;
        public int mInsetS;
        public int mInsetT;
        public int[] mThemeAttrs;
        public int mWidth;
        ChildDrawable(int p0) {}
        ChildDrawable(android.graphics.drawable.LayerDrawable.ChildDrawable p0, android.graphics.drawable.LayerDrawable p1, android.content.res.Resources p2) {}
        private void applyDensityScaling(int p0, int p1) {}
        public boolean canApplyTheme() { return false; }
        public final void setDensity(int p0) {}
    }

    static class LayerState extends android.graphics.drawable.Drawable.ConstantState {
        private boolean mAutoMirrored;
        int mChangingConfigurations;
        private boolean mCheckedOpacity;
        private boolean mCheckedStateful;
        android.graphics.drawable.LayerDrawable.ChildDrawable[] mChildren;
        int mChildrenChangingConfigurations;
        int mDensity;
        private boolean mIsStateful;
        int mNumChildren;
        private int mOpacity;
        int mOpacityOverride;
        int mPaddingBottom;
        int mPaddingEnd;
        int mPaddingLeft;
        private int mPaddingMode;
        int mPaddingRight;
        int mPaddingStart;
        int mPaddingTop;
        private int[] mThemeAttrs;
        LayerState(android.graphics.drawable.LayerDrawable.LayerState p0, android.graphics.drawable.LayerDrawable p1, android.content.res.Resources p2) { super(); }
        private void applyDensityScaling(int p0, int p1) {}
        public boolean canApplyTheme() { return false; }
        public final boolean canConstantState() { return false; }
        public int getChangingConfigurations() { return 0; }
        public final int getOpacity() { return 0; }
        public final boolean hasFocusStateSpecified() { return false; }
        void invalidateCache() {}
        public final boolean isStateful() { return false; }
        public android.graphics.drawable.Drawable newDrawable() { return null; }
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources p0) { return null; }
        protected void onDensityChanged(int p0, int p1) {}
        public final void setDensity(int p0) {}
    }
}
