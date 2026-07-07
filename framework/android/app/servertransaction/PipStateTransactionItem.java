package android.app.servertransaction;

public final class PipStateTransactionItem extends android.app.servertransaction.ActivityTransactionItem {
    public static final android.os.Parcelable.Creator<android.app.servertransaction.PipStateTransactionItem> CREATOR = null;
    private final android.app.PictureInPictureUiState mPipState = null;
    public PipStateTransactionItem(android.os.IBinder p0, android.app.PictureInPictureUiState p1) { super((android.os.IBinder)null); }
    private PipStateTransactionItem(android.os.Parcel p0) { super((android.os.IBinder)null); }
    public boolean equals(java.lang.Object p0) { return false; }
    public void execute(android.app.ClientTransactionHandler p0, android.app.ActivityThread.ActivityClientRecord p1, android.app.servertransaction.PendingTransactionActions p2) {}
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
