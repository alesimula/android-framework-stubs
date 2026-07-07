package android.hardware.contexthub;

public interface IContextHubEndpointCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.contexthub.IContextHubEndpointCallback";
    public void onDataFlowHostSinkRegistered(android.hardware.contexthub.DataFlowSinkContext p0, android.hardware.contexthub.HubEndpointInfo p1, android.hardware.contexthub.HubMessage p2, int p3) throws android.os.RemoteException;
    public void onDataFlowOffloadEndpointUnregistered(android.hardware.contexthub.DataFlowId p0, android.hardware.contexthub.HubEndpointInfo p1) throws android.os.RemoteException;
    public void onDataFlowsInaccessible(android.hardware.contexthub.DataFlowId[] p0) throws android.os.RemoteException;
    public void onMessageReceived(int p0, android.hardware.contexthub.HubMessage p1) throws android.os.RemoteException;
    public void onSessionClosed(int p0, int p1) throws android.os.RemoteException;
    public void onSessionOpenComplete(int p0) throws android.os.RemoteException;
    public void onSessionOpenRequest(int p0, android.hardware.contexthub.HubEndpointInfo p1, java.lang.String p2) throws android.os.RemoteException;

    public static class Default implements android.hardware.contexthub.IContextHubEndpointCallback {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onDataFlowHostSinkRegistered(android.hardware.contexthub.DataFlowSinkContext p0, android.hardware.contexthub.HubEndpointInfo p1, android.hardware.contexthub.HubMessage p2, int p3) throws android.os.RemoteException {}
        public void onDataFlowOffloadEndpointUnregistered(android.hardware.contexthub.DataFlowId p0, android.hardware.contexthub.HubEndpointInfo p1) throws android.os.RemoteException {}
        public void onDataFlowsInaccessible(android.hardware.contexthub.DataFlowId[] p0) throws android.os.RemoteException {}
        public void onMessageReceived(int p0, android.hardware.contexthub.HubMessage p1) throws android.os.RemoteException {}
        public void onSessionClosed(int p0, int p1) throws android.os.RemoteException {}
        public void onSessionOpenComplete(int p0) throws android.os.RemoteException {}
        public void onSessionOpenRequest(int p0, android.hardware.contexthub.HubEndpointInfo p1, java.lang.String p2) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.contexthub.IContextHubEndpointCallback {
        static final int TRANSACTION_onDataFlowHostSinkRegistered = 5;
        static final int TRANSACTION_onDataFlowOffloadEndpointUnregistered = 6;
        static final int TRANSACTION_onDataFlowsInaccessible = 7;
        static final int TRANSACTION_onMessageReceived = 4;
        static final int TRANSACTION_onSessionClosed = 2;
        static final int TRANSACTION_onSessionOpenComplete = 3;
        static final int TRANSACTION_onSessionOpenRequest = 1;
        public Stub() { super(); }
        public static android.hardware.contexthub.IContextHubEndpointCallback asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.hardware.contexthub.IContextHubEndpointCallback {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onDataFlowHostSinkRegistered(android.hardware.contexthub.DataFlowSinkContext p0, android.hardware.contexthub.HubEndpointInfo p1, android.hardware.contexthub.HubMessage p2, int p3) throws android.os.RemoteException {}
            public void onDataFlowOffloadEndpointUnregistered(android.hardware.contexthub.DataFlowId p0, android.hardware.contexthub.HubEndpointInfo p1) throws android.os.RemoteException {}
            public void onDataFlowsInaccessible(android.hardware.contexthub.DataFlowId[] p0) throws android.os.RemoteException {}
            public void onMessageReceived(int p0, android.hardware.contexthub.HubMessage p1) throws android.os.RemoteException {}
            public void onSessionClosed(int p0, int p1) throws android.os.RemoteException {}
            public void onSessionOpenComplete(int p0) throws android.os.RemoteException {}
            public void onSessionOpenRequest(int p0, android.hardware.contexthub.HubEndpointInfo p1, java.lang.String p2) throws android.os.RemoteException {}
        }
    }
}
