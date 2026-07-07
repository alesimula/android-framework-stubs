package com.android.internal.view;

public interface RootViewSurfaceTaker {
    public void onRootViewScrollYChanged(int p0);
    public android.view.PendingInsetsController providePendingInsetsController();
    public void setSurfaceFormat(int p0);
    public void setSurfaceKeepScreenOn(boolean p0);
    public void setSurfaceType(int p0);
    public android.view.InputQueue.Callback willYouTakeTheInputQueue();
    public android.view.SurfaceHolder.Callback2 willYouTakeTheSurface();
}
