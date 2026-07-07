package com.android.internal.org.bouncycastle.crypto.modes;

public class CFBBlockCipher extends com.android.internal.org.bouncycastle.crypto.StreamBlockCipher implements com.android.internal.org.bouncycastle.crypto.modes.CFBModeCipher {
    private byte[] IV;
    private int blockSize;
    private int byteCount;
    private byte[] cfbOutV;
    private byte[] cfbV;
    private com.android.internal.org.bouncycastle.crypto.BlockCipher cipher;
    private boolean encrypting;
    private byte[] inBuf;
    public CFBBlockCipher(com.android.internal.org.bouncycastle.crypto.BlockCipher p0, int p1) { super(null); }
    private byte decryptByte(byte p0) { return 0; }
    private byte encryptByte(byte p0) { return 0; }
    public static com.android.internal.org.bouncycastle.crypto.modes.CFBModeCipher newInstance(com.android.internal.org.bouncycastle.crypto.BlockCipher p0, int p1) { return null; }
    protected byte calculateByte(byte p0) throws com.android.internal.org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException { return 0; }
    public int decryptBlock(byte[] p0, int p1, byte[] p2, int p3) throws com.android.internal.org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException { return 0; }
    public int encryptBlock(byte[] p0, int p1, byte[] p2, int p3) throws com.android.internal.org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException { return 0; }
    public java.lang.String getAlgorithmName() { return null; }
    public int getBlockSize() { return 0; }
    public byte[] getCurrentIV() { return null; }
    public void init(boolean p0, com.android.internal.org.bouncycastle.crypto.CipherParameters p1) throws java.lang.IllegalArgumentException {}
    public int processBlock(byte[] p0, int p1, byte[] p2, int p3) throws com.android.internal.org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException { return 0; }
    public void reset() {}
}
