package android.window;

public interface ITransitionPlayer extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.window.ITransitionPlayer";
    public void addStartingWindow(android.window.StartingWindowInfo p0) throws android.os.RemoteException;
    public void copySplashScreenView(int p0) throws android.os.RemoteException;
    public void onAppSplashScreenViewRemoved(int p0) throws android.os.RemoteException;
    public void onImeDrawnOnTask(int p0) throws android.os.RemoteException;
    public void onTransitionReady(android.os.IBinder p0, android.window.TransitionInfo p1, android.view.SurfaceControl.Transaction p2, android.view.SurfaceControl.Transaction p3) throws android.os.RemoteException;
    public void removeStartingWindow(android.window.StartingWindowRemovalInfo p0) throws android.os.RemoteException;
    public void requestStartTransition(android.os.IBinder p0, android.window.TransitionRequestInfo p1) throws android.os.RemoteException;
    public void requestWindowingLayerChange(android.os.IBinder p0, android.app.ActivityManager.RunningTaskInfo p1, android.window.TransitionRequestInfo.WindowingLayerChange p2, android.window.IWindowingLayerChangeCallback p3) throws android.os.RemoteException;

    public static class Default implements android.window.ITransitionPlayer {
        public Default() {}
        public void addStartingWindow(android.window.StartingWindowInfo p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
        public void copySplashScreenView(int p0) throws android.os.RemoteException {}
        public void onAppSplashScreenViewRemoved(int p0) throws android.os.RemoteException {}
        public void onImeDrawnOnTask(int p0) throws android.os.RemoteException {}
        public void onTransitionReady(android.os.IBinder p0, android.window.TransitionInfo p1, android.view.SurfaceControl.Transaction p2, android.view.SurfaceControl.Transaction p3) throws android.os.RemoteException {}
        public void removeStartingWindow(android.window.StartingWindowRemovalInfo p0) throws android.os.RemoteException {}
        public void requestStartTransition(android.os.IBinder p0, android.window.TransitionRequestInfo p1) throws android.os.RemoteException {}
        public void requestWindowingLayerChange(android.os.IBinder p0, android.app.ActivityManager.RunningTaskInfo p1, android.window.TransitionRequestInfo.WindowingLayerChange p2, android.window.IWindowingLayerChangeCallback p3) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.window.ITransitionPlayer {
        static final int TRANSACTION_addStartingWindow = 3;
        static final int TRANSACTION_copySplashScreenView = 5;
        static final int TRANSACTION_onAppSplashScreenViewRemoved = 6;
        static final int TRANSACTION_onImeDrawnOnTask = 7;
        static final int TRANSACTION_onTransitionReady = 1;
        static final int TRANSACTION_removeStartingWindow = 4;
        static final int TRANSACTION_requestStartTransition = 2;
        static final int TRANSACTION_requestWindowingLayerChange = 8;
        public Stub() { super(); }
        public static android.window.ITransitionPlayer asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.window.ITransitionPlayer {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public void addStartingWindow(android.window.StartingWindowInfo p0) throws android.os.RemoteException {}
            public android.os.IBinder asBinder() { return null; }
            public void copySplashScreenView(int p0) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onAppSplashScreenViewRemoved(int p0) throws android.os.RemoteException {}
            public void onImeDrawnOnTask(int p0) throws android.os.RemoteException {}
            public void onTransitionReady(android.os.IBinder p0, android.window.TransitionInfo p1, android.view.SurfaceControl.Transaction p2, android.view.SurfaceControl.Transaction p3) throws android.os.RemoteException {}
            public void removeStartingWindow(android.window.StartingWindowRemovalInfo p0) throws android.os.RemoteException {}
            public void requestStartTransition(android.os.IBinder p0, android.window.TransitionRequestInfo p1) throws android.os.RemoteException {}
            public void requestWindowingLayerChange(android.os.IBinder p0, android.app.ActivityManager.RunningTaskInfo p1, android.window.TransitionRequestInfo.WindowingLayerChange p2, android.window.IWindowingLayerChangeCallback p3) throws android.os.RemoteException {}
        }
    }
}
