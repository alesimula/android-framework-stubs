package android.service.contentcapture;

public interface IContentCaptureProcessingConfigurationCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.contentcapture.IContentCaptureProcessingConfigurationCallback";
    public void onAllowlistRetrieveFailed() throws android.os.RemoteException;
    public void onAllowlistRetrieved(java.util.List<android.service.contentcapture.ContentCaptureAllowlistEntry> p0) throws android.os.RemoteException;
    public void onRulesRetrieveFailed() throws android.os.RemoteException;
    public void onRulesRetrieved(java.util.List<android.service.contentcapture.ContentCaptureProcessingRule> p0) throws android.os.RemoteException;

    public static class Default implements android.service.contentcapture.IContentCaptureProcessingConfigurationCallback {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onAllowlistRetrieveFailed() throws android.os.RemoteException {}
        public void onAllowlistRetrieved(java.util.List<android.service.contentcapture.ContentCaptureAllowlistEntry> p0) throws android.os.RemoteException {}
        public void onRulesRetrieveFailed() throws android.os.RemoteException {}
        public void onRulesRetrieved(java.util.List<android.service.contentcapture.ContentCaptureProcessingRule> p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.service.contentcapture.IContentCaptureProcessingConfigurationCallback {
        static final int TRANSACTION_onAllowlistRetrieveFailed = 2;
        static final int TRANSACTION_onAllowlistRetrieved = 1;
        static final int TRANSACTION_onRulesRetrieveFailed = 4;
        static final int TRANSACTION_onRulesRetrieved = 3;
        public Stub() { super(); }
        public static android.service.contentcapture.IContentCaptureProcessingConfigurationCallback asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.service.contentcapture.IContentCaptureProcessingConfigurationCallback {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onAllowlistRetrieveFailed() throws android.os.RemoteException {}
            public void onAllowlistRetrieved(java.util.List<android.service.contentcapture.ContentCaptureAllowlistEntry> p0) throws android.os.RemoteException {}
            public void onRulesRetrieveFailed() throws android.os.RemoteException {}
            public void onRulesRetrieved(java.util.List<android.service.contentcapture.ContentCaptureProcessingRule> p0) throws android.os.RemoteException {}
        }
    }
}
