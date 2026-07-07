package com.android.internal.util;

public class ObservableServiceConnection<T extends java.lang.Object> implements android.content.ServiceConnection {
    public static final int DISCONNECT_REASON_BINDING_DIED = 3;
    public static final int DISCONNECT_REASON_DISCONNECTED = 2;
    public static final int DISCONNECT_REASON_NONE = 0;
    public static final int DISCONNECT_REASON_NULL_BINDING = 1;
    public static final int DISCONNECT_REASON_UNBIND = 4;
    private boolean mBoundCalled;
    private final com.android.internal.util.CallbackRegistry<com.android.internal.util.ObservableServiceConnection.Callback<T>, com.android.internal.util.ObservableServiceConnection<T>, T> mCallbackRegistry = null;
    private final android.content.Context mContext = null;
    private final java.util.concurrent.Executor mExecutor = null;
    private final int mFlags = 0;
    private int mLastDisconnectReason;
    private final java.lang.Object mLock = null;
    private T mService;
    private final android.content.Intent mServiceIntent = null;
    private final com.android.internal.util.ObservableServiceConnection.ServiceTransformer<T> mTransformer = null;
    public ObservableServiceConnection(android.content.Context p0, java.util.concurrent.Executor p1, com.android.internal.util.ObservableServiceConnection.ServiceTransformer<T> p2, android.content.Intent p3, int p4) {}
    private void onDisconnected(int p0) {}
    public void addCallback(com.android.internal.util.ObservableServiceConnection.Callback<T> p0) {}
    public boolean bind() { return false; }
    public void execute(java.lang.Runnable p0) {}
    public final void onBindingDied(android.content.ComponentName p0) {}
    public final void onNullBinding(android.content.ComponentName p0) {}
    public final void onServiceConnected(android.content.ComponentName p0, android.os.IBinder p1) {}
    public final void onServiceDisconnected(android.content.ComponentName p0) {}
    public void removeCallback(com.android.internal.util.ObservableServiceConnection.Callback<T> p0) {}
    public void unbind() {}

    public static interface Callback<T extends java.lang.Object> {
        public void onConnected(com.android.internal.util.ObservableServiceConnection<T> p0, T p1);
        public void onDisconnected(com.android.internal.util.ObservableServiceConnection<T> p0, int p1);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DisconnectReason {
    }

    public static interface ServiceTransformer<T extends java.lang.Object> {
        public T convert(android.os.IBinder p0);
    }
}
