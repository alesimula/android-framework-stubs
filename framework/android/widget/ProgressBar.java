package android.widget;

@android.widget.RemoteViews.RemoteView
public class ProgressBar extends android.view.View {
    private static final int MAX_LEVEL = 10000;
    private static final int PROGRESS_ANIM_DURATION = 80;
    private static final android.view.animation.DecelerateInterpolator PROGRESS_ANIM_INTERPOLATOR = null;
    private final android.util.FloatProperty<android.widget.ProgressBar> VISUAL_PROGRESS = null;
    private boolean mAggregatedIsVisible;
    private android.view.animation.AlphaAnimation mAnimation;
    private boolean mAttached;
    private int mBehavior;
    private java.util.Locale mCachedLocale;
    private android.graphics.drawable.Drawable mCurrentDrawable;
    private int mDuration;
    private boolean mHasAnimation;
    private boolean mInDrawing;
    private boolean mIndeterminate;
    private android.graphics.drawable.Drawable mIndeterminateDrawable;
    private android.view.animation.Interpolator mInterpolator;
    private android.animation.ObjectAnimator mLastProgressAnimator;
    private int mMax;
    int mMaxHeight;
    private boolean mMaxInitialized;
    int mMaxWidth;
    private int mMin;
    int mMinHeight;
    private boolean mMinInitialized;
    int mMinWidth;
    boolean mMirrorForRtl;
    private boolean mNoInvalidate;
    private boolean mOnlyIndeterminate;
    private java.text.NumberFormat mPercentFormat;
    private int mProgress;
    private android.graphics.drawable.Drawable mProgressDrawable;
    private android.widget.ProgressBar.ProgressTintInfo mProgressTintInfo;
    private final java.util.ArrayList<android.widget.ProgressBar.RefreshData> mRefreshData = null;
    private boolean mRefreshIsPosted;
    private android.widget.ProgressBar.RefreshProgressRunnable mRefreshProgressRunnable;
    int mSampleWidth;
    private int mSecondaryProgress;
    private boolean mShouldStartAnimationDrawable;
    private android.view.animation.Transformation mTransformation;
    private long mUiThreadId;
    private float mVisualProgress;
    public ProgressBar(android.content.Context p0) { super((android.content.Context)null); }
    public ProgressBar(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public ProgressBar(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public ProgressBar(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private void applyIndeterminateTint() {}
    private void applyPrimaryProgressTint() {}
    private void applyProgressBackgroundTint() {}
    private void applyProgressTints() {}
    private void applySecondaryProgressTint() {}
    private void doRefreshProgress(int p0, int p1, boolean p2, boolean p3, boolean p4) {}
    private java.lang.CharSequence formatStateDescription(int p0) { return null; }
    private float getPercent(int p0) { return 0.0f; }
    private android.graphics.drawable.Drawable getTintTarget(int p0, boolean p1) { return null; }
    private void initProgressBar() {}
    private static boolean needsTileify(android.graphics.drawable.Drawable p0) { return false; }
    private void refreshProgress(int p0, int p1, boolean p2, boolean p3) {}
    private void setVisualProgress(int p0, float p1) {}
    private void swapCurrentDrawable(android.graphics.drawable.Drawable p0) {}
    private android.graphics.drawable.Drawable tileify(android.graphics.drawable.Drawable p0, boolean p1) { return null; }
    private android.graphics.drawable.Drawable tileifyIndeterminate(android.graphics.drawable.Drawable p0) { return null; }
    private void updateDrawableBounds(int p0, int p1) {}
    private void updateDrawableState() {}
    void drawTrack(android.graphics.Canvas p0) {}
    public void drawableHotspotChanged(float p0, float p1) {}
    protected void drawableStateChanged() {}
    protected void encodeProperties(android.view.ViewHierarchyEncoder p0) {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public android.graphics.drawable.Drawable getCurrentDrawable() { return null; }
    android.graphics.drawable.shapes.Shape getDrawableShape() { return null; }
    public android.graphics.drawable.Drawable getIndeterminateDrawable() { return null; }
    public android.graphics.BlendMode getIndeterminateTintBlendMode() { return null; }
    public android.content.res.ColorStateList getIndeterminateTintList() { return null; }
    public android.graphics.PorterDuff.Mode getIndeterminateTintMode() { return null; }
    public android.view.animation.Interpolator getInterpolator() { return null; }
    @android.view.ViewDebug.ExportedProperty(category="progress")
    public int getMax() { return 0; }
    public int getMaxHeight() { return 0; }
    public int getMaxWidth() { return 0; }
    @android.view.ViewDebug.ExportedProperty(category="progress")
    public int getMin() { return 0; }
    public int getMinHeight() { return 0; }
    public int getMinWidth() { return 0; }
    public boolean getMirrorForRtl() { return false; }
    @android.view.ViewDebug.ExportedProperty(category="progress")
    public int getProgress() { return 0; }
    public android.graphics.BlendMode getProgressBackgroundTintBlendMode() { return null; }
    public android.content.res.ColorStateList getProgressBackgroundTintList() { return null; }
    public android.graphics.PorterDuff.Mode getProgressBackgroundTintMode() { return null; }
    public android.graphics.drawable.Drawable getProgressDrawable() { return null; }
    public android.graphics.BlendMode getProgressTintBlendMode() { return null; }
    public android.content.res.ColorStateList getProgressTintList() { return null; }
    public android.graphics.PorterDuff.Mode getProgressTintMode() { return null; }
    @android.view.ViewDebug.ExportedProperty(category="progress")
    public int getSecondaryProgress() { return 0; }
    public android.graphics.BlendMode getSecondaryProgressTintBlendMode() { return null; }
    public android.content.res.ColorStateList getSecondaryProgressTintList() { return null; }
    public android.graphics.PorterDuff.Mode getSecondaryProgressTintMode() { return null; }
    public final void incrementProgressBy(int p0) {}
    public final void incrementSecondaryProgressBy(int p0) {}
    public void invalidateDrawable(android.graphics.drawable.Drawable p0) {}
    public boolean isAnimating() { return false; }
    @android.view.ViewDebug.ExportedProperty(category="progress")
    public boolean isIndeterminate() { return false; }
    public void jumpDrawablesToCurrentState() {}
    protected void onAttachedToWindow() {}
    protected void onDetachedFromWindow() {}
    protected void onDraw(android.graphics.Canvas p0) {}
    public void onInitializeAccessibilityEventInternal(android.view.accessibility.AccessibilityEvent p0) {}
    public void onInitializeAccessibilityNodeInfoInternal(android.view.accessibility.AccessibilityNodeInfo p0) {}
    protected void onMeasure(int p0, int p1) {}
    void onProgressRefresh(float p0, boolean p1, int p2) {}
    public void onResolveDrawables(int p0) {}
    public void onRestoreInstanceState(android.os.Parcelable p0) {}
    public android.os.Parcelable onSaveInstanceState() { return null; }
    protected void onSizeChanged(int p0, int p1, int p2, int p3) {}
    public void onVisibilityAggregated(boolean p0) {}
    void onVisualProgressChanged(int p0, float p1) {}
    public void postInvalidate() {}
    @android.view.RemotableViewMethod
    public void setIndeterminate(boolean p0) {}
    public void setIndeterminateDrawable(android.graphics.drawable.Drawable p0) {}
    public void setIndeterminateDrawableTiled(android.graphics.drawable.Drawable p0) {}
    @android.view.RemotableViewMethod
    public void setIndeterminateTintBlendMode(android.graphics.BlendMode p0) {}
    @android.view.RemotableViewMethod
    public void setIndeterminateTintList(android.content.res.ColorStateList p0) {}
    public void setIndeterminateTintMode(android.graphics.PorterDuff.Mode p0) {}
    public void setInterpolator(android.content.Context p0, int p1) {}
    public void setInterpolator(android.view.animation.Interpolator p0) {}
    @android.view.RemotableViewMethod
    public void setMax(int p0) {}
    public void setMaxHeight(int p0) {}
    public void setMaxWidth(int p0) {}
    @android.view.RemotableViewMethod
    public void setMin(int p0) {}
    public void setMinHeight(int p0) {}
    public void setMinWidth(int p0) {}
    @android.view.RemotableViewMethod
    public void setProgress(int p0) {}
    public void setProgress(int p0, boolean p1) {}
    @android.view.RemotableViewMethod
    public void setProgressBackgroundTintBlendMode(android.graphics.BlendMode p0) {}
    @android.view.RemotableViewMethod
    public void setProgressBackgroundTintList(android.content.res.ColorStateList p0) {}
    public void setProgressBackgroundTintMode(android.graphics.PorterDuff.Mode p0) {}
    public void setProgressDrawable(android.graphics.drawable.Drawable p0) {}
    public void setProgressDrawableTiled(android.graphics.drawable.Drawable p0) {}
    @android.view.RemotableViewMethod
    boolean setProgressInternal(int p0, boolean p1, boolean p2) { return false; }
    @android.view.RemotableViewMethod
    public void setProgressTintBlendMode(android.graphics.BlendMode p0) {}
    @android.view.RemotableViewMethod
    public void setProgressTintList(android.content.res.ColorStateList p0) {}
    public void setProgressTintMode(android.graphics.PorterDuff.Mode p0) {}
    @android.view.RemotableViewMethod
    public void setSecondaryProgress(int p0) {}
    @android.view.RemotableViewMethod
    public void setSecondaryProgressTintBlendMode(android.graphics.BlendMode p0) {}
    @android.view.RemotableViewMethod
    public void setSecondaryProgressTintList(android.content.res.ColorStateList p0) {}
    public void setSecondaryProgressTintMode(android.graphics.PorterDuff.Mode p0) {}
    @android.view.RemotableViewMethod
    public void setStateDescription(java.lang.CharSequence p0) {}
    void startAnimation() {}
    void stopAnimation() {}
    protected boolean verifyDrawable(android.graphics.drawable.Drawable p0) { return false; }

    private static class ProgressTintInfo {
        boolean mHasIndeterminateTint;
        boolean mHasIndeterminateTintMode;
        boolean mHasProgressBackgroundTint;
        boolean mHasProgressBackgroundTintMode;
        boolean mHasProgressTint;
        boolean mHasProgressTintMode;
        boolean mHasSecondaryProgressTint;
        boolean mHasSecondaryProgressTintMode;
        android.graphics.BlendMode mIndeterminateBlendMode;
        android.content.res.ColorStateList mIndeterminateTintList;
        android.graphics.BlendMode mProgressBackgroundBlendMode;
        android.content.res.ColorStateList mProgressBackgroundTintList;
        android.graphics.BlendMode mProgressBlendMode;
        android.content.res.ColorStateList mProgressTintList;
        android.graphics.BlendMode mSecondaryProgressBlendMode;
        android.content.res.ColorStateList mSecondaryProgressTintList;
        private ProgressTintInfo() {}
    }

    private static class RefreshData {
        private static final int POOL_MAX = 24;
        private static final android.util.Pools.SynchronizedPool<android.widget.ProgressBar.RefreshData> sPool = null;
        public boolean animate;
        public boolean fromUser;
        public int id;
        public int progress;
        private RefreshData() {}
        public static android.widget.ProgressBar.RefreshData obtain(int p0, int p1, boolean p2, boolean p3) { return null; }
        public void recycle() {}
    }

    private class RefreshProgressRunnable implements java.lang.Runnable {
        private RefreshProgressRunnable(android.widget.ProgressBar p0) {}
        public void run() {}
    }

    static class SavedState extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<android.widget.ProgressBar.SavedState> CREATOR = null;
        int progress;
        int secondaryProgress;
        private SavedState(android.os.Parcel p0) { super((android.os.Parcel)null); }
        SavedState(android.os.Parcelable p0) { super((android.os.Parcel)null); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.widget.ProgressBar> {
        private int mIndeterminateDrawableId;
        private int mIndeterminateId;
        private int mIndeterminateTintBlendModeId;
        private int mIndeterminateTintId;
        private int mIndeterminateTintModeId;
        private int mInterpolatorId;
        private int mMaxId;
        private int mMinId;
        private int mMirrorForRtlId;
        private int mProgressBackgroundTintBlendModeId;
        private int mProgressBackgroundTintId;
        private int mProgressBackgroundTintModeId;
        private int mProgressDrawableId;
        private int mProgressId;
        private int mProgressTintBlendModeId;
        private int mProgressTintId;
        private int mProgressTintModeId;
        private boolean mPropertiesMapped;
        private int mSecondaryProgressId;
        private int mSecondaryProgressTintBlendModeId;
        private int mSecondaryProgressTintId;
        private int mSecondaryProgressTintModeId;
        public InspectionCompanion() {}
        public void mapProperties(android.view.inspector.PropertyMapper p0) {}
        public void readProperties(android.widget.ProgressBar p0, android.view.inspector.PropertyReader p1) {}
    }
}
