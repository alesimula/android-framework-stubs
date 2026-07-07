package com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.ec;

public class KeyAgreementSpi extends com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi {
    private static final com.android.internal.org.bouncycastle.asn1.x9.X9IntegerConverter converter = null;
    private java.lang.Object agreement;
    private java.lang.String kaAlgorithm;
    private com.android.internal.org.bouncycastle.crypto.params.ECDomainParameters parameters;
    private byte[] result;
    protected KeyAgreementSpi(java.lang.String p0, com.android.internal.org.bouncycastle.crypto.BasicAgreement p1, com.android.internal.org.bouncycastle.crypto.DerivationFunction p2) { super(null, null); }
    private static java.lang.String getSimpleName(java.lang.Class p0) { return null; }
    private void initFromKey(java.security.Key p0, java.security.spec.AlgorithmParameterSpec p1) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {}
    protected byte[] bigIntToBytes(java.math.BigInteger p0) { return null; }
    protected byte[] doCalcSecret() { return null; }
    protected void doInitFromKey(java.security.Key p0, java.security.spec.AlgorithmParameterSpec p1, java.security.SecureRandom p2) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {}
    protected java.security.Key engineDoPhase(java.security.Key p0, boolean p1) throws java.security.InvalidKeyException, java.lang.IllegalStateException { return null; }
    protected void engineInit(java.security.Key p0, java.security.SecureRandom p1) throws java.security.InvalidKeyException {}

    public static class DH extends com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi {
        public DH() { super(null, null, null); }
    }
}
