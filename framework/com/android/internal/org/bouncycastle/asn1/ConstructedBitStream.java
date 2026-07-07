package com.android.internal.org.bouncycastle.asn1;

class ConstructedBitStream extends java.io.InputStream {
    private com.android.internal.org.bouncycastle.asn1.ASN1BitStringParser _currentParser;
    private java.io.InputStream _currentStream;
    private boolean _first;
    private final boolean _octetAligned = false;
    private int _padBits;
    private final com.android.internal.org.bouncycastle.asn1.ASN1StreamParser _parser = null;
    ConstructedBitStream(com.android.internal.org.bouncycastle.asn1.ASN1StreamParser p0, boolean p1) { super(); }
    private com.android.internal.org.bouncycastle.asn1.ASN1BitStringParser getNextParser() throws java.io.IOException { return null; }
    int getPadBits() { return 0; }
    public int read() throws java.io.IOException { return 0; }
    public int read(byte[] p0, int p1, int p2) throws java.io.IOException { return 0; }
}
