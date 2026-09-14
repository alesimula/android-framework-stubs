package android.graphics;

public interface IImageDecoderService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.graphics.IImageDecoderService";
    public void crash() throws android.os.RemoteException;
    public void ping() throws android.os.RemoteException;

    public static class Default implements android.graphics.IImageDecoderService {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void crash() throws android.os.RemoteException {}
        public void ping() throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.graphics.IImageDecoderService {
        static final int TRANSACTION_crash = 2;
        static final int TRANSACTION_ping = 1;
        public Stub() { super(); }
        public static android.graphics.IImageDecoderService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.graphics.IImageDecoderService {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void crash() throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void ping() throws android.os.RemoteException {}
        }
    }
}
