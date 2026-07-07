package android.app.servertransaction;

public class MoveToDisplayItem extends android.app.servertransaction.ActivityTransactionItem {
    public static final android.os.Parcelable.Creator<android.app.servertransaction.MoveToDisplayItem> CREATOR = null;
    private final android.window.ActivityWindowInfo mActivityWindowInfo = null;
    private final android.content.res.Configuration mConfiguration = null;
    private final int mTargetDisplayId = 0;
    public MoveToDisplayItem(android.os.IBinder p0, int p1, android.content.res.Configuration p2, android.window.ActivityWindowInfo p3) { super((android.os.IBinder)null); }
    private MoveToDisplayItem(android.os.Parcel p0) { super((android.os.IBinder)null); }
    public boolean equals(java.lang.Object p0) { return false; }
    public void execute(android.app.ClientTransactionHandler p0, android.app.ActivityThread.ActivityClientRecord p1, android.app.servertransaction.PendingTransactionActions p2) {}
    public int hashCode() { return 0; }
    public void preExecute(android.app.ClientTransactionHandler p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
