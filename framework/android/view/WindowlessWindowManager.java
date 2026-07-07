package android.view;

public class WindowlessWindowManager implements android.view.IWindowSession {
    private static final java.lang.String TAG = "WindowlessWindowManager";
    private final android.content.res.Configuration mConfiguration = null;
    private android.window.InputTransferToken mHostInputTransferToken;
    private final android.window.InputTransferToken mInputTransferToken = null;
    private android.view.InsetsState mInsetsState;
    private final android.view.WindowlessWindowLayout mLayout = null;
    private android.view.ISurfaceControlViewHostParent mParentInterface;
    private final android.view.IWindowSession mRealWm = null;
    final android.util.SparseArray<android.view.WindowlessWindowManager.ResizeCompleteCallback> mResizeCompletionForWindow = null;
    protected final android.view.SurfaceControl mRootSurface = null;
    final java.util.HashMap<android.os.IBinder, android.view.WindowlessWindowManager.State> mStateForWindow = null;
    private final android.util.MergedConfiguration mTmpConfig = null;
    private final android.window.ClientWindowFrames mTmpFrames = null;
    public WindowlessWindowManager(android.content.res.Configuration p0, android.view.SurfaceControl p1, android.window.InputTransferToken p2) {}
    private void clearLastReportedParams() {}
    private void dispatchStateToClients() {}
    private int getKeyOfResizeCompletionForWindow(android.view.IWindow p0, int p1) { return 0; }
    private boolean isInTouchModeInternal(int p0) { return false; }
    private boolean isOpaque(android.view.WindowManager.LayoutParams p0) { return false; }
    private int relayoutInner(android.view.IWindow p0, android.view.WindowManager.LayoutParams p1, int p2, int p3, int p4, int p5, int p6, int p7, android.window.ClientWindowFrames p8, android.util.MergedConfiguration p9, android.view.SurfaceControl p10, android.view.InsetsState p11, android.view.InsetsSourceControl.Array p12) { return 0; }
    private void sendLayoutParamsToParent() {}
    public void addSharedAnimationProvider(android.view.IWindow p0, android.window.sharedsurface.ISharedAnimationProvider p1, android.window.sharedsurface.SharedAnimationParams p2, java.util.List<android.window.sharedsurface.SharedAnimationFilter> p3) {}
    public int addToDisplay(android.view.IWindow p0, android.view.WindowManager.LayoutParams p1, int p2, int p3, int p4, android.view.InputChannel p5, android.view.WindowRelayoutResult p6) { return 0; }
    public int addToDisplayAsUser(android.view.IWindow p0, android.view.WindowManager.LayoutParams p1, int p2, int p3, int p4, int p5, android.view.InputChannel p6, android.view.WindowRelayoutResult p7) { return 0; }
    public android.os.IBinder asBinder() { return null; }
    public void cancelDragAndDrop(android.os.IBinder p0, boolean p1) {}
    public boolean cancelDraw(android.view.IWindow p0, int p1) { return false; }
    public void clearTouchableRegion(android.view.IWindow p0) {}
    public void dragRecipientEntered(android.view.IWindow p0) {}
    public void dragRecipientExited(android.view.IWindow p0) {}
    public boolean dropForAccessibility(android.view.IWindow p0, int p1, int p2) { return false; }
    public void finishDrawing(android.view.IWindow p0, android.view.SurfaceControl.Transaction p1, int p2) {}
    public void finishMovingTask(android.view.IWindow p0) {}
    boolean forwardBackKeyToParent(android.view.KeyEvent p0) { return false; }
    public void generateDisplayHash(android.view.IWindow p0, android.graphics.Rect p1, java.lang.String p2, android.os.RemoteCallback p3) {}
    android.window.InputTransferToken getHostInputTransferToken() { return null; }
    android.window.InputTransferToken getInputTransferToken(android.os.IBinder p0) { return null; }
    protected android.view.SurfaceControl getParentSurface(android.view.IWindow p0, android.view.WindowManager.LayoutParams p1) { return null; }
    protected android.view.SurfaceControl getSurfaceControl(android.view.IWindow p0) { return null; }
    protected android.view.SurfaceControl getSurfaceControl(android.view.View p0) { return null; }
    protected android.os.IBinder getWindowBinder(android.view.View p0) { return null; }
    public android.view.IWindowId getWindowId(android.os.IBinder p0) { return null; }
    public void grantEmbeddedWindowFocus(android.view.IWindow p0, android.window.InputTransferToken p1, boolean p2) {}
    public android.view.InputChannel grantInputChannel(android.view.WindowInputChannelParams p0) { return null; }
    public boolean moveFocusToAdjacentWindow(android.view.IWindow p0, int p1) { return false; }
    public void notifyImeWindowVisibilityChangedFromClient(android.view.IWindow p0, boolean p1, android.view.inputmethod.ImeTracker.Token p2) {}
    public void onRectangleOnScreenRequested(android.os.IBinder p0, android.graphics.Rect p1, int p2) {}
    public boolean outOfMemory(android.view.IWindow p0) { return false; }
    public android.os.IBinder performDrag(android.view.IWindow p0, int p1, android.view.SurfaceControl p2, int p3, int p4, int p5, int p6, float p7, float p8, float p9, float p10, android.content.ClipData p11) { return null; }
    public void pokeDrawLock(android.os.IBinder p0) {}
    public boolean prepareFrame(android.view.IWindow p0, int p1) { return false; }
    public int relayout(android.view.IWindow p0, android.view.WindowManager.LayoutParams p1, int p2, int p3, int p4, int p5, int p6, int p7, android.view.SurfaceControl p8, android.view.WindowRelayoutResult p9) { return 0; }
    public void relayoutAsync(android.view.IWindow p0, android.view.WindowManager.LayoutParams p1, int p2, int p3, int p4, int p5, int p6, int p7, android.view.SurfaceControl p8) {}
    public void remove(android.os.IBinder p0) throws android.os.RemoteException {}
    public void removeSharedAnimationProvider(android.window.sharedsurface.ISharedAnimationProvider p0) {}
    protected void removeSurface(android.view.SurfaceControl p0) {}
    public void reportDecorViewGestureInterceptionChanged(android.view.IWindow p0, boolean p1) {}
    public void reportDropResult(android.view.IWindow p0, boolean p1) {}
    public void reportKeepClearAreasChanged(android.view.IWindow p0, java.util.List<android.graphics.Rect> p1, java.util.List<android.graphics.Rect> p2) {}
    public void reportSystemGestureExclusionChanged(android.view.IWindow p0, java.util.List<android.graphics.Rect> p1) {}
    boolean requestInputFocus(android.view.ViewRootImpl p0, boolean p1) { return false; }
    public void sendWallpaperCommand(android.os.IBinder p0, java.lang.String p1, int p2, int p3, int p4, android.os.Bundle p5) {}
    public void setAssociatedWindowContainer(android.os.IBinder p0, android.window.WindowContainerToken p1) {}
    void setCompletionCallback(android.view.ViewRootImpl p0, android.view.WindowlessWindowManager.ResizeCompleteCallback p1) {}
    public void setConfiguration(android.content.res.Configuration p0) {}
    void setHostInputTransferToken(android.window.InputTransferToken p0) {}
    public void setInsets(android.view.IWindow p0, int p1, android.graphics.Rect p2, android.graphics.Rect p3, android.graphics.Region p4) {}
    public void setInsetsState(android.view.InsetsState p0) {}
    public void setOnBackInvokedCallbackInfo(android.view.IWindow p0, android.window.OnBackInvokedCallbackInfo p1) throws android.os.RemoteException {}
    public void setOnBackInvokedCallbackInfoToEmbedded(android.window.InputTransferToken p0, android.window.OnBackInvokedCallbackInfo p1) throws android.os.RemoteException {}
    void setParentInterface(android.view.ISurfaceControlViewHostParent p0) {}
    public void setShouldZoomOutWallpaper(android.os.IBinder p0, boolean p1) {}
    protected void setTouchRegion(android.os.IBinder p0, android.graphics.Region p1) {}
    public void setWallpaperDisplayOffset(android.os.IBinder p0, int p1, int p2) {}
    public void setWallpaperPosition(android.os.IBinder p0, float p1, float p2, float p3, float p4) {}
    public void setWallpaperZoomOut(android.os.IBinder p0, float p1) {}
    public boolean startMovingTask(android.view.IWindow p0, float p1, float p2) { return false; }
    public void updateAnimatingTypes(android.view.IWindow p0, int p1, android.view.inputmethod.ImeTracker.Token p2) {}
    protected void updateInputChannel(android.os.IBinder p0) {}
    public void updateInputChannel(android.view.WindowInputChannelParams p0) {}
    public void updateRequestedVisibleTypes(android.view.IWindow p0, int p1, android.view.inputmethod.ImeTracker.Token p2) throws android.os.RemoteException {}
    public void updateSharedAnimationFilters(android.window.sharedsurface.ISharedAnimationProvider p0, java.util.List<android.window.sharedsurface.SharedAnimationFilter> p1) {}
    public void updateSharedAnimationParams(android.window.sharedsurface.ISharedAnimationProvider p0, android.window.sharedsurface.SharedAnimationParams p1) {}
    public void updateTapExcludeRegion(android.view.IWindow p0, android.graphics.Region p1) {}

    public static interface ResizeCompleteCallback {
        public void finished(android.view.SurfaceControl.Transaction p0);
    }

    private class State {
        android.window.WindowContainerToken mAssociatedWindowContainer;
        android.graphics.Rect mAttachedFrame;
        android.view.IWindow mClient;
        int mDisplayId;
        android.graphics.Rect mFrame;
        android.os.IBinder mInputChannelToken;
        android.graphics.Region mInputRegion;
        android.window.InputTransferToken mInputTransferToken;
        final android.view.WindowManager.LayoutParams mLastReportedParams = null;
        android.view.SurfaceControl mLeash;
        final android.view.WindowManager.LayoutParams mParams = null;
        android.view.SurfaceControl mSurfaceControl;
        State(android.view.WindowlessWindowManager p0, android.view.SurfaceControl p1, android.view.WindowManager.LayoutParams p2, int p3, android.view.IWindow p4, android.view.SurfaceControl p5, android.graphics.Rect p6) {}
    }
}
