package android.aiseal;

public interface IAiSealHostService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.aiseal.IAiSealHostService";
    public android.os.ParcelFileDescriptor connectService(java.lang.String p0) throws android.os.RemoteException;

    public static class Default implements android.aiseal.IAiSealHostService {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public android.os.ParcelFileDescriptor connectService(java.lang.String p0) throws android.os.RemoteException { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.aiseal.IAiSealHostService {
        static final int TRANSACTION_connectService = 1;
        public Stub() { super(); }
        public static android.aiseal.IAiSealHostService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.aiseal.IAiSealHostService {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public android.os.ParcelFileDescriptor connectService(java.lang.String p0) throws android.os.RemoteException { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
        }
    }
}
