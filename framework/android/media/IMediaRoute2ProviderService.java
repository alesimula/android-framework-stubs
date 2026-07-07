package android.media;

public interface IMediaRoute2ProviderService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.IMediaRoute2ProviderService";
    public void deselectRoute(long p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void releaseSession(long p0, java.lang.String p1, boolean p2) throws android.os.RemoteException;
    public void requestCreateSession(long p0, java.lang.String p1, java.lang.String p2, android.os.Bundle p3) throws android.os.RemoteException;
    public void selectRoute(long p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void setCallback(android.media.IMediaRoute2ProviderServiceCallback p0) throws android.os.RemoteException;
    public void setRouteVolume(long p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void setSessionVolume(long p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void transferToRoute(long p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void updateDiscoveryPreference(android.media.RouteDiscoveryPreference p0, java.util.Map<java.lang.String, android.media.RouteDiscoveryPreference> p1) throws android.os.RemoteException;

    public static class Default implements android.media.IMediaRoute2ProviderService {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void deselectRoute(long p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        public void releaseSession(long p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
        public void requestCreateSession(long p0, java.lang.String p1, java.lang.String p2, android.os.Bundle p3) throws android.os.RemoteException {}
        public void selectRoute(long p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        public void setCallback(android.media.IMediaRoute2ProviderServiceCallback p0) throws android.os.RemoteException {}
        public void setRouteVolume(long p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void setSessionVolume(long p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void transferToRoute(long p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        public void updateDiscoveryPreference(android.media.RouteDiscoveryPreference p0, java.util.Map<java.lang.String, android.media.RouteDiscoveryPreference> p1) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.media.IMediaRoute2ProviderService {
        static final int TRANSACTION_deselectRoute = 6;
        static final int TRANSACTION_releaseSession = 9;
        static final int TRANSACTION_requestCreateSession = 4;
        static final int TRANSACTION_selectRoute = 5;
        static final int TRANSACTION_setCallback = 1;
        static final int TRANSACTION_setRouteVolume = 3;
        static final int TRANSACTION_setSessionVolume = 8;
        static final int TRANSACTION_transferToRoute = 7;
        static final int TRANSACTION_updateDiscoveryPreference = 2;
        public Stub() { super(); }
        public static android.media.IMediaRoute2ProviderService asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.media.IMediaRoute2ProviderService {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void deselectRoute(long p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void releaseSession(long p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
            public void requestCreateSession(long p0, java.lang.String p1, java.lang.String p2, android.os.Bundle p3) throws android.os.RemoteException {}
            public void selectRoute(long p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
            public void setCallback(android.media.IMediaRoute2ProviderServiceCallback p0) throws android.os.RemoteException {}
            public void setRouteVolume(long p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void setSessionVolume(long p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void transferToRoute(long p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
            public void updateDiscoveryPreference(android.media.RouteDiscoveryPreference p0, java.util.Map<java.lang.String, android.media.RouteDiscoveryPreference> p1) throws android.os.RemoteException {}
        }
    }
}
