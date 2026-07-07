package android.media;

public interface IRemoteSessionCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.IRemoteSessionCallback";
    public void onSessionChanged(android.media.session.MediaSession.Token p0) throws android.os.RemoteException;
    public void onVolumeChanged(android.media.session.MediaSession.Token p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.media.IRemoteSessionCallback {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onSessionChanged(android.media.session.MediaSession.Token p0) throws android.os.RemoteException {}
        public void onVolumeChanged(android.media.session.MediaSession.Token p0, int p1) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.media.IRemoteSessionCallback {
        static final int TRANSACTION_onSessionChanged = 2;
        static final int TRANSACTION_onVolumeChanged = 1;
        public Stub() { super(); }
        public static android.media.IRemoteSessionCallback asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.media.IRemoteSessionCallback {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onSessionChanged(android.media.session.MediaSession.Token p0) throws android.os.RemoteException {}
            public void onVolumeChanged(android.media.session.MediaSession.Token p0, int p1) throws android.os.RemoteException {}
        }
    }
}
