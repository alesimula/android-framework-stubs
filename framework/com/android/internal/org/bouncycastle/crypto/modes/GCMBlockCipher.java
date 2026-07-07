package com.android.internal.org.bouncycastle.crypto.modes;

public class GCMBlockCipher implements com.android.internal.org.bouncycastle.crypto.modes.GCMModeCipher {
    private static final int BLOCK_SIZE = 16;
    private static final long MAX_INPUT_SIZE = 68719476704L;
    private byte[] H;
    private byte[] J0;
    private byte[] S;
    private byte[] S_at;
    private byte[] S_atPre;
    private byte[] atBlock;
    private int atBlockPos;
    private long atLength;
    private long atLengthPre;
    private int blocksRemaining;
    private byte[] bufBlock;
    private int bufOff;
    private com.android.internal.org.bouncycastle.crypto.BlockCipher cipher;
    private byte[] counter;
    private com.android.internal.org.bouncycastle.crypto.modes.gcm.GCMExponentiator exp;
    private boolean forEncryption;
    private byte[] initialAssociatedText;
    private boolean initialised;
    private byte[] lastKey;
    private byte[] macBlock;
    private int macSize;
    private com.android.internal.org.bouncycastle.crypto.modes.gcm.GCMMultiplier multiplier;
    private byte[] nonce;
    private long totalLength;
    public GCMBlockCipher(com.android.internal.org.bouncycastle.crypto.BlockCipher p0) {}
    public GCMBlockCipher(com.android.internal.org.bouncycastle.crypto.BlockCipher p0, com.android.internal.org.bouncycastle.crypto.modes.gcm.GCMMultiplier p1) {}
    private void checkStatus() {}
    private void decryptBlock(byte[] p0, int p1, byte[] p2, int p3) {}
    private void encryptBlock(byte[] p0, int p1, byte[] p2, int p3) {}
    private void gHASH(byte[] p0, byte[] p1, int p2) {}
    private void gHASHBlock(byte[] p0, byte[] p1) {}
    private void gHASHBlock(byte[] p0, byte[] p1, int p2) {}
    private void gHASHPartial(byte[] p0, byte[] p1, int p2, int p3) {}
    private void getNextCTRBlock(byte[] p0) {}
    private long getTotalInputSizeAfterNewInput(int p0) { return 0L; }
    private void initCipher() {}
    public static com.android.internal.org.bouncycastle.crypto.modes.GCMModeCipher newInstance(com.android.internal.org.bouncycastle.crypto.BlockCipher p0) { return null; }
    public static com.android.internal.org.bouncycastle.crypto.modes.GCMModeCipher newInstance(com.android.internal.org.bouncycastle.crypto.BlockCipher p0, com.android.internal.org.bouncycastle.crypto.modes.gcm.GCMMultiplier p1) { return null; }
    private void processPartial(byte[] p0, int p1, int p2, byte[] p3, int p4) {}
    private void reset(boolean p0) {}
    public int doFinal(byte[] p0, int p1) throws java.lang.IllegalStateException, com.android.internal.org.bouncycastle.crypto.InvalidCipherTextException { return 0; }
    public java.lang.String getAlgorithmName() { return null; }
    public byte[] getMac() { return null; }
    public int getOutputSize(int p0) { return 0; }
    public com.android.internal.org.bouncycastle.crypto.BlockCipher getUnderlyingCipher() { return null; }
    public int getUpdateOutputSize(int p0) { return 0; }
    public void init(boolean p0, com.android.internal.org.bouncycastle.crypto.CipherParameters p1) throws java.lang.IllegalArgumentException {}
    public void processAADByte(byte p0) {}
    public void processAADBytes(byte[] p0, int p1, int p2) {}
    public int processByte(byte p0, byte[] p1, int p2) throws com.android.internal.org.bouncycastle.crypto.DataLengthException { return 0; }
    public int processBytes(byte[] p0, int p1, int p2, byte[] p3, int p4) throws com.android.internal.org.bouncycastle.crypto.DataLengthException { return 0; }
    public void reset() {}
}
