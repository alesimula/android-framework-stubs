package com.android.internal.org.bouncycastle.x509;

public class ExtendedPKIXParameters extends java.security.cert.PKIXParameters {
    public static final int CHAIN_VALIDITY_MODEL = 1;
    public static final int PKIX_VALIDITY_MODEL = 0;
    private boolean additionalLocationsEnabled;
    private java.util.List additionalStores;
    private java.util.Set attrCertCheckers;
    private java.util.Set necessaryACAttributes;
    private java.util.Set prohibitedACAttributes;
    private com.android.internal.org.bouncycastle.util.Selector selector;
    private java.util.List stores;
    private java.util.Set trustedACIssuers;
    private boolean useDeltas;
    private int validityModel;
    public ExtendedPKIXParameters(java.util.Set p0) throws java.security.InvalidAlgorithmParameterException { super((java.util.Set)null); }
    public static com.android.internal.org.bouncycastle.x509.ExtendedPKIXParameters getInstance(java.security.cert.PKIXParameters p0) { return null; }
    public void addAddionalStore(com.android.internal.org.bouncycastle.util.Store p0) {}
    public void addAdditionalStore(com.android.internal.org.bouncycastle.util.Store p0) {}
    public void addStore(com.android.internal.org.bouncycastle.util.Store p0) {}
    public java.lang.Object clone() { return null; }
    public java.util.List getAdditionalStores() { return null; }
    public java.util.Set getAttrCertCheckers() { return null; }
    public java.util.Set getNecessaryACAttributes() { return null; }
    public java.util.Set getProhibitedACAttributes() { return null; }
    public java.util.List getStores() { return null; }
    public com.android.internal.org.bouncycastle.util.Selector getTargetConstraints() { return null; }
    public java.util.Set getTrustedACIssuers() { return null; }
    public int getValidityModel() { return 0; }
    public boolean isAdditionalLocationsEnabled() { return false; }
    public boolean isUseDeltasEnabled() { return false; }
    public void setAdditionalLocationsEnabled(boolean p0) {}
    public void setAttrCertCheckers(java.util.Set p0) {}
    public void setCertStores(java.util.List p0) {}
    public void setNecessaryACAttributes(java.util.Set p0) {}
    protected void setParams(java.security.cert.PKIXParameters p0) {}
    public void setProhibitedACAttributes(java.util.Set p0) {}
    public void setStores(java.util.List p0) {}
    public void setTargetCertConstraints(java.security.cert.CertSelector p0) {}
    public void setTargetConstraints(com.android.internal.org.bouncycastle.util.Selector p0) {}
    public void setTrustedACIssuers(java.util.Set p0) {}
    public void setUseDeltasEnabled(boolean p0) {}
    public void setValidityModel(int p0) {}
}
