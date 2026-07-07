package android.service.voice;

public interface IDetectorSessionStorageService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.voice.IDetectorSessionStorageService";
    public void openFile(java.lang.String p0, com.android.internal.infra.AndroidFuture p1) throws android.os.RemoteException;

    public static class Default implements android.service.voice.IDetectorSessionStorageService {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void openFile(java.lang.String p0, com.android.internal.infra.AndroidFuture p1) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.service.voice.IDetectorSessionStorageService {
        static final int TRANSACTION_openFile = 1;
        public Stub() { super(); }
        public static android.service.voice.IDetectorSessionStorageService asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.service.voice.IDetectorSessionStorageService {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void openFile(java.lang.String p0, com.android.internal.infra.AndroidFuture p1) throws android.os.RemoteException {}
        }
    }
}
