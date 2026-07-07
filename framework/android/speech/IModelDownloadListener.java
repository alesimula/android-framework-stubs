package android.speech;

public interface IModelDownloadListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.speech.IModelDownloadListener";
    public void onError(int p0) throws android.os.RemoteException;
    public void onProgress(int p0) throws android.os.RemoteException;
    public void onScheduled() throws android.os.RemoteException;
    public void onSuccess() throws android.os.RemoteException;

    public static class Default implements android.speech.IModelDownloadListener {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onError(int p0) throws android.os.RemoteException {}
        public void onProgress(int p0) throws android.os.RemoteException {}
        public void onScheduled() throws android.os.RemoteException {}
        public void onSuccess() throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.speech.IModelDownloadListener {
        static final int TRANSACTION_onError = 4;
        static final int TRANSACTION_onProgress = 1;
        static final int TRANSACTION_onScheduled = 3;
        static final int TRANSACTION_onSuccess = 2;
        public Stub() { super(); }
        public static android.speech.IModelDownloadListener asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.speech.IModelDownloadListener {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onError(int p0) throws android.os.RemoteException {}
            public void onProgress(int p0) throws android.os.RemoteException {}
            public void onScheduled() throws android.os.RemoteException {}
            public void onSuccess() throws android.os.RemoteException {}
        }
    }
}
