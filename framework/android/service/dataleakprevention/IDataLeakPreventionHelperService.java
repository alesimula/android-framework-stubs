package android.service.dataleakprevention;

public interface IDataLeakPreventionHelperService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.dataleakprevention.IDataLeakPreventionHelperService";
    public void computeContentUriContextForLogging(android.net.Uri p0, android.service.dataleakprevention.IFileContextForLoggingCallback p1) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.service.dataleakprevention.IDataLeakPreventionHelperService {
        static final int TRANSACTION_computeContentUriContextForLogging = 1;
        public Stub() { super(); }
        public static android.service.dataleakprevention.IDataLeakPreventionHelperService asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.service.dataleakprevention.IDataLeakPreventionHelperService {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void computeContentUriContextForLogging(android.net.Uri p0, android.service.dataleakprevention.IFileContextForLoggingCallback p1) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
        }
    }

    public static class Default implements android.service.dataleakprevention.IDataLeakPreventionHelperService {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void computeContentUriContextForLogging(android.net.Uri p0, android.service.dataleakprevention.IFileContextForLoggingCallback p1) throws android.os.RemoteException {}
    }
}
