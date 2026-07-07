package android.hardware.camera2.impl;

public final class CameraExtensionSessionImpl extends android.hardware.camera2.CameraExtensionSession {
    private static final int PREVIEW_QUEUE_SIZE = 10;
    private static final java.lang.String TAG = "CameraExtensionSessionImpl";
    private android.hardware.camera2.impl.CameraExtensionSessionImpl.CameraOutputImageCallback mBurstCaptureImageCallback;
    private android.media.ImageReader mBurstCaptureImageReader;
    private final android.hardware.camera2.CameraExtensionSession.StateCallback mCallbacks = null;
    private android.view.Surface mCameraBurstSurface;
    private final android.hardware.camera2.CameraDevice mCameraDevice = null;
    private android.view.Surface mCameraRepeatingSurface;
    private boolean mCaptureResultsSupported;
    private android.hardware.camera2.CameraCaptureSession mCaptureSession;
    private android.view.Surface mClientCaptureSurface;
    private android.view.Surface mClientPostviewSurface;
    private android.view.Surface mClientRepeatingRequestSurface;
    private final android.content.Context mContext = null;
    private final java.util.concurrent.Executor mExecutor = null;
    private int mExtensionType;
    private final android.os.Handler mHandler = null;
    private final android.os.HandlerThread mHandlerThread = null;
    private final android.hardware.camera2.extension.IImageCaptureExtenderImpl mImageExtender = null;
    private android.hardware.camera2.impl.CameraExtensionJpegProcessor mImageJpegProcessor;
    private android.hardware.camera2.extension.ICaptureProcessorImpl mImageProcessor;
    private final android.hardware.camera2.impl.CameraExtensionSessionImpl.InitializeSessionHandler mInitializeHandler = null;
    private boolean mInitialized;
    final java.lang.Object mInterfaceLock = null;
    private boolean mInternalRepeatingRequestEnabled;
    private final android.hardware.camera2.extension.IPreviewExtenderImpl mPreviewExtender = null;
    private android.hardware.camera2.impl.CameraExtensionForwardProcessor mPreviewImageProcessor;
    private int mPreviewProcessorType;
    private android.hardware.camera2.extension.IRequestUpdateProcessorImpl mPreviewRequestUpdateProcessor;
    private android.hardware.camera2.impl.CameraExtensionSessionImpl.CameraOutputImageCallback mRepeatingRequestImageCallback;
    private android.media.ImageReader mRepeatingRequestImageReader;
    private android.media.ImageWriter mRepeatingRequestImageWriter;
    private boolean mSessionClosed;
    private final int mSessionId = 0;
    private final android.hardware.camera2.utils.ExtensionSessionStatsAggregator mStatsAggregator = null;
    private android.media.ImageReader mStubCaptureImageReader;
    private final java.util.List<android.util.Size> mSupportedPreviewSizes = null;
    private final java.util.Set<android.hardware.camera2.CaptureRequest.Key> mSupportedRequestKeys = null;
    private final java.util.Set<android.hardware.camera2.CaptureResult.Key> mSupportedResultKeys = null;
    private android.os.IBinder mToken;
    public CameraExtensionSessionImpl(android.content.Context p0, android.hardware.camera2.extension.IImageCaptureExtenderImpl p1, android.hardware.camera2.extension.IPreviewExtenderImpl p2, java.util.List<android.util.Size> p3, android.hardware.camera2.impl.CameraDeviceImpl p4, android.view.Surface p5, android.view.Surface p6, android.view.Surface p7, android.hardware.camera2.CameraExtensionSession.StateCallback p8, java.util.concurrent.Executor p9, int p10, android.os.IBinder p11, java.util.Set<android.hardware.camera2.CaptureRequest.Key> p12, java.util.Set<android.hardware.camera2.CaptureResult.Key> p13, int p14) { super(); }
    private java.util.ArrayList<android.hardware.camera2.extension.CaptureStageImpl> compileInitialRequestList() { return null; }
    private java.util.List<android.hardware.camera2.CaptureRequest> createBurstRequest(android.hardware.camera2.CameraDevice p0, java.util.List<android.hardware.camera2.extension.CaptureStageImpl> p1, android.hardware.camera2.CaptureRequest p2, android.view.Surface p3, int p4, java.util.Map<android.hardware.camera2.CaptureRequest, java.lang.Integer> p5) { return null; }
    public static android.hardware.camera2.impl.CameraExtensionSessionImpl createCameraExtensionSession(android.hardware.camera2.impl.CameraDeviceImpl p0, java.util.Map<java.lang.String, android.hardware.camera2.CameraCharacteristics> p1, android.content.Context p2, android.hardware.camera2.params.ExtensionSessionConfiguration p3, int p4, android.os.IBinder p5) throws android.hardware.camera2.CameraAccessException, android.os.RemoteException { return null; }
    private android.hardware.camera2.CaptureRequest createRequest(android.hardware.camera2.CameraDevice p0, java.util.List<android.hardware.camera2.extension.CaptureStageImpl> p1, android.view.Surface p2, int p3) throws android.hardware.camera2.CameraAccessException { return null; }
    private android.hardware.camera2.CaptureRequest createRequest(android.hardware.camera2.CameraDevice p0, java.util.List<android.hardware.camera2.extension.CaptureStageImpl> p1, android.view.Surface p2, int p3, android.hardware.camera2.CaptureRequest p4) throws android.hardware.camera2.CameraAccessException { return null; }
    private static android.util.Size findSmallestAspectMatchedSize(java.util.List<android.util.Size> p0, android.util.Size p1) { return null; }
    private void finishPipelineInitialization() throws android.os.RemoteException {}
    private void initializeBurstCapturePipeline() throws android.os.RemoteException {}
    private android.hardware.camera2.impl.CameraMetadataNative initializeFilteredResults(android.hardware.camera2.TotalCaptureResult p0) { return null; }
    private static android.hardware.camera2.extension.ParcelImage initializeParcelImage(android.media.Image p0) { return null; }
    private static java.util.List<android.hardware.camera2.extension.CaptureBundle> initializeParcelable(java.util.HashMap<java.lang.Integer, android.util.Pair<android.media.Image, android.hardware.camera2.TotalCaptureResult>> p0, java.lang.Integer p1, java.lang.Byte p2) { return null; }
    private void initializeRepeatingRequestPipeline() throws android.os.RemoteException {}
    private static int nativeGetSurfaceFormat(android.view.Surface p0) { return 0; }
    private void notifyConfigurationFailure() {}
    private void notifyConfigurationSuccess() {}
    private void setInitialCaptureRequest(java.util.List<android.hardware.camera2.extension.CaptureStageImpl> p0, android.hardware.camera2.impl.CameraExtensionSessionImpl.InitialRequestHandler p1) throws android.hardware.camera2.CameraAccessException {}
    private int setRepeatingRequest(android.hardware.camera2.extension.CaptureStageImpl p0, android.hardware.camera2.CameraCaptureSession.CaptureCallback p1) throws android.hardware.camera2.CameraAccessException { return 0; }
    private int setRepeatingRequest(android.hardware.camera2.extension.CaptureStageImpl p0, android.hardware.camera2.CameraCaptureSession.CaptureCallback p1, android.hardware.camera2.CaptureRequest p2) throws android.hardware.camera2.CameraAccessException { return 0; }
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

    private class BurstRequestHandler extends android.hardware.camera2.CameraCaptureSession.CaptureCallback {
        private final android.hardware.camera2.impl.CameraExtensionSessionImpl.CameraOutputImageCallback mBurstImageCallback = null;
        private final android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback mCallbacks = null;
        private boolean mCaptureFailed;
        private android.util.LongSparseArray<android.util.Pair<android.media.Image, java.lang.Integer>> mCapturePendingMap;
        private final java.util.HashMap<android.hardware.camera2.CaptureRequest, java.lang.Integer> mCaptureRequestMap = null;
        private android.hardware.camera2.impl.CameraExtensionSessionImpl.CaptureResultHandler mCaptureResultHandler;
        private java.util.HashMap<java.lang.Integer, android.util.Pair<android.media.Image, android.hardware.camera2.TotalCaptureResult>> mCaptureStageMap;
        private final android.hardware.camera2.CaptureRequest mClientRequest = null;
        private final java.util.concurrent.Executor mExecutor = null;
        private android.hardware.camera2.impl.CameraExtensionSessionImpl.BurstRequestHandler.ImageCallback mImageCallback;
        public BurstRequestHandler(android.hardware.camera2.CaptureRequest p0, java.util.concurrent.Executor p1, android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback p2, java.util.HashMap<android.hardware.camera2.CaptureRequest, java.lang.Integer> p3, android.hardware.camera2.impl.CameraExtensionSessionImpl.CameraOutputImageCallback p4) { super(); }
        private void checkAndFireBurstProcessing() {}
        private void notifyCaptureFailed() {}
        public void onCaptureBufferLost(android.hardware.camera2.CameraCaptureSession p0, android.hardware.camera2.CaptureRequest p1, android.view.Surface p2, long p3) {}
        public void onCaptureCompleted(android.hardware.camera2.CameraCaptureSession p0, android.hardware.camera2.CaptureRequest p1, android.hardware.camera2.TotalCaptureResult p2) {}
        public void onCaptureFailed(android.hardware.camera2.CameraCaptureSession p0, android.hardware.camera2.CaptureRequest p1, android.hardware.camera2.CaptureFailure p2) {}
        public void onCaptureSequenceAborted(android.hardware.camera2.CameraCaptureSession p0, int p1) {}
        public void onCaptureSequenceCompleted(android.hardware.camera2.CameraCaptureSession p0, int p1, long p2) {}
        public void onCaptureStarted(android.hardware.camera2.CameraCaptureSession p0, android.hardware.camera2.CaptureRequest p1, long p2, long p3) {}

        private class ImageCallback implements android.hardware.camera2.impl.CameraExtensionSessionImpl.OnImageAvailableListener {
            private ImageCallback(android.hardware.camera2.impl.CameraExtensionSessionImpl.BurstRequestHandler p0) {}
            public void onImageAvailable(android.media.ImageReader p0, android.media.Image p1) {}
            public void onImageDropped(long p0) {}
        }
    }

    private class CameraOutputImageCallback implements android.media.ImageReader.OnImageAvailableListener, java.io.Closeable {
        private java.util.HashMap<java.lang.Long, android.util.Pair<android.media.Image, android.hardware.camera2.impl.CameraExtensionSessionImpl.OnImageAvailableListener>> mImageListenerMap;
        private final android.media.ImageReader mImageReader = null;
        private boolean mOutOfBuffers;
        private final boolean mPruneOlderBuffers = false;
        CameraOutputImageCallback(android.hardware.camera2.impl.CameraExtensionSessionImpl p0, android.media.ImageReader p1, boolean p2) {}
        private void notifyDroppedImages(long p0) {}
        public void close() {}
        public void onImageAvailable(android.media.ImageReader p0) {}
        public void registerListener(java.lang.Long p0, android.hardware.camera2.impl.CameraExtensionSessionImpl.OnImageAvailableListener p1) {}
    }

    private class CaptureResultHandler extends android.hardware.camera2.extension.IProcessResultImpl.Stub {
        private final android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback mCallbacks = null;
        private final android.hardware.camera2.CaptureRequest mClientRequest = null;
        private final java.util.concurrent.Executor mExecutor = null;
        private final int mRequestId = 0;
        public CaptureResultHandler(android.hardware.camera2.impl.CameraExtensionSessionImpl p0, android.hardware.camera2.CaptureRequest p1, java.util.concurrent.Executor p2, android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback p3, int p4) { super(); }
        public void onCaptureCompleted(long p0, android.hardware.camera2.impl.CameraMetadataNative p1) {}
        public void onCaptureProcessProgressed(int p0) {}
    }

    private class CloseRequestHandler extends android.hardware.camera2.CameraCaptureSession.CaptureCallback {
        private final android.hardware.camera2.impl.CameraExtensionSessionImpl.CameraOutputImageCallback mImageCallback = null;
        public CloseRequestHandler(android.hardware.camera2.impl.CameraExtensionSessionImpl p0, android.hardware.camera2.impl.CameraExtensionSessionImpl.CameraOutputImageCallback p1) { super(); }
        public void onCaptureStarted(android.hardware.camera2.CameraCaptureSession p0, android.hardware.camera2.CaptureRequest p1, long p2, long p3) {}
    }

    private class ImageLoopbackCallback implements android.hardware.camera2.impl.CameraExtensionSessionImpl.OnImageAvailableListener {
        private ImageLoopbackCallback(android.hardware.camera2.impl.CameraExtensionSessionImpl p0) {}
        public void onImageAvailable(android.media.ImageReader p0, android.media.Image p1) {}
        public void onImageDropped(long p0) {}
    }

    private class InitializeSessionHandler extends android.hardware.camera2.extension.IInitializeSessionCallback.Stub {
        private InitializeSessionHandler(android.hardware.camera2.impl.CameraExtensionSessionImpl p0) { super(); }
        public void onFailure() {}
        public void onSuccess() {}
    }

    private class InitialRequestHandler extends android.hardware.camera2.CameraCaptureSession.CaptureCallback {
        private final android.hardware.camera2.impl.CameraExtensionSessionImpl.CameraOutputImageCallback mImageCallback = null;
        public InitialRequestHandler(android.hardware.camera2.impl.CameraExtensionSessionImpl p0, android.hardware.camera2.impl.CameraExtensionSessionImpl.CameraOutputImageCallback p1) { super(); }
        public void onCaptureFailed(android.hardware.camera2.CameraCaptureSession p0, android.hardware.camera2.CaptureRequest p1, android.hardware.camera2.CaptureFailure p2) {}
        public void onCaptureSequenceAborted(android.hardware.camera2.CameraCaptureSession p0, int p1) {}
        public void onCaptureSequenceCompleted(android.hardware.camera2.CameraCaptureSession p0, int p1, long p2) {}
        public void onCaptureStarted(android.hardware.camera2.CameraCaptureSession p0, android.hardware.camera2.CaptureRequest p1, long p2, long p3) {}
    }

    private static interface OnImageAvailableListener {
        public void onImageAvailable(android.media.ImageReader p0, android.media.Image p1);
        public void onImageDropped(long p0);
    }

    private class PreviewRequestHandler extends android.hardware.camera2.CameraCaptureSession.CaptureCallback {
        private final android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback mCallbacks = null;
        private android.hardware.camera2.impl.CameraExtensionSessionImpl.CaptureResultHandler mCaptureResultHandler;
        private final boolean mClientNotificationsEnabled = false;
        private final android.hardware.camera2.CaptureRequest mClientRequest = null;
        private final java.util.concurrent.Executor mExecutor = null;
        private android.hardware.camera2.impl.CameraExtensionSessionImpl.OnImageAvailableListener mImageCallback;
        private android.util.LongSparseArray<android.util.Pair<android.media.Image, android.hardware.camera2.TotalCaptureResult>> mPendingResultMap;
        private final android.hardware.camera2.impl.CameraExtensionSessionImpl.CameraOutputImageCallback mRepeatingImageCallback = null;
        private boolean mRequestUpdatedNeeded;
        private final boolean mSingleCapture = false;
        public PreviewRequestHandler(android.hardware.camera2.impl.CameraExtensionSessionImpl p0, android.hardware.camera2.CaptureRequest p1, java.util.concurrent.Executor p2, android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback p3, android.hardware.camera2.impl.CameraExtensionSessionImpl.CameraOutputImageCallback p4) { super(); }
        public PreviewRequestHandler(android.hardware.camera2.impl.CameraExtensionSessionImpl p0, android.hardware.camera2.CaptureRequest p1, java.util.concurrent.Executor p2, android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback p3, android.hardware.camera2.impl.CameraExtensionSessionImpl.CameraOutputImageCallback p4, boolean p5) { super(); }
        private java.lang.Long calculatePruneThreshold(android.util.LongSparseArray<android.util.Pair<android.media.Image, android.hardware.camera2.TotalCaptureResult>> p0) { return null; }
        private void discardPendingRepeatingResults(int p0, android.util.LongSparseArray<android.util.Pair<android.media.Image, android.hardware.camera2.TotalCaptureResult>> p1, boolean p2) {}
        private void resumeInternalRepeatingRequest(boolean p0) {}
        public void onCaptureCompleted(android.hardware.camera2.CameraCaptureSession p0, android.hardware.camera2.CaptureRequest p1, android.hardware.camera2.TotalCaptureResult p2) {}
        public void onCaptureFailed(android.hardware.camera2.CameraCaptureSession p0, android.hardware.camera2.CaptureRequest p1, android.hardware.camera2.CaptureFailure p2) {}
        public void onCaptureSequenceAborted(android.hardware.camera2.CameraCaptureSession p0, int p1) {}
        public void onCaptureSequenceCompleted(android.hardware.camera2.CameraCaptureSession p0, int p1, long p2) {}
        public void onCaptureStarted(android.hardware.camera2.CameraCaptureSession p0, android.hardware.camera2.CaptureRequest p1, long p2, long p3) {}

        private class ImageForwardCallback implements android.hardware.camera2.impl.CameraExtensionSessionImpl.OnImageAvailableListener {
            private final android.media.ImageWriter mOutputWriter = null;
            public ImageForwardCallback(android.hardware.camera2.impl.CameraExtensionSessionImpl.PreviewRequestHandler p0, android.media.ImageWriter p1) {}
            public void onImageAvailable(android.media.ImageReader p0, android.media.Image p1) {}
            public void onImageDropped(long p0) {}
        }

        private class ImageProcessCallback implements android.hardware.camera2.impl.CameraExtensionSessionImpl.OnImageAvailableListener {
            private ImageProcessCallback(android.hardware.camera2.impl.CameraExtensionSessionImpl.PreviewRequestHandler p0) {}
            public void onImageAvailable(android.media.ImageReader p0, android.media.Image p1) {}
            public void onImageDropped(long p0) {}
        }
    }

    private class SessionStateHandler extends android.hardware.camera2.CameraCaptureSession.StateCallback {
        private SessionStateHandler(android.hardware.camera2.impl.CameraExtensionSessionImpl p0) { super(); }
        public void onClosed(android.hardware.camera2.CameraCaptureSession p0) {}
        public void onConfigureFailed(android.hardware.camera2.CameraCaptureSession p0) {}
        public void onConfigured(android.hardware.camera2.CameraCaptureSession p0) {}
    }
}
