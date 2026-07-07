package com.android.internal.infra;

@java.lang.Deprecated
public abstract class AbstractMultiplePendingRequestsRemoteService<S extends com.android.internal.infra.AbstractMultiplePendingRequestsRemoteService<S, I>, I extends android.os.IInterface> extends com.android.internal.infra.AbstractRemoteService<S, I> {
    private static final long PENDING_REQUEST_TIMEOUT_MS = 5000L;
    private final int mInitialCapacity = 0;
    protected final java.util.List<com.android.internal.infra.AbstractRemoteService.BasePendingRequest<S, I>> mPendingRequests = null;
    public AbstractMultiplePendingRequestsRemoteService(android.content.Context p0, java.lang.String p1, android.content.ComponentName p2, int p3, com.android.internal.infra.AbstractRemoteService.VultureCallback<S> p4, android.os.Handler p5, int p6, boolean p7, int p8) { super(null, null, null, 0, null, null, 0, false); }
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    final void handleBindFailure() {}
    protected void handleOnDestroy() {}
    void handlePendingRequestWhileUnBound(com.android.internal.infra.AbstractRemoteService.BasePendingRequest<S, I> p0) {}
    void handlePendingRequests() {}
}
