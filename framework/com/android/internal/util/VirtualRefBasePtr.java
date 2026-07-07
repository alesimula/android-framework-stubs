package com.android.internal.util;

public final class VirtualRefBasePtr {
    private long mNativePtr;
    public VirtualRefBasePtr(long p0) {}
    private static native void nDecStrong(long p0);
    private static native void nIncStrong(long p0);
    protected void finalize() throws java.lang.Throwable {}
    public long get() { return 0L; }
    public void release() {}
}
