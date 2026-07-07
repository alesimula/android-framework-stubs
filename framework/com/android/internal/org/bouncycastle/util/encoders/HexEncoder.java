package com.android.internal.org.bouncycastle.util.encoders;

public class HexEncoder implements com.android.internal.org.bouncycastle.util.encoders.Encoder {
    protected final byte[] decodingTable = null;
    protected final byte[] encodingTable = null;
    public HexEncoder() {}
    private static boolean ignore(char p0) { return false; }
    public int decode(java.lang.String p0, java.io.OutputStream p1) throws java.io.IOException { return 0; }
    public int decode(byte[] p0, int p1, int p2, java.io.OutputStream p3) throws java.io.IOException { return 0; }
    byte[] decodeStrict(java.lang.String p0, int p1, int p2) throws java.io.IOException { return null; }
    public int encode(byte[] p0, int p1, int p2, java.io.OutputStream p3) throws java.io.IOException { return 0; }
    public int encode(byte[] p0, int p1, int p2, byte[] p3, int p4) throws java.io.IOException { return 0; }
    public int getEncodedLength(int p0) { return 0; }
    public int getMaxDecodedLength(int p0) { return 0; }
    protected void initialiseDecodingTable() {}
}
