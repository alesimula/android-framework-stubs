package com.android.internal.org.bouncycastle.operator;

public interface DigestCalculator {
    public com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier();
    public byte[] getDigest();
    public java.io.OutputStream getOutputStream();
}
