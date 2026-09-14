package android.service.personalcontext.refiner;

public interface IRefineCallbackLegacy extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.personalcontext.refiner.IRefineCallbackLegacy";
    public void onHintsRefined(java.util.List<android.app.personalcontext.hint.ContextHintWrapper> p0) throws android.os.RemoteException;
    public void onUnderstood(java.util.List<android.app.personalcontext.insight.ContextInsightWrapper> p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.service.personalcontext.refiner.IRefineCallbackLegacy {
        static final int TRANSACTION_onHintsRefined = 1;
        static final int TRANSACTION_onUnderstood = 2;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static android.service.personalcontext.refiner.IRefineCallbackLegacy asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        protected void onHintsRefined_enforcePermission() throws java.lang.SecurityException {}
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.service.personalcontext.refiner.IRefineCallbackLegacy {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onHintsRefined(java.util.List<android.app.personalcontext.hint.ContextHintWrapper> p0) throws android.os.RemoteException {}
            public void onUnderstood(java.util.List<android.app.personalcontext.insight.ContextInsightWrapper> p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.service.personalcontext.refiner.IRefineCallbackLegacy {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onHintsRefined(java.util.List<android.app.personalcontext.hint.ContextHintWrapper> p0) throws android.os.RemoteException {}
        public void onUnderstood(java.util.List<android.app.personalcontext.insight.ContextInsightWrapper> p0) throws android.os.RemoteException {}
    }
}
