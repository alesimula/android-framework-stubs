package android.util;

public final class MemoryIntArray implements android.os.Parcelable, java.io.Closeable {
    public static final android.os.Parcelable.Creator<android.util.MemoryIntArray> CREATOR = null;
    private static final int MAX_SIZE = 1024;
    private static final java.lang.String TAG = "MemoryIntArray";
    private int mFd;
    private final boolean mIsOwner = false;
    private final long mMemoryAddr = 0L;
    private final int mSize = 0;
    public MemoryIntArray(int p0) throws java.io.IOException {}
    private MemoryIntArray(android.os.Parcel p0) throws java.io.IOException {}
    private void enforceNotClosed() {}
    private void enforceValidIndex(int p0) {}
    private void enforceWritable() {}
    public static int getMaxSize() { return 0; }
    private native void nativeClose(int p0, long p1, int p2);
    private native int nativeCreate(java.lang.String p0, int p1);
    private native int nativeGet(long p0, int p1);
    private native long nativeOpen(int p0, boolean p1, int p2);
    private native void nativeSet(long p0, int p1, int p2);
    private native int nativeSize(int p0);
    public void close() throws java.io.IOException {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    protected void finalize() throws java.lang.Throwable {}
    public int get(int p0) throws java.io.IOException { return 0; }
    public int hashCode() { return 0; }
    public boolean isClosed() { return false; }
    public boolean isWritable() { return false; }
    public void set(int p0, int p1) throws java.io.IOException {}
    public int size() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
