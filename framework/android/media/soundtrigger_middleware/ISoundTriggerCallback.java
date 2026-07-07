package android.media.soundtrigger_middleware;

public interface ISoundTriggerCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.soundtrigger_middleware.ISoundTriggerCallback";
    public void onModelUnloaded(int p0) throws android.os.RemoteException;
    public void onModuleDied() throws android.os.RemoteException;
    public void onPhraseRecognition(int p0, android.media.soundtrigger_middleware.PhraseRecognitionEventSys p1, int p2) throws android.os.RemoteException;
    public void onRecognition(int p0, android.media.soundtrigger_middleware.RecognitionEventSys p1, int p2) throws android.os.RemoteException;
    public void onResourcesAvailable() throws android.os.RemoteException;

    public static class Default implements android.media.soundtrigger_middleware.ISoundTriggerCallback {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onModelUnloaded(int p0) throws android.os.RemoteException {}
        public void onModuleDied() throws android.os.RemoteException {}
        public void onPhraseRecognition(int p0, android.media.soundtrigger_middleware.PhraseRecognitionEventSys p1, int p2) throws android.os.RemoteException {}
        public void onRecognition(int p0, android.media.soundtrigger_middleware.RecognitionEventSys p1, int p2) throws android.os.RemoteException {}
        public void onResourcesAvailable() throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.media.soundtrigger_middleware.ISoundTriggerCallback {
        static final int TRANSACTION_onModelUnloaded = 4;
        static final int TRANSACTION_onModuleDied = 5;
        static final int TRANSACTION_onPhraseRecognition = 2;
        static final int TRANSACTION_onRecognition = 1;
        static final int TRANSACTION_onResourcesAvailable = 3;
        public Stub() { super(); }
        public static android.media.soundtrigger_middleware.ISoundTriggerCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.media.soundtrigger_middleware.ISoundTriggerCallback {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onModelUnloaded(int p0) throws android.os.RemoteException {}
            public void onModuleDied() throws android.os.RemoteException {}
            public void onPhraseRecognition(int p0, android.media.soundtrigger_middleware.PhraseRecognitionEventSys p1, int p2) throws android.os.RemoteException {}
            public void onRecognition(int p0, android.media.soundtrigger_middleware.RecognitionEventSys p1, int p2) throws android.os.RemoteException {}
            public void onResourcesAvailable() throws android.os.RemoteException {}
        }
    }
}
