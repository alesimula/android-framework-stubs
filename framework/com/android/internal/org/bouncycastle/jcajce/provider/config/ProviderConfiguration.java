package com.android.internal.org.bouncycastle.jcajce.provider.config;

public interface ProviderConfiguration {
    public java.util.Set getAcceptableNamedCurves();
    public java.util.Map getAdditionalECParameters();
    public javax.crypto.spec.DHParameterSpec getDHDefaultParameters(int p0);
    public java.security.spec.DSAParameterSpec getDSADefaultParameters(int p0);
    public com.android.internal.org.bouncycastle.jce.spec.ECParameterSpec getEcImplicitlyCa();
}
