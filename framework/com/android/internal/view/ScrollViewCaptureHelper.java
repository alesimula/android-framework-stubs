package com.android.internal.view;

public class ScrollViewCaptureHelper implements com.android.internal.view.ScrollCaptureViewHelper<android.view.ViewGroup> {
    private int mOverScrollMode;
    private boolean mScrollBarEnabled;
    private int mStartScrollY;
    public ScrollViewCaptureHelper() {}
    public boolean onAcceptSession(android.view.ViewGroup p0) { return false; }
    public void onPrepareForEnd(android.view.ViewGroup p0) {}
    public void onPrepareForStart(android.view.ViewGroup p0, android.graphics.Rect p1) {}
    public void onScrollRequested(android.view.ViewGroup p0, android.graphics.Rect p1, android.graphics.Rect p2, android.os.CancellationSignal p3, java.util.function.Consumer<com.android.internal.view.ScrollCaptureViewHelper.ScrollResult> p4) {}
}
