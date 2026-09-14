package android.service.personalcontext.embedded;

public interface IInsightVisualizer extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.personalcontext.embedded.IInsightVisualizer";
    public void createRemoteViewsForHints(java.util.List<android.service.personalcontext.hint.ContextHintWrapper> p0, android.service.personalcontext.embedded.InsightSurfaceClientInfo p1, android.service.personalcontext.embedded.IRemoteViewsReceiver p2) throws android.os.RemoteException;
    public void onClientDisconnected() throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.service.personalcontext.embedded.IInsightVisualizer {
        static final int TRANSACTION_createRemoteViewsForHints = 1;
        static final int TRANSACTION_onClientDisconnected = 2;
        public Stub() { super(); }
        public static android.service.personalcontext.embedded.IInsightVisualizer asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.service.personalcontext.embedded.IInsightVisualizer {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void createRemoteViewsForHints(java.util.List<android.service.personalcontext.hint.ContextHintWrapper> p0, android.service.personalcontext.embedded.InsightSurfaceClientInfo p1, android.service.personalcontext.embedded.IRemoteViewsReceiver p2) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onClientDisconnected() throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.service.personalcontext.embedded.IInsightVisualizer {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void createRemoteViewsForHints(java.util.List<android.service.personalcontext.hint.ContextHintWrapper> p0, android.service.personalcontext.embedded.InsightSurfaceClientInfo p1, android.service.personalcontext.embedded.IRemoteViewsReceiver p2) throws android.os.RemoteException {}
        public void onClientDisconnected() throws android.os.RemoteException {}
    }
}
