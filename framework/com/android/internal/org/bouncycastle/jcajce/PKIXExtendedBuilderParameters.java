package com.android.internal.org.bouncycastle.jcajce;

public class PKIXExtendedBuilderParameters implements java.security.cert.CertPathParameters {
    private final com.android.internal.org.bouncycastle.jcajce.PKIXExtendedParameters baseParameters = null;
    private final java.util.Set<java.security.cert.X509Certificate> excludedCerts = null;
    private final int maxPathLength = 0;
    private PKIXExtendedBuilderParameters(com.android.internal.org.bouncycastle.jcajce.PKIXExtendedBuilderParameters.Builder p0) {}
    public java.lang.Object clone() { return null; }
    public com.android.internal.org.bouncycastle.jcajce.PKIXExtendedParameters getBaseParameters() { return null; }
    public java.util.Set getExcludedCerts() { return null; }
    public int getMaxPathLength() { return 0; }

    public static class Builder {
        private final com.android.internal.org.bouncycastle.jcajce.PKIXExtendedParameters baseParameters = null;
        private java.util.Set<java.security.cert.X509Certificate> excludedCerts;
        private int maxPathLength;
        public Builder(com.android.internal.org.bouncycastle.jcajce.PKIXExtendedParameters p0) {}
        public Builder(java.security.cert.PKIXBuilderParameters p0) {}
        public com.android.internal.org.bouncycastle.jcajce.PKIXExtendedBuilderParameters.Builder addExcludedCerts(java.util.Set<java.security.cert.X509Certificate> p0) { return null; }
        public com.android.internal.org.bouncycastle.jcajce.PKIXExtendedBuilderParameters build() { return null; }
        public com.android.internal.org.bouncycastle.jcajce.PKIXExtendedBuilderParameters.Builder setMaxPathLength(int p0) { return null; }
    }
}
