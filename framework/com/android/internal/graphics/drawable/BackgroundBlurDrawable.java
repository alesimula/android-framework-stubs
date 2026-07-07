package com.android.internal.graphics.drawable;

public final class BackgroundBlurDrawable extends android.graphics.drawable.Drawable {
    private static final boolean DEBUG = Boolean.valueOf(false);
    private static final java.lang.String TAG = null;
    private final com.android.internal.graphics.drawable.BackgroundBlurDrawable.Aggregator mAggregator = null;
    private int mAlpha;
    private int mBlurRadius;
    private float mCornerRadiusBLX;
    private float mCornerRadiusBLY;
    private float mCornerRadiusBRX;
    private float mCornerRadiusBRY;
    private float mCornerRadiusTLX;
    private float mCornerRadiusTLY;
    private float mCornerRadiusTRX;
    private float mCornerRadiusTRY;
    private final android.graphics.Paint mPaint = null;
    public final android.graphics.RenderNode.PositionUpdateListener mPositionUpdateListener = null;
    private final android.graphics.Rect mRect = null;
    private final android.graphics.Path mRectPath = null;
    private final android.graphics.RenderNode mRenderNode = null;
    private final float[] mTmpRadii = null;
    private boolean mVisible;
    private BackgroundBlurDrawable(com.android.internal.graphics.drawable.BackgroundBlurDrawable.Aggregator p0) { super(); }
    private void updatePath() {}
    public void draw(android.graphics.Canvas p0) {}
    public int getAlpha() { return 0; }
    public int getOpacity() { return 0; }
    public void setAlpha(int p0) {}
    public void setBlurRadius(int p0) {}
    public void setBounds(int p0, int p1, int p2, int p3) {}
    public void setColor(int p0) {}
    public void setColorFilter(android.graphics.ColorFilter p0) {}
    public void setCornerRadius(float p0) {}
    public void setCornerRadius(float p0, float p1, float p2, float p3) {}
    public void setCornerRadius(float p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7) {}
    public boolean setVisible(boolean p0, boolean p1) { return false; }
    public void setXfermode(android.graphics.Xfermode p0) {}
    public java.lang.String toString() { return null; }

    public static final class Aggregator {
        private final android.util.ArraySet<com.android.internal.graphics.drawable.BackgroundBlurDrawable> mDrawables = null;
        private final android.util.LongSparseArray<android.util.ArraySet<java.lang.Runnable>> mFrameRtUpdates = null;
        private boolean mHasUiUpdates;
        private com.android.internal.graphics.drawable.BackgroundBlurDrawable.BlurRegion[] mLastFrameBlurRegions;
        private long mLastFrameNumber;
        private android.view.ViewTreeObserver.OnPreDrawListener mOnPreDrawListener;
        private final java.lang.Object mRtLock = null;
        private com.android.internal.graphics.drawable.BackgroundBlurDrawable.BlurRegion[] mTmpBlurRegionsForFrame;
        private final android.view.ViewRootImpl mViewRoot = null;
        public Aggregator(android.view.ViewRootImpl p0) {}
        private void handleDispatchBlurTransactionLocked(long p0, com.android.internal.graphics.drawable.BackgroundBlurDrawable.BlurRegion[] p1, boolean p2) {}
        private void registerPreDrawListener() {}
        public com.android.internal.graphics.drawable.BackgroundBlurDrawable createBackgroundBlurDrawable(android.content.Context p0) { return null; }
        public com.android.internal.graphics.drawable.BackgroundBlurDrawable.BlurRegion[] getBlurRegionsCopyForRT() { return null; }
        public float[][] getBlurRegionsForFrameLocked(long p0, com.android.internal.graphics.drawable.BackgroundBlurDrawable.BlurRegion[] p1, boolean p2) { return null; }
        public boolean hasRegions() { return false; }
        public boolean hasUpdates() { return false; }
        void onBlurDrawableUpdated(com.android.internal.graphics.drawable.BackgroundBlurDrawable p0) {}
        void onRenderNodePositionChanged(long p0, java.lang.Runnable p1) {}
    }

    public static final class BlurRegion {
        public final float alpha = 0.0f;
        public final int blurRadius = 0;
        public final float cornerRadiusBLX = 0.0f;
        public final float cornerRadiusBLY = 0.0f;
        public final float cornerRadiusBRX = 0.0f;
        public final float cornerRadiusBRY = 0.0f;
        public final float cornerRadiusTLX = 0.0f;
        public final float cornerRadiusTLY = 0.0f;
        public final float cornerRadiusTRX = 0.0f;
        public final float cornerRadiusTRY = 0.0f;
        public final android.graphics.Rect rect = null;
        BlurRegion(com.android.internal.graphics.drawable.BackgroundBlurDrawable p0) {}
        float[] toFloatArray() { return null; }
        public java.lang.String toString() { return null; }
    }
}
