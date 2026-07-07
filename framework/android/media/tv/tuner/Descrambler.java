package android.media.tv.tuner;

@android.annotation.SystemApi
public class Descrambler implements java.lang.AutoCloseable {
    public static final int PID_TYPE_MMTP = 2;
    public static final int PID_TYPE_T = 1;
    private static final java.lang.String TAG = "Descrambler";
    private boolean mIsClosed;
    private final java.lang.Object mLock = null;
    private long mNativeContext;
    private Descrambler() {}
    public static boolean isValidKeyToken(byte[] p0) { return false; }
    private native int nativeAddPid(int p0, int p1, android.media.tv.tuner.filter.Filter p2);
    private native int nativeClose();
    private native int nativeRemovePid(int p0, int p1, android.media.tv.tuner.filter.Filter p2);
    private native int nativeSetKeyToken(byte[] p0);
    public int addPid(int p0, int p1, android.media.tv.tuner.filter.Filter p2) { return 0; }
    public void close() {}
    public int removePid(int p0, int p1, android.media.tv.tuner.filter.Filter p2) { return 0; }
    public int setKeyToken(byte[] p0) { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PidType {
    }
}
