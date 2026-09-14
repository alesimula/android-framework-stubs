package android.app.personalcontext.builtin;

public interface IAutofillInsightConverterService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.personalcontext.builtin.IAutofillInsightConverterService";
    public void convert(android.app.personalcontext.insight.ContextInsightWrapper p0, android.service.personalcontext.builtin.InlineAutofillData p1) throws android.os.RemoteException;

    public static class Default implements android.app.personalcontext.builtin.IAutofillInsightConverterService {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void convert(android.app.personalcontext.insight.ContextInsightWrapper p0, android.service.personalcontext.builtin.InlineAutofillData p1) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.app.personalcontext.builtin.IAutofillInsightConverterService {
        static final int TRANSACTION_convert = 1;
        public Stub() { super(); }
        public static android.app.personalcontext.builtin.IAutofillInsightConverterService asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.app.personalcontext.builtin.IAutofillInsightConverterService {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void convert(android.app.personalcontext.insight.ContextInsightWrapper p0, android.service.personalcontext.builtin.InlineAutofillData p1) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
        }
    }
}
