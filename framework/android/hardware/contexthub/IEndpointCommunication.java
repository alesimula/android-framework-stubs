package android.hardware.contexthub;

public interface IEndpointCommunication extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = null;
    public static final java.lang.String HASH = "4a4662588b9e38b5e93c37e46353efac231f7a98";
    public static final int SESSION_ID_INVALID = -1;
    public static final int VERSION = 5;
    public android.hardware.contexthub.SharedDataRegion allocateSharedDataRegion(android.hardware.contexthub.SharedDataRegionRequirements p0) throws android.os.RemoteException;
    public void closeEndpointSession(int p0, byte p1) throws android.os.RemoteException;
    public void endpointSessionOpenComplete(int p0) throws android.os.RemoteException;
    public void freeSharedDataRegion(int p0) throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public void openEndpointSession(int p0, android.hardware.contexthub.EndpointId p1, android.hardware.contexthub.EndpointId p2, java.lang.String p3) throws android.os.RemoteException;
    public int registerDataFlowHostSource(android.hardware.contexthub.EndpointId p0, android.hardware.contexthub.DataFlowInfo p1) throws android.os.RemoteException;
    public void registerDataFlowOffloadSink(android.hardware.contexthub.DataFlowSinkRegistrationParams p0, android.hardware.contexthub.IEndpointCommunication.IRegisterOffloadSinkCallback p1) throws android.os.RemoteException;
    public void registerEndpoint(android.hardware.contexthub.EndpointInfo p0) throws android.os.RemoteException;
    public int[] requestSessionIdRange(int p0) throws android.os.RemoteException;
    public void sendMessageDeliveryStatusToEndpoint(int p0, android.hardware.contexthub.MessageDeliveryStatus p1) throws android.os.RemoteException;
    public void sendMessageToEndpoint(int p0, android.hardware.contexthub.Message p1) throws android.os.RemoteException;
    public void unregister() throws android.os.RemoteException;
    public void unregisterDataFlowHostSink(android.hardware.contexthub.EndpointId p0, android.hardware.contexthub.DataFlowId p1) throws android.os.RemoteException;
    public void unregisterDataFlowHostSource(int p0) throws android.os.RemoteException;
    public void unregisterEndpoint(android.hardware.contexthub.EndpointInfo p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.contexthub.IEndpointCommunication {
        public Default() {}
        public android.hardware.contexthub.SharedDataRegion allocateSharedDataRegion(android.hardware.contexthub.SharedDataRegionRequirements p0) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
        public void closeEndpointSession(int p0, byte p1) throws android.os.RemoteException {}
        public void endpointSessionOpenComplete(int p0) throws android.os.RemoteException {}
        public void freeSharedDataRegion(int p0) throws android.os.RemoteException {}
        public java.lang.String getInterfaceHash() { return null; }
        public int getInterfaceVersion() { return 0; }
        public void openEndpointSession(int p0, android.hardware.contexthub.EndpointId p1, android.hardware.contexthub.EndpointId p2, java.lang.String p3) throws android.os.RemoteException {}
        public int registerDataFlowHostSource(android.hardware.contexthub.EndpointId p0, android.hardware.contexthub.DataFlowInfo p1) throws android.os.RemoteException { return 0; }
        public void registerDataFlowOffloadSink(android.hardware.contexthub.DataFlowSinkRegistrationParams p0, android.hardware.contexthub.IEndpointCommunication.IRegisterOffloadSinkCallback p1) throws android.os.RemoteException {}
        public void registerEndpoint(android.hardware.contexthub.EndpointInfo p0) throws android.os.RemoteException {}
        public int[] requestSessionIdRange(int p0) throws android.os.RemoteException { return null; }
        public void sendMessageDeliveryStatusToEndpoint(int p0, android.hardware.contexthub.MessageDeliveryStatus p1) throws android.os.RemoteException {}
        public void sendMessageToEndpoint(int p0, android.hardware.contexthub.Message p1) throws android.os.RemoteException {}
        public void unregister() throws android.os.RemoteException {}
        public void unregisterDataFlowHostSink(android.hardware.contexthub.EndpointId p0, android.hardware.contexthub.DataFlowId p1) throws android.os.RemoteException {}
        public void unregisterDataFlowHostSource(int p0) throws android.os.RemoteException {}
        public void unregisterEndpoint(android.hardware.contexthub.EndpointInfo p0) throws android.os.RemoteException {}
    }

    public static interface IRegisterOffloadSinkCallback extends android.os.IInterface {
        public static final java.lang.String DESCRIPTOR = null;
        public static final java.lang.String HASH = "4a4662588b9e38b5e93c37e46353efac231f7a98";
        public static final int VERSION = 5;
        public long addSinkInRegion(android.hardware.contexthub.SharedDataRegion p0) throws android.os.RemoteException;
        public java.lang.String getInterfaceHash() throws android.os.RemoteException;
        public int getInterfaceVersion() throws android.os.RemoteException;

        public static class Default implements android.hardware.contexthub.IEndpointCommunication.IRegisterOffloadSinkCallback {
            public Default() {}
            public long addSinkInRegion(android.hardware.contexthub.SharedDataRegion p0) throws android.os.RemoteException { return 0L; }
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceHash() { return null; }
            public int getInterfaceVersion() { return 0; }
        }

        public static abstract class Stub extends android.os.Binder implements android.hardware.contexthub.IEndpointCommunication.IRegisterOffloadSinkCallback {
            static final int TRANSACTION_addSinkInRegion = 1;
            static final int TRANSACTION_getInterfaceHash = 16777214;
            static final int TRANSACTION_getInterfaceVersion = 16777215;
            public Stub() { super(); }
            public static android.hardware.contexthub.IEndpointCommunication.IRegisterOffloadSinkCallback asInterface(android.os.IBinder p0) { return null; }
            public android.os.IBinder asBinder() { return null; }
            public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

            private static final class Proxy implements android.hardware.contexthub.IEndpointCommunication.IRegisterOffloadSinkCallback {
                private java.lang.String mCachedHash;
                private int mCachedVersion;
                private android.os.IBinder mRemote;
                Proxy(android.os.IBinder p0) {}
                public long addSinkInRegion(android.hardware.contexthub.SharedDataRegion p0) throws android.os.RemoteException { return 0L; }
                public android.os.IBinder asBinder() { return null; }
                public final java.lang.String getInterfaceDescriptor() { return null; }
                public java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
                public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            }
        }
    }

    public static @interface SharedDataErrors {
        public static final byte ERR_INSUFFICIENT_MEMORY = 1;
        public static final byte ERR_INVALID_CONFIGURATION = 2;
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.contexthub.IEndpointCommunication {
        static final int TRANSACTION_allocateSharedDataRegion = 10;
        static final int TRANSACTION_closeEndpointSession = 7;
        static final int TRANSACTION_endpointSessionOpenComplete = 8;
        static final int TRANSACTION_freeSharedDataRegion = 11;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_openEndpointSession = 4;
        static final int TRANSACTION_registerDataFlowHostSource = 12;
        static final int TRANSACTION_registerDataFlowOffloadSink = 14;
        static final int TRANSACTION_registerEndpoint = 1;
        static final int TRANSACTION_requestSessionIdRange = 3;
        static final int TRANSACTION_sendMessageDeliveryStatusToEndpoint = 6;
        static final int TRANSACTION_sendMessageToEndpoint = 5;
        static final int TRANSACTION_unregister = 9;
        static final int TRANSACTION_unregisterDataFlowHostSink = 15;
        static final int TRANSACTION_unregisterDataFlowHostSource = 13;
        static final int TRANSACTION_unregisterEndpoint = 2;
        public Stub() { super(); }
        public static android.hardware.contexthub.IEndpointCommunication asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.hardware.contexthub.IEndpointCommunication {
            private java.lang.String mCachedHash;
            private int mCachedVersion;
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.hardware.contexthub.SharedDataRegion allocateSharedDataRegion(android.hardware.contexthub.SharedDataRegionRequirements p0) throws android.os.RemoteException { return null; }
            public android.os.IBinder asBinder() { return null; }
            public void closeEndpointSession(int p0, byte p1) throws android.os.RemoteException {}
            public void endpointSessionOpenComplete(int p0) throws android.os.RemoteException {}
            public void freeSharedDataRegion(int p0) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public void openEndpointSession(int p0, android.hardware.contexthub.EndpointId p1, android.hardware.contexthub.EndpointId p2, java.lang.String p3) throws android.os.RemoteException {}
            public int registerDataFlowHostSource(android.hardware.contexthub.EndpointId p0, android.hardware.contexthub.DataFlowInfo p1) throws android.os.RemoteException { return 0; }
            public void registerDataFlowOffloadSink(android.hardware.contexthub.DataFlowSinkRegistrationParams p0, android.hardware.contexthub.IEndpointCommunication.IRegisterOffloadSinkCallback p1) throws android.os.RemoteException {}
            public void registerEndpoint(android.hardware.contexthub.EndpointInfo p0) throws android.os.RemoteException {}
            public int[] requestSessionIdRange(int p0) throws android.os.RemoteException { return null; }
            public void sendMessageDeliveryStatusToEndpoint(int p0, android.hardware.contexthub.MessageDeliveryStatus p1) throws android.os.RemoteException {}
            public void sendMessageToEndpoint(int p0, android.hardware.contexthub.Message p1) throws android.os.RemoteException {}
            public void unregister() throws android.os.RemoteException {}
            public void unregisterDataFlowHostSink(android.hardware.contexthub.EndpointId p0, android.hardware.contexthub.DataFlowId p1) throws android.os.RemoteException {}
            public void unregisterDataFlowHostSource(int p0) throws android.os.RemoteException {}
            public void unregisterEndpoint(android.hardware.contexthub.EndpointInfo p0) throws android.os.RemoteException {}
        }
    }
}
