package com.android.internal.org.bouncycastle.asn1;

public abstract class ASN1Sequence extends com.android.internal.org.bouncycastle.asn1.ASN1Primitive implements com.android.internal.org.bouncycastle.util.Iterable<com.android.internal.org.bouncycastle.asn1.ASN1Encodable> {
    static final com.android.internal.org.bouncycastle.asn1.ASN1UniversalType TYPE = null;
    com.android.internal.org.bouncycastle.asn1.ASN1Encodable[] elements;
    protected ASN1Sequence() { super(); }
    protected ASN1Sequence(com.android.internal.org.bouncycastle.asn1.ASN1Encodable p0) { super(); }
    protected ASN1Sequence(com.android.internal.org.bouncycastle.asn1.ASN1EncodableVector p0) { super(); }
    protected ASN1Sequence(com.android.internal.org.bouncycastle.asn1.ASN1Encodable[] p0) { super(); }
    ASN1Sequence(com.android.internal.org.bouncycastle.asn1.ASN1Encodable[] p0, boolean p1) { super(); }
    public static com.android.internal.org.bouncycastle.asn1.ASN1Sequence getInstance(com.android.internal.org.bouncycastle.asn1.ASN1TaggedObject p0, boolean p1) { return null; }
    public static com.android.internal.org.bouncycastle.asn1.ASN1Sequence getInstance(java.lang.Object p0) { return null; }
    boolean asn1Equals(com.android.internal.org.bouncycastle.asn1.ASN1Primitive p0) { return false; }
    boolean encodeConstructed() { return false; }
    com.android.internal.org.bouncycastle.asn1.ASN1BitString[] getConstructedBitStrings() { return null; }
    com.android.internal.org.bouncycastle.asn1.ASN1OctetString[] getConstructedOctetStrings() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Encodable getObjectAt(int p0) { return null; }
    public java.util.Enumeration getObjects() { return null; }
    public int hashCode() { return 0; }
    public java.util.Iterator<com.android.internal.org.bouncycastle.asn1.ASN1Encodable> iterator() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1SequenceParser parser() { return null; }
    public int size() { return 0; }
    abstract com.android.internal.org.bouncycastle.asn1.ASN1BitString toASN1BitString();
    abstract com.android.internal.org.bouncycastle.asn1.ASN1External toASN1External();
    abstract com.android.internal.org.bouncycastle.asn1.ASN1OctetString toASN1OctetString();
    abstract com.android.internal.org.bouncycastle.asn1.ASN1Set toASN1Set();
    public com.android.internal.org.bouncycastle.asn1.ASN1Encodable[] toArray() { return null; }
    com.android.internal.org.bouncycastle.asn1.ASN1Encodable[] toArrayInternal() { return null; }
    com.android.internal.org.bouncycastle.asn1.ASN1Primitive toDERObject() { return null; }
    com.android.internal.org.bouncycastle.asn1.ASN1Primitive toDLObject() { return null; }
    public java.lang.String toString() { return null; }
}
