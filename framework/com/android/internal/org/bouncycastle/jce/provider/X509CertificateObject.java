package com.android.internal.org.bouncycastle.jce.provider;

public class X509CertificateObject extends java.security.cert.X509Certificate implements com.android.internal.org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier {
    private com.android.internal.org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier attrCarrier;
    private com.android.internal.org.bouncycastle.asn1.x509.BasicConstraints basicConstraints;
    private com.android.internal.org.bouncycastle.asn1.x509.Certificate c;
    private byte[] encoded;
    private int hashValue;
    private boolean hashValueSet;
    private boolean[] keyUsage;
    public X509CertificateObject(com.android.internal.org.bouncycastle.asn1.x509.Certificate p0) throws java.security.cert.CertificateParsingException { super(); }
    private int calculateHashCode() { return 0; }
    private void checkSignature(java.security.PublicKey p0, java.security.Signature p1) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException {}
    private static java.util.Collection getAlternativeNames(byte[] p0) throws java.security.cert.CertificateParsingException { return null; }
    private byte[] getExtensionBytes(java.lang.String p0) { return null; }
    private boolean isAlgIdEqual(com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p0, com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p1) { return false; }
    public void checkValidity() throws java.security.cert.CertificateExpiredException, java.security.cert.CertificateNotYetValidException {}
    public void checkValidity(java.util.Date p0) throws java.security.cert.CertificateExpiredException, java.security.cert.CertificateNotYetValidException {}
    public boolean equals(java.lang.Object p0) { return false; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Encodable getBagAttribute(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0) { return null; }
    public java.util.Enumeration getBagAttributeKeys() { return null; }
    public int getBasicConstraints() { return 0; }
    public java.util.Set getCriticalExtensionOIDs() { return null; }
    public byte[] getEncoded() throws java.security.cert.CertificateEncodingException { return null; }
    public java.util.List getExtendedKeyUsage() throws java.security.cert.CertificateParsingException { return null; }
    public byte[] getExtensionValue(java.lang.String p0) { return null; }
    public java.util.Collection getIssuerAlternativeNames() throws java.security.cert.CertificateParsingException { return null; }
    public java.security.Principal getIssuerDN() { return null; }
    public boolean[] getIssuerUniqueID() { return null; }
    public javax.security.auth.x500.X500Principal getIssuerX500Principal() { return null; }
    public boolean[] getKeyUsage() { return null; }
    public java.util.Set getNonCriticalExtensionOIDs() { return null; }
    public java.util.Date getNotAfter() { return null; }
    public java.util.Date getNotBefore() { return null; }
    public java.security.PublicKey getPublicKey() { return null; }
    public java.math.BigInteger getSerialNumber() { return null; }
    public java.lang.String getSigAlgName() { return null; }
    public java.lang.String getSigAlgOID() { return null; }
    public byte[] getSigAlgParams() { return null; }
    public byte[] getSignature() { return null; }
    public java.util.Collection getSubjectAlternativeNames() throws java.security.cert.CertificateParsingException { return null; }
    public java.security.Principal getSubjectDN() { return null; }
    public boolean[] getSubjectUniqueID() { return null; }
    public javax.security.auth.x500.X500Principal getSubjectX500Principal() { return null; }
    public byte[] getTBSCertificate() throws java.security.cert.CertificateEncodingException { return null; }
    public int getVersion() { return 0; }
    public boolean hasUnsupportedCriticalExtension() { return false; }
    public int hashCode() { return 0; }
    public void setBagAttribute(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0, com.android.internal.org.bouncycastle.asn1.ASN1Encodable p1) {}
    public java.lang.String toString() { return null; }
    public final void verify(java.security.PublicKey p0) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.NoSuchProviderException, java.security.SignatureException {}
    public final void verify(java.security.PublicKey p0, java.lang.String p1) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.NoSuchProviderException, java.security.SignatureException {}
    public final void verify(java.security.PublicKey p0, java.security.Provider p1) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.SignatureException {}
}
