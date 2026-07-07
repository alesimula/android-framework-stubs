package android.util;

public class Base64InputStream extends java.io.FilterInputStream {
    private static final int BUFFER_SIZE = 2048;
    private static byte[] EMPTY;
    private final android.util.Base64.Coder coder = null;
    private boolean eof;
    private byte[] inputBuffer;
    private int outputEnd;
    private int outputStart;
    public Base64InputStream(java.io.InputStream p0, int p1) { super((java.io.InputStream)null); }
    public Base64InputStream(java.io.InputStream p0, int p1, boolean p2) { super((java.io.InputStream)null); }
    private void refill() throws java.io.IOException {}
    public int available() { return 0; }
    public void close() throws java.io.IOException {}
    public void mark(int p0) {}
    public boolean markSupported() { return false; }
    public int read() throws java.io.IOException { return 0; }
    public int read(byte[] p0, int p1, int p2) throws java.io.IOException { return 0; }
    public void reset() {}
    public long skip(long p0) throws java.io.IOException { return 0L; }
}
