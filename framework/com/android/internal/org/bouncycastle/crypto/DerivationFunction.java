package com.android.internal.org.bouncycastle.crypto;

public interface DerivationFunction {
    public int generateBytes(byte[] p0, int p1, int p2) throws com.android.internal.org.bouncycastle.crypto.DataLengthException, java.lang.IllegalArgumentException;
    public void init(com.android.internal.org.bouncycastle.crypto.DerivationParameters p0);
}
