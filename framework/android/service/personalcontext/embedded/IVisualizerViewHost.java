package android.service.personalcontext.embedded;

public interface IVisualizerViewHost extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.personalcontext.embedded.IVisualizerViewHost";
    public void closeSession(android.os.ParcelUuid p0) throws android.os.RemoteException;
    public void createVisualizerSession(android.os.ParcelUuid p0, android.os.ParcelUuid p1, android.service.personalcontext.embedded.InsightSurfaceClientInfo p2, android.service.personalcontext.embedded.IInsightVisualizer p3, android.service.personalcontext.embedded.IVisualizationEventCallback p4) throws android.os.RemoteException;
    public void sendHints(android.os.ParcelUuid p0, java.util.List<android.service.personalcontext.hint.ContextHintWrapper> p1) throws android.os.RemoteException;
    public void updateClientInfo(android.os.ParcelUuid p0, android.service.personalcontext.embedded.InsightSurfaceClientInfo p1) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.service.personalcontext.embedded.IVisualizerViewHost {
        static final int TRANSACTION_closeSession = 3;
        static final int TRANSACTION_createVisualizerSession = 1;
        static final int TRANSACTION_sendHints = 2;
        static final int TRANSACTION_updateClientInfo = 4;
        public Stub() { super(); }
        public static android.service.personalcontext.embedded.IVisualizerViewHost asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.service.personalcontext.embedded.IVisualizerViewHost {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void closeSession(android.os.ParcelUuid p0) throws android.os.RemoteException {}
            public void createVisualizerSession(android.os.ParcelUuid p0, android.os.ParcelUuid p1, android.service.personalcontext.embedded.InsightSurfaceClientInfo p2, android.service.personalcontext.embedded.IInsightVisualizer p3, android.service.personalcontext.embedded.IVisualizationEventCallback p4) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void sendHints(android.os.ParcelUuid p0, java.util.List<android.service.personalcontext.hint.ContextHintWrapper> p1) throws android.os.RemoteException {}
            public void updateClientInfo(android.os.ParcelUuid p0, android.service.personalcontext.embedded.InsightSurfaceClientInfo p1) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.service.personalcontext.embedded.IVisualizerViewHost {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void closeSession(android.os.ParcelUuid p0) throws android.os.RemoteException {}
        public void createVisualizerSession(android.os.ParcelUuid p0, android.os.ParcelUuid p1, android.service.personalcontext.embedded.InsightSurfaceClientInfo p2, android.service.personalcontext.embedded.IInsightVisualizer p3, android.service.personalcontext.embedded.IVisualizationEventCallback p4) throws android.os.RemoteException {}
        public void sendHints(android.os.ParcelUuid p0, java.util.List<android.service.personalcontext.hint.ContextHintWrapper> p1) throws android.os.RemoteException {}
        public void updateClientInfo(android.os.ParcelUuid p0, android.service.personalcontext.embedded.InsightSurfaceClientInfo p1) throws android.os.RemoteException {}
    }
}
