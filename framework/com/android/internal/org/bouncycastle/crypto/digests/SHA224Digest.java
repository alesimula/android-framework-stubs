package com.android.internal.org.bouncycastle.crypto.digests;

public class SHA224Digest extends com.android.internal.org.bouncycastle.crypto.digests.GeneralDigest implements com.android.internal.org.bouncycastle.crypto.digests.EncodableDigest {
    private static final int DIGEST_LENGTH = 28;
    static final int[] K = null;
    private int H1;
    private int H2;
    private int H3;
    private int H4;
    private int H5;
    private int H6;
    private int H7;
    private int H8;
    private int[] X;
    private int xOff;
    public SHA224Digest() { super(); }
    public SHA224Digest(com.android.internal.org.bouncycastle.crypto.digests.SHA224Digest p0) { super(); }
    public SHA224Digest(byte[] p0) { super(); }
    private int Ch(int p0, int p1, int p2) { return 0; }
    private int Maj(int p0, int p1, int p2) { return 0; }
    private int Sum0(int p0) { return 0; }
    private int Sum1(int p0) { return 0; }
    private int Theta0(int p0) { return 0; }
    private int Theta1(int p0) { return 0; }
    private void doCopy(com.android.internal.org.bouncycastle.crypto.digests.SHA224Digest p0) {}
    public com.android.internal.org.bouncycastle.util.Memoable copy() { return null; }
    public int doFinal(byte[] p0, int p1) { return 0; }
    public java.lang.String getAlgorithmName() { return null; }
    public int getDigestSize() { return 0; }
    public byte[] getEncodedState() { return null; }
    protected void processBlock() {}
    protected void processLength(long p0) {}
    protected void processWord(byte[] p0, int p1) {}
    public void reset() {}
    public void reset(com.android.internal.org.bouncycastle.util.Memoable p0) {}
}
