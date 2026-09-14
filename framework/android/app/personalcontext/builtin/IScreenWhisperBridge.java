package android.app.personalcontext.builtin;

public interface IScreenWhisperBridge extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.personalcontext.builtin.IScreenWhisperBridge";
    public void showRemoteAutofill(android.app.personalcontext.insight.ContextInsightWrapper p0, android.view.autofill.AutofillId p1, android.os.IBinder p2, int p3) throws android.os.RemoteException;
    public void showWhisper(android.app.personalcontext.insight.ContextInsightWrapper p0) throws android.os.RemoteException;

    public static class Default implements android.app.personalcontext.builtin.IScreenWhisperBridge {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void showRemoteAutofill(android.app.personalcontext.insight.ContextInsightWrapper p0, android.view.autofill.AutofillId p1, android.os.IBinder p2, int p3) throws android.os.RemoteException {}
        public void showWhisper(android.app.personalcontext.insight.ContextInsightWrapper p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.app.personalcontext.builtin.IScreenWhisperBridge {
        static final int TRANSACTION_showRemoteAutofill = 1;
        static final int TRANSACTION_showWhisper = 2;
        public Stub() { super(); }
        public static android.app.personalcontext.builtin.IScreenWhisperBridge asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.app.personalcontext.builtin.IScreenWhisperBridge {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void showRemoteAutofill(android.app.personalcontext.insight.ContextInsightWrapper p0, android.view.autofill.AutofillId p1, android.os.IBinder p2, int p3) throws android.os.RemoteException {}
            public void showWhisper(android.app.personalcontext.insight.ContextInsightWrapper p0) throws android.os.RemoteException {}
        }
    }
}
