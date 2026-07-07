package com.android.internal.org.bouncycastle.crypto.engines;

public final class BlowfishEngine implements com.android.internal.org.bouncycastle.crypto.BlockCipher {
    private static final int BLOCK_SIZE = 8;
    private static final int[] KP = null;
    private static final int[] KS0 = null;
    private static final int[] KS1 = null;
    private static final int[] KS2 = null;
    private static final int[] KS3 = null;
    private static final int P_SZ = 18;
    private static final int ROUNDS = 16;
    private static final int SBOX_SK = 256;
    private final int[] P = null;
    private final int[] S0 = null;
    private final int[] S1 = null;
    private final int[] S2 = null;
    private final int[] S3 = null;
    private boolean encrypting;
    private byte[] workingKey;
    public BlowfishEngine() {}
    private void Bits32ToBytes(int p0, byte[] p1, int p2) {}
    private int BytesTo32bits(byte[] p0, int p1) { return 0; }
    private int F(int p0) { return 0; }
    private int bitsOfSecurity() { return 0; }
    private void decryptBlock(byte[] p0, int p1, byte[] p2, int p3) {}
    private void encryptBlock(byte[] p0, int p1, byte[] p2, int p3) {}
    private com.android.internal.org.bouncycastle.crypto.CryptoServicePurpose getPurpose() { return null; }
    private void processTable(int p0, int p1, int[] p2) {}
    private void setKey(byte[] p0) {}
    public java.lang.String getAlgorithmName() { return null; }
    public int getBlockSize() { return 0; }
    public void init(boolean p0, com.android.internal.org.bouncycastle.crypto.CipherParameters p1) {}
    public final int processBlock(byte[] p0, int p1, byte[] p2, int p3) { return 0; }
    public void reset() {}
    private static long[] $d2j$hex$3008ba5d$decode_J(java.lang.String p0) { return null; }
    private static int[] $d2j$hex$3008ba5d$decode_I(java.lang.String p0) { return null; }
    private static short[] $d2j$hex$3008ba5d$decode_S(java.lang.String p0) { return null; }
    private static byte[] $d2j$hex$3008ba5d$decode_B(java.lang.String p0) { return null; }
}
