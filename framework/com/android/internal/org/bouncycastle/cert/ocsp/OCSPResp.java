package com.android.internal.org.bouncycastle.cert.ocsp;

public class OCSPResp {
    public static final int INTERNAL_ERROR = 2;
    public static final int MALFORMED_REQUEST = 1;
    public static final int SIG_REQUIRED = 5;
    public static final int SUCCESSFUL = 0;
    public static final int TRY_LATER = 3;
    public static final int UNAUTHORIZED = 6;
    private com.android.internal.org.bouncycastle.asn1.ocsp.OCSPResponse resp;
    private OCSPResp(com.android.internal.org.bouncycastle.asn1.ASN1InputStream p0) throws java.io.IOException {}
    public OCSPResp(com.android.internal.org.bouncycastle.asn1.ocsp.OCSPResponse p0) {}
    public OCSPResp(java.io.InputStream p0) throws java.io.IOException {}
    public OCSPResp(byte[] p0) throws java.io.IOException {}
    public boolean equals(java.lang.Object p0) { return false; }
    public byte[] getEncoded() throws java.io.IOException { return null; }
    public java.lang.Object getResponseObject() throws com.android.internal.org.bouncycastle.cert.ocsp.OCSPException { return null; }
    public int getStatus() { return 0; }
    public int hashCode() { return 0; }
    public com.android.internal.org.bouncycastle.asn1.ocsp.OCSPResponse toASN1Structure() { return null; }
}
