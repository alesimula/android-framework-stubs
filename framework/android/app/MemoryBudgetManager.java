package android.app;

public final class MemoryBudgetManager {
    public static final long LIMIT_IS_DISABLED = -1L;
    private final java.util.Map<android.app.MemoryBudgetManager.OnOverBudgetListener, java.lang.ref.WeakReference<android.os.Looper>> mPackageWatcherLooper = null;
    private final java.util.Map<android.app.MemoryBudgetManager.OnOverBudgetListener, java.lang.Long> mPackageWatchers = null;
    private final java.util.Map<android.app.MemoryBudgetManager.OnOverBudgetListener, java.lang.ref.WeakReference<android.os.Looper>> mProcessWatcherLooper = null;
    private final java.util.Map<android.app.MemoryBudgetManager.OnOverBudgetListener, java.lang.Long> mProcessWatchers = null;
    private final android.app.IMemoryBudgetService mService = null;
    public MemoryBudgetManager(android.app.IMemoryBudgetService p0) {}
    private static native long nativeGetPackageBudget();
    private static native long nativeGetPackageCurrentUsageBytes();
    private static native long nativeGetProcessBudget();
    private static native long nativeGetProcessCurrentUsageBytes();
    private static native long nativeRegisterPackageBudgetWatcher(android.app.MemoryBudgetManager.OnOverBudgetListener p0);
    private static native long nativeRegisterProcessBudgetWatcher(android.app.MemoryBudgetManager.OnOverBudgetListener p0);
    private static native void nativeUnregisterBudgetWatcher(long p0);
    private void registerPackageOverBudgetListenerUnchecked(android.app.MemoryBudgetManager.OnOverBudgetListener p0) {}
    private void registerProcessOverBudgetListenerUnchecked(android.app.MemoryBudgetManager.OnOverBudgetListener p0) {}
    private void unregisterPackageOverBudgetListenerUnchecked(android.app.MemoryBudgetManager.OnOverBudgetListener p0) {}
    private void unregisterProcessOverBudgetListenerUnchecked(android.app.MemoryBudgetManager.OnOverBudgetListener p0) {}
    public void clearPackageBudget() {}
    public void clearProcessBudget() {}
    public long getPackageBudgetBytes() { return 0L; }
    public long getPackageCurrentUsageBytes() { return 0L; }
    public long getProcessBudgetBytes() { return 0L; }
    public long getProcessCurrentUsageBytes() { return 0L; }
    public void registerPackageOverBudgetListener(android.os.Looper p0, android.app.MemoryBudgetManager.OnOverBudgetListener p1) {}
    public void registerProcessOverBudgetListener(android.os.Looper p0, android.app.MemoryBudgetManager.OnOverBudgetListener p1) {}
    public void setPackageBudgetBytes(long p0) {}
    public void setProcessBudgetBytes(long p0) {}
    public void unregisterPackageOverBudgetListener(android.app.MemoryBudgetManager.OnOverBudgetListener p0) {}
    public void unregisterProcessOverBudgetListener(android.app.MemoryBudgetManager.OnOverBudgetListener p0) {}

    public static interface OnOverBudgetListener {
        public void onOverBudget(long p0);
    }
}
