package android.app.servertransaction;

public abstract class WindowStateTransactionItem extends android.app.servertransaction.ClientTransactionItem {
    private final android.view.IWindow mWindow = null;
    WindowStateTransactionItem(android.os.Parcel p0) { super(); }
    public WindowStateTransactionItem(android.view.IWindow p0) { super(); }
    private com.android.internal.view.WindowClientTransactionHandler getClient() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public final void execute(android.app.ClientTransactionHandler p0, android.app.servertransaction.PendingTransactionActions p1) {}
    @java.lang.Deprecated
    public abstract void execute(android.app.ClientTransactionHandler p0, android.view.IWindow p1, android.app.servertransaction.PendingTransactionActions p2);
    public abstract void execute(com.android.internal.view.WindowClientTransactionHandler p0);
    public int hashCode() { return 0; }
    public final void preExecute(android.app.ClientTransactionHandler p0) {}
    public void preExecute(com.android.internal.view.WindowClientTransactionHandler p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
