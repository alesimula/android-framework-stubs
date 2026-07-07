package com.android.internal.org.bouncycastle.jce.provider;

public class JDKDSAPrivateKey implements java.security.interfaces.DSAPrivateKey, com.android.internal.org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier {
    private static final long serialVersionUID = -4677259546958385734L;
    private com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl attrCarrier;
    java.security.interfaces.DSAParams dsaSpec;
    java.math.BigInteger x;
    protected JDKDSAPrivateKey() {}
    JDKDSAPrivateKey(com.android.internal.org.bouncycastle.asn1.pkcs.PrivateKeyInfo p0) throws java.io.IOException {}
    JDKDSAPrivateKey(com.android.internal.org.bouncycastle.crypto.params.DSAPrivateKeyParameters p0) {}
    JDKDSAPrivateKey(java.security.interfaces.DSAPrivateKey p0) {}
    JDKDSAPrivateKey(java.security.spec.DSAPrivateKeySpec p0) {}
    private void readObject(java.io.ObjectInputStream p0) throws java.io.IOException, java.lang.ClassNotFoundException {}
    private void writeObject(java.io.ObjectOutputStream p0) throws java.io.IOException {}
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String getAlgorithm() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Encodable getBagAttribute(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0) { return null; }
    public java.util.Enumeration getBagAttributeKeys() { return null; }
    public byte[] getEncoded() { return null; }
    public java.lang.String getFormat() { return null; }
    public java.security.interfaces.DSAParams getParams() { return null; }
    public java.math.BigInteger getX() { return null; }
    public int hashCode() { return 0; }
    public void setBagAttribute(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0, com.android.internal.org.bouncycastle.asn1.ASN1Encodable p1) {}
}
