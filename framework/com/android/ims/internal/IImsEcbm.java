package com.android.ims.internal;

public interface IImsEcbm extends android.os.IInterface {
    public void exitEmergencyCallbackMode() throws android.os.RemoteException;
    public void setListener(com.android.ims.internal.IImsEcbmListener p0) throws android.os.RemoteException;

    public static class Default implements com.android.ims.internal.IImsEcbm {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void exitEmergencyCallbackMode() throws android.os.RemoteException {}
        public void setListener(com.android.ims.internal.IImsEcbmListener p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements com.android.ims.internal.IImsEcbm {
        public static final java.lang.String DESCRIPTOR = "com.android.ims.internal.IImsEcbm";
        static final int TRANSACTION_exitEmergencyCallbackMode = 2;
        static final int TRANSACTION_setListener = 1;
        public Stub() { super(); }
        public static com.android.ims.internal.IImsEcbm asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements com.android.ims.internal.IImsEcbm {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void exitEmergencyCallbackMode() throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void setListener(com.android.ims.internal.IImsEcbmListener p0) throws android.os.RemoteException {}
        }
    }
}
