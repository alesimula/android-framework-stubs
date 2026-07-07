package com.android.internal.org.bouncycastle.crypto.modes;

public class OFBBlockCipher extends com.android.internal.org.bouncycastle.crypto.StreamBlockCipher {
    private byte[] IV;
    private final int blockSize = 0;
    private int byteCount;
    private final com.android.internal.org.bouncycastle.crypto.BlockCipher cipher = null;
    private byte[] ofbOutV;
    private byte[] ofbV;
    public OFBBlockCipher(com.android.internal.org.bouncycastle.crypto.BlockCipher p0, int p1) { super(null); }
    protected byte calculateByte(byte p0) throws com.android.internal.org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException { return 0; }
    public java.lang.String getAlgorithmName() { return null; }
    public int getBlockSize() { return 0; }
    public void init(boolean p0, com.android.internal.org.bouncycastle.crypto.CipherParameters p1) throws java.lang.IllegalArgumentException {}
    public int processBlock(byte[] p0, int p1, byte[] p2, int p3) throws com.android.internal.org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException { return 0; }
    public void reset() {}
}
