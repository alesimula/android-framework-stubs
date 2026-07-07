package com.android.internal.org.bouncycastle.crypto.digests;

public class XoodyakDigest implements com.android.internal.org.bouncycastle.crypto.Digest {
    private final int MAXROUNDS = 0;
    private final int NCOLUMS = 0;
    private final int NLANES = 0;
    private final int NROWS = 0;
    private final int PhaseDown = 0;
    private final int PhaseUp = 0;
    private final int[] RC = null;
    private int Rabsorb;
    private final int Rhash = 0;
    private final int TAGLEN = 0;
    private final java.io.ByteArrayOutputStream buffer = null;
    private final int f_bPrime = 0;
    private com.android.internal.org.bouncycastle.crypto.digests.XoodyakDigest.MODE mode;
    private int phase;
    private byte[] state;
    public XoodyakDigest() {}
    private int ROTL32(int p0, int p1) { return 0; }
    private void Up(byte[] p0, int p1, int p2, int p3) {}
    private int index(int p0, int p1) { return 0; }
    void Down(byte[] p0, int p1, int p2, int p3) {}
    public int doFinal(byte[] p0, int p1) { return 0; }
    public java.lang.String getAlgorithmName() { return null; }
    public int getDigestSize() { return 0; }
    public void reset() {}
    public void update(byte p0) {}
    public void update(byte[] p0, int p1, int p2) {}

    static enum MODE {
        ModeHash,
        ModeKeyed;
        private static final com.android.internal.org.bouncycastle.crypto.digests.XoodyakDigest.MODE[] $VALUES = null;
        private MODE() {}
    }
}
