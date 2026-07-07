package android.window;

public interface IMultitaskingDelegate extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.window.IMultitaskingDelegate";
    public void createBubble(android.os.IBinder p0, android.content.Intent p1, boolean p2) throws android.os.RemoteException;
    public void createPendingIntentBubble(android.os.IBinder p0, android.app.PendingIntent p1, boolean p2) throws android.os.RemoteException;
    public void removeBubble(android.os.IBinder p0) throws android.os.RemoteException;
    public void updateBubbleMessage(android.os.IBinder p0, java.lang.String p1) throws android.os.RemoteException;
    public void updateBubbleState(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;

    public static class Default implements android.window.IMultitaskingDelegate {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void createBubble(android.os.IBinder p0, android.content.Intent p1, boolean p2) throws android.os.RemoteException {}
        public void createPendingIntentBubble(android.os.IBinder p0, android.app.PendingIntent p1, boolean p2) throws android.os.RemoteException {}
        public void removeBubble(android.os.IBinder p0) throws android.os.RemoteException {}
        public void updateBubbleMessage(android.os.IBinder p0, java.lang.String p1) throws android.os.RemoteException {}
        public void updateBubbleState(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.window.IMultitaskingDelegate {
        static final int TRANSACTION_createBubble = 1;
        static final int TRANSACTION_createPendingIntentBubble = 2;
        static final int TRANSACTION_removeBubble = 5;
        static final int TRANSACTION_updateBubbleMessage = 4;
        static final int TRANSACTION_updateBubbleState = 3;
        public Stub() { super(); }
        public static android.window.IMultitaskingDelegate asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.window.IMultitaskingDelegate {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void createBubble(android.os.IBinder p0, android.content.Intent p1, boolean p2) throws android.os.RemoteException {}
            public void createPendingIntentBubble(android.os.IBinder p0, android.app.PendingIntent p1, boolean p2) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void removeBubble(android.os.IBinder p0) throws android.os.RemoteException {}
            public void updateBubbleMessage(android.os.IBinder p0, java.lang.String p1) throws android.os.RemoteException {}
            public void updateBubbleState(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
        }
    }
}
