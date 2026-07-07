package com.android.internal.infra;

@java.lang.Deprecated
public abstract class AbstractRemoteService<S extends com.android.internal.infra.AbstractRemoteService<S, I>, I extends android.os.IInterface> implements android.os.IBinder.DeathRecipient {
    protected static final int LAST_PRIVATE_MSG = 2;
    private static final int MSG_BIND = 1;
    private static final int MSG_UNBIND = 2;
    public static final long PERMANENT_BOUND_TIMEOUT_MS = 0L;
    private static final int SERVICE_NOT_EXIST = -1;
    private final int mBindingFlags = 0;
    private boolean mBound;
    private boolean mCompleted;
    protected final android.content.ComponentName mComponentName = null;
    private boolean mConnecting;
    private final android.content.Context mContext = null;
    private boolean mDestroyed;
    protected final android.os.Handler mHandler = null;
    private final android.content.Intent mIntent = null;
    private long mNextUnbind;
    protected I mService;
    private final android.content.ServiceConnection mServiceConnection = null;
    private boolean mServiceDied;
    private int mServiceExitReason;
    private int mServiceExitSubReason;
    protected final java.lang.String mTag = null;
    protected final java.util.ArrayList<com.android.internal.infra.AbstractRemoteService.BasePendingRequest<S, I>> mUnfinishedRequests = null;
    private final int mUserId = 0;
    public final boolean mVerbose = false;
    private final com.android.internal.infra.AbstractRemoteService.VultureCallback<S> mVultureCallback = null;
    AbstractRemoteService(android.content.Context p0, java.lang.String p1, android.content.ComponentName p2, int p3, com.android.internal.infra.AbstractRemoteService.VultureCallback<S> p4, android.os.Handler p5, int p6, boolean p7) {}
    private void cancelScheduledUnbind() {}
    private boolean checkIfDestroyed() { return false; }
    private void handleBinderDied() {}
    private void handleDestroy() {}
    private void handleEnsureBound() {}
    private void handleEnsureUnbound() {}
    private void handleFinishRequest(com.android.internal.infra.AbstractRemoteService.BasePendingRequest<S, I> p0) {}
    private boolean handleIsBound() { return false; }
    private void handleOnConnectedStateChangedInternal(boolean p0) {}
    private void handleUnbind() {}
    private void scheduleUnbind(boolean p0) {}
    private void updateServicelicationExitInfo(android.content.ComponentName p0, int p1) {}
    public void binderDied() {}
    public final void destroy() {}
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    protected void executeAsyncRequest(com.android.internal.infra.AbstractRemoteService.AsyncRequest<I> p0) {}
    void finishRequest(com.android.internal.infra.AbstractRemoteService.BasePendingRequest<S, I> p0) {}
    public final android.content.ComponentName getComponentName() { return null; }
    protected long getRemoteRequestMillis() { return 0L; }
    public final I getServiceInterface() { return null; }
    protected abstract I getServiceInterface(android.os.IBinder p0);
    protected abstract long getTimeoutIdleBindMillis();
    abstract void handleBindFailure();
    protected void handleOnConnectedStateChanged(boolean p0) {}
    protected abstract void handleOnDestroy();
    protected final void handlePendingRequest(com.android.internal.infra.AbstractRemoteService.BasePendingRequest<S, I> p0) {}
    abstract void handlePendingRequestWhileUnBound(com.android.internal.infra.AbstractRemoteService.BasePendingRequest<S, I> p0);
    abstract void handlePendingRequests();
    public final boolean isDestroyed() { return false; }
    protected void scheduleAsyncRequest(com.android.internal.infra.AbstractRemoteService.AsyncRequest<I> p0) {}
    protected void scheduleBind() {}
    protected void scheduleRequest(com.android.internal.infra.AbstractRemoteService.BasePendingRequest<S, I> p0) {}
    protected void scheduleUnbind() {}
    public java.lang.String toString() { return null; }

    public static interface AsyncRequest<I extends android.os.IInterface> {
        public void run(I p0) throws android.os.RemoteException;
    }

    public static abstract class BasePendingRequest<S extends com.android.internal.infra.AbstractRemoteService<S, I>, I extends android.os.IInterface> implements java.lang.Runnable {
        boolean mCancelled;
        boolean mCompleted;
        protected final java.lang.Object mLock = null;
        protected final java.lang.String mTag = null;
        final java.lang.ref.WeakReference<S> mWeakService = null;
        BasePendingRequest(S p0) {}
        public boolean cancel() { return false; }
        protected final boolean finish() { return false; }
        protected final S getService() { return null; }
        protected final boolean isCancelledLocked() { return false; }
        protected boolean isFinal() { return false; }
        protected boolean isRequestCompleted() { return false; }
        void onCancel() {}
        protected void onFailed() {}
        void onFinished() {}
    }

    private static final class MyAsyncPendingRequest<S extends com.android.internal.infra.AbstractRemoteService<S, I>, I extends android.os.IInterface> extends com.android.internal.infra.AbstractRemoteService.BasePendingRequest<S, I> {
        private static final java.lang.String TAG = null;
        private final com.android.internal.infra.AbstractRemoteService.AsyncRequest<I> mRequest = null;
        protected MyAsyncPendingRequest(S p0, com.android.internal.infra.AbstractRemoteService.AsyncRequest<I> p1) { super(null); }
        public void run() {}
    }

    public static abstract class PendingRequest<S extends com.android.internal.infra.AbstractRemoteService<S, I>, I extends android.os.IInterface> extends com.android.internal.infra.AbstractRemoteService.BasePendingRequest<S, I> {
        private final android.os.Handler mServiceHandler = null;
        private final java.lang.Runnable mTimeoutTrigger = null;
        protected PendingRequest(S p0) { super(null); }
        final void onCancel() {}
        final void onFinished() {}
        protected abstract void onTimeout(S p0);
    }

    private class RemoteServiceConnection implements android.content.ServiceConnection {
        private RemoteServiceConnection(com.android.internal.infra.AbstractRemoteService p0) {}
        public void onBindingDied(android.content.ComponentName p0) {}
        public void onServiceConnected(android.content.ComponentName p0, android.os.IBinder p1) {}
        public void onServiceDisconnected(android.content.ComponentName p0) {}
    }

    public static interface VultureCallback<T extends java.lang.Object> {
        public void onServiceDied(T p0);
    }
}
