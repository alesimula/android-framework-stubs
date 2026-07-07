package com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.rsa;

class CustomPKCS1Encoding implements com.android.internal.org.bouncycastle.crypto.AsymmetricBlockCipher {
    private static final int HEADER_LENGTH = 10;
    private byte[] blockBuffer;
    private com.android.internal.org.bouncycastle.crypto.AsymmetricBlockCipher engine;
    private boolean forEncryption;
    private boolean forPrivateKey;
    private java.security.SecureRandom random;
    private boolean useStrictLength;
    CustomPKCS1Encoding(com.android.internal.org.bouncycastle.crypto.AsymmetricBlockCipher p0) {}
    private static int checkPkcs1Encoding1(byte[] p0) { return 0; }
    private static int checkPkcs1Encoding2(byte[] p0) { return 0; }
    private byte[] decodeBlock(byte[] p0, int p1, int p2) throws com.android.internal.org.bouncycastle.crypto.InvalidCipherTextException { return null; }
    private byte[] encodeBlock(byte[] p0, int p1, int p2) throws com.android.internal.org.bouncycastle.crypto.InvalidCipherTextException { return null; }
    private boolean useStrict() { return false; }
    public int getInputBlockSize() { return 0; }
    public int getOutputBlockSize() { return 0; }
    public com.android.internal.org.bouncycastle.crypto.AsymmetricBlockCipher getUnderlyingCipher() { return null; }
    public void init(boolean p0, com.android.internal.org.bouncycastle.crypto.CipherParameters p1) {}
    public byte[] processBlock(byte[] p0, int p1, int p2) throws com.android.internal.org.bouncycastle.crypto.InvalidCipherTextException { return null; }
}
