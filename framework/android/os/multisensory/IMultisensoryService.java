package android.os.multisensory;

public interface IMultisensoryService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.os.multisensory.IMultisensoryService";
    public void modifyContinuousFeedbackForToken(int p0, java.util.List<android.os.multisensory.MultisensoryContinuousEffectModifier> p1) throws android.os.RemoteException;
    public void openContinuousFeedbackForToken(int p0) throws android.os.RemoteException;
    public void playToken(int p0) throws android.os.RemoteException;
    public void setPlayer(android.os.multisensory.IMultisensoryPlayer p0) throws android.os.RemoteException;
    public void startContinuousFeedbackForToken(int p0) throws android.os.RemoteException;
    public void stopContinuousFeedbackForToken(int p0) throws android.os.RemoteException;

    public static class Default implements android.os.multisensory.IMultisensoryService {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void modifyContinuousFeedbackForToken(int p0, java.util.List<android.os.multisensory.MultisensoryContinuousEffectModifier> p1) throws android.os.RemoteException {}
        public void openContinuousFeedbackForToken(int p0) throws android.os.RemoteException {}
        public void playToken(int p0) throws android.os.RemoteException {}
        public void setPlayer(android.os.multisensory.IMultisensoryPlayer p0) throws android.os.RemoteException {}
        public void startContinuousFeedbackForToken(int p0) throws android.os.RemoteException {}
        public void stopContinuousFeedbackForToken(int p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.os.multisensory.IMultisensoryService {
        static final int TRANSACTION_modifyContinuousFeedbackForToken = 5;
        static final int TRANSACTION_openContinuousFeedbackForToken = 3;
        static final int TRANSACTION_playToken = 2;
        static final int TRANSACTION_setPlayer = 7;
        static final int TRANSACTION_startContinuousFeedbackForToken = 4;
        static final int TRANSACTION_stopContinuousFeedbackForToken = 6;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static android.os.multisensory.IMultisensoryService asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void setPlayer_enforcePermission() throws java.lang.SecurityException {}

        private static final class Proxy implements android.os.multisensory.IMultisensoryService {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void modifyContinuousFeedbackForToken(int p0, java.util.List<android.os.multisensory.MultisensoryContinuousEffectModifier> p1) throws android.os.RemoteException {}
            public void openContinuousFeedbackForToken(int p0) throws android.os.RemoteException {}
            public void playToken(int p0) throws android.os.RemoteException {}
            public void setPlayer(android.os.multisensory.IMultisensoryPlayer p0) throws android.os.RemoteException {}
            public void startContinuousFeedbackForToken(int p0) throws android.os.RemoteException {}
            public void stopContinuousFeedbackForToken(int p0) throws android.os.RemoteException {}
        }
    }
}
