package android.media;

public final class MediaExtractor {
    public static final int SAMPLE_FLAG_ENCRYPTED = 2;
    public static final int SAMPLE_FLAG_PARTIAL_FRAME = 4;
    public static final int SAMPLE_FLAG_SYNC = 1;
    public static final int SEEK_TO_CLOSEST_SYNC = 2;
    public static final int SEEK_TO_NEXT_SYNC = 1;
    public static final int SEEK_TO_PREVIOUS_SYNC = 0;
    private android.media.metrics.LogSessionId mLogSessionId;
    private android.media.MediaCas mMediaCas;
    private long mNativeContext;
    public MediaExtractor() {}
    private native java.util.Map<java.lang.String, java.lang.Object> getFileFormatNative();
    private native java.util.Map<java.lang.String, java.lang.Object> getTrackFormatNative(int p0);
    private final native void nativeSetDataSource(android.os.IBinder p0, java.lang.String p1, java.lang.String[] p2, java.lang.String[] p3) throws java.io.IOException;
    private final native void nativeSetMediaCas(android.os.IHwBinder p0);
    private final native void native_finalize();
    private native java.util.List<android.media.AudioPresentation> native_getAudioPresentations(int p0);
    private native android.os.PersistableBundle native_getMetrics();
    private static final native void native_init();
    private native void native_setLogSessionId(java.lang.String p0);
    private final native void native_setup();
    public native boolean advance();
    protected void finalize() {}
    public java.util.List<android.media.AudioPresentation> getAudioPresentations(int p0) { return null; }
    public native long getCachedDuration();
    public android.media.MediaExtractor.CasInfo getCasInfo(int p0) { return null; }
    public android.media.DrmInitData getDrmInitData() { return null; }
    public android.media.metrics.LogSessionId getLogSessionId() { return null; }
    public android.os.PersistableBundle getMetrics() { return null; }
    public java.util.Map<java.util.UUID, byte[]> getPsshInfo() { return null; }
    public native boolean getSampleCryptoInfo(android.media.MediaCodec.CryptoInfo p0);
    public native int getSampleFlags();
    public native long getSampleSize();
    public native long getSampleTime();
    public native int getSampleTrackIndex();
    public final native int getTrackCount();
    public android.media.MediaFormat getTrackFormat(int p0) { return null; }
    public native boolean hasCacheReachedEndOfStream();
    public native int readSampleData(java.nio.ByteBuffer p0, int p1);
    public final native void release();
    public native void seekTo(long p0, int p1);
    public native void selectTrack(int p0);
    public final void setDataSource(android.content.Context p0, android.net.Uri p1, java.util.Map<java.lang.String, java.lang.String> p2) throws java.io.IOException {}
    public final void setDataSource(android.content.res.AssetFileDescriptor p0) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException {}
    public final native void setDataSource(android.media.MediaDataSource p0) throws java.io.IOException;
    public final void setDataSource(java.io.FileDescriptor p0) throws java.io.IOException {}
    public final native void setDataSource(java.io.FileDescriptor p0, long p1, long p2) throws java.io.IOException;
    public final void setDataSource(java.lang.String p0) throws java.io.IOException {}
    public final void setDataSource(java.lang.String p0, java.util.Map<java.lang.String, java.lang.String> p1) throws java.io.IOException {}
    public void setLogSessionId(android.media.metrics.LogSessionId p0) {}
    @java.lang.Deprecated
    public final void setMediaCas(android.media.MediaCas p0) {}
    public native void unselectTrack(int p0);

    public static final class CasInfo {
        private final byte[] mPrivateData = null;
        private final android.media.MediaCas.Session mSession = null;
        private final int mSystemId = 0;
        CasInfo(int p0, android.media.MediaCas.Session p1, byte[] p2) {}
        public byte[] getPrivateData() { return null; }
        public android.media.MediaCas.Session getSession() { return null; }
        public int getSystemId() { return 0; }
    }

    public static final class MetricsConstants {
        public static final java.lang.String FORMAT = "android.media.mediaextractor.fmt";
        public static final java.lang.String MIME_TYPE = "android.media.mediaextractor.mime";
        public static final java.lang.String TRACKS = "android.media.mediaextractor.ntrk";
        private MetricsConstants() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SampleFlag {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SeekMode {
    }
}
