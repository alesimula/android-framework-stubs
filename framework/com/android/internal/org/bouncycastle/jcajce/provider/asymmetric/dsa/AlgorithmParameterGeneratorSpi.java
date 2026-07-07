package com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.dsa;

public class AlgorithmParameterGeneratorSpi extends com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.util.BaseAlgorithmParameterGeneratorSpi {
    protected com.android.internal.org.bouncycastle.crypto.params.DSAParameterGenerationParameters params;
    protected java.security.SecureRandom random;
    protected int strength;
    public AlgorithmParameterGeneratorSpi() { super(); }
    protected java.security.AlgorithmParameters engineGenerateParameters() { return null; }
    protected void engineInit(int p0, java.security.SecureRandom p1) {}
    protected void engineInit(java.security.spec.AlgorithmParameterSpec p0, java.security.SecureRandom p1) throws java.security.InvalidAlgorithmParameterException {}
}
