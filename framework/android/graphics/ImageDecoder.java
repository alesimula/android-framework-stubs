package android.graphics;

public final class ImageDecoder implements java.lang.AutoCloseable {
    public static final int ALLOCATOR_DEFAULT = 0;
    public static final int ALLOCATOR_HARDWARE = 3;
    public static final int ALLOCATOR_SHARED_MEMORY = 2;
    public static final int ALLOCATOR_SOFTWARE = 1;
    public static final int MEMORY_POLICY_DEFAULT = 1;
    public static final int MEMORY_POLICY_LOW_RAM = 0;
    private static android.graphics.ImageDecoder.OnHeaderDecodedListener sDefaultProcessListener;
    private static java.lang.ThreadLocal<android.graphics.ImageDecoder.OnHeaderDecodedListener> sDefaultThreadListener;
    private static boolean sIsHevcDecoderSupported;
    private static boolean sIsHevcDecoderSupportedInitialized;
    private static final java.lang.Object sIsHevcDecoderSupportedLock = null;
    private static boolean sIsP010SupportedFlagsInitialized;
    private static boolean sIsP010SupportedForAV1;
    private static boolean sIsP010SupportedForHEVC;
    private static final java.lang.Object sIsP010SupportedLock = null;
    private static final java.lang.Object sListenerLock = null;
    private long mAllocationLimit;
    private int mAllocator;
    private final boolean mAnimated = false;
    private android.content.res.AssetFileDescriptor mAssetFd;
    private final java.util.concurrent.atomic.AtomicBoolean mClosed = null;
    private boolean mConserveMemory;
    private android.graphics.Rect mCropRect;
    private boolean mDecodeAsAlphaMask;
    private final android.graphics.ColorSpace mDefaultColorSpace = null;
    private android.graphics.ColorSpace mDesiredColorSpace;
    private int mDesiredHeight;
    private int mDesiredWidth;
    private final int mHeight = 0;
    private java.io.InputStream mInputStream;
    private final boolean mIsNinePatch = false;
    private final java.lang.String mMimeType = null;
    private boolean mMutable;
    private long mNativePtr;
    private android.graphics.ImageDecoder.OnPartialImageListener mOnPartialImageListener;
    private android.graphics.Rect mOutPaddingRect;
    private boolean mOwnsInputStream;
    private final android.graphics.Rect mPadding = null;
    private android.graphics.PostProcessor mPostProcessor;
    private android.graphics.ImageDecoder.Source mSource;
    private byte[] mTempStorage;
    private boolean mUnpremultipliedRequired;
    private final int mWidth = 0;
    private ImageDecoder(long p0, int p1, int p2, boolean p3, boolean p4, java.lang.String p5, android.graphics.ColorSpace p6, android.graphics.Rect p7) {}
    private void callHeaderDecoded(android.graphics.ImageDecoder.OnHeaderDecodedListener p0, android.graphics.ImageDecoder.Source p1) {}
    private boolean checkForExtended() { return false; }
    private static void checkP010SupportforAV1HEVC() {}
    private void checkState(boolean p0) {}
    private static void checkSubset(int p0, int p1, android.graphics.Rect p2) {}
    private int computeDensity(android.graphics.ImageDecoder.Source p0) { return 0; }
    private static android.graphics.ImageDecoder createFromAsset(android.content.res.AssetManager.AssetInputStream p0, boolean p1, android.graphics.ImageDecoder.Source p2) throws java.io.IOException { return null; }
    private static android.graphics.ImageDecoder createFromAssetFileDescriptor(android.content.res.AssetFileDescriptor p0, boolean p1, android.graphics.ImageDecoder.Source p2) throws java.io.IOException { return null; }
    private static android.graphics.ImageDecoder createFromFile(java.io.File p0, boolean p1, android.graphics.ImageDecoder.Source p2) throws java.io.IOException { return null; }
    private static android.graphics.ImageDecoder createFromStream(java.io.InputStream p0, boolean p1, boolean p2, android.graphics.ImageDecoder.Source p3) throws java.io.IOException { return null; }
    public static android.graphics.ImageDecoder.Source createSource(android.content.ContentResolver p0, android.net.Uri p1) { return null; }
    public static android.graphics.ImageDecoder.Source createSource(android.content.ContentResolver p0, android.net.Uri p1, android.content.res.Resources p2) { return null; }
    public static android.graphics.ImageDecoder.Source createSource(android.content.res.AssetManager p0, java.lang.String p1) { return null; }
    public static android.graphics.ImageDecoder.Source createSource(android.content.res.Resources p0, int p1) { return null; }
    public static android.graphics.ImageDecoder.Source createSource(android.content.res.Resources p0, java.io.InputStream p1) { return null; }
    public static android.graphics.ImageDecoder.Source createSource(android.content.res.Resources p0, java.io.InputStream p1, int p2) { return null; }
    public static android.graphics.ImageDecoder.Source createSource(java.io.File p0) { return null; }
    public static android.graphics.ImageDecoder.Source createSource(java.nio.ByteBuffer p0) { return null; }
    public static android.graphics.ImageDecoder.Source createSource(java.util.concurrent.Callable<android.content.res.AssetFileDescriptor> p0) { return null; }
    public static android.graphics.ImageDecoder.Source createSource(byte[] p0) { return null; }
    public static android.graphics.ImageDecoder.Source createSource(byte[] p0, int p1, int p2) throws java.lang.ArrayIndexOutOfBoundsException { return null; }
    public static android.graphics.Bitmap decodeBitmap(android.graphics.ImageDecoder.Source p0) throws java.io.IOException { return null; }
    public static android.graphics.Bitmap decodeBitmap(android.graphics.ImageDecoder.Source p0, android.graphics.ImageDecoder.OnHeaderDecodedListener p1) throws java.io.IOException { return null; }
    private static android.graphics.Bitmap decodeBitmapImpl(android.graphics.ImageDecoder.Source p0, android.graphics.ImageDecoder.OnHeaderDecodedListener p1) throws java.io.IOException { return null; }
    private android.graphics.Bitmap decodeBitmapInternal() throws java.io.IOException { return null; }
    public static android.graphics.drawable.Drawable decodeDrawable(android.graphics.ImageDecoder.Source p0) throws java.io.IOException { return null; }
    public static android.graphics.drawable.Drawable decodeDrawable(android.graphics.ImageDecoder.Source p0, android.graphics.ImageDecoder.OnHeaderDecodedListener p1) throws java.io.IOException { return null; }
    private static android.graphics.drawable.Drawable decodeDrawableImpl(android.graphics.ImageDecoder.Source p0, android.graphics.ImageDecoder.OnHeaderDecodedListener p1) throws java.io.IOException { return null; }
    public static android.graphics.ImageDecoder.ImageInfo decodeHeader(android.graphics.ImageDecoder.Source p0) throws java.io.IOException { return null; }
    private static java.lang.String describeDecoderForTrace(android.graphics.ImageDecoder p0) { return null; }
    private android.graphics.ColorSpace getColorSpace() { return null; }
    private long getColorSpacePtr() { return 0L; }
    public static android.graphics.ImageDecoder.OnHeaderDecodedListener getDefaultProcessListener() { return null; }
    public static android.graphics.ImageDecoder.OnHeaderDecodedListener getDefaultThreadListener() { return null; }
    private java.lang.String getMimeType() { return null; }
    private android.util.Size getSampledSize(int p0) { return null; }
    private int getTargetDimension(int p0, int p1, int p2) { return 0; }
    private static boolean isHevcDecoderSupported() { return false; }
    public static boolean isMimeTypeSupported(java.lang.String p0) { return false; }
    private static boolean isP010SupportedForAV1() { return false; }
    private static boolean isP010SupportedForHEVC() { return false; }
    private static native void nClose(long p0);
    private static native android.graphics.ImageDecoder nCreate(long p0, boolean p1, android.graphics.ImageDecoder.Source p2) throws java.io.IOException;
    private static native android.graphics.ImageDecoder nCreate(java.io.FileDescriptor p0, long p1, boolean p2, android.graphics.ImageDecoder.Source p3) throws java.io.IOException;
    private static native android.graphics.ImageDecoder nCreate(java.io.InputStream p0, byte[] p1, boolean p2, android.graphics.ImageDecoder.Source p3) throws java.io.IOException;
    private static native android.graphics.ImageDecoder nCreate(java.nio.ByteBuffer p0, int p1, int p2, boolean p3, android.graphics.ImageDecoder.Source p4) throws java.io.IOException;
    private static native android.graphics.ImageDecoder nCreate(byte[] p0, int p1, int p2, boolean p3, android.graphics.ImageDecoder.Source p4) throws java.io.IOException;
    private static native android.graphics.Bitmap nDecodeBitmap(long p0, android.graphics.ImageDecoder p1, int p2, int p3, android.graphics.Rect p4, int p5, int p6, long p7, long p8) throws java.io.IOException;
    private static native android.util.Size nGetSampledSize(long p0, int p1);
    private void onPartialImage(int p0, java.lang.Throwable p1) throws android.graphics.ImageDecoder.DecodeException {}
    private int postProcessAndRelease(android.graphics.Canvas p0) { return 0; }
    private boolean requestedResize() { return false; }
    public static void setDefaultProcessListener(android.graphics.ImageDecoder.OnHeaderDecodedListener p0) {}
    public static void setDefaultThreadListener(android.graphics.ImageDecoder.OnHeaderDecodedListener p0) {}
    private static java.lang.AutoCloseable traceDecoderSource(android.graphics.ImageDecoder p0) { return null; }
    public void close() {}
    protected void finalize() throws java.lang.Throwable {}
    public long getAllocationLimit() { return 0L; }
    public int getAllocator() { return 0; }
    public android.graphics.Rect getCrop() { return null; }
    public int getMemorySizePolicy() { return 0; }
    public android.graphics.ImageDecoder.OnPartialImageListener getOnPartialImageListener() { return null; }
    public android.graphics.PostProcessor getPostProcessor() { return null; }
    public boolean isDecodeAsAlphaMaskEnabled() { return false; }
    public boolean isMutableRequired() { return false; }
    public boolean isUnpremultipliedRequired() { return false; }
    public void setAllocationLimit(long p0) {}
    public void setAllocator(int p0) {}
    public void setCrop(android.graphics.Rect p0) {}
    public void setDecodeAsAlphaMaskEnabled(boolean p0) {}
    public void setMemorySizePolicy(int p0) {}
    public void setMutableRequired(boolean p0) {}
    public void setOnPartialImageListener(android.graphics.ImageDecoder.OnPartialImageListener p0) {}
    public void setOutPaddingRect(android.graphics.Rect p0) {}
    public void setPostProcessor(android.graphics.PostProcessor p0) {}
    public void setTargetColorSpace(android.graphics.ColorSpace p0) {}
    public void setTargetSampleSize(int p0) {}
    public void setTargetSize(int p0, int p1) {}
    public void setUnpremultipliedRequired(boolean p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Allocator {
    }

    public static class AssetInputStreamSource extends android.graphics.ImageDecoder.Source {
        private android.content.res.AssetManager.AssetInputStream mAssetInputStream;
        private final int mDensity = 0;
        private final android.content.res.Resources mResources = null;
        public AssetInputStreamSource(android.content.res.AssetManager.AssetInputStream p0, android.content.res.Resources p1, android.util.TypedValue p2) { super(); }
        public android.graphics.ImageDecoder createImageDecoder(boolean p0) throws java.io.IOException { return null; }
        public int getDensity() { return 0; }
        public android.content.res.Resources getResources() { return null; }
        public java.lang.String toString() { return null; }
    }

    private static class AssetSource extends android.graphics.ImageDecoder.Source {
        private final android.content.res.AssetManager mAssets = null;
        private final java.lang.String mFileName = null;
        AssetSource(android.content.res.AssetManager p0, java.lang.String p1) { super(); }
        public android.graphics.ImageDecoder createImageDecoder(boolean p0) throws java.io.IOException { return null; }
        public java.lang.String toString() { return null; }
    }

    private static class ByteArraySource extends android.graphics.ImageDecoder.Source {
        private final byte[] mData = null;
        private final int mLength = 0;
        private final int mOffset = 0;
        ByteArraySource(byte[] p0, int p1, int p2) { super(); }
        public android.graphics.ImageDecoder createImageDecoder(boolean p0) throws java.io.IOException { return null; }
        public java.lang.String toString() { return null; }
    }

    private static class ByteBufferSource extends android.graphics.ImageDecoder.Source {
        private final java.nio.ByteBuffer mBuffer = null;
        private final int mLength = 0;
        ByteBufferSource(java.nio.ByteBuffer p0) { super(); }
        public android.graphics.ImageDecoder createImageDecoder(boolean p0) throws java.io.IOException { return null; }
        public java.lang.String toString() { return null; }
    }

    private static class CallableSource extends android.graphics.ImageDecoder.Source {
        private final java.util.concurrent.Callable<android.content.res.AssetFileDescriptor> mCallable = null;
        CallableSource(java.util.concurrent.Callable<android.content.res.AssetFileDescriptor> p0) { super(); }
        public android.graphics.ImageDecoder createImageDecoder(boolean p0) throws java.io.IOException { return null; }
        public java.lang.String toString() { return null; }
    }

    private static class ContentResolverSource extends android.graphics.ImageDecoder.Source {
        private final android.content.ContentResolver mResolver = null;
        private final android.content.res.Resources mResources = null;
        private final android.net.Uri mUri = null;
        ContentResolverSource(android.content.ContentResolver p0, android.net.Uri p1, android.content.res.Resources p2) { super(); }
        public android.graphics.ImageDecoder createImageDecoder(boolean p0) throws java.io.IOException { return null; }
        android.content.res.Resources getResources() { return null; }
        public java.lang.String toString() { return null; }
    }

    public static final class DecodeException extends java.io.IOException {
        public static final int GAINMAP_EXTRACTION_FAILED = 4;
        public static final int SOURCE_EXCEPTION = 1;
        public static final int SOURCE_INCOMPLETE = 2;
        public static final int SOURCE_MALFORMED_DATA = 3;
        final int mError = 0;
        final android.graphics.ImageDecoder.Source mSource = null;
        DecodeException(int p0, java.lang.String p1, java.lang.Throwable p2, android.graphics.ImageDecoder.Source p3) { super(); }
        DecodeException(int p0, java.lang.Throwable p1, android.graphics.ImageDecoder.Source p2) { super(); }
        private static java.lang.String errorMessage(int p0, java.lang.Throwable p1) { return null; }
        public int getError() { return 0; }
        public android.graphics.ImageDecoder.Source getSource() { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface Error {
        }
    }

    private static class DecodeOptions {
        public static final int ALPHA_MASK = 1;
        public static final int EXTENDED = 2;
        public static final int HAS_POST_PROCESS = 8;
        public static final int MUTABLE_REQUIRED = 32;
        public static final int NONE = 0;
        public static final int P10_SUPPORTED = 16;
        public static final int PREFER_RAM_OVER_QUALITY = 4;
        public static final int UNPREMULTIPLIED_REQUIRED = 64;
        private DecodeOptions() {}
    }

    private static class FileSource extends android.graphics.ImageDecoder.Source {
        private final java.io.File mFile = null;
        FileSource(java.io.File p0) { super(); }
        public android.graphics.ImageDecoder createImageDecoder(boolean p0) throws java.io.IOException { return null; }
        public java.lang.String toString() { return null; }
    }

    private static final class ImageDecoderSourceTrace implements java.lang.AutoCloseable {
        private final boolean mResourceTracingEnabled = false;
        ImageDecoderSourceTrace(android.graphics.ImageDecoder p0) {}
        public void close() {}
    }

    public static class ImageInfo {
        private final android.graphics.ColorSpace mColorSpace = null;
        private final boolean mIsAnimated = false;
        private final java.lang.String mMimeType = null;
        private final android.util.Size mSize = null;
        private ImageInfo(android.util.Size p0, boolean p1, java.lang.String p2, android.graphics.ColorSpace p3) {}
        public android.graphics.ColorSpace getColorSpace() { return null; }
        public java.lang.String getMimeType() { return null; }
        public android.util.Size getSize() { return null; }
        public boolean isAnimated() { return false; }
    }

    private static class InputStreamSource extends android.graphics.ImageDecoder.Source {
        final int mInputDensity = 0;
        java.io.InputStream mInputStream;
        final android.content.res.Resources mResources = null;
        InputStreamSource(android.content.res.Resources p0, java.io.InputStream p1, int p2) { super(); }
        public android.graphics.ImageDecoder createImageDecoder(boolean p0) throws java.io.IOException { return null; }
        public int getDensity() { return 0; }
        public android.content.res.Resources getResources() { return null; }
        public java.lang.String toString() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MemoryPolicy {
    }

    public static interface OnHeaderDecodedListener {
        public void onHeaderDecoded(android.graphics.ImageDecoder p0, android.graphics.ImageDecoder.ImageInfo p1, android.graphics.ImageDecoder.Source p2);
    }

    public static interface OnPartialImageListener {
        public boolean onPartialImage(android.graphics.ImageDecoder.DecodeException p0);
    }

    private static class ResourceSource extends android.graphics.ImageDecoder.Source {
        private java.lang.Object mLock;
        int mResDensity;
        final int mResId = 0;
        final android.content.res.Resources mResources = null;
        ResourceSource(android.content.res.Resources p0, int p1) { super(); }
        public android.graphics.ImageDecoder createImageDecoder(boolean p0) throws java.io.IOException { return null; }
        public int getDensity() { return 0; }
        public android.content.res.Resources getResources() { return null; }
        public java.lang.String toString() { return null; }
    }

    public static abstract class Source {
        private Source() {}
        final int computeDstDensity() { return 0; }
        abstract android.graphics.ImageDecoder createImageDecoder(boolean p0) throws java.io.IOException;
        int getDensity() { return 0; }
        android.content.res.Resources getResources() { return null; }
    }
}
