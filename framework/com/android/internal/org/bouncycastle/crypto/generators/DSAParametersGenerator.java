package com.android.internal.org.bouncycastle.crypto.generators;

public class DSAParametersGenerator {
    private static final java.math.BigInteger ONE = null;
    private static final java.math.BigInteger TWO = null;
    private static final java.math.BigInteger ZERO = null;
    private int L;
    private int N;
    private int certainty;
    private com.android.internal.org.bouncycastle.crypto.Digest digest;
    private int iterations;
    private java.security.SecureRandom random;
    private int usageIndex;
    private boolean use186_3;
    public DSAParametersGenerator() {}
    public DSAParametersGenerator(com.android.internal.org.bouncycastle.crypto.Digest p0) {}
    private static java.math.BigInteger calculateGenerator_FIPS186_2(java.math.BigInteger p0, java.math.BigInteger p1, java.security.SecureRandom p2) { return null; }
    private static java.math.BigInteger calculateGenerator_FIPS186_3_Unverifiable(java.math.BigInteger p0, java.math.BigInteger p1, java.security.SecureRandom p2) { return null; }
    private static java.math.BigInteger calculateGenerator_FIPS186_3_Verifiable(com.android.internal.org.bouncycastle.crypto.Digest p0, java.math.BigInteger p1, java.math.BigInteger p2, byte[] p3, int p4) { return null; }
    private com.android.internal.org.bouncycastle.crypto.params.DSAParameters generateParameters_FIPS186_2() { return null; }
    private com.android.internal.org.bouncycastle.crypto.params.DSAParameters generateParameters_FIPS186_3() { return null; }
    private static int getDefaultN(int p0) { return 0; }
    private static int getMinimumIterations(int p0) { return 0; }
    private static void hash(com.android.internal.org.bouncycastle.crypto.Digest p0, byte[] p1, byte[] p2, int p3) {}
    private static void inc(byte[] p0) {}
    private boolean isProbablePrime(java.math.BigInteger p0) { return false; }
    public com.android.internal.org.bouncycastle.crypto.params.DSAParameters generateParameters() { return null; }
    public void init(int p0, int p1, java.security.SecureRandom p2) {}
    public void init(com.android.internal.org.bouncycastle.crypto.params.DSAParameterGenerationParameters p0) {}
}
