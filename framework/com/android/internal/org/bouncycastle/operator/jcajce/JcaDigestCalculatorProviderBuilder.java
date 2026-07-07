package com.android.internal.org.bouncycastle.operator.jcajce;

public class JcaDigestCalculatorProviderBuilder {
    private com.android.internal.org.bouncycastle.operator.jcajce.OperatorHelper helper;
    public JcaDigestCalculatorProviderBuilder() {}
    public com.android.internal.org.bouncycastle.operator.DigestCalculatorProvider build() throws com.android.internal.org.bouncycastle.operator.OperatorCreationException { return null; }
    public com.android.internal.org.bouncycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder setHelper(com.android.internal.org.bouncycastle.jcajce.util.JcaJceHelper p0) { return null; }
    public com.android.internal.org.bouncycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder setProvider(java.lang.String p0) { return null; }
    public com.android.internal.org.bouncycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder setProvider(java.security.Provider p0) { return null; }

    private static class DigestOutputStream extends java.io.OutputStream {
        private java.security.MessageDigest dig;
        DigestOutputStream(java.security.MessageDigest p0) { super(); }
        byte[] getDigest() { return null; }
        public void write(int p0) throws java.io.IOException {}
        public void write(byte[] p0) throws java.io.IOException {}
        public void write(byte[] p0, int p1, int p2) throws java.io.IOException {}
    }
}
