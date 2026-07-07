package com.android.internal.org.bouncycastle.crypto.signers;

public interface DSAKCalculator {
    public void init(java.math.BigInteger p0, java.math.BigInteger p1, byte[] p2);
    public void init(java.math.BigInteger p0, java.security.SecureRandom p1);
    public boolean isDeterministic();
    public java.math.BigInteger nextK();
}
