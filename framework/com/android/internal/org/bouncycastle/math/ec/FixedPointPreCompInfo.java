package com.android.internal.org.bouncycastle.math.ec;

public class FixedPointPreCompInfo implements com.android.internal.org.bouncycastle.math.ec.PreCompInfo {
    protected com.android.internal.org.bouncycastle.math.ec.ECLookupTable lookupTable;
    protected com.android.internal.org.bouncycastle.math.ec.ECPoint offset;
    protected int width;
    public FixedPointPreCompInfo() {}
    public com.android.internal.org.bouncycastle.math.ec.ECLookupTable getLookupTable() { return null; }
    public com.android.internal.org.bouncycastle.math.ec.ECPoint getOffset() { return null; }
    public int getWidth() { return 0; }
    public void setLookupTable(com.android.internal.org.bouncycastle.math.ec.ECLookupTable p0) {}
    public void setOffset(com.android.internal.org.bouncycastle.math.ec.ECPoint p0) {}
    public void setWidth(int p0) {}
}
