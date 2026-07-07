package android.hardware.sensor;

public interface ISensorClientListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.sensor.ISensorClientListener";

    public static class Default implements android.hardware.sensor.ISensorClientListener {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.sensor.ISensorClientListener {
        public Stub() { super(); }
        public static android.hardware.sensor.ISensorClientListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.hardware.sensor.ISensorClientListener {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
        }
    }
}
