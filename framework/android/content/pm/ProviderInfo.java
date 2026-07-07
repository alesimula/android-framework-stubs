package android.content.pm;

public final class ProviderInfo extends android.content.pm.ComponentInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.pm.ProviderInfo> CREATOR = null;
    public static final int FLAG_RUN_IN_PCC_SANDBOX = 524288;
    public static final int FLAG_SINGLE_USER = 1073741824;
    public static final int FLAG_SYSTEM_USER_ONLY = 536870912;
    public static final int FLAG_VISIBLE_TO_INSTANT_APP = 1048576;
    public java.lang.String authority;
    public int flags;
    public boolean forceUriPermissions;
    public boolean grantUriPermissions;
    public int initOrder;
    @java.lang.Deprecated
    public boolean isSyncable;
    public boolean multiprocess;
    public android.content.pm.PathPermission[] pathPermissions;
    public java.lang.String readPermission;
    public android.os.PatternMatcher[] uriPermissionPatterns;
    public java.lang.String writePermission;
    public ProviderInfo() { super(); }
    public ProviderInfo(android.content.pm.ProviderInfo p0) { super(); }
    private ProviderInfo(android.os.Parcel p0) { super(); }
    public int describeContents() { return 0; }
    public void dump(android.util.Printer p0, java.lang.String p1) {}
    public void dump(android.util.Printer p0, java.lang.String p1, int p2) {}
    public boolean shouldRunInPccSandbox() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
