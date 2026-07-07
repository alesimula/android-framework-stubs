package com.android.internal.widget.remotecompose.player.accessibility.platform;

public class PlatformRemoteComposeAccessibilityRegistrar implements com.android.internal.widget.remotecompose.player.accessibility.RemoteComposeAccessibilityRegistrar {
    public PlatformRemoteComposeAccessibilityRegistrar() {}
    public void clearAccessibilityDelegate(android.view.View p0) {}
    public boolean dispatchHoverEvent(android.view.View p0, android.view.MotionEvent p1) { return false; }
    public boolean dispatchKeyEvent(android.view.View p0, android.view.KeyEvent p1) { return false; }
    public com.android.internal.widget.remotecompose.player.accessibility.platform.PlatformRemoteComposeTouchHelper forRemoteComposePlayer(android.view.View p0, com.android.internal.widget.remotecompose.core.CoreDocument p1) { return null; }
    public com.android.internal.widget.ExploreByTouchHelper getAccessibilityDelegate(android.view.View p0) { return null; }
    public void onFocusChanged(android.view.View p0, boolean p1, int p2, android.graphics.Rect p3) {}
    public void setAccessibilityDelegate(android.view.View p0, com.android.internal.widget.remotecompose.core.CoreDocument p1) {}
}
