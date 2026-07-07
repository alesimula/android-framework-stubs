package android.graphics;

public final class Bitmap implements android.os.Parcelable {
    private static final long BLOB_INPLACE_LIMIT = 12288L;
    public static final android.os.Parcelable.Creator<android.graphics.Bitmap> CREATOR = null;
    public static final int DENSITY_NONE = 0;
    private static final long NATIVE_ALLOCATION_SIZE = 32L;
    private static final java.lang.String TAG = "Bitmap";
    private static final long UNDEFINED_SOURCE_ID = -1L;
    private static final int WORKING_COMPRESS_STORAGE = 4096;
    private static android.graphics.Bitmap.DumpData dumpData;
    private static final java.util.WeakHashMap<android.graphics.Bitmap, java.lang.Void> sAllBitmaps = null;
    private static final java.lang.Object sCleanerLock = null;
    private static volatile int sDefaultDensity;
    private static final java.util.concurrent.ConcurrentHashMap<java.lang.Long, android.graphics.Bitmap.SharedAllocationReference> sSharedAllocations = null;
    private static final java.lang.ref.ReferenceQueue<android.graphics.Bitmap.SharedAllocationHolder> sSharedAllocationsQueue = null;
    private static volatile java.lang.ref.Cleaner sSharedCleaner;
    private android.graphics.ColorSpace mColorSpace;
    int mDensity;
    private android.graphics.Gainmap mGainmap;
    private java.lang.ref.WeakReference<android.hardware.HardwareBuffer> mHardwareBuffer;
    private int mHeight;
    private long mId;
    private final long mNativePtr = 0L;
    private byte[] mNinePatchChunk;
    private android.graphics.NinePatch.InsetStruct mNinePatchInsets;
    private boolean mRecycled;
    private java.lang.Runnable mRecycler;
    private boolean mRequestPremultiplied;
    private android.graphics.Bitmap.SharedAllocationHolder mSharedHolder;
    private long mSourceId;
    private int mWidth;
    Bitmap(long p0, int p1, int p2, int p3, boolean p4, byte[] p5, android.graphics.NinePatch.InsetStruct p6) {}
    Bitmap(long p0, long p1, long p2, int p3, int p4, int p5, boolean p6, byte[] p7, android.graphics.NinePatch.InsetStruct p8, boolean p9) {}
    private void checkHardware(java.lang.String p0) {}
    private void checkPixelAccess(int p0, int p1) {}
    private void checkPixelsAccess(int p0, int p1, int p2, int p3, int p4, int p5, int[] p6) {}
    private static void checkWidthHeight(int p0, int p1) {}
    private static void checkXYSign(int p0, int p1) {}
    private static float clamp(float p0, android.graphics.ColorSpace p1, int p2) { return 0.0f; }
    public static android.graphics.Bitmap createBitmap(int p0, int p1, android.graphics.Bitmap.Config p2) { return null; }
    public static android.graphics.Bitmap createBitmap(int p0, int p1, android.graphics.Bitmap.Config p2, boolean p3) { return null; }
    public static android.graphics.Bitmap createBitmap(int p0, int p1, android.graphics.Bitmap.Config p2, boolean p3, android.graphics.ColorSpace p4) { return null; }
    public static android.graphics.Bitmap createBitmap(android.graphics.Bitmap p0) { return null; }
    public static android.graphics.Bitmap createBitmap(android.graphics.Bitmap p0, int p1, int p2, int p3, int p4) { return null; }
    public static android.graphics.Bitmap createBitmap(android.graphics.Bitmap p0, int p1, int p2, int p3, int p4, android.graphics.Matrix p5, boolean p6) { return null; }
    public static android.graphics.Bitmap createBitmap(android.graphics.Picture p0) { return null; }
    public static android.graphics.Bitmap createBitmap(android.graphics.Picture p0, int p1, int p2, android.graphics.Bitmap.Config p3) { return null; }
    public static android.graphics.Bitmap createBitmap(android.util.DisplayMetrics p0, int p1, int p2, android.graphics.Bitmap.Config p3) { return null; }
    public static android.graphics.Bitmap createBitmap(android.util.DisplayMetrics p0, int p1, int p2, android.graphics.Bitmap.Config p3, boolean p4) { return null; }
    public static android.graphics.Bitmap createBitmap(android.util.DisplayMetrics p0, int p1, int p2, android.graphics.Bitmap.Config p3, boolean p4, android.graphics.ColorSpace p5) { return null; }
    public static android.graphics.Bitmap createBitmap(android.util.DisplayMetrics p0, int[] p1, int p2, int p3, int p4, int p5, android.graphics.Bitmap.Config p6) { return null; }
    public static android.graphics.Bitmap createBitmap(android.util.DisplayMetrics p0, int[] p1, int p2, int p3, android.graphics.Bitmap.Config p4) { return null; }
    public static android.graphics.Bitmap createBitmap(int[] p0, int p1, int p2, int p3, int p4, android.graphics.Bitmap.Config p5) { return null; }
    public static android.graphics.Bitmap createBitmap(int[] p0, int p1, int p2, android.graphics.Bitmap.Config p3) { return null; }
    private static libcore.util.NativeAllocationRegistry createObjectTrackingRegistry() { return null; }
    public static android.graphics.Bitmap createScaledAshmemBitmap(android.graphics.Bitmap p0, int p1, int p2, boolean p3) { return null; }
    public static android.graphics.Bitmap createScaledBitmap(android.graphics.Bitmap p0, int p1, int p2, boolean p3) { return null; }
    private static libcore.util.NativeAllocationRegistry createSizeTrackingRegistry(int p0, boolean p1) { return null; }
    public static void dumpAll(android.util.proto.ProtoOutputStream p0, java.lang.String p1) {}
    public static void dumpAll(java.lang.String p0) {}
    private static java.util.ArrayList<android.graphics.Bitmap> getAllBitmaps() { return null; }
    static int getDefaultDensity() { return 0; }
    private static java.lang.ref.Cleaner getSharedCleaner() { return null; }
    private boolean isShared$ravenwood() { return false; }
    private static native boolean nativeCompress(long p0, int p1, int p2, java.io.OutputStream p3, byte[] p4);
    private static native android.graphics.ColorSpace nativeComputeColorSpace(long p0);
    private static native int nativeConfig(long p0);
    private static native android.graphics.Bitmap nativeCopy(long p0, int p1, boolean p2);
    private static native android.graphics.Bitmap nativeCopyAshmem(long p0);
    private static native void nativeCopyPixelsFromBuffer(long p0, java.nio.Buffer p1);
    private static native void nativeCopyPixelsToBuffer(long p0, java.nio.Buffer p1);
    private static native android.graphics.Bitmap nativeCopyPreserveInternalConfig(long p0);
    private static native android.graphics.Bitmap nativeCreate(int[] p0, int p1, int p2, int p3, int p4, int p5, boolean p6, long p7);
    private static native android.graphics.Bitmap nativeCreateEmptyAshmemBitmap(int p0, int p1, int p2, long p3);
    private static native android.graphics.Bitmap nativeCreateFromParcel(android.os.Parcel p0, long p1);
    private static native void nativeErase(long p0, int p1);
    private static native void nativeErase(long p0, long p1, long p2);
    private static native android.graphics.Bitmap nativeExtractAlpha(long p0, long p1, int[] p2);
    private static native android.graphics.Gainmap nativeExtractGainmap(long p0);
    private static native int nativeGenerationId(long p0);
    private static native int nativeGetAllocationByteCount(long p0);
    private static native int nativeGetAshmemFD(long p0);
    private static native long nativeGetColor(long p0, int p1, int p2);
    private static native android.hardware.HardwareBuffer nativeGetHardwareBuffer(long p0);
    private static native long nativeGetNativeFinalizer();
    private static native long nativeGetNativeNoop();
    private static native int nativeGetPixel(long p0, int p1, int p2);
    private static native void nativeGetPixels(long p0, int[] p1, int p2, int p3, int p4, int p5, int p6, int p7);
    private static native boolean nativeHasAlpha(long p0);
    private static native boolean nativeHasGainmap(long p0);
    private static native boolean nativeHasMipMap(long p0);
    private static native boolean nativeIsBackedByAshmem(long p0);
    private static native boolean nativeIsImmutable(long p0);
    private static native boolean nativeIsPremultiplied(long p0);
    private static native boolean nativeIsSRGB(long p0);
    private static native boolean nativeIsSRGBLinear(long p0);
    private static native void nativePrepareToDraw(long p0);
    private static native void nativeReconfigure(long p0, int p1, int p2, int p3, boolean p4);
    private static native void nativeRecycle(long p0);
    private static native int nativeRowBytes(long p0);
    private static native boolean nativeSameAs(long p0, long p1);
    private static native void nativeSetColorSpace(long p0, long p1);
    private static native void nativeSetGainmap(long p0, long p1);
    private static native void nativeSetHasAlpha(long p0, boolean p1, boolean p2);
    private static native void nativeSetHasMipMap(long p0, boolean p1);
    private static native void nativeSetImmutable(long p0);
    private static native void nativeSetPixel(long p0, int p1, int p2, int p3);
    private static native void nativeSetPixels(long p0, int[] p1, int p2, int p3, int p4, int p5, int p6, int p7);
    private static native void nativeSetPremultiplied(long p0, boolean p1);
    private static native void nativeSkipFromParcel(android.os.Parcel p0);
    private static native android.graphics.Bitmap nativeWrapHardwareBufferBitmap(android.hardware.HardwareBuffer p0, long p1);
    private static native boolean nativeWriteToParcel(long p0, int p1, android.os.Parcel p2);
    private void noteHardwareBitmapSlowCall() {}
    private static void processReferenceQueue() {}
    private void registerNativeAllocation(boolean p0) {}
    public static int scaleFromDensity(int p0, int p1, int p2) { return 0; }
    public static void setDefaultDensity(int p0) {}
    private void setImmutable() {}
    private void setNinePatchChunk(byte[] p0) {}
    private static void traceBitmap(com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder p0, android.graphics.Bitmap p1) {}
    private static android.graphics.Bitmap transformGainmap(android.graphics.Bitmap p0, android.graphics.Bitmap p1, android.graphics.Matrix p2, android.graphics.Paint p3, android.graphics.Rect p4, android.graphics.RectF p5, android.graphics.RectF p6) { return null; }
    public static android.graphics.Bitmap wrapHardwareBuffer(android.hardware.HardwareBuffer p0, android.graphics.ColorSpace p1) { return null; }
    public android.graphics.Bitmap asShared() { return null; }
    void checkRecycled(java.lang.String p0) {}
    public boolean compress(android.graphics.Bitmap.CompressFormat p0, int p1, java.io.OutputStream p2) { return false; }
    public android.graphics.Bitmap copy(android.graphics.Bitmap.Config p0, boolean p1) { return null; }
    public void copyPixelsFromBuffer(java.nio.Buffer p0) {}
    public void copyPixelsToBuffer(java.nio.Buffer p0) {}
    public android.graphics.Bitmap createAshmemBitmap() { return null; }
    public int describeContents() { return 0; }
    public void eraseColor(int p0) {}
    public void eraseColor(long p0) {}
    public android.graphics.Bitmap extractAlpha() { return null; }
    public android.graphics.Bitmap extractAlpha(android.graphics.Paint p0, int[] p1) { return null; }
    public final int getAllocationByteCount() { return 0; }
    public final int getByteCount() { return 0; }
    public android.graphics.Color getColor(int p0, int p1) { return null; }
    public final android.graphics.ColorSpace getColorSpace() { return null; }
    public final android.graphics.Bitmap.Config getConfig() { return null; }
    public int getDensity() { return 0; }
    public android.graphics.Gainmap getGainmap() { return null; }
    public int getGenerationId() { return 0; }
    public android.hardware.HardwareBuffer getHardwareBuffer() { return null; }
    public final int getHeight() { return 0; }
    public long getNativeInstance() { return 0L; }
    public byte[] getNinePatchChunk() { return null; }
    public android.graphics.NinePatch.InsetStruct getNinePatchInsets() { return null; }
    public void getOpticalInsets(android.graphics.Rect p0) {}
    public int getPixel(int p0, int p1) { return 0; }
    public void getPixels(int[] p0, int p1, int p2, int p3, int p4, int p5, int p6) {}
    public final int getRowBytes() { return 0; }
    public int getScaledHeight(int p0) { return 0; }
    public int getScaledHeight(android.graphics.Canvas p0) { return 0; }
    public int getScaledHeight(android.util.DisplayMetrics p0) { return 0; }
    public int getScaledWidth(int p0) { return 0; }
    public int getScaledWidth(android.graphics.Canvas p0) { return 0; }
    public int getScaledWidth(android.util.DisplayMetrics p0) { return 0; }
    public long getSharedId() { return 0L; }
    public android.os.SharedMemory getSharedMemory() { return null; }
    public final int getWidth() { return 0; }
    public final boolean hasAlpha() { return false; }
    public boolean hasGainmap() { return false; }
    public final boolean hasMipMap() { return false; }
    public final boolean isMutable() { return false; }
    public final boolean isPremultiplied() { return false; }
    public final boolean isRecycled() { return false; }
    public boolean isShared() { return false; }
    public void prepareToDraw() {}
    public void reconfigure(int p0, int p1, android.graphics.Bitmap.Config p2) {}
    public void recycle() {}
    void reinit(int p0, int p1, boolean p2) {}
    public boolean sameAs(android.graphics.Bitmap p0) { return false; }
    public void setColorSpace(android.graphics.ColorSpace p0) {}
    public void setConfig(android.graphics.Bitmap.Config p0) {}
    public void setDensity(int p0) {}
    public void setGainmap(android.graphics.Gainmap p0) {}
    public void setHasAlpha(boolean p0) {}
    public final void setHasMipMap(boolean p0) {}
    public void setHeight(int p0) {}
    public void setPixel(int p0, int p1, int p2) {}
    public void setPixels(int[] p0, int p1, int p2, int p3, int p4, int p5, int p6) {}
    public final void setPremultiplied(boolean p0) {}
    public void setWidth(int p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static enum CompressFormat {
        JPEG,
        PNG,
        WEBP,
        WEBP_LOSSLESS,
        WEBP_LOSSY;
        private static final android.graphics.Bitmap.CompressFormat[] $VALUES = null;
        final int nativeInt = 0;
        private CompressFormat() {}
        public static android.graphics.Bitmap.CompressFormat from(java.lang.String p0) { return null; }
    }

    public static enum Config {
        ALPHA_8,
        ARGB_4444,
        ARGB_8888,
        HARDWARE,
        RGBA_1010102,
        RGBA_F16,
        RGB_565;
        private static final android.graphics.Bitmap.Config[] $VALUES = null;
        private static android.graphics.Bitmap.Config[] sConfigs;
        final int nativeInt = 0;
        private Config() {}
        public static android.graphics.Bitmap.Config nativeToConfig(int p0) { return null; }
    }

    private static final class DumpData {
        private byte[][] buffers;
        private int count;
        private int format;
        private int max;
        private long[] natives;
        private int[] sizes;
        public DumpData(android.graphics.Bitmap.CompressFormat p0, int p1) {}
        public void add(long p0, byte[] p1, int p2) {}
        public int size() { return 0; }
    }

    static class SharedAllocationHolder {
        private final java.lang.Runnable mCleaner = null;
        private final java.util.concurrent.atomic.AtomicInteger mRefCount = null;
        private final long mSharedId = 0L;
        public SharedAllocationHolder(long p0, long p1, int p2, boolean p3) {}
        public void decrement() {}
        public boolean increment() { return false; }
    }

    private static class SharedAllocationReference extends java.lang.ref.WeakReference<android.graphics.Bitmap.SharedAllocationHolder> {
        final long mSharedId = 0L;
        SharedAllocationReference(android.graphics.Bitmap.SharedAllocationHolder p0, java.lang.ref.ReferenceQueue<android.graphics.Bitmap.SharedAllocationHolder> p1) { super(null); }
    }
}
