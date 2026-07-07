package android.app.servertransaction;

public class WindowStateResizeItem extends android.app.servertransaction.WindowStateTransactionItem {
    public static final android.os.Parcelable.Creator<android.app.servertransaction.WindowStateResizeItem> CREATOR = null;
    private static final java.lang.String TAG = "WindowStateResizeItem";
    private final int mDisplayId = 0;
    private final boolean mDragResizing = false;
    private final boolean mForceLayout = false;
    private final android.view.WindowRelayoutResult mLayout = null;
    private final boolean mReportDraw = false;
    private final boolean mSyncWithBuffers = false;
    private WindowStateResizeItem(android.os.Parcel p0) { super((android.view.IWindow)null); }
    public WindowStateResizeItem(android.view.IWindow p0, android.window.ClientWindowFrames p1, boolean p2, android.util.MergedConfiguration p3, android.view.InsetsState p4, boolean p5, int p6, int p7, boolean p8, boolean p9, android.window.ActivityWindowInfo p10) { super((android.view.IWindow)null); }
    public boolean equals(java.lang.Object p0) { return false; }
    public void execute(android.app.ClientTransactionHandler p0, android.view.IWindow p1, android.app.servertransaction.PendingTransactionActions p2) {}
    public void execute(com.android.internal.view.WindowClientTransactionHandler p0) {}
    public boolean getSyncWithBuffersForTest() { return false; }
    public int hashCode() { return 0; }
    public void preExecute(com.android.internal.view.WindowClientTransactionHandler p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
