package com.android.internal.org.bouncycastle.crypto.modes;

public class SICBlockCipher extends com.android.internal.org.bouncycastle.crypto.StreamBlockCipher implements com.android.internal.org.bouncycastle.crypto.modes.CTRModeCipher {
    private byte[] IV;
    private final int blockSize = 0;
    private int byteCount;
    private final com.android.internal.org.bouncycastle.crypto.BlockCipher cipher = null;
    private byte[] counter;
    private byte[] counterOut;
    public SICBlockCipher(com.android.internal.org.bouncycastle.crypto.BlockCipher p0) { super(null); }
    private void adjustCounter(long p0) {}
    private void checkCounter() {}
    private void checkLastIncrement() {}
    private void decrementCounterAt(int p0) {}
    private void incrementCounter() {}
    private void incrementCounter(int p0) {}
    private void incrementCounterAt(int p0) {}
    public static com.android.internal.org.bouncycastle.crypto.modes.CTRModeCipher newInstance(com.android.internal.org.bouncycastle.crypto.BlockCipher p0) { return null; }
    protected byte calculateByte(byte p0) throws com.android.internal.org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException { return 0; }
    public java.lang.String getAlgorithmName() { return null; }
    public int getBlockSize() { return 0; }
    public long getPosition() { return 0L; }
    public void init(boolean p0, com.android.internal.org.bouncycastle.crypto.CipherParameters p1) throws java.lang.IllegalArgumentException {}
    public int processBlock(byte[] p0, int p1, byte[] p2, int p3) throws com.android.internal.org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException { return 0; }
    public int processBytes(byte[] p0, int p1, int p2, byte[] p3, int p4) throws com.android.internal.org.bouncycastle.crypto.DataLengthException { return 0; }
    public void reset() {}
    public long seekTo(long p0) { return 0L; }
    public long skip(long p0) { return 0L; }
}
