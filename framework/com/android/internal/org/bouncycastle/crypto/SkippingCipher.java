package com.android.internal.org.bouncycastle.crypto;

public interface SkippingCipher {
    public long getPosition();
    public long seekTo(long p0);
    public long skip(long p0);
}
