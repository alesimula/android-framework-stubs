package android.app.servertransaction;

public class ActivityRelaunchItem extends android.app.servertransaction.ActivityTransactionItem {
    public static final android.os.Parcelable.Creator<android.app.servertransaction.ActivityRelaunchItem> CREATOR = null;
    private static final java.lang.String TAG = "ActivityRelaunchItem";
    private android.app.ActivityThread.ActivityClientRecord mActivityClientRecord;
    private final android.window.ActivityWindowInfo mActivityWindowInfo = null;
    private final android.util.MergedConfiguration mConfig = null;
    private final int mConfigChanges = 0;
    private final int mDisplayId = 0;
    private final java.util.List<com.android.internal.content.ReferrerIntent> mPendingNewIntents = null;
    private final java.util.List<android.app.ResultInfo> mPendingResults = null;
    private final boolean mPreserveWindow = false;
    public ActivityRelaunchItem(android.os.IBinder p0, java.util.List<android.app.ResultInfo> p1, java.util.List<com.android.internal.content.ReferrerIntent> p2, int p3, android.util.MergedConfiguration p4, boolean p5, android.window.ActivityWindowInfo p6, int p7) { super((android.os.IBinder)null); }
    private ActivityRelaunchItem(android.os.Parcel p0) { super((android.os.IBinder)null); }
    public boolean equals(java.lang.Object p0) { return false; }
    public void execute(android.app.ClientTransactionHandler p0, android.app.ActivityThread.ActivityClientRecord p1, android.app.servertransaction.PendingTransactionActions p2) {}
    public int hashCode() { return 0; }
    public void postExecute(android.app.ClientTransactionHandler p0, android.app.servertransaction.PendingTransactionActions p1) {}
    public void preExecute(android.app.ClientTransactionHandler p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
