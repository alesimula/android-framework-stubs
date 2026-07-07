package com.android.internal.telephony;

public interface ICarrierPrivilegesCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.telephony.ICarrierPrivilegesCallback";
    public void onCarrierPrivilegesChanged(java.util.List<java.lang.String> p0, int[] p1) throws android.os.RemoteException;
    public void onCarrierServiceChanged(java.lang.String p0, int p1) throws android.os.RemoteException;

    public static class Default implements com.android.internal.telephony.ICarrierPrivilegesCallback {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onCarrierPrivilegesChanged(java.util.List<java.lang.String> p0, int[] p1) throws android.os.RemoteException {}
        public void onCarrierServiceChanged(java.lang.String p0, int p1) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.telephony.ICarrierPrivilegesCallback {
        static final int TRANSACTION_onCarrierPrivilegesChanged = 1;
        static final int TRANSACTION_onCarrierServiceChanged = 2;
        public Stub() { super(); }
        public static com.android.internal.telephony.ICarrierPrivilegesCallback asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements com.android.internal.telephony.ICarrierPrivilegesCallback {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onCarrierPrivilegesChanged(java.util.List<java.lang.String> p0, int[] p1) throws android.os.RemoteException {}
            public void onCarrierServiceChanged(java.lang.String p0, int p1) throws android.os.RemoteException {}
        }
    }
}
