package com.android.internal.telephony;

public interface ICarrierConfigLoader extends android.os.IInterface {
    @java.lang.Deprecated
    public android.os.PersistableBundle getConfigForSubId(int p0, java.lang.String p1) throws android.os.RemoteException;
    public android.os.PersistableBundle getConfigForSubIdWithFeature(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public android.os.PersistableBundle getConfigSubsetForSubIdWithFeature(int p0, java.lang.String p1, java.lang.String p2, java.lang.String[] p3) throws android.os.RemoteException;
    public java.lang.String getDefaultCarrierServicePackageName() throws android.os.RemoteException;
    public void notifyConfigChangedForSubId(int p0) throws android.os.RemoteException;
    public void overrideConfig(int p0, android.os.PersistableBundle p1, boolean p2) throws android.os.RemoteException;
    public void updateConfigForPhoneId(int p0, java.lang.String p1) throws android.os.RemoteException;

    public static class Default implements com.android.internal.telephony.ICarrierConfigLoader {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        @java.lang.Deprecated
        public android.os.PersistableBundle getConfigForSubId(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.os.PersistableBundle getConfigForSubIdWithFeature(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public android.os.PersistableBundle getConfigSubsetForSubIdWithFeature(int p0, java.lang.String p1, java.lang.String p2, java.lang.String[] p3) throws android.os.RemoteException { return null; }
        public java.lang.String getDefaultCarrierServicePackageName() throws android.os.RemoteException { return null; }
        public void notifyConfigChangedForSubId(int p0) throws android.os.RemoteException {}
        public void overrideConfig(int p0, android.os.PersistableBundle p1, boolean p2) throws android.os.RemoteException {}
        public void updateConfigForPhoneId(int p0, java.lang.String p1) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.telephony.ICarrierConfigLoader {
        public static final java.lang.String DESCRIPTOR = "com.android.internal.telephony.ICarrierConfigLoader";
        static final int TRANSACTION_getConfigForSubId = 1;
        static final int TRANSACTION_getConfigForSubIdWithFeature = 2;
        static final int TRANSACTION_getConfigSubsetForSubIdWithFeature = 7;
        static final int TRANSACTION_getDefaultCarrierServicePackageName = 6;
        static final int TRANSACTION_notifyConfigChangedForSubId = 4;
        static final int TRANSACTION_overrideConfig = 3;
        static final int TRANSACTION_updateConfigForPhoneId = 5;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static com.android.internal.telephony.ICarrierConfigLoader asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        protected void getDefaultCarrierServicePackageName_enforcePermission() throws java.lang.SecurityException {}
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void overrideConfig_enforcePermission() throws java.lang.SecurityException {}
        protected void updateConfigForPhoneId_enforcePermission() throws java.lang.SecurityException {}

        private static final class Proxy implements com.android.internal.telephony.ICarrierConfigLoader {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            @java.lang.Deprecated
            public android.os.PersistableBundle getConfigForSubId(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public android.os.PersistableBundle getConfigForSubIdWithFeature(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public android.os.PersistableBundle getConfigSubsetForSubIdWithFeature(int p0, java.lang.String p1, java.lang.String p2, java.lang.String[] p3) throws android.os.RemoteException { return null; }
            public java.lang.String getDefaultCarrierServicePackageName() throws android.os.RemoteException { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void notifyConfigChangedForSubId(int p0) throws android.os.RemoteException {}
            public void overrideConfig(int p0, android.os.PersistableBundle p1, boolean p2) throws android.os.RemoteException {}
            public void updateConfigForPhoneId(int p0, java.lang.String p1) throws android.os.RemoteException {}
        }
    }
}
