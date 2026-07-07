package android.service.voice;

public interface IVoiceInteractionService extends android.os.IInterface {
    public void detectorRemoteExceptionOccurred(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public void getActiveServiceSupportedActions(java.util.List<java.lang.String> p0, com.android.internal.app.IVoiceActionCheckCallback p1) throws android.os.RemoteException;
    public void launchVoiceAssistFromKeyguard() throws android.os.RemoteException;
    public void prepareToShowSession(android.os.Bundle p0, int p1) throws android.os.RemoteException;
    public void ready() throws android.os.RemoteException;
    public void showSessionFailed(android.os.Bundle p0) throws android.os.RemoteException;
    public void shutdown() throws android.os.RemoteException;
    public void soundModelsChanged() throws android.os.RemoteException;

    public static class Default implements android.service.voice.IVoiceInteractionService {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void detectorRemoteExceptionOccurred(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
        public void getActiveServiceSupportedActions(java.util.List<java.lang.String> p0, com.android.internal.app.IVoiceActionCheckCallback p1) throws android.os.RemoteException {}
        public void launchVoiceAssistFromKeyguard() throws android.os.RemoteException {}
        public void prepareToShowSession(android.os.Bundle p0, int p1) throws android.os.RemoteException {}
        public void ready() throws android.os.RemoteException {}
        public void showSessionFailed(android.os.Bundle p0) throws android.os.RemoteException {}
        public void shutdown() throws android.os.RemoteException {}
        public void soundModelsChanged() throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.service.voice.IVoiceInteractionService {
        public static final java.lang.String DESCRIPTOR = "android.service.voice.IVoiceInteractionService";
        static final int TRANSACTION_detectorRemoteExceptionOccurred = 8;
        static final int TRANSACTION_getActiveServiceSupportedActions = 5;
        static final int TRANSACTION_launchVoiceAssistFromKeyguard = 4;
        static final int TRANSACTION_prepareToShowSession = 6;
        static final int TRANSACTION_ready = 1;
        static final int TRANSACTION_showSessionFailed = 7;
        static final int TRANSACTION_shutdown = 3;
        static final int TRANSACTION_soundModelsChanged = 2;
        public Stub() { super(); }
        public static android.service.voice.IVoiceInteractionService asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.service.voice.IVoiceInteractionService {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void detectorRemoteExceptionOccurred(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
            public void getActiveServiceSupportedActions(java.util.List<java.lang.String> p0, com.android.internal.app.IVoiceActionCheckCallback p1) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void launchVoiceAssistFromKeyguard() throws android.os.RemoteException {}
            public void prepareToShowSession(android.os.Bundle p0, int p1) throws android.os.RemoteException {}
            public void ready() throws android.os.RemoteException {}
            public void showSessionFailed(android.os.Bundle p0) throws android.os.RemoteException {}
            public void shutdown() throws android.os.RemoteException {}
            public void soundModelsChanged() throws android.os.RemoteException {}
        }
    }
}
