package android.media;

public interface IAudioFocusDispatcher extends android.os.IInterface {
    public void dispatchAudioFocusChange(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void dispatchFocusResultFromExtPolicy(int p0, java.lang.String p1) throws android.os.RemoteException;

    public static class Default implements android.media.IAudioFocusDispatcher {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void dispatchAudioFocusChange(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void dispatchFocusResultFromExtPolicy(int p0, java.lang.String p1) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.media.IAudioFocusDispatcher {
        public static final java.lang.String DESCRIPTOR = "android.media.IAudioFocusDispatcher";
        static final int TRANSACTION_dispatchAudioFocusChange = 1;
        static final int TRANSACTION_dispatchFocusResultFromExtPolicy = 2;
        public Stub() { super(); }
        public static android.media.IAudioFocusDispatcher asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.media.IAudioFocusDispatcher {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void dispatchAudioFocusChange(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void dispatchFocusResultFromExtPolicy(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
        }
    }
}
