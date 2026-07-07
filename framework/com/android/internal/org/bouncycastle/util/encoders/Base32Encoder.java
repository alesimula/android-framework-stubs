package com.android.internal.org.bouncycastle.util.encoders;

public class Base32Encoder implements com.android.internal.org.bouncycastle.util.encoders.Encoder {
    private static final byte[] DEAULT_ENCODING_TABLE = null;
    private static final byte DEFAULT_PADDING = 61;
    private final byte[] decodingTable = null;
    private final byte[] encodingTable = null;
    private final byte padding = 0;
    public Base32Encoder() {}
    public Base32Encoder(byte[] p0, byte p1) {}
    private int decodeLastBlock(java.io.OutputStream p0, char p1, char p2, char p3, char p4, char p5, char p6, char p7, char p8) throws java.io.IOException { return 0; }
    private void encodeBlock(byte[] p0, int p1, byte[] p2, int p3) {}
    private boolean ignore(char p0) { return false; }
    private int nextI(byte[] p0, int p1, int p2) { return 0; }
    public int decode(java.lang.String p0, java.io.OutputStream p1) throws java.io.IOException { return 0; }
    public int decode(byte[] p0, int p1, int p2, java.io.OutputStream p3) throws java.io.IOException { return 0; }
    public int encode(byte[] p0, int p1, int p2, java.io.OutputStream p3) throws java.io.IOException { return 0; }
    public int encode(byte[] p0, int p1, int p2, byte[] p3, int p4) throws java.io.IOException { return 0; }
    public int getEncodedLength(int p0) { return 0; }
    public int getMaxDecodedLength(int p0) { return 0; }
    protected void initialiseDecodingTable() {}
}
