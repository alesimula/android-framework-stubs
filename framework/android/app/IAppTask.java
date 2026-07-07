package android.app;

public interface IAppTask extends android.os.IInterface {
    public void finishAndRemoveTask() throws android.os.RemoteException;
    public android.app.ActivityManager.RecentTaskInfo getTaskInfo() throws android.os.RemoteException;
    public void moveTaskTo(int p0, android.graphics.Rect p1, android.os.IRemoteCallback p2, java.lang.String p3) throws android.os.RemoteException;
    public void moveToFront(android.app.IApplicationThread p0, java.lang.String p1) throws android.os.RemoteException;
    public void requestWindowingLayer(int p0, android.os.IRemoteCallback p1) throws android.os.RemoteException;
    public void setExcludeFromRecents(boolean p0) throws android.os.RemoteException;
    public int startActivity(android.os.IBinder p0, java.lang.String p1, java.lang.String p2, android.content.Intent p3, java.lang.String p4, android.os.Bundle p5) throws android.os.RemoteException;

    public static class Default implements android.app.IAppTask {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void finishAndRemoveTask() throws android.os.RemoteException {}
        public android.app.ActivityManager.RecentTaskInfo getTaskInfo() throws android.os.RemoteException { return null; }
        public void moveTaskTo(int p0, android.graphics.Rect p1, android.os.IRemoteCallback p2, java.lang.String p3) throws android.os.RemoteException {}
        public void moveToFront(android.app.IApplicationThread p0, java.lang.String p1) throws android.os.RemoteException {}
        public void requestWindowingLayer(int p0, android.os.IRemoteCallback p1) throws android.os.RemoteException {}
        public void setExcludeFromRecents(boolean p0) throws android.os.RemoteException {}
        public int startActivity(android.os.IBinder p0, java.lang.String p1, java.lang.String p2, android.content.Intent p3, java.lang.String p4, android.os.Bundle p5) throws android.os.RemoteException { return 0; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.IAppTask {
        public static final java.lang.String DESCRIPTOR = "android.app.IAppTask";
        static final int TRANSACTION_finishAndRemoveTask = 1;
        static final int TRANSACTION_getTaskInfo = 2;
        static final int TRANSACTION_moveTaskTo = 4;
        static final int TRANSACTION_moveToFront = 3;
        static final int TRANSACTION_requestWindowingLayer = 7;
        static final int TRANSACTION_setExcludeFromRecents = 6;
        static final int TRANSACTION_startActivity = 5;
        public Stub() { super(); }
        public static android.app.IAppTask asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.app.IAppTask {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void finishAndRemoveTask() throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public android.app.ActivityManager.RecentTaskInfo getTaskInfo() throws android.os.RemoteException { return null; }
            public void moveTaskTo(int p0, android.graphics.Rect p1, android.os.IRemoteCallback p2, java.lang.String p3) throws android.os.RemoteException {}
            public void moveToFront(android.app.IApplicationThread p0, java.lang.String p1) throws android.os.RemoteException {}
            public void requestWindowingLayer(int p0, android.os.IRemoteCallback p1) throws android.os.RemoteException {}
            public void setExcludeFromRecents(boolean p0) throws android.os.RemoteException {}
            public int startActivity(android.os.IBinder p0, java.lang.String p1, java.lang.String p2, android.content.Intent p3, java.lang.String p4, android.os.Bundle p5) throws android.os.RemoteException { return 0; }
        }
    }
}
