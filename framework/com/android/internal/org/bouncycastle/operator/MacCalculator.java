package com.android.internal.org.bouncycastle.operator;

public interface MacCalculator {
    public com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier();
    public com.android.internal.org.bouncycastle.operator.GenericKey getKey();
    public byte[] getMac();
    public java.io.OutputStream getOutputStream();
}
