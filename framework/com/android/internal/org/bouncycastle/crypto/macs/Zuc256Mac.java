package com.android.internal.org.bouncycastle.crypto.macs;

public final class Zuc256Mac implements com.android.internal.org.bouncycastle.crypto.Mac {
    private static final int TOPBIT = 128;
    private int theByteIndex;
    private final com.android.internal.org.bouncycastle.crypto.macs.Zuc256Mac.InternalZuc256Engine theEngine = null;
    private final int[] theKeyStream = null;
    private final int[] theMac = null;
    private final int theMacLength = 0;
    private com.android.internal.org.bouncycastle.crypto.engines.Zuc256CoreEngine theState;
    private int theWordIndex;
    public Zuc256Mac(int p0) {}
    private int getKeyStreamWord(int p0, int p1) { return 0; }
    private void initKeyStream() {}
    private void shift4Final() {}
    private void shift4NextByte() {}
    private void updateMac(int p0) {}
    public int doFinal(byte[] p0, int p1) { return 0; }
    public java.lang.String getAlgorithmName() { return null; }
    public int getMacSize() { return 0; }
    public void init(com.android.internal.org.bouncycastle.crypto.CipherParameters p0) {}
    public void reset() {}
    public void update(byte p0) {}
    public void update(byte[] p0, int p1, int p2) {}

    private static class InternalZuc256Engine extends com.android.internal.org.bouncycastle.crypto.engines.Zuc256CoreEngine {
        public InternalZuc256Engine(int p0) { super(); }
        int createKeyStreamWord() { return 0; }
    }
}
