package com.android.internal.telephony;

public interface IWwanSelectorCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.telephony.IWwanSelectorCallback";
    public void onCancel() throws android.os.RemoteException;
    public void onDomainSelected(int p0, boolean p1) throws android.os.RemoteException;
    public void onRequestEmergencyNetworkScan(int[] p0, int p1, boolean p2, com.android.internal.telephony.IWwanSelectorResultCallback p3) throws android.os.RemoteException;

    public static class Default implements com.android.internal.telephony.IWwanSelectorCallback {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onCancel() throws android.os.RemoteException {}
        public void onDomainSelected(int p0, boolean p1) throws android.os.RemoteException {}
        public void onRequestEmergencyNetworkScan(int[] p0, int p1, boolean p2, com.android.internal.telephony.IWwanSelectorResultCallback p3) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.telephony.IWwanSelectorCallback {
        static final int TRANSACTION_onCancel = 3;
        static final int TRANSACTION_onDomainSelected = 2;
        static final int TRANSACTION_onRequestEmergencyNetworkScan = 1;
        public Stub() { super(); }
        public static com.android.internal.telephony.IWwanSelectorCallback asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements com.android.internal.telephony.IWwanSelectorCallback {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onCancel() throws android.os.RemoteException {}
            public void onDomainSelected(int p0, boolean p1) throws android.os.RemoteException {}
            public void onRequestEmergencyNetworkScan(int[] p0, int p1, boolean p2, com.android.internal.telephony.IWwanSelectorResultCallback p3) throws android.os.RemoteException {}
        }
    }
}
