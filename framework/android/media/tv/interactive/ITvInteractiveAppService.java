package android.media.tv.interactive;

public interface ITvInteractiveAppService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.tv.interactive.ITvInteractiveAppService";
    public void cancelOngoingOperatorAppPackageOperation(android.media.tv.interactive.OperatorAppServiceInfo p0) throws android.os.RemoteException;
    public void createSession(android.view.InputChannel p0, android.media.tv.interactive.ITvInteractiveAppSessionCallback p1, java.lang.String p2, int p3, int p4) throws android.os.RemoteException;
    public void installOperatorApp(android.media.tv.interactive.OperatorAppServiceInfo p0) throws android.os.RemoteException;
    public void registerAppLinkInfo(android.media.tv.interactive.AppLinkInfo p0) throws android.os.RemoteException;
    public void registerCallback(android.media.tv.interactive.ITvInteractiveAppServiceCallback p0) throws android.os.RemoteException;
    public void requestOperatorAppPackageStatus(android.media.tv.interactive.OperatorAppServiceInfo p0) throws android.os.RemoteException;
    public void searchOperatorApp(android.media.tv.interactive.OperatorAppServiceInfo p0, int p1, android.os.Bundle p2) throws android.os.RemoteException;
    public void sendAppLinkCommand(android.os.Bundle p0) throws android.os.RemoteException;
    public void uninstallOperatorApp(android.media.tv.interactive.OperatorAppServiceInfo p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public void unregisterAppLinkInfo(android.media.tv.interactive.AppLinkInfo p0) throws android.os.RemoteException;
    public void unregisterCallback(android.media.tv.interactive.ITvInteractiveAppServiceCallback p0) throws android.os.RemoteException;
    public void updateOperatorApp(android.media.tv.interactive.OperatorAppServiceInfo p0, int p1, android.os.Bundle p2) throws android.os.RemoteException;

    public static class Default implements android.media.tv.interactive.ITvInteractiveAppService {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void cancelOngoingOperatorAppPackageOperation(android.media.tv.interactive.OperatorAppServiceInfo p0) throws android.os.RemoteException {}
        public void createSession(android.view.InputChannel p0, android.media.tv.interactive.ITvInteractiveAppSessionCallback p1, java.lang.String p2, int p3, int p4) throws android.os.RemoteException {}
        public void installOperatorApp(android.media.tv.interactive.OperatorAppServiceInfo p0) throws android.os.RemoteException {}
        public void registerAppLinkInfo(android.media.tv.interactive.AppLinkInfo p0) throws android.os.RemoteException {}
        public void registerCallback(android.media.tv.interactive.ITvInteractiveAppServiceCallback p0) throws android.os.RemoteException {}
        public void requestOperatorAppPackageStatus(android.media.tv.interactive.OperatorAppServiceInfo p0) throws android.os.RemoteException {}
        public void searchOperatorApp(android.media.tv.interactive.OperatorAppServiceInfo p0, int p1, android.os.Bundle p2) throws android.os.RemoteException {}
        public void sendAppLinkCommand(android.os.Bundle p0) throws android.os.RemoteException {}
        public void uninstallOperatorApp(android.media.tv.interactive.OperatorAppServiceInfo p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
        public void unregisterAppLinkInfo(android.media.tv.interactive.AppLinkInfo p0) throws android.os.RemoteException {}
        public void unregisterCallback(android.media.tv.interactive.ITvInteractiveAppServiceCallback p0) throws android.os.RemoteException {}
        public void updateOperatorApp(android.media.tv.interactive.OperatorAppServiceInfo p0, int p1, android.os.Bundle p2) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.interactive.ITvInteractiveAppService {
        static final int TRANSACTION_cancelOngoingOperatorAppPackageOperation = 8;
        static final int TRANSACTION_createSession = 3;
        static final int TRANSACTION_installOperatorApp = 10;
        static final int TRANSACTION_registerAppLinkInfo = 4;
        static final int TRANSACTION_registerCallback = 1;
        static final int TRANSACTION_requestOperatorAppPackageStatus = 12;
        static final int TRANSACTION_searchOperatorApp = 7;
        static final int TRANSACTION_sendAppLinkCommand = 6;
        static final int TRANSACTION_uninstallOperatorApp = 11;
        static final int TRANSACTION_unregisterAppLinkInfo = 5;
        static final int TRANSACTION_unregisterCallback = 2;
        static final int TRANSACTION_updateOperatorApp = 9;
        public Stub() { super(); }
        public static android.media.tv.interactive.ITvInteractiveAppService asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.media.tv.interactive.ITvInteractiveAppService {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void cancelOngoingOperatorAppPackageOperation(android.media.tv.interactive.OperatorAppServiceInfo p0) throws android.os.RemoteException {}
            public void createSession(android.view.InputChannel p0, android.media.tv.interactive.ITvInteractiveAppSessionCallback p1, java.lang.String p2, int p3, int p4) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void installOperatorApp(android.media.tv.interactive.OperatorAppServiceInfo p0) throws android.os.RemoteException {}
            public void registerAppLinkInfo(android.media.tv.interactive.AppLinkInfo p0) throws android.os.RemoteException {}
            public void registerCallback(android.media.tv.interactive.ITvInteractiveAppServiceCallback p0) throws android.os.RemoteException {}
            public void requestOperatorAppPackageStatus(android.media.tv.interactive.OperatorAppServiceInfo p0) throws android.os.RemoteException {}
            public void searchOperatorApp(android.media.tv.interactive.OperatorAppServiceInfo p0, int p1, android.os.Bundle p2) throws android.os.RemoteException {}
            public void sendAppLinkCommand(android.os.Bundle p0) throws android.os.RemoteException {}
            public void uninstallOperatorApp(android.media.tv.interactive.OperatorAppServiceInfo p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
            public void unregisterAppLinkInfo(android.media.tv.interactive.AppLinkInfo p0) throws android.os.RemoteException {}
            public void unregisterCallback(android.media.tv.interactive.ITvInteractiveAppServiceCallback p0) throws android.os.RemoteException {}
            public void updateOperatorApp(android.media.tv.interactive.OperatorAppServiceInfo p0, int p1, android.os.Bundle p2) throws android.os.RemoteException {}
        }
    }
}
