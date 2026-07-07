package com.android.internal.org.bouncycastle.operator;

public class DefaultSignatureAlgorithmIdentifierFinder implements com.android.internal.org.bouncycastle.operator.SignatureAlgorithmIdentifierFinder {
    private static final com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier ENCRYPTION_DSA = null;
    private static final com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier ENCRYPTION_ECDSA = null;
    private static final com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier ENCRYPTION_RSA = null;
    private static final com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier ENCRYPTION_RSA_PSS = null;
    private static java.util.Map algorithms;
    private static java.util.Map digestOids;
    private static java.util.Set noParams;
    private static java.util.Map params;
    private static java.util.Set pkcs15RsaEncryption;
    public DefaultSignatureAlgorithmIdentifierFinder() {}
    private static com.android.internal.org.bouncycastle.asn1.pkcs.RSASSAPSSparams createPSSParams(com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p0, int p1) { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier find(java.lang.String p0) { return null; }
}
