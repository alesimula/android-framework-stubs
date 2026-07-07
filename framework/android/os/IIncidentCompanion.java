package android.os;

public interface IIncidentCompanion extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.os.IIncidentCompanion";
    public void approveReport(java.lang.String p0) throws android.os.RemoteException;
    public void authorizeReport(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, int p4, android.os.IIncidentAuthListener p5) throws android.os.RemoteException;
    public void cancelAuthorization(android.os.IIncidentAuthListener p0) throws android.os.RemoteException;
    public void deleteAllIncidentReports(java.lang.String p0) throws android.os.RemoteException;
    public void deleteIncidentReports(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void denyReport(java.lang.String p0) throws android.os.RemoteException;
    public android.os.IncidentManager.IncidentReport getIncidentReport(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getIncidentReportList(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getPendingReports() throws android.os.RemoteException;
    public void sendReportReadyBroadcast(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;

    public static class Default implements android.os.IIncidentCompanion {
        public Default() {}
        public void approveReport(java.lang.String p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
        public void authorizeReport(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, int p4, android.os.IIncidentAuthListener p5) throws android.os.RemoteException {}
        public void cancelAuthorization(android.os.IIncidentAuthListener p0) throws android.os.RemoteException {}
        public void deleteAllIncidentReports(java.lang.String p0) throws android.os.RemoteException {}
        public void deleteIncidentReports(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        public void denyReport(java.lang.String p0) throws android.os.RemoteException {}
        public android.os.IncidentManager.IncidentReport getIncidentReport(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getIncidentReportList(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getPendingReports() throws android.os.RemoteException { return null; }
        public void sendReportReadyBroadcast(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.os.IIncidentCompanion {
        static final int TRANSACTION_approveReport = 5;
        static final int TRANSACTION_authorizeReport = 1;
        static final int TRANSACTION_cancelAuthorization = 2;
        static final int TRANSACTION_deleteAllIncidentReports = 10;
        static final int TRANSACTION_deleteIncidentReports = 9;
        static final int TRANSACTION_denyReport = 6;
        static final int TRANSACTION_getIncidentReport = 8;
        static final int TRANSACTION_getIncidentReportList = 7;
        static final int TRANSACTION_getPendingReports = 4;
        static final int TRANSACTION_sendReportReadyBroadcast = 3;
        public Stub() { super(); }
        public static android.os.IIncidentCompanion asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.os.IIncidentCompanion {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public void approveReport(java.lang.String p0) throws android.os.RemoteException {}
            public android.os.IBinder asBinder() { return null; }
            public void authorizeReport(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, int p4, android.os.IIncidentAuthListener p5) throws android.os.RemoteException {}
            public void cancelAuthorization(android.os.IIncidentAuthListener p0) throws android.os.RemoteException {}
            public void deleteAllIncidentReports(java.lang.String p0) throws android.os.RemoteException {}
            public void deleteIncidentReports(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
            public void denyReport(java.lang.String p0) throws android.os.RemoteException {}
            public android.os.IncidentManager.IncidentReport getIncidentReport(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getIncidentReportList(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public java.util.List<java.lang.String> getPendingReports() throws android.os.RemoteException { return null; }
            public void sendReportReadyBroadcast(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        }
    }
}
