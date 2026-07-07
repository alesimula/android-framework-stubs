package android.widget;

@android.widget.RemoteViews.RemoteView
public class ImageView extends android.view.View {
    private static final java.lang.String LOG_TAG = "ImageView";
    private static boolean sCompatAdjustViewBounds;
    private static boolean sCompatDone;
    private static boolean sCompatDrawableVisibilityDispatch;
    private static boolean sCompatUseCorrectStreamDensity;
    private static final android.graphics.Matrix.ScaleToFit[] sS2FArray = null;
    private static final android.widget.ImageView.ScaleType[] sScaleTypeArray = null;
    private boolean mAdjustViewBounds;
    private int mAlpha;
    private int mBaseline;
    private boolean mBaselineAlignBottom;
    private android.graphics.ColorFilter mColorFilter;
    private boolean mCropToPadding;
    private android.graphics.Matrix mDrawMatrix;
    private android.graphics.drawable.Drawable mDrawable;
    private android.graphics.BlendMode mDrawableBlendMode;
    private int mDrawableHeight;
    private android.content.res.ColorStateList mDrawableTintList;
    private int mDrawableWidth;
    private boolean mHasAlpha;
    private boolean mHasColorFilter;
    private boolean mHasDrawableBlendMode;
    private boolean mHasDrawableTint;
    private boolean mHasLevelSet;
    private boolean mHasXfermode;
    private boolean mHaveFrame;
    private int mLevel;
    private android.graphics.Matrix mMatrix;
    private int mMaxHeight;
    private int mMaxWidth;
    private boolean mMergeState;
    private android.graphics.drawable.BitmapDrawable mRecycleableBitmapDrawable;
    private int mResource;
    private android.widget.ImageView.ScaleType mScaleType;
    private int[] mState;
    private final android.graphics.RectF mTempDst = null;
    private final android.graphics.RectF mTempSrc = null;
    private android.net.Uri mUri;
    private final int mViewAlphaScale = 0;
    private android.graphics.Xfermode mXfermode;
    public ImageView(android.content.Context p0) { super((android.content.Context)null); }
    public ImageView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public ImageView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public ImageView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private void applyAlpha() {}
    private void applyColorFilter() {}
    private void applyImageTint() {}
    private void applyXfermode() {}
    private void configureBounds() {}
    private android.graphics.drawable.Drawable getDrawableFromUri(android.net.Uri p0) { return null; }
    private void initImageView() {}
    private boolean isFilledByImage() { return false; }
    private void resizeFromDrawable() {}
    private int resolveAdjustedSize(int p0, int p1, int p2) { return 0; }
    private void resolveUri() {}
    private static android.graphics.Matrix.ScaleToFit scaleTypeToScaleToFit(android.widget.ImageView.ScaleType p0) { return null; }
    private void updateDrawable(android.graphics.drawable.Drawable p0) {}
    public void animateTransform(android.graphics.Matrix p0) {}
    public final void clearColorFilter() {}
    public void drawableHotspotChanged(float p0, float p1) {}
    protected void drawableStateChanged() {}
    protected void encodeProperties(android.view.ViewHierarchyEncoder p0) {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public boolean getAdjustViewBounds() { return false; }
    @android.view.ViewDebug.ExportedProperty(category="layout")
    public int getBaseline() { return 0; }
    public boolean getBaselineAlignBottom() { return false; }
    public android.graphics.ColorFilter getColorFilter() { return null; }
    public boolean getCropToPadding() { return false; }
    public android.graphics.drawable.Drawable getDrawable() { return null; }
    public int getImageAlpha() { return 0; }
    public android.graphics.Matrix getImageMatrix() { return null; }
    public android.graphics.BlendMode getImageTintBlendMode() { return null; }
    public android.content.res.ColorStateList getImageTintList() { return null; }
    public android.graphics.PorterDuff.Mode getImageTintMode() { return null; }
    public int getMaxHeight() { return 0; }
    public int getMaxWidth() { return 0; }
    public android.widget.ImageView.ScaleType getScaleType() { return null; }
    public boolean hasOverlappingRendering() { return false; }
    public void invalidateDrawable(android.graphics.drawable.Drawable p0) {}
    public boolean isDefaultFocusHighlightNeeded(android.graphics.drawable.Drawable p0, android.graphics.drawable.Drawable p1) { return false; }
    public boolean isOpaque() { return false; }
    public void jumpDrawablesToCurrentState() {}
    protected void onAttachedToWindow() {}
    public int[] onCreateDrawableState(int p0) { return null; }
    protected void onDetachedFromWindow() {}
    protected void onDraw(android.graphics.Canvas p0) {}
    public void onFrameRateHint(android.graphics.drawable.Drawable p0, float p1) {}
    protected void onMeasure(int p0, int p1) {}
    public void onPopulateAccessibilityEventInternal(android.view.accessibility.AccessibilityEvent p0) {}
    public void onRtlPropertiesChanged(int p0) {}
    public void onVisibilityAggregated(boolean p0) {}
    @android.view.RemotableViewMethod
    public void setAdjustViewBounds(boolean p0) {}
    @android.view.RemotableViewMethod
    @java.lang.Deprecated
    public void setAlpha(int p0) {}
    public void setBaseline(int p0) {}
    public void setBaselineAlignBottom(boolean p0) {}
    @android.view.RemotableViewMethod
    public final void setColorFilter(int p0) {}
    public final void setColorFilter(int p0, android.graphics.PorterDuff.Mode p1) {}
    public void setColorFilter(android.graphics.ColorFilter p0) {}
    public void setCropToPadding(boolean p0) {}
    protected boolean setFrame(int p0, int p1, int p2, int p3) { return false; }
    @android.view.RemotableViewMethod
    public void setImageAlpha(int p0) {}
    @android.view.RemotableViewMethod
    public void setImageBitmap(android.graphics.Bitmap p0) {}
    public void setImageDrawable(android.graphics.drawable.Drawable p0) {}
    @android.view.RemotableViewMethod(asyncImpl="setImageIconAsync")
    public void setImageIcon(android.graphics.drawable.Icon p0) {}
    public java.lang.Runnable setImageIconAsync(android.graphics.drawable.Icon p0) { return null; }
    @android.view.RemotableViewMethod
    public void setImageLevel(int p0) {}
    public void setImageMatrix(android.graphics.Matrix p0) {}
    @android.view.RemotableViewMethod(asyncImpl="setImageResourceAsync")
    public void setImageResource(int p0) {}
    public java.lang.Runnable setImageResourceAsync(int p0) { return null; }
    public void setImageState(int[] p0, boolean p1) {}
    @android.view.RemotableViewMethod
    public void setImageTintBlendMode(android.graphics.BlendMode p0) {}
    @android.view.RemotableViewMethod
    public void setImageTintList(android.content.res.ColorStateList p0) {}
    public void setImageTintMode(android.graphics.PorterDuff.Mode p0) {}
    @android.view.RemotableViewMethod(asyncImpl="setImageURIAsync")
    public void setImageURI(android.net.Uri p0) {}
    public java.lang.Runnable setImageURIAsync(android.net.Uri p0) { return null; }
    @android.view.RemotableViewMethod
    public void setMaxHeight(int p0) {}
    @android.view.RemotableViewMethod
    public void setMaxWidth(int p0) {}
    public void setScaleType(android.widget.ImageView.ScaleType p0) {}
    public void setSelected(boolean p0) {}
    @android.view.RemotableViewMethod
    public void setVisibility(int p0) {}
    public final void setXfermode(android.graphics.Xfermode p0) {}
    protected boolean verifyDrawable(android.graphics.drawable.Drawable p0) { return false; }

    private class ImageDrawableCallback implements java.lang.Runnable {
        private final android.graphics.drawable.Drawable drawable = null;
        private final int resource = 0;
        private final android.net.Uri uri = null;
        ImageDrawableCallback(android.widget.ImageView p0, android.graphics.drawable.Drawable p1, android.net.Uri p2, int p3) {}
        public void run() {}
    }

    public static enum ScaleType {
        CENTER,
        CENTER_CROP,
        CENTER_INSIDE,
        FIT_CENTER,
        FIT_END,
        FIT_START,
        FIT_XY,
        MATRIX;
        private static final android.widget.ImageView.ScaleType[] $VALUES = null;
        final int nativeInt = 0;
        private ScaleType() {}
    }

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.widget.ImageView> {
        private int mAdjustViewBoundsId;
        private int mBaselineAlignBottomId;
        private int mBaselineId;
        private int mBlendModeId;
        private int mCropToPaddingId;
        private int mMaxHeightId;
        private int mMaxWidthId;
        private boolean mPropertiesMapped;
        private int mScaleTypeId;
        private int mSrcId;
        private int mTintId;
        private int mTintModeId;
        public InspectionCompanion() {}
        public void mapProperties(android.view.inspector.PropertyMapper p0) {}
        public void readProperties(android.widget.ImageView p0, android.view.inspector.PropertyReader p1) {}
    }
}
