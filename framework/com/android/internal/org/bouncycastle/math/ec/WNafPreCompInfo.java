package com.android.internal.org.bouncycastle.math.ec;

public class WNafPreCompInfo implements com.android.internal.org.bouncycastle.math.ec.PreCompInfo {
    protected int confWidth;
    protected com.android.internal.org.bouncycastle.math.ec.ECPoint[] preComp;
    protected com.android.internal.org.bouncycastle.math.ec.ECPoint[] preCompNeg;
    volatile int promotionCountdown;
    protected com.android.internal.org.bouncycastle.math.ec.ECPoint twice;
    protected int width;
    public WNafPreCompInfo() {}
    int decrementPromotionCountdown() { return 0; }
    public int getConfWidth() { return 0; }
    public com.android.internal.org.bouncycastle.math.ec.ECPoint[] getPreComp() { return null; }
    public com.android.internal.org.bouncycastle.math.ec.ECPoint[] getPreCompNeg() { return null; }
    int getPromotionCountdown() { return 0; }
    public com.android.internal.org.bouncycastle.math.ec.ECPoint getTwice() { return null; }
    public int getWidth() { return 0; }
    public boolean isPromoted() { return false; }
    public void setConfWidth(int p0) {}
    public void setPreComp(com.android.internal.org.bouncycastle.math.ec.ECPoint[] p0) {}
    public void setPreCompNeg(com.android.internal.org.bouncycastle.math.ec.ECPoint[] p0) {}
    void setPromotionCountdown(int p0) {}
    public void setTwice(com.android.internal.org.bouncycastle.math.ec.ECPoint p0) {}
    public void setWidth(int p0) {}
}
