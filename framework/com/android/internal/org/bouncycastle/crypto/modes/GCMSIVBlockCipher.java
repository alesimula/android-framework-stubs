package com.android.internal.org.bouncycastle.crypto.modes;

public class GCMSIVBlockCipher implements com.android.internal.org.bouncycastle.crypto.modes.AEADBlockCipher {
    private static final byte ADD = -31;
    private static final int AEAD_COMPLETE = 2;
    private static final int BUFLEN = 16;
    private static final int HALFBUFLEN = 8;
    private static final int INIT = 1;
    private static final byte MASK = -128;
    private static final int MAX_DATALEN = 2147483623;
    private static final int NONCELEN = 12;
    private boolean forEncryption;
    private byte[] macBlock;
    private final com.android.internal.org.bouncycastle.crypto.modes.GCMSIVBlockCipher.GCMSIVHasher theAEADHasher = null;
    private final com.android.internal.org.bouncycastle.crypto.BlockCipher theCipher = null;
    private final com.android.internal.org.bouncycastle.crypto.modes.GCMSIVBlockCipher.GCMSIVHasher theDataHasher = null;
    private com.android.internal.org.bouncycastle.crypto.modes.GCMSIVBlockCipher.GCMSIVCache theEncData;
    private int theFlags;
    private final byte[] theGHash = null;
    private byte[] theInitialAEAD;
    private final com.android.internal.org.bouncycastle.crypto.modes.gcm.GCMMultiplier theMultiplier = null;
    private byte[] theNonce;
    private com.android.internal.org.bouncycastle.crypto.modes.GCMSIVBlockCipher.GCMSIVCache thePlain;
    private final byte[] theReverse = null;
    public GCMSIVBlockCipher() {}
    public GCMSIVBlockCipher(com.android.internal.org.bouncycastle.crypto.BlockCipher p0) {}
    public GCMSIVBlockCipher(com.android.internal.org.bouncycastle.crypto.BlockCipher p0, com.android.internal.org.bouncycastle.crypto.modes.gcm.GCMMultiplier p1) {}
    private static int bufLength(byte[] p0) { return 0; }
    private byte[] calculateTag() { return null; }
    private void checkAEADStatus(int p0) {}
    private static void checkBuffer(byte[] p0, int p1, int p2, boolean p3) {}
    private void checkStatus(int p0) {}
    private byte[] completePolyVal() { return null; }
    private void decryptPlain() throws com.android.internal.org.bouncycastle.crypto.InvalidCipherTextException {}
    private void deriveKeys(com.android.internal.org.bouncycastle.crypto.params.KeyParameter p0) {}
    private int encryptPlain(byte[] p0, byte[] p1, int p2) { return 0; }
    private static void fillReverse(byte[] p0, int p1, int p2, byte[] p3) {}
    private void gHASH(byte[] p0) {}
    private void gHashLengths() {}
    private static void incrementCounter(byte[] p0) {}
    private static void mulX(byte[] p0) {}
    private void resetStreams() {}
    private static void xorBlock(byte[] p0, byte[] p1) {}
    private static void xorBlock(byte[] p0, byte[] p1, int p2, int p3) {}
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

    private static class GCMSIVCache extends java.io.ByteArrayOutputStream {
        GCMSIVCache() { super(); }
        void clearBuffer() {}
        byte[] getBuffer() { return null; }
    }

    private class GCMSIVHasher {
        private int numActive;
        private long numHashed;
        private final byte[] theBuffer = null;
        private final byte[] theByte = null;
        private GCMSIVHasher(com.android.internal.org.bouncycastle.crypto.modes.GCMSIVBlockCipher p0) {}
        void completeHash() {}
        long getBytesProcessed() { return 0L; }
        void reset() {}
        void updateHash(byte p0) {}
        void updateHash(byte[] p0, int p1, int p2) {}
    }
}
