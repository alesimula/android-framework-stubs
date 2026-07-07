package com.android.internal.org.bouncycastle.crypto;

public interface BasicAgreement {
    public java.math.BigInteger calculateAgreement(com.android.internal.org.bouncycastle.crypto.CipherParameters p0);
    public int getFieldSize();
    public void init(com.android.internal.org.bouncycastle.crypto.CipherParameters p0);
}
