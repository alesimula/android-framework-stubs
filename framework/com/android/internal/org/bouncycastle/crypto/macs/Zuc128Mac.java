package com.android.internal.org.bouncycastle.crypto.macs;

public final class Zuc128Mac implements com.android.internal.org.bouncycastle.crypto.Mac {
    private static final int TOPBIT = 128;
    private int theByteIndex;
    private final com.android.internal.org.bouncycastle.crypto.macs.Zuc128Mac.InternalZuc128Engine theEngine = null;
    private final int[] theKeyStream = null;
    private int theMac;
    private com.android.internal.org.bouncycastle.crypto.engines.Zuc128CoreEngine theState;
    private int theWordIndex;
    public Zuc128Mac() {}
    private int getFinalWord() { return 0; }
    private int getKeyStreamWord(int p0) { return 0; }
    private void initKeyStream() {}
    private void shift4NextByte() {}
    private void updateMac(int p0) {}
    public int doFinal(byte[] p0, int p1) { return 0; }
    public java.lang.String getAlgorithmName() { return null; }
    public int getMacSize() { return 0; }
    public void init(com.android.internal.org.bouncycastle.crypto.CipherParameters p0) {}
    public void reset() {}
    public void update(byte p0) {}
    public void update(byte[] p0, int p1, int p2) {}

    private static class InternalZuc128Engine extends com.android.internal.org.bouncycastle.crypto.engines.Zuc128CoreEngine {
        private InternalZuc128Engine() { super(); }
        int createKeyStreamWord() { return 0; }
    }
}
