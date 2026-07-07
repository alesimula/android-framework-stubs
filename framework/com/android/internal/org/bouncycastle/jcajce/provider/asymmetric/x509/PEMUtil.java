package com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.x509;

class PEMUtil {
    private final com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.x509.PEMUtil.Boundaries[] _supportedBoundaries = null;
    PEMUtil(java.lang.String p0) {}
    private com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.x509.PEMUtil.Boundaries getBoundaries(java.lang.String p0) { return null; }
    private java.lang.String readLine(java.io.InputStream p0) throws java.io.IOException { return null; }
    com.android.internal.org.bouncycastle.asn1.ASN1Sequence readPEMObject(java.io.InputStream p0, boolean p1) throws java.io.IOException { return null; }

    private static class Boundaries {
        private final java.lang.String _footer = null;
        private final java.lang.String _header = null;
        private Boundaries(java.lang.String p0) {}
        public boolean isTheExpectedFooter(java.lang.String p0) { return false; }
        public boolean isTheExpectedHeader(java.lang.String p0) { return false; }
    }
}
