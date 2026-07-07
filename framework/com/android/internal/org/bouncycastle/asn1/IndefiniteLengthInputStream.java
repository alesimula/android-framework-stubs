package com.android.internal.org.bouncycastle.asn1;

class IndefiniteLengthInputStream extends com.android.internal.org.bouncycastle.asn1.LimitedInputStream {
    private int _b1;
    private int _b2;
    private boolean _eofOn00;
    private boolean _eofReached;
    IndefiniteLengthInputStream(java.io.InputStream p0, int p1) throws java.io.IOException { super(null, 0); }
    private boolean checkForEof() { return false; }
    public int read() throws java.io.IOException { return 0; }
    public int read(byte[] p0, int p1, int p2) throws java.io.IOException { return 0; }
    void setEofOn00(boolean p0) {}
}
