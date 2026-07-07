package com.android.internal.org.bouncycastle.crypto.digests;

public class NullDigest implements com.android.internal.org.bouncycastle.crypto.Digest {
    private com.android.internal.org.bouncycastle.crypto.digests.NullDigest.OpenByteArrayOutputStream bOut;
    public NullDigest() {}
    public int doFinal(byte[] p0, int p1) { return 0; }
    public java.lang.String getAlgorithmName() { return null; }
    public int getDigestSize() { return 0; }
    public void reset() {}
    public void update(byte p0) {}
    public void update(byte[] p0, int p1, int p2) {}

    private static class OpenByteArrayOutputStream extends java.io.ByteArrayOutputStream {
        private OpenByteArrayOutputStream() { super(); }
        void copy(byte[] p0, int p1) {}
        public void reset() {}
    }
}
