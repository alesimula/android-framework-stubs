package com.android.internal.org.bouncycastle.jce.provider;

class BouncyCastleProviderConfiguration implements com.android.internal.org.bouncycastle.jcajce.provider.config.ProviderConfiguration {
    private static java.security.Permission BC_ADDITIONAL_EC_CURVE_PERMISSION;
    private static java.security.Permission BC_DH_LOCAL_PERMISSION;
    private static java.security.Permission BC_DH_PERMISSION;
    private static java.security.Permission BC_EC_CURVE_PERMISSION;
    private static java.security.Permission BC_EC_LOCAL_PERMISSION;
    private static java.security.Permission BC_EC_PERMISSION;
    private volatile java.util.Set acceptableNamedCurves;
    private volatile java.util.Map additionalECParameters;
    private volatile java.lang.Object dhDefaultParams;
    private java.lang.ThreadLocal dhThreadSpec;
    private volatile com.android.internal.org.bouncycastle.jce.spec.ECParameterSpec ecImplicitCaParams;
    private java.lang.ThreadLocal ecThreadSpec;
    BouncyCastleProviderConfiguration() {}
    public java.util.Set getAcceptableNamedCurves() { return null; }
    public java.util.Map getAdditionalECParameters() { return null; }
    public javax.crypto.spec.DHParameterSpec getDHDefaultParameters(int p0) { return null; }
    public java.security.spec.DSAParameterSpec getDSADefaultParameters(int p0) { return null; }
    public com.android.internal.org.bouncycastle.jce.spec.ECParameterSpec getEcImplicitlyCa() { return null; }
    void setParameter(java.lang.String p0, java.lang.Object p1) {}
}
