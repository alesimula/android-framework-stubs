package android.media.audio;

public interface IAudioModeSessionCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.audio.IAudioModeSessionCallback";
    public void onAvailableRoutesChanged(java.util.List<android.media.audio.IAudioModeSession.Route> p0) throws android.os.RemoteException;
    public void onClosed() throws android.os.RemoteException;
    public void onExternalRequestedRouteChanged(android.media.audio.IAudioModeSession.Route p0, int p1) throws android.os.RemoteException;
    public void onPaused() throws android.os.RemoteException;
    public void onResumed(int p0) throws android.os.RemoteException;
    public void onRoutingResult(int p0, android.media.audio.IAudioModeSession.Route p1, int p2) throws android.os.RemoteException;

    public static class Default implements android.media.audio.IAudioModeSessionCallback {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onAvailableRoutesChanged(java.util.List<android.media.audio.IAudioModeSession.Route> p0) throws android.os.RemoteException {}
        public void onClosed() throws android.os.RemoteException {}
        public void onExternalRequestedRouteChanged(android.media.audio.IAudioModeSession.Route p0, int p1) throws android.os.RemoteException {}
        public void onPaused() throws android.os.RemoteException {}
        public void onResumed(int p0) throws android.os.RemoteException {}
        public void onRoutingResult(int p0, android.media.audio.IAudioModeSession.Route p1, int p2) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.media.audio.IAudioModeSessionCallback {
        static final int TRANSACTION_onAvailableRoutesChanged = 1;
        static final int TRANSACTION_onClosed = 5;
        static final int TRANSACTION_onExternalRequestedRouteChanged = 2;
        static final int TRANSACTION_onPaused = 3;
        static final int TRANSACTION_onResumed = 4;
        static final int TRANSACTION_onRoutingResult = 6;
        public Stub() { super(); }
        public static android.media.audio.IAudioModeSessionCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.media.audio.IAudioModeSessionCallback {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onAvailableRoutesChanged(java.util.List<android.media.audio.IAudioModeSession.Route> p0) throws android.os.RemoteException {}
            public void onClosed() throws android.os.RemoteException {}
            public void onExternalRequestedRouteChanged(android.media.audio.IAudioModeSession.Route p0, int p1) throws android.os.RemoteException {}
            public void onPaused() throws android.os.RemoteException {}
            public void onResumed(int p0) throws android.os.RemoteException {}
            public void onRoutingResult(int p0, android.media.audio.IAudioModeSession.Route p1, int p2) throws android.os.RemoteException {}
        }
    }
}
