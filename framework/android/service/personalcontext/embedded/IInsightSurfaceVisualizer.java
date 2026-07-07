package android.service.personalcontext.embedded;

public interface IInsightSurfaceVisualizer extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.personalcontext.embedded.IInsightSurfaceVisualizer";
    public void createVisualizationForClient(android.service.personalcontext.insight.ContextInsightWrapper p0, android.service.personalcontext.embedded.InsightSurfaceClientInfo p1, android.service.personalcontext.RenderToken p2, android.service.personalcontext.embedded.IVisualizationResult p3, android.service.personalcontext.IOpCallback p4) throws android.os.RemoteException;
    public void onClientDisconnected(android.service.personalcontext.embedded.InsightSurfaceClientInfo p0, android.service.personalcontext.IOpCallback p1) throws android.os.RemoteException;

    public static class Default implements android.service.personalcontext.embedded.IInsightSurfaceVisualizer {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void createVisualizationForClient(android.service.personalcontext.insight.ContextInsightWrapper p0, android.service.personalcontext.embedded.InsightSurfaceClientInfo p1, android.service.personalcontext.RenderToken p2, android.service.personalcontext.embedded.IVisualizationResult p3, android.service.personalcontext.IOpCallback p4) throws android.os.RemoteException {}
        public void onClientDisconnected(android.service.personalcontext.embedded.InsightSurfaceClientInfo p0, android.service.personalcontext.IOpCallback p1) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.service.personalcontext.embedded.IInsightSurfaceVisualizer {
        static final int TRANSACTION_createVisualizationForClient = 1;
        static final int TRANSACTION_onClientDisconnected = 2;
        public Stub() { super(); }
        public static android.service.personalcontext.embedded.IInsightSurfaceVisualizer asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.service.personalcontext.embedded.IInsightSurfaceVisualizer {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void createVisualizationForClient(android.service.personalcontext.insight.ContextInsightWrapper p0, android.service.personalcontext.embedded.InsightSurfaceClientInfo p1, android.service.personalcontext.RenderToken p2, android.service.personalcontext.embedded.IVisualizationResult p3, android.service.personalcontext.IOpCallback p4) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onClientDisconnected(android.service.personalcontext.embedded.InsightSurfaceClientInfo p0, android.service.personalcontext.IOpCallback p1) throws android.os.RemoteException {}
        }
    }
}
