package android.service.personalcontext.embedded;

public interface IInsightSurfaceClient extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.personalcontext.embedded.IInsightSurfaceClient";
    public void onReceiveInsight(android.service.personalcontext.insight.ContextInsightWrapper p0) throws android.os.RemoteException;
    public void onRegistered() throws android.os.RemoteException;
    public void onSizeChanged(int p0, int p1) throws android.os.RemoteException;
    public void onSurfaceCreated(android.view.SurfaceControlViewHost.SurfacePackage p0, android.service.personalcontext.embedded.IInsightSurfaceSession p1) throws android.os.RemoteException;
    public void onSurfaceReleased(android.view.SurfaceControlViewHost.SurfacePackage p0) throws android.os.RemoteException;
    public void onSurfaceUpdated(android.view.SurfaceControlViewHost.SurfacePackage p0) throws android.os.RemoteException;
    public void onVisualizationError(int p0) throws android.os.RemoteException;

    public static class Default implements android.service.personalcontext.embedded.IInsightSurfaceClient {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onReceiveInsight(android.service.personalcontext.insight.ContextInsightWrapper p0) throws android.os.RemoteException {}
        public void onRegistered() throws android.os.RemoteException {}
        public void onSizeChanged(int p0, int p1) throws android.os.RemoteException {}
        public void onSurfaceCreated(android.view.SurfaceControlViewHost.SurfacePackage p0, android.service.personalcontext.embedded.IInsightSurfaceSession p1) throws android.os.RemoteException {}
        public void onSurfaceReleased(android.view.SurfaceControlViewHost.SurfacePackage p0) throws android.os.RemoteException {}
        public void onSurfaceUpdated(android.view.SurfaceControlViewHost.SurfacePackage p0) throws android.os.RemoteException {}
        public void onVisualizationError(int p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.service.personalcontext.embedded.IInsightSurfaceClient {
        static final int TRANSACTION_onReceiveInsight = 4;
        static final int TRANSACTION_onRegistered = 7;
        static final int TRANSACTION_onSizeChanged = 5;
        static final int TRANSACTION_onSurfaceCreated = 1;
        static final int TRANSACTION_onSurfaceReleased = 2;
        static final int TRANSACTION_onSurfaceUpdated = 3;
        static final int TRANSACTION_onVisualizationError = 6;
        public Stub() { super(); }
        public static android.service.personalcontext.embedded.IInsightSurfaceClient asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.service.personalcontext.embedded.IInsightSurfaceClient {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onReceiveInsight(android.service.personalcontext.insight.ContextInsightWrapper p0) throws android.os.RemoteException {}
            public void onRegistered() throws android.os.RemoteException {}
            public void onSizeChanged(int p0, int p1) throws android.os.RemoteException {}
            public void onSurfaceCreated(android.view.SurfaceControlViewHost.SurfacePackage p0, android.service.personalcontext.embedded.IInsightSurfaceSession p1) throws android.os.RemoteException {}
            public void onSurfaceReleased(android.view.SurfaceControlViewHost.SurfacePackage p0) throws android.os.RemoteException {}
            public void onSurfaceUpdated(android.view.SurfaceControlViewHost.SurfacePackage p0) throws android.os.RemoteException {}
            public void onVisualizationError(int p0) throws android.os.RemoteException {}
        }
    }
}
