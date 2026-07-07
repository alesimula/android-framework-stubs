package com.android.internal.org.bouncycastle.asn1;

public class ASN1ObjectIdentifier extends com.android.internal.org.bouncycastle.asn1.ASN1Primitive {
    private static final long LONG_LIMIT = 72057594037927808L;
    static final com.android.internal.org.bouncycastle.asn1.ASN1UniversalType TYPE = null;
    private static final java.util.concurrent.ConcurrentMap<com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier.OidHandle, com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier> pool = null;
    private byte[] contents;
    private final java.lang.String identifier = null;
    ASN1ObjectIdentifier(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0, java.lang.String p1) { super(); }
    public ASN1ObjectIdentifier(java.lang.String p0) { super(); }
    ASN1ObjectIdentifier(byte[] p0, boolean p1) { super(); }
    static com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier createPrimitive(byte[] p0, boolean p1) { return null; }
    private void doOutput(java.io.ByteArrayOutputStream p0) {}
    public static com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier fromContents(byte[] p0) { return null; }
    private byte[] getContents() { return null; }
    public static com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier getInstance(com.android.internal.org.bouncycastle.asn1.ASN1TaggedObject p0, boolean p1) { return null; }
    public static com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier getInstance(java.lang.Object p0) { return null; }
    private static boolean isValidIdentifier(java.lang.String p0) { return false; }
    boolean asn1Equals(com.android.internal.org.bouncycastle.asn1.ASN1Primitive p0) { return false; }
    public com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier branch(java.lang.String p0) { return null; }
    void encode(com.android.internal.org.bouncycastle.asn1.ASN1OutputStream p0, boolean p1) throws java.io.IOException {}
    boolean encodeConstructed() { return false; }
    int encodedLength(boolean p0) { return 0; }
    public java.lang.String getId() { return null; }
    public int hashCode() { return 0; }
    public com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier intern() { return null; }
    public boolean on(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0) { return false; }
    public java.lang.String toString() { return null; }

    private static class OidHandle {
        private final byte[] contents = null;
        private final int key = 0;
        OidHandle(byte[] p0) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }
}
