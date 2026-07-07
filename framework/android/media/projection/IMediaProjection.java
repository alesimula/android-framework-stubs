package android.media.projection;

public interface IMediaProjection extends android.os.IInterface {
    public int applyVirtualDisplayFlags(int p0) throws android.os.RemoteException;
    public boolean canProjectAudio() throws android.os.RemoteException;
    public boolean canProjectSecureVideo() throws android.os.RemoteException;
    public boolean canProjectVideo() throws android.os.RemoteException;
    public int getDisplayId() throws android.os.RemoteException;
    public android.app.ActivityOptions.LaunchCookie getLaunchCookie() throws android.os.RemoteException;
    public android.os.IBinder getRecordingOverlayStopAtLayer() throws android.os.RemoteException;
    public int getTaskId() throws android.os.RemoteException;
    public boolean isRecordingOverlay() throws android.os.RemoteException;
    public boolean isValid() throws android.os.RemoteException;
    public void notifyVirtualDisplayCreated(int p0) throws android.os.RemoteException;
    public void registerCallback(android.media.projection.IMediaProjectionCallback p0) throws android.os.RemoteException;
    public void setLaunchCookie(android.app.ActivityOptions.LaunchCookie p0) throws android.os.RemoteException;
    public void setRecordingOverlay(boolean p0) throws android.os.RemoteException;
    public void setRecordingOverlayStopAtLayer(android.os.IBinder p0) throws android.os.RemoteException;
    public void setTaskId(int p0) throws android.os.RemoteException;
    public void start(android.media.projection.IMediaProjectionCallback p0) throws android.os.RemoteException;
    public void stop(int p0) throws android.os.RemoteException;
    public void unregisterCallback(android.media.projection.IMediaProjectionCallback p0) throws android.os.RemoteException;

    public static class Default implements android.media.projection.IMediaProjection {
        public Default() {}
        public int applyVirtualDisplayFlags(int p0) throws android.os.RemoteException { return 0; }
        public android.os.IBinder asBinder() { return null; }
        public boolean canProjectAudio() throws android.os.RemoteException { return false; }
        public boolean canProjectSecureVideo() throws android.os.RemoteException { return false; }
        public boolean canProjectVideo() throws android.os.RemoteException { return false; }
        public int getDisplayId() throws android.os.RemoteException { return 0; }
        public android.app.ActivityOptions.LaunchCookie getLaunchCookie() throws android.os.RemoteException { return null; }
        public android.os.IBinder getRecordingOverlayStopAtLayer() throws android.os.RemoteException { return null; }
        public int getTaskId() throws android.os.RemoteException { return 0; }
        public boolean isRecordingOverlay() throws android.os.RemoteException { return false; }
        public boolean isValid() throws android.os.RemoteException { return false; }
        public void notifyVirtualDisplayCreated(int p0) throws android.os.RemoteException {}
        public void registerCallback(android.media.projection.IMediaProjectionCallback p0) throws android.os.RemoteException {}
        public void setLaunchCookie(android.app.ActivityOptions.LaunchCookie p0) throws android.os.RemoteException {}
        public void setRecordingOverlay(boolean p0) throws android.os.RemoteException {}
        public void setRecordingOverlayStopAtLayer(android.os.IBinder p0) throws android.os.RemoteException {}
        public void setTaskId(int p0) throws android.os.RemoteException {}
        public void start(android.media.projection.IMediaProjectionCallback p0) throws android.os.RemoteException {}
        public void stop(int p0) throws android.os.RemoteException {}
        public void unregisterCallback(android.media.projection.IMediaProjectionCallback p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.media.projection.IMediaProjection {
        public static final java.lang.String DESCRIPTOR = "android.media.projection.IMediaProjection";
        static final int TRANSACTION_applyVirtualDisplayFlags = 6;
        static final int TRANSACTION_canProjectAudio = 3;
        static final int TRANSACTION_canProjectSecureVideo = 5;
        static final int TRANSACTION_canProjectVideo = 4;
        static final int TRANSACTION_getDisplayId = 13;
        static final int TRANSACTION_getLaunchCookie = 9;
        static final int TRANSACTION_getRecordingOverlayStopAtLayer = 12;
        static final int TRANSACTION_getTaskId = 10;
        static final int TRANSACTION_isRecordingOverlay = 11;
        static final int TRANSACTION_isValid = 18;
        static final int TRANSACTION_notifyVirtualDisplayCreated = 19;
        static final int TRANSACTION_registerCallback = 7;
        static final int TRANSACTION_setLaunchCookie = 14;
        static final int TRANSACTION_setRecordingOverlay = 16;
        static final int TRANSACTION_setRecordingOverlayStopAtLayer = 17;
        static final int TRANSACTION_setTaskId = 15;
        static final int TRANSACTION_start = 1;
        static final int TRANSACTION_stop = 2;
        static final int TRANSACTION_unregisterCallback = 8;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static android.media.projection.IMediaProjection asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        protected void applyVirtualDisplayFlags_enforcePermission() throws java.lang.SecurityException {}
        public android.os.IBinder asBinder() { return null; }
        protected void getLaunchCookie_enforcePermission() throws java.lang.SecurityException {}
        protected void getRecordingOverlayStopAtLayer_enforcePermission() throws java.lang.SecurityException {}
        protected void getTaskId_enforcePermission() throws java.lang.SecurityException {}
        public java.lang.String getTransactionName(int p0) { return null; }
        protected void isRecordingOverlay_enforcePermission() throws java.lang.SecurityException {}
        protected void isValid_enforcePermission() throws java.lang.SecurityException {}
        protected void notifyVirtualDisplayCreated_enforcePermission() throws java.lang.SecurityException {}
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void setLaunchCookie_enforcePermission() throws java.lang.SecurityException {}
        protected void setRecordingOverlayStopAtLayer_enforcePermission() throws java.lang.SecurityException {}
        protected void setRecordingOverlay_enforcePermission() throws java.lang.SecurityException {}
        protected void setTaskId_enforcePermission() throws java.lang.SecurityException {}

        private static final class Proxy implements android.media.projection.IMediaProjection {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public int applyVirtualDisplayFlags(int p0) throws android.os.RemoteException { return 0; }
            public android.os.IBinder asBinder() { return null; }
            public boolean canProjectAudio() throws android.os.RemoteException { return false; }
            public boolean canProjectSecureVideo() throws android.os.RemoteException { return false; }
            public boolean canProjectVideo() throws android.os.RemoteException { return false; }
            public int getDisplayId() throws android.os.RemoteException { return 0; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public android.app.ActivityOptions.LaunchCookie getLaunchCookie() throws android.os.RemoteException { return null; }
            public android.os.IBinder getRecordingOverlayStopAtLayer() throws android.os.RemoteException { return null; }
            public int getTaskId() throws android.os.RemoteException { return 0; }
            public boolean isRecordingOverlay() throws android.os.RemoteException { return false; }
            public boolean isValid() throws android.os.RemoteException { return false; }
            public void notifyVirtualDisplayCreated(int p0) throws android.os.RemoteException {}
            public void registerCallback(android.media.projection.IMediaProjectionCallback p0) throws android.os.RemoteException {}
            public void setLaunchCookie(android.app.ActivityOptions.LaunchCookie p0) throws android.os.RemoteException {}
            public void setRecordingOverlay(boolean p0) throws android.os.RemoteException {}
            public void setRecordingOverlayStopAtLayer(android.os.IBinder p0) throws android.os.RemoteException {}
            public void setTaskId(int p0) throws android.os.RemoteException {}
            public void start(android.media.projection.IMediaProjectionCallback p0) throws android.os.RemoteException {}
            public void stop(int p0) throws android.os.RemoteException {}
            public void unregisterCallback(android.media.projection.IMediaProjectionCallback p0) throws android.os.RemoteException {}
        }
    }
}
