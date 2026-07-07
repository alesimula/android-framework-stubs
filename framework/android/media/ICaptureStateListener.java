package android.media;

public interface ICaptureStateListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.ICaptureStateListener";
    public void setCaptureState(boolean p0) throws android.os.RemoteException;

    public static class Default implements android.media.ICaptureStateListener {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void setCaptureState(boolean p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.media.ICaptureStateListener {
        static final int TRANSACTION_setCaptureState = 1;
        public Stub() { super(); }
        public static android.media.ICaptureStateListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.media.ICaptureStateListener {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void setCaptureState(boolean p0) throws android.os.RemoteException {}
        }
    }
}
