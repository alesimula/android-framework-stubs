package android.view;

public class RemoteAccessibilityController {
    private static final java.lang.String TAG = "RemoteAccessibilityController";
    private android.view.RemoteAccessibilityController.RemoteAccessibilityEmbeddedConnection mConnectionWrapper;
    private android.view.View mHostView;
    private final float[] mMatrixValues = null;
    private android.graphics.Matrix mWindowMatrixForEmbeddedHierarchy;
    public RemoteAccessibilityController(android.view.View p0) {}
    private android.view.RemoteAccessibilityController.RemoteAccessibilityEmbeddedConnection getRemoteAccessibilityEmbeddedConnection() { return null; }
    private void runOnUiThread(java.lang.Runnable p0) {}
    private void setRemoteAccessibilityEmbeddedConnection(android.view.accessibility.IAccessibilityEmbeddedConnection p0, android.os.IBinder p1) {}
    public boolean alreadyAssociated(android.view.accessibility.IAccessibilityEmbeddedConnection p0) { return false; }
    public void associateHierarchy(android.view.accessibility.IAccessibilityEmbeddedConnection p0, android.os.IBinder p1, int p2, int p3) {}
    public boolean connected() { return false; }
    public void disassociateHierarchy() {}
    public android.os.IBinder getLeashToken() { return null; }
    public void setWindowMatrix(android.graphics.Matrix p0, boolean p1) {}

    private static final class RemoteAccessibilityEmbeddedConnection implements android.os.IBinder.DeathRecipient {
        private final android.view.accessibility.IAccessibilityEmbeddedConnection mConnection = null;
        private final java.lang.ref.WeakReference<android.view.RemoteAccessibilityController> mController = null;
        private final android.os.IBinder mLeashToken = null;
        RemoteAccessibilityEmbeddedConnection(android.view.RemoteAccessibilityController p0, android.view.accessibility.IAccessibilityEmbeddedConnection p1, android.os.IBinder p2) {}
        public void binderDied() {}
        android.view.accessibility.IAccessibilityEmbeddedConnection getConnection() { return null; }
        android.os.IBinder getLeashToken() { return null; }
        void linkToDeath() throws android.os.RemoteException {}
        void unlinkToDeath() {}
    }
}
