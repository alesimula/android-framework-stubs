package android.app;

public final class UiAutomationConnection extends android.app.IUiAutomationConnection.Stub {
    private static final int INITIAL_FROZEN_ROTATION_UNSPECIFIED = -1;
    private static final java.lang.String TAG = "UiAutomationConnection";
    private final android.view.accessibility.IAccessibilityManager mAccessibilityManager = null;
    private final android.app.IActivityManager mActivityManager = null;
    private android.accessibilityservice.IAccessibilityServiceClient mClient;
    private android.app.UiAutomationConnection.DeathRecipient mDeathRecipient;
    private int mInitialFrozenRotation;
    private boolean mIsShutdown;
    private final java.lang.Object mLock = null;
    private int mOwningUid;
    private final android.permission.IPermissionManager mPermissionManager = null;
    private final android.os.Binder mToken = null;
    private final android.view.IWindowManager mWindowManager = null;
    public UiAutomationConnection() { super(); }
    private void disconnectInternalLocked() {}
    private void handleExecuteShellCommandProcess(java.lang.Process p0, android.os.ParcelFileDescriptor p1, android.os.ParcelFileDescriptor p2, android.os.ParcelFileDescriptor p3) {}
    private boolean isConnectedLocked() { return false; }
    private void registerUiTestAutomationServiceLocked(android.accessibilityservice.IAccessibilityServiceClient p0, int p1, int p2) {}
    private void restoreRotationStateLocked() {}
    private void storeRotationStateLocked() {}
    private void throwIfCalledByNotTrustedUidLocked() {}
    private void throwIfNotConnectedLocked() {}
    private void throwIfShutdownLocked() {}
    private void unregisterUiTestAutomationServiceLocked() {}
    public void addOverridePermissionState(int p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
    public void adoptShellPermissionIdentity(java.lang.String[] p0) throws android.os.RemoteException {}
    public void clearAllOverridePermissionStates() throws android.os.RemoteException {}
    public void clearOverridePermissionStates(int p0) throws android.os.RemoteException {}
    public void clearWindowAnimationFrameStats() {}
    public boolean clearWindowContentFrameStats(int p0) throws android.os.RemoteException { return false; }
    public void connect(android.accessibilityservice.IAccessibilityServiceClient p0, int p1) {}
    public void disconnect() {}
    public void dropShellPermissionIdentity() throws android.os.RemoteException {}
    public void executeShellCommand(java.lang.String p0, android.os.ParcelFileDescriptor p1, android.os.ParcelFileDescriptor p2) throws android.os.RemoteException {}
    public void executeShellCommandArrayWithStderr(java.lang.String[] p0, android.os.ParcelFileDescriptor p1, android.os.ParcelFileDescriptor p2, android.os.ParcelFileDescriptor p3) throws android.os.RemoteException {}
    public void executeShellCommandWithStderr(java.lang.String p0, android.os.ParcelFileDescriptor p1, android.os.ParcelFileDescriptor p2, android.os.ParcelFileDescriptor p3) throws android.os.RemoteException {}
    public java.util.List<java.lang.String> getAdoptedShellPermissions() throws android.os.RemoteException { return null; }
    public android.view.WindowAnimationFrameStats getWindowAnimationFrameStats() { return null; }
    public android.view.WindowContentFrameStats getWindowContentFrameStats(int p0) throws android.os.RemoteException { return null; }
    public void grantRuntimePermission(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
    public boolean injectInputEvent(android.view.InputEvent p0, boolean p1, boolean p2) { return false; }
    public void injectInputEventToInputFilter(android.view.InputEvent p0) throws android.os.RemoteException {}
    public void removeOverridePermissionState(int p0, java.lang.String p1) throws android.os.RemoteException {}
    public void revokeRuntimePermission(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
    public boolean setRotation(int p0) { return false; }
    public void shutdown() {}
    public void syncInputTransactions(boolean p0) {}
    public boolean takeScreenshot(android.graphics.Rect p0, android.window.ScreenCaptureInternal.ScreenCaptureListener p1, int p2) { return false; }
    public boolean takeSurfaceControlScreenshot(android.view.SurfaceControl p0, android.window.ScreenCaptureInternal.ScreenCaptureListener p1) { return false; }

    private final class DeathRecipient implements android.os.IBinder.DeathRecipient {
        private DeathRecipient(android.app.UiAutomationConnection p0) {}
        public void binderDied() {}
    }

    public class Repeater implements java.lang.Runnable {
        private final java.io.InputStream readFrom = null;
        private final java.io.OutputStream writeTo = null;
        public Repeater(android.app.UiAutomationConnection p0, java.io.InputStream p1, java.io.OutputStream p2) {}
        public void run() {}
    }
}
