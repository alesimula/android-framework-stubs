package android.graphics.drawable;

public class AnimatedImageDrawable extends android.graphics.drawable.Drawable implements android.graphics.drawable.Animatable2 {
    private static final int FINISHED = -1;
    @java.lang.Deprecated
    public static final int LOOP_INFINITE = -1;
    public static final int REPEAT_INFINITE = -1;
    private static final int REPEAT_UNDEFINED = -2;
    private java.util.ArrayList<android.graphics.drawable.Animatable2.AnimationCallback> mAnimationCallbacks;
    private android.graphics.ColorFilter mColorFilter;
    private android.os.Handler mHandler;
    private int mIntrinsicHeight;
    private int mIntrinsicWidth;
    private java.lang.Runnable mRunnable;
    private boolean mStarting;
    private android.graphics.drawable.AnimatedImageDrawable.State mState;
    public AnimatedImageDrawable() { super(); }
    public AnimatedImageDrawable(long p0, android.graphics.ImageDecoder p1, int p2, int p3, long p4, boolean p5, int p6, int p7, android.graphics.Rect p8, java.io.InputStream p9, android.content.res.AssetFileDescriptor p10) throws java.io.IOException { super(); }
    private static void callOnAnimationEnd(java.lang.ref.WeakReference<android.graphics.drawable.AnimatedImageDrawable> p0) {}
    private static void callOnFrameRateHint(java.lang.ref.WeakReference<android.graphics.drawable.AnimatedImageDrawable> p0, float p1) {}
    private android.os.Handler getHandler() { return null; }
    private static native long nCreate(long p0, android.graphics.ImageDecoder p1, int p2, int p3, long p4, boolean p5, android.graphics.Rect p6) throws java.io.IOException;
    private static native long nDraw(long p0, long p1);
    private static native int nGetAlpha(long p0);
    private static native boolean nGetFilterBitmap(long p0);
    private static native long nGetNativeFinalizer();
    private static native int nGetRepeatCount(long p0);
    private static native boolean nIsRunning(long p0);
    private static native long nNativeByteSize(long p0);
    private static native void nSetAlpha(long p0, int p1);
    private static native void nSetBounds(long p0, android.graphics.Rect p1);
    private static native void nSetColorFilter(long p0, long p1);
    private static native boolean nSetFilterBitmap(long p0, boolean p1);
    private static native void nSetMirrored(long p0, boolean p1);
    private static native void nSetOnAnimationEndListener(long p0, java.lang.ref.WeakReference<android.graphics.drawable.AnimatedImageDrawable> p1);
    private static native void nSetOnFrameRateHintListener(long p0, java.lang.ref.WeakReference<android.graphics.drawable.AnimatedImageDrawable> p1);
    private static native void nSetRepeatCount(long p0, int p1);
    private static native boolean nStart(long p0);
    private static native boolean nStop(long p0);
    private void onAnimationEnd() {}
    private void postOnAnimationEnd() {}
    private void postOnAnimationStart() {}
    private void updateStateFromTypedArray(android.content.res.TypedArray p0, int p1) throws org.xmlpull.v1.XmlPullParserException {}
    public void clearAnimationCallbacks() {}
    public void draw(android.graphics.Canvas p0) {}
    public int getAlpha() { return 0; }
    public android.graphics.ColorFilter getColorFilter() { return null; }
    public int getIntrinsicHeight() { return 0; }
    public int getIntrinsicWidth() { return 0; }
    @java.lang.Deprecated
    public int getLoopCount(int p0) { return 0; }
    public int getOpacity() { return 0; }
    public int getRepeatCount() { return 0; }
    public void inflate(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public final boolean isAutoMirrored() { return false; }
    public boolean isFilterBitmap() { return false; }
    public boolean isRunning() { return false; }
    protected void onBoundsChange(android.graphics.Rect p0) {}
    public boolean onLayoutDirectionChanged(int p0) { return false; }
    public void registerAnimationCallback(android.graphics.drawable.Animatable2.AnimationCallback p0) {}
    public void setAlpha(int p0) {}
    public void setAutoMirrored(boolean p0) {}
    public void setColorFilter(android.graphics.ColorFilter p0) {}
    public void setFilterBitmap(boolean p0) {}
    @java.lang.Deprecated
    public void setLoopCount(int p0) {}
    public void setRepeatCount(int p0) {}
    public void start() {}
    public void stop() {}
    public boolean unregisterAnimationCallback(android.graphics.drawable.Animatable2.AnimationCallback p0) { return false; }

    private class State {
        private final android.content.res.AssetFileDescriptor mAssetFd = null;
        boolean mAutoMirrored;
        private final java.io.InputStream mInputStream = null;
        final long mNativePtr = 0L;
        int mRepeatCount;
        int[] mThemeAttrs;
        State(android.graphics.drawable.AnimatedImageDrawable p0, long p1, java.io.InputStream p2, android.content.res.AssetFileDescriptor p3) {}
    }
}
