package android.os;

public class RemoteCallbackList<E extends android.os.IInterface> {
    private static final int DEFAULT_MAX_QUEUE_SIZE = 1000;
    public static final int FROZEN_CALLEE_POLICY_DROP = 3;
    public static final int FROZEN_CALLEE_POLICY_ENQUEUE_ALL = 1;
    public static final int FROZEN_CALLEE_POLICY_ENQUEUE_MOST_RECENT = 2;
    public static final int FROZEN_CALLEE_POLICY_UNSET = 0;
    private static final java.lang.String TAG = "RemoteCallbackList";
    private java.lang.Object[] mActiveBroadcast;
    private int mBroadcastCount;
    private final java.util.concurrent.Executor mExecutor = null;
    private final int mFrozenCalleePolicy = 0;
    android.util.ArrayMap<android.os.IBinder, android.os.RemoteCallbackList<E>.Interface> mInterfaces;
    private boolean mKilled;
    private final int mMaxQueueSize = 0;
    private java.lang.StringBuilder mRecentCallers;
    public RemoteCallbackList() {}
    private RemoteCallbackList(int p0, int p1, java.util.concurrent.Executor p2) {}
    private int beginBroadcastInternal() { return 0; }
    private void logExcessiveInterfaces() {}
    public int beginBroadcast() { return 0; }
    public <C extends java.lang.Object> void broadcast(java.util.function.BiConsumer<E, C> p0) {}
    public void broadcast(java.util.function.Consumer<E> p0) {}
    public <C extends java.lang.Object> void broadcastForEachCookie(java.util.function.Consumer<C> p0) {}
    public void dump(java.io.PrintWriter p0, java.lang.String p1) {}
    public void finishBroadcast() {}
    public java.lang.Object getBroadcastCookie(int p0) { return null; }
    public E getBroadcastItem(int p0) { return null; }
    public java.util.concurrent.Executor getExecutor() { return null; }
    public int getFrozenCalleePolicy() { return 0; }
    public int getMaxQueueSize() { return 0; }
    public java.lang.Object getRegisteredCallbackCookie(int p0) { return null; }
    public int getRegisteredCallbackCount() { return 0; }
    public E getRegisteredCallbackItem(int p0) { return null; }
    public void kill() {}
    public void onCallbackDied(E p0) {}
    public void onCallbackDied(E p0, java.lang.Object p1) {}
    public boolean register(E p0) { return false; }
    public boolean register(E p0, java.lang.Object p1) { return false; }
    public boolean unregister(E p0) { return false; }

    public static final class Builder<E extends android.os.IInterface> {
        private java.util.concurrent.Executor mExecutor;
        private int mFrozenCalleePolicy;
        private android.os.RemoteCallbackList.Builder.InterfaceDiedCallback mInterfaceDiedCallback;
        private int mMaxQueueSize;
        public Builder(int p0) {}
        public android.os.RemoteCallbackList<E> build() { return null; }
        public android.os.RemoteCallbackList.Builder setExecutor(java.util.concurrent.Executor p0) { return null; }
        public android.os.RemoteCallbackList.Builder setInterfaceDiedCallback(android.os.RemoteCallbackList.Builder.InterfaceDiedCallback<E> p0) { return null; }
        public android.os.RemoteCallbackList.Builder setMaxQueueSize(int p0) { return null; }

        public static interface InterfaceDiedCallback<E extends android.os.IInterface> {
            public void onInterfaceDied(android.os.RemoteCallbackList<E> p0, E p1, java.lang.Object p2);
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface FrozenCalleePolicy {
    }

    private final class Interface implements android.os.IBinder.DeathRecipient, android.os.IBinder.FrozenStateChangeCallback {
        final android.os.IBinder mBinder = null;
        final java.util.Queue<java.util.function.Consumer<E>> mCallbackQueue = null;
        final java.lang.Object mCookie = null;
        int mCurrentState;
        final E mInterface = null;
        Interface(E p0, java.lang.Object p1) {}
        void addCallback(java.util.function.Consumer<E> p0) {}
        public void binderDied() {}
        void maybeSubscribeToFrozenCallback() throws android.os.RemoteException {}
        void maybeUnsubscribeFromFrozenCallback() {}
        public void onFrozenStateChanged(android.os.IBinder p0, int p1) {}
    }
}
