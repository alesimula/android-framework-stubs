package com.android.internal.os;

public class ApplicationSharedMemory implements java.lang.AutoCloseable {
    private static final boolean DEBUG = false;
    public static final long INVALID_NETWORK_TIME = -1L;
    private static final java.lang.String LOG_TAG = "ApplicationSharedMemory";
    public static final int MAX_FLAGS = 32;
    public static final int PM_DEVICE_UPGRADING_FALSE = 0;
    public static final int PM_DEVICE_UPGRADING_TRUE = 1;
    public static final int PM_DEVICE_UPGRADING_UNSET = -1;
    public static com.android.internal.os.ApplicationSharedMemory sInstance;
    private java.io.FileDescriptor mFileDescriptor;
    private final boolean mMutable = false;
    private volatile long mPtr;
    ApplicationSharedMemory(java.io.FileDescriptor p0, boolean p1, long p2) {}
    private void checkFileOpen() {}
    private void checkMapped() {}
    private void checkMutable() {}
    public static com.android.internal.os.ApplicationSharedMemory create() { return null; }
    public static com.android.internal.os.ApplicationSharedMemory fromFileDescriptor(java.io.FileDescriptor p0, boolean p1) { return null; }
    public static com.android.internal.os.ApplicationSharedMemory getInstance() { return null; }
    private static native int nativeCreate();
    private static native int nativeDupAsReadOnly(int p0);
    private static native boolean nativeGetBitFlag(long p0, int p1);
    private static native float nativeGetCurrentAnimatorScale(long p0);
    private static native int nativeGetIsDeviceUpgrading(long p0);
    public static native long nativeGetLatestNetworkTimeUnixEpochMillisAtZeroElapsedRealtimeMillis(long p0);
    private static native long nativeGetSystemNonceBlock(long p0);
    private static native void nativeInit(long p0);
    private static native long nativeMap(int p0, boolean p1);
    private static native int[] nativeReadSystemFeaturesCache(long p0);
    private static native void nativeSetBitFlag(long p0, int p1, boolean p2);
    private static native void nativeSetCurrentAnimatorScale(long p0, float p1);
    private static native void nativeSetIsDeviceUpgrading(long p0, boolean p1);
    private static native void nativeSetLatestNetworkTimeUnixEpochMillisAtZeroElapsedRealtimeMillis(long p0, long p1);
    private static native void nativeUnmap(long p0);
    private static native void nativeWriteSystemFeaturesCache(long p0, int[] p1);
    public static void setInstance(com.android.internal.os.ApplicationSharedMemory p0) {}
    public void clearLatestNetworkTimeUnixEpochMillisAtZeroElapsedRealtimeMillis() {}
    public void close() {}
    public void closeFileDescriptor() {}
    public boolean getBitFlag(int p0) { return false; }
    public float getCurrentAnimatorScale() { return 0.0f; }
    public java.io.FileDescriptor getFileDescriptor() { return null; }
    public int getIsDeviceUpgrading() { return 0; }
    public long getLatestNetworkTimeUnixEpochMillisAtZeroElapsedRealtimeMillis() throws java.time.DateTimeException { return 0L; }
    public java.io.FileDescriptor getReadOnlyFileDescriptor() throws java.io.IOException { return null; }
    public long getSystemNonceBlock() { return 0L; }
    public boolean isMapped() { return false; }
    public boolean isMutable() { return false; }
    public int[] readSystemFeaturesCache() { return null; }
    public void setBitFlag(int p0, boolean p1) {}
    public void setCurrentAnimatorScale(float p0) {}
    public void setIsDeviceUpgrading(boolean p0) {}
    public void setLatestNetworkTimeUnixEpochMillisAtZeroElapsedRealtimeMillis(long p0) {}
    public void writeSystemFeaturesCache(int[] p0) {}
}
