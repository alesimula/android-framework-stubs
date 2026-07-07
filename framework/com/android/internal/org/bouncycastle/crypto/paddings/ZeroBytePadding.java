package com.android.internal.org.bouncycastle.crypto.paddings;

public class ZeroBytePadding implements com.android.internal.org.bouncycastle.crypto.paddings.BlockCipherPadding {
    public ZeroBytePadding() {}
    public int addPadding(byte[] p0, int p1) { return 0; }
    public java.lang.String getPaddingName() { return null; }
    public void init(java.security.SecureRandom p0) throws java.lang.IllegalArgumentException {}
    public int padCount(byte[] p0) throws com.android.internal.org.bouncycastle.crypto.InvalidCipherTextException { return 0; }
}
