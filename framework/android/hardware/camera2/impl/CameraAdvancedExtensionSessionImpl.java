package android.hardware.camera2.impl;

public final class CameraAdvancedExtensionSessionImpl extends android.hardware.camera2.CameraExtensionSession {
    private static final java.lang.String TAG = "CameraAdvancedExtensionSessionImpl";
    private android.hardware.camera2.extension.IAdvancedExtenderImpl mAdvancedExtender;
    private final android.hardware.camera2.CameraExtensionSession.StateCallback mCallbacks = null;
    private final java.util.HashMap<android.view.Surface, android.hardware.camera2.extension.CameraOutputConfig> mCameraConfigMap = null;
    private android.hardware.camera2.CameraDevice mCameraDevice;
    private android.hardware.camera2.CameraCaptureSession mCaptureSession;
    private final java.util.Map<java.lang.String, android.hardware.camera2.impl.CameraMetadataNative> mCharacteristicsMap = null;
    private android.hardware.camera2.params.OutputConfiguration mClientCaptureOutputConfig;
    private android.view.Surface mClientCaptureSurface;
    private android.hardware.camera2.params.OutputConfiguration mClientPostviewOutputConfig;
    private android.view.Surface mClientPostviewSurface;
    private android.hardware.camera2.params.OutputConfiguration mClientRepeatingRequestOutputConfig;
    private android.view.Surface mClientRepeatingRequestSurface;
    private final android.content.Context mContext = null;
    private final java.util.concurrent.Executor mExecutor = null;
    private int mExtensionType;
    private final android.os.Handler mHandler = null;
    private final android.os.HandlerThread mHandlerThread = null;
    private final android.hardware.camera2.impl.CameraAdvancedExtensionSessionImpl.InitializeSessionHandler mInitializeHandler = null;
    private boolean mInitialized;
    final java.lang.Object mInterfaceLock = null;
    private final java.util.HashMap<java.lang.Integer, android.media.ImageReader> mReaderMap = null;
    private android.hardware.camera2.impl.CameraAdvancedExtensionSessionImpl.RequestProcessor mRequestProcessor;
    private boolean mSessionClosed;
    private final int mSessionId = 0;
    private final android.hardware.camera2.CaptureRequest mSessionParameters = null;
    private android.hardware.camera2.extension.ISessionProcessorImpl mSessionProcessor;
    private final android.hardware.camera2.utils.ExtensionSessionStatsAggregator mStatsAggregator = null;
    private android.os.IBinder mToken;
    private CameraAdvancedExtensionSessionImpl(android.content.Context p0, android.hardware.camera2.extension.IAdvancedExtenderImpl p1, android.hardware.camera2.impl.CameraDeviceImpl p2, java.util.Map<java.lang.String, android.hardware.camera2.impl.CameraMetadataNative> p3, android.hardware.camera2.params.OutputConfiguration p4, android.hardware.camera2.params.OutputConfiguration p5, android.hardware.camera2.params.OutputConfiguration p6, android.hardware.camera2.CaptureRequest p7, android.hardware.camera2.CameraExtensionSession.StateCallback p8, java.util.concurrent.Executor p9, int p10, android.os.IBinder p11, int p12) { super(); }
    public static android.hardware.camera2.impl.CameraAdvancedExtensionSessionImpl createCameraAdvancedExtensionSession(android.hardware.camera2.impl.CameraDeviceImpl p0, java.util.Map<java.lang.String, android.hardware.camera2.CameraCharacteristics> p1, android.content.Context p2, android.hardware.camera2.params.ExtensionSessionConfiguration p3, int p4, android.os.IBinder p5) throws android.hardware.camera2.CameraAccessException, android.os.RemoteException { return null; }
    private static android.hardware.camera2.CaptureRequest initializeCaptureRequest(android.hardware.camera2.CameraDevice p0, android.hardware.camera2.extension.Request p1, java.util.HashMap<android.view.Surface, android.hardware.camera2.extension.CameraOutputConfig> p2) throws android.hardware.camera2.CameraAccessException { return null; }
    private static android.hardware.camera2.extension.OutputSurface initializeParcelable(android.hardware.camera2.params.OutputConfiguration p0) { return null; }
    private static android.hardware.camera2.extension.ParcelCaptureResult initializeParcelable(android.hardware.camera2.CaptureResult p0) { return null; }
    private static android.hardware.camera2.extension.ParcelTotalCaptureResult initializeParcelable(android.hardware.camera2.TotalCaptureResult p0) { return null; }
    private android.view.Surface initializeSurface(android.hardware.camera2.extension.CameraOutputConfig p0) { return null; }
    private void notifyConfigurationFailure() {}
    private void validateCaptureRequestTargets(android.hardware.camera2.CaptureRequest p0) {}
    public int capture(android.hardware.camera2.CaptureRequest p0, java.util.concurrent.Executor p1, android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public void close() throws android.hardware.camera2.CameraAccessException {}
    public void commitStats() {}
    public android.hardware.camera2.CameraDevice getDevice() { return null; }
    public android.hardware.camera2.CameraExtensionSession.StillCaptureLatency getRealtimeStillCaptureLatency() throws android.hardware.camera2.CameraAccessException { return null; }
    public void initialize() throws android.hardware.camera2.CameraAccessException, android.os.RemoteException {}
    public void release(boolean p0) {}
    public int setRepeatingRequest(android.hardware.camera2.CaptureRequest p0, java.util.concurrent.Executor p1, android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public void stopRepeating() throws android.hardware.camera2.CameraAccessException {}

    private final class CaptureCallbackHandler extends android.hardware.camera2.CameraCaptureSession.CaptureCallback {
        private final android.hardware.camera2.extension.IRequestCallback mCallback = null;
        public CaptureCallbackHandler(android.hardware.camera2.impl.CameraAdvancedExtensionSessionImpl p0, android.hardware.camera2.extension.IRequestCallback p1) { super(); }
        public void onCaptureBufferLost(android.hardware.camera2.CameraCaptureSession p0, android.hardware.camera2.CaptureRequest p1, android.view.Surface p2, long p3) {}
        public void onCaptureCompleted(android.hardware.camera2.CameraCaptureSession p0, android.hardware.camera2.CaptureRequest p1, android.hardware.camera2.TotalCaptureResult p2) {}
        public void onCaptureFailed(android.hardware.camera2.CameraCaptureSession p0, android.hardware.camera2.CaptureRequest p1, android.hardware.camera2.CaptureFailure p2) {}
        public void onCaptureProgressed(android.hardware.camera2.CameraCaptureSession p0, android.hardware.camera2.CaptureRequest p1, android.hardware.camera2.CaptureResult p2) {}
        public void onCaptureSequenceAborted(android.hardware.camera2.CameraCaptureSession p0, int p1) {}
        public void onCaptureSequenceCompleted(android.hardware.camera2.CameraCaptureSession p0, int p1, long p2) {}
        public void onCaptureStarted(android.hardware.camera2.CameraCaptureSession p0, android.hardware.camera2.CaptureRequest p1, long p2, long p3) {}
    }

    private static final class ImageReaderHandler implements android.media.ImageReader.OnImageAvailableListener {
        private final android.hardware.camera2.extension.IImageProcessorImpl mIImageProcessor = null;
        private final android.hardware.camera2.extension.OutputConfigId mOutputConfigId = null;
        private final java.lang.String mPhysicalCameraId = null;
        private ImageReaderHandler(int p0, android.hardware.camera2.extension.IImageProcessorImpl p1, java.lang.String p2) {}
        public void onImageAvailable(android.media.ImageReader p0) {}
    }

    private class InitializeSessionHandler extends android.hardware.camera2.extension.IInitializeSessionCallback.Stub {
        private InitializeSessionHandler(android.hardware.camera2.impl.CameraAdvancedExtensionSessionImpl p0) { super(); }
        public void onFailure() {}
        public void onSuccess() {}
    }

    private final class RequestCallbackHandler extends android.hardware.camera2.extension.ICaptureCallback.Stub {
        private final java.lang.String mCameraId = null;
        private final android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback mClientCallbacks = null;
        private final java.util.concurrent.Executor mClientExecutor = null;
        private final android.hardware.camera2.CaptureRequest mClientRequest = null;
        private RequestCallbackHandler(android.hardware.camera2.impl.CameraAdvancedExtensionSessionImpl p0, android.hardware.camera2.CaptureRequest p1, java.util.concurrent.Executor p2, android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback p3, java.lang.String p4) { super(); }
        public void onCaptureCompleted(long p0, int p1, android.hardware.camera2.impl.CameraMetadataNative p2) {}
        public void onCaptureFailed(int p0) {}
        public void onCaptureProcessFailed(int p0, int p1) {}
        public void onCaptureProcessProgressed(int p0) {}
        public void onCaptureProcessStarted(int p0) {}
        public void onCaptureSequenceAborted(int p0) {}
        public void onCaptureSequenceCompleted(int p0) {}
        public void onCaptureStarted(int p0, long p1) {}
    }

    private final class RequestProcessor extends android.hardware.camera2.extension.IRequestProcessorImpl.Stub {
        private RequestProcessor(android.hardware.camera2.impl.CameraAdvancedExtensionSessionImpl p0) { super(); }
        public void abortCaptures() {}
        public void setImageProcessor(android.hardware.camera2.extension.OutputConfigId p0, android.hardware.camera2.extension.IImageProcessorImpl p1) {}
        public int setRepeating(android.hardware.camera2.extension.Request p0, android.hardware.camera2.extension.IRequestCallback p1) { return 0; }
        public void stopRepeating() {}
        public int submit(android.hardware.camera2.extension.Request p0, android.hardware.camera2.extension.IRequestCallback p1) { return 0; }
        public int submitBurst(java.util.List<android.hardware.camera2.extension.Request> p0, android.hardware.camera2.extension.IRequestCallback p1) { return 0; }
    }

    private class SessionStateHandler extends android.hardware.camera2.CameraCaptureSession.StateCallback {
        private SessionStateHandler(android.hardware.camera2.impl.CameraAdvancedExtensionSessionImpl p0) { super(); }
        public void onClosed(android.hardware.camera2.CameraCaptureSession p0) {}
        public void onConfigureFailed(android.hardware.camera2.CameraCaptureSession p0) {}
        public void onConfigured(android.hardware.camera2.CameraCaptureSession p0) {}
    }
}
