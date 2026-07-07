package com.android.internal.org.bouncycastle.crypto;

public interface Wrapper {
    public java.lang.String getAlgorithmName();
    public void init(boolean p0, com.android.internal.org.bouncycastle.crypto.CipherParameters p1);
    public byte[] unwrap(byte[] p0, int p1, int p2) throws com.android.internal.org.bouncycastle.crypto.InvalidCipherTextException;
    public byte[] wrap(byte[] p0, int p1, int p2);
}
