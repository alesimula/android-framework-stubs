package com.android.internal.org.bouncycastle.asn1;

class LazyEncodedSequence extends com.android.internal.org.bouncycastle.asn1.ASN1Sequence {
    private byte[] encoded;
    LazyEncodedSequence(byte[] p0) throws java.io.IOException { super(); }
    private void force() {}
    private byte[] getContents() { return null; }
    void encode(com.android.internal.org.bouncycastle.asn1.ASN1OutputStream p0, boolean p1) throws java.io.IOException {}
    int encodedLength(boolean p0) throws java.io.IOException { return 0; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Encodable getObjectAt(int p0) { return null; }
    public java.util.Enumeration getObjects() { return null; }
    public int hashCode() { return 0; }
    public java.util.Iterator<com.android.internal.org.bouncycastle.asn1.ASN1Encodable> iterator() { return null; }
    public int size() { return 0; }
    com.android.internal.org.bouncycastle.asn1.ASN1BitString toASN1BitString() { return null; }
    com.android.internal.org.bouncycastle.asn1.ASN1External toASN1External() { return null; }
    com.android.internal.org.bouncycastle.asn1.ASN1OctetString toASN1OctetString() { return null; }
    com.android.internal.org.bouncycastle.asn1.ASN1Set toASN1Set() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Encodable[] toArray() { return null; }
    com.android.internal.org.bouncycastle.asn1.ASN1Encodable[] toArrayInternal() { return null; }
    com.android.internal.org.bouncycastle.asn1.ASN1Primitive toDERObject() { return null; }
    com.android.internal.org.bouncycastle.asn1.ASN1Primitive toDLObject() { return null; }
}
