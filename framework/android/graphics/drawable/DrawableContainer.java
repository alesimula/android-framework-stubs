package android.graphics.drawable;

public class DrawableContainer extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable.Callback {
    private static final boolean DEBUG = false;
    private static final boolean DEFAULT_DITHER = true;
    private static final java.lang.String TAG = "DrawableContainer";
    private int mAlpha;
    private java.lang.Runnable mAnimationRunnable;
    private android.graphics.drawable.DrawableContainer.BlockInvalidateCallback mBlockInvalidateCallback;
    private int mCurIndex;
    private android.graphics.drawable.Drawable mCurrDrawable;
    private android.graphics.drawable.DrawableContainer.DrawableContainerState mDrawableContainerState;
    private long mEnterAnimationEnd;
    private long mExitAnimationEnd;
    private boolean mHasAlpha;
    private android.graphics.Rect mHotspotBounds;
    private android.graphics.drawable.Drawable mLastDrawable;
    private int mLastIndex;
    private boolean mMutated;
    public DrawableContainer() { super(); }
    private void initializeDrawableForDisplay(android.graphics.drawable.Drawable p0) {}
    private boolean needsMirroring() { return false; }
    void animate(boolean p0) {}
    public void applyTheme(android.content.res.Resources.Theme p0) {}
    public boolean canApplyTheme() { return false; }
    public void clearMutated() {}
    android.graphics.drawable.DrawableContainer.DrawableContainerState cloneConstantState() { return null; }
    public void draw(android.graphics.Canvas p0) {}
    public int getAlpha() { return 0; }
    public int getChangingConfigurations() { return 0; }
    public android.graphics.drawable.Drawable.ConstantState getConstantState() { return null; }
    public android.graphics.drawable.Drawable getCurrent() { return null; }
    public int getCurrentIndex() { return 0; }
    public void getHotspotBounds(android.graphics.Rect p0) {}
    public int getIntrinsicHeight() { return 0; }
    public int getIntrinsicWidth() { return 0; }
    public int getMinimumHeight() { return 0; }
    public int getMinimumWidth() { return 0; }
    public int getOpacity() { return 0; }
    public android.graphics.Insets getOpticalInsets() { return null; }
    public void getOutline(android.graphics.Outline p0) {}
    public boolean getPadding(android.graphics.Rect p0) { return false; }
    public boolean hasFocusStateSpecified() { return false; }
    public void invalidateDrawable(android.graphics.drawable.Drawable p0) {}
    public boolean isAutoMirrored() { return false; }
    public boolean isStateful() { return false; }
    public void jumpToCurrentState() {}
    public android.graphics.drawable.Drawable mutate() { return null; }
    protected void onBoundsChange(android.graphics.Rect p0) {}
    public boolean onLayoutDirectionChanged(int p0) { return false; }
    protected boolean onLevelChange(int p0) { return false; }
    protected boolean onStateChange(int[] p0) { return false; }
    public void scheduleDrawable(android.graphics.drawable.Drawable p0, java.lang.Runnable p1, long p2) {}
    public boolean selectDrawable(int p0) { return false; }
    public void setAlpha(int p0) {}
    public void setAutoMirrored(boolean p0) {}
    public void setColorFilter(android.graphics.ColorFilter p0) {}
    protected void setConstantState(android.graphics.drawable.DrawableContainer.DrawableContainerState p0) {}
    public void setCurrentIndex(int p0) {}
    public void setDither(boolean p0) {}
    public void setEnterFadeDuration(int p0) {}
    public void setExitFadeDuration(int p0) {}
    public void setHotspot(float p0, float p1) {}
    public void setHotspotBounds(int p0, int p1, int p2, int p3) {}
    public void setTintBlendMode(android.graphics.BlendMode p0) {}
    public void setTintList(android.content.res.ColorStateList p0) {}
    public boolean setVisible(boolean p0, boolean p1) { return false; }
    public void unscheduleDrawable(android.graphics.drawable.Drawable p0, java.lang.Runnable p1) {}
    protected final void updateDensity(android.content.res.Resources p0) {}

    private static class BlockInvalidateCallback implements android.graphics.drawable.Drawable.Callback {
        private android.graphics.drawable.Drawable.Callback mCallback;
        private BlockInvalidateCallback() {}
        public void invalidateDrawable(android.graphics.drawable.Drawable p0) {}
        public void scheduleDrawable(android.graphics.drawable.Drawable p0, java.lang.Runnable p1, long p2) {}
        public void unscheduleDrawable(android.graphics.drawable.Drawable p0, java.lang.Runnable p1) {}
        public android.graphics.drawable.Drawable.Callback unwrap() { return null; }
        public android.graphics.drawable.DrawableContainer.BlockInvalidateCallback wrap(android.graphics.drawable.Drawable.Callback p0) { return null; }
    }

    public static abstract class DrawableContainerState extends android.graphics.drawable.Drawable.ConstantState {
        boolean mAutoMirrored;
        android.graphics.BlendMode mBlendMode;
        boolean mCanConstantState;
        int mChangingConfigurations;
        boolean mCheckedConstantSize;
        boolean mCheckedConstantState;
        boolean mCheckedOpacity;
        boolean mCheckedPadding;
        boolean mCheckedStateful;
        int mChildrenChangingConfigurations;
        android.graphics.ColorFilter mColorFilter;
        int mConstantHeight;
        int mConstantMinimumHeight;
        int mConstantMinimumWidth;
        android.graphics.Rect mConstantPadding;
        boolean mConstantSize;
        int mConstantWidth;
        int mDensity;
        boolean mDither;
        android.util.SparseArray<android.graphics.drawable.Drawable.ConstantState> mDrawableFutures;
        android.graphics.drawable.Drawable[] mDrawables;
        int mEnterFadeDuration;
        int mExitFadeDuration;
        boolean mHasColorFilter;
        boolean mHasTintList;
        boolean mHasTintMode;
        int mLayoutDirection;
        boolean mMutated;
        int mNumChildren;
        int mOpacity;
        final android.graphics.drawable.DrawableContainer mOwner = null;
        android.content.res.Resources mSourceRes;
        boolean mStateful;
        android.content.res.ColorStateList mTintList;
        boolean mVariablePadding;
        protected DrawableContainerState(android.graphics.drawable.DrawableContainer.DrawableContainerState p0, android.graphics.drawable.DrawableContainer p1, android.content.res.Resources p2) { super(); }
        private void createAllFutures() {}
        private void mutate() {}
        private android.graphics.drawable.Drawable prepareDrawable(android.graphics.drawable.Drawable p0) { return null; }
        public final int addChild(android.graphics.drawable.Drawable p0) { return 0; }
        final void applyTheme(android.content.res.Resources.Theme p0) {}
        public boolean canApplyTheme() { return false; }
        public boolean canConstantState() { return false; }
        final void clearMutated() {}
        protected void computeConstantSize() {}
        final int getCapacity() { return 0; }
        public int getChangingConfigurations() { return 0; }
        public final android.graphics.drawable.Drawable getChild(int p0) { return null; }
        public final int getChildCount() { return 0; }
        public final android.graphics.drawable.Drawable[] getChildren() { return null; }
        public final int getConstantHeight() { return 0; }
        public final int getConstantMinimumHeight() { return 0; }
        public final int getConstantMinimumWidth() { return 0; }
        public final android.graphics.Rect getConstantPadding() { return null; }
        public final int getConstantWidth() { return 0; }
        public final int getEnterFadeDuration() { return 0; }
        public final int getExitFadeDuration() { return 0; }
        public final int getOpacity() { return 0; }
        public void growArray(int p0, int p1) {}
        void invalidateCache() {}
        public final boolean isConstantSize() { return false; }
        public final boolean isStateful() { return false; }
        public final void setConstantSize(boolean p0) {}
        public final void setEnterFadeDuration(int p0) {}
        public final void setExitFadeDuration(int p0) {}
        final boolean setLayoutDirection(int p0, int p1) { return false; }
        public final void setVariablePadding(boolean p0) {}
        final void updateDensity(android.content.res.Resources p0) {}
    }
}
