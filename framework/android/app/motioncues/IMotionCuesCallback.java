package android.app.motioncues;

public interface IMotionCuesCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.motioncues.IMotionCuesCallback";
    public void updateBubblePixelPos(float p0, float p1) throws android.os.RemoteException;
    public void updateMotionCuesVisualStyle(android.app.motioncues.MotionCuesVisualStyle p0) throws android.os.RemoteException;

    public static class Default implements android.app.motioncues.IMotionCuesCallback {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void updateBubblePixelPos(float p0, float p1) throws android.os.RemoteException {}
        public void updateMotionCuesVisualStyle(android.app.motioncues.MotionCuesVisualStyle p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.app.motioncues.IMotionCuesCallback {
        static final int TRANSACTION_updateBubblePixelPos = 1;
        static final int TRANSACTION_updateMotionCuesVisualStyle = 2;
        public Stub() { super(); }
        public static android.app.motioncues.IMotionCuesCallback asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.app.motioncues.IMotionCuesCallback {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void updateBubblePixelPos(float p0, float p1) throws android.os.RemoteException {}
            public void updateMotionCuesVisualStyle(android.app.motioncues.MotionCuesVisualStyle p0) throws android.os.RemoteException {}
        }
    }
}
