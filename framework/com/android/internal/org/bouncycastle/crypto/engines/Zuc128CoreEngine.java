package com.android.internal.org.bouncycastle.crypto.engines;

public class Zuc128CoreEngine implements com.android.internal.org.bouncycastle.crypto.StreamCipher, com.android.internal.org.bouncycastle.util.Memoable {
    private static final short[] EK_d = null;
    private static final byte[] S0 = null;
    private static final byte[] S1 = null;
    private final int[] BRC = null;
    private final int[] F = null;
    private final int[] LFSR = null;
    private final byte[] keyStream = null;
    private int theIndex;
    private int theIterations;
    private com.android.internal.org.bouncycastle.crypto.engines.Zuc128CoreEngine theResetState;
    protected Zuc128CoreEngine() {}
    protected Zuc128CoreEngine(com.android.internal.org.bouncycastle.crypto.engines.Zuc128CoreEngine p0) {}
    private int AddM(int p0, int p1) { return 0; }
    private void BitReorganization() {}
    private static int L1(int p0) { return 0; }
    private static int L2(int p0) { return 0; }
    private void LFSRWithInitialisationMode(int p0) {}
    private void LFSRWithWorkMode() {}
    private static int MAKEU31(byte p0, short p1, byte p2) { return 0; }
    private static int MAKEU32(byte p0, byte p1, byte p2, byte p3) { return 0; }
    private static int MulByPow2(int p0, int p1) { return 0; }
    static int ROT(int p0, int p1) { return 0; }
    public static void encode32be(int p0, byte[] p1, int p2) {}
    private void makeKeyStream() {}
    private void setKeyAndIV(byte[] p0, byte[] p1) {}
    int F() { return 0; }
    public com.android.internal.org.bouncycastle.util.Memoable copy() { return null; }
    public java.lang.String getAlgorithmName() { return null; }
    protected int getMaxIterations() { return 0; }
    public void init(boolean p0, com.android.internal.org.bouncycastle.crypto.CipherParameters p1) {}
    protected int makeKeyStreamWord() { return 0; }
    public int processBytes(byte[] p0, int p1, int p2, byte[] p3, int p4) { return 0; }
    public void reset() {}
    public void reset(com.android.internal.org.bouncycastle.util.Memoable p0) {}
    public byte returnByte(byte p0) { return 0; }
    protected void setKeyAndIV(int[] p0, byte[] p1, byte[] p2) {}
}
