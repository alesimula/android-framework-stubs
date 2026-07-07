package android.os;

@java.lang.Deprecated
public class FileBridge extends java.lang.Thread {
    private static final int CMD_CLOSE = 3;
    private static final int CMD_FSYNC = 2;
    private static final int CMD_WRITE = 1;
    private static final int MSG_LENGTH = 8;
    private static final java.lang.String TAG = "FileBridge";
    private android.os.ParcelFileDescriptor mClient;
    private volatile boolean mClosed;
    private android.os.ParcelFileDescriptor mServer;
    private android.os.ParcelFileDescriptor mTarget;
    public FileBridge() { super(); }
    public void forceClose() {}
    public android.os.ParcelFileDescriptor getClientSocket() { return null; }
    public boolean isClosed() { return false; }
    public void run() {}
    public void setTargetFile(android.os.ParcelFileDescriptor p0) {}

    public static class FileBridgeOutputStream extends java.io.OutputStream {
        private final java.io.FileDescriptor mClient = null;
        private final android.os.ParcelFileDescriptor mClientPfd = null;
        private final byte[] mTemp = null;
        private final java.nio.ByteBuffer mTempBuffer = null;
        public FileBridgeOutputStream(android.os.ParcelFileDescriptor p0) { super(); }
        private void writeCommandAndBlock(int p0, java.lang.String p1) throws java.io.IOException {}
        public void close() throws java.io.IOException {}
        public void fsync() throws java.io.IOException {}
        public void write(int p0) throws java.io.IOException {}
        public void write(byte[] p0, int p1, int p2) throws java.io.IOException {}
    }
}
