package android.gui;

public interface IBLASTBufferQueue extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.gui.IBLASTBufferQueue";
    public void clearRemote(android.gui.BLASTBufferQueueState p0) throws android.os.RemoteException;
    public android.view.Surface getSurfaceForPixelCopy() throws android.os.RemoteException;
    public void mergeWithNextTransaction(android.view.SurfaceControl.Transaction p0) throws android.os.RemoteException;
    public android.gui.BLASTBufferQueueState setRemote(android.gui.IBLASTBufferQueue p0) throws android.os.RemoteException;
    public void stopContinuousSyncTransaction() throws android.os.RemoteException;
    public boolean syncNextTransaction(boolean p0, android.gui.ITransactionReadyCallback p1) throws android.os.RemoteException;
    public void update(android.view.SurfaceControl p0, int p1, int p2, int p3) throws android.os.RemoteException;

    public static class Default implements android.gui.IBLASTBufferQueue {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void clearRemote(android.gui.BLASTBufferQueueState p0) throws android.os.RemoteException {}
        public android.view.Surface getSurfaceForPixelCopy() throws android.os.RemoteException { return null; }
        public void mergeWithNextTransaction(android.view.SurfaceControl.Transaction p0) throws android.os.RemoteException {}
        public android.gui.BLASTBufferQueueState setRemote(android.gui.IBLASTBufferQueue p0) throws android.os.RemoteException { return null; }
        public void stopContinuousSyncTransaction() throws android.os.RemoteException {}
        public boolean syncNextTransaction(boolean p0, android.gui.ITransactionReadyCallback p1) throws android.os.RemoteException { return false; }
        public void update(android.view.SurfaceControl p0, int p1, int p2, int p3) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.gui.IBLASTBufferQueue {
        static final int TRANSACTION_clearRemote = 6;
        static final int TRANSACTION_getSurfaceForPixelCopy = 7;
        static final int TRANSACTION_mergeWithNextTransaction = 3;
        static final int TRANSACTION_setRemote = 5;
        static final int TRANSACTION_stopContinuousSyncTransaction = 2;
        static final int TRANSACTION_syncNextTransaction = 1;
        static final int TRANSACTION_update = 4;
        public Stub() { super(); }
        public static android.gui.IBLASTBufferQueue asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.gui.IBLASTBufferQueue {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void clearRemote(android.gui.BLASTBufferQueueState p0) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public android.view.Surface getSurfaceForPixelCopy() throws android.os.RemoteException { return null; }
            public void mergeWithNextTransaction(android.view.SurfaceControl.Transaction p0) throws android.os.RemoteException {}
            public android.gui.BLASTBufferQueueState setRemote(android.gui.IBLASTBufferQueue p0) throws android.os.RemoteException { return null; }
            public void stopContinuousSyncTransaction() throws android.os.RemoteException {}
            public boolean syncNextTransaction(boolean p0, android.gui.ITransactionReadyCallback p1) throws android.os.RemoteException { return false; }
            public void update(android.view.SurfaceControl p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        }
    }
}
