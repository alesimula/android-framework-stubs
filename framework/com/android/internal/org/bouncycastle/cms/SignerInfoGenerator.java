package com.android.internal.org.bouncycastle.cms;

public class SignerInfoGenerator {
    private byte[] calculatedDigest;
    private com.android.internal.org.bouncycastle.cert.X509CertificateHolder certHolder;
    private final com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier digestAlgorithm = null;
    private final com.android.internal.org.bouncycastle.operator.DigestCalculator digester = null;
    private final com.android.internal.org.bouncycastle.cms.CMSAttributeTableGenerator sAttrGen = null;
    private final com.android.internal.org.bouncycastle.cms.CMSSignatureEncryptionAlgorithmFinder sigEncAlgFinder = null;
    private final com.android.internal.org.bouncycastle.operator.ContentSigner signer = null;
    private final com.android.internal.org.bouncycastle.asn1.cms.SignerIdentifier signerIdentifier = null;
    private final com.android.internal.org.bouncycastle.cms.CMSAttributeTableGenerator unsAttrGen = null;
    SignerInfoGenerator(com.android.internal.org.bouncycastle.asn1.cms.SignerIdentifier p0, com.android.internal.org.bouncycastle.operator.ContentSigner p1, com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p2, com.android.internal.org.bouncycastle.cms.CMSSignatureEncryptionAlgorithmFinder p3) {}
    SignerInfoGenerator(com.android.internal.org.bouncycastle.asn1.cms.SignerIdentifier p0, com.android.internal.org.bouncycastle.operator.ContentSigner p1, com.android.internal.org.bouncycastle.operator.DigestCalculator p2, com.android.internal.org.bouncycastle.cms.CMSSignatureEncryptionAlgorithmFinder p3, com.android.internal.org.bouncycastle.cms.CMSAttributeTableGenerator p4, com.android.internal.org.bouncycastle.cms.CMSAttributeTableGenerator p5) {}
    public SignerInfoGenerator(com.android.internal.org.bouncycastle.cms.SignerInfoGenerator p0, com.android.internal.org.bouncycastle.cms.CMSAttributeTableGenerator p1, com.android.internal.org.bouncycastle.cms.CMSAttributeTableGenerator p2) {}
    private com.android.internal.org.bouncycastle.asn1.ASN1Set getAttributeSet(com.android.internal.org.bouncycastle.asn1.cms.AttributeTable p0) { return null; }
    private java.util.Map getBaseParameters(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0, com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p1, com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p2, byte[] p3) { return null; }
    public com.android.internal.org.bouncycastle.asn1.cms.SignerInfo generate(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0) throws com.android.internal.org.bouncycastle.cms.CMSException { return null; }
    public com.android.internal.org.bouncycastle.cert.X509CertificateHolder getAssociatedCertificate() { return null; }
    public byte[] getCalculatedDigest() { return null; }
    public java.io.OutputStream getCalculatingOutputStream() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier getDigestAlgorithm() { return null; }
    public int getGeneratedVersion() { return 0; }
    public com.android.internal.org.bouncycastle.asn1.cms.SignerIdentifier getSID() { return null; }
    public com.android.internal.org.bouncycastle.cms.CMSAttributeTableGenerator getSignedAttributeTableGenerator() { return null; }
    public com.android.internal.org.bouncycastle.cms.CMSAttributeTableGenerator getUnsignedAttributeTableGenerator() { return null; }
    public boolean hasAssociatedCertificate() { return false; }
    void setAssociatedCertificate(com.android.internal.org.bouncycastle.cert.X509CertificateHolder p0) {}
}
