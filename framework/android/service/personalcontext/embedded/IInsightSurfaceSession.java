package android.service.personalcontext.embedded;

public interface IInsightSurfaceSession extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.personalcontext.embedded.IInsightSurfaceSession";
    public static final int UPDATE_DECLINED = 1;
    public static final int UPDATE_OK = 0;
    public void onClientUpdated(android.service.personalcontext.embedded.InsightSurfaceClientInfo p0, android.service.personalcontext.embedded.InsightSurfaceClientInfo p1, android.os.ResultReceiver p2, android.service.personalcontext.IOpCallback p3) throws android.os.RemoteException;

    public static class Default implements android.service.personalcontext.embedded.IInsightSurfaceSession {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onClientUpdated(android.service.personalcontext.embedded.InsightSurfaceClientInfo p0, android.service.personalcontext.embedded.InsightSurfaceClientInfo p1, android.os.ResultReceiver p2, android.service.personalcontext.IOpCallback p3) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.service.personalcontext.embedded.IInsightSurfaceSession {
        static final int TRANSACTION_onClientUpdated = 1;
        public Stub() { super(); }
        public static android.service.personalcontext.embedded.IInsightSurfaceSession asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.service.personalcontext.embedded.IInsightSurfaceSession {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onClientUpdated(android.service.personalcontext.embedded.InsightSurfaceClientInfo p0, android.service.personalcontext.embedded.InsightSurfaceClientInfo p1, android.os.ResultReceiver p2, android.service.personalcontext.IOpCallback p3) throws android.os.RemoteException {}
        }
    }
}
