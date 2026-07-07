package android.hardware.camera2;

public final class CameraExtensionCharacteristics {
    public static final int EXTENSION_AUTOMATIC = 0;
    @java.lang.Deprecated
    public static final int EXTENSION_BEAUTY = 1;
    public static final int EXTENSION_BOKEH = 2;
    public static final int EXTENSION_FACE_RETOUCH = 1;
    public static final int EXTENSION_HDR = 3;
    private static final int[] EXTENSION_LIST = null;
    public static final int EXTENSION_NIGHT = 4;
    @android.annotation.SystemApi
    public static final int EXTENSION_SELFIE_SEGMENTATION = 5;
    @android.annotation.SystemApi
    public static final int EXTENSION_VENDOR_START = 16384;
    public static final int NON_PROCESSING_INPUT_FORMAT = 34;
    public static final int PROCESSING_INPUT_FORMAT = 35;
    private static final java.util.List<android.hardware.camera2.CameraCharacteristics.Key> SUPPORTED_SYNTHETIC_CAMERA_CHARACTERISTICS = null;
    private static final java.lang.String TAG = "CameraExtensionCharacteristics";
    private final java.lang.String mCameraId = null;
    private final java.util.Map<java.lang.String, android.hardware.camera2.CameraCharacteristics> mCharacteristicsMap = null;
    private final java.util.Map<java.lang.String, android.hardware.camera2.impl.CameraMetadataNative> mCharacteristicsMapNative = null;
    private final android.content.Context mContext = null;
    public CameraExtensionCharacteristics(android.content.Context p0, java.lang.String p1, java.util.Map<java.lang.String, android.hardware.camera2.CameraCharacteristics> p2) {}
    public static boolean areAdvancedExtensionsSupported(int p0) { return false; }
    private static java.util.List<android.util.Size> generateJpegSupportedSizes(java.util.List<android.hardware.camera2.extension.SizeList> p0, android.hardware.camera2.params.StreamConfigurationMap p1) { return null; }
    private static java.util.List<android.util.Size> generateSupportedSizes(java.util.List<android.hardware.camera2.extension.SizeList> p0, java.lang.Integer p1, android.hardware.camera2.params.StreamConfigurationMap p2) { return null; }
    private static java.util.ArrayList<android.util.Size> getSupportedSizes(java.util.List<android.hardware.camera2.extension.SizeList> p0, java.lang.Integer p1) { return null; }
    public static android.hardware.camera2.extension.IAdvancedExtenderImpl initializeAdvancedExtension(int p0) { return null; }
    public static android.util.Pair<android.hardware.camera2.extension.IPreviewExtenderImpl, android.hardware.camera2.extension.IImageCaptureExtenderImpl> initializeExtension(int p0) { return null; }
    public static void initializeSession(android.hardware.camera2.extension.IInitializeSessionCallback p0, int p1) throws android.os.RemoteException {}
    public static boolean isExtensionSupported(java.lang.String p0, int p1, java.util.Map<java.lang.String, android.hardware.camera2.impl.CameraMetadataNative> p2) { return false; }
    private static <T extends java.lang.Object> boolean isOutputSupportedFor(java.lang.Class<T> p0) { return false; }
    public static boolean registerClient(android.content.Context p0, android.os.IBinder p1, int p2, java.lang.String p3, java.util.Map<java.lang.String, android.hardware.camera2.impl.CameraMetadataNative> p4) { return false; }
    public static void releaseSession(int p0) {}
    public static void unregisterClient(android.content.Context p0, android.os.IBinder p1, int p2) {}
    public <T extends java.lang.Object> T get(int p0, android.hardware.camera2.CameraCharacteristics.Key<T> p1) { return null; }
    public java.util.Set<android.hardware.camera2.CaptureRequest.Key> getAvailableCaptureRequestKeys(int p0) { return null; }
    public java.util.Set<android.hardware.camera2.CaptureResult.Key> getAvailableCaptureResultKeys(int p0) { return null; }
    public android.util.Range<java.lang.Long> getEstimatedCaptureLatencyRangeMillis(int p0, android.util.Size p1, int p2) { return null; }
    public java.util.List<android.util.Size> getExtensionSupportedSizes(int p0, int p1) { return null; }
    public <T extends java.lang.Object> java.util.List<android.util.Size> getExtensionSupportedSizes(int p0, java.lang.Class<T> p1) { return null; }
    public java.util.Set<android.hardware.camera2.CameraCharacteristics.Key> getKeys(int p0) { return null; }
    public java.util.List<android.util.Size> getPostviewSupportedSizes(int p0, android.util.Size p1, int p2) { return null; }
    public java.util.List<java.lang.Integer> getSupportedExtensions() { return null; }
    public boolean isCaptureProcessProgressAvailable(int p0) { return false; }
    public boolean isExtensionSupported(int p0) { return false; }
    public boolean isPostviewAvailable(int p0) { return false; }

    private static final class CameraExtensionManagerGlobal {
        private static final int FALLBACK_PACKAGE_NAME = 17040069;
        private static final int FALLBACK_SERVICE_NAME = 17040070;
        private static final android.hardware.camera2.CameraExtensionCharacteristics.CameraExtensionManagerGlobal GLOBAL_CAMERA_MANAGER = null;
        private static final java.lang.String PROXY_PACKAGE_NAME = "com.android.cameraextensions";
        private static final java.lang.String PROXY_SERVICE_NAME = "com.android.cameraextensions.CameraExtensionsProxyService";
        private static final java.lang.String TAG = "CameraExtensionManagerGlobal";
        private final int PROXY_SERVICE_DELAY_MS = 0;
        private android.hardware.camera2.CameraExtensionCharacteristics.CameraExtensionManagerGlobal.ExtensionConnectionManager mConnectionManager;
        private boolean mIsFallbackEnabled;
        private final java.lang.Object mLock = null;
        private CameraExtensionManagerGlobal() {}
        private void connectToProxyLocked(android.content.Context p0, int p1, boolean p2) {}
        public static android.hardware.camera2.CameraExtensionCharacteristics.CameraExtensionManagerGlobal get() { return null; }
        private void releaseProxyConnectionLocked(android.content.Context p0, int p1) {}
        public boolean areAdvancedExtensionsSupported(int p0) { return false; }
        public android.hardware.camera2.extension.IAdvancedExtenderImpl initializeAdvancedExtension(int p0) throws android.os.RemoteException { return null; }
        public android.hardware.camera2.extension.IImageCaptureExtenderImpl initializeImageExtension(int p0) throws android.os.RemoteException { return null; }
        public android.hardware.camera2.extension.IPreviewExtenderImpl initializePreviewExtension(int p0) throws android.os.RemoteException { return null; }
        public void initializeSession(android.hardware.camera2.extension.IInitializeSessionCallback p0, int p1) throws android.os.RemoteException {}
        public boolean registerClient(android.content.Context p0, android.os.IBinder p1, int p2, java.lang.String p3, java.util.Map<java.lang.String, android.hardware.camera2.impl.CameraMetadataNative> p4) { return false; }
        public boolean registerClientHelper(android.content.Context p0, android.os.IBinder p1, int p2, boolean p3) { return false; }
        public void releaseSession(int p0) {}
        public void unregisterClient(android.content.Context p0, android.os.IBinder p1, int p2) {}

        private class ExtensionConnectionManager {
            private java.util.Map<java.lang.Integer, android.hardware.camera2.CameraExtensionCharacteristics.CameraExtensionManagerGlobal.ExtensionConnectionManager.ExtensionConnection> mConnections;
            private boolean mSessionInitialized;
            public ExtensionConnectionManager(android.hardware.camera2.CameraExtensionCharacteristics.CameraExtensionManagerGlobal p0) {}
            public boolean areAdvancedExtensionsSupported(int p0) { return false; }
            public void decrementConnectionCount(int p0) {}
            public android.content.ServiceConnection getConnection(int p0) { return null; }
            public int getConnectionCount(int p0) { return 0; }
            public android.hardware.camera2.extension.ICameraExtensionsProxyService getProxy(int p0) { return null; }
            public void incrementConnectionCount(int p0) {}
            public boolean isSessionInitialized() { return false; }
            public void resetConnectionCount(int p0) {}
            public void setAdvancedExtensionsSupported(int p0, boolean p1) {}
            public void setConnection(int p0, android.content.ServiceConnection p1) {}
            public void setProxy(int p0, android.hardware.camera2.extension.ICameraExtensionsProxyService p1) {}
            public void setSessionInitialized(boolean p0) {}

            private class ExtensionConnection {
                public android.content.ServiceConnection mConnection;
                public int mConnectionCount;
                public android.hardware.camera2.extension.ICameraExtensionsProxyService mProxy;
                public boolean mSupportsAdvancedExtensions;
                private ExtensionConnection(android.hardware.camera2.CameraExtensionCharacteristics.CameraExtensionManagerGlobal.ExtensionConnectionManager p0) {}
            }
        }

        private static class InitializerFuture implements java.util.concurrent.Future<java.lang.Boolean> {
            android.os.ConditionVariable mCondVar;
            private volatile java.lang.Boolean mStatus;
            private InitializerFuture() {}
            public boolean cancel(boolean p0) { return false; }
            public java.lang.Boolean get() { return null; }
            public java.lang.Boolean get(long p0, java.util.concurrent.TimeUnit p1) throws java.util.concurrent.TimeoutException { return null; }
            public boolean isCancelled() { return false; }
            public boolean isDone() { return false; }
            public void setStatus(boolean p0) {}
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Extension {
    }
}
