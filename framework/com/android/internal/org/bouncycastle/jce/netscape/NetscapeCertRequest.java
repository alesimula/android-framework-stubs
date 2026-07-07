package com.android.internal.org.bouncycastle.jce.netscape;

public class NetscapeCertRequest extends com.android.internal.org.bouncycastle.asn1.ASN1Object {
    java.lang.String challenge;
    com.android.internal.org.bouncycastle.asn1.DERBitString content;
    com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier keyAlg;
    java.security.PublicKey pubkey;
    com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier sigAlg;
    byte[] sigBits;
    public NetscapeCertRequest(com.android.internal.org.bouncycastle.asn1.ASN1Sequence p0) { super(); }
    public NetscapeCertRequest(java.lang.String p0, com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p1, java.security.PublicKey p2) throws java.security.NoSuchAlgorithmException, java.security.spec.InvalidKeySpecException, java.security.NoSuchProviderException { super(); }
    public NetscapeCertRequest(byte[] p0) throws java.io.IOException { super(); }
    private com.android.internal.org.bouncycastle.asn1.ASN1Primitive getKeySpec() throws java.security.NoSuchAlgorithmException, java.security.spec.InvalidKeySpecException, java.security.NoSuchProviderException { return null; }
    private static com.android.internal.org.bouncycastle.asn1.ASN1Sequence getReq(byte[] p0) throws java.io.IOException { return null; }
    public java.lang.String getChallenge() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier getKeyAlgorithm() { return null; }
    public java.security.PublicKey getPublicKey() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier getSigningAlgorithm() { return null; }
    public void setChallenge(java.lang.String p0) {}
    public void setKeyAlgorithm(com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p0) {}
    public void setPublicKey(java.security.PublicKey p0) {}
    public void setSigningAlgorithm(com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p0) {}
    public void sign(java.security.PrivateKey p0) throws java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.SignatureException, java.security.NoSuchProviderException, java.security.spec.InvalidKeySpecException {}
    public void sign(java.security.PrivateKey p0, java.security.SecureRandom p1) throws java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.SignatureException, java.security.NoSuchProviderException, java.security.spec.InvalidKeySpecException {}
    public com.android.internal.org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() { return null; }
    public boolean verify(java.lang.String p0) throws java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.SignatureException, java.security.NoSuchProviderException { return false; }
}
