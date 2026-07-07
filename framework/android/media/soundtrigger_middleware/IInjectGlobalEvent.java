package android.media.soundtrigger_middleware;

public interface IInjectGlobalEvent extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.soundtrigger_middleware.IInjectGlobalEvent";
    public void setResourceContention(boolean p0, android.media.soundtrigger_middleware.IAcknowledgeEvent p1) throws android.os.RemoteException;
    public void triggerOnResourcesAvailable() throws android.os.RemoteException;
    public void triggerRestart() throws android.os.RemoteException;

    public static class Default implements android.media.soundtrigger_middleware.IInjectGlobalEvent {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void setResourceContention(boolean p0, android.media.soundtrigger_middleware.IAcknowledgeEvent p1) throws android.os.RemoteException {}
        public void triggerOnResourcesAvailable() throws android.os.RemoteException {}
        public void triggerRestart() throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.media.soundtrigger_middleware.IInjectGlobalEvent {
        static final int TRANSACTION_setResourceContention = 2;
        static final int TRANSACTION_triggerOnResourcesAvailable = 3;
        static final int TRANSACTION_triggerRestart = 1;
        public Stub() { super(); }
        public static android.media.soundtrigger_middleware.IInjectGlobalEvent asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.media.soundtrigger_middleware.IInjectGlobalEvent {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void setResourceContention(boolean p0, android.media.soundtrigger_middleware.IAcknowledgeEvent p1) throws android.os.RemoteException {}
            public void triggerOnResourcesAvailable() throws android.os.RemoteException {}
            public void triggerRestart() throws android.os.RemoteException {}
        }
    }
}
