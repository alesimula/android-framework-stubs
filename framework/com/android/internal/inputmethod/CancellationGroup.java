package com.android.internal.inputmethod;

public final class CancellationGroup {
    private boolean mCanceled;
    private java.util.ArrayList<java.util.concurrent.CompletableFuture<?>> mFutureList;
    private final java.lang.Object mLock = null;
    public CancellationGroup() {}
    public void cancelAll() {}
    public boolean isCanceled() { return false; }
    boolean tryRegisterFutureOrCancelImmediately(java.util.concurrent.CompletableFuture<?> p0) { return false; }
    void unregisterFuture(java.util.concurrent.CompletableFuture<?> p0) {}
}
