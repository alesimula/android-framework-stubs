package android.window;

public interface IRemoteTransition extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.window.IRemoteTransition";
    public void mergeAnimation(android.os.IBinder p0, android.window.TransitionInfo p1, android.view.SurfaceControl.Transaction p2, android.os.IBinder p3, android.window.IRemoteTransitionFinishedCallback p4) throws android.os.RemoteException;
    public void onTransitionConsumed(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    public void startAnimation(android.os.IBinder p0, android.window.TransitionInfo p1, android.view.SurfaceControl.Transaction p2, android.window.IRemoteTransitionFinishedCallback p3) throws android.os.RemoteException;
    public void takeOverAnimation(android.os.IBinder p0, android.window.TransitionInfo p1, android.view.SurfaceControl.Transaction p2, android.window.IRemoteTransitionFinishedCallback p3, android.window.WindowAnimationState[] p4) throws android.os.RemoteException;

    public static class Default implements android.window.IRemoteTransition {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void mergeAnimation(android.os.IBinder p0, android.window.TransitionInfo p1, android.view.SurfaceControl.Transaction p2, android.os.IBinder p3, android.window.IRemoteTransitionFinishedCallback p4) throws android.os.RemoteException {}
        public void onTransitionConsumed(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
        public void startAnimation(android.os.IBinder p0, android.window.TransitionInfo p1, android.view.SurfaceControl.Transaction p2, android.window.IRemoteTransitionFinishedCallback p3) throws android.os.RemoteException {}
        public void takeOverAnimation(android.os.IBinder p0, android.window.TransitionInfo p1, android.view.SurfaceControl.Transaction p2, android.window.IRemoteTransitionFinishedCallback p3, android.window.WindowAnimationState[] p4) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.window.IRemoteTransition {
        static final int TRANSACTION_mergeAnimation = 2;
        static final int TRANSACTION_onTransitionConsumed = 4;
        static final int TRANSACTION_startAnimation = 1;
        static final int TRANSACTION_takeOverAnimation = 3;
        public Stub() { super(); }
        public static android.window.IRemoteTransition asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.window.IRemoteTransition {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void mergeAnimation(android.os.IBinder p0, android.window.TransitionInfo p1, android.view.SurfaceControl.Transaction p2, android.os.IBinder p3, android.window.IRemoteTransitionFinishedCallback p4) throws android.os.RemoteException {}
            public void onTransitionConsumed(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
            public void startAnimation(android.os.IBinder p0, android.window.TransitionInfo p1, android.view.SurfaceControl.Transaction p2, android.window.IRemoteTransitionFinishedCallback p3) throws android.os.RemoteException {}
            public void takeOverAnimation(android.os.IBinder p0, android.window.TransitionInfo p1, android.view.SurfaceControl.Transaction p2, android.window.IRemoteTransitionFinishedCallback p3, android.window.WindowAnimationState[] p4) throws android.os.RemoteException {}
        }
    }
}
