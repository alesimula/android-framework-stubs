package com.android.internal.org.bouncycastle.crypto;

public interface Digest {
    public int doFinal(byte[] p0, int p1);
    public java.lang.String getAlgorithmName();
    public int getDigestSize();
    public void reset();
    public void update(byte p0);
    public void update(byte[] p0, int p1, int p2);
}
