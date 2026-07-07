package com.android.internal.org.bouncycastle.jcajce;

public interface PKIXCertRevocationChecker {
    public void check(java.security.cert.Certificate p0) throws java.security.cert.CertPathValidatorException;
    public void initialize(com.android.internal.org.bouncycastle.jcajce.PKIXCertRevocationCheckerParameters p0) throws java.security.cert.CertPathValidatorException;
    public void setParameter(java.lang.String p0, java.lang.Object p1);
}
