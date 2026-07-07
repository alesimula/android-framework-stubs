package android.service.autofill.augmented;

public interface IFillCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.autofill.augmented.IFillCallback";
    public void cancel() throws android.os.RemoteException;
    public boolean isCompleted() throws android.os.RemoteException;
    public void onCancellable(android.os.ICancellationSignal p0) throws android.os.RemoteException;
    public void onSuccess(java.util.List<android.service.autofill.Dataset> p0, android.os.Bundle p1, boolean p2) throws android.os.RemoteException;

    public static class Default implements android.service.autofill.augmented.IFillCallback {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void cancel() throws android.os.RemoteException {}
        public boolean isCompleted() throws android.os.RemoteException { return false; }
        public void onCancellable(android.os.ICancellationSignal p0) throws android.os.RemoteException {}
        public void onSuccess(java.util.List<android.service.autofill.Dataset> p0, android.os.Bundle p1, boolean p2) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.service.autofill.augmented.IFillCallback {
        static final int TRANSACTION_cancel = 4;
        static final int TRANSACTION_isCompleted = 3;
        static final int TRANSACTION_onCancellable = 1;
        static final int TRANSACTION_onSuccess = 2;
        public Stub() { super(); }
        public static android.service.autofill.augmented.IFillCallback asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.service.autofill.augmented.IFillCallback {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void cancel() throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public boolean isCompleted() throws android.os.RemoteException { return false; }
            public void onCancellable(android.os.ICancellationSignal p0) throws android.os.RemoteException {}
            public void onSuccess(java.util.List<android.service.autofill.Dataset> p0, android.os.Bundle p1, boolean p2) throws android.os.RemoteException {}
        }
    }
}
