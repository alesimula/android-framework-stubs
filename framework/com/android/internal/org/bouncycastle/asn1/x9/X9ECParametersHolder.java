package com.android.internal.org.bouncycastle.asn1.x9;

public abstract class X9ECParametersHolder {
    private com.android.internal.org.bouncycastle.math.ec.ECCurve curve;
    private com.android.internal.org.bouncycastle.asn1.x9.X9ECParameters params;
    public X9ECParametersHolder() {}
    protected com.android.internal.org.bouncycastle.math.ec.ECCurve createCurve() { return null; }
    protected abstract com.android.internal.org.bouncycastle.asn1.x9.X9ECParameters createParameters();
    public com.android.internal.org.bouncycastle.math.ec.ECCurve getCurve() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x9.X9ECParameters getParameters() { return null; }
}
