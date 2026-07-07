package android.accounts;

public class Account implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.accounts.Account> CREATOR = null;
    private static final java.lang.String TAG = "Account";
    private static final java.util.Set<android.accounts.Account> sAccessedAccounts = null;
    private final java.lang.String accessId = null;
    private java.lang.String mSafeName;
    public final java.lang.String name = null;
    public final java.lang.String type = null;
    public Account(android.accounts.Account p0, java.lang.String p1) {}
    public Account(android.os.Parcel p0) {}
    public Account(java.lang.String p0, java.lang.String p1) {}
    public Account(java.lang.String p0, java.lang.String p1, java.lang.String p2) {}
    private static void onAccountAccessed(java.lang.String p0) {}
    private static void onAccountAccessed$ravenwood(java.lang.String p0) {}
    public static java.lang.String toSafeName(java.lang.String p0, char p1) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String getAccessId() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toSafeString() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
