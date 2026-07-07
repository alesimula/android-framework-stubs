package com.android.internal.org.bouncycastle.cms;

public class CMSSignedData implements com.android.internal.org.bouncycastle.util.Encodable {
    private static final com.android.internal.org.bouncycastle.operator.DefaultDigestAlgorithmIdentifierFinder DIGEST_ALG_ID_FINDER = null;
    private static final com.android.internal.org.bouncycastle.cms.CMSSignedHelper HELPER = null;
    com.android.internal.org.bouncycastle.asn1.cms.ContentInfo contentInfo;
    private java.util.Map hashes;
    com.android.internal.org.bouncycastle.cms.CMSTypedData signedContent;
    com.android.internal.org.bouncycastle.asn1.cms.SignedData signedData;
    com.android.internal.org.bouncycastle.cms.SignerInformationStore signerInfoStore;
    public CMSSignedData(com.android.internal.org.bouncycastle.asn1.cms.ContentInfo p0) throws com.android.internal.org.bouncycastle.cms.CMSException {}
    public CMSSignedData(com.android.internal.org.bouncycastle.cms.CMSProcessable p0, com.android.internal.org.bouncycastle.asn1.cms.ContentInfo p1) throws com.android.internal.org.bouncycastle.cms.CMSException {}
    public CMSSignedData(com.android.internal.org.bouncycastle.cms.CMSProcessable p0, java.io.InputStream p1) throws com.android.internal.org.bouncycastle.cms.CMSException {}
    public CMSSignedData(com.android.internal.org.bouncycastle.cms.CMSProcessable p0, byte[] p1) throws com.android.internal.org.bouncycastle.cms.CMSException {}
    private CMSSignedData(com.android.internal.org.bouncycastle.cms.CMSSignedData p0) {}
    public CMSSignedData(java.io.InputStream p0) throws com.android.internal.org.bouncycastle.cms.CMSException {}
    public CMSSignedData(java.util.Map p0, com.android.internal.org.bouncycastle.asn1.cms.ContentInfo p1) throws com.android.internal.org.bouncycastle.cms.CMSException {}
    public CMSSignedData(java.util.Map p0, byte[] p1) throws com.android.internal.org.bouncycastle.cms.CMSException {}
    public CMSSignedData(byte[] p0) throws com.android.internal.org.bouncycastle.cms.CMSException {}
    public static com.android.internal.org.bouncycastle.cms.CMSSignedData addDigestAlgorithm(com.android.internal.org.bouncycastle.cms.CMSSignedData p0, com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p1) { return null; }
    public static com.android.internal.org.bouncycastle.cms.CMSSignedData addDigestAlgorithm(com.android.internal.org.bouncycastle.cms.CMSSignedData p0, com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p1, com.android.internal.org.bouncycastle.operator.DigestAlgorithmIdentifierFinder p2) { return null; }
    private com.android.internal.org.bouncycastle.asn1.cms.SignedData getSignedData() throws com.android.internal.org.bouncycastle.cms.CMSException { return null; }
    public static com.android.internal.org.bouncycastle.cms.CMSSignedData replaceCertificatesAndCRLs(com.android.internal.org.bouncycastle.cms.CMSSignedData p0, com.android.internal.org.bouncycastle.util.Store p1, com.android.internal.org.bouncycastle.util.Store p2, com.android.internal.org.bouncycastle.util.Store p3) throws com.android.internal.org.bouncycastle.cms.CMSException { return null; }
    public static com.android.internal.org.bouncycastle.cms.CMSSignedData replaceSigners(com.android.internal.org.bouncycastle.cms.CMSSignedData p0, com.android.internal.org.bouncycastle.cms.SignerInformationStore p1) { return null; }
    public static com.android.internal.org.bouncycastle.cms.CMSSignedData replaceSigners(com.android.internal.org.bouncycastle.cms.CMSSignedData p0, com.android.internal.org.bouncycastle.cms.SignerInformationStore p1, com.android.internal.org.bouncycastle.operator.DigestAlgorithmIdentifierFinder p2) { return null; }
    public com.android.internal.org.bouncycastle.util.Store<com.android.internal.org.bouncycastle.cert.X509AttributeCertificateHolder> getAttributeCertificates() { return null; }
    public com.android.internal.org.bouncycastle.util.Store<com.android.internal.org.bouncycastle.cert.X509CRLHolder> getCRLs() { return null; }
    public com.android.internal.org.bouncycastle.util.Store<com.android.internal.org.bouncycastle.cert.X509CertificateHolder> getCertificates() { return null; }
    public java.util.Set<com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier> getDigestAlgorithmIDs() { return null; }
    public byte[] getEncoded() throws java.io.IOException { return null; }
    public com.android.internal.org.bouncycastle.cms.CMSTypedData getSignedContent() { return null; }
    public java.lang.String getSignedContentTypeOID() { return null; }
    public com.android.internal.org.bouncycastle.cms.SignerInformationStore getSignerInfos() { return null; }
    public int getVersion() { return 0; }
    public boolean isCertificateManagementMessage() { return false; }
    public boolean isDetachedSignature() { return false; }
    public com.android.internal.org.bouncycastle.asn1.cms.ContentInfo toASN1Structure() { return null; }
}
