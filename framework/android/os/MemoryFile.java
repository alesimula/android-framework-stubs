package android.os;

public class MemoryFile {
    private static java.lang.String TAG;
    private boolean mAllowPurging;
    private java.nio.ByteBuffer mMapping;
    private android.os.SharedMemory mSharedMemory;
    public MemoryFile(java.lang.String p0, int p1) throws java.io.IOException {}
    private void beginAccess() throws java.io.IOException {}
    private void checkActive() throws java.io.IOException {}
    private void endAccess() throws java.io.IOException {}
    public static int getSize(java.io.FileDescriptor p0) throws java.io.IOException { return 0; }
    private static native int native_get_size(java.io.FileDescriptor p0) throws java.io.IOException;
    private static native boolean native_pin(java.io.FileDescriptor p0, boolean p1) throws java.io.IOException;
    @java.lang.Deprecated
    public boolean allowPurging(boolean p0) throws java.io.IOException { return false; }
    public void close() {}
    void deactivate() {}
    public java.io.FileDescriptor getFileDescriptor() throws java.io.IOException { return null; }
    public java.io.InputStream getInputStream() { return null; }
    public java.io.OutputStream getOutputStream() { return null; }
    @java.lang.Deprecated
    public boolean isPurgingAllowed() { return false; }
    public int length() { return 0; }
    public int readBytes(byte[] p0, int p1, int p2, int p3) throws java.io.IOException { return 0; }
    public void writeBytes(byte[] p0, int p1, int p2, int p3) throws java.io.IOException {}

    private class MemoryInputStream extends java.io.InputStream {
        private int mMark;
        private int mOffset;
        private byte[] mSingleByte;
        private MemoryInputStream(android.os.MemoryFile p0) { super(); }
        public int available() throws java.io.IOException { return 0; }
        public void mark(int p0) {}
        public boolean markSupported() { return false; }
        public int read() throws java.io.IOException { return 0; }
        public int read(byte[] p0, int p1, int p2) throws java.io.IOException { return 0; }
        public void reset() throws java.io.IOException {}
        public long skip(long p0) throws java.io.IOException { return 0L; }
    }

    private class MemoryOutputStream extends java.io.OutputStream {
        private int mOffset;
        private byte[] mSingleByte;
        private MemoryOutputStream(android.os.MemoryFile p0) { super(); }
        public void write(int p0) throws java.io.IOException {}
        public void write(byte[] p0, int p1, int p2) throws java.io.IOException {}
    }
}
