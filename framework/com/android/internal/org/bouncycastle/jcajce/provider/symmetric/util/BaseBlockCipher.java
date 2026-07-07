package com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util;

public class BaseBlockCipher extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher implements com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.PBE {
    private static final int BUF_SIZE = 512;
    private com.android.internal.org.bouncycastle.crypto.params.AEADParameters aeadParams;
    private java.lang.Class[] availableSpecs;
    private com.android.internal.org.bouncycastle.crypto.BlockCipher baseEngine;
    private com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher cipher;
    private int digest;
    private com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider engineProvider;
    private boolean fixedIv;
    private int ivLength;
    private com.android.internal.org.bouncycastle.crypto.params.ParametersWithIV ivParam;
    private int keySizeInBits;
    private java.lang.String modeName;
    private boolean padded;
    private java.lang.String pbeAlgorithm;
    private javax.crypto.spec.PBEParameterSpec pbeSpec;
    private int scheme;
    protected BaseBlockCipher(com.android.internal.org.bouncycastle.crypto.BlockCipher p0) { super(); }
    protected BaseBlockCipher(com.android.internal.org.bouncycastle.crypto.BlockCipher p0, int p1) { super(); }
    protected BaseBlockCipher(com.android.internal.org.bouncycastle.crypto.BlockCipher p0, int p1, int p2, int p3, int p4) { super(); }
    protected BaseBlockCipher(com.android.internal.org.bouncycastle.crypto.BlockCipher p0, boolean p1, int p2) { super(); }
    protected BaseBlockCipher(com.android.internal.org.bouncycastle.crypto.BufferedBlockCipher p0, int p1) { super(); }
    protected BaseBlockCipher(com.android.internal.org.bouncycastle.crypto.BufferedBlockCipher p0, boolean p1, int p2) { super(); }
    protected BaseBlockCipher(com.android.internal.org.bouncycastle.crypto.modes.AEADBlockCipher p0) { super(); }
    protected BaseBlockCipher(com.android.internal.org.bouncycastle.crypto.modes.AEADBlockCipher p0, boolean p1, int p2) { super(); }
    protected BaseBlockCipher(com.android.internal.org.bouncycastle.crypto.modes.AEADCipher p0, boolean p1, int p2) { super(); }
    protected BaseBlockCipher(com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider p0) { super(); }
    private com.android.internal.org.bouncycastle.crypto.CipherParameters adjustParameters(java.security.spec.AlgorithmParameterSpec p0, com.android.internal.org.bouncycastle.crypto.CipherParameters p1) { return null; }
    private boolean isAEADModeName(java.lang.String p0) { return false; }
    private boolean isBCPBEKeyWithoutIV(java.security.Key p0) { return false; }
    protected int engineDoFinal(byte[] p0, int p1, int p2, byte[] p3, int p4) throws javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException, javax.crypto.ShortBufferException { return 0; }
    protected byte[] engineDoFinal(byte[] p0, int p1, int p2) throws javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException { return null; }
    protected int engineGetBlockSize() { return 0; }
    protected byte[] engineGetIV() { return null; }
    protected int engineGetKeySize(java.security.Key p0) { return 0; }
    protected int engineGetOutputSize(int p0) { return 0; }
    protected java.security.AlgorithmParameters engineGetParameters() { return null; }
    protected void engineInit(int p0, java.security.Key p1, java.security.AlgorithmParameters p2, java.security.SecureRandom p3) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {}
    protected void engineInit(int p0, java.security.Key p1, java.security.SecureRandom p2) throws java.security.InvalidKeyException {}
    protected void engineInit(int p0, java.security.Key p1, java.security.spec.AlgorithmParameterSpec p2, java.security.SecureRandom p3) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {}
    protected void engineSetMode(java.lang.String p0) throws java.security.NoSuchAlgorithmException {}
    protected void engineSetPadding(java.lang.String p0) throws javax.crypto.NoSuchPaddingException {}
    protected int engineUpdate(byte[] p0, int p1, int p2, byte[] p3, int p4) throws javax.crypto.ShortBufferException { return 0; }
    protected byte[] engineUpdate(byte[] p0, int p1, int p2) { return null; }
    protected void engineUpdateAAD(java.nio.ByteBuffer p0) {}
    protected void engineUpdateAAD(byte[] p0, int p1, int p2) {}

    private static class AEADGenericBlockCipher implements com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher {
        private static final java.lang.reflect.Constructor aeadBadTagConstructor = null;
        private com.android.internal.org.bouncycastle.crypto.modes.AEADCipher cipher;
        AEADGenericBlockCipher(com.android.internal.org.bouncycastle.crypto.modes.AEADCipher p0) {}
        private static java.lang.reflect.Constructor findExceptionConstructor(java.lang.Class p0) { return null; }
        public int doFinal(byte[] p0, int p1) throws java.lang.IllegalStateException, javax.crypto.BadPaddingException { return 0; }
        public java.lang.String getAlgorithmName() { return null; }
        public int getOutputSize(int p0) { return 0; }
        public com.android.internal.org.bouncycastle.crypto.BlockCipher getUnderlyingCipher() { return null; }
        public int getUpdateOutputSize(int p0) { return 0; }
        public void init(boolean p0, com.android.internal.org.bouncycastle.crypto.CipherParameters p1) throws java.lang.IllegalArgumentException {}
        public int processByte(byte p0, byte[] p1, int p2) throws com.android.internal.org.bouncycastle.crypto.DataLengthException { return 0; }
        public int processBytes(byte[] p0, int p1, int p2, byte[] p3, int p4) throws com.android.internal.org.bouncycastle.crypto.DataLengthException { return 0; }
        public void updateAAD(byte[] p0, int p1, int p2) {}
        public boolean wrapOnNoPadding() { return false; }
    }

    private static class BufferedGenericBlockCipher implements com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher {
        private com.android.internal.org.bouncycastle.crypto.BufferedBlockCipher cipher;
        BufferedGenericBlockCipher(com.android.internal.org.bouncycastle.crypto.BlockCipher p0) {}
        BufferedGenericBlockCipher(com.android.internal.org.bouncycastle.crypto.BlockCipher p0, com.android.internal.org.bouncycastle.crypto.paddings.BlockCipherPadding p1) {}
        BufferedGenericBlockCipher(com.android.internal.org.bouncycastle.crypto.BufferedBlockCipher p0) {}
        public int doFinal(byte[] p0, int p1) throws java.lang.IllegalStateException, javax.crypto.BadPaddingException { return 0; }
        public java.lang.String getAlgorithmName() { return null; }
        public int getOutputSize(int p0) { return 0; }
        public com.android.internal.org.bouncycastle.crypto.BlockCipher getUnderlyingCipher() { return null; }
        public int getUpdateOutputSize(int p0) { return 0; }
        public void init(boolean p0, com.android.internal.org.bouncycastle.crypto.CipherParameters p1) throws java.lang.IllegalArgumentException {}
        public int processByte(byte p0, byte[] p1, int p2) throws com.android.internal.org.bouncycastle.crypto.DataLengthException { return 0; }
        public int processBytes(byte[] p0, int p1, int p2, byte[] p3, int p4) throws com.android.internal.org.bouncycastle.crypto.DataLengthException { return 0; }
        public void updateAAD(byte[] p0, int p1, int p2) {}
        public boolean wrapOnNoPadding() { return false; }
    }

    private static interface GenericBlockCipher {
        public int doFinal(byte[] p0, int p1) throws java.lang.IllegalStateException, javax.crypto.BadPaddingException;
        public java.lang.String getAlgorithmName();
        public int getOutputSize(int p0);
        public com.android.internal.org.bouncycastle.crypto.BlockCipher getUnderlyingCipher();
        public int getUpdateOutputSize(int p0);
        public void init(boolean p0, com.android.internal.org.bouncycastle.crypto.CipherParameters p1) throws java.lang.IllegalArgumentException;
        public int processByte(byte p0, byte[] p1, int p2) throws com.android.internal.org.bouncycastle.crypto.DataLengthException;
        public int processBytes(byte[] p0, int p1, int p2, byte[] p3, int p4) throws com.android.internal.org.bouncycastle.crypto.DataLengthException;
        public void updateAAD(byte[] p0, int p1, int p2);
        public boolean wrapOnNoPadding();
    }
}
