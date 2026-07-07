package android.app.servertransaction;

public abstract class ActivityTransactionItem extends android.app.servertransaction.ClientTransactionItem {
    private final android.os.IBinder mActivityToken = null;
    public ActivityTransactionItem(android.os.IBinder p0) { super(); }
    ActivityTransactionItem(android.os.Parcel p0) { super(); }
    void dump(java.lang.String p0, java.io.PrintWriter p1, android.app.ClientTransactionHandler p2) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public abstract void execute(android.app.ClientTransactionHandler p0, android.app.ActivityThread.ActivityClientRecord p1, android.app.servertransaction.PendingTransactionActions p2);
    public final void execute(android.app.ClientTransactionHandler p0, android.app.servertransaction.PendingTransactionActions p1) {}
    final android.app.ActivityThread.ActivityClientRecord getActivityClientRecord(android.app.ClientTransactionHandler p0) { return null; }
    public android.os.IBinder getActivityToken() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
