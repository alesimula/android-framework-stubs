package com.android.internal.org.bouncycastle.asn1.pkcs;

public class CertificationRequestInfo extends com.android.internal.org.bouncycastle.asn1.ASN1Object {
    com.android.internal.org.bouncycastle.asn1.ASN1Set attributes;
    com.android.internal.org.bouncycastle.asn1.x500.X500Name subject;
    com.android.internal.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPKInfo;
    com.android.internal.org.bouncycastle.asn1.ASN1Integer version;
    private CertificationRequestInfo(com.android.internal.org.bouncycastle.asn1.ASN1Sequence p0) { super(); }
    public CertificationRequestInfo(com.android.internal.org.bouncycastle.asn1.x500.X500Name p0, com.android.internal.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo p1, com.android.internal.org.bouncycastle.asn1.ASN1Set p2) { super(); }
    public CertificationRequestInfo(com.android.internal.org.bouncycastle.asn1.x509.X509Name p0, com.android.internal.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo p1, com.android.internal.org.bouncycastle.asn1.ASN1Set p2) { super(); }
    public static com.android.internal.org.bouncycastle.asn1.pkcs.CertificationRequestInfo getInstance(java.lang.Object p0) { return null; }
    private static void validateAttributes(com.android.internal.org.bouncycastle.asn1.ASN1Set p0) {}
    public com.android.internal.org.bouncycastle.asn1.ASN1Set getAttributes() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x500.X500Name getSubject() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo getSubjectPublicKeyInfo() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Integer getVersion() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() { return null; }
}
