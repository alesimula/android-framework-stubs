package com.android.internal.org.bouncycastle.crypto;

public interface AsymmetricCipherKeyPairGenerator {
    public com.android.internal.org.bouncycastle.crypto.AsymmetricCipherKeyPair generateKeyPair();
    public void init(com.android.internal.org.bouncycastle.crypto.KeyGenerationParameters p0);
}
