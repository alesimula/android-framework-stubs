package android.service.personalcontext.understander;

public interface IUnderstander extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.personalcontext.understander.IUnderstander";
    public void getFilter(android.os.ParcelUuid p0, android.service.personalcontext.refiner.IGetFilterCallback p1, android.service.personalcontext.IOpCallback p2) throws android.os.RemoteException;
    public void handleEvent(android.os.ParcelUuid p0, java.lang.String p1, android.service.personalcontext.insight.interaction.InsightEvent p2, android.service.personalcontext.IOpCallback p3) throws android.os.RemoteException;
    public void understand(android.os.ParcelUuid p0, java.util.List<android.service.personalcontext.hint.ContextHintWrapper> p1, java.util.List<android.service.personalcontext.insight.destination.ContextDestination> p2, android.service.personalcontext.understander.IUnderstandCallback p3, android.service.personalcontext.IOpCallback p4) throws android.os.RemoteException;

    public static class Default implements android.service.personalcontext.understander.IUnderstander {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void getFilter(android.os.ParcelUuid p0, android.service.personalcontext.refiner.IGetFilterCallback p1, android.service.personalcontext.IOpCallback p2) throws android.os.RemoteException {}
        public void handleEvent(android.os.ParcelUuid p0, java.lang.String p1, android.service.personalcontext.insight.interaction.InsightEvent p2, android.service.personalcontext.IOpCallback p3) throws android.os.RemoteException {}
        public void understand(android.os.ParcelUuid p0, java.util.List<android.service.personalcontext.hint.ContextHintWrapper> p1, java.util.List<android.service.personalcontext.insight.destination.ContextDestination> p2, android.service.personalcontext.understander.IUnderstandCallback p3, android.service.personalcontext.IOpCallback p4) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.service.personalcontext.understander.IUnderstander {
        static final int TRANSACTION_getFilter = 2;
        static final int TRANSACTION_handleEvent = 3;
        static final int TRANSACTION_understand = 1;
        public Stub() { super(); }
        public static android.service.personalcontext.understander.IUnderstander asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.service.personalcontext.understander.IUnderstander {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void getFilter(android.os.ParcelUuid p0, android.service.personalcontext.refiner.IGetFilterCallback p1, android.service.personalcontext.IOpCallback p2) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void handleEvent(android.os.ParcelUuid p0, java.lang.String p1, android.service.personalcontext.insight.interaction.InsightEvent p2, android.service.personalcontext.IOpCallback p3) throws android.os.RemoteException {}
            public void understand(android.os.ParcelUuid p0, java.util.List<android.service.personalcontext.hint.ContextHintWrapper> p1, java.util.List<android.service.personalcontext.insight.destination.ContextDestination> p2, android.service.personalcontext.understander.IUnderstandCallback p3, android.service.personalcontext.IOpCallback p4) throws android.os.RemoteException {}
        }
    }
}
