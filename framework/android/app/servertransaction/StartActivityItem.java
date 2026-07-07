package android.app.servertransaction;

public class StartActivityItem extends android.app.servertransaction.ActivityLifecycleItem {
    public static final android.os.Parcelable.Creator<android.app.servertransaction.StartActivityItem> CREATOR = null;
    private final android.app.ActivityOptions.SceneTransitionInfo mSceneTransitionInfo = null;
    public StartActivityItem(android.os.IBinder p0, android.app.ActivityOptions.SceneTransitionInfo p1) { super((android.os.IBinder)null); }
    private StartActivityItem(android.os.Parcel p0) { super((android.os.IBinder)null); }
    public boolean equals(java.lang.Object p0) { return false; }
    public void execute(android.app.ClientTransactionHandler p0, android.app.ActivityThread.ActivityClientRecord p1, android.app.servertransaction.PendingTransactionActions p2) {}
    public int getTargetState() { return 0; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
