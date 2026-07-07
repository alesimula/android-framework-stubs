package android.content.om;

public interface IOverlayManager extends android.os.IInterface {
    public void commit(android.content.om.OverlayManagerTransaction p0) throws android.os.RemoteException;
    public boolean enableWithConstraints(java.lang.String p0, int p1, java.util.List<android.content.om.OverlayConstraint> p2) throws android.os.RemoteException;
    public java.util.Map<java.lang.String, java.util.List<android.content.om.OverlayInfo>> getAllOverlays(int p0) throws android.os.RemoteException;
    public java.lang.String[] getDefaultOverlayPackages() throws android.os.RemoteException;
    public android.content.om.OverlayInfo getOverlayInfo(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.content.om.OverlayInfo getOverlayInfoByIdentifier(android.content.om.OverlayIdentifier p0, int p1) throws android.os.RemoteException;
    public java.util.List<android.content.om.OverlayInfo> getOverlayInfosForTarget(java.lang.String p0, int p1) throws android.os.RemoteException;
    public java.lang.String getPartitionOrder() throws android.os.RemoteException;
    public void invalidateCachesForOverlay(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean isDefaultPartitionOrder() throws android.os.RemoteException;
    public boolean setEnabled(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException;
    public boolean setEnabledExclusive(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException;
    public boolean setEnabledExclusiveInCategory(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean setHighestPriority(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean setLowestPriority(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean setPriority(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;

    public static class Default implements android.content.om.IOverlayManager {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void commit(android.content.om.OverlayManagerTransaction p0) throws android.os.RemoteException {}
        public boolean enableWithConstraints(java.lang.String p0, int p1, java.util.List<android.content.om.OverlayConstraint> p2) throws android.os.RemoteException { return false; }
        public java.util.Map<java.lang.String, java.util.List<android.content.om.OverlayInfo>> getAllOverlays(int p0) throws android.os.RemoteException { return null; }
        public java.lang.String[] getDefaultOverlayPackages() throws android.os.RemoteException { return null; }
        public android.content.om.OverlayInfo getOverlayInfo(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public android.content.om.OverlayInfo getOverlayInfoByIdentifier(android.content.om.OverlayIdentifier p0, int p1) throws android.os.RemoteException { return null; }
        public java.util.List<android.content.om.OverlayInfo> getOverlayInfosForTarget(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public java.lang.String getPartitionOrder() throws android.os.RemoteException { return null; }
        public void invalidateCachesForOverlay(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public boolean isDefaultPartitionOrder() throws android.os.RemoteException { return false; }
        public boolean setEnabled(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException { return false; }
        public boolean setEnabledExclusive(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException { return false; }
        public boolean setEnabledExclusiveInCategory(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean setHighestPriority(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean setLowestPriority(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean setPriority(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
    }

    public static abstract class Stub extends android.os.Binder implements android.content.om.IOverlayManager {
        public static final java.lang.String DESCRIPTOR = "android.content.om.IOverlayManager";
        static final int TRANSACTION_commit = 14;
        static final int TRANSACTION_enableWithConstraints = 6;
        static final int TRANSACTION_getAllOverlays = 1;
        static final int TRANSACTION_getDefaultOverlayPackages = 12;
        static final int TRANSACTION_getOverlayInfo = 3;
        static final int TRANSACTION_getOverlayInfoByIdentifier = 4;
        static final int TRANSACTION_getOverlayInfosForTarget = 2;
        static final int TRANSACTION_getPartitionOrder = 15;
        static final int TRANSACTION_invalidateCachesForOverlay = 13;
        static final int TRANSACTION_isDefaultPartitionOrder = 16;
        static final int TRANSACTION_setEnabled = 5;
        static final int TRANSACTION_setEnabledExclusive = 7;
        static final int TRANSACTION_setEnabledExclusiveInCategory = 8;
        static final int TRANSACTION_setHighestPriority = 10;
        static final int TRANSACTION_setLowestPriority = 11;
        static final int TRANSACTION_setPriority = 9;
        public Stub() { super(); }
        public static android.content.om.IOverlayManager asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.content.om.IOverlayManager {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void commit(android.content.om.OverlayManagerTransaction p0) throws android.os.RemoteException {}
            public boolean enableWithConstraints(java.lang.String p0, int p1, java.util.List<android.content.om.OverlayConstraint> p2) throws android.os.RemoteException { return false; }
            public java.util.Map<java.lang.String, java.util.List<android.content.om.OverlayInfo>> getAllOverlays(int p0) throws android.os.RemoteException { return null; }
            public java.lang.String[] getDefaultOverlayPackages() throws android.os.RemoteException { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public android.content.om.OverlayInfo getOverlayInfo(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public android.content.om.OverlayInfo getOverlayInfoByIdentifier(android.content.om.OverlayIdentifier p0, int p1) throws android.os.RemoteException { return null; }
            public java.util.List<android.content.om.OverlayInfo> getOverlayInfosForTarget(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public java.lang.String getPartitionOrder() throws android.os.RemoteException { return null; }
            public void invalidateCachesForOverlay(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public boolean isDefaultPartitionOrder() throws android.os.RemoteException { return false; }
            public boolean setEnabled(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException { return false; }
            public boolean setEnabledExclusive(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException { return false; }
            public boolean setEnabledExclusiveInCategory(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean setHighestPriority(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean setLowestPriority(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean setPriority(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
        }
    }
}
