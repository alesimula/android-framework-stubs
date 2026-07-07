package com.android.internal.org.bouncycastle.jcajce.spec;

public class HybridValueParameterSpec implements java.security.spec.AlgorithmParameterSpec, javax.security.auth.Destroyable {
    private volatile java.security.spec.AlgorithmParameterSpec baseSpec;
    private final java.util.concurrent.atomic.AtomicBoolean hasBeenDestroyed = null;
    private volatile byte[] t;
    public HybridValueParameterSpec(byte[] p0, java.security.spec.AlgorithmParameterSpec p1) {}
    private void checkDestroyed() {}
    public void destroy() {}
    public java.security.spec.AlgorithmParameterSpec getBaseParameterSpec() { return null; }
    public byte[] getT() { return null; }
    public boolean isDestroyed() { return false; }
}
