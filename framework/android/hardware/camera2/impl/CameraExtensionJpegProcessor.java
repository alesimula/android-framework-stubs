package android.hardware.camera2.impl;

public class CameraExtensionJpegProcessor implements android.hardware.camera2.extension.ICaptureProcessorImpl {
    private static final int JPEG_APP_SEGMENT_SIZE = 65536;
    private static final int JPEG_QUEUE_SIZE = 1;
    public static final java.lang.String TAG = "CameraExtensionJpeg";
    private int mCaptureFormat;
    private int mFormat;
    private final android.os.Handler mHandler = null;
    private final android.os.HandlerThread mHandlerThread = null;
    private java.util.concurrent.ConcurrentLinkedQueue<android.hardware.camera2.impl.CameraExtensionJpegProcessor.JpegParameters> mJpegParameters;
    private android.view.Surface mOutputSurface;
    private android.media.ImageWriter mOutputWriter;
    private int mPostviewFormat;
    private android.view.Surface mPostviewOutputSurface;
    private android.media.ImageWriter mPostviewOutputWriter;
    private android.hardware.camera2.extension.Size mPostviewResolution;
    private android.media.ImageReader mPostviewYuvReader;
    private final android.hardware.camera2.extension.ICaptureProcessorImpl mProcessor = null;
    private android.hardware.camera2.extension.Size mResolution;
    private android.media.ImageReader mYuvReader;
    public CameraExtensionJpegProcessor(android.hardware.camera2.extension.ICaptureProcessorImpl p0) {}
    private static native int compressJpegFromYUV420pNative(int p0, int p1, java.nio.ByteBuffer p2, int p3, int p4, java.nio.ByteBuffer p5, int p6, int p7, java.nio.ByteBuffer p8, int p9, int p10, java.nio.ByteBuffer p11, int p12, int p13, int p14, int p15, int p16, int p17, int p18);
    private static android.hardware.camera2.impl.CameraExtensionJpegProcessor.JpegParameters getJpegParameters(java.util.List<android.hardware.camera2.extension.CaptureBundle> p0) { return null; }
    private void initializePipeline() throws android.os.RemoteException {}
    private void initializePostviewPipeline() throws android.os.RemoteException {}
    public android.os.IBinder asBinder() { return null; }
    public void close() {}
    public void onImageFormatUpdate(int p0) throws android.os.RemoteException {}
    public void onOutputSurface(android.view.Surface p0, int p1) throws android.os.RemoteException {}
    public void onPostviewOutputSurface(android.view.Surface p0) throws android.os.RemoteException {}
    public void onResolutionUpdate(android.hardware.camera2.extension.Size p0, android.hardware.camera2.extension.Size p1) throws android.os.RemoteException {}
    public void process(java.util.List<android.hardware.camera2.extension.CaptureBundle> p0, android.hardware.camera2.extension.IProcessResultImpl p1, boolean p2) throws android.os.RemoteException {}

    private static final class JpegParameters {
        public int mQuality;
        public int mRotation;
        public java.util.HashSet<java.lang.Long> mTimeStamps;
        private JpegParameters() {}
    }

    private class YuvCallback implements android.media.ImageReader.OnImageAvailableListener {
        private android.media.ImageReader mImageReader;
        private android.media.ImageWriter mImageWriter;
        public YuvCallback(android.hardware.camera2.impl.CameraExtensionJpegProcessor p0, android.media.ImageReader p1, android.media.ImageWriter p2) {}
        public void onImageAvailable(android.media.ImageReader p0) {}
    }
}
