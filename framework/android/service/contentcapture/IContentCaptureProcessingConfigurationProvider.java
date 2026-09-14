package android.service.contentcapture;

public interface IContentCaptureProcessingConfigurationProvider extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.contentcapture.IContentCaptureProcessingConfigurationProvider";
    public void requestAllowlist(android.service.contentcapture.IContentCaptureProcessingConfigurationCallback p0) throws android.os.RemoteException;
    public void requestRules(android.service.contentcapture.IContentCaptureProcessingConfigurationCallback p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.service.contentcapture.IContentCaptureProcessingConfigurationProvider {
        static final int TRANSACTION_requestAllowlist = 1;
        static final int TRANSACTION_requestRules = 2;
        public Stub() { super(); }
        public static android.service.contentcapture.IContentCaptureProcessingConfigurationProvider asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.service.contentcapture.IContentCaptureProcessingConfigurationProvider {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void requestAllowlist(android.service.contentcapture.IContentCaptureProcessingConfigurationCallback p0) throws android.os.RemoteException {}
            public void requestRules(android.service.contentcapture.IContentCaptureProcessingConfigurationCallback p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.service.contentcapture.IContentCaptureProcessingConfigurationProvider {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void requestAllowlist(android.service.contentcapture.IContentCaptureProcessingConfigurationCallback p0) throws android.os.RemoteException {}
        public void requestRules(android.service.contentcapture.IContentCaptureProcessingConfigurationCallback p0) throws android.os.RemoteException {}
    }
}
