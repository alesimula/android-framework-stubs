package android.media;

public final class AmrInputStream extends java.io.InputStream {
    private static final int SAMPLES_PER_FRAME = 160;
    private static final java.lang.String TAG = "AmrInputStream";
    private final byte[] mBuf = null;
    private int mBufIn;
    private int mBufOut;
    android.media.MediaCodec mCodec;
    android.media.MediaCodec.BufferInfo mInfo;
    private java.io.InputStream mInputStream;
    private byte[] mOneByte;
    boolean mSawInputEOS;
    boolean mSawOutputEOS;
    public AmrInputStream(java.io.InputStream p0) { super(); }
    public void close() throws java.io.IOException {}
    protected void finalize() throws java.lang.Throwable {}
    public int read() throws java.io.IOException { return 0; }
    public int read(byte[] p0) throws java.io.IOException { return 0; }
    public int read(byte[] p0, int p1, int p2) throws java.io.IOException { return 0; }
}
