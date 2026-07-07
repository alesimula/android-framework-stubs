package com.android.internal.org.bouncycastle.jcajce.provider.keystore.util;

public class JKSKeyStoreSpi extends java.security.KeyStoreSpi {
    private static final java.lang.String NOT_IMPLEMENTED_MESSAGE = "BC JKS store is read-only and only supports certificate entries";
    private final java.util.Hashtable<java.lang.String, com.android.internal.org.bouncycastle.jcajce.provider.keystore.util.JKSKeyStoreSpi.BCJKSTrustedCertEntry> certificateEntries = null;
    private final com.android.internal.org.bouncycastle.jcajce.util.JcaJceHelper helper = null;
    public JKSKeyStoreSpi(com.android.internal.org.bouncycastle.jcajce.util.JcaJceHelper p0) { super(); }
    private void addPassword(com.android.internal.org.bouncycastle.crypto.Digest p0, char[] p1) throws java.io.IOException {}
    private java.security.cert.CertificateFactory createCertFactory(java.lang.String p0) throws java.security.cert.CertificateException { return null; }
    private com.android.internal.org.bouncycastle.jcajce.provider.keystore.util.JKSKeyStoreSpi.ErasableByteStream validateStream(java.io.InputStream p0, char[] p1) throws java.io.IOException { return null; }
    public java.util.Enumeration<java.lang.String> engineAliases() { return null; }
    public boolean engineContainsAlias(java.lang.String p0) { return false; }
    public void engineDeleteEntry(java.lang.String p0) throws java.security.KeyStoreException {}
    public java.security.cert.Certificate engineGetCertificate(java.lang.String p0) { return null; }
    public java.lang.String engineGetCertificateAlias(java.security.cert.Certificate p0) { return null; }
    public java.security.cert.Certificate[] engineGetCertificateChain(java.lang.String p0) { return null; }
    public java.util.Date engineGetCreationDate(java.lang.String p0) { return null; }
    public java.security.Key engineGetKey(java.lang.String p0, char[] p1) throws java.security.NoSuchAlgorithmException, java.security.UnrecoverableKeyException { return null; }
    public boolean engineIsCertificateEntry(java.lang.String p0) { return false; }
    public boolean engineIsKeyEntry(java.lang.String p0) { return false; }
    public void engineLoad(java.io.InputStream p0, char[] p1) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException {}
    public void engineLoad(java.security.KeyStore.LoadStoreParameter p0) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException {}
    public boolean engineProbe(java.io.InputStream p0) throws java.io.IOException { return false; }
    public void engineSetCertificateEntry(java.lang.String p0, java.security.cert.Certificate p1) throws java.security.KeyStoreException {}
    public void engineSetKeyEntry(java.lang.String p0, java.security.Key p1, char[] p2, java.security.cert.Certificate[] p3) throws java.security.KeyStoreException {}
    public void engineSetKeyEntry(java.lang.String p0, byte[] p1, java.security.cert.Certificate[] p2) throws java.security.KeyStoreException {}
    public int engineSize() { return 0; }
    public void engineStore(java.io.OutputStream p0, char[] p1) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException {}

    private static final class BCJKSTrustedCertEntry {
        final java.security.cert.Certificate cert = null;
        final java.util.Date date = null;
        public BCJKSTrustedCertEntry(java.util.Date p0, java.security.cert.Certificate p1) {}
    }

    private static final class ErasableByteStream extends java.io.ByteArrayInputStream {
        public ErasableByteStream(byte[] p0, int p1, int p2) { super((byte[])null); }
        public void erase() {}
    }
}
