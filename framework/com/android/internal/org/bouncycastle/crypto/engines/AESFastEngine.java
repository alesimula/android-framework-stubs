package com.android.internal.org.bouncycastle.crypto.engines;

public class AESFastEngine implements com.android.internal.org.bouncycastle.crypto.BlockCipher {
    private static final int BLOCK_SIZE = 16;
    private static final byte[] S = null;
    private static final byte[] Si = null;
    private static final int[] T = null;
    private static final int[] Tinv = null;
    private static final int m1 = -2139062144;
    private static final int m2 = 2139062143;
    private static final int m3 = 27;
    private static final int m4 = -1061109568;
    private static final int m5 = 1061109567;
    private static final int[] rcon = null;
    private int ROUNDS;
    private int[][] WorkingKey;
    private boolean forEncryption;
    public AESFastEngine() {}
    private static int FFmulX(int p0) { return 0; }
    private static int FFmulX2(int p0) { return 0; }
    private int bitsOfSecurity() { return 0; }
    private void decryptBlock(byte[] p0, int p1, byte[] p2, int p3, int[][] p4) {}
    private void encryptBlock(byte[] p0, int p1, byte[] p2, int p3, int[][] p4) {}
    private int[][] generateWorkingKey(byte[] p0, boolean p1) { return null; }
    private static int inv_mcol(int p0) { return 0; }
    private static int shift(int p0, int p1) { return 0; }
    private static int subWord(int p0) { return 0; }
    public java.lang.String getAlgorithmName() { return null; }
    public int getBlockSize() { return 0; }
    public void init(boolean p0, com.android.internal.org.bouncycastle.crypto.CipherParameters p1) {}
    public int processBlock(byte[] p0, int p1, byte[] p2, int p3) { return 0; }
    public void reset() {}
    private static long[] $d2j$hex$b7149320$decode_J(java.lang.String p0) { return null; }
    private static int[] $d2j$hex$b7149320$decode_I(java.lang.String p0) { return null; }
    private static short[] $d2j$hex$b7149320$decode_S(java.lang.String p0) { return null; }
    private static byte[] $d2j$hex$b7149320$decode_B(java.lang.String p0) { return null; }
}
