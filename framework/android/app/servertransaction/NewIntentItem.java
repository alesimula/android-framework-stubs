package android.app.servertransaction;

public class NewIntentItem extends android.app.servertransaction.ActivityTransactionItem {
    public static final android.os.Parcelable.Creator<android.app.servertransaction.NewIntentItem> CREATOR = null;
    private java.util.List<com.android.internal.content.ReferrerIntent> mIntents;
    private final boolean mResume = false;
    public NewIntentItem(android.os.IBinder p0, java.util.List<com.android.internal.content.ReferrerIntent> p1, boolean p2) { super((android.os.IBinder)null); }
    private NewIntentItem(android.os.Parcel p0) { super((android.os.IBinder)null); }
    public boolean equals(java.lang.Object p0) { return false; }
    public void execute(android.app.ClientTransactionHandler p0, android.app.ActivityThread.ActivityClientRecord p1, android.app.servertransaction.PendingTransactionActions p2) {}
    public int getPostExecutionState() { return 0; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
