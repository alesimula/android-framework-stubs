package com.android.internal.org.bouncycastle.cms;

public class SignerInformation {
    private final com.android.internal.org.bouncycastle.cms.CMSProcessable content = null;
    private final com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier contentType = null;
    protected final com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier digestAlgorithm = null;
    protected final com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier encryptionAlgorithm = null;
    protected final com.android.internal.org.bouncycastle.asn1.cms.SignerInfo info = null;
    private final boolean isCounterSignature = false;
    private byte[] resultDigest;
    private final com.android.internal.org.bouncycastle.cms.SignerId sid = null;
    private final byte[] signature = null;
    protected final com.android.internal.org.bouncycastle.asn1.ASN1Set signedAttributeSet = null;
    private com.android.internal.org.bouncycastle.asn1.cms.AttributeTable signedAttributeValues;
    protected final com.android.internal.org.bouncycastle.asn1.ASN1Set unsignedAttributeSet = null;
    private com.android.internal.org.bouncycastle.asn1.cms.AttributeTable unsignedAttributeValues;
    SignerInformation(com.android.internal.org.bouncycastle.asn1.cms.SignerInfo p0, com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p1, com.android.internal.org.bouncycastle.cms.CMSProcessable p2, byte[] p3) {}
    protected SignerInformation(com.android.internal.org.bouncycastle.cms.SignerInformation p0) {}
    protected SignerInformation(com.android.internal.org.bouncycastle.cms.SignerInformation p0, com.android.internal.org.bouncycastle.asn1.cms.SignerInfo p1) {}
    public static com.android.internal.org.bouncycastle.cms.SignerInformation addCounterSigners(com.android.internal.org.bouncycastle.cms.SignerInformation p0, com.android.internal.org.bouncycastle.cms.SignerInformationStore p1) { return null; }
    private boolean doVerify(com.android.internal.org.bouncycastle.cms.SignerInformationVerifier p0) throws com.android.internal.org.bouncycastle.cms.CMSException { return false; }
    private byte[] encodeObj(com.android.internal.org.bouncycastle.asn1.ASN1Encodable p0) throws java.io.IOException { return null; }
    private com.android.internal.org.bouncycastle.asn1.cms.Time getSigningTime() throws com.android.internal.org.bouncycastle.cms.CMSException { return null; }
    private com.android.internal.org.bouncycastle.asn1.ASN1Primitive getSingleValuedSignedAttribute(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0, java.lang.String p1) throws com.android.internal.org.bouncycastle.cms.CMSException { return null; }
    public static com.android.internal.org.bouncycastle.cms.SignerInformation replaceUnsignedAttributes(com.android.internal.org.bouncycastle.cms.SignerInformation p0, com.android.internal.org.bouncycastle.asn1.cms.AttributeTable p1) { return null; }
    private static com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier translateBrokenRSAPkcs7(com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p0, com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p1) { return null; }
    private void verifyAlgorithmIdentifierProtectionAttribute(com.android.internal.org.bouncycastle.asn1.cms.AttributeTable p0) throws com.android.internal.org.bouncycastle.cms.CMSException {}
    private void verifyContentTypeAttributeValue() throws com.android.internal.org.bouncycastle.cms.CMSException {}
    private void verifyCounterSignatureAttribute(com.android.internal.org.bouncycastle.asn1.cms.AttributeTable p0) throws com.android.internal.org.bouncycastle.cms.CMSException {}
    private void verifyMessageDigestAttribute() throws com.android.internal.org.bouncycastle.cms.CMSException {}
    public byte[] getContentDigest() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier getContentType() { return null; }
    public com.android.internal.org.bouncycastle.cms.SignerInformationStore getCounterSignatures() { return null; }
    public java.lang.String getDigestAlgOID() { return null; }
    public byte[] getDigestAlgParams() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier getDigestAlgorithmID() { return null; }
    public byte[] getEncodedSignedAttributes() throws java.io.IOException { return null; }
    public java.lang.String getEncryptionAlgOID() { return null; }
    public byte[] getEncryptionAlgParams() { return null; }
    public com.android.internal.org.bouncycastle.cms.SignerId getSID() { return null; }
    public byte[] getSignature() { return null; }
    public com.android.internal.org.bouncycastle.asn1.cms.AttributeTable getSignedAttributes() { return null; }
    public com.android.internal.org.bouncycastle.asn1.cms.AttributeTable getUnsignedAttributes() { return null; }
    public int getVersion() { return 0; }
    public boolean isCounterSignature() { return false; }
    public com.android.internal.org.bouncycastle.asn1.cms.SignerInfo toASN1Structure() { return null; }
    public boolean verify(com.android.internal.org.bouncycastle.cms.SignerInformationVerifier p0) throws com.android.internal.org.bouncycastle.cms.CMSException { return false; }
}
