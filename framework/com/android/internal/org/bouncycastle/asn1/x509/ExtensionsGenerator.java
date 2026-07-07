package com.android.internal.org.bouncycastle.asn1.x509;

public class ExtensionsGenerator {
    private static final java.util.Set dupsAllowed = null;
    private java.util.Vector extOrdering;
    private java.util.Hashtable extensions;
    public ExtensionsGenerator() {}
    public void addExtension(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0, boolean p1, com.android.internal.org.bouncycastle.asn1.ASN1Encodable p2) throws java.io.IOException {}
    public void addExtension(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0, boolean p1, byte[] p2) {}
    public void addExtension(com.android.internal.org.bouncycastle.asn1.x509.Extension p0) {}
    public void addExtension(com.android.internal.org.bouncycastle.asn1.x509.Extensions p0) {}
    public com.android.internal.org.bouncycastle.asn1.x509.Extensions generate() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x509.Extension getExtension(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0) { return null; }
    public boolean hasExtension(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0) { return false; }
    public boolean isEmpty() { return false; }
    public void removeExtension(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0) {}
    public void replaceExtension(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0, boolean p1, com.android.internal.org.bouncycastle.asn1.ASN1Encodable p2) throws java.io.IOException {}
    public void replaceExtension(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0, boolean p1, byte[] p2) {}
    public void replaceExtension(com.android.internal.org.bouncycastle.asn1.x509.Extension p0) {}
    public void reset() {}
}
