package android.hardware.camera2;

public final class CameraManager {
    private static final int API_VERSION_1 = 1;
    private static final int API_VERSION_2 = 2;
    private static final java.lang.String CAMERA_OPEN_CLOSE_LISTENER_PERMISSION = "android.permission.CAMERA_OPEN_CLOSE_LISTENER";
    private static final int CAMERA_TYPE_ALL = 1;
    private static final int CAMERA_TYPE_BACKWARD_COMPATIBLE = 0;
    private static final long ENABLE_PHYSICAL_CAMERA_CALLBACK_FOR_UNAVAILABLE_LOGICAL_CAMERA = 244358506L;
    public static final java.lang.String LANDSCAPE_TO_PORTRAIT_PROP = "camera.enable_landscape_to_portrait";
    public static final long OVERRIDE_CAMERA_ALLOW_LANDSCAPE_TO_PORTRAIT_OPT_IN_ONLY = 495376944L;
    public static final long OVERRIDE_CAMERA_LANDSCAPE_TO_PORTRAIT = 250678880L;
    public static final long OVERRIDE_CAMERA_LENS_FACING_FRONT = 490021436L;
    private static final java.lang.String TAG = "CameraManager";
    private static final int USE_CALLING_PID = -1;
    private static final int USE_CALLING_UID = -1;
    private final boolean DEBUG = false;
    private final java.util.Map<java.lang.String, java.util.Map<java.lang.String, android.hardware.camera2.params.StreamConfiguration[]>> mCameraIdToMultiResolutionStreamConfigurationMap = null;
    private final android.content.Context mContext = null;
    private final java.lang.Object mLock = null;
    private android.companion.virtual.VirtualDeviceManager mVirtualDeviceManager;
    public CameraManager(android.content.Context p0) {}
    private android.hardware.camera2.CameraCharacteristics getCameraCharacteristics(java.lang.String p0, android.content.res.CameraCompatibilityInfo p1) throws android.hardware.camera2.CameraAccessException { return null; }
    public static android.content.res.CameraCompatibilityInfo getCameraCompatibilityInfo(android.content.Context p0) { return null; }
    private android.content.res.CameraCompatibilityInfo getCameraCompatibilityInfo(boolean p0) { return null; }
    private static android.content.res.CameraCompatibilityInfo getCameraCompatibilityInfo(boolean p0, boolean p1) { return null; }
    private android.hardware.camera2.CameraDevice.CameraDeviceSetup getCameraDeviceSetupUnsafe(java.lang.String p0) { return null; }
    private android.util.Size getDisplaySize() { return null; }
    private java.util.Map<java.lang.String, android.hardware.camera2.params.StreamConfiguration[]> getPhysicalCameraMultiResolutionConfigs(java.lang.String p0, android.hardware.camera2.impl.CameraMetadataNative p1, android.hardware.ICameraService p2) throws android.hardware.camera2.CameraAccessException { return null; }
    private static android.content.res.CameraCompatibilityInfo getRequestedCameraCompatibilityInfo(android.content.res.CameraCompatibilityInfo p0, boolean p1) { return null; }
    public static android.content.res.CameraCompatibilityInfo getRotationOverride(android.content.Context p0, android.content.pm.PackageManager p1, java.lang.String p2) { return null; }
    private static android.content.res.CameraCompatibilityInfo getStaticLandscapeToPortraitOverride(android.content.pm.PackageManager p0, java.lang.String p1, boolean p2) { return null; }
    private boolean hasOpenCloseListenerPermission(android.content.Context p0) { return false; }
    private static boolean isCameraCompatibilityInfoRequested() { return false; }
    public static boolean isHiddenPhysicalCamera(java.lang.String p0) { return false; }
    private android.hardware.camera2.CameraDevice openCameraDeviceUserAsync(java.lang.String p0, android.hardware.camera2.CameraDevice.StateCallback p1, java.util.concurrent.Executor p2, int p3, android.content.res.CameraCompatibilityInfo p4, boolean p5) throws android.hardware.camera2.CameraAccessException { return null; }
    public static boolean physicalCallbacksAreEnabledForUnavailableCamera() { return false; }
    public static java.lang.String reportExtensionSessionStats(android.hardware.CameraExtensionSessionStats p0) { return null; }
    private static boolean shouldOverrideLensFacingFrontToBack(android.content.Context p0, android.content.pm.PackageManager p1, java.lang.String p2) { return false; }
    public android.hardware.camera2.CameraCharacteristics getCameraCharacteristics(java.lang.String p0) throws android.hardware.camera2.CameraAccessException { return null; }
    public android.hardware.camera2.CameraCharacteristics getCameraCharacteristics(java.lang.String p0, boolean p1) throws android.hardware.camera2.CameraAccessException { return null; }
    public android.hardware.camera2.CameraDevice.CameraDeviceSetup getCameraDeviceSetup(java.lang.String p0) throws android.hardware.camera2.CameraAccessException { return null; }
    public android.hardware.camera2.CameraExtensionCharacteristics getCameraExtensionCharacteristics(java.lang.String p0) throws android.hardware.camera2.CameraAccessException { return null; }
    public java.lang.String[] getCameraIdList() throws android.hardware.camera2.CameraAccessException { return null; }
    public java.lang.String[] getCameraIdListNoLazy() throws android.hardware.camera2.CameraAccessException { return null; }
    public android.hardware.ICameraService getCameraService() { return null; }
    public android.content.AttributionSourceState getClientAttribution() { return null; }
    public android.content.AttributionSourceState getClientAttribution(int p0, boolean p1) { return null; }
    public android.content.AttributionSourceState getClientAttribution(boolean p0) { return null; }
    public java.util.Set<java.util.Set<java.lang.String>> getConcurrentCameraIds() throws android.hardware.camera2.CameraAccessException { return null; }
    public int getDevicePolicyFromContext(android.content.Context p0) { return 0; }
    public java.util.Map<java.lang.String, android.hardware.camera2.CameraCharacteristics> getPhysicalIdToCharsMap(android.hardware.camera2.CameraCharacteristics p0) throws android.hardware.camera2.CameraAccessException { return null; }
    public int getTorchStrengthLevel(java.lang.String p0) throws android.hardware.camera2.CameraAccessException { return 0; }
    public void injectCamera(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.util.concurrent.Executor p3, android.hardware.camera2.CameraInjectionSession.InjectionStatusCallback p4) throws android.hardware.camera2.CameraAccessException, java.lang.SecurityException, java.lang.IllegalArgumentException {}
    public void injectSessionParams(java.lang.String p0, android.hardware.camera2.CaptureRequest p1) throws android.hardware.camera2.CameraAccessException, java.lang.SecurityException {}
    public boolean isCameraDeviceSetupSupported(java.lang.String p0) throws android.hardware.camera2.CameraAccessException { return false; }
    @android.annotation.SystemApi
    public boolean isCameraDeviceSharingSupported(java.lang.String p0) throws android.hardware.camera2.CameraAccessException { return false; }
    public boolean isCameraServiceDisabled() { return false; }
    public boolean isConcurrentSessionConfigurationSupported(java.util.Map<java.lang.String, android.hardware.camera2.params.SessionConfiguration> p0) throws android.hardware.camera2.CameraAccessException { return false; }
    public boolean isDefaultAppSocialMediaParityEnabled() throws android.hardware.camera2.CameraAccessException { return false; }
    @android.annotation.SystemApi
    public void openCamera(java.lang.String p0, int p1, java.util.concurrent.Executor p2, android.hardware.camera2.CameraDevice.StateCallback p3) throws android.hardware.camera2.CameraAccessException {}
    public void openCamera(java.lang.String p0, android.hardware.camera2.CameraDevice.StateCallback p1, android.os.Handler p2) throws android.hardware.camera2.CameraAccessException {}
    public void openCamera(java.lang.String p0, java.util.concurrent.Executor p1, android.hardware.camera2.CameraDevice.StateCallback p2) throws android.hardware.camera2.CameraAccessException {}
    public void openCamera(java.lang.String p0, boolean p1, android.os.Handler p2, android.hardware.camera2.CameraDevice.StateCallback p3) throws android.hardware.camera2.CameraAccessException {}
    public void openCameraImpl(java.lang.String p0, android.hardware.camera2.CameraDevice.StateCallback p1, java.util.concurrent.Executor p2, int p3, android.content.res.CameraCompatibilityInfo p4, boolean p5) throws android.hardware.camera2.CameraAccessException {}
    @android.annotation.SystemApi
    public void openSharedCamera(java.lang.String p0, java.util.concurrent.Executor p1, android.hardware.camera2.CameraDevice.StateCallback p2) throws android.hardware.camera2.CameraAccessException {}
    public android.hardware.camera2.CameraCharacteristics prepareCameraCharacteristics(java.lang.String p0, android.hardware.camera2.impl.CameraMetadataNative p1, android.hardware.ICameraService p2) throws android.hardware.camera2.CameraAccessException { return null; }
    public void registerAvailabilityCallback(android.hardware.camera2.CameraManager.AvailabilityCallback p0, android.os.Handler p1) {}
    public void registerAvailabilityCallback(java.util.concurrent.Executor p0, android.hardware.camera2.CameraManager.AvailabilityCallback p1) {}
    public void registerDeviceStateListener(android.hardware.camera2.CameraCharacteristics p0) {}
    public void registerTorchCallback(android.hardware.camera2.CameraManager.TorchCallback p0, android.os.Handler p1) {}
    public void registerTorchCallback(java.util.concurrent.Executor p0, android.hardware.camera2.CameraManager.TorchCallback p1) {}
    public void setTorchMode(java.lang.String p0, boolean p1) throws android.hardware.camera2.CameraAccessException {}
    public void turnOnTorchWithStrengthLevel(java.lang.String p0, int p1) throws android.hardware.camera2.CameraAccessException {}
    public void unregisterAvailabilityCallback(android.hardware.camera2.CameraManager.AvailabilityCallback p0) {}
    public void unregisterTorchCallback(android.hardware.camera2.CameraManager.TorchCallback p0) {}
    public void warmUp(java.lang.String p0) throws android.hardware.camera2.CameraAccessException, java.lang.SecurityException {}

    public static abstract class AvailabilityCallback {
        private int mDeviceId;
        private int mDevicePolicy;
        public AvailabilityCallback() {}
        public void onCameraAccessPrioritiesChanged() {}
        public void onCameraAvailable(java.lang.String p0) {}
        @android.annotation.SystemApi
        public void onCameraClosed(java.lang.String p0) {}
        @android.annotation.SystemApi
        public void onCameraOpened(java.lang.String p0, java.lang.String p1) {}
        public void onCameraRemoved(java.lang.String p0) {}
        public void onCameraUnavailable(java.lang.String p0) {}
        public void onPhysicalCameraAvailable(java.lang.String p0, java.lang.String p1) {}
        public void onPhysicalCameraUnavailable(java.lang.String p0, java.lang.String p1) {}
    }

    private static final class CameraManagerGlobal extends android.hardware.ICameraServiceListener.Stub implements android.os.IBinder.DeathRecipient {
        private static final java.lang.String CAMERA_SERVICE_BINDER_NAME = "media.camera";
        private static final int DEVICE_STATUS_ARRAY_SIZE = 10;
        private static final java.lang.String TAG = "CameraManagerGlobal";
        private static final android.hardware.camera2.CameraManager.CameraManagerGlobal gCameraManager = null;
        public static final boolean sCameraServiceDisabled = Boolean.valueOf(false);
        public static final boolean sLandscapeToPortrait = Boolean.valueOf(false);
        private final int CAMERA_SERVICE_RECONNECT_DELAY_MS = 0;
        private final boolean DEBUG = false;
        private final android.util.ArrayMap<android.hardware.camera2.CameraManager.AvailabilityCallback, java.util.concurrent.Executor> mCallbackMap = null;
        private android.hardware.ICameraService mCameraService;
        private final java.util.Set<java.util.Set<android.hardware.camera2.CameraManager.CameraManagerGlobal.DeviceCameraInfo>> mConcurrentCameraIdCombinations = null;
        private android.os.Handler mDeviceStateHandler;
        private android.os.HandlerThread mDeviceStateHandlerThread;
        private final android.util.ArrayMap<android.hardware.camera2.CameraManager.CameraManagerGlobal.DeviceCameraInfo, java.lang.Integer> mDeviceStatus = null;
        private final java.util.ArrayDeque<java.lang.String> mDeviceStatusHistory = null;
        private android.hardware.camera2.CameraManager.FoldStateListener mFoldStateListener;
        private boolean mHasOpenCloseListenerPermission;
        private final java.lang.Object mLock = null;
        private final android.util.ArrayMap<android.hardware.camera2.CameraManager.CameraManagerGlobal.DeviceCameraInfo, java.lang.String> mOpenedDevices = null;
        private final java.util.concurrent.ScheduledExecutorService mScheduler = null;
        private final android.util.ArrayMap<android.hardware.camera2.CameraManager.TorchCallback, java.util.concurrent.Executor> mTorchCallbackMap = null;
        private final android.os.Binder mTorchClientBinder = null;
        private final android.util.ArrayMap<android.hardware.camera2.CameraManager.CameraManagerGlobal.DeviceCameraInfo, java.lang.Integer> mTorchStatus = null;
        private final android.util.ArrayMap<android.hardware.camera2.CameraManager.CameraManagerGlobal.DeviceCameraInfo, java.util.ArrayList<java.lang.String>> mUnavailablePhysicalDevices = null;
        private CameraManagerGlobal() { super(); }
        private void addDeviceStatusHistoryLocked(java.lang.String p0) {}
        private static boolean cameraStatusesContains(android.hardware.CameraStatus[] p0, android.hardware.camera2.CameraManager.CameraManagerGlobal.DeviceCameraInfo p1) { return false; }
        private void connectCameraServiceLocked() {}
        private void connectCameraServiceLocked(boolean p0) {}
        private java.lang.String[] extractCameraIdListLocked(int p0, int p1) { return null; }
        private java.util.Set<java.util.Set<java.lang.String>> extractConcurrentCameraIdListLocked(int p0, int p1) { return null; }
        public static android.hardware.camera2.CameraManager.CameraManagerGlobal get() { return null; }
        private void handleRecoverableSetupErrors(android.os.ServiceSpecificException p0) {}
        private boolean isAvailable(int p0) { return false; }
        private void onCameraClosedLocked(android.hardware.camera2.CameraManager.CameraManagerGlobal.DeviceCameraInfo p0) {}
        private void onCameraOpenedLocked(android.hardware.camera2.CameraManager.CameraManagerGlobal.DeviceCameraInfo p0, java.lang.String p1) {}
        private void onPhysicalCameraStatusChangedLocked(int p0, android.hardware.camera2.CameraManager.CameraManagerGlobal.DeviceCameraInfo p1, java.lang.String p2) {}
        private void onStatusChangedLocked(int p0, android.hardware.camera2.CameraManager.CameraManagerGlobal.DeviceCameraInfo p1) {}
        private void onStatusChangedLocked(int p0, android.hardware.camera2.CameraManager.CameraManagerGlobal.DeviceCameraInfo p1, boolean p2) {}
        private void onTorchStatusChangedLocked(int p0, android.hardware.camera2.CameraManager.CameraManagerGlobal.DeviceCameraInfo p1) {}
        private void onTorchStrengthLevelChangedLocked(android.hardware.camera2.CameraManager.CameraManagerGlobal.DeviceCameraInfo p0, int p1) {}
        private void postSingleAccessPriorityChangeUpdate(android.hardware.camera2.CameraManager.AvailabilityCallback p0, java.util.concurrent.Executor p1) {}
        private void postSingleCameraClosedUpdate(android.hardware.camera2.CameraManager.AvailabilityCallback p0, java.util.concurrent.Executor p1, java.lang.String p2) {}
        private void postSingleCameraOpenedUpdate(android.hardware.camera2.CameraManager.AvailabilityCallback p0, java.util.concurrent.Executor p1, java.lang.String p2, java.lang.String p3) {}
        private void postSingleTorchStrengthLevelUpdate(android.hardware.camera2.CameraManager.TorchCallback p0, java.util.concurrent.Executor p1, java.lang.String p2, int p3) {}
        private void postSingleTorchUpdate(android.hardware.camera2.CameraManager.TorchCallback p0, java.util.concurrent.Executor p1, java.lang.String p2, int p3) {}
        private void postSingleUpdate(android.hardware.camera2.CameraManager.AvailabilityCallback p0, java.util.concurrent.Executor p1, java.lang.String p2, java.lang.String p3, int p4) {}
        private void scheduleCameraServiceReconnectionLocked() {}
        private boolean shouldHideCamera(int p0, int p1, android.hardware.camera2.CameraManager.CameraManagerGlobal.DeviceCameraInfo p2) { return false; }
        private static void sortCameraIds(java.lang.String[] p0) {}
        private void updateAllCameraStatusLocked(android.hardware.CameraStatus[] p0) {}
        private void updateCallbackLocked(android.hardware.camera2.CameraManager.AvailabilityCallback p0, java.util.concurrent.Executor p1) {}
        private void updateTorchCallbackLocked(android.hardware.camera2.CameraManager.TorchCallback p0, java.util.concurrent.Executor p1) {}
        private boolean validStatus(int p0) { return false; }
        private boolean validTorchStatus(int p0) { return false; }
        public android.os.IBinder asBinder() { return null; }
        public void binderDied() {}
        public boolean cameraIdHasConcurrentStreams(java.lang.String p0, int p1, int p2) { return false; }
        public java.lang.String[] getCameraIdList(int p0, int p1) { return null; }
        public java.lang.String[] getCameraIdListNoLazy(int p0, int p1) { return null; }
        public android.hardware.ICameraService getCameraService() { return null; }
        public java.util.Set<java.util.Set<java.lang.String>> getConcurrentCameraIds(int p0, int p1) { return null; }
        public int getTorchStrengthLevel(java.lang.String p0, android.content.AttributionSourceState p1, int p2) throws android.hardware.camera2.CameraAccessException { return 0; }
        public void injectSessionParams(java.lang.String p0, android.hardware.camera2.CaptureRequest p1) throws android.hardware.camera2.CameraAccessException, java.lang.SecurityException {}
        public boolean isConcurrentSessionConfigurationSupported(java.util.Map<java.lang.String, android.hardware.camera2.params.SessionConfiguration> p0, int p1, android.content.AttributionSourceState p2, int p3) throws android.hardware.camera2.CameraAccessException { return false; }
        public boolean isDefaultAppSocialMediaParityEnabled() { return false; }
        public void onCameraAccessPrioritiesChanged() {}
        public void onCameraClosed(java.lang.String p0, int p1) {}
        public void onCameraOpened(java.lang.String p0, java.lang.String p1, int p2) {}
        public void onCameraOpenedInSharedMode(java.lang.String p0, java.lang.String p1, int p2, boolean p3) {}
        public void onPhysicalCameraStatusChanged(int p0, java.lang.String p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
        public void onStatusChanged(int p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void onStatusChangedBatched(android.hardware.CameraStatus[] p0, android.hardware.TorchStatus[] p1) {}
        public void onTorchStatusChanged(int p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void onTorchStrengthLevelChanged(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
        public void registerAvailabilityCallback(android.hardware.camera2.CameraManager.AvailabilityCallback p0, java.util.concurrent.Executor p1, boolean p2, int p3, int p4) {}
        public void registerDeviceStateListener(android.hardware.camera2.CameraCharacteristics p0, android.content.Context p1) {}
        public void registerTorchCallback(android.hardware.camera2.CameraManager.TorchCallback p0, java.util.concurrent.Executor p1, int p2, int p3) {}
        public void setTorchMode(java.lang.String p0, boolean p1, android.content.AttributionSourceState p2, int p3) throws android.hardware.camera2.CameraAccessException {}
        public void turnOnTorchWithStrengthLevel(java.lang.String p0, int p1, android.content.AttributionSourceState p2, int p3) throws android.hardware.camera2.CameraAccessException {}
        public void unregisterAvailabilityCallback(android.hardware.camera2.CameraManager.AvailabilityCallback p0) {}
        public void unregisterTorchCallback(android.hardware.camera2.CameraManager.TorchCallback p0) {}
        public void warmUp(java.lang.String p0, android.content.AttributionSourceState p1, int p2) throws android.hardware.camera2.CameraAccessException, java.lang.SecurityException {}

        private static final class DeviceCameraInfo {
            private final java.lang.String mCameraId = null;
            private final int mDeviceId = 0;
            DeviceCameraInfo(java.lang.String p0, int p1) {}
            public boolean equals(java.lang.Object p0) { return false; }
            public int hashCode() { return 0; }
        }
    }

    public static interface DeviceStateListener {
        public void onDeviceStateChanged(boolean p0);
    }

    private static final class FoldStateListener implements android.hardware.devicestate.DeviceStateManager.DeviceStateCallback {
        private java.util.ArrayList<java.lang.ref.WeakReference<android.hardware.camera2.CameraManager.DeviceStateListener>> mDeviceStateListeners;
        private boolean mFoldedDeviceState;
        private final int[] mFoldedDeviceStates = null;
        public FoldStateListener(android.content.Context p0) {}
        private void handleStateChange(android.hardware.devicestate.DeviceState p0) {}
        public void addDeviceStateListener(android.hardware.camera2.CameraManager.DeviceStateListener p0) {}
        public void onDeviceStateChanged(android.hardware.devicestate.DeviceState p0) {}
    }

    public static abstract class TorchCallback {
        private int mDeviceId;
        private int mDevicePolicy;
        public TorchCallback() {}
        public void onTorchModeChanged(java.lang.String p0, boolean p1) {}
        public void onTorchModeUnavailable(java.lang.String p0) {}
        public void onTorchStrengthLevelChanged(java.lang.String p0, int p1) {}
    }
}
