package android.window;

public interface ITaskOrganizer extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.window.ITaskOrganizer";
    public void addStartingWindow(android.window.StartingWindowInfo p0) throws android.os.RemoteException;
    public void copySplashScreenView(int p0) throws android.os.RemoteException;
    public void onAppSplashScreenViewRemoved(int p0) throws android.os.RemoteException;
    public void onBackOnTaskRoot(android.app.ActivityManager.RunningTaskInfo p0, boolean p1, boolean p2, boolean p3) throws android.os.RemoteException;
    public void onImeDrawnOnTask(int p0) throws android.os.RemoteException;
    public void onKeyguardOccludingTaskChanged(int p0, android.app.ActivityManager.RunningTaskInfo p1) throws android.os.RemoteException;
    public void onPackageUpdateFinished(java.util.List<android.app.ActivityManager.RunningTaskInfo> p0) throws android.os.RemoteException;
    public void onPackageUpdateRequested(java.util.List<android.app.ActivityManager.RunningTaskInfo> p0) throws android.os.RemoteException;
    public void onTaskAppeared(android.app.ActivityManager.RunningTaskInfo p0, android.view.SurfaceControl p1) throws android.os.RemoteException;
    public void onTaskInfoChanged(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException;
    public void onTaskVanished(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException;
    public void onTransitionReady(android.os.IBinder p0, android.window.TransitionInfo p1, android.view.SurfaceControl.Transaction p2, android.view.SurfaceControl.Transaction p3) throws android.os.RemoteException;
    public void removeStartingWindow(android.window.StartingWindowRemovalInfo p0) throws android.os.RemoteException;
    public void requestStartTransition(android.os.IBinder p0, android.window.TransitionRequestInfo p1) throws android.os.RemoteException;

    public static class Default implements android.window.ITaskOrganizer {
        public Default() {}
        public void addStartingWindow(android.window.StartingWindowInfo p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
        public void copySplashScreenView(int p0) throws android.os.RemoteException {}
        public void onAppSplashScreenViewRemoved(int p0) throws android.os.RemoteException {}
        public void onBackOnTaskRoot(android.app.ActivityManager.RunningTaskInfo p0, boolean p1, boolean p2, boolean p3) throws android.os.RemoteException {}
        public void onImeDrawnOnTask(int p0) throws android.os.RemoteException {}
        public void onKeyguardOccludingTaskChanged(int p0, android.app.ActivityManager.RunningTaskInfo p1) throws android.os.RemoteException {}
        public void onPackageUpdateFinished(java.util.List<android.app.ActivityManager.RunningTaskInfo> p0) throws android.os.RemoteException {}
        public void onPackageUpdateRequested(java.util.List<android.app.ActivityManager.RunningTaskInfo> p0) throws android.os.RemoteException {}
        public void onTaskAppeared(android.app.ActivityManager.RunningTaskInfo p0, android.view.SurfaceControl p1) throws android.os.RemoteException {}
        public void onTaskInfoChanged(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException {}
        public void onTaskVanished(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException {}
        public void onTransitionReady(android.os.IBinder p0, android.window.TransitionInfo p1, android.view.SurfaceControl.Transaction p2, android.view.SurfaceControl.Transaction p3) throws android.os.RemoteException {}
        public void removeStartingWindow(android.window.StartingWindowRemovalInfo p0) throws android.os.RemoteException {}
        public void requestStartTransition(android.os.IBinder p0, android.window.TransitionRequestInfo p1) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.window.ITaskOrganizer {
        static final int TRANSACTION_addStartingWindow = 1;
        static final int TRANSACTION_copySplashScreenView = 3;
        static final int TRANSACTION_onAppSplashScreenViewRemoved = 4;
        static final int TRANSACTION_onBackOnTaskRoot = 8;
        static final int TRANSACTION_onImeDrawnOnTask = 9;
        static final int TRANSACTION_onKeyguardOccludingTaskChanged = 14;
        static final int TRANSACTION_onPackageUpdateFinished = 13;
        static final int TRANSACTION_onPackageUpdateRequested = 12;
        static final int TRANSACTION_onTaskAppeared = 5;
        static final int TRANSACTION_onTaskInfoChanged = 7;
        static final int TRANSACTION_onTaskVanished = 6;
        static final int TRANSACTION_onTransitionReady = 10;
        static final int TRANSACTION_removeStartingWindow = 2;
        static final int TRANSACTION_requestStartTransition = 11;
        public Stub() { super(); }
        public static android.window.ITaskOrganizer asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.window.ITaskOrganizer {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public void addStartingWindow(android.window.StartingWindowInfo p0) throws android.os.RemoteException {}
            public android.os.IBinder asBinder() { return null; }
            public void copySplashScreenView(int p0) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onAppSplashScreenViewRemoved(int p0) throws android.os.RemoteException {}
            public void onBackOnTaskRoot(android.app.ActivityManager.RunningTaskInfo p0, boolean p1, boolean p2, boolean p3) throws android.os.RemoteException {}
            public void onImeDrawnOnTask(int p0) throws android.os.RemoteException {}
            public void onKeyguardOccludingTaskChanged(int p0, android.app.ActivityManager.RunningTaskInfo p1) throws android.os.RemoteException {}
            public void onPackageUpdateFinished(java.util.List<android.app.ActivityManager.RunningTaskInfo> p0) throws android.os.RemoteException {}
            public void onPackageUpdateRequested(java.util.List<android.app.ActivityManager.RunningTaskInfo> p0) throws android.os.RemoteException {}
            public void onTaskAppeared(android.app.ActivityManager.RunningTaskInfo p0, android.view.SurfaceControl p1) throws android.os.RemoteException {}
            public void onTaskInfoChanged(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException {}
            public void onTaskVanished(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException {}
            public void onTransitionReady(android.os.IBinder p0, android.window.TransitionInfo p1, android.view.SurfaceControl.Transaction p2, android.view.SurfaceControl.Transaction p3) throws android.os.RemoteException {}
            public void removeStartingWindow(android.window.StartingWindowRemovalInfo p0) throws android.os.RemoteException {}
            public void requestStartTransition(android.os.IBinder p0, android.window.TransitionRequestInfo p1) throws android.os.RemoteException {}
        }
    }
}
