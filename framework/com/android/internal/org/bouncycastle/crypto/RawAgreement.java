package com.android.internal.org.bouncycastle.crypto;

public interface RawAgreement {
    public void calculateAgreement(com.android.internal.org.bouncycastle.crypto.CipherParameters p0, byte[] p1, int p2);
    public int getAgreementSize();
    public void init(com.android.internal.org.bouncycastle.crypto.CipherParameters p0);
}
