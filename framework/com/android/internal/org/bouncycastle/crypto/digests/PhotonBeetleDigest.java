package com.android.internal.org.bouncycastle.crypto.digests;

public class PhotonBeetleDigest implements com.android.internal.org.bouncycastle.crypto.Digest {
    private int D;
    private int DSquare;
    private int Dq;
    private int Dr;
    private final int INITIAL_RATE_INBYTES = 0;
    private int LAST_THREE_BITS_OFFSET;
    private byte[][] MixColMatrix;
    private int RATE_INBYTES;
    private byte[][] RC;
    private int ROUND;
    private int S;
    private int SQUEEZE_RATE_INBYTES;
    private int STATE_INBYTES;
    private int S_1;
    private int TAG_INBYTES;
    private java.io.ByteArrayOutputStream buffer;
    private byte[] sbox;
    private byte[] state;
    private byte[][] state_2d;
    public PhotonBeetleDigest() {}
    void PHOTON_Permutation() {}
    public int doFinal(byte[] p0, int p1) { return 0; }
    public java.lang.String getAlgorithmName() { return null; }
    public int getDigestSize() { return 0; }
    public void reset() {}
    public void update(byte p0) {}
    public void update(byte[] p0, int p1, int p2) {}
}
