package android.app.servertransaction;

public abstract class ClientTransactionItem implements android.app.servertransaction.BaseClientRequest, android.os.Parcelable {
    public ClientTransactionItem() {}
    public int describeContents() { return 0; }
    void dump(java.lang.String p0, java.io.PrintWriter p1, android.app.ClientTransactionHandler p2) {}
    public android.os.IBinder getActivityToken() { return null; }
    public int getPostExecutionState() { return 0; }
    public boolean isActivityLifecycleItem() { return false; }
    boolean shouldHaveDefinedPreExecutionState() { return false; }
}
