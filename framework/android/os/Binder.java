package android.os;

public class Binder implements android.os.IBinder {
    public static final boolean CHECK_PARCEL_SIZE = false;
    private static final boolean FIND_POTENTIAL_LEAKS = false;
    public static boolean LOG_RUNTIME_EXCEPTION;
    private static final int NATIVE_ALLOCATION_SIZE = 500;
    static final java.lang.String TAG = "Binder";
    public static final int UNSET_WORKSOURCE = -1;
    private static android.os.IBinderCallback sBinderCallback;
    private static volatile java.lang.String sDumpDisabled;
    private static volatile com.android.internal.os.BinderCallHeavyHitterWatcher sHeavyHitterWatcher;
    private static boolean sIsHandlingBinderTransaction;
    private static com.android.internal.os.BinderInternal.Observer sObserver;
    private static volatile boolean sStackTrackingEnabled;
    private static volatile android.os.TransactionTracker sTransactionTracker;
    static volatile boolean sWarnOnBlocking;
    static java.lang.ThreadLocal<java.lang.Boolean> sWarnOnBlockingOnCurrentThread;
    private static volatile com.android.internal.os.BinderInternal.WorkSourceProvider sWorkSourceProvider;
    private java.lang.String mDescriptor;
    private android.os.IBinder mExtension;
    private final long mObject = 0L;
    private android.os.IInterface mOwner;
    public Binder() {}
    public Binder(java.lang.String p0) {}
    public static android.os.IBinder allowBlocking(android.os.IBinder p0) { return null; }
    public static void allowBlockingForCurrentThread() {}
    public static final native void blockUntilThreadAvailable();
    static void checkParcel(android.os.IBinder p0, int p1, android.os.Parcel p2, java.lang.String p3) {}
    public static final native long clearCallingIdentity();
    public static final native long clearCallingWorkSource();
    public static void copyAllowBlocking(android.os.IBinder p0, android.os.IBinder p1) {}
    public static android.os.IBinder defaultBlocking(android.os.IBinder p0) { return null; }
    public static void defaultBlockingForCurrentThread() {}
    public static void disableStackTracking() {}
    public static void enableStackTracking() {}
    private boolean execTransact(int p0, long p1, long p2, int p3) { return false; }
    private boolean execTransactInternal(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3, int p4) { return false; }
    public static final native void flushPendingCommands();
    public static final native int getCallingPid();
    public static final native int getCallingUid();
    public static final int getCallingUidOrThrow() { return 0; }
    public static final int getCallingUidOrWtf(java.lang.String p0) { return 0; }
    public static final android.os.UserHandle getCallingUserHandle() { return null; }
    public static final native int getCallingWorkSourceUid();
    private static native long getNativeBBinderHolder();
    private static native long getNativeFinalizer();
    public static final native int getThreadStrictModePolicy();
    public static android.os.TransactionTracker getTransactionTracker() { return null; }
    private static native boolean hasExplicitIdentity();
    public static final boolean isDirectlyHandlingTransaction() { return false; }
    public static final native boolean isDirectlyHandlingTransactionNative();
    public static final boolean isProxy(android.os.IInterface p0) { return false; }
    public static boolean isStackTrackingEnabled() { return false; }
    public static final void joinThreadPool() {}
    public static final native void restoreCallingIdentity(long p0);
    public static final native void restoreCallingWorkSource(long p0);
    public static final native long setCallingWorkSourceUid(int p0);
    public static void setDumpDisabled(java.lang.String p0) {}
    private final native void setExtensionNative(android.os.IBinder p0);
    public static final native void setGlobalInheritRt(boolean p0);
    public static void setHeavyHitterWatcherConfig(boolean p0, int p1, float p2, com.android.internal.os.BinderCallHeavyHitterWatcher.BinderCallHeavyHitterListener p3) {}
    public static void setIsDirectlyHandlingTransactionOverride(boolean p0) {}
    public static void setObserver(com.android.internal.os.BinderInternal.Observer p0) {}
    @android.annotation.SystemApi
    public static void setProxyTransactListener(android.os.Binder.ProxyTransactListener p0) {}
    public static final native void setThreadStrictModePolicy(int p0);
    public static final void setTransactionCallback(android.os.IBinderCallback p0) {}
    public static void setWarnOnBlocking(boolean p0) {}
    public static void setWorkSourceProvider(com.android.internal.os.BinderInternal.WorkSourceProvider p0) {}
    public static final void transactionCallback(int p0, int p1, int p2, int p3) {}
    public static final <T extends java.lang.Object> T withCleanCallingIdentity(com.android.internal.util.FunctionalUtils.ThrowingSupplier<T> p0) { return null; }
    public static final void withCleanCallingIdentity(com.android.internal.util.FunctionalUtils.ThrowingRunnable p0) {}
    public void attachInterface(android.os.IInterface p0, java.lang.String p1) {}
    void doDump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    protected void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    public void dump(java.io.FileDescriptor p0, java.lang.String[] p1) {}
    public void dumpAsync(java.io.FileDescriptor p0, java.lang.String[] p1) {}
    public final native void forceDowngradeToSystemStability();
    public final android.os.IBinder getExtension() { return null; }
    public java.lang.String getInterfaceDescriptor() { return null; }
    public int getMaxTransactionId() { return 0; }
    public java.lang.String getTransactionName(int p0) { return null; }
    @android.annotation.SystemApi
    public int handleShellCommand(android.os.ParcelFileDescriptor p0, android.os.ParcelFileDescriptor p1, android.os.ParcelFileDescriptor p2, java.lang.String[] p3) { return 0; }
    public boolean isBinderAlive() { return false; }
    public void linkToDeath(android.os.IBinder.DeathRecipient p0, int p1) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    public final native void markVintfStability();
    public void onShellCommand(java.io.FileDescriptor p0, java.io.FileDescriptor p1, java.io.FileDescriptor p2, java.lang.String[] p3, android.os.ShellCallback p4, android.os.ResultReceiver p5) throws android.os.RemoteException {}
    protected boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
    protected void onUnhandledException(int p0, int p1, java.lang.Exception p2) {}
    public boolean pingBinder() { return false; }
    public android.os.IInterface queryLocalInterface(java.lang.String p0) { return null; }
    public final void setExtension(android.os.IBinder p0) {}
    public final native void setInheritRt(boolean p0);
    public void shellCommand(java.io.FileDescriptor p0, java.io.FileDescriptor p1, java.io.FileDescriptor p2, java.lang.String[] p3, android.os.ShellCallback p4, android.os.ResultReceiver p5) throws android.os.RemoteException {}
    public final boolean transact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
    public boolean unlinkToDeath(android.os.IBinder.DeathRecipient p0, int p1) { return false; }

    private static class NoImagePreloadHolder {
        private NoImagePreloadHolder() {}
    }

    public static class PropagateWorkSourceTransactListener implements android.os.Binder.ProxyTransactListener {
        public PropagateWorkSourceTransactListener() {}
        public void onTransactEnded(java.lang.Object p0) {}
        public java.lang.Object onTransactStarted(android.os.IBinder p0, int p1) { return null; }
    }

    @android.annotation.SystemApi
    public static interface ProxyTransactListener {
        public void onTransactEnded(java.lang.Object p0);
        public java.lang.Object onTransactStarted(android.os.IBinder p0, int p1);
        default public java.lang.Object onTransactStarted(android.os.IBinder p0, int p1, int p2) { return null; }
    }
}
