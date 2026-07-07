package android.service.personalcontext.attribution;

public interface IAttributionHandler extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.personalcontext.attribution.IAttributionHandler";
    public void handleInsightAttribution(android.service.personalcontext.insight.InsightDisplayDetails p0, android.service.personalcontext.insight.interaction.AttributionDetails p1, android.service.personalcontext.IOpCallback p2) throws android.os.RemoteException;

    public static class Default implements android.service.personalcontext.attribution.IAttributionHandler {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void handleInsightAttribution(android.service.personalcontext.insight.InsightDisplayDetails p0, android.service.personalcontext.insight.interaction.AttributionDetails p1, android.service.personalcontext.IOpCallback p2) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.service.personalcontext.attribution.IAttributionHandler {
        static final int TRANSACTION_handleInsightAttribution = 1;
        public Stub() { super(); }
        public static android.service.personalcontext.attribution.IAttributionHandler asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.service.personalcontext.attribution.IAttributionHandler {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void handleInsightAttribution(android.service.personalcontext.insight.InsightDisplayDetails p0, android.service.personalcontext.insight.interaction.AttributionDetails p1, android.service.personalcontext.IOpCallback p2) throws android.os.RemoteException {}
        }
    }
}
