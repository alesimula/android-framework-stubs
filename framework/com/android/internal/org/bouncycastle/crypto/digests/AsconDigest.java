package com.android.internal.org.bouncycastle.crypto.digests;

public class AsconDigest implements com.android.internal.org.bouncycastle.crypto.ExtendedDigest {
    private final int ASCON_PB_ROUNDS = 0;
    private final int CRYPTO_BYTES = 0;
    private final java.lang.String algorithmName = null;
    com.android.internal.org.bouncycastle.crypto.digests.AsconDigest.AsconParameters asconParameters;
    private final java.io.ByteArrayOutputStream buffer = null;
    private long x0;
    private long x1;
    private long x2;
    private long x3;
    private long x4;
    public AsconDigest(com.android.internal.org.bouncycastle.crypto.digests.AsconDigest.AsconParameters p0) {}
    private long LOADBYTES(byte[] p0, int p1, int p2) { return 0L; }
    private void P(int p0) {}
    private long PAD(int p0) { return 0L; }
    private long ROR(long p0, int p1) { return 0L; }
    private void ROUND(long p0) {}
    private void STOREBYTES(byte[] p0, int p1, long p2, int p3) {}
    public int doFinal(byte[] p0, int p1) { return 0; }
    public java.lang.String getAlgorithmName() { return null; }
    public int getByteLength() { return 0; }
    public int getDigestSize() { return 0; }
    public void reset() {}
    public void update(byte p0) {}
    public void update(byte[] p0, int p1, int p2) {}

    public static enum AsconParameters {
        AsconHash,
        AsconHashA;
        private static final com.android.internal.org.bouncycastle.crypto.digests.AsconDigest.AsconParameters[] $VALUES = null;
        private AsconParameters() {}
    }
}
