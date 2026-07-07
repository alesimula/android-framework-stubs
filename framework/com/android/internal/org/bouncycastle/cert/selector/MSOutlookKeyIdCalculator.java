package com.android.internal.org.bouncycastle.cert.selector;

class MSOutlookKeyIdCalculator {
    MSOutlookKeyIdCalculator() {}
    static byte[] calculateKeyId(com.android.internal.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo p0) { return null; }

    private static abstract class GeneralDigest {
        private static final int BYTE_LENGTH = 64;
        private long byteCount;
        private byte[] xBuf;
        private int xBufOff;
        protected GeneralDigest() {}
        protected GeneralDigest(com.android.internal.org.bouncycastle.cert.selector.MSOutlookKeyIdCalculator.GeneralDigest p0) {}
        protected void copyIn(com.android.internal.org.bouncycastle.cert.selector.MSOutlookKeyIdCalculator.GeneralDigest p0) {}
        public void finish() {}
        protected abstract void processBlock();
        protected abstract void processLength(long p0);
        protected abstract void processWord(byte[] p0, int p1);
        public void reset() {}
        public void update(byte p0) {}
        public void update(byte[] p0, int p1, int p2) {}
    }

    private static class SHA1Digest extends com.android.internal.org.bouncycastle.cert.selector.MSOutlookKeyIdCalculator.GeneralDigest {
        private static final int DIGEST_LENGTH = 20;
        private static final int Y1 = 1518500249;
        private static final int Y2 = 1859775393;
        private static final int Y3 = -1894007588;
        private static final int Y4 = -899497514;
        private int H1;
        private int H2;
        private int H3;
        private int H4;
        private int H5;
        private int[] X;
        private int xOff;
        public SHA1Digest() { super(); }
        private int f(int p0, int p1, int p2) { return 0; }
        private int g(int p0, int p1, int p2) { return 0; }
        private int h(int p0, int p1, int p2) { return 0; }
        public int doFinal(byte[] p0, int p1) { return 0; }
        public java.lang.String getAlgorithmName() { return null; }
        public int getDigestSize() { return 0; }
        protected void processBlock() {}
        protected void processLength(long p0) {}
        protected void processWord(byte[] p0, int p1) {}
        public void reset() {}
    }
}
