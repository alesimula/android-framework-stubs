package com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.dsa;

public class KeyPairGeneratorSpi extends java.security.KeyPairGenerator {
    private static java.lang.Object lock;
    private static java.util.Hashtable params;
    com.android.internal.org.bouncycastle.crypto.generators.DSAKeyPairGenerator engine;
    boolean initialised;
    com.android.internal.org.bouncycastle.crypto.params.DSAKeyGenerationParameters param;
    java.security.SecureRandom random;
    int strength;
    public KeyPairGeneratorSpi() { super((java.lang.String)null); }
    public java.security.KeyPair generateKeyPair() { return null; }
    public void initialize(int p0, java.security.SecureRandom p1) {}
    public void initialize(java.security.spec.AlgorithmParameterSpec p0, java.security.SecureRandom p1) throws java.security.InvalidAlgorithmParameterException {}
}
