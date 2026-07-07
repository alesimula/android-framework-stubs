package android.os;

public final class BinderProxy implements android.os.IBinder {
    private static final int NATIVE_ALLOCATION_SIZE = 1000;
    private static final java.lang.ThreadLocal<java.lang.Boolean> sMainThreadCache = null;
    private static final android.os.BinderProxy.ProxyMap sProxyMap = null;
    private static volatile android.os.Binder.ProxyTransactListener sTransactListener;
    private java.util.List<android.os.IBinder.DeathRecipient> mDeathRecipients;
    private final java.util.Map<android.os.IBinder.FrozenStateChangeCallback, java.util.concurrent.Executor> mFrozenStateChangeCallbackExecutors = null;
    private final java.util.Map<android.os.IBinder.FrozenStateChangeCallback, android.os.IBinder.FrozenStateChangeCallback> mFrozenStateChangeCallbacks = null;
    private final long mNativeData = 0L;
    volatile boolean mWarnOnBlocking;
    private BinderProxy(long p0) {}
    private native void addFrozenStateChangeCallbackNative(android.os.IBinder.FrozenStateChangeCallback p0) throws android.os.RemoteException;
    public static void dumpProxyDebugInfo() {}
    private static android.os.BinderProxy getInstance(long p0, long p1) { return null; }
    private static native long getNativeFinalizer();
    public static int getProxyCount() { return 0; }
    public static android.os.BinderProxy.InterfaceCount[] getSortedInterfaceCounts(int p0) { return null; }
    private static void invokeFrozenStateChangeCallback(android.os.IBinder.FrozenStateChangeCallback p0, android.os.IBinder p1, int p2) {}
    public static boolean isFrozenStateChangeCallbackSupported() { return false; }
    private static native boolean isFrozenStateChangeCallbackSupportedNative();
    private native void linkToDeathNative(android.os.IBinder.DeathRecipient p0, int p1) throws android.os.RemoteException;
    private native boolean removeFrozenStateChangeCallbackNative(android.os.IBinder.FrozenStateChangeCallback p0);
    private static void sendDeathNotice(android.os.IBinder.DeathRecipient p0, android.os.IBinder p1) {}
    public static void setTransactListener(android.os.Binder.ProxyTransactListener p0) {}
    private native boolean unlinkToDeathNative(android.os.IBinder.DeathRecipient p0, int p1);
    public void addFrozenStateChangeCallback(java.util.concurrent.Executor p0, android.os.IBinder.FrozenStateChangeCallback p1) throws android.os.RemoteException {}
    public void dump(java.io.FileDescriptor p0, java.lang.String[] p1) throws android.os.RemoteException {}
    public void dumpAsync(java.io.FileDescriptor p0, java.lang.String[] p1) throws android.os.RemoteException {}
    public native android.os.IBinder getExtension() throws android.os.RemoteException;
    public native java.lang.String getInterfaceDescriptor() throws android.os.RemoteException;
    public native boolean isBinderAlive();
    public void linkToDeath(android.os.IBinder.DeathRecipient p0, int p1) throws android.os.RemoteException {}
    public native boolean pingBinder();
    public android.os.IInterface queryLocalInterface(java.lang.String p0) { return null; }
    public boolean removeFrozenStateChangeCallback(android.os.IBinder.FrozenStateChangeCallback p0) throws java.lang.IllegalArgumentException { return false; }
    public void shellCommand(java.io.FileDescriptor p0, java.io.FileDescriptor p1, java.io.FileDescriptor p2, java.lang.String[] p3, android.os.ShellCallback p4, android.os.ResultReceiver p5) throws android.os.RemoteException {}
    public boolean transact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
    public native boolean transactNative(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException;
    public boolean unlinkToDeath(android.os.IBinder.DeathRecipient p0, int p1) { return false; }
    public void updateStrictModeBinderHintsIfNeeded() {}

    private static class BinderProxyMapSizeException extends java.lang.AssertionError {
        BinderProxyMapSizeException(java.lang.String p0) { super(); }
    }

    public static final class InterfaceCount {
        private final int mCount = 0;
        private final java.lang.String mInterfaceName = null;
        InterfaceCount(java.lang.String p0, int p1) {}
        public java.lang.String toString() { return null; }
    }

    private static class NoImagePreloadHolder {
        public static final long sNativeFinalizer = Long.valueOf(0L);
        public static final boolean sUseExecutorForFrozenStateChangeCallback = Boolean.valueOf(false);
        private NoImagePreloadHolder() {}
    }

    private static final class ProxyMap {
        private static final int CRASH_AT_SIZE = 25000;
        private static final int LOG_MAIN_INDEX_SIZE = 8;
        private static final int MAIN_INDEX_MASK = 255;
        private static final int MAIN_INDEX_SIZE = 256;
        static final int MAX_NUM_INTERFACES_TO_DUMP = 10;
        private static final int WARN_INCREMENT = 10;
        private final java.lang.Long[][] mMainIndexKeys = null;
        private final java.util.ArrayList<java.lang.ref.WeakReference<android.os.BinderProxy>>[] mMainIndexValues = null;
        private int mRandom;
        private int mWarnBucketSize;
        private ProxyMap() {}
        private java.lang.String dumpPerUidProxyCounts() { return null; }
        private void dumpProxyInterfaceCounts() {}
        private android.os.BinderProxy.InterfaceCount[] getSortedInterfaceCounts(int p0) { return null; }
        private static int hash(long p0) { return 0; }
        private void remove(int p0, int p1) {}
        private int size() { return 0; }
        private int unclearedSize() { return 0; }
        android.os.BinderProxy get(long p0) { return null; }
        void set(long p0, android.os.BinderProxy p1) {}
    }
}
