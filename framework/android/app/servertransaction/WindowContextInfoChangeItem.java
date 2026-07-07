package android.app.servertransaction;

public class WindowContextInfoChangeItem extends android.app.servertransaction.ClientTransactionItem {
    public static final android.os.Parcelable.Creator<android.app.servertransaction.WindowContextInfoChangeItem> CREATOR = null;
    private final android.os.IBinder mClientToken = null;
    private final android.window.WindowContextInfo mInfo = null;
    public WindowContextInfoChangeItem(android.os.IBinder p0, android.content.res.Configuration p1, int p2) { super(); }
    private WindowContextInfoChangeItem(android.os.Parcel p0) { super(); }
    public boolean equals(java.lang.Object p0) { return false; }
    public void execute(android.app.ClientTransactionHandler p0, android.app.servertransaction.PendingTransactionActions p1) {}
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
