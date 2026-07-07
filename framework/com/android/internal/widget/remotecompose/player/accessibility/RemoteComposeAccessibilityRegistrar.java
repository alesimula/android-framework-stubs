package com.android.internal.widget.remotecompose.player.accessibility;

public interface RemoteComposeAccessibilityRegistrar {
    public void clearAccessibilityDelegate(android.view.View p0);
    public boolean dispatchHoverEvent(android.view.View p0, android.view.MotionEvent p1);
    public boolean dispatchKeyEvent(android.view.View p0, android.view.KeyEvent p1);
    public void onFocusChanged(android.view.View p0, boolean p1, int p2, android.graphics.Rect p3);
    public void setAccessibilityDelegate(android.view.View p0, com.android.internal.widget.remotecompose.core.CoreDocument p1);
}
