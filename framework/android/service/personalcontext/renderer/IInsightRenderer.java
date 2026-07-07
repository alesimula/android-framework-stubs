package android.service.personalcontext.renderer;

public interface IInsightRenderer extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.personalcontext.renderer.IInsightRenderer";
    public void configure(android.os.ParcelUuid p0) throws android.os.RemoteException;
    public void getFilter(android.os.ParcelUuid p0, android.service.personalcontext.renderer.IGetFilterCallback p1, android.service.personalcontext.IOpCallback p2) throws android.os.RemoteException;
    public void render(android.os.ParcelUuid p0, android.service.personalcontext.insight.ContextInsightWrapper p1, android.service.personalcontext.RenderToken p2, android.service.personalcontext.IOpCallback p3) throws android.os.RemoteException;

    public static class Default implements android.service.personalcontext.renderer.IInsightRenderer {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void configure(android.os.ParcelUuid p0) throws android.os.RemoteException {}
        public void getFilter(android.os.ParcelUuid p0, android.service.personalcontext.renderer.IGetFilterCallback p1, android.service.personalcontext.IOpCallback p2) throws android.os.RemoteException {}
        public void render(android.os.ParcelUuid p0, android.service.personalcontext.insight.ContextInsightWrapper p1, android.service.personalcontext.RenderToken p2, android.service.personalcontext.IOpCallback p3) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.service.personalcontext.renderer.IInsightRenderer {
        static final int TRANSACTION_configure = 2;
        static final int TRANSACTION_getFilter = 3;
        static final int TRANSACTION_render = 1;
        public Stub() { super(); }
        public static android.service.personalcontext.renderer.IInsightRenderer asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.service.personalcontext.renderer.IInsightRenderer {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void configure(android.os.ParcelUuid p0) throws android.os.RemoteException {}
            public void getFilter(android.os.ParcelUuid p0, android.service.personalcontext.renderer.IGetFilterCallback p1, android.service.personalcontext.IOpCallback p2) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void render(android.os.ParcelUuid p0, android.service.personalcontext.insight.ContextInsightWrapper p1, android.service.personalcontext.RenderToken p2, android.service.personalcontext.IOpCallback p3) throws android.os.RemoteException {}
        }
    }
}
