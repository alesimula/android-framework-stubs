package com.android.internal.inputmethod;

public class ImeTrackerServiceWrapper {
    private static final long TIMEOUT_MS = 10000L;
    private com.android.internal.inputmethod.IImeTracker mService;
    public ImeTrackerServiceWrapper(com.android.internal.inputmethod.IImeTracker p0) {}
    public void finishTrackingPendingRequests() {}
    public void onCancelled(android.view.inputmethod.ImeTracker.Token p0, int p1) {}
    public void onDispatched(android.view.inputmethod.ImeTracker.Token p0) {}
    public void onFailed(android.view.inputmethod.ImeTracker.Token p0, int p1) {}
    public void onHidden(android.view.inputmethod.ImeTracker.Token p0) {}
    public void onProgress(android.view.inputmethod.ImeTracker.Token p0, int p1) {}
    public void onShown(android.view.inputmethod.ImeTracker.Token p0) {}
    public void onStart(android.view.inputmethod.ImeTracker.Token p0, int p1, int p2, int p3, int p4, boolean p5, int p6, int p7, long p8, long p9) {}
    public void waitUntilNoPendingRequests(long p0) {}
}
