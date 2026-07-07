package com.android.internal.inputmethod;

public interface IInputContentUriToken extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.inputmethod.IInputContentUriToken";
    public void release() throws android.os.RemoteException;
    public void take() throws android.os.RemoteException;

    public static class Default implements com.android.internal.inputmethod.IInputContentUriToken {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void release() throws android.os.RemoteException {}
        public void take() throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.inputmethod.IInputContentUriToken {
        static final int TRANSACTION_release = 2;
        static final int TRANSACTION_take = 1;
        public Stub() { super(); }
        public static com.android.internal.inputmethod.IInputContentUriToken asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements com.android.internal.inputmethod.IInputContentUriToken {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void release() throws android.os.RemoteException {}
            public void take() throws android.os.RemoteException {}
        }
    }
}
