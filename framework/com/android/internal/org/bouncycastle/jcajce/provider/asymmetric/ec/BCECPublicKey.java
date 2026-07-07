package com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.ec;

public class BCECPublicKey implements java.security.interfaces.ECPublicKey, com.android.internal.org.bouncycastle.jce.interfaces.ECPublicKey, com.android.internal.org.bouncycastle.jce.interfaces.ECPointEncoder {
    static final long serialVersionUID = 2422789860422731812L;
    private java.lang.String algorithm;
    private transient com.android.internal.org.bouncycastle.jcajce.provider.config.ProviderConfiguration configuration;
    private transient com.android.internal.org.bouncycastle.crypto.params.ECPublicKeyParameters ecPublicKey;
    private transient java.security.spec.ECParameterSpec ecSpec;
    private transient byte[] encoding;
    private transient boolean oldPcSet;
    private boolean withCompression;
    BCECPublicKey(java.lang.String p0, com.android.internal.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo p1, com.android.internal.org.bouncycastle.jcajce.provider.config.ProviderConfiguration p2) {}
    public BCECPublicKey(java.lang.String p0, com.android.internal.org.bouncycastle.crypto.params.ECPublicKeyParameters p1, com.android.internal.org.bouncycastle.jcajce.provider.config.ProviderConfiguration p2) {}
    public BCECPublicKey(java.lang.String p0, com.android.internal.org.bouncycastle.crypto.params.ECPublicKeyParameters p1, com.android.internal.org.bouncycastle.jce.spec.ECParameterSpec p2, com.android.internal.org.bouncycastle.jcajce.provider.config.ProviderConfiguration p3) {}
    public BCECPublicKey(java.lang.String p0, com.android.internal.org.bouncycastle.crypto.params.ECPublicKeyParameters p1, java.security.spec.ECParameterSpec p2, com.android.internal.org.bouncycastle.jcajce.provider.config.ProviderConfiguration p3) {}
    public BCECPublicKey(java.lang.String p0, com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPublicKey p1) {}
    public BCECPublicKey(java.lang.String p0, com.android.internal.org.bouncycastle.jce.spec.ECPublicKeySpec p1, com.android.internal.org.bouncycastle.jcajce.provider.config.ProviderConfiguration p2) {}
    public BCECPublicKey(java.lang.String p0, java.security.spec.ECPublicKeySpec p1, com.android.internal.org.bouncycastle.jcajce.provider.config.ProviderConfiguration p2) {}
    public BCECPublicKey(java.security.interfaces.ECPublicKey p0, com.android.internal.org.bouncycastle.jcajce.provider.config.ProviderConfiguration p1) {}
    private java.security.spec.ECParameterSpec createSpec(java.security.spec.EllipticCurve p0, com.android.internal.org.bouncycastle.crypto.params.ECDomainParameters p1) { return null; }
    private void populateFromPubKeyInfo(com.android.internal.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo p0) {}
    private void readObject(java.io.ObjectInputStream p0) throws java.io.IOException, java.lang.ClassNotFoundException {}
    private void writeObject(java.io.ObjectOutputStream p0) throws java.io.IOException {}
    com.android.internal.org.bouncycastle.crypto.params.ECPublicKeyParameters engineGetKeyParameters() { return null; }
    com.android.internal.org.bouncycastle.jce.spec.ECParameterSpec engineGetSpec() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String getAlgorithm() { return null; }
    public byte[] getEncoded() { return null; }
    public java.lang.String getFormat() { return null; }
    public com.android.internal.org.bouncycastle.jce.spec.ECParameterSpec getParameters() { return null; }
    public java.security.spec.ECParameterSpec getParams() { return null; }
    public com.android.internal.org.bouncycastle.math.ec.ECPoint getQ() { return null; }
    public java.security.spec.ECPoint getW() { return null; }
    public int hashCode() { return 0; }
    public void setPointFormat(java.lang.String p0) {}
    public java.lang.String toString() { return null; }
}
