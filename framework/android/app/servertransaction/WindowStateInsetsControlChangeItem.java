package android.app.servertransaction;

public class WindowStateInsetsControlChangeItem extends android.app.servertransaction.WindowStateTransactionItem {
    public static final android.os.Parcelable.Creator<android.app.servertransaction.WindowStateInsetsControlChangeItem> CREATOR = null;
    private static final java.lang.String TAG = "WindowStateInsetsControlChangeItem";
    private final android.view.InsetsSourceControl.Array mActiveControls = null;
    private final android.view.InsetsState mInsetsState = null;
    private WindowStateInsetsControlChangeItem(android.os.Parcel p0) { super((android.view.IWindow)null); }
    public WindowStateInsetsControlChangeItem(android.view.IWindow p0, android.view.InsetsState p1, android.view.InsetsSourceControl.Array p2) { super((android.view.IWindow)null); }
    public WindowStateInsetsControlChangeItem(android.view.IWindow p0, android.view.InsetsState p1, android.view.InsetsSourceControl.Array p2, boolean p3) { super((android.view.IWindow)null); }
    private static android.view.InsetsSourceControl.Array copy(android.view.InsetsSourceControl.Array p0) { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public void execute(android.app.ClientTransactionHandler p0, android.view.IWindow p1, android.app.servertransaction.PendingTransactionActions p2) {}
    public void execute(com.android.internal.view.WindowClientTransactionHandler p0) {}
    public int hashCode() { return 0; }
    public void preExecute(com.android.internal.view.WindowClientTransactionHandler p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
