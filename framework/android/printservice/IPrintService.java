package android.printservice;

public interface IPrintService extends android.os.IInterface {
    public void createPrinterDiscoverySession() throws android.os.RemoteException;
    public void destroyPrinterDiscoverySession() throws android.os.RemoteException;
    public void onPrintJobQueued(android.print.PrintJobInfo p0) throws android.os.RemoteException;
    public void requestCancelPrintJob(android.print.PrintJobInfo p0) throws android.os.RemoteException;
    public void requestCustomPrinterIcon(android.print.PrinterId p0) throws android.os.RemoteException;
    public void setClient(android.printservice.IPrintServiceClient p0) throws android.os.RemoteException;
    public void startPrinterDiscovery(java.util.List<android.print.PrinterId> p0) throws android.os.RemoteException;
    public void startPrinterStateTracking(android.print.PrinterId p0) throws android.os.RemoteException;
    public void stopPrinterDiscovery() throws android.os.RemoteException;
    public void stopPrinterStateTracking(android.print.PrinterId p0) throws android.os.RemoteException;
    public void validatePrinters(java.util.List<android.print.PrinterId> p0) throws android.os.RemoteException;

    public static class Default implements android.printservice.IPrintService {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void createPrinterDiscoverySession() throws android.os.RemoteException {}
        public void destroyPrinterDiscoverySession() throws android.os.RemoteException {}
        public void onPrintJobQueued(android.print.PrintJobInfo p0) throws android.os.RemoteException {}
        public void requestCancelPrintJob(android.print.PrintJobInfo p0) throws android.os.RemoteException {}
        public void requestCustomPrinterIcon(android.print.PrinterId p0) throws android.os.RemoteException {}
        public void setClient(android.printservice.IPrintServiceClient p0) throws android.os.RemoteException {}
        public void startPrinterDiscovery(java.util.List<android.print.PrinterId> p0) throws android.os.RemoteException {}
        public void startPrinterStateTracking(android.print.PrinterId p0) throws android.os.RemoteException {}
        public void stopPrinterDiscovery() throws android.os.RemoteException {}
        public void stopPrinterStateTracking(android.print.PrinterId p0) throws android.os.RemoteException {}
        public void validatePrinters(java.util.List<android.print.PrinterId> p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.printservice.IPrintService {
        public static final java.lang.String DESCRIPTOR = "android.printservice.IPrintService";
        static final int TRANSACTION_createPrinterDiscoverySession = 4;
        static final int TRANSACTION_destroyPrinterDiscoverySession = 11;
        static final int TRANSACTION_onPrintJobQueued = 3;
        static final int TRANSACTION_requestCancelPrintJob = 2;
        static final int TRANSACTION_requestCustomPrinterIcon = 9;
        static final int TRANSACTION_setClient = 1;
        static final int TRANSACTION_startPrinterDiscovery = 5;
        static final int TRANSACTION_startPrinterStateTracking = 8;
        static final int TRANSACTION_stopPrinterDiscovery = 6;
        static final int TRANSACTION_stopPrinterStateTracking = 10;
        static final int TRANSACTION_validatePrinters = 7;
        public Stub() { super(); }
        public static android.printservice.IPrintService asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.printservice.IPrintService {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void createPrinterDiscoverySession() throws android.os.RemoteException {}
            public void destroyPrinterDiscoverySession() throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onPrintJobQueued(android.print.PrintJobInfo p0) throws android.os.RemoteException {}
            public void requestCancelPrintJob(android.print.PrintJobInfo p0) throws android.os.RemoteException {}
            public void requestCustomPrinterIcon(android.print.PrinterId p0) throws android.os.RemoteException {}
            public void setClient(android.printservice.IPrintServiceClient p0) throws android.os.RemoteException {}
            public void startPrinterDiscovery(java.util.List<android.print.PrinterId> p0) throws android.os.RemoteException {}
            public void startPrinterStateTracking(android.print.PrinterId p0) throws android.os.RemoteException {}
            public void stopPrinterDiscovery() throws android.os.RemoteException {}
            public void stopPrinterStateTracking(android.print.PrinterId p0) throws android.os.RemoteException {}
            public void validatePrinters(java.util.List<android.print.PrinterId> p0) throws android.os.RemoteException {}
        }
    }
}
