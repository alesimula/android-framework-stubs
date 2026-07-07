package com.android.internal.inputmethod;

public interface IImeSwitcherMenuListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.inputmethod.IImeSwitcherMenuListener";
    public void onImeAndSubtypeSelected(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public void onVisibilityChanged(boolean p0, int p1, int p2) throws android.os.RemoteException;

    public static class Default implements com.android.internal.inputmethod.IImeSwitcherMenuListener {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onImeAndSubtypeSelected(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
        public void onVisibilityChanged(boolean p0, int p1, int p2) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.inputmethod.IImeSwitcherMenuListener {
        static final int TRANSACTION_onImeAndSubtypeSelected = 2;
        static final int TRANSACTION_onVisibilityChanged = 1;
        public Stub() { super(); }
        public static com.android.internal.inputmethod.IImeSwitcherMenuListener asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements com.android.internal.inputmethod.IImeSwitcherMenuListener {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onImeAndSubtypeSelected(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
            public void onVisibilityChanged(boolean p0, int p1, int p2) throws android.os.RemoteException {}
        }
    }
}
