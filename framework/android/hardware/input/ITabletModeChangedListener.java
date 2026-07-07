package android.hardware.input;

public interface ITabletModeChangedListener extends android.os.IInterface {
    public void onTabletModeChanged(long p0, boolean p1) throws android.os.RemoteException;

    public static class Default implements android.hardware.input.ITabletModeChangedListener {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onTabletModeChanged(long p0, boolean p1) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.input.ITabletModeChangedListener {
        public static final java.lang.String DESCRIPTOR = "android.hardware.input.ITabletModeChangedListener";
        static final int TRANSACTION_onTabletModeChanged = 1;
        public Stub() { super(); }
        public static android.hardware.input.ITabletModeChangedListener asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.hardware.input.ITabletModeChangedListener {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onTabletModeChanged(long p0, boolean p1) throws android.os.RemoteException {}
        }
    }
}
