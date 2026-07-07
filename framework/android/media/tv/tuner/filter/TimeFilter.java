package android.media.tv.tuner.filter;

@android.annotation.SystemApi
public class TimeFilter implements java.lang.AutoCloseable {
    private boolean mEnable;
    private long mNativeContext;
    private TimeFilter() {}
    private native int nativeClearTimestamp();
    private native int nativeClose();
    private native java.lang.Long nativeGetSourceTime();
    private native java.lang.Long nativeGetTimestamp();
    private native int nativeSetTimestamp(long p0);
    public int clearTimestamp() { return 0; }
    public void close() {}
    public long getSourceTime() { return 0L; }
    public long getTimeStamp() { return 0L; }
    public int setCurrentTimestamp(long p0) { return 0; }
}
