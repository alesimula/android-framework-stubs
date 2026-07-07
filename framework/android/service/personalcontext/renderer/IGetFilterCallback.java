package android.service.personalcontext.renderer;

public interface IGetFilterCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.personalcontext.renderer.IGetFilterCallback";
    public void updateFilter(android.service.personalcontext.insight.InsightFilter p0) throws android.os.RemoteException;

    public static class Default implements android.service.personalcontext.renderer.IGetFilterCallback {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void updateFilter(android.service.personalcontext.insight.InsightFilter p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.service.personalcontext.renderer.IGetFilterCallback {
        static final int TRANSACTION_updateFilter = 1;
        public Stub() { super(); }
        public static android.service.personalcontext.renderer.IGetFilterCallback asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.service.personalcontext.renderer.IGetFilterCallback {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void updateFilter(android.service.personalcontext.insight.InsightFilter p0) throws android.os.RemoteException {}
        }
    }
}
