package android.security.keystore2;

class KeyStoreCryptoOperationChunkedStreamer implements android.security.keystore2.KeyStoreCryptoOperationStreamer {
    private static final int DEFAULT_CHUNK_SIZE_MAX = 32768;
    private static final int DEFAULT_CHUNK_SIZE_THRESHOLD = 2048;
    private final byte[] mChunk = null;
    private int mChunkLength;
    private final int mChunkSizeMax = 0;
    private final int mChunkSizeThreshold = 0;
    private long mConsumedInputSizeBytes;
    private final android.security.keystore2.KeyStoreCryptoOperationChunkedStreamer.Stream mKeyStoreStream = null;
    private long mProducedOutputSizeBytes;
    KeyStoreCryptoOperationChunkedStreamer(android.security.keystore2.KeyStoreCryptoOperationChunkedStreamer.Stream p0) {}
    KeyStoreCryptoOperationChunkedStreamer(android.security.keystore2.KeyStoreCryptoOperationChunkedStreamer.Stream p0, int p1) {}
    KeyStoreCryptoOperationChunkedStreamer(android.security.keystore2.KeyStoreCryptoOperationChunkedStreamer.Stream p0, int p1, int p2) {}
    public byte[] doFinal(byte[] p0, int p1, int p2, byte[] p3) throws android.security.KeyStoreException { return null; }
    public long getConsumedInputSizeBytes() { return 0L; }
    public long getProducedOutputSizeBytes() { return 0L; }
    public byte[] update(byte[] p0, int p1, int p2) throws android.security.KeyStoreException { return null; }

    public static class MainDataStream implements android.security.keystore2.KeyStoreCryptoOperationChunkedStreamer.Stream {
        private final android.security.KeyStoreOperation mOperation = null;
        MainDataStream(android.security.KeyStoreOperation p0) {}
        public byte[] finish(byte[] p0, byte[] p1) throws android.security.KeyStoreException { return null; }
        public byte[] update(byte[] p0) throws android.security.KeyStoreException { return null; }
    }

    static interface Stream {
        public byte[] finish(byte[] p0, byte[] p1) throws android.security.KeyStoreException;
        public byte[] update(byte[] p0) throws android.security.KeyStoreException;
    }
}
