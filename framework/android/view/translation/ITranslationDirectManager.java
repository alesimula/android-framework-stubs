package android.view.translation;

public interface ITranslationDirectManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.view.translation.ITranslationDirectManager";
    public void onFinishTranslationSession(int p0) throws android.os.RemoteException;
    public void onTranslationRequest(android.view.translation.TranslationRequest p0, int p1, android.os.ICancellationSignal p2, android.service.translation.ITranslationCallback p3) throws android.os.RemoteException;

    public static class Default implements android.view.translation.ITranslationDirectManager {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onFinishTranslationSession(int p0) throws android.os.RemoteException {}
        public void onTranslationRequest(android.view.translation.TranslationRequest p0, int p1, android.os.ICancellationSignal p2, android.service.translation.ITranslationCallback p3) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.view.translation.ITranslationDirectManager {
        static final int TRANSACTION_onFinishTranslationSession = 2;
        static final int TRANSACTION_onTranslationRequest = 1;
        public Stub() { super(); }
        public static android.view.translation.ITranslationDirectManager asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.view.translation.ITranslationDirectManager {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onFinishTranslationSession(int p0) throws android.os.RemoteException {}
            public void onTranslationRequest(android.view.translation.TranslationRequest p0, int p1, android.os.ICancellationSignal p2, android.service.translation.ITranslationCallback p3) throws android.os.RemoteException {}
        }
    }
}
