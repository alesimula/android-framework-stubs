package com.android.internal.inputmethod;

public interface IAccessibilityInputMethodSession extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.inputmethod.IAccessibilityInputMethodSession";
    public void finishInput() throws android.os.RemoteException;
    public void finishSession() throws android.os.RemoteException;
    public void invalidateInput(android.view.inputmethod.EditorInfo p0, com.android.internal.inputmethod.IRemoteAccessibilityInputConnection p1, int p2) throws android.os.RemoteException;
    public void updateSelection(int p0, int p1, int p2, int p3, int p4, int p5) throws android.os.RemoteException;

    public static class Default implements com.android.internal.inputmethod.IAccessibilityInputMethodSession {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void finishInput() throws android.os.RemoteException {}
        public void finishSession() throws android.os.RemoteException {}
        public void invalidateInput(android.view.inputmethod.EditorInfo p0, com.android.internal.inputmethod.IRemoteAccessibilityInputConnection p1, int p2) throws android.os.RemoteException {}
        public void updateSelection(int p0, int p1, int p2, int p3, int p4, int p5) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.inputmethod.IAccessibilityInputMethodSession {
        static final int TRANSACTION_finishInput = 2;
        static final int TRANSACTION_finishSession = 3;
        static final int TRANSACTION_invalidateInput = 4;
        static final int TRANSACTION_updateSelection = 1;
        public Stub() { super(); }
        public static com.android.internal.inputmethod.IAccessibilityInputMethodSession asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements com.android.internal.inputmethod.IAccessibilityInputMethodSession {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void finishInput() throws android.os.RemoteException {}
            public void finishSession() throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void invalidateInput(android.view.inputmethod.EditorInfo p0, com.android.internal.inputmethod.IRemoteAccessibilityInputConnection p1, int p2) throws android.os.RemoteException {}
            public void updateSelection(int p0, int p1, int p2, int p3, int p4, int p5) throws android.os.RemoteException {}
        }
    }
}
