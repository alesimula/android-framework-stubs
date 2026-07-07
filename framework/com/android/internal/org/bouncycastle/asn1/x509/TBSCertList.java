package com.android.internal.org.bouncycastle.asn1.x509;

public class TBSCertList extends com.android.internal.org.bouncycastle.asn1.ASN1Object {
    com.android.internal.org.bouncycastle.asn1.x509.Extensions crlExtensions;
    com.android.internal.org.bouncycastle.asn1.x500.X500Name issuer;
    com.android.internal.org.bouncycastle.asn1.x509.Time nextUpdate;
    com.android.internal.org.bouncycastle.asn1.ASN1Sequence revokedCertificates;
    com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier signature;
    com.android.internal.org.bouncycastle.asn1.x509.Time thisUpdate;
    com.android.internal.org.bouncycastle.asn1.ASN1Integer version;
    public TBSCertList(com.android.internal.org.bouncycastle.asn1.ASN1Sequence p0) { super(); }
    public static com.android.internal.org.bouncycastle.asn1.x509.TBSCertList getInstance(com.android.internal.org.bouncycastle.asn1.ASN1TaggedObject p0, boolean p1) { return null; }
    public static com.android.internal.org.bouncycastle.asn1.x509.TBSCertList getInstance(java.lang.Object p0) { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.Extensions getExtensions() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x500.X500Name getIssuer() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.Time getNextUpdate() { return null; }
    public java.util.Enumeration getRevokedCertificateEnumeration() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.TBSCertList.CRLEntry[] getRevokedCertificates() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier getSignature() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.Time getThisUpdate() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Integer getVersion() { return null; }
    public int getVersionNumber() { return 0; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() { return null; }

    public static class CRLEntry extends com.android.internal.org.bouncycastle.asn1.ASN1Object {
        com.android.internal.org.bouncycastle.asn1.x509.Extensions crlEntryExtensions;
        com.android.internal.org.bouncycastle.asn1.ASN1Sequence seq;
        private CRLEntry(com.android.internal.org.bouncycastle.asn1.ASN1Sequence p0) { super(); }
        public static com.android.internal.org.bouncycastle.asn1.x509.TBSCertList.CRLEntry getInstance(java.lang.Object p0) { return null; }
        public com.android.internal.org.bouncycastle.asn1.x509.Extensions getExtensions() { return null; }
        public com.android.internal.org.bouncycastle.asn1.x509.Time getRevocationDate() { return null; }
        public com.android.internal.org.bouncycastle.asn1.ASN1Integer getUserCertificate() { return null; }
        public boolean hasExtensions() { return false; }
        public com.android.internal.org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() { return null; }
    }

    private static class EmptyEnumeration implements java.util.Enumeration {
        private EmptyEnumeration() {}
        public boolean hasMoreElements() { return false; }
        public java.lang.Object nextElement() { return null; }
    }

    private static class RevokedCertificatesEnumeration implements java.util.Enumeration {
        private final java.util.Enumeration en = null;
        RevokedCertificatesEnumeration(java.util.Enumeration p0) {}
        public boolean hasMoreElements() { return false; }
        public java.lang.Object nextElement() { return null; }
    }
}
