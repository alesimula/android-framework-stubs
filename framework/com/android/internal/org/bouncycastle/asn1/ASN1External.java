package com.android.internal.org.bouncycastle.asn1;

public abstract class ASN1External extends com.android.internal.org.bouncycastle.asn1.ASN1Primitive {
    static final com.android.internal.org.bouncycastle.asn1.ASN1UniversalType TYPE = null;
    com.android.internal.org.bouncycastle.asn1.ASN1Primitive dataValueDescriptor;
    com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier directReference;
    int encoding;
    com.android.internal.org.bouncycastle.asn1.ASN1Primitive externalContent;
    com.android.internal.org.bouncycastle.asn1.ASN1Integer indirectReference;
    ASN1External(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0, com.android.internal.org.bouncycastle.asn1.ASN1Integer p1, com.android.internal.org.bouncycastle.asn1.ASN1Primitive p2, int p3, com.android.internal.org.bouncycastle.asn1.ASN1Primitive p4) { super(); }
    ASN1External(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0, com.android.internal.org.bouncycastle.asn1.ASN1Integer p1, com.android.internal.org.bouncycastle.asn1.ASN1Primitive p2, com.android.internal.org.bouncycastle.asn1.DERTaggedObject p3) { super(); }
    ASN1External(com.android.internal.org.bouncycastle.asn1.ASN1Sequence p0) { super(); }
    private static int checkEncoding(int p0) { return 0; }
    private static com.android.internal.org.bouncycastle.asn1.ASN1Primitive checkExternalContent(int p0, com.android.internal.org.bouncycastle.asn1.ASN1Primitive p1) { return null; }
    private static com.android.internal.org.bouncycastle.asn1.ASN1Primitive getExternalContent(com.android.internal.org.bouncycastle.asn1.ASN1TaggedObject p0) { return null; }
    public static com.android.internal.org.bouncycastle.asn1.ASN1External getInstance(com.android.internal.org.bouncycastle.asn1.ASN1TaggedObject p0, boolean p1) { return null; }
    public static com.android.internal.org.bouncycastle.asn1.ASN1External getInstance(java.lang.Object p0) { return null; }
    private static com.android.internal.org.bouncycastle.asn1.ASN1Primitive getObjFromSequence(com.android.internal.org.bouncycastle.asn1.ASN1Sequence p0, int p1) { return null; }
    boolean asn1Equals(com.android.internal.org.bouncycastle.asn1.ASN1Primitive p0) { return false; }
    abstract com.android.internal.org.bouncycastle.asn1.ASN1Sequence buildSequence();
    void encode(com.android.internal.org.bouncycastle.asn1.ASN1OutputStream p0, boolean p1) throws java.io.IOException {}
    boolean encodeConstructed() { return false; }
    int encodedLength(boolean p0) throws java.io.IOException { return 0; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Primitive getDataValueDescriptor() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier getDirectReference() { return null; }
    public int getEncoding() { return 0; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Primitive getExternalContent() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Integer getIndirectReference() { return null; }
    public int hashCode() { return 0; }
    com.android.internal.org.bouncycastle.asn1.ASN1Primitive toDERObject() { return null; }
    com.android.internal.org.bouncycastle.asn1.ASN1Primitive toDLObject() { return null; }
}
