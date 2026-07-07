package android.net;

class LocalSocketImpl {
    private java.io.FileDescriptor fd;
    private android.net.LocalSocketImpl.SocketInputStream fis;
    private android.net.LocalSocketImpl.SocketOutputStream fos;
    java.io.FileDescriptor[] inboundFileDescriptors;
    private boolean mFdCreatedInternally;
    java.io.FileDescriptor[] outboundFileDescriptors;
    private java.lang.Object readMonitor;
    private java.lang.Object writeMonitor;
    LocalSocketImpl() {}
    LocalSocketImpl(java.io.FileDescriptor p0) {}
    private native void bindLocal(java.io.FileDescriptor p0, java.lang.String p1, int p2) throws java.io.IOException;
    private native void connectLocal(java.io.FileDescriptor p0, java.lang.String p1, int p2) throws java.io.IOException;
    private native android.net.Credentials getPeerCredentials_native(java.io.FileDescriptor p0) throws java.io.IOException;
    private static int javaSoToOsOpt(int p0) { return 0; }
    private native int read_native(java.io.FileDescriptor p0) throws java.io.IOException;
    private native int readba_native(byte[] p0, int p1, int p2, java.io.FileDescriptor p3) throws java.io.IOException;
    private native void write_native(int p0, java.io.FileDescriptor p1) throws java.io.IOException;
    private native void writeba_native(byte[] p0, int p1, int p2, java.io.FileDescriptor p3) throws java.io.IOException;
    protected void accept(android.net.LocalSocketImpl p0) throws java.io.IOException {}
    protected int available() throws java.io.IOException { return 0; }
    public void bind(android.net.LocalSocketAddress p0) throws java.io.IOException {}
    public void close() throws java.io.IOException {}
    protected void connect(android.net.LocalSocketAddress p0, int p1) throws java.io.IOException {}
    public void create(int p0) throws java.io.IOException {}
    protected void finalize() throws java.io.IOException {}
    public java.io.FileDescriptor[] getAncillaryFileDescriptors() throws java.io.IOException { return null; }
    protected java.io.FileDescriptor getFileDescriptor() { return null; }
    protected java.io.InputStream getInputStream() throws java.io.IOException { return null; }
    public java.lang.Object getOption(int p0) throws java.io.IOException { return null; }
    protected java.io.OutputStream getOutputStream() throws java.io.IOException { return null; }
    public android.net.Credentials getPeerCredentials() throws java.io.IOException { return null; }
    public android.net.LocalSocketAddress getSockAddress() throws java.io.IOException { return null; }
    protected void listen(int p0) throws java.io.IOException {}
    protected void sendUrgentData(int p0) throws java.io.IOException {}
    public void setFileDescriptorsForSend(java.io.FileDescriptor[] p0) {}
    public void setOption(int p0, java.lang.Object p1) throws java.io.IOException {}
    protected void shutdownInput() throws java.io.IOException {}
    protected void shutdownOutput() throws java.io.IOException {}
    protected boolean supportsUrgentData() { return false; }
    public java.lang.String toString() { return null; }

    class SocketInputStream extends java.io.InputStream {
        SocketInputStream(android.net.LocalSocketImpl p0) { super(); }
        public int available() throws java.io.IOException { return 0; }
        public void close() throws java.io.IOException {}
        public int read() throws java.io.IOException { return 0; }
        public int read(byte[] p0) throws java.io.IOException { return 0; }
        public int read(byte[] p0, int p1, int p2) throws java.io.IOException { return 0; }
    }

    class SocketOutputStream extends java.io.OutputStream {
        SocketOutputStream(android.net.LocalSocketImpl p0) { super(); }
        public void close() throws java.io.IOException {}
        public void write(int p0) throws java.io.IOException {}
        public void write(byte[] p0) throws java.io.IOException {}
        public void write(byte[] p0, int p1, int p2) throws java.io.IOException {}
    }
}
