package com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.dh;

public class KeyPairGeneratorSpi extends java.security.KeyPairGenerator {
    private static java.lang.Object lock;
    private static java.util.Hashtable params;
    com.android.internal.org.bouncycastle.crypto.generators.DHBasicKeyPairGenerator engine;
    boolean initialised;
    com.android.internal.org.bouncycastle.crypto.params.DHKeyGenerationParameters param;
    java.security.SecureRandom random;
    int strength;
    public KeyPairGeneratorSpi() { super((java.lang.String)null); }
    private com.android.internal.org.bouncycastle.crypto.params.DHKeyGenerationParameters convertParams(java.security.SecureRandom p0, javax.crypto.spec.DHParameterSpec p1) { return null; }
    public java.security.KeyPair generateKeyPair() { return null; }
    public void initialize(int p0, java.security.SecureRandom p1) {}
    public void initialize(java.security.spec.AlgorithmParameterSpec p0, java.security.SecureRandom p1) throws java.security.InvalidAlgorithmParameterException {}
}
