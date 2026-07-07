package android.window;

public final class SplashScreenView extends android.widget.FrameLayout {
    private static final boolean DEBUG = Boolean.valueOf(false);
    private static final java.lang.String TAG = null;
    private android.view.View mBrandingImageView;
    private android.os.RemoteCallback mClientCallback;
    private boolean mHasRemoved;
    private java.time.Duration mIconAnimationDuration;
    private java.time.Instant mIconAnimationStart;
    private android.view.View mIconView;
    private int mInitBackgroundColor;
    private boolean mIsCopied;
    private boolean mNotCopyable;
    private android.graphics.Bitmap mParceledBrandingBitmap;
    private android.graphics.Bitmap mParceledIconBackgroundBitmap;
    private android.graphics.Bitmap mParceledIconBitmap;
    private android.view.SurfaceControlViewHost mSurfaceHost;
    private android.view.SurfaceControlViewHost.SurfacePackage mSurfacePackage;
    private android.view.SurfaceControlViewHost.SurfacePackage mSurfacePackageCopy;
    private android.view.SurfaceView mSurfaceView;
    private final int[] mTmpPos = null;
    private final android.graphics.Rect mTmpRect = null;
    private android.view.Window mWindow;
    public SplashScreenView(android.content.Context p0) { super((android.content.Context)null); }
    public SplashScreenView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    private void animationStartCallback(long p0) {}
    private void releaseAnimationSurfaceHost() {}
    public static void releaseIconHost(android.view.SurfaceControlViewHost p0) {}
    public void attachHostWindow(android.view.Window p0) {}
    public android.view.View getBrandingView() { return null; }
    public java.time.Duration getIconAnimationDuration() { return null; }
    public java.time.Instant getIconAnimationStart() { return null; }
    public android.view.View getIconView() { return null; }
    public int getInitBackgroundColor() { return 0; }
    public android.view.SurfaceControlViewHost getSurfaceHost() { return null; }
    void initIconAnimation(android.graphics.drawable.Drawable p0) {}
    public boolean isCopyable() { return false; }
    public void onCopied() {}
    protected void onDetachedFromWindow() {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    public void remove() {}
    public void setAlpha(float p0) {}
    public void setNotCopyable() {}
    public void syncTransferSurfaceOnDraw() {}

    public static class Builder {
        static final boolean $assertionsDisabled = false;
        private boolean mAllowHandleSolidColor;
        private int mBackgroundColor;
        private android.graphics.drawable.Drawable mBrandingDrawable;
        private int mBrandingImageHeight;
        private int mBrandingImageWidth;
        private android.os.RemoteCallback mClientCallback;
        private final android.content.Context mContext = null;
        private java.time.Duration mIconAnimationDuration;
        private java.time.Instant mIconAnimationStart;
        private android.graphics.drawable.Drawable mIconBackground;
        private android.graphics.drawable.Drawable mIconDrawable;
        private int mIconSize;
        private android.graphics.drawable.Drawable mOverlayDrawable;
        private android.graphics.Bitmap mParceledBrandingBitmap;
        private android.graphics.Bitmap mParceledIconBackgroundBitmap;
        private android.graphics.Bitmap mParceledIconBitmap;
        private android.view.SurfaceControlViewHost.SurfacePackage mSurfacePackage;
        private java.util.function.Consumer<java.lang.Runnable> mUiThreadInitTask;
        public Builder(android.content.Context p0) {}
        private android.view.SurfaceView createSurfaceView(android.window.SplashScreenView p0) { return null; }
        public android.window.SplashScreenView build() { return null; }
        public android.window.SplashScreenView.Builder createFromParcel(android.window.SplashScreenView.SplashScreenViewParcelable p0) { return null; }
        public android.window.SplashScreenView.Builder setAllowHandleSolidColor(boolean p0) { return null; }
        public android.window.SplashScreenView.Builder setBackgroundColor(int p0) { return null; }
        public android.window.SplashScreenView.Builder setBrandingDrawable(android.graphics.drawable.Drawable p0, int p1, int p2) { return null; }
        public android.window.SplashScreenView.Builder setCenterViewDrawable(android.graphics.drawable.Drawable p0) { return null; }
        public android.window.SplashScreenView.Builder setIconBackground(android.graphics.drawable.Drawable p0) { return null; }
        public android.window.SplashScreenView.Builder setIconSize(int p0) { return null; }
        public android.window.SplashScreenView.Builder setOverlayDrawable(android.graphics.drawable.Drawable p0) { return null; }
        public android.window.SplashScreenView.Builder setUiThreadInitConsumer(java.util.function.Consumer<java.lang.Runnable> p0) { return null; }
    }

    public static interface IconAnimateListener {
        public void prepareAnimate(java.util.function.LongConsumer p0);
        default public void setAnimationJankMonitoring(android.animation.AnimatorListenerAdapter p0) {}
        public void stopAnimation();
    }

    public static class SplashScreenViewParcelable implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.window.SplashScreenView.SplashScreenViewParcelable> CREATOR = null;
        private int mBackgroundColor;
        private android.graphics.Bitmap mBrandingBitmap;
        private int mBrandingHeight;
        private int mBrandingWidth;
        private android.os.RemoteCallback mClientCallback;
        private long mIconAnimationDurationMillis;
        private long mIconAnimationStartMillis;
        private android.graphics.Bitmap mIconBackground;
        private android.graphics.Bitmap mIconBitmap;
        private int mIconSize;
        private android.view.SurfaceControlViewHost.SurfacePackage mSurfacePackage;
        private SplashScreenViewParcelable(android.os.Parcel p0) {}
        public SplashScreenViewParcelable(android.window.SplashScreenView p0) {}
        private android.graphics.Bitmap copyDrawable(android.graphics.drawable.Drawable p0) { return null; }
        private android.graphics.Bitmap copyDrawableWithSize(android.graphics.drawable.Drawable p0, int p1, int p2) { return null; }
        private void readParcel(android.os.Parcel p0) {}
        public void clearIfNeeded() {}
        public int describeContents() { return 0; }
        int getBackgroundColor() { return 0; }
        int getIconSize() { return 0; }
        public void setClientCallback(android.os.RemoteCallback p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
