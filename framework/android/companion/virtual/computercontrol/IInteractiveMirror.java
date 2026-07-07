package android.companion.virtual.computercontrol;

public interface IInteractiveMirror extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.companion.virtual.computercontrol.IInteractiveMirror";
    public void close() throws android.os.RemoteException;
    public void setHostDisplayId(int p0) throws android.os.RemoteException;
    public void setInteractive(boolean p0) throws android.os.RemoteException;
    public void updateInsets(android.graphics.Insets p0) throws android.os.RemoteException;
    public void updateScale(float p0) throws android.os.RemoteException;

    public static class Default implements android.companion.virtual.computercontrol.IInteractiveMirror {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void close() throws android.os.RemoteException {}
        public void setHostDisplayId(int p0) throws android.os.RemoteException {}
        public void setInteractive(boolean p0) throws android.os.RemoteException {}
        public void updateInsets(android.graphics.Insets p0) throws android.os.RemoteException {}
        public void updateScale(float p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.companion.virtual.computercontrol.IInteractiveMirror {
        static final int TRANSACTION_close = 5;
        static final int TRANSACTION_setHostDisplayId = 3;
        static final int TRANSACTION_setInteractive = 1;
        static final int TRANSACTION_updateInsets = 4;
        static final int TRANSACTION_updateScale = 2;
        public Stub() { super(); }
        public static android.companion.virtual.computercontrol.IInteractiveMirror asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.companion.virtual.computercontrol.IInteractiveMirror {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void close() throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void setHostDisplayId(int p0) throws android.os.RemoteException {}
            public void setInteractive(boolean p0) throws android.os.RemoteException {}
            public void updateInsets(android.graphics.Insets p0) throws android.os.RemoteException {}
            public void updateScale(float p0) throws android.os.RemoteException {}
        }
    }
}
