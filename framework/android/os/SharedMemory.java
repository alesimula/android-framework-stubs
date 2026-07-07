package android.os;

public final class SharedMemory implements android.os.Parcelable, java.io.Closeable {
    public static final android.os.Parcelable.Creator<android.os.SharedMemory> CREATOR = null;
    private static final int PROT_MASK = Integer.valueOf(0);
    private final java.io.FileDescriptor mFileDescriptor = null;
    private final android.os.SharedMemory.MemoryRegistration mMemoryRegistration = null;
    private final int mSize = 0;
    private SharedMemory(java.io.FileDescriptor p0) {}
    private void checkOpen() {}
    public static android.os.SharedMemory create(java.lang.String p0, int p1) throws android.system.ErrnoException { return null; }
    public static android.os.SharedMemory fromFileDescriptor(android.os.ParcelFileDescriptor p0) { return null; }
    private static native java.io.FileDescriptor nCreate(java.lang.String p0, int p1) throws android.system.ErrnoException;
    private static native int nGetSize(java.io.FileDescriptor p0);
    private static native int nSetProt(java.io.FileDescriptor p0, int p1);
    public static void unmap(java.nio.ByteBuffer p0) {}
    private static void validateProt(int p0) {}
    public void close() {}
    public int describeContents() { return 0; }
    public int getFd() { return 0; }
    public android.os.ParcelFileDescriptor getFdDup() throws java.io.IOException { return null; }
    public java.io.FileDescriptor getFileDescriptor() { return null; }
    public int getSize() { return 0; }
    public boolean isRegionReadOnly() { return false; }
    public java.nio.ByteBuffer map(int p0, int p1, int p2) throws android.system.ErrnoException { return null; }
    public java.nio.ByteBuffer mapReadOnly() throws android.system.ErrnoException { return null; }
    public java.nio.ByteBuffer mapReadWrite() throws android.system.ErrnoException { return null; }
    public boolean setProtect(int p0) { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    private static final class Closer implements java.lang.Runnable {
        private int mFd;
        private android.os.SharedMemory.MemoryRegistration mMemoryReference;
        private Closer(int p0, android.os.SharedMemory.MemoryRegistration p1) {}
        public void run() {}
    }

    private static final class MemoryRegistration {
        private int mReferenceCount;
        private int mSize;
        private MemoryRegistration(int p0) {}
        public android.os.SharedMemory.MemoryRegistration acquire() { return null; }
        public void release() {}
    }

    private static final class Unmapper implements java.lang.Runnable {
        private long mAddress;
        private android.os.SharedMemory.MemoryRegistration mMemoryReference;
        private int mSize;
        private Unmapper(long p0, int p1, android.os.SharedMemory.MemoryRegistration p2) {}
        public void run() {}
    }
}
