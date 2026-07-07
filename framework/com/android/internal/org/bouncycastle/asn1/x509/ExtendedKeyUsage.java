package com.android.internal.org.bouncycastle.asn1.x509;

public class ExtendedKeyUsage extends com.android.internal.org.bouncycastle.asn1.ASN1Object {
    com.android.internal.org.bouncycastle.asn1.ASN1Sequence seq;
    java.util.Hashtable usageTable;
    private ExtendedKeyUsage(com.android.internal.org.bouncycastle.asn1.ASN1Sequence p0) { super(); }
    public ExtendedKeyUsage(com.android.internal.org.bouncycastle.asn1.x509.KeyPurposeId p0) { super(); }
    public ExtendedKeyUsage(java.util.Vector p0) { super(); }
    public ExtendedKeyUsage(com.android.internal.org.bouncycastle.asn1.x509.KeyPurposeId[] p0) { super(); }
    public static com.android.internal.org.bouncycastle.asn1.x509.ExtendedKeyUsage fromExtensions(com.android.internal.org.bouncycastle.asn1.x509.Extensions p0) { return null; }
    public static com.android.internal.org.bouncycastle.asn1.x509.ExtendedKeyUsage getInstance(com.android.internal.org.bouncycastle.asn1.ASN1TaggedObject p0, boolean p1) { return null; }
    public static com.android.internal.org.bouncycastle.asn1.x509.ExtendedKeyUsage getInstance(java.lang.Object p0) { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.KeyPurposeId[] getUsages() { return null; }
    public boolean hasKeyPurposeId(com.android.internal.org.bouncycastle.asn1.x509.KeyPurposeId p0) { return false; }
    public int size() { return 0; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() { return null; }
}
