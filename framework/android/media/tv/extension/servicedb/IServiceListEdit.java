package android.media.tv.extension.servicedb;

public interface IServiceListEdit extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.tv.extension.servicedb.IServiceListEdit";
    public int addPredefinedSatelliteInfo(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException;
    public int addPredefinedServiceList(java.lang.String p0, android.os.Bundle[] p1) throws android.os.RemoteException;
    public java.lang.String addServiceListInfo(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, int p4) throws android.os.RemoteException;
    public int close() throws android.os.RemoteException;
    public int commit() throws android.os.RemoteException;
    public java.lang.String decompressRecord(android.os.Bundle p0, java.lang.String p1) throws android.os.RemoteException;
    public android.os.Bundle[] getAllInstalledServiceListInfo() throws android.os.RemoteException;
    public android.os.Bundle getInstalledServiceListInfo(java.lang.String p0) throws android.os.RemoteException;
    public android.os.Bundle getNetworkInfoList(java.lang.String p0, java.lang.String[] p1) throws android.os.RemoteException;
    public android.os.Bundle getSatelliteInfoList(java.lang.String p0, java.lang.String[] p1) throws android.os.RemoteException;
    public android.os.Bundle getServiceInfo(java.lang.String p0, java.lang.String[] p1) throws android.os.RemoteException;
    public java.lang.String[] getServiceInfoIdsFromDatabase(java.lang.String p0) throws android.os.RemoteException;
    public android.os.Bundle getServiceInfoList(java.lang.String p0, java.lang.String[] p1) throws android.os.RemoteException;
    public java.lang.String getServiceLogoUri(int p0) throws android.os.RemoteException;
    public android.os.Bundle getTransportStreamInfoList(java.lang.String p0, java.lang.String[] p1) throws android.os.RemoteException;
    public android.os.Bundle getTransportStreamInfoListForce(java.lang.String p0, java.lang.String[] p1) throws android.os.RemoteException;
    public int open(android.media.tv.extension.servicedb.IServiceListEditListener p0) throws android.os.RemoteException;
    public int removeServiceInfo(java.lang.String p0) throws android.os.RemoteException;
    public int removeServiceInfoByList(java.lang.String[] p0) throws android.os.RemoteException;
    public int updateRecordIdList(java.lang.String p0, java.lang.String[] p1, int p2) throws android.os.RemoteException;
    public int updateServiceInfo(android.os.Bundle p0) throws android.os.RemoteException;
    public int updateServiceInfoByList(android.os.Bundle[] p0) throws android.os.RemoteException;
    public int userEditCommit() throws android.os.RemoteException;

    public static class Default implements android.media.tv.extension.servicedb.IServiceListEdit {
        public Default() {}
        public int addPredefinedSatelliteInfo(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException { return 0; }
        public int addPredefinedServiceList(java.lang.String p0, android.os.Bundle[] p1) throws android.os.RemoteException { return 0; }
        public java.lang.String addServiceListInfo(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, int p4) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
        public int close() throws android.os.RemoteException { return 0; }
        public int commit() throws android.os.RemoteException { return 0; }
        public java.lang.String decompressRecord(android.os.Bundle p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.os.Bundle[] getAllInstalledServiceListInfo() throws android.os.RemoteException { return null; }
        public android.os.Bundle getInstalledServiceListInfo(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.os.Bundle getNetworkInfoList(java.lang.String p0, java.lang.String[] p1) throws android.os.RemoteException { return null; }
        public android.os.Bundle getSatelliteInfoList(java.lang.String p0, java.lang.String[] p1) throws android.os.RemoteException { return null; }
        public android.os.Bundle getServiceInfo(java.lang.String p0, java.lang.String[] p1) throws android.os.RemoteException { return null; }
        public java.lang.String[] getServiceInfoIdsFromDatabase(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.os.Bundle getServiceInfoList(java.lang.String p0, java.lang.String[] p1) throws android.os.RemoteException { return null; }
        public java.lang.String getServiceLogoUri(int p0) throws android.os.RemoteException { return null; }
        public android.os.Bundle getTransportStreamInfoList(java.lang.String p0, java.lang.String[] p1) throws android.os.RemoteException { return null; }
        public android.os.Bundle getTransportStreamInfoListForce(java.lang.String p0, java.lang.String[] p1) throws android.os.RemoteException { return null; }
        public int open(android.media.tv.extension.servicedb.IServiceListEditListener p0) throws android.os.RemoteException { return 0; }
        public int removeServiceInfo(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public int removeServiceInfoByList(java.lang.String[] p0) throws android.os.RemoteException { return 0; }
        public int updateRecordIdList(java.lang.String p0, java.lang.String[] p1, int p2) throws android.os.RemoteException { return 0; }
        public int updateServiceInfo(android.os.Bundle p0) throws android.os.RemoteException { return 0; }
        public int updateServiceInfoByList(android.os.Bundle[] p0) throws android.os.RemoteException { return 0; }
        public int userEditCommit() throws android.os.RemoteException { return 0; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.extension.servicedb.IServiceListEdit {
        static final int TRANSACTION_addPredefinedSatelliteInfo = 18;
        static final int TRANSACTION_addPredefinedServiceList = 13;
        static final int TRANSACTION_addServiceListInfo = 12;
        static final int TRANSACTION_close = 2;
        static final int TRANSACTION_commit = 3;
        static final int TRANSACTION_decompressRecord = 19;
        static final int TRANSACTION_getAllInstalledServiceListInfo = 23;
        static final int TRANSACTION_getInstalledServiceListInfo = 22;
        static final int TRANSACTION_getNetworkInfoList = 16;
        static final int TRANSACTION_getSatelliteInfoList = 17;
        static final int TRANSACTION_getServiceInfo = 5;
        static final int TRANSACTION_getServiceInfoIdsFromDatabase = 7;
        static final int TRANSACTION_getServiceInfoList = 6;
        static final int TRANSACTION_getServiceLogoUri = 21;
        static final int TRANSACTION_getTransportStreamInfoList = 14;
        static final int TRANSACTION_getTransportStreamInfoListForce = 15;
        static final int TRANSACTION_open = 1;
        static final int TRANSACTION_removeServiceInfo = 10;
        static final int TRANSACTION_removeServiceInfoByList = 11;
        static final int TRANSACTION_updateRecordIdList = 20;
        static final int TRANSACTION_updateServiceInfo = 8;
        static final int TRANSACTION_updateServiceInfoByList = 9;
        static final int TRANSACTION_userEditCommit = 4;
        public Stub() { super(); }
        public static android.media.tv.extension.servicedb.IServiceListEdit asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.media.tv.extension.servicedb.IServiceListEdit {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public int addPredefinedSatelliteInfo(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException { return 0; }
            public int addPredefinedServiceList(java.lang.String p0, android.os.Bundle[] p1) throws android.os.RemoteException { return 0; }
            public java.lang.String addServiceListInfo(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, int p4) throws android.os.RemoteException { return null; }
            public android.os.IBinder asBinder() { return null; }
            public int close() throws android.os.RemoteException { return 0; }
            public int commit() throws android.os.RemoteException { return 0; }
            public java.lang.String decompressRecord(android.os.Bundle p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public android.os.Bundle[] getAllInstalledServiceListInfo() throws android.os.RemoteException { return null; }
            public android.os.Bundle getInstalledServiceListInfo(java.lang.String p0) throws android.os.RemoteException { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public android.os.Bundle getNetworkInfoList(java.lang.String p0, java.lang.String[] p1) throws android.os.RemoteException { return null; }
            public android.os.Bundle getSatelliteInfoList(java.lang.String p0, java.lang.String[] p1) throws android.os.RemoteException { return null; }
            public android.os.Bundle getServiceInfo(java.lang.String p0, java.lang.String[] p1) throws android.os.RemoteException { return null; }
            public java.lang.String[] getServiceInfoIdsFromDatabase(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.os.Bundle getServiceInfoList(java.lang.String p0, java.lang.String[] p1) throws android.os.RemoteException { return null; }
            public java.lang.String getServiceLogoUri(int p0) throws android.os.RemoteException { return null; }
            public android.os.Bundle getTransportStreamInfoList(java.lang.String p0, java.lang.String[] p1) throws android.os.RemoteException { return null; }
            public android.os.Bundle getTransportStreamInfoListForce(java.lang.String p0, java.lang.String[] p1) throws android.os.RemoteException { return null; }
            public int open(android.media.tv.extension.servicedb.IServiceListEditListener p0) throws android.os.RemoteException { return 0; }
            public int removeServiceInfo(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public int removeServiceInfoByList(java.lang.String[] p0) throws android.os.RemoteException { return 0; }
            public int updateRecordIdList(java.lang.String p0, java.lang.String[] p1, int p2) throws android.os.RemoteException { return 0; }
            public int updateServiceInfo(android.os.Bundle p0) throws android.os.RemoteException { return 0; }
            public int updateServiceInfoByList(android.os.Bundle[] p0) throws android.os.RemoteException { return 0; }
            public int userEditCommit() throws android.os.RemoteException { return 0; }
        }
    }
}
