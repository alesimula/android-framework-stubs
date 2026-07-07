package android.graphics;

public class YuvImage {
    private static final int WORKING_COMPRESS_STORAGE = 4096;
    private static final java.lang.String[] sSupportedFormats = null;
    private static final android.graphics.ColorSpace.Named[] sSupportedJpegRHdrColorSpaces = null;
    private static final android.graphics.ColorSpace.Named[] sSupportedJpegRSdrColorSpaces = null;
    private android.graphics.ColorSpace mColorSpace;
    private byte[] mData;
    private int mFormat;
    private int mHeight;
    private int[] mStrides;
    private int mWidth;
    public YuvImage(byte[] p0, int p1, int p2, int p3, int[] p4) {}
    public YuvImage(byte[] p0, int p1, int p2, int p3, int[] p4, android.graphics.ColorSpace p5) {}
    private void adjustRectangle(android.graphics.Rect p0) {}
    private int[] calculateStrides(int p0, int p1) { return null; }
    private static boolean isSupportedJpegRColorSpace(boolean p0, int p1) { return false; }
    private static native boolean nativeCompressToJpeg(byte[] p0, int p1, int p2, int p3, int[] p4, int[] p5, int p6, java.io.OutputStream p7, byte[] p8);
    private static native boolean nativeCompressToJpegR(byte[] p0, int p1, byte[] p2, int p3, int p4, int p5, int p6, java.io.OutputStream p7, byte[] p8, byte[] p9, int[] p10, int[] p11);
    private static java.lang.String printSupportedFormats() { return null; }
    private static java.lang.String printSupportedJpegRColorSpaces(boolean p0) { return null; }
    int[] calculateOffsets(int p0, int p1) { return null; }
    public boolean compressToJpeg(android.graphics.Rect p0, int p1, java.io.OutputStream p2) { return false; }
    public boolean compressToJpegR(android.graphics.YuvImage p0, int p1, java.io.OutputStream p2) { return false; }
    public boolean compressToJpegR(android.graphics.YuvImage p0, int p1, java.io.OutputStream p2, byte[] p3) { return false; }
    public android.graphics.ColorSpace getColorSpace() { return null; }
    public int getHeight() { return 0; }
    public int[] getStrides() { return null; }
    public int getWidth() { return 0; }
    public byte[] getYuvData() { return null; }
    public int getYuvFormat() { return 0; }
}
