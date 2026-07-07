package com.android.internal.org.bouncycastle.crypto.digests;

public class SHA256Digest extends com.android.internal.org.bouncycastle.crypto.digests.GeneralDigest implements com.android.internal.org.bouncycastle.crypto.SavableDigest {
    private static final int DIGEST_LENGTH = 32;
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
    protected final com.android.internal.org.bouncycastle.crypto.CryptoServicePurpose purpose = null;
    private int xOff;
    public SHA256Digest() { super(); }
    public SHA256Digest(com.android.internal.org.bouncycastle.crypto.CryptoServicePurpose p0) { super(); }
    public SHA256Digest(com.android.internal.org.bouncycastle.crypto.digests.SHA256Digest p0) { super(); }
    public SHA256Digest(byte[] p0) { super(); }
    private static int Ch(int p0, int p1, int p2) { return 0; }
    private static int Maj(int p0, int p1, int p2) { return 0; }
    private static int Sum0(int p0) { return 0; }
    private static int Sum1(int p0) { return 0; }
    private static int Theta0(int p0) { return 0; }
    private static int Theta1(int p0) { return 0; }
    private void copyIn(com.android.internal.org.bouncycastle.crypto.digests.SHA256Digest p0) {}
    public static com.android.internal.org.bouncycastle.crypto.SavableDigest newInstance() { return null; }
    public static com.android.internal.org.bouncycastle.crypto.SavableDigest newInstance(com.android.internal.org.bouncycastle.crypto.CryptoServicePurpose p0) { return null; }
    public static com.android.internal.org.bouncycastle.crypto.SavableDigest newInstance(com.android.internal.org.bouncycastle.crypto.Digest p0) { return null; }
    public static com.android.internal.org.bouncycastle.crypto.SavableDigest newInstance(byte[] p0) { return null; }
    public com.android.internal.org.bouncycastle.util.Memoable copy() { return null; }
    protected com.android.internal.org.bouncycastle.crypto.CryptoServiceProperties cryptoServiceProperties() { return null; }
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
