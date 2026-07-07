package android.hardware.camera2.impl;

public class CameraDeviceImpl extends android.hardware.camera2.CameraDevice implements android.os.IBinder.DeathRecipient {
    static final long CHECK_PARAMS_IN_IS_SESSION_CONFIGURATION_SUPPORTED = 320741775L;
    private static final long NANO_PER_SECOND = 1000000000L;
    private static final int REQUEST_ID_NONE = -1;
    private static final java.util.concurrent.ThreadFactory sThreadFactory = null;
    private final boolean DEBUG = false;
    private final java.lang.String TAG = null;
    private final int mAppTargetSdkVersion = 0;
    private java.util.HashMap<java.lang.Integer, java.lang.Integer> mBatchOutputMap;
    private final java.lang.Runnable mCallOnActive = null;
    private final java.lang.Runnable mCallOnBusy = null;
    private final java.lang.Runnable mCallOnClosed = null;
    private final java.lang.Runnable mCallOnDisconnected = null;
    private final java.lang.Runnable mCallOnIdle = null;
    private final java.lang.Runnable mCallOnOpened = null;
    private final java.lang.Runnable mCallOnOpenedInSharedMode = null;
    private final java.lang.Runnable mCallOnUnconfigured = null;
    private final android.hardware.camera2.impl.CameraDeviceImpl.CameraDeviceCallbacks mCallbacks = null;
    private final android.hardware.camera2.CameraDevice.CameraDeviceSetup mCameraDeviceSetup = null;
    private final java.lang.String mCameraId = null;
    private final android.hardware.camera2.CameraManager mCameraManager = null;
    private android.util.SparseArray<android.hardware.camera2.impl.CaptureCallbackHolder> mCaptureCallbackMap;
    private final android.hardware.camera2.CameraCharacteristics mCharacteristics = null;
    private final java.util.concurrent.atomic.AtomicBoolean mClosing = null;
    private java.util.AbstractMap.SimpleEntry<java.lang.Integer, android.hardware.camera2.params.InputConfiguration> mConfiguredInput;
    private final android.util.SparseArray<android.hardware.camera2.params.OutputConfiguration> mConfiguredOutputs = null;
    private final android.content.Context mContext = null;
    private android.hardware.camera2.impl.CameraAdvancedExtensionSessionImpl mCurrentAdvancedExtensionSession;
    private android.hardware.camera2.impl.CameraExtensionSessionImpl mCurrentExtensionSession;
    private android.hardware.camera2.impl.CameraCaptureSessionCore mCurrentSession;
    private final android.hardware.camera2.CameraDevice.StateCallback mDeviceCallback = null;
    private final java.util.concurrent.Executor mDeviceExecutor = null;
    private long mFMQReader;
    private int mFailedRepeatingRequestId;
    private int[] mFailedRepeatingRequestTypes;
    private android.hardware.camera2.impl.FrameNumberTracker mFrameNumberTracker;
    private boolean mIdle;
    private boolean mInError;
    final java.lang.Object mInterfaceLock = null;
    private boolean mIsPrimaryClient;
    private int mNextSessionId;
    private android.hardware.camera2.impl.CameraOfflineSessionImpl mOfflineSessionImpl;
    private final java.util.HashSet<java.lang.Integer> mOfflineSupport = null;
    private java.util.concurrent.ExecutorService mOfflineSwitchService;
    private java.util.Map<java.lang.String, android.hardware.camera2.CameraCharacteristics> mPhysicalIdsToChars;
    private android.hardware.camera2.impl.ICameraDeviceUserWrapper mRemoteDevice;
    private boolean mRemoteDeviceInit;
    private int mRepeatingRequestId;
    private int[] mRepeatingRequestTypes;
    private final android.util.SparseArray<java.util.List<java.lang.ref.WeakReference<android.view.Surface>>> mReplacedOutputs = null;
    private final java.util.List<android.hardware.camera2.impl.RequestLastFrameNumbersHolder> mRequestLastFrameNumbersList = null;
    private volatile android.hardware.camera2.impl.CameraDeviceImpl.StateCallbackKK mSessionStateCallback;
    private boolean mSharedMode;
    private final int mTotalPartialCount = 0;
    public CameraDeviceImpl(java.lang.String p0, android.hardware.camera2.CameraDevice.StateCallback p1, java.util.concurrent.Executor p2, android.hardware.camera2.CameraCharacteristics p3, android.hardware.camera2.CameraManager p4, int p5, android.content.Context p6, android.hardware.camera2.CameraDevice.CameraDeviceSetup p7, boolean p8) { super(); }
    private void checkAndFireSequenceComplete() {}
    public static java.util.concurrent.Executor checkAndWrapHandler(android.os.Handler p0) { return null; }
    private void checkEarlyTriggerSequenceCompleteLocked(int p0, long p1, int[] p2) {}
    static java.util.concurrent.Executor checkExecutor(java.util.concurrent.Executor p0) { return null; }
    public static <T extends java.lang.Object> java.util.concurrent.Executor checkExecutor(java.util.concurrent.Executor p0, T p1) { return null; }
    static android.os.Handler checkHandler(android.os.Handler p0) { return null; }
    static <T extends java.lang.Object> android.os.Handler checkHandler(android.os.Handler p0, T p1) { return null; }
    private void checkIfCameraClosedOrInError() throws android.hardware.camera2.CameraAccessException {}
    private void checkInputConfiguration(android.hardware.camera2.params.InputConfiguration p0) {}
    private boolean checkInputConfigurationWithStreamConfigurations(android.hardware.camera2.params.InputConfiguration p0, boolean p1) { return false; }
    private boolean checkInputConfigurationWithStreamConfigurationsAs(android.hardware.camera2.params.InputConfiguration p0, android.hardware.camera2.params.StreamConfigurationMap p1) { return false; }
    private boolean checkSharedOutputConfiguration(android.hardware.camera2.params.OutputConfiguration p0) { return false; }
    private boolean checkSharedSessionConfiguration(java.util.List<android.hardware.camera2.params.OutputConfiguration> p0) { return false; }
    private boolean checkSurfaceSizesCompatible(java.util.List<android.hardware.camera2.params.OutputConfiguration> p0) { return false; }
    private void createCaptureSessionInternal(android.hardware.camera2.params.InputConfiguration p0, java.util.List<android.hardware.camera2.params.OutputConfiguration> p1, android.hardware.camera2.CameraCaptureSession.StateCallback p2, java.util.concurrent.Executor p3, int p4, android.hardware.camera2.CaptureRequest p5) throws android.hardware.camera2.CameraAccessException {}
    public static void disableZslIfNeeded(android.hardware.camera2.impl.CameraMetadataNative p0, int p1, int p2) {}
    private android.hardware.camera2.CameraCharacteristics getCharacteristics() { return null; }
    private java.util.Map<java.lang.String, android.hardware.camera2.CameraCharacteristics> getPhysicalIdToChars() { return null; }
    private int[] getRequestTypes(android.hardware.camera2.CaptureRequest[] p0) { return null; }
    private boolean hasBatchedOutputs(java.util.List<android.hardware.camera2.CaptureRequest> p0) { return false; }
    private boolean isClosed() { return false; }
    private boolean isRawFormat(int p0) { return false; }
    private static native void nativeClose(long p0);
    private static native long nativeCreateFMQReader(android.os.Parcel p0);
    private static native long nativeReadResultMetadata(long p0, long p1);
    private void notifyClientSharedAccessPriorityChanged(boolean p0) {}
    private void notifyError(int p0) {}
    private void onCaptureErrorLocked(int p0, android.hardware.camera2.impl.CaptureResultExtras p1) {}
    private void removeCompletedCallbackHolderLocked(long p0, long p1, long p2) {}
    private void scheduleNotifyError(int p0) {}
    private int submitCaptureRequest(java.util.List<android.hardware.camera2.CaptureRequest> p0, android.hardware.camera2.impl.CaptureCallback p1, java.util.concurrent.Executor p2, boolean p3) throws android.hardware.camera2.CameraAccessException { return 0; }
    private void updateTracker(int p0, long p1, int p2, android.hardware.camera2.CaptureResult p3, boolean p4) {}
    private void waitUntilIdle() throws android.hardware.camera2.CameraAccessException {}
    public void binderDied() {}
    public int capture(android.hardware.camera2.CaptureRequest p0, android.hardware.camera2.impl.CaptureCallback p1, java.util.concurrent.Executor p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public int captureBurst(java.util.List<android.hardware.camera2.CaptureRequest> p0, android.hardware.camera2.impl.CaptureCallback p1, java.util.concurrent.Executor p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public void close() {}
    public void configureOutputs(java.util.List<android.view.Surface> p0) throws android.hardware.camera2.CameraAccessException {}
    public boolean configureStreamsChecked(android.hardware.camera2.params.InputConfiguration p0, java.util.List<android.hardware.camera2.params.OutputConfiguration> p1, int p2, android.hardware.camera2.CaptureRequest p3, long p4) throws android.hardware.camera2.CameraAccessException { return false; }
    public android.hardware.camera2.CaptureRequest.Builder createCaptureRequest(int p0) throws android.hardware.camera2.CameraAccessException { return null; }
    public android.hardware.camera2.CaptureRequest.Builder createCaptureRequest(int p0, java.util.Set<java.lang.String> p1) throws android.hardware.camera2.CameraAccessException { return null; }
    public void createCaptureSession(android.hardware.camera2.params.SessionConfiguration p0) throws android.hardware.camera2.CameraAccessException {}
    public void createCaptureSession(java.util.List<android.view.Surface> p0, android.hardware.camera2.CameraCaptureSession.StateCallback p1, android.os.Handler p2) throws android.hardware.camera2.CameraAccessException {}
    public void createCaptureSessionByOutputConfigurations(java.util.List<android.hardware.camera2.params.OutputConfiguration> p0, android.hardware.camera2.CameraCaptureSession.StateCallback p1, android.os.Handler p2) throws android.hardware.camera2.CameraAccessException {}
    public void createConstrainedHighSpeedCaptureSession(java.util.List<android.view.Surface> p0, android.hardware.camera2.CameraCaptureSession.StateCallback p1, android.os.Handler p2) throws android.hardware.camera2.CameraAccessException {}
    public void createCustomCaptureSession(android.hardware.camera2.params.InputConfiguration p0, java.util.List<android.hardware.camera2.params.OutputConfiguration> p1, int p2, android.hardware.camera2.CameraCaptureSession.StateCallback p3, android.os.Handler p4) throws android.hardware.camera2.CameraAccessException {}
    public void createExtensionSession(android.hardware.camera2.params.ExtensionSessionConfiguration p0) throws android.hardware.camera2.CameraAccessException {}
    public android.hardware.camera2.CaptureRequest.Builder createReprocessCaptureRequest(android.hardware.camera2.TotalCaptureResult p0) throws android.hardware.camera2.CameraAccessException { return null; }
    public void createReprocessableCaptureSession(android.hardware.camera2.params.InputConfiguration p0, java.util.List<android.view.Surface> p1, android.hardware.camera2.CameraCaptureSession.StateCallback p2, android.os.Handler p3) throws android.hardware.camera2.CameraAccessException {}
    public void createReprocessableCaptureSessionByConfigurations(android.hardware.camera2.params.InputConfiguration p0, java.util.List<android.hardware.camera2.params.OutputConfiguration> p1, android.hardware.camera2.CameraCaptureSession.StateCallback p2, android.os.Handler p3) throws android.hardware.camera2.CameraAccessException {}
    protected void finalize() throws java.lang.Throwable {}
    public void finalizeOutputConfigs(java.util.List<android.hardware.camera2.params.OutputConfiguration> p0) throws android.hardware.camera2.CameraAccessException {}
    public void flush() throws android.hardware.camera2.CameraAccessException {}
    public android.hardware.camera2.impl.CameraDeviceImpl.CameraDeviceCallbacks getCallbacks() { return null; }
    public int getCameraAudioRestriction() throws android.hardware.camera2.CameraAccessException { return 0; }
    public java.lang.String getId() { return null; }
    public boolean isPrimaryClient() { return false; }
    public boolean isSessionConfigurationSupported(android.hardware.camera2.params.SessionConfiguration p0) throws android.hardware.camera2.CameraAccessException, java.lang.UnsupportedOperationException, java.lang.IllegalArgumentException { return false; }
    public void onClientSharedAccessPriorityChanged(boolean p0) {}
    public void onDeviceError(int p0, android.hardware.camera2.impl.CaptureResultExtras p1) {}
    public void onDeviceIdle() {}
    public void prepare(int p0, android.view.Surface p1) throws android.hardware.camera2.CameraAccessException {}
    public void prepare(android.view.Surface p0) throws android.hardware.camera2.CameraAccessException {}
    public void setCameraAudioRestriction(int p0) throws android.hardware.camera2.CameraAccessException {}
    public void setRemoteDevice(android.hardware.camera2.ICameraDeviceUser p0) throws android.hardware.camera2.CameraAccessException {}
    public void setRemoteFailure(android.os.ServiceSpecificException p0) {}
    public int setRepeatingBurst(java.util.List<android.hardware.camera2.CaptureRequest> p0, android.hardware.camera2.impl.CaptureCallback p1, java.util.concurrent.Executor p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public int setRepeatingRequest(android.hardware.camera2.CaptureRequest p0, android.hardware.camera2.impl.CaptureCallback p1, java.util.concurrent.Executor p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public void setSessionListener(android.hardware.camera2.impl.CameraDeviceImpl.StateCallbackKK p0) {}
    public int startStreaming(java.util.List<android.view.Surface> p0, android.hardware.camera2.impl.CaptureCallback p1, java.util.concurrent.Executor p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public void stopRepeating() throws android.hardware.camera2.CameraAccessException {}
    public boolean supportsOfflineProcessing(android.view.Surface p0) { return false; }
    public android.hardware.camera2.CameraOfflineSession switchToOffline(java.util.Collection<android.view.Surface> p0, java.util.concurrent.Executor p1, android.hardware.camera2.CameraOfflineSession.CameraOfflineSessionCallback p2) throws android.hardware.camera2.CameraAccessException { return null; }
    public void tearDown(android.view.Surface p0) throws android.hardware.camera2.CameraAccessException {}
    public void updateOutputConfiguration(android.hardware.camera2.params.OutputConfiguration p0) throws android.hardware.camera2.CameraAccessException {}
    public void updateOutputConfigurations(java.util.List<android.hardware.camera2.params.OutputConfiguration> p0) throws android.hardware.camera2.CameraAccessException {}

    public class CameraDeviceCallbacks extends android.hardware.camera2.ICameraDeviceCallbacks.Stub {
        public CameraDeviceCallbacks(android.hardware.camera2.impl.CameraDeviceImpl p0) { super(); }
        private android.hardware.camera2.impl.PhysicalCaptureResultInfo[] readMetadata(android.hardware.camera2.impl.PhysicalCaptureResultInfo[] p0) { return null; }
        private void sendOnMultiResolutionOutputStarted(android.hardware.camera2.CaptureRequest p0, long p1, long p2, long p3, android.hardware.camera2.impl.MultiResConcurrentReadersStartInfo[] p4) {}
        public android.os.IBinder asBinder() { return null; }
        public void onCaptureStarted(android.hardware.camera2.impl.CaptureResultExtras p0, long p1) {}
        public void onClientSharedAccessPriorityChanged(boolean p0) {}
        public void onDeviceError(int p0, android.hardware.camera2.impl.CaptureResultExtras p1) {}
        public void onDeviceIdle() {}
        public void onPrepared(int p0) {}
        public void onRepeatingRequestError(long p0, int p1) {}
        public void onRequestQueueEmpty() {}
        public void onResultReceived(android.hardware.camera2.CameraMetadataInfo p0, android.hardware.camera2.impl.CaptureResultExtras p1, android.hardware.camera2.impl.PhysicalCaptureResultInfo[] p2) throws android.os.RemoteException {}
    }

    private static class CameraHandlerExecutor implements java.util.concurrent.Executor {
        private final android.os.Handler mHandler = null;
        public CameraHandlerExecutor(android.os.Handler p0) {}
        public void execute(java.lang.Runnable p0) {}
    }

    private class ClientStateCallback extends android.hardware.camera2.CameraDevice.StateCallback {
        private final java.util.concurrent.Executor mClientExecutor = null;
        private final android.hardware.camera2.CameraDevice.StateCallback mClientStateCallback = null;
        private ClientStateCallback(android.hardware.camera2.impl.CameraDeviceImpl p0, java.util.concurrent.Executor p1, android.hardware.camera2.CameraDevice.StateCallback p2) { super(); }
        public void onClientSharedAccessPriorityChanged(android.hardware.camera2.CameraDevice p0, boolean p1) {}
        public void onClosed(android.hardware.camera2.CameraDevice p0) {}
        public void onDisconnected(android.hardware.camera2.CameraDevice p0) {}
        public void onError(android.hardware.camera2.CameraDevice p0, int p1) {}
        public void onOpened(android.hardware.camera2.CameraDevice p0) {}
        public void onOpenedInSharedMode(android.hardware.camera2.CameraDevice p0, boolean p1) {}
    }

    public static abstract class StateCallbackKK extends android.hardware.camera2.CameraDevice.StateCallback {
        public StateCallbackKK() { super(); }
        public void onActive(android.hardware.camera2.CameraDevice p0) {}
        public void onBusy(android.hardware.camera2.CameraDevice p0) {}
        public void onIdle(android.hardware.camera2.CameraDevice p0) {}
        public void onRequestQueueEmpty() {}
        public void onSurfacePrepared(android.view.Surface p0) {}
        public void onUnconfigured(android.hardware.camera2.CameraDevice p0) {}
    }
}
