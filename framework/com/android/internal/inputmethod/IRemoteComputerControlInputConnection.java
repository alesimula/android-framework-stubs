package com.android.internal.inputmethod;

public interface IRemoteComputerControlInputConnection extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.inputmethod.IRemoteComputerControlInputConnection";
    public void commitText(com.android.internal.inputmethod.InputConnectionCommandHeader p0, java.lang.CharSequence p1, int p2) throws android.os.RemoteException;
    public void performEditorAction(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1) throws android.os.RemoteException;
    public void replaceText(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2, java.lang.CharSequence p3, int p4) throws android.os.RemoteException;
    public void sendKeyEvent(com.android.internal.inputmethod.InputConnectionCommandHeader p0, android.view.KeyEvent p1) throws android.os.RemoteException;

    public static class Default implements com.android.internal.inputmethod.IRemoteComputerControlInputConnection {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void commitText(com.android.internal.inputmethod.InputConnectionCommandHeader p0, java.lang.CharSequence p1, int p2) throws android.os.RemoteException {}
        public void performEditorAction(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1) throws android.os.RemoteException {}
        public void replaceText(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2, java.lang.CharSequence p3, int p4) throws android.os.RemoteException {}
        public void sendKeyEvent(com.android.internal.inputmethod.InputConnectionCommandHeader p0, android.view.KeyEvent p1) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.inputmethod.IRemoteComputerControlInputConnection {
        static final int TRANSACTION_commitText = 1;
        static final int TRANSACTION_performEditorAction = 4;
        static final int TRANSACTION_replaceText = 2;
        static final int TRANSACTION_sendKeyEvent = 3;
        public Stub() { super(); }
        public static com.android.internal.inputmethod.IRemoteComputerControlInputConnection asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements com.android.internal.inputmethod.IRemoteComputerControlInputConnection {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void commitText(com.android.internal.inputmethod.InputConnectionCommandHeader p0, java.lang.CharSequence p1, int p2) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void performEditorAction(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1) throws android.os.RemoteException {}
            public void replaceText(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2, java.lang.CharSequence p3, int p4) throws android.os.RemoteException {}
            public void sendKeyEvent(com.android.internal.inputmethod.InputConnectionCommandHeader p0, android.view.KeyEvent p1) throws android.os.RemoteException {}
        }
    }
}
