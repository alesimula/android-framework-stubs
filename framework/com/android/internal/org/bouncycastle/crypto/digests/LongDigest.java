package com.android.internal.org.bouncycastle.crypto.digests;

public abstract class LongDigest implements com.android.internal.org.bouncycastle.crypto.ExtendedDigest, com.android.internal.org.bouncycastle.util.Memoable, com.android.internal.org.bouncycastle.crypto.digests.EncodableDigest {
    private static final int BYTE_LENGTH = 128;
    static final long[] K = null;
    protected long H1;
    protected long H2;
    protected long H3;
    protected long H4;
    protected long H5;
    protected long H6;
    protected long H7;
    protected long H8;
    private long[] W;
    private long byteCount1;
    private long byteCount2;
    protected final com.android.internal.org.bouncycastle.crypto.CryptoServicePurpose purpose = null;
    private int wOff;
    private byte[] xBuf;
    private int xBufOff;
    protected LongDigest() {}
    protected LongDigest(com.android.internal.org.bouncycastle.crypto.CryptoServicePurpose p0) {}
    protected LongDigest(com.android.internal.org.bouncycastle.crypto.digests.LongDigest p0) {}
    private long Ch(long p0, long p1, long p2) { return 0L; }
    private long Maj(long p0, long p1, long p2) { return 0L; }
    private long Sigma0(long p0) { return 0L; }
    private long Sigma1(long p0) { return 0L; }
    private long Sum0(long p0) { return 0L; }
    private long Sum1(long p0) { return 0L; }
    private void adjustByteCounts() {}
    protected void copyIn(com.android.internal.org.bouncycastle.crypto.digests.LongDigest p0) {}
    protected abstract com.android.internal.org.bouncycastle.crypto.CryptoServiceProperties cryptoServiceProperties();
    public void finish() {}
    public int getByteLength() { return 0; }
    protected int getEncodedStateSize() { return 0; }
    protected void populateState(byte[] p0) {}
    protected void processBlock() {}
    protected void processLength(long p0, long p1) {}
    protected void processWord(byte[] p0, int p1) {}
    public void reset() {}
    protected void restoreState(byte[] p0) {}
    public void update(byte p0) {}
    public void update(byte[] p0, int p1, int p2) {}
    private static long[] $d2j$hex$d5d7d4e4$decode_J(java.lang.String p0) { return null; }
    private static int[] $d2j$hex$d5d7d4e4$decode_I(java.lang.String p0) { return null; }
    private static short[] $d2j$hex$d5d7d4e4$decode_S(java.lang.String p0) { return null; }
    private static byte[] $d2j$hex$d5d7d4e4$decode_B(java.lang.String p0) { return null; }
}
