package android.app.servertransaction;

public class ConfigurationChangeItem extends android.app.servertransaction.ClientTransactionItem {
    public static final android.os.Parcelable.Creator<android.app.servertransaction.ConfigurationChangeItem> CREATOR = null;
    private final android.content.res.Configuration mConfiguration = null;
    private final int mDeviceId = 0;
    public ConfigurationChangeItem(android.content.res.Configuration p0, int p1) { super(); }
    private ConfigurationChangeItem(android.os.Parcel p0) { super(); }
    public boolean equals(java.lang.Object p0) { return false; }
    public void execute(android.app.ClientTransactionHandler p0, android.app.servertransaction.PendingTransactionActions p1) {}
    public int hashCode() { return 0; }
    public void preExecute(android.app.ClientTransactionHandler p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
