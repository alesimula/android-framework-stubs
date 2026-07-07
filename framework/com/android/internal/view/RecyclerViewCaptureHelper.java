package com.android.internal.view;

public class RecyclerViewCaptureHelper implements com.android.internal.view.ScrollCaptureViewHelper<android.view.ViewGroup> {
    private static final java.lang.String TAG = "RVCaptureHelper";
    private int mOverScrollMode;
    private boolean mScrollBarWasEnabled;
    private int mScrollDelta;
    public RecyclerViewCaptureHelper() {}
    static android.view.View findChildNearestTarget(android.view.ViewGroup p0, android.graphics.Rect p1) { return null; }
    public boolean onAcceptSession(android.view.ViewGroup p0) { return false; }
    public void onPrepareForEnd(android.view.ViewGroup p0) {}
    public void onPrepareForStart(android.view.ViewGroup p0, android.graphics.Rect p1) {}
    public void onScrollRequested(android.view.ViewGroup p0, android.graphics.Rect p1, android.graphics.Rect p2, android.os.CancellationSignal p3, java.util.function.Consumer<com.android.internal.view.ScrollCaptureViewHelper.ScrollResult> p4) {}
}
