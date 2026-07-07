package android.service.contentsafety;

public interface IContentSafetyAppService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.contentsafety.IContentSafetyAppService";
    public void onClassifyContent(android.app.contentsafety.ClassifiableContent p0, android.app.contentsafety.IContentSafetyCallback p1) throws android.os.RemoteException;
    public void onContentSafetyEnabled(boolean p0) throws android.os.RemoteException;

    public static class Default implements android.service.contentsafety.IContentSafetyAppService {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onClassifyContent(android.app.contentsafety.ClassifiableContent p0, android.app.contentsafety.IContentSafetyCallback p1) throws android.os.RemoteException {}
        public void onContentSafetyEnabled(boolean p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.service.contentsafety.IContentSafetyAppService {
        static final int TRANSACTION_onClassifyContent = 2;
        static final int TRANSACTION_onContentSafetyEnabled = 1;
        public Stub() { super(); }
        public static android.service.contentsafety.IContentSafetyAppService asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.service.contentsafety.IContentSafetyAppService {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onClassifyContent(android.app.contentsafety.ClassifiableContent p0, android.app.contentsafety.IContentSafetyCallback p1) throws android.os.RemoteException {}
            public void onContentSafetyEnabled(boolean p0) throws android.os.RemoteException {}
        }
    }
}
