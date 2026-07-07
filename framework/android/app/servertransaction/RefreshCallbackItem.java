package android.app.servertransaction;

public class RefreshCallbackItem extends android.app.servertransaction.ActivityTransactionItem {
    public static final android.os.Parcelable.Creator<android.app.servertransaction.RefreshCallbackItem> CREATOR = null;
    private final int mPostExecutionState = 0;
    public RefreshCallbackItem(android.os.IBinder p0, int p1) { super((android.os.IBinder)null); }
    private RefreshCallbackItem(android.os.Parcel p0) { super((android.os.IBinder)null); }
    public boolean equals(java.lang.Object p0) { return false; }
    public void execute(android.app.ClientTransactionHandler p0, android.app.ActivityThread.ActivityClientRecord p1, android.app.servertransaction.PendingTransactionActions p2) {}
    public int getPostExecutionState() { return 0; }
    public int hashCode() { return 0; }
    public void postExecute(android.app.ClientTransactionHandler p0, android.app.servertransaction.PendingTransactionActions p1) {}
    boolean shouldHaveDefinedPreExecutionState() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
