package android.graphics;

public class Picture {
    private static final int WORKING_STREAM_STORAGE = 16384;
    private long mNativePicture;
    private android.graphics.Picture.PictureCanvas mRecordingCanvas;
    private boolean mRequiresHwAcceleration;
    public Picture() {}
    public Picture(long p0) {}
    public Picture(android.graphics.Picture p0) {}
    @java.lang.Deprecated
    public static android.graphics.Picture createFromStream(java.io.InputStream p0) { return null; }
    private static native long nativeBeginRecording(long p0, int p1, int p2);
    private static native long nativeConstructor(long p0);
    private static native long nativeCreateFromStream(java.io.InputStream p0, byte[] p1);
    private static native void nativeDestructor(long p0);
    private static native void nativeDraw(long p0, long p1);
    private static native void nativeEndRecording(long p0);
    private static native int nativeGetHeight(long p0);
    private static native int nativeGetWidth(long p0);
    private static native boolean nativeWriteToStream(long p0, java.io.OutputStream p1, byte[] p2);
    private void verifyValid() {}
    public android.graphics.Canvas beginRecording(int p0, int p1) { return null; }
    public void close() {}
    public void draw(android.graphics.Canvas p0) {}
    public void endRecording() {}
    protected void finalize() throws java.lang.Throwable {}
    public int getHeight() { return 0; }
    public int getWidth() { return 0; }
    public boolean requiresHardwareAcceleration() { return false; }
    @java.lang.Deprecated
    public void writeToStream(java.io.OutputStream p0) {}

    private static class PictureCanvas extends android.graphics.Canvas {
        private final android.graphics.Picture mPicture = null;
        boolean mUsesHwFeature;
        public PictureCanvas(android.graphics.Picture p0, long p1) { super(); }
        public void drawPicture(android.graphics.Picture p0) {}
        protected boolean onHwFeatureInSwMode() { return false; }
        public void setBitmap(android.graphics.Bitmap p0) {}
    }
}
