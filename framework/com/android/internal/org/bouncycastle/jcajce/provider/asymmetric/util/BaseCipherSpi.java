package com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.util;

public abstract class BaseCipherSpi extends javax.crypto.CipherSpi {
    private java.lang.Class[] availableSpecs;
    protected java.security.AlgorithmParameters engineParams;
    private final com.android.internal.org.bouncycastle.jcajce.util.JcaJceHelper helper = null;
    private byte[] iv;
    private int ivSize;
    protected com.android.internal.org.bouncycastle.crypto.Wrapper wrapEngine;
    protected BaseCipherSpi() { super(); }
    protected final java.security.AlgorithmParameters createParametersInstance(java.lang.String p0) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException { return null; }
    protected int engineGetBlockSize() { return 0; }
    protected byte[] engineGetIV() { return null; }
    protected int engineGetKeySize(java.security.Key p0) { return 0; }
    protected int engineGetOutputSize(int p0) { return 0; }
    protected java.security.AlgorithmParameters engineGetParameters() { return null; }
    protected void engineSetMode(java.lang.String p0) throws java.security.NoSuchAlgorithmException {}
    protected void engineSetPadding(java.lang.String p0) throws javax.crypto.NoSuchPaddingException {}
    protected java.security.Key engineUnwrap(byte[] p0, java.lang.String p1, int p2) throws java.security.InvalidKeyException { return null; }
    protected byte[] engineWrap(java.security.Key p0) throws javax.crypto.IllegalBlockSizeException, java.security.InvalidKeyException { return null; }

    protected static final class ErasableOutputStream extends java.io.ByteArrayOutputStream {
        public ErasableOutputStream() { super(); }
        public void erase() {}
        public byte[] getBuf() { return null; }
    }
}
