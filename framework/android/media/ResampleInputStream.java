package android.media;

public final class ResampleInputStream extends java.io.InputStream {
    private static final java.lang.String TAG = "ResampleInputStream";
    private static final int mFirLength = 29;
    private byte[] mBuf;
    private int mBufCount;
    private java.io.InputStream mInputStream;
    private final byte[] mOneByte = null;
    private final int mRateIn = 0;
    private final int mRateOut = 0;
    public ResampleInputStream(java.io.InputStream p0, int p1, int p2) { super(); }
    private static native void fir21(byte[] p0, int p1, byte[] p2, int p3, int p4);
    public void close() throws java.io.IOException {}
    protected void finalize() throws java.lang.Throwable {}
    public int read() throws java.io.IOException { return 0; }
    public int read(byte[] p0) throws java.io.IOException { return 0; }
    public int read(byte[] p0, int p1, int p2) throws java.io.IOException { return 0; }
}
