package android.view.accessibility;

public interface IMagnificationConnectionCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.view.accessibility.IMagnificationConnectionCallback";
    public void onAccessibilityActionPerformed(int p0) throws android.os.RemoteException;
    public void onChangeMagnificationMode(int p0, int p1) throws android.os.RemoteException;
    public void onMove(int p0) throws android.os.RemoteException;
    public void onPerformScaleAction(int p0, float p1, boolean p2) throws android.os.RemoteException;
    public void onSourceBoundsChanged(int p0, android.graphics.Rect p1) throws android.os.RemoteException;
    public void onWindowMagnifierBoundsChanged(int p0, android.graphics.Rect p1) throws android.os.RemoteException;

    public static class Default implements android.view.accessibility.IMagnificationConnectionCallback {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onAccessibilityActionPerformed(int p0) throws android.os.RemoteException {}
        public void onChangeMagnificationMode(int p0, int p1) throws android.os.RemoteException {}
        public void onMove(int p0) throws android.os.RemoteException {}
        public void onPerformScaleAction(int p0, float p1, boolean p2) throws android.os.RemoteException {}
        public void onSourceBoundsChanged(int p0, android.graphics.Rect p1) throws android.os.RemoteException {}
        public void onWindowMagnifierBoundsChanged(int p0, android.graphics.Rect p1) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.view.accessibility.IMagnificationConnectionCallback {
        static final int TRANSACTION_onAccessibilityActionPerformed = 5;
        static final int TRANSACTION_onChangeMagnificationMode = 2;
        static final int TRANSACTION_onMove = 6;
        static final int TRANSACTION_onPerformScaleAction = 4;
        static final int TRANSACTION_onSourceBoundsChanged = 3;
        static final int TRANSACTION_onWindowMagnifierBoundsChanged = 1;
        public Stub() { super(); }
        public static android.view.accessibility.IMagnificationConnectionCallback asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.view.accessibility.IMagnificationConnectionCallback {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onAccessibilityActionPerformed(int p0) throws android.os.RemoteException {}
            public void onChangeMagnificationMode(int p0, int p1) throws android.os.RemoteException {}
            public void onMove(int p0) throws android.os.RemoteException {}
            public void onPerformScaleAction(int p0, float p1, boolean p2) throws android.os.RemoteException {}
            public void onSourceBoundsChanged(int p0, android.graphics.Rect p1) throws android.os.RemoteException {}
            public void onWindowMagnifierBoundsChanged(int p0, android.graphics.Rect p1) throws android.os.RemoteException {}
        }
    }
}
