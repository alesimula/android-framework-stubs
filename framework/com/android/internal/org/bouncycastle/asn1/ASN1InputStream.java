package com.android.internal.org.bouncycastle.asn1;

public class ASN1InputStream extends java.io.FilterInputStream implements com.android.internal.org.bouncycastle.asn1.BERTags {
    private final boolean lazyEvaluate = false;
    private final int limit = 0;
    private final byte[][] tmpBuffers = null;
    public ASN1InputStream(java.io.InputStream p0) { super((java.io.InputStream)null); }
    public ASN1InputStream(java.io.InputStream p0, int p1) { super((java.io.InputStream)null); }
    public ASN1InputStream(java.io.InputStream p0, int p1, boolean p2) { super((java.io.InputStream)null); }
    private ASN1InputStream(java.io.InputStream p0, int p1, boolean p2, byte[][] p3) { super((java.io.InputStream)null); }
    public ASN1InputStream(java.io.InputStream p0, boolean p1) { super((java.io.InputStream)null); }
    public ASN1InputStream(byte[] p0) { super((java.io.InputStream)null); }
    public ASN1InputStream(byte[] p0, boolean p1) { super((java.io.InputStream)null); }
    static com.android.internal.org.bouncycastle.asn1.ASN1Primitive createPrimitiveDERObject(int p0, com.android.internal.org.bouncycastle.asn1.DefiniteLengthInputStream p1, byte[][] p2) throws java.io.IOException { return null; }
    private static char[] getBMPCharBuffer(com.android.internal.org.bouncycastle.asn1.DefiniteLengthInputStream p0) throws java.io.IOException { return null; }
    private static byte[] getBuffer(com.android.internal.org.bouncycastle.asn1.DefiniteLengthInputStream p0, byte[][] p1) throws java.io.IOException { return null; }
    static int readLength(java.io.InputStream p0, int p1, boolean p2) throws java.io.IOException { return 0; }
    static int readTagNumber(java.io.InputStream p0, int p1) throws java.io.IOException { return 0; }
    com.android.internal.org.bouncycastle.asn1.ASN1BitString buildConstructedBitString(com.android.internal.org.bouncycastle.asn1.ASN1EncodableVector p0) throws java.io.IOException { return null; }
    com.android.internal.org.bouncycastle.asn1.ASN1OctetString buildConstructedOctetString(com.android.internal.org.bouncycastle.asn1.ASN1EncodableVector p0) throws java.io.IOException { return null; }
    protected com.android.internal.org.bouncycastle.asn1.ASN1Primitive buildObject(int p0, int p1, int p2) throws java.io.IOException { return null; }
    int getLimit() { return 0; }
    protected void readFully(byte[] p0) throws java.io.IOException {}
    protected int readLength() throws java.io.IOException { return 0; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Primitive readObject() throws java.io.IOException { return null; }
    com.android.internal.org.bouncycastle.asn1.ASN1Primitive readTaggedObjectDL(int p0, int p1, boolean p2, com.android.internal.org.bouncycastle.asn1.DefiniteLengthInputStream p3) throws java.io.IOException { return null; }
    com.android.internal.org.bouncycastle.asn1.ASN1EncodableVector readVector() throws java.io.IOException { return null; }
    com.android.internal.org.bouncycastle.asn1.ASN1EncodableVector readVector(com.android.internal.org.bouncycastle.asn1.DefiniteLengthInputStream p0) throws java.io.IOException { return null; }
}
