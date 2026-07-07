package com.android.internal.org.bouncycastle.cert;

public class X509CRLHolder implements com.android.internal.org.bouncycastle.util.Encodable, java.io.Serializable {
    private static final long serialVersionUID = 20170722001L;
    private transient com.android.internal.org.bouncycastle.asn1.x509.Extensions extensions;
    private transient boolean isIndirect;
    private transient com.android.internal.org.bouncycastle.asn1.x509.GeneralNames issuerName;
    private transient com.android.internal.org.bouncycastle.asn1.x509.CertificateList x509CRL;
    public X509CRLHolder(com.android.internal.org.bouncycastle.asn1.x509.CertificateList p0) {}
    public X509CRLHolder(java.io.InputStream p0) throws java.io.IOException {}
    public X509CRLHolder(byte[] p0) throws java.io.IOException {}
    private void init(com.android.internal.org.bouncycastle.asn1.x509.CertificateList p0) {}
    private static boolean isIndirectCRL(com.android.internal.org.bouncycastle.asn1.x509.Extensions p0) { return false; }
    private static com.android.internal.org.bouncycastle.asn1.x509.CertificateList parseStream(java.io.InputStream p0) throws java.io.IOException { return null; }
    private void readObject(java.io.ObjectInputStream p0) throws java.io.IOException, java.lang.ClassNotFoundException {}
    private void writeObject(java.io.ObjectOutputStream p0) throws java.io.IOException {}
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.Set getCriticalExtensionOIDs() { return null; }
    public byte[] getEncoded() throws java.io.IOException { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.Extension getExtension(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0) { return null; }
    public java.util.List getExtensionOIDs() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.Extensions getExtensions() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x500.X500Name getIssuer() { return null; }
    public java.util.Date getNextUpdate() { return null; }
    public java.util.Set getNonCriticalExtensionOIDs() { return null; }
    public com.android.internal.org.bouncycastle.cert.X509CRLEntryHolder getRevokedCertificate(java.math.BigInteger p0) { return null; }
    public java.util.Collection getRevokedCertificates() { return null; }
    public java.util.Date getThisUpdate() { return null; }
    public boolean hasExtensions() { return false; }
    public int hashCode() { return 0; }
    public boolean isAlternativeSignatureValid(com.android.internal.org.bouncycastle.operator.ContentVerifierProvider p0) throws com.android.internal.org.bouncycastle.cert.CertException { return false; }
    public boolean isSignatureValid(com.android.internal.org.bouncycastle.operator.ContentVerifierProvider p0) throws com.android.internal.org.bouncycastle.cert.CertException { return false; }
    public com.android.internal.org.bouncycastle.asn1.x509.CertificateList toASN1Structure() { return null; }
}
