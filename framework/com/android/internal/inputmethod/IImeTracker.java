package com.android.internal.inputmethod;

public interface IImeTracker extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.inputmethod.IImeTracker";
    public void finishTrackingPendingRequests(com.android.internal.infra.AndroidFuture<java.lang.Void> p0) throws android.os.RemoteException;
    public void onCancelled(android.view.inputmethod.ImeTracker.Token p0, int p1) throws android.os.RemoteException;
    public void onDispatched(android.view.inputmethod.ImeTracker.Token p0) throws android.os.RemoteException;
    public void onFailed(android.view.inputmethod.ImeTracker.Token p0, int p1) throws android.os.RemoteException;
    public void onHidden(android.view.inputmethod.ImeTracker.Token p0) throws android.os.RemoteException;
    public void onProgress(android.view.inputmethod.ImeTracker.Token p0, int p1) throws android.os.RemoteException;
    public void onShown(android.view.inputmethod.ImeTracker.Token p0) throws android.os.RemoteException;
    public void onStart(android.view.inputmethod.ImeTracker.Token p0, int p1, int p2, int p3, int p4, boolean p5, int p6, int p7, long p8, long p9) throws android.os.RemoteException;
    public void waitUntilNoPendingRequests(com.android.internal.infra.AndroidFuture<java.lang.Void> p0, long p1) throws android.os.RemoteException;

    public static class Default implements com.android.internal.inputmethod.IImeTracker {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void finishTrackingPendingRequests(com.android.internal.infra.AndroidFuture<java.lang.Void> p0) throws android.os.RemoteException {}
        public void onCancelled(android.view.inputmethod.ImeTracker.Token p0, int p1) throws android.os.RemoteException {}
        public void onDispatched(android.view.inputmethod.ImeTracker.Token p0) throws android.os.RemoteException {}
        public void onFailed(android.view.inputmethod.ImeTracker.Token p0, int p1) throws android.os.RemoteException {}
        public void onHidden(android.view.inputmethod.ImeTracker.Token p0) throws android.os.RemoteException {}
        public void onProgress(android.view.inputmethod.ImeTracker.Token p0, int p1) throws android.os.RemoteException {}
        public void onShown(android.view.inputmethod.ImeTracker.Token p0) throws android.os.RemoteException {}
        public void onStart(android.view.inputmethod.ImeTracker.Token p0, int p1, int p2, int p3, int p4, boolean p5, int p6, int p7, long p8, long p9) throws android.os.RemoteException {}
        public void waitUntilNoPendingRequests(com.android.internal.infra.AndroidFuture<java.lang.Void> p0, long p1) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.inputmethod.IImeTracker {
        static final int TRANSACTION_finishTrackingPendingRequests = 9;
        static final int TRANSACTION_onCancelled = 4;
        static final int TRANSACTION_onDispatched = 7;
        static final int TRANSACTION_onFailed = 3;
        static final int TRANSACTION_onHidden = 6;
        static final int TRANSACTION_onProgress = 2;
        static final int TRANSACTION_onShown = 5;
        static final int TRANSACTION_onStart = 1;
        static final int TRANSACTION_waitUntilNoPendingRequests = 8;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static com.android.internal.inputmethod.IImeTracker asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        protected void finishTrackingPendingRequests_enforcePermission() throws java.lang.SecurityException {}
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void waitUntilNoPendingRequests_enforcePermission() throws java.lang.SecurityException {}

        private static final class Proxy implements com.android.internal.inputmethod.IImeTracker {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void finishTrackingPendingRequests(com.android.internal.infra.AndroidFuture<java.lang.Void> p0) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onCancelled(android.view.inputmethod.ImeTracker.Token p0, int p1) throws android.os.RemoteException {}
            public void onDispatched(android.view.inputmethod.ImeTracker.Token p0) throws android.os.RemoteException {}
            public void onFailed(android.view.inputmethod.ImeTracker.Token p0, int p1) throws android.os.RemoteException {}
            public void onHidden(android.view.inputmethod.ImeTracker.Token p0) throws android.os.RemoteException {}
            public void onProgress(android.view.inputmethod.ImeTracker.Token p0, int p1) throws android.os.RemoteException {}
            public void onShown(android.view.inputmethod.ImeTracker.Token p0) throws android.os.RemoteException {}
            public void onStart(android.view.inputmethod.ImeTracker.Token p0, int p1, int p2, int p3, int p4, boolean p5, int p6, int p7, long p8, long p9) throws android.os.RemoteException {}
            public void waitUntilNoPendingRequests(com.android.internal.infra.AndroidFuture<java.lang.Void> p0, long p1) throws android.os.RemoteException {}
        }
    }
}
