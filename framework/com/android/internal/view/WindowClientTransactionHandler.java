package com.android.internal.view;

public abstract class WindowClientTransactionHandler extends android.view.IWindow.Stub {
    public WindowClientTransactionHandler() { super(); }
    public android.os.Handler getHandler() { return null; }
    public void handleInsetsControlChanged() {}
    public void handleResized() {}
    @java.lang.Deprecated
    public void onExecutingWindowStateTransactionItem() {}
    public void updatePendingInsetsControls(android.view.InsetsState p0, android.view.InsetsSourceControl.Array p1) {}
    public void updatePendingResize(android.view.WindowRelayoutResult p0, boolean p1, boolean p2, int p3, boolean p4, boolean p5) {}
}
