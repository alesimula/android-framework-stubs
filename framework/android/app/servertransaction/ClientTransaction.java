package android.app.servertransaction;

public class ClientTransaction implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.servertransaction.ClientTransaction> CREATOR = null;
    @java.lang.Deprecated
    private java.util.List<android.app.servertransaction.ClientTransactionItem> mActivityCallbacks;
    private android.os.IBinder mActivityToken;
    private final android.app.IApplicationThread mClient = null;
    private android.app.servertransaction.ActivityLifecycleItem mLifecycleStateRequest;
    private final java.util.List<android.app.servertransaction.ClientTransactionItem> mTransactionItems = null;
    public ClientTransaction() {}
    public ClientTransaction(android.app.IApplicationThread p0) {}
    private ClientTransaction(android.os.Parcel p0) {}
    @java.lang.Deprecated
    private void addCallback(android.app.servertransaction.ClientTransactionItem p0) {}
    private void setActivityTokenIfNotSet(android.app.servertransaction.ClientTransactionItem p0) {}
    @java.lang.Deprecated
    private void setLifecycleStateRequest(android.app.servertransaction.ActivityLifecycleItem p0) {}
    public void addTransactionItem(android.app.servertransaction.ClientTransactionItem p0) {}
    public int describeContents() { return 0; }
    void dump(java.lang.String p0, java.io.PrintWriter p1, android.app.ClientTransactionHandler p2) {}
    public boolean equals(java.lang.Object p0) { return false; }
    @java.lang.Deprecated
    public android.os.IBinder getActivityToken() { return null; }
    @java.lang.Deprecated
    public java.util.List<android.app.servertransaction.ClientTransactionItem> getCallbacks() { return null; }
    public android.app.IApplicationThread getClient() { return null; }
    @java.lang.Deprecated
    public android.app.servertransaction.ActivityLifecycleItem getLifecycleStateRequest() { return null; }
    public java.util.List<android.app.servertransaction.ClientTransactionItem> getTransactionItems() { return null; }
    public int hashCode() { return 0; }
    public void preExecute(android.app.ClientTransactionHandler p0) {}
    public android.os.RemoteException schedule() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
