package android.media.tv.tuner.dvr;

@android.annotation.SystemApi
public class DvrPlayback implements java.lang.AutoCloseable {
    public static final int PLAYBACK_STATUS_ALMOST_EMPTY = 2;
    public static final int PLAYBACK_STATUS_ALMOST_FULL = 4;
    public static final int PLAYBACK_STATUS_EMPTY = 1;
    public static final int PLAYBACK_STATUS_FULL = 8;
    private static final java.lang.String TAG = "TvTunerPlayback";
    private static int sInstantId;
    private java.util.concurrent.Executor mExecutor;
    private android.media.tv.tuner.dvr.OnPlaybackStatusChangedListener mListener;
    private final java.lang.Object mListenerLock = null;
    private long mNativeContext;
    private int mSegmentId;
    private int mUnderflow;
    private int mUserId;
    private DvrPlayback() {}
    private native int nativeAttachFilter(android.media.tv.tuner.filter.Filter p0);
    private native int nativeClose();
    private native int nativeConfigureDvr(android.media.tv.tuner.dvr.DvrSettings p0);
    private native int nativeDetachFilter(android.media.tv.tuner.filter.Filter p0);
    private native int nativeFlushDvr();
    private native long nativeRead(long p0);
    private native long nativeRead(byte[] p0, long p1, long p2);
    private native long nativeSeek(long p0);
    private native void nativeSetFileDescriptor(int p0);
    private native int nativeSetStatusCheckIntervalHint(long p0);
    private native int nativeStartDvr();
    private native int nativeStopDvr();
    private void onPlaybackStatusChanged(int p0) {}
    @java.lang.Deprecated
    public int attachFilter(android.media.tv.tuner.filter.Filter p0) { return 0; }
    public void close() {}
    public int configure(android.media.tv.tuner.dvr.DvrSettings p0) { return 0; }
    @java.lang.Deprecated
    public int detachFilter(android.media.tv.tuner.filter.Filter p0) { return 0; }
    public int flush() { return 0; }
    public long read(long p0) { return 0L; }
    public long read(byte[] p0, long p1, long p2) { return 0L; }
    public long seek(long p0) { return 0L; }
    public void setFileDescriptor(android.os.ParcelFileDescriptor p0) {}
    public void setListener(java.util.concurrent.Executor p0, android.media.tv.tuner.dvr.OnPlaybackStatusChangedListener p1) {}
    public int setPlaybackBufferStatusCheckIntervalHint(long p0) { return 0; }
    public int start() { return 0; }
    public int stop() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface PlaybackStatus {
    }
}
