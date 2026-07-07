package android.media.tv.extension.scan;

public interface IScanInterface extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.tv.extension.scan.IScanInterface";
    public android.os.IBinder createSession(int p0, java.lang.String p1, java.lang.String p2, android.media.tv.extension.scan.IScanListener p3, android.os.Bundle p4) throws android.os.RemoteException;
    public android.os.Bundle getParameters(int p0, java.lang.String p1, java.lang.String p2, android.os.Bundle p3) throws android.os.RemoteException;
    public void launchScanAction(int p0) throws android.os.RemoteException;
    public void registerScanGlobalListener(android.media.tv.extension.scan.IScanGlobalListener p0) throws android.os.RemoteException;
    public void showScanSettings() throws android.os.RemoteException;
    public void unregisterScanGlobalListener(android.media.tv.extension.scan.IScanGlobalListener p0) throws android.os.RemoteException;

    public static class Default implements android.media.tv.extension.scan.IScanInterface {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public android.os.IBinder createSession(int p0, java.lang.String p1, java.lang.String p2, android.media.tv.extension.scan.IScanListener p3, android.os.Bundle p4) throws android.os.RemoteException { return null; }
        public android.os.Bundle getParameters(int p0, java.lang.String p1, java.lang.String p2, android.os.Bundle p3) throws android.os.RemoteException { return null; }
        public void launchScanAction(int p0) throws android.os.RemoteException {}
        public void registerScanGlobalListener(android.media.tv.extension.scan.IScanGlobalListener p0) throws android.os.RemoteException {}
        public void showScanSettings() throws android.os.RemoteException {}
        public void unregisterScanGlobalListener(android.media.tv.extension.scan.IScanGlobalListener p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.extension.scan.IScanInterface {
        static final int TRANSACTION_createSession = 1;
        static final int TRANSACTION_getParameters = 2;
        static final int TRANSACTION_launchScanAction = 6;
        static final int TRANSACTION_registerScanGlobalListener = 3;
        static final int TRANSACTION_showScanSettings = 5;
        static final int TRANSACTION_unregisterScanGlobalListener = 4;
        public Stub() { super(); }
        public static android.media.tv.extension.scan.IScanInterface asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.media.tv.extension.scan.IScanInterface {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public android.os.IBinder createSession(int p0, java.lang.String p1, java.lang.String p2, android.media.tv.extension.scan.IScanListener p3, android.os.Bundle p4) throws android.os.RemoteException { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public android.os.Bundle getParameters(int p0, java.lang.String p1, java.lang.String p2, android.os.Bundle p3) throws android.os.RemoteException { return null; }
            public void launchScanAction(int p0) throws android.os.RemoteException {}
            public void registerScanGlobalListener(android.media.tv.extension.scan.IScanGlobalListener p0) throws android.os.RemoteException {}
            public void showScanSettings() throws android.os.RemoteException {}
            public void unregisterScanGlobalListener(android.media.tv.extension.scan.IScanGlobalListener p0) throws android.os.RemoteException {}
        }
    }
}
