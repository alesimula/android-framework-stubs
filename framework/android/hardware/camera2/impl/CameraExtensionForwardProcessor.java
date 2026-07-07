package android.hardware.camera2.impl;

public class CameraExtensionForwardProcessor {
    private static final int FORWARD_QUEUE_SIZE = 3;
    public static final java.lang.String TAG = "CameraExtensionForward";
    private final android.os.Handler mHandler = null;
    private android.media.ImageReader mIntermediateReader;
    private android.view.Surface mIntermediateSurface;
    private boolean mOutputAbandoned;
    private android.view.Surface mOutputSurface;
    private final int mOutputSurfaceFormat = 0;
    private final long mOutputSurfaceUsage = 0L;
    private android.media.ImageWriter mOutputWriter;
    private final android.hardware.camera2.extension.IPreviewImageProcessorImpl mProcessor = null;
    private android.util.Size mResolution;
    public CameraExtensionForwardProcessor(android.hardware.camera2.extension.IPreviewImageProcessorImpl p0, int p1, long p2, android.os.Handler p3) {}
    private void initializePipeline() throws android.os.RemoteException {}
    public void close() {}
    public void onImageFormatUpdate(int p0) {}
    public void onOutputSurface(android.view.Surface p0, int p1) {}
    public void onResolutionUpdate(android.util.Size p0) {}
    public void process(android.hardware.camera2.extension.ParcelImage p0, android.hardware.camera2.TotalCaptureResult p1, android.hardware.camera2.extension.IProcessResultImpl p2) throws android.os.RemoteException {}

    private class ForwardCallback implements android.media.ImageReader.OnImageAvailableListener {
        private ForwardCallback(android.hardware.camera2.impl.CameraExtensionForwardProcessor p0) {}
        public void onImageAvailable(android.media.ImageReader p0) {}
    }
}
