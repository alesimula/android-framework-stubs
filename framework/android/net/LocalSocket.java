package android.net;

public class LocalSocket implements java.io.Closeable {
    public static final int SOCKET_DGRAM = 1;
    public static final int SOCKET_SEQPACKET = 3;
    public static final int SOCKET_STREAM = 2;
    static final int SOCKET_UNKNOWN = 0;
    private final android.net.LocalSocketImpl impl = null;
    private volatile boolean implCreated;
    private boolean isBound;
    private boolean isConnected;
    private android.net.LocalSocketAddress localAddress;
    private final int sockType = 0;
    public LocalSocket() {}
    public LocalSocket(int p0) {}
    private LocalSocket(android.net.LocalSocketImpl p0, int p1) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public LocalSocket(java.io.FileDescriptor p0) {}
    private void checkConnected() {}
    static android.net.LocalSocket createLocalSocketForAccept(android.net.LocalSocketImpl p0) { return null; }
    private void implCreateIfNeeded() throws java.io.IOException {}
    public void bind(android.net.LocalSocketAddress p0) throws java.io.IOException {}
    public void close() throws java.io.IOException {}
    public void connect(android.net.LocalSocketAddress p0) throws java.io.IOException {}
    public void connect(android.net.LocalSocketAddress p0, int p1) throws java.io.IOException {}
    public java.io.FileDescriptor[] getAncillaryFileDescriptors() throws java.io.IOException { return null; }
    public java.io.FileDescriptor getFileDescriptor() { return null; }
    public java.io.InputStream getInputStream() throws java.io.IOException { return null; }
    public android.net.LocalSocketAddress getLocalSocketAddress() { return null; }
    public java.io.OutputStream getOutputStream() throws java.io.IOException { return null; }
    public android.net.Credentials getPeerCredentials() throws java.io.IOException { return null; }
    public int getReceiveBufferSize() throws java.io.IOException { return 0; }
    public android.net.LocalSocketAddress getRemoteSocketAddress() { return null; }
    public int getSendBufferSize() throws java.io.IOException { return 0; }
    public int getSoTimeout() throws java.io.IOException { return 0; }
    public boolean isBound() { return false; }
    public boolean isClosed() { return false; }
    public boolean isConnected() { return false; }
    public boolean isInputShutdown() { return false; }
    public boolean isOutputShutdown() { return false; }
    public void setFileDescriptorsForSend(java.io.FileDescriptor[] p0) {}
    public void setReceiveBufferSize(int p0) throws java.io.IOException {}
    public void setSendBufferSize(int p0) throws java.io.IOException {}
    public void setSoTimeout(int p0) throws java.io.IOException {}
    public void shutdownInput() throws java.io.IOException {}
    public void shutdownOutput() throws java.io.IOException {}
    public java.lang.String toString() { return null; }
}
