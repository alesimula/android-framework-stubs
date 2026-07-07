package android.media.tv.extension.cam;

public interface ICamProfileInterface extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.tv.extension.cam.ICamProfileInterface";
    public void addListener(android.media.tv.extension.cam.ICamProfileListener p0) throws android.os.RemoteException;
    public boolean deleteProfile(java.lang.String p0) throws android.os.RemoteException;
    public android.os.Bundle getCamServiceUpdateInfo(int p0) throws android.os.RemoteException;
    public java.lang.String[] getCiOpNameList() throws android.os.RemoteException;
    public boolean isCamScanEnabled(int p0) throws android.os.RemoteException;
    public void removeListener(android.media.tv.extension.cam.ICamProfileListener p0) throws android.os.RemoteException;
    public void requestResendProfileInfoBroadcastACON() throws android.os.RemoteException;
    public int updateCiOPControl(java.lang.String p0, boolean p1, android.media.tv.extension.cam.ICiOperatorListener p2) throws android.os.RemoteException;

    public static class Default implements android.media.tv.extension.cam.ICamProfileInterface {
        public Default() {}
        public void addListener(android.media.tv.extension.cam.ICamProfileListener p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
        public boolean deleteProfile(java.lang.String p0) throws android.os.RemoteException { return false; }
        public android.os.Bundle getCamServiceUpdateInfo(int p0) throws android.os.RemoteException { return null; }
        public java.lang.String[] getCiOpNameList() throws android.os.RemoteException { return null; }
        public boolean isCamScanEnabled(int p0) throws android.os.RemoteException { return false; }
        public void removeListener(android.media.tv.extension.cam.ICamProfileListener p0) throws android.os.RemoteException {}
        public void requestResendProfileInfoBroadcastACON() throws android.os.RemoteException {}
        public int updateCiOPControl(java.lang.String p0, boolean p1, android.media.tv.extension.cam.ICiOperatorListener p2) throws android.os.RemoteException { return 0; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.extension.cam.ICamProfileInterface {
        static final int TRANSACTION_addListener = 4;
        static final int TRANSACTION_deleteProfile = 8;
        static final int TRANSACTION_getCamServiceUpdateInfo = 1;
        static final int TRANSACTION_getCiOpNameList = 7;
        static final int TRANSACTION_isCamScanEnabled = 3;
        static final int TRANSACTION_removeListener = 5;
        static final int TRANSACTION_requestResendProfileInfoBroadcastACON = 2;
        static final int TRANSACTION_updateCiOPControl = 6;
        public Stub() { super(); }
        public static android.media.tv.extension.cam.ICamProfileInterface asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.media.tv.extension.cam.ICamProfileInterface {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public void addListener(android.media.tv.extension.cam.ICamProfileListener p0) throws android.os.RemoteException {}
            public android.os.IBinder asBinder() { return null; }
            public boolean deleteProfile(java.lang.String p0) throws android.os.RemoteException { return false; }
            public android.os.Bundle getCamServiceUpdateInfo(int p0) throws android.os.RemoteException { return null; }
            public java.lang.String[] getCiOpNameList() throws android.os.RemoteException { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public boolean isCamScanEnabled(int p0) throws android.os.RemoteException { return false; }
            public void removeListener(android.media.tv.extension.cam.ICamProfileListener p0) throws android.os.RemoteException {}
            public void requestResendProfileInfoBroadcastACON() throws android.os.RemoteException {}
            public int updateCiOPControl(java.lang.String p0, boolean p1, android.media.tv.extension.cam.ICiOperatorListener p2) throws android.os.RemoteException { return 0; }
        }
    }
}
