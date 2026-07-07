package android.util;

public class Base64OutputStream extends java.io.FilterOutputStream {
    private static byte[] EMPTY;
    private int bpos;
    private byte[] buffer;
    private final android.util.Base64.Coder coder = null;
    private final int flags = 0;
    public Base64OutputStream(java.io.OutputStream p0, int p1) { super((java.io.OutputStream)null); }
    public Base64OutputStream(java.io.OutputStream p0, int p1, boolean p2) { super((java.io.OutputStream)null); }
    private byte[] embiggen(byte[] p0, int p1) { return null; }
    private void flushBuffer() throws java.io.IOException {}
    private void internalWrite(byte[] p0, int p1, int p2, boolean p3) throws java.io.IOException {}
    public void close() throws java.io.IOException {}
    public void write(int p0) throws java.io.IOException {}
    public void write(byte[] p0, int p1, int p2) throws java.io.IOException {}
}
