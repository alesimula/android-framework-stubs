package com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.dsa;

public class BCDSAPublicKey implements java.security.interfaces.DSAPublicKey {
    private static java.math.BigInteger ZERO;
    private static final long serialVersionUID = 1752452449903495175L;
    private transient java.security.interfaces.DSAParams dsaSpec;
    private transient com.android.internal.org.bouncycastle.crypto.params.DSAPublicKeyParameters lwKeyParams;
    private java.math.BigInteger y;
    public BCDSAPublicKey(com.android.internal.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo p0) {}
    BCDSAPublicKey(com.android.internal.org.bouncycastle.crypto.params.DSAPublicKeyParameters p0) {}
    BCDSAPublicKey(java.security.interfaces.DSAPublicKey p0) {}
    BCDSAPublicKey(java.security.spec.DSAPublicKeySpec p0) {}
    private boolean isNotNull(com.android.internal.org.bouncycastle.asn1.ASN1Encodable p0) { return false; }
    private void readObject(java.io.ObjectInputStream p0) throws java.io.IOException, java.lang.ClassNotFoundException {}
    private void writeObject(java.io.ObjectOutputStream p0) throws java.io.IOException {}
    com.android.internal.org.bouncycastle.crypto.params.DSAPublicKeyParameters engineGetKeyParameters() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String getAlgorithm() { return null; }
    public byte[] getEncoded() { return null; }
    public java.lang.String getFormat() { return null; }
    public java.security.interfaces.DSAParams getParams() { return null; }
    public java.math.BigInteger getY() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
}
