package com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util;

public class BaseKeyGenerator extends javax.crypto.KeyGeneratorSpi {
    protected java.lang.String algName;
    protected int defaultKeySize;
    protected com.android.internal.org.bouncycastle.crypto.CipherKeyGenerator engine;
    protected int keySize;
    protected boolean uninitialised;
    protected BaseKeyGenerator(java.lang.String p0, int p1, com.android.internal.org.bouncycastle.crypto.CipherKeyGenerator p2) { super(); }
    protected javax.crypto.SecretKey engineGenerateKey() { return null; }
    protected void engineInit(int p0, java.security.SecureRandom p1) {}
    protected void engineInit(java.security.SecureRandom p0) {}
    protected void engineInit(java.security.spec.AlgorithmParameterSpec p0, java.security.SecureRandom p1) throws java.security.InvalidAlgorithmParameterException {}
}
