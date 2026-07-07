package android.graphics;

public class BitmapFactory {
    private static final int DECODE_BUFFER_SIZE = 16384;
    public BitmapFactory() {}
    public static android.graphics.Bitmap decodeByteArray(byte[] p0, int p1, int p2) { return null; }
    public static android.graphics.Bitmap decodeByteArray(byte[] p0, int p1, int p2, android.graphics.BitmapFactory.Options p3) { return null; }
    public static android.graphics.Bitmap decodeFile(java.lang.String p0) { return null; }
    public static android.graphics.Bitmap decodeFile(java.lang.String p0, android.graphics.BitmapFactory.Options p1) { return null; }
    public static android.graphics.Bitmap decodeFileDescriptor(java.io.FileDescriptor p0) { return null; }
    public static android.graphics.Bitmap decodeFileDescriptor(java.io.FileDescriptor p0, android.graphics.Rect p1, android.graphics.BitmapFactory.Options p2) { return null; }
    public static android.graphics.Bitmap decodeResource(android.content.res.Resources p0, int p1) { return null; }
    public static android.graphics.Bitmap decodeResource(android.content.res.Resources p0, int p1, android.graphics.BitmapFactory.Options p2) { return null; }
    public static android.graphics.Bitmap decodeResourceStream(android.content.res.Resources p0, android.util.TypedValue p1, java.io.InputStream p2, android.graphics.Rect p3, android.graphics.BitmapFactory.Options p4) { return null; }
    public static android.graphics.Bitmap decodeStream(java.io.InputStream p0) { return null; }
    public static android.graphics.Bitmap decodeStream(java.io.InputStream p0, android.graphics.Rect p1, android.graphics.BitmapFactory.Options p2) { return null; }
    private static android.graphics.Bitmap decodeStreamInternal(java.io.InputStream p0, android.graphics.Rect p1, android.graphics.BitmapFactory.Options p2) { return null; }
    private static native android.graphics.Bitmap nativeDecodeAsset(long p0, android.graphics.Rect p1, android.graphics.BitmapFactory.Options p2, long p3, long p4);
    private static native android.graphics.Bitmap nativeDecodeByteArray(byte[] p0, int p1, int p2, android.graphics.BitmapFactory.Options p3, long p4, long p5);
    private static native android.graphics.Bitmap nativeDecodeFileDescriptor(java.io.FileDescriptor p0, android.graphics.Rect p1, android.graphics.BitmapFactory.Options p2, long p3, long p4);
    private static native android.graphics.Bitmap nativeDecodeStream(java.io.InputStream p0, byte[] p1, android.graphics.Rect p2, android.graphics.BitmapFactory.Options p3, long p4, long p5);
    private static native boolean nativeIsSeekable(java.io.FileDescriptor p0);
    private static void setDensityFromOptions(android.graphics.Bitmap p0, android.graphics.BitmapFactory.Options p1) {}

    public static class Options {
        public android.graphics.Bitmap inBitmap;
        public int inDensity;
        public boolean inDither;
        @java.lang.Deprecated
        public boolean inInputShareable;
        public boolean inJustDecodeBounds;
        public boolean inMutable;
        @java.lang.Deprecated
        public boolean inPreferQualityOverSpeed;
        public android.graphics.ColorSpace inPreferredColorSpace;
        public android.graphics.Bitmap.Config inPreferredConfig;
        public boolean inPremultiplied;
        @java.lang.Deprecated
        public boolean inPurgeable;
        public int inSampleSize;
        public boolean inScaled;
        public int inScreenDensity;
        public int inTargetDensity;
        public byte[] inTempStorage;
        @java.lang.Deprecated
        public boolean mCancel;
        public android.graphics.ColorSpace outColorSpace;
        public android.graphics.Bitmap.Config outConfig;
        public int outHeight;
        public java.lang.String outMimeType;
        public int outWidth;
        public Options() {}
        static long nativeColorSpace(android.graphics.BitmapFactory.Options p0) { return 0L; }
        static long nativeInBitmap(android.graphics.BitmapFactory.Options p0) { return 0L; }
        static void validate(android.graphics.BitmapFactory.Options p0) {}
        @java.lang.Deprecated
        public void requestCancelDecode() {}
    }
}
