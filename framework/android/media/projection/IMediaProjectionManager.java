package android.media.projection;

public interface IMediaProjectionManager extends android.os.IInterface {
    public static final java.lang.String EXTRA_PACKAGE_REUSING_GRANTED_CONSENT = "extra_media_projection_package_reusing_consent";
    public static final java.lang.String EXTRA_USER_REVIEW_GRANTED_CONSENT = "extra_media_projection_user_consent_required";
    public android.media.projection.MediaProjectionInfo addCallback(android.media.projection.IMediaProjectionWatcherCallback p0) throws android.os.RemoteException;
    public android.media.projection.IMediaProjection createProjection(int p0, java.lang.String p1, int p2, boolean p3, int p4) throws android.os.RemoteException;
    public android.media.projection.IMediaProjection createProjectionForAppContent(int p0, java.lang.String p1, android.media.projection.IAppContentProjectionSession p2, int p3, boolean p4, android.media.projection.IAppContentProjectionCallback p5) throws android.os.RemoteException;
    public android.media.projection.MediaProjectionInfo getActiveProjectionInfo() throws android.os.RemoteException;
    public android.media.projection.IMediaProjection getProjection(int p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean hasProjectionPermission(int p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean isCurrentProjection(android.media.projection.IMediaProjection p0) throws android.os.RemoteException;
    public void notifyActiveProjectionCapturedContentVisibilityChanged(boolean p0) throws android.os.RemoteException;
    public void notifyAppSelectorDisplayed(int p0) throws android.os.RemoteException;
    public void notifyCaptureBoundsChanged(int p0, int p1, android.graphics.Rect p2) throws android.os.RemoteException;
    public void notifyPermissionRequestCancelled(int p0) throws android.os.RemoteException;
    public void notifyPermissionRequestDisplayed(int p0) throws android.os.RemoteException;
    public void notifyPermissionRequestInitiated(int p0, int p1) throws android.os.RemoteException;
    public void notifyShareScreenDisplaySelected(int p0) throws android.os.RemoteException;
    public void notifyWindowingModeChanged(int p0, int p1, int p2) throws android.os.RemoteException;
    public void removeCallback(android.media.projection.IMediaProjectionWatcherCallback p0) throws android.os.RemoteException;
    public void requestConsentForInvalidProjection(android.media.projection.IMediaProjection p0) throws android.os.RemoteException;
    public boolean setContentRecordingSession(android.view.ContentRecordingSession p0, android.media.projection.IMediaProjection p1) throws android.os.RemoteException;
    public void setUserReviewGrantedConsentResult(int p0, android.media.projection.IMediaProjection p1) throws android.os.RemoteException;
    public void stopActiveProjection(int p0) throws android.os.RemoteException;

    public static class Default implements android.media.projection.IMediaProjectionManager {
        public Default() {}
        public android.media.projection.MediaProjectionInfo addCallback(android.media.projection.IMediaProjectionWatcherCallback p0) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
        public android.media.projection.IMediaProjection createProjection(int p0, java.lang.String p1, int p2, boolean p3, int p4) throws android.os.RemoteException { return null; }
        public android.media.projection.IMediaProjection createProjectionForAppContent(int p0, java.lang.String p1, android.media.projection.IAppContentProjectionSession p2, int p3, boolean p4, android.media.projection.IAppContentProjectionCallback p5) throws android.os.RemoteException { return null; }
        public android.media.projection.MediaProjectionInfo getActiveProjectionInfo() throws android.os.RemoteException { return null; }
        public android.media.projection.IMediaProjection getProjection(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public boolean hasProjectionPermission(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean isCurrentProjection(android.media.projection.IMediaProjection p0) throws android.os.RemoteException { return false; }
        public void notifyActiveProjectionCapturedContentVisibilityChanged(boolean p0) throws android.os.RemoteException {}
        public void notifyAppSelectorDisplayed(int p0) throws android.os.RemoteException {}
        public void notifyCaptureBoundsChanged(int p0, int p1, android.graphics.Rect p2) throws android.os.RemoteException {}
        public void notifyPermissionRequestCancelled(int p0) throws android.os.RemoteException {}
        public void notifyPermissionRequestDisplayed(int p0) throws android.os.RemoteException {}
        public void notifyPermissionRequestInitiated(int p0, int p1) throws android.os.RemoteException {}
        public void notifyShareScreenDisplaySelected(int p0) throws android.os.RemoteException {}
        public void notifyWindowingModeChanged(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void removeCallback(android.media.projection.IMediaProjectionWatcherCallback p0) throws android.os.RemoteException {}
        public void requestConsentForInvalidProjection(android.media.projection.IMediaProjection p0) throws android.os.RemoteException {}
        public boolean setContentRecordingSession(android.view.ContentRecordingSession p0, android.media.projection.IMediaProjection p1) throws android.os.RemoteException { return false; }
        public void setUserReviewGrantedConsentResult(int p0, android.media.projection.IMediaProjection p1) throws android.os.RemoteException {}
        public void stopActiveProjection(int p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.media.projection.IMediaProjectionManager {
        public static final java.lang.String DESCRIPTOR = "android.media.projection.IMediaProjectionManager";
        static final int TRANSACTION_addCallback = 9;
        static final int TRANSACTION_createProjection = 2;
        static final int TRANSACTION_createProjectionForAppContent = 12;
        static final int TRANSACTION_getActiveProjectionInfo = 6;
        static final int TRANSACTION_getProjection = 3;
        static final int TRANSACTION_hasProjectionPermission = 1;
        static final int TRANSACTION_isCurrentProjection = 4;
        static final int TRANSACTION_notifyActiveProjectionCapturedContentVisibilityChanged = 8;
        static final int TRANSACTION_notifyAppSelectorDisplayed = 17;
        static final int TRANSACTION_notifyCaptureBoundsChanged = 19;
        static final int TRANSACTION_notifyPermissionRequestCancelled = 16;
        static final int TRANSACTION_notifyPermissionRequestDisplayed = 15;
        static final int TRANSACTION_notifyPermissionRequestInitiated = 14;
        static final int TRANSACTION_notifyShareScreenDisplaySelected = 20;
        static final int TRANSACTION_notifyWindowingModeChanged = 18;
        static final int TRANSACTION_removeCallback = 10;
        static final int TRANSACTION_requestConsentForInvalidProjection = 5;
        static final int TRANSACTION_setContentRecordingSession = 11;
        static final int TRANSACTION_setUserReviewGrantedConsentResult = 13;
        static final int TRANSACTION_stopActiveProjection = 7;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static android.media.projection.IMediaProjectionManager asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        protected void addCallback_enforcePermission() throws java.lang.SecurityException {}
        public android.os.IBinder asBinder() { return null; }
        protected void createProjectionForAppContent_enforcePermission() throws java.lang.SecurityException {}
        protected void getActiveProjectionInfo_enforcePermission() throws java.lang.SecurityException {}
        protected void getProjection_enforcePermission() throws java.lang.SecurityException {}
        public java.lang.String getTransactionName(int p0) { return null; }
        protected void isCurrentProjection_enforcePermission() throws java.lang.SecurityException {}
        protected void notifyActiveProjectionCapturedContentVisibilityChanged_enforcePermission() throws java.lang.SecurityException {}
        protected void notifyAppSelectorDisplayed_enforcePermission() throws java.lang.SecurityException {}
        protected void notifyCaptureBoundsChanged_enforcePermission() throws java.lang.SecurityException {}
        protected void notifyPermissionRequestCancelled_enforcePermission() throws java.lang.SecurityException {}
        protected void notifyPermissionRequestDisplayed_enforcePermission() throws java.lang.SecurityException {}
        protected void notifyPermissionRequestInitiated_enforcePermission() throws java.lang.SecurityException {}
        protected void notifyShareScreenDisplaySelected_enforcePermission() throws java.lang.SecurityException {}
        protected void notifyWindowingModeChanged_enforcePermission() throws java.lang.SecurityException {}
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void requestConsentForInvalidProjection_enforcePermission() throws java.lang.SecurityException {}
        protected void setContentRecordingSession_enforcePermission() throws java.lang.SecurityException {}
        protected void setUserReviewGrantedConsentResult_enforcePermission() throws java.lang.SecurityException {}
        protected void stopActiveProjection_enforcePermission() throws java.lang.SecurityException {}

        private static final class Proxy implements android.media.projection.IMediaProjectionManager {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.media.projection.MediaProjectionInfo addCallback(android.media.projection.IMediaProjectionWatcherCallback p0) throws android.os.RemoteException { return null; }
            public android.os.IBinder asBinder() { return null; }
            public android.media.projection.IMediaProjection createProjection(int p0, java.lang.String p1, int p2, boolean p3, int p4) throws android.os.RemoteException { return null; }
            public android.media.projection.IMediaProjection createProjectionForAppContent(int p0, java.lang.String p1, android.media.projection.IAppContentProjectionSession p2, int p3, boolean p4, android.media.projection.IAppContentProjectionCallback p5) throws android.os.RemoteException { return null; }
            public android.media.projection.MediaProjectionInfo getActiveProjectionInfo() throws android.os.RemoteException { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public android.media.projection.IMediaProjection getProjection(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public boolean hasProjectionPermission(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean isCurrentProjection(android.media.projection.IMediaProjection p0) throws android.os.RemoteException { return false; }
            public void notifyActiveProjectionCapturedContentVisibilityChanged(boolean p0) throws android.os.RemoteException {}
            public void notifyAppSelectorDisplayed(int p0) throws android.os.RemoteException {}
            public void notifyCaptureBoundsChanged(int p0, int p1, android.graphics.Rect p2) throws android.os.RemoteException {}
            public void notifyPermissionRequestCancelled(int p0) throws android.os.RemoteException {}
            public void notifyPermissionRequestDisplayed(int p0) throws android.os.RemoteException {}
            public void notifyPermissionRequestInitiated(int p0, int p1) throws android.os.RemoteException {}
            public void notifyShareScreenDisplaySelected(int p0) throws android.os.RemoteException {}
            public void notifyWindowingModeChanged(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void removeCallback(android.media.projection.IMediaProjectionWatcherCallback p0) throws android.os.RemoteException {}
            public void requestConsentForInvalidProjection(android.media.projection.IMediaProjection p0) throws android.os.RemoteException {}
            public boolean setContentRecordingSession(android.view.ContentRecordingSession p0, android.media.projection.IMediaProjection p1) throws android.os.RemoteException { return false; }
            public void setUserReviewGrantedConsentResult(int p0, android.media.projection.IMediaProjection p1) throws android.os.RemoteException {}
            public void stopActiveProjection(int p0) throws android.os.RemoteException {}
        }
    }
}
