package com.android.internal.telephony;

public interface IWapPushManager extends android.os.IInterface {
    public boolean addPackage(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, int p4, boolean p5, boolean p6) throws android.os.RemoteException;
    public boolean deletePackage(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public int processMessage(java.lang.String p0, java.lang.String p1, android.content.Intent p2) throws android.os.RemoteException;
    public boolean updatePackage(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, int p4, boolean p5, boolean p6) throws android.os.RemoteException;

    public static class Default implements com.android.internal.telephony.IWapPushManager {
        public Default() {}
        public boolean addPackage(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, int p4, boolean p5, boolean p6) throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
        public boolean deletePackage(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return false; }
        public int processMessage(java.lang.String p0, java.lang.String p1, android.content.Intent p2) throws android.os.RemoteException { return 0; }
        public boolean updatePackage(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, int p4, boolean p5, boolean p6) throws android.os.RemoteException { return false; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.telephony.IWapPushManager {
        public static final java.lang.String DESCRIPTOR = "com.android.internal.telephony.IWapPushManager";
        static final int TRANSACTION_addPackage = 2;
        static final int TRANSACTION_deletePackage = 4;
        static final int TRANSACTION_processMessage = 1;
        static final int TRANSACTION_updatePackage = 3;
        public Stub() { super(); }
        public static com.android.internal.telephony.IWapPushManager asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements com.android.internal.telephony.IWapPushManager {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public boolean addPackage(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, int p4, boolean p5, boolean p6) throws android.os.RemoteException { return false; }
            public android.os.IBinder asBinder() { return null; }
            public boolean deletePackage(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return false; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public int processMessage(java.lang.String p0, java.lang.String p1, android.content.Intent p2) throws android.os.RemoteException { return 0; }
            public boolean updatePackage(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, int p4, boolean p5, boolean p6) throws android.os.RemoteException { return false; }
        }
    }
}
