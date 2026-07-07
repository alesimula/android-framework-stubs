package com.android.internal.org.bouncycastle.crypto.engines;

public class AsconEngine implements com.android.internal.org.bouncycastle.crypto.modes.AEADCipher {
    private final int ASCON_AEAD_RATE = 0;
    private final long ASCON_IV = 0L;
    private final int CRYPTO_ABYTES = 0;
    private final int CRYPTO_KEYBYTES = 0;
    private long K0;
    private long K1;
    private long K2;
    private long N0;
    private long N1;
    private final java.lang.String algorithmName = null;
    private final com.android.internal.org.bouncycastle.crypto.engines.AsconEngine.AsconParameters asconParameters = null;
    private byte[] initialAssociatedText;
    private final byte[] m_buf = null;
    private int m_bufPos;
    private final int m_bufferSizeDecrypt = 0;
    private com.android.internal.org.bouncycastle.crypto.engines.AsconEngine.State m_state;
    private byte[] mac;
    private final int nr = 0;
    private long x0;
    private long x1;
    private long x2;
    private long x3;
    private long x4;
    public AsconEngine(com.android.internal.org.bouncycastle.crypto.engines.AsconEngine.AsconParameters p0) {}
    private void P(int p0) {}
    private long PAD(int p0) { return 0L; }
    private void ROUND(long p0) {}
    private void ascon_aeadinit() {}
    private void checkAAD() {}
    private boolean checkData() { return false; }
    private void finishAAD(com.android.internal.org.bouncycastle.crypto.engines.AsconEngine.State p0) {}
    private void finishData(com.android.internal.org.bouncycastle.crypto.engines.AsconEngine.State p0) {}
    private void processBufferAAD(byte[] p0, int p1) {}
    private void processBufferDecrypt(byte[] p0, int p1, byte[] p2, int p3) {}
    private void processBufferEncrypt(byte[] p0, int p1, byte[] p2, int p3) {}
    private void processFinalDecrypt(byte[] p0, int p1, int p2, byte[] p3, int p4) {}
    private void processFinalEncrypt(byte[] p0, int p1, int p2, byte[] p3, int p4) {}
    private void reset(boolean p0) {}
    public int doFinal(byte[] p0, int p1) throws java.lang.IllegalStateException, com.android.internal.org.bouncycastle.crypto.InvalidCipherTextException, com.android.internal.org.bouncycastle.crypto.DataLengthException { return 0; }
    public java.lang.String getAlgorithmName() { return null; }
    public java.lang.String getAlgorithmVersion() { return null; }
    public int getIVBytesSize() { return 0; }
    public int getKeyBytesSize() { return 0; }
    public byte[] getMac() { return null; }
    public int getOutputSize(int p0) { return 0; }
    public int getUpdateOutputSize(int p0) { return 0; }
    public void init(boolean p0, com.android.internal.org.bouncycastle.crypto.CipherParameters p1) throws java.lang.IllegalArgumentException {}
    public void processAADByte(byte p0) {}
    public void processAADBytes(byte[] p0, int p1, int p2) {}
    public int processByte(byte p0, byte[] p1, int p2) throws com.android.internal.org.bouncycastle.crypto.DataLengthException { return 0; }
    public int processBytes(byte[] p0, int p1, int p2, byte[] p3, int p4) throws com.android.internal.org.bouncycastle.crypto.DataLengthException { return 0; }
    public void reset() {}

    public static enum AsconParameters {
        ascon128,
        ascon128a,
        ascon80pq;
        private static final com.android.internal.org.bouncycastle.crypto.engines.AsconEngine.AsconParameters[] $VALUES = null;
        private AsconParameters() {}
    }

    private static enum State {
        DecAad,
        DecData,
        DecFinal,
        DecInit,
        EncAad,
        EncData,
        EncFinal,
        EncInit,
        Uninitialized;
        private static final com.android.internal.org.bouncycastle.crypto.engines.AsconEngine.State[] $VALUES = null;
        private State() {}
    }
}
