package android.os;

public abstract class TokenWatcher {
    private volatile boolean mAcquired;
    private android.os.Handler mHandler;
    private int mNotificationQueue;
    private java.lang.Runnable mNotificationTask;
    private java.lang.String mTag;
    private java.util.WeakHashMap<android.os.IBinder, android.os.TokenWatcher.Death> mTokens;
    public TokenWatcher(android.os.Handler p0, java.lang.String p1) {}
    private java.util.ArrayList<java.lang.String> dumpInternal() { return null; }
    private void sendNotificationLocked(boolean p0) {}
    public void acquire(android.os.IBinder p0, java.lang.String p1) {}
    public abstract void acquired();
    public void cleanup(android.os.IBinder p0, boolean p1) {}
    public void dump() {}
    public void dump(java.io.PrintWriter p0) {}
    public boolean isAcquired() { return false; }
    public void release(android.os.IBinder p0) {}
    public abstract void released();

    private class Death implements android.os.IBinder.DeathRecipient {
        java.lang.String tag;
        android.os.IBinder token;
        Death(android.os.TokenWatcher p0, android.os.IBinder p1, java.lang.String p2) {}
        public void binderDied() {}
        protected void finalize() throws java.lang.Throwable {}
    }
}
