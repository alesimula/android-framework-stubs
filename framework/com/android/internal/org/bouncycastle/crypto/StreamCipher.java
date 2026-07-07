package com.android.internal.org.bouncycastle.crypto;

public interface StreamCipher {
    public java.lang.String getAlgorithmName();
    public void init(boolean p0, com.android.internal.org.bouncycastle.crypto.CipherParameters p1) throws java.lang.IllegalArgumentException;
    public int processBytes(byte[] p0, int p1, int p2, byte[] p3, int p4) throws com.android.internal.org.bouncycastle.crypto.DataLengthException;
    public void reset();
    public byte returnByte(byte p0);
}
