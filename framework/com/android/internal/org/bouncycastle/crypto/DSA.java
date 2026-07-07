package com.android.internal.org.bouncycastle.crypto;

public interface DSA {
    public java.math.BigInteger[] generateSignature(byte[] p0);
    public void init(boolean p0, com.android.internal.org.bouncycastle.crypto.CipherParameters p1);
    public boolean verifySignature(byte[] p0, java.math.BigInteger p1, java.math.BigInteger p2);
}
