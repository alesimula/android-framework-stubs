package android.hardware.camera2;

public interface ICameraInjectionToken extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.camera2.ICameraInjectionToken";

    public static class Default implements android.hardware.camera2.ICameraInjectionToken {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.camera2.ICameraInjectionToken {
        public Stub() { super(); }
        public static android.hardware.camera2.ICameraInjectionToken asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.hardware.camera2.ICameraInjectionToken {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
        }
    }
}
