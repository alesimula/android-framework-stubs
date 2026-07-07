package com.android.internal.view;

public class SurfaceCallbackHelper {
    private static final int LOGTAG_SURFACEVIEW_CALLBACK = 60006;
    int mFinishDrawingCollected;
    int mFinishDrawingExpected;
    private java.lang.Runnable mFinishDrawingRunnable;
    java.lang.Runnable mRunnable;
    private boolean mSurfaceRedrawImplemented;
    private final java.lang.String mTag = null;
    public SurfaceCallbackHelper(java.lang.Runnable p0) {}
    public SurfaceCallbackHelper(java.lang.Runnable p0, java.lang.String p1) {}
    public void dispatchSurfaceRedrawNeededAsync(android.view.SurfaceHolder p0, android.view.SurfaceHolder.Callback[] p1) {}
}
