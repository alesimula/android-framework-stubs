package android.app;

public abstract class SynchronousUserSwitchObserver extends android.app.UserSwitchObserver {
    public SynchronousUserSwitchObserver() { super(); }
    public abstract void onUserSwitching(int p0) throws android.os.RemoteException;
    public final void onUserSwitching(int p0, android.os.IRemoteCallback p1) throws android.os.RemoteException {}
}
