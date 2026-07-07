package android.media.audio;

public interface IAudioModeSession extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.audio.IAudioModeSession";
    public void close() throws android.os.RemoteException;
    public java.util.List<android.media.audio.IAudioModeSession.Route> getAvailableRoutes() throws android.os.RemoteException;
    public void setClientPaused(boolean p0) throws android.os.RemoteException;
    public void setDisplayActiveUseCase(boolean p0) throws android.os.RemoteException;
    public void setMode(int p0) throws android.os.RemoteException;
    public int setRequestedRoute(android.media.audio.IAudioModeSession.Route p0) throws android.os.RemoteException;

    public static class Default implements android.media.audio.IAudioModeSession {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void close() throws android.os.RemoteException {}
        public java.util.List<android.media.audio.IAudioModeSession.Route> getAvailableRoutes() throws android.os.RemoteException { return null; }
        public void setClientPaused(boolean p0) throws android.os.RemoteException {}
        public void setDisplayActiveUseCase(boolean p0) throws android.os.RemoteException {}
        public void setMode(int p0) throws android.os.RemoteException {}
        public int setRequestedRoute(android.media.audio.IAudioModeSession.Route p0) throws android.os.RemoteException { return 0; }
    }

    public static class Route implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.media.audio.IAudioModeSession.Route> CREATOR = null;
        public android.media.audio.DeviceIdentity input;
        public android.media.audio.DeviceIdentity output;
        public Route() {}
        private int describeContents(java.lang.Object p0) { return 0; }
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public final void readFromParcel(android.os.Parcel p0) {}
        public java.lang.String toString() { return null; }
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static abstract class Stub extends android.os.Binder implements android.media.audio.IAudioModeSession {
        static final int TRANSACTION_close = 6;
        static final int TRANSACTION_getAvailableRoutes = 4;
        static final int TRANSACTION_setClientPaused = 5;
        static final int TRANSACTION_setDisplayActiveUseCase = 2;
        static final int TRANSACTION_setMode = 1;
        static final int TRANSACTION_setRequestedRoute = 3;
        public Stub() { super(); }
        public static android.media.audio.IAudioModeSession asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.media.audio.IAudioModeSession {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void close() throws android.os.RemoteException {}
            public java.util.List<android.media.audio.IAudioModeSession.Route> getAvailableRoutes() throws android.os.RemoteException { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void setClientPaused(boolean p0) throws android.os.RemoteException {}
            public void setDisplayActiveUseCase(boolean p0) throws android.os.RemoteException {}
            public void setMode(int p0) throws android.os.RemoteException {}
            public int setRequestedRoute(android.media.audio.IAudioModeSession.Route p0) throws android.os.RemoteException { return 0; }
        }
    }
}
