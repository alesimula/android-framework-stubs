package android.view.contentcapture;

public class ContentCaptureNativeHelpers {
    private static final java.lang.String TAG = "ContentCaptureNative";
    public ContentCaptureNativeHelpers() {}
    public static void initialize(java.nio.ByteBuffer p0, int p1) {}
    public static void lock(long p0, int p1) {}
    public static void memcpy(long p0, int p1, long p2, int p3, int p4) {}
    public static native long nativeGetDirectBufferAddress(java.nio.ByteBuffer p0);
    private static native void nativeLock(long p0, int p1);
    private static native void nativeMemcpy(long p0, long p1, int p2);
    private static native boolean nativeTryLock(long p0, int p1);
    private static native void nativeUnlock(long p0, int p1);
    public static native int nativeWriteCharsToBuffer(long p0, int p1, int p2, java.lang.String p3, int p4);
    public static boolean tryLock(long p0, int p1) { return false; }
    public static void unlock(long p0, int p1) {}
    private static void validateLockArgs(long p0, int p1) {}
}
