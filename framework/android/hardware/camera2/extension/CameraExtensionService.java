package android.hardware.camera2.extension;

@android.annotation.SystemApi
public abstract class CameraExtensionService extends android.app.Service {
    private static final java.lang.String TAG = "CameraExtensionService";
    private static android.hardware.camera2.extension.IInitializeSessionCallback mInitializeCb;
    private static java.lang.Object mLock;
    private android.hardware.camera2.extension.CameraUsageTracker mCameraUsageTracker;
    private android.os.IBinder.DeathRecipient mDeathRecipient;
    protected CameraExtensionService() { super(); }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract android.hardware.camera2.extension.AdvancedExtender onInitializeAdvancedExtension(int p0);
    public abstract boolean onRegisterClient(android.os.IBinder p0);
    public abstract void onUnregisterClient(android.os.IBinder p0);

    private class CameraExtensionServiceImpl extends android.hardware.camera2.extension.ICameraExtensionsProxyService.Stub {
        private CameraExtensionServiceImpl(android.hardware.camera2.extension.CameraExtensionService p0) { super(); }
        public boolean advancedExtensionsSupported() throws android.os.RemoteException { return false; }
        public android.hardware.camera2.extension.IAdvancedExtenderImpl initializeAdvancedExtension(int p0) throws android.os.RemoteException { return null; }
        public android.hardware.camera2.extension.IImageCaptureExtenderImpl initializeImageExtension(int p0) throws android.os.RemoteException { return null; }
        public android.hardware.camera2.extension.IPreviewExtenderImpl initializePreviewExtension(int p0) throws android.os.RemoteException { return null; }
        public void initializeSession(android.hardware.camera2.extension.IInitializeSessionCallback p0) {}
        public boolean registerClient(android.os.IBinder p0) throws android.os.RemoteException { return false; }
        public void releaseSession() {}
        public void unregisterClient(android.os.IBinder p0) throws android.os.RemoteException {}
    }

    private final class CameraTracker implements android.hardware.camera2.extension.CameraUsageTracker {
        private final android.app.AppOpsManager mAppOpsService = null;
        private final java.lang.String mAttributionTag = null;
        private final java.lang.String mPackageName = null;
        private int mUid;
        private CameraTracker(android.hardware.camera2.extension.CameraExtensionService p0) {}
        public void finishCameraOperation() {}
        public void startCameraOperation() {}
    }
}
