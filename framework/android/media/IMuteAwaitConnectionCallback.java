package android.media;

public interface IMuteAwaitConnectionCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.IMuteAwaitConnectionCallback";
    public void dispatchOnMutedUntilConnection(android.media.AudioDeviceAttributes p0, int[] p1) throws android.os.RemoteException;
    public void dispatchOnUnmutedEvent(int p0, android.media.AudioDeviceAttributes p1, int[] p2) throws android.os.RemoteException;

    public static class Default implements android.media.IMuteAwaitConnectionCallback {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void dispatchOnMutedUntilConnection(android.media.AudioDeviceAttributes p0, int[] p1) throws android.os.RemoteException {}
        public void dispatchOnUnmutedEvent(int p0, android.media.AudioDeviceAttributes p1, int[] p2) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.media.IMuteAwaitConnectionCallback {
        static final int TRANSACTION_dispatchOnMutedUntilConnection = 1;
        static final int TRANSACTION_dispatchOnUnmutedEvent = 2;
        public Stub() { super(); }
        public static android.media.IMuteAwaitConnectionCallback asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.media.IMuteAwaitConnectionCallback {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void dispatchOnMutedUntilConnection(android.media.AudioDeviceAttributes p0, int[] p1) throws android.os.RemoteException {}
            public void dispatchOnUnmutedEvent(int p0, android.media.AudioDeviceAttributes p1, int[] p2) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
        }
    }
}
