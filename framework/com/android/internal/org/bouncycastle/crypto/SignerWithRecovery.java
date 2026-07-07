package com.android.internal.org.bouncycastle.crypto;

public interface SignerWithRecovery extends com.android.internal.org.bouncycastle.crypto.Signer {
    public byte[] getRecoveredMessage();
    public boolean hasFullMessage();
    public void updateWithRecoveredMessage(byte[] p0) throws com.android.internal.org.bouncycastle.crypto.InvalidCipherTextException;
}
