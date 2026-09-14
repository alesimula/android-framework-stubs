package android.util.apk;

class ApkChannel implements java.lang.AutoCloseable {
    private final java.nio.channels.FileChannel mChannel = null;
    private final java.lang.AutoCloseable mCloseable = null;
    private final java.io.FileDescriptor mFd = null;
    private ApkChannel(java.nio.channels.FileChannel p0, java.io.FileDescriptor p1, java.lang.AutoCloseable p2) {}
    public static android.util.apk.ApkChannel of(java.io.RandomAccessFile p0) { return null; }
    public static android.util.apk.ApkChannel of(java.nio.channels.FileChannel p0) { return null; }
    public static android.util.apk.ApkChannel of(java.nio.channels.FileChannel p0, java.io.FileDescriptor p1) { return null; }
    public static android.util.apk.ApkChannel open(java.io.FileDescriptor p0) throws java.io.IOException { return null; }
    public void close() throws java.lang.Exception {}
    public java.nio.channels.FileChannel getChannel() { return null; }
    public java.io.FileDescriptor getFD() { return null; }
    public long position() throws java.io.IOException { return 0L; }
    public java.nio.channels.FileChannel position(long p0) throws java.io.IOException { return null; }
    public int read(java.nio.ByteBuffer p0) throws java.io.IOException { return 0; }
    public void readFully(java.nio.ByteBuffer p0) throws java.io.IOException {}
    public void readFully(java.nio.ByteBuffer p0, long p1) throws java.io.IOException {}
    public long size() throws java.io.IOException { return 0L; }
}
