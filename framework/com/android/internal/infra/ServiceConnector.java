package com.android.internal.infra;

public interface ServiceConnector<I extends android.os.IInterface> {
    public com.android.internal.infra.AndroidFuture<I> connect();
    public com.android.internal.infra.AndroidFuture<java.lang.Void> post(com.android.internal.infra.ServiceConnector.VoidJob<I> p0);
    public <R extends java.lang.Object> com.android.internal.infra.AndroidFuture<R> postAsync(com.android.internal.infra.ServiceConnector.Job<I, java.util.concurrent.CompletableFuture<R>> p0);
    public <R extends java.lang.Object> com.android.internal.infra.AndroidFuture<R> postForResult(com.android.internal.infra.ServiceConnector.Job<I, R> p0);
    public boolean run(com.android.internal.infra.ServiceConnector.VoidJob<I> p0);
    public void setServiceLifecycleCallbacks(com.android.internal.infra.ServiceConnector.ServiceLifecycleCallbacks<I> p0);
    public void unbind();

    public static class Impl<I extends android.os.IInterface> extends java.util.ArrayDeque<com.android.internal.infra.ServiceConnector.Job<I, ?>> implements com.android.internal.infra.ServiceConnector<I>, android.content.ServiceConnection, android.os.IBinder.DeathRecipient, java.lang.Runnable {
        static final boolean DEBUG = false;
        private static final long DEFAULT_DISCONNECT_TIMEOUT_MS = 15000L;
        private static final long DEFAULT_REQUEST_TIMEOUT_MS = 30000L;
        final java.lang.String LOG_TAG = null;
        private final java.util.function.Function<android.os.IBinder, I> mBinderAsInterface = null;
        private boolean mBinding;
        private final int mBindingFlags = 0;
        protected final android.content.Context mContext = null;
        protected final java.util.concurrent.Executor mExecutor = null;
        private final android.os.Handler mHandler = null;
        private final android.content.Intent mIntent = null;
        private final android.os.Handler mMainHandler = null;
        private final java.util.Queue<com.android.internal.infra.ServiceConnector.Job<I, ?>> mQueue = null;
        private volatile I mService;
        private final android.content.ServiceConnection mServiceConnection = null;
        private com.android.internal.infra.ServiceConnector.Impl<I>.CompletionAwareJob<I, I> mServiceConnectionFutureCache;
        private volatile com.android.internal.infra.ServiceConnector.ServiceLifecycleCallbacks<I> mServiceLifecycleCallbacks;
        private final java.lang.Runnable mTimeoutDisconnect = null;
        private boolean mUnbinding;
        private final java.util.List<com.android.internal.infra.ServiceConnector.Impl<I>.CompletionAwareJob<I, ?>> mUnfinishedJobs = null;
        public Impl(android.content.Context p0, android.content.Intent p1, int p2, int p3, java.util.function.Function<android.os.IBinder, I> p4) { super(); }
        static <BASE extends java.lang.Object, T extends BASE> T castOrNull(BASE p0, java.lang.Class<T> p1) { return null; }
        private void dispatchOnServiceConnectionStatusChanged(I p0, boolean p1) {}
        private void enqueue(com.android.internal.infra.ServiceConnector.Impl<I>.CompletionAwareJob<I, ?> p0) {}
        private boolean enqueue(com.android.internal.infra.ServiceConnector.Job<I, ?> p0) { return false; }
        private boolean isBound() { return false; }
        private void logTrace() {}
        private void maybeScheduleUnbindTimeout() {}
        private void onTimeout() {}
        private void processQueue() {}
        private void scheduleUnbindTimeout() {}
        private java.lang.String stateToString() { return null; }
        protected boolean bindService(android.content.ServiceConnection p0) { return false; }
        protected I binderAsInterface(android.os.IBinder p0) { return null; }
        public void binderDied() {}
        protected void cancelPendingJobs() {}
        protected void cancelTimeout() {}
        void completeExceptionally(com.android.internal.infra.ServiceConnector.Job<?, ?> p0, java.lang.Throwable p1) {}
        public com.android.internal.infra.AndroidFuture<I> connect() { return null; }
        protected void dispatchOnBinderDied() {}
        public void dump(java.lang.String p0, java.io.PrintWriter p1) {}
        void enqueueJobThread(com.android.internal.infra.ServiceConnector.Job<I, ?> p0) {}
        protected long getAutoDisconnectTimeoutMs() { return 0L; }
        protected android.os.Handler getJobHandler() { return null; }
        protected long getRequestTimeoutMs() { return 0L; }
        public void onBindingDied(android.content.ComponentName p0) {}
        public void onServiceConnected(android.content.ComponentName p0, android.os.IBinder p1) {}
        protected void onServiceConnectionStatusChanged(I p0, boolean p1) {}
        public void onServiceDisconnected(android.content.ComponentName p0) {}
        protected void onServiceUnbound() {}
        public com.android.internal.infra.AndroidFuture<java.lang.Void> post(com.android.internal.infra.ServiceConnector.VoidJob<I> p0) { return null; }
        public <R extends java.lang.Object> com.android.internal.infra.AndroidFuture<R> postAsync(com.android.internal.infra.ServiceConnector.Job<I, java.util.concurrent.CompletableFuture<R>> p0) { return null; }
        public <R extends java.lang.Object> com.android.internal.infra.ServiceConnector.Impl<I>.CompletionAwareJob<I, R> postForResult(com.android.internal.infra.ServiceConnector.Job<I, R> p0) { return null; }
        public void run() {}
        public boolean run(com.android.internal.infra.ServiceConnector.VoidJob<I> p0) { return false; }
        public void setServiceLifecycleCallbacks(com.android.internal.infra.ServiceConnector.ServiceLifecycleCallbacks<I> p0) {}
        public java.lang.String toString() { return null; }
        public void unbind() {}
        void unbindJobThread() {}

        class CompletionAwareJob<II extends java.lang.Object, R extends java.lang.Object> extends com.android.internal.infra.AndroidFuture<R> implements com.android.internal.infra.ServiceConnector.Job<II, R>, java.util.function.BiConsumer<R, java.lang.Throwable> {
            boolean mAsync;
            private java.lang.String mDebugName;
            com.android.internal.infra.ServiceConnector.Job<II, R> mDelegate;
            CompletionAwareJob(com.android.internal.infra.ServiceConnector.Impl p0) { super(); }
            public void accept(R p0, java.lang.Throwable p1) {}
            public boolean cancel(boolean p0) { return false; }
            protected void onCompleted(R p0, java.lang.Throwable p1) {}
            public R run(II p0) throws java.lang.Exception { return null; }
            public java.lang.String toString() { return null; }
        }
    }

    @java.lang.FunctionalInterface
    public static interface Job<II extends java.lang.Object, R extends java.lang.Object> {
        public R run(II p0) throws java.lang.Exception;
    }

    public static class NoOp<T extends android.os.IInterface> extends com.android.internal.infra.AndroidFuture<java.lang.Object> implements com.android.internal.infra.ServiceConnector<T> {
        public NoOp() { super(); }
        public com.android.internal.infra.AndroidFuture<T> connect() { return null; }
        public com.android.internal.infra.AndroidFuture<java.lang.Void> post(com.android.internal.infra.ServiceConnector.VoidJob<T> p0) { return null; }
        public <R extends java.lang.Object> com.android.internal.infra.AndroidFuture<R> postAsync(com.android.internal.infra.ServiceConnector.Job<T, java.util.concurrent.CompletableFuture<R>> p0) { return null; }
        public <R extends java.lang.Object> com.android.internal.infra.AndroidFuture<R> postForResult(com.android.internal.infra.ServiceConnector.Job<T, R> p0) { return null; }
        public boolean run(com.android.internal.infra.ServiceConnector.VoidJob<T> p0) { return false; }
        public void setServiceLifecycleCallbacks(com.android.internal.infra.ServiceConnector.ServiceLifecycleCallbacks<T> p0) {}
        public void unbind() {}
    }

    public static interface ServiceLifecycleCallbacks<II extends android.os.IInterface> {
        default public void onBinderDied() {}
        default public void onConnected(II p0) {}
        default public void onDisconnected(II p0) {}
    }

    @java.lang.FunctionalInterface
    public static interface VoidJob<II extends java.lang.Object> extends com.android.internal.infra.ServiceConnector.Job<II, java.lang.Void> {
        default public java.lang.Void run(II p0) throws java.lang.Exception { return null; }
        public void runNoResult(II p0) throws java.lang.Exception;
    }
}
