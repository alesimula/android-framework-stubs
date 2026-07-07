package com.android.internal.org.bouncycastle.crypto.engines;

public class DESedeWrapEngine implements com.android.internal.org.bouncycastle.crypto.Wrapper {
    private static final byte[] IV2 = null;
    byte[] digest;
    private com.android.internal.org.bouncycastle.crypto.modes.CBCBlockCipher engine;
    private boolean forWrapping;
    private byte[] iv;
    private com.android.internal.org.bouncycastle.crypto.params.KeyParameter param;
    private com.android.internal.org.bouncycastle.crypto.params.ParametersWithIV paramPlusIV;
    com.android.internal.org.bouncycastle.crypto.Digest sha1;
    public DESedeWrapEngine() {}
    private byte[] calculateCMSKeyChecksum(byte[] p0) { return null; }
    private boolean checkCMSKeyChecksum(byte[] p0, byte[] p1) { return false; }
    public java.lang.String getAlgorithmName() { return null; }
    public void init(boolean p0, com.android.internal.org.bouncycastle.crypto.CipherParameters p1) {}
    public byte[] unwrap(byte[] p0, int p1, int p2) throws com.android.internal.org.bouncycastle.crypto.InvalidCipherTextException { return null; }
    public byte[] wrap(byte[] p0, int p1, int p2) { return null; }
}
