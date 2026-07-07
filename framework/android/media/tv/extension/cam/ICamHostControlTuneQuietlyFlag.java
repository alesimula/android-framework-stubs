package android.media.tv.extension.cam;

public interface ICamHostControlTuneQuietlyFlag extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.tv.extension.cam.ICamHostControlTuneQuietlyFlag";
    public void addHcTuneQuietlyFlagListener(android.media.tv.extension.cam.ICamHostControlTuneQuietlyFlagListener p0) throws android.os.RemoteException;
    public int getHcTuneQuietlyFlag(java.lang.String p0) throws android.os.RemoteException;
    public void removeHcTuneQuietlyFlagListener(android.media.tv.extension.cam.ICamHostControlTuneQuietlyFlagListener p0) throws android.os.RemoteException;

    public static class Default implements android.media.tv.extension.cam.ICamHostControlTuneQuietlyFlag {
        public Default() {}
        public void addHcTuneQuietlyFlagListener(android.media.tv.extension.cam.ICamHostControlTuneQuietlyFlagListener p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
        public int getHcTuneQuietlyFlag(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public void removeHcTuneQuietlyFlagListener(android.media.tv.extension.cam.ICamHostControlTuneQuietlyFlagListener p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.extension.cam.ICamHostControlTuneQuietlyFlag {
        static final int TRANSACTION_addHcTuneQuietlyFlagListener = 1;
        static final int TRANSACTION_getHcTuneQuietlyFlag = 3;
        static final int TRANSACTION_removeHcTuneQuietlyFlagListener = 2;
        public Stub() { super(); }
        public static android.media.tv.extension.cam.ICamHostControlTuneQuietlyFlag asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.media.tv.extension.cam.ICamHostControlTuneQuietlyFlag {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public void addHcTuneQuietlyFlagListener(android.media.tv.extension.cam.ICamHostControlTuneQuietlyFlagListener p0) throws android.os.RemoteException {}
            public android.os.IBinder asBinder() { return null; }
            public int getHcTuneQuietlyFlag(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void removeHcTuneQuietlyFlagListener(android.media.tv.extension.cam.ICamHostControlTuneQuietlyFlagListener p0) throws android.os.RemoteException {}
        }
    }
}
