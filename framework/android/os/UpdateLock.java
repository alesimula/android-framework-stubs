package android.os;

public class UpdateLock {
    private static final boolean DEBUG = false;
    public static final java.lang.String NOW_IS_CONVENIENT = "nowisconvenient";
    private static final java.lang.String TAG = "UpdateLock";
    public static final java.lang.String TIMESTAMP = "timestamp";
    public static final java.lang.String UPDATE_LOCK_CHANGED = "android.os.UpdateLock.UPDATE_LOCK_CHANGED";
    private static android.os.IUpdateLock sService;
    int mCount;
    boolean mHeld;
    boolean mRefCounted;
    final java.lang.String mTag = null;
    android.os.IBinder mToken;
    public UpdateLock(java.lang.String p0) {}
    private void acquireLocked() {}
    private static void checkService() {}
    private void releaseLocked() {}
    public void acquire() {}
    protected void finalize() throws java.lang.Throwable {}
    public boolean isHeld() { return false; }
    public void release() {}
    public void setReferenceCounted(boolean p0) {}
}
