package android.media.tv.extension.oad;

public interface IOadListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.tv.extension.oad.IOadListener";
    public void onDownloadComplete(java.lang.String p0, long p1, long p2, android.os.Bundle p3) throws android.os.RemoteException;
    public void onDownloadFail() throws android.os.RemoteException;
    public void onDownloadProgress(int p0, long p1, long p2) throws android.os.RemoteException;
    public void onDownloadStarted() throws android.os.RemoteException;
    public void onFileFound(int p0) throws android.os.RemoteException;
    public void onFileNotFound() throws android.os.RemoteException;
    public void onScanProgress(int p0, int p1) throws android.os.RemoteException;
    public void onScanStarted() throws android.os.RemoteException;
    public void onSystemUpToDate() throws android.os.RemoteException;
    public void onUpgradeResult(int p0) throws android.os.RemoteException;

    public static class Default implements android.media.tv.extension.oad.IOadListener {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onDownloadComplete(java.lang.String p0, long p1, long p2, android.os.Bundle p3) throws android.os.RemoteException {}
        public void onDownloadFail() throws android.os.RemoteException {}
        public void onDownloadProgress(int p0, long p1, long p2) throws android.os.RemoteException {}
        public void onDownloadStarted() throws android.os.RemoteException {}
        public void onFileFound(int p0) throws android.os.RemoteException {}
        public void onFileNotFound() throws android.os.RemoteException {}
        public void onScanProgress(int p0, int p1) throws android.os.RemoteException {}
        public void onScanStarted() throws android.os.RemoteException {}
        public void onSystemUpToDate() throws android.os.RemoteException {}
        public void onUpgradeResult(int p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.extension.oad.IOadListener {
        static final int TRANSACTION_onDownloadComplete = 8;
        static final int TRANSACTION_onDownloadFail = 9;
        static final int TRANSACTION_onDownloadProgress = 7;
        static final int TRANSACTION_onDownloadStarted = 6;
        static final int TRANSACTION_onFileFound = 3;
        static final int TRANSACTION_onFileNotFound = 4;
        static final int TRANSACTION_onScanProgress = 2;
        static final int TRANSACTION_onScanStarted = 1;
        static final int TRANSACTION_onSystemUpToDate = 5;
        static final int TRANSACTION_onUpgradeResult = 10;
        public Stub() { super(); }
        public static android.media.tv.extension.oad.IOadListener asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.media.tv.extension.oad.IOadListener {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onDownloadComplete(java.lang.String p0, long p1, long p2, android.os.Bundle p3) throws android.os.RemoteException {}
            public void onDownloadFail() throws android.os.RemoteException {}
            public void onDownloadProgress(int p0, long p1, long p2) throws android.os.RemoteException {}
            public void onDownloadStarted() throws android.os.RemoteException {}
            public void onFileFound(int p0) throws android.os.RemoteException {}
            public void onFileNotFound() throws android.os.RemoteException {}
            public void onScanProgress(int p0, int p1) throws android.os.RemoteException {}
            public void onScanStarted() throws android.os.RemoteException {}
            public void onSystemUpToDate() throws android.os.RemoteException {}
            public void onUpgradeResult(int p0) throws android.os.RemoteException {}
        }
    }
}
