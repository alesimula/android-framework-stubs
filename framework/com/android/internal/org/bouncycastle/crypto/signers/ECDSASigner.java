package com.android.internal.org.bouncycastle.crypto.signers;

public class ECDSASigner implements com.android.internal.org.bouncycastle.math.ec.ECConstants, com.android.internal.org.bouncycastle.crypto.DSAExt {
    private final com.android.internal.org.bouncycastle.crypto.signers.DSAKCalculator kCalculator = null;
    private com.android.internal.org.bouncycastle.crypto.params.ECKeyParameters key;
    private java.security.SecureRandom random;
    public ECDSASigner() {}
    public ECDSASigner(com.android.internal.org.bouncycastle.crypto.signers.DSAKCalculator p0) {}
    protected java.math.BigInteger calculateE(java.math.BigInteger p0, byte[] p1) { return null; }
    protected com.android.internal.org.bouncycastle.math.ec.ECMultiplier createBasePointMultiplier() { return null; }
    public java.math.BigInteger[] generateSignature(byte[] p0) { return null; }
    protected com.android.internal.org.bouncycastle.math.ec.ECFieldElement getDenominator(int p0, com.android.internal.org.bouncycastle.math.ec.ECPoint p1) { return null; }
    public java.math.BigInteger getOrder() { return null; }
    public void init(boolean p0, com.android.internal.org.bouncycastle.crypto.CipherParameters p1) {}
    protected java.security.SecureRandom initSecureRandom(boolean p0, java.security.SecureRandom p1) { return null; }
    public boolean verifySignature(byte[] p0, java.math.BigInteger p1, java.math.BigInteger p2) { return false; }
}
