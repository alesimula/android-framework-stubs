package com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.dh;

public class BCDHPrivateKey implements javax.crypto.interfaces.DHPrivateKey, com.android.internal.org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier {
    static final long serialVersionUID = 311058815616901812L;
    private transient com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl attrCarrier;
    private transient com.android.internal.org.bouncycastle.crypto.params.DHPrivateKeyParameters dhPrivateKey;
    private transient javax.crypto.spec.DHParameterSpec dhSpec;
    private transient com.android.internal.org.bouncycastle.asn1.pkcs.PrivateKeyInfo info;
    private java.math.BigInteger x;
    protected BCDHPrivateKey() {}
    public BCDHPrivateKey(com.android.internal.org.bouncycastle.asn1.pkcs.PrivateKeyInfo p0) throws java.io.IOException {}
    BCDHPrivateKey(com.android.internal.org.bouncycastle.crypto.params.DHPrivateKeyParameters p0) {}
    BCDHPrivateKey(javax.crypto.interfaces.DHPrivateKey p0) {}
    BCDHPrivateKey(javax.crypto.spec.DHPrivateKeySpec p0) {}
    private void readObject(java.io.ObjectInputStream p0) throws java.io.IOException, java.lang.ClassNotFoundException {}
    private void writeObject(java.io.ObjectOutputStream p0) throws java.io.IOException {}
    com.android.internal.org.bouncycastle.crypto.params.DHPrivateKeyParameters engineGetKeyParameters() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String getAlgorithm() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Encodable getBagAttribute(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0) { return null; }
    public java.util.Enumeration getBagAttributeKeys() { return null; }
    public byte[] getEncoded() { return null; }
    public java.lang.String getFormat() { return null; }
    public javax.crypto.spec.DHParameterSpec getParams() { return null; }
    public java.math.BigInteger getX() { return null; }
    public int hashCode() { return 0; }
    public void setBagAttribute(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0, com.android.internal.org.bouncycastle.asn1.ASN1Encodable p1) {}
    public java.lang.String toString() { return null; }
}
