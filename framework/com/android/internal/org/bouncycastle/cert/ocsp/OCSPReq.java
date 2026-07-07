package com.android.internal.org.bouncycastle.cert.ocsp;

public class OCSPReq {
    private static final com.android.internal.org.bouncycastle.cert.X509CertificateHolder[] EMPTY_CERTS = null;
    private com.android.internal.org.bouncycastle.asn1.x509.Extensions extensions;
    private com.android.internal.org.bouncycastle.asn1.ocsp.OCSPRequest req;
    private OCSPReq(com.android.internal.org.bouncycastle.asn1.ASN1InputStream p0) throws java.io.IOException {}
    public OCSPReq(com.android.internal.org.bouncycastle.asn1.ocsp.OCSPRequest p0) {}
    public OCSPReq(byte[] p0) throws java.io.IOException {}
    public com.android.internal.org.bouncycastle.cert.X509CertificateHolder[] getCerts() { return null; }
    public java.util.Set getCriticalExtensionOIDs() { return null; }
    public byte[] getEncoded() throws java.io.IOException { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.Extension getExtension(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0) { return null; }
    public java.util.List getExtensionOIDs() { return null; }
    public java.util.Set getNonCriticalExtensionOIDs() { return null; }
    public com.android.internal.org.bouncycastle.cert.ocsp.Req[] getRequestList() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.GeneralName getRequestorName() { return null; }
    public byte[] getSignature() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier getSignatureAlgOID() { return null; }
    public int getVersionNumber() { return 0; }
    public boolean hasExtensions() { return false; }
    public boolean isSignatureValid(com.android.internal.org.bouncycastle.operator.ContentVerifierProvider p0) throws com.android.internal.org.bouncycastle.cert.ocsp.OCSPException { return false; }
    public boolean isSigned() { return false; }
}
