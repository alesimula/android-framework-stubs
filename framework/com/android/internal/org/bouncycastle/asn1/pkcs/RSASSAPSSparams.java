package com.android.internal.org.bouncycastle.asn1.pkcs;

public class RSASSAPSSparams extends com.android.internal.org.bouncycastle.asn1.ASN1Object {
    public static final com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier DEFAULT_HASH_ALGORITHM = null;
    public static final com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier DEFAULT_MASK_GEN_FUNCTION = null;
    public static final com.android.internal.org.bouncycastle.asn1.ASN1Integer DEFAULT_SALT_LENGTH = null;
    public static final com.android.internal.org.bouncycastle.asn1.ASN1Integer DEFAULT_TRAILER_FIELD = null;
    private com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier hashAlgorithm;
    private com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier maskGenAlgorithm;
    private com.android.internal.org.bouncycastle.asn1.ASN1Integer saltLength;
    private com.android.internal.org.bouncycastle.asn1.ASN1Integer trailerField;
    public RSASSAPSSparams() { super(); }
    private RSASSAPSSparams(com.android.internal.org.bouncycastle.asn1.ASN1Sequence p0) { super(); }
    public RSASSAPSSparams(com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p0, com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p1, com.android.internal.org.bouncycastle.asn1.ASN1Integer p2, com.android.internal.org.bouncycastle.asn1.ASN1Integer p3) { super(); }
    public static com.android.internal.org.bouncycastle.asn1.pkcs.RSASSAPSSparams getInstance(java.lang.Object p0) { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier getHashAlgorithm() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier getMaskGenAlgorithm() { return null; }
    public java.math.BigInteger getSaltLength() { return null; }
    public java.math.BigInteger getTrailerField() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() { return null; }
}
