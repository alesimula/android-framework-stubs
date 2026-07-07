package com.android.internal.org.bouncycastle.crypto.engines;

public class RFC3394WrapEngine implements com.android.internal.org.bouncycastle.crypto.Wrapper {
    private static final byte[] DEFAULT_IV = null;
    private final com.android.internal.org.bouncycastle.crypto.BlockCipher engine = null;
    private boolean forWrapping;
    private final byte[] iv = null;
    private com.android.internal.org.bouncycastle.crypto.params.KeyParameter param;
    private final boolean wrapCipherMode = false;
    public RFC3394WrapEngine(com.android.internal.org.bouncycastle.crypto.BlockCipher p0) {}
    public RFC3394WrapEngine(com.android.internal.org.bouncycastle.crypto.BlockCipher p0, boolean p1) {}
    public java.lang.String getAlgorithmName() { return null; }
    public void init(boolean p0, com.android.internal.org.bouncycastle.crypto.CipherParameters p1) {}
    public byte[] unwrap(byte[] p0, int p1, int p2) throws com.android.internal.org.bouncycastle.crypto.InvalidCipherTextException { return null; }
    public byte[] wrap(byte[] p0, int p1, int p2) { return null; }
}
