package com.android.internal.org.bouncycastle.crypto.engines;

public class RC2Engine implements com.android.internal.org.bouncycastle.crypto.BlockCipher {
    private static final int BLOCK_SIZE = 8;
    private static byte[] piTable;
    private boolean encrypting;
    private int[] workingKey;
    public RC2Engine() {}
    private void decryptBlock(byte[] p0, int p1, byte[] p2, int p3) {}
    private void encryptBlock(byte[] p0, int p1, byte[] p2, int p3) {}
    private int[] generateWorkingKey(byte[] p0, int p1) { return null; }
    private int rotateWordLeft(int p0, int p1) { return 0; }
    public java.lang.String getAlgorithmName() { return null; }
    public int getBlockSize() { return 0; }
    public void init(boolean p0, com.android.internal.org.bouncycastle.crypto.CipherParameters p1) {}
    public final int processBlock(byte[] p0, int p1, byte[] p2, int p3) { return 0; }
    public void reset() {}
}
