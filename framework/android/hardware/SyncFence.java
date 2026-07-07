package android.hardware;

public final class SyncFence implements java.lang.AutoCloseable, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.SyncFence> CREATOR = null;
    public static final long SIGNAL_TIME_INVALID = -1L;
    public static final long SIGNAL_TIME_PENDING = 9223372036854775807L;
    private final java.lang.Runnable mCloser = null;
    private long mNativePtr;
    private SyncFence() {}
    private SyncFence(int p0) {}
    public SyncFence(long p0) {}
    public SyncFence(android.hardware.SyncFence p0) {}
    private SyncFence(android.os.Parcel p0) {}
    public static android.hardware.SyncFence adopt(int p0) { return null; }
    private boolean await(long p0) { return false; }
    public static android.hardware.SyncFence create(android.os.ParcelFileDescriptor p0) { return null; }
    public static android.hardware.SyncFence createEmpty() { return null; }
    private static native long nCreate(int p0);
    private static native long nGetDestructor();
    private static native int nGetFd(long p0);
    private static native long nGetSignalTime(long p0);
    private static native void nIncRef(long p0);
    private static native boolean nIsValid(long p0);
    private static native boolean nWait(long p0, long p1);
    public boolean await(java.time.Duration p0) { return false; }
    public boolean awaitForever() { return false; }
    public void close() {}
    public int describeContents() { return 0; }
    public android.os.ParcelFileDescriptor getFdDup() throws java.io.IOException { return null; }
    public java.lang.Object getLock() { return null; }
    public long getNativeFence() { return 0L; }
    public long getSignalTime() { return 0L; }
    public boolean isValid() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
