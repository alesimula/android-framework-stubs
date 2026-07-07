package android.hardware.contexthub;

public interface IContextHubEndpoint extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.contexthub.IContextHubEndpoint";
    public static final int SESSION_ID_INVALID = -1;
    public android.hardware.contexthub.SharedDataRegion allocateSharedDataRegion(android.hardware.contexthub.SharedDataRegionRequirements p0) throws android.os.RemoteException;
    public void closeSession(int p0, int p1) throws android.os.RemoteException;
    public void freeSharedDataRegion(int p0) throws android.os.RemoteException;
    public android.hardware.contexthub.HubEndpointInfo getAssignedHubEndpointInfo() throws android.os.RemoteException;
    public void onCallbackFinished() throws android.os.RemoteException;
    public int openSession(android.hardware.contexthub.HubEndpointInfo p0, java.lang.String p1) throws android.os.RemoteException;
    public void openSessionRequestComplete(int p0) throws android.os.RemoteException;
    public int registerDataFlowHostSource(android.hardware.contexthub.DataFlowInfo p0) throws android.os.RemoteException;
    public void registerDataFlowOffloadSink(android.hardware.contexthub.DataFlowSinkContext p0, android.hardware.contexthub.HubEndpointInfo p1, android.hardware.contexthub.IContextHubEndpoint.IRegisterOffloadSinkCallback p2, android.hardware.contexthub.HubMessage p3, int p4, android.hardware.location.IContextHubTransactionCallback p5) throws android.os.RemoteException;
    public void sendMessage(int p0, android.hardware.contexthub.HubMessage p1, android.hardware.location.IContextHubTransactionCallback p2) throws android.os.RemoteException;
    public void sendMessageDeliveryStatus(int p0, int p1, byte p2) throws android.os.RemoteException;
    public void unregister() throws android.os.RemoteException;
    public void unregisterDataFlowHostSink(android.hardware.contexthub.DataFlowId p0) throws android.os.RemoteException;
    public void unregisterDataFlowHostSource(int p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.contexthub.IContextHubEndpoint {
        public Default() {}
        public android.hardware.contexthub.SharedDataRegion allocateSharedDataRegion(android.hardware.contexthub.SharedDataRegionRequirements p0) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
        public void closeSession(int p0, int p1) throws android.os.RemoteException {}
        public void freeSharedDataRegion(int p0) throws android.os.RemoteException {}
        public android.hardware.contexthub.HubEndpointInfo getAssignedHubEndpointInfo() throws android.os.RemoteException { return null; }
        public void onCallbackFinished() throws android.os.RemoteException {}
        public int openSession(android.hardware.contexthub.HubEndpointInfo p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public void openSessionRequestComplete(int p0) throws android.os.RemoteException {}
        public int registerDataFlowHostSource(android.hardware.contexthub.DataFlowInfo p0) throws android.os.RemoteException { return 0; }
        public void registerDataFlowOffloadSink(android.hardware.contexthub.DataFlowSinkContext p0, android.hardware.contexthub.HubEndpointInfo p1, android.hardware.contexthub.IContextHubEndpoint.IRegisterOffloadSinkCallback p2, android.hardware.contexthub.HubMessage p3, int p4, android.hardware.location.IContextHubTransactionCallback p5) throws android.os.RemoteException {}
        public void sendMessage(int p0, android.hardware.contexthub.HubMessage p1, android.hardware.location.IContextHubTransactionCallback p2) throws android.os.RemoteException {}
        public void sendMessageDeliveryStatus(int p0, int p1, byte p2) throws android.os.RemoteException {}
        public void unregister() throws android.os.RemoteException {}
        public void unregisterDataFlowHostSink(android.hardware.contexthub.DataFlowId p0) throws android.os.RemoteException {}
        public void unregisterDataFlowHostSource(int p0) throws android.os.RemoteException {}
    }

    public static interface IRegisterOffloadSinkCallback extends android.os.IInterface {
        public static final java.lang.String DESCRIPTOR = "android.hardware.contexthub.IContextHubEndpoint.IRegisterOffloadSinkCallback";
        public long addSinkInRegion(android.hardware.contexthub.SharedDataRegion p0) throws android.os.RemoteException;

        public static class Default implements android.hardware.contexthub.IContextHubEndpoint.IRegisterOffloadSinkCallback {
            public Default() {}
            public long addSinkInRegion(android.hardware.contexthub.SharedDataRegion p0) throws android.os.RemoteException { return 0L; }
            public android.os.IBinder asBinder() { return null; }
        }

        public static abstract class Stub extends android.os.Binder implements android.hardware.contexthub.IContextHubEndpoint.IRegisterOffloadSinkCallback {
            static final int TRANSACTION_addSinkInRegion = 1;
            public Stub() { super(); }
            public static android.hardware.contexthub.IContextHubEndpoint.IRegisterOffloadSinkCallback asInterface(android.os.IBinder p0) { return null; }
            public static java.lang.String getDefaultTransactionName(int p0) { return null; }
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getTransactionName(int p0) { return null; }
            public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

            private static final class Proxy implements android.hardware.contexthub.IContextHubEndpoint.IRegisterOffloadSinkCallback {
                private android.os.IBinder mRemote;
                Proxy(android.os.IBinder p0) {}
                public long addSinkInRegion(android.hardware.contexthub.SharedDataRegion p0) throws android.os.RemoteException { return 0L; }
                public android.os.IBinder asBinder() { return null; }
                public final java.lang.String getInterfaceDescriptor() { return null; }
            }
        }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.contexthub.IContextHubEndpoint {
        static final int TRANSACTION_allocateSharedDataRegion = 9;
        static final int TRANSACTION_closeSession = 3;
        static final int TRANSACTION_freeSharedDataRegion = 10;
        static final int TRANSACTION_getAssignedHubEndpointInfo = 1;
        static final int TRANSACTION_onCallbackFinished = 8;
        static final int TRANSACTION_openSession = 2;
        static final int TRANSACTION_openSessionRequestComplete = 4;
        static final int TRANSACTION_registerDataFlowHostSource = 11;
        static final int TRANSACTION_registerDataFlowOffloadSink = 13;
        static final int TRANSACTION_sendMessage = 6;
        static final int TRANSACTION_sendMessageDeliveryStatus = 7;
        static final int TRANSACTION_unregister = 5;
        static final int TRANSACTION_unregisterDataFlowHostSink = 14;
        static final int TRANSACTION_unregisterDataFlowHostSource = 12;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static android.hardware.contexthub.IContextHubEndpoint asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        protected void allocateSharedDataRegion_enforcePermission() throws java.lang.SecurityException {}
        public android.os.IBinder asBinder() { return null; }
        protected void closeSession_enforcePermission() throws java.lang.SecurityException {}
        protected void freeSharedDataRegion_enforcePermission() throws java.lang.SecurityException {}
        public java.lang.String getTransactionName(int p0) { return null; }
        protected void onCallbackFinished_enforcePermission() throws java.lang.SecurityException {}
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void openSessionRequestComplete_enforcePermission() throws java.lang.SecurityException {}
        protected void openSession_enforcePermission() throws java.lang.SecurityException {}
        protected void registerDataFlowHostSource_enforcePermission() throws java.lang.SecurityException {}
        protected void registerDataFlowOffloadSink_enforcePermission() throws java.lang.SecurityException {}
        protected void sendMessageDeliveryStatus_enforcePermission() throws java.lang.SecurityException {}
        protected void sendMessage_enforcePermission() throws java.lang.SecurityException {}
        protected void unregisterDataFlowHostSink_enforcePermission() throws java.lang.SecurityException {}
        protected void unregisterDataFlowHostSource_enforcePermission() throws java.lang.SecurityException {}
        protected void unregister_enforcePermission() throws java.lang.SecurityException {}

        private static final class Proxy implements android.hardware.contexthub.IContextHubEndpoint {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.hardware.contexthub.SharedDataRegion allocateSharedDataRegion(android.hardware.contexthub.SharedDataRegionRequirements p0) throws android.os.RemoteException { return null; }
            public android.os.IBinder asBinder() { return null; }
            public void closeSession(int p0, int p1) throws android.os.RemoteException {}
            public void freeSharedDataRegion(int p0) throws android.os.RemoteException {}
            public android.hardware.contexthub.HubEndpointInfo getAssignedHubEndpointInfo() throws android.os.RemoteException { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onCallbackFinished() throws android.os.RemoteException {}
            public int openSession(android.hardware.contexthub.HubEndpointInfo p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public void openSessionRequestComplete(int p0) throws android.os.RemoteException {}
            public int registerDataFlowHostSource(android.hardware.contexthub.DataFlowInfo p0) throws android.os.RemoteException { return 0; }
            public void registerDataFlowOffloadSink(android.hardware.contexthub.DataFlowSinkContext p0, android.hardware.contexthub.HubEndpointInfo p1, android.hardware.contexthub.IContextHubEndpoint.IRegisterOffloadSinkCallback p2, android.hardware.contexthub.HubMessage p3, int p4, android.hardware.location.IContextHubTransactionCallback p5) throws android.os.RemoteException {}
            public void sendMessage(int p0, android.hardware.contexthub.HubMessage p1, android.hardware.location.IContextHubTransactionCallback p2) throws android.os.RemoteException {}
            public void sendMessageDeliveryStatus(int p0, int p1, byte p2) throws android.os.RemoteException {}
            public void unregister() throws android.os.RemoteException {}
            public void unregisterDataFlowHostSink(android.hardware.contexthub.DataFlowId p0) throws android.os.RemoteException {}
            public void unregisterDataFlowHostSource(int p0) throws android.os.RemoteException {}
        }
    }
}
