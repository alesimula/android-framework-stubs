package com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.x509;

abstract class X509CRLImpl extends java.security.cert.X509CRL {
    protected com.android.internal.org.bouncycastle.jcajce.util.JcaJceHelper bcHelper;
    protected com.android.internal.org.bouncycastle.asn1.x509.CertificateList c;
    protected boolean isIndirect;
    protected java.lang.String sigAlgName;
    protected byte[] sigAlgParams;
    X509CRLImpl(com.android.internal.org.bouncycastle.jcajce.util.JcaJceHelper p0, com.android.internal.org.bouncycastle.asn1.x509.CertificateList p1, java.lang.String p2, byte[] p3, boolean p4) { super(); }
    private void checkSignature(java.security.PublicKey p0, java.security.Signature p1, com.android.internal.org.bouncycastle.asn1.ASN1Encodable p2, byte[] p3) throws java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException, java.security.cert.CRLException {}
    private void doVerify(java.security.PublicKey p0, com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.x509.SignatureCreator p1) throws java.security.cert.CRLException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.SignatureException, java.security.NoSuchProviderException {}
    private java.util.Set getExtensionOIDs(boolean p0) { return null; }
    protected static byte[] getExtensionOctets(com.android.internal.org.bouncycastle.asn1.x509.CertificateList p0, java.lang.String p1) { return null; }
    protected static com.android.internal.org.bouncycastle.asn1.ASN1OctetString getExtensionValue(com.android.internal.org.bouncycastle.asn1.x509.CertificateList p0, java.lang.String p1) { return null; }
    private java.util.Set loadCRLEntries() { return null; }
    public java.util.Set getCriticalExtensionOIDs() { return null; }
    public byte[] getExtensionValue(java.lang.String p0) { return null; }
    public java.security.Principal getIssuerDN() { return null; }
    public javax.security.auth.x500.X500Principal getIssuerX500Principal() { return null; }
    public java.util.Date getNextUpdate() { return null; }
    public java.util.Set getNonCriticalExtensionOIDs() { return null; }
    public java.security.cert.X509CRLEntry getRevokedCertificate(java.math.BigInteger p0) { return null; }
    public java.util.Set getRevokedCertificates() { return null; }
    public java.lang.String getSigAlgName() { return null; }
    public java.lang.String getSigAlgOID() { return null; }
    public byte[] getSigAlgParams() { return null; }
    public byte[] getSignature() { return null; }
    public byte[] getTBSCertList() throws java.security.cert.CRLException { return null; }
    public java.util.Date getThisUpdate() { return null; }
    public int getVersion() { return 0; }
    public boolean hasUnsupportedCriticalExtension() { return false; }
    public boolean isRevoked(java.security.cert.Certificate p0) { return false; }
    public java.lang.String toString() { return null; }
    public void verify(java.security.PublicKey p0) throws java.security.cert.CRLException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.NoSuchProviderException, java.security.SignatureException {}
    public void verify(java.security.PublicKey p0, java.lang.String p1) throws java.security.cert.CRLException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.NoSuchProviderException, java.security.SignatureException {}
    public void verify(java.security.PublicKey p0, java.security.Provider p1) throws java.security.cert.CRLException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.SignatureException {}
}
