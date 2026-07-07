package android.view;

public class SurfaceControlViewHost {
    private static final java.lang.String TAG = "SurfaceControlViewHost";
    private android.view.accessibility.IAccessibilityEmbeddedConnection mAccessibilityEmbeddedConnection;
    private android.view.ViewRootImpl.ConfigChangedCallback mConfigChangedCallback;
    private final boolean mOwnsSurfaceControl = false;
    private boolean mReleased;
    private android.view.ISurfaceControlViewHost mRemoteInterface;
    private android.view.SurfaceControl mSurfaceControl;
    private final android.view.ViewRootImpl mViewRoot = null;
    private final android.view.WindowlessWindowManager mWm = null;
    public SurfaceControlViewHost(android.content.Context p0, android.view.Display p1, android.os.IBinder p2) {}
    public SurfaceControlViewHost(android.content.Context p0, android.view.Display p1, android.view.WindowlessWindowManager p2, java.lang.String p3) {}
    public SurfaceControlViewHost(android.content.Context p0, android.view.Display p1, android.window.InputTransferToken p2) {}
    public SurfaceControlViewHost(android.content.Context p0, android.view.Display p1, android.window.InputTransferToken p2, java.lang.String p3) {}
    private void addWindowToken(android.view.WindowManager.LayoutParams p0) {}
    private void doRelease(boolean p0) {}
    private void setConfigCallback(android.content.Context p0, android.view.Display p1) {}
    protected void finalize() throws java.lang.Throwable {}
    public android.window.InputTransferToken getInputTransferToken() { return null; }
    public android.view.SurfaceControlViewHost.LayoutParams getLayoutParams() { return null; }
    public android.view.AttachedSurfaceControl getRootSurfaceControl() { return null; }
    public android.view.SurfaceControlViewHost.SurfacePackage getSurfacePackage() { return null; }
    public android.view.View getView() { return null; }
    public android.view.ViewRootImpl getViewRoot() { return null; }
    public android.view.IWindow getWindowToken() { return null; }
    public android.view.WindowlessWindowManager getWindowlessWM() { return null; }
    public void relayout(int p0, int p1) {}
    public void relayout(android.view.SurfaceControlViewHost.LayoutParams p0) {}
    public void relayout(android.view.WindowManager.LayoutParams p0) {}
    public void relayout(android.view.WindowManager.LayoutParams p0, android.view.WindowlessWindowManager.ResizeCompleteCallback p1) {}
    public void release() {}
    public boolean requestInputFocus(boolean p0) { return false; }
    public void setView(android.view.View p0, int p1, int p2) {}
    public void setView(android.view.View p0, android.view.SurfaceControlViewHost.LayoutParams p1) {}
    public void setView(android.view.View p0, android.view.WindowManager.LayoutParams p1) {}
    @java.lang.Deprecated
    public boolean transferTouchGestureToHost() { return false; }

    private final class ISurfaceControlViewHostImpl extends android.view.ISurfaceControlViewHost.Stub {
        private ISurfaceControlViewHostImpl(android.view.SurfaceControlViewHost p0) { super(); }
        public void attachParentInterface(android.view.ISurfaceControlViewHostParent p0) {}
        public android.window.ISurfaceSyncGroup getSurfaceSyncGroup() { return null; }
        public void onConfigurationChanged(android.content.res.Configuration p0) {}
        public void onDispatchAttachedToWindow(android.window.InputTransferToken p0) {}
        public void onDispatchDetachedFromWindow() {}
        public void onInsetsChanged(android.view.InsetsState p0, android.graphics.Rect p1) {}
    }

    public static class LayoutParams {
        private final boolean mFocusable = false;
        private final int mHeight = 0;
        private java.lang.String mTitle;
        private final int mWidth = 0;
        public LayoutParams(int p0, int p1, boolean p2) {}
        static android.view.SurfaceControlViewHost.LayoutParams from(android.view.WindowManager.LayoutParams p0) { return null; }
        public int getHeight() { return 0; }
        public java.lang.String getTitle() { return null; }
        public int getWidth() { return 0; }
        public boolean isFocusable() { return false; }
        public void setTitle(java.lang.String p0) {}
        public android.view.WindowManager.LayoutParams toWindowManagerLayoutParams() { return null; }
    }

    public static final class SurfacePackage implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.view.SurfaceControlViewHost.SurfacePackage> CREATOR = null;
        private final android.view.accessibility.IAccessibilityEmbeddedConnection mAccessibilityEmbeddedConnection = null;
        private final android.window.InputTransferToken mInputTransferToken = null;
        private final android.view.ISurfaceControlViewHost mRemoteInterface = null;
        private android.view.SurfaceControl mSurfaceControl;
        private SurfacePackage(android.os.Parcel p0) {}
        SurfacePackage(android.view.SurfaceControl p0, android.view.accessibility.IAccessibilityEmbeddedConnection p1, android.window.InputTransferToken p2, android.view.ISurfaceControlViewHost p3) {}
        public SurfacePackage(android.view.SurfaceControlViewHost.SurfacePackage p0) {}
        public int describeContents() { return 0; }
        public android.view.accessibility.IAccessibilityEmbeddedConnection getAccessibilityEmbeddedConnection() { return null; }
        public android.window.InputTransferToken getInputTransferToken() { return null; }
        public android.view.ISurfaceControlViewHost getRemoteInterface() { return null; }
        public android.view.SurfaceControl getSurfaceControl() { return null; }
        public void notifyConfigurationChanged(android.content.res.Configuration p0) {}
        public void notifyDetachedFromWindow() {}
        public void release() {}
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
