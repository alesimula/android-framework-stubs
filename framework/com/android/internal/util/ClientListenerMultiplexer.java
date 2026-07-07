package com.android.internal.util;

public final class ClientListenerMultiplexer<TListener extends java.lang.Object, TService extends java.lang.Object, TCallback extends java.lang.Object> {
    private static final java.lang.String TAG = "ClientListenerMux";
    private boolean mIsCallbackRegistered;
    private final java.util.concurrent.CopyOnWriteArrayList<com.android.internal.util.ClientListenerMultiplexer.ListenerInfo<TListener>> mListeners = null;
    private final java.lang.Object mLock = null;
    private final com.android.internal.util.ClientListenerMultiplexer.ServiceRegistrar<TService, TCallback> mRegistrar = null;
    private final com.android.internal.util.ClientListenerMultiplexer.ServiceUnregistrar<TService, TCallback> mUnregistrar = null;
    public ClientListenerMultiplexer(TService p0, TCallback p1, com.android.internal.util.ClientListenerMultiplexer.ServiceRegistrar<TService, TCallback> p2, com.android.internal.util.ClientListenerMultiplexer.ServiceUnregistrar<TService, TCallback> p3) {}
    public void addListener(java.util.concurrent.Executor p0, TListener p1) {}
    public void forEachListener(java.util.function.Consumer<TListener> p0) {}
    public int getListenerCount() { return 0; }
    public boolean hasListeners() { return false; }
    public void removeListener(TListener p0) {}

    private static class ListenerInfo<TListener extends java.lang.Object> {
        final java.util.concurrent.Executor mExecutor = null;
        ListenerInfo(TListener p0, java.util.concurrent.Executor p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    @java.lang.FunctionalInterface
    public static interface ServiceRegistrar<TService extends java.lang.Object, TCallback extends java.lang.Object> {
        public void register(TService p0, TCallback p1) throws android.os.RemoteException;
    }

    @java.lang.FunctionalInterface
    public static interface ServiceUnregistrar<TService extends java.lang.Object, TCallback extends java.lang.Object> {
        public void unregister(TService p0, TCallback p1) throws android.os.RemoteException;
    }
}
