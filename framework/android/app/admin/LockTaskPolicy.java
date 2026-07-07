package android.app.admin;

@android.annotation.SystemApi
public final class LockTaskPolicy extends android.app.admin.PolicyValue<android.app.admin.LockTaskPolicy> {
    public static final android.os.Parcelable.Creator<android.app.admin.LockTaskPolicy> CREATOR = null;
    public static final int DEFAULT_LOCK_TASK_FLAG = 16;
    private int mFlags;
    private java.util.Set<java.lang.String> mPackages;
    public LockTaskPolicy(int p0) { super(null); }
    public LockTaskPolicy(android.app.admin.LockTaskPolicy p0) { super(null); }
    private LockTaskPolicy(android.os.Parcel p0) { super(null); }
    public LockTaskPolicy(java.util.Set<java.lang.String> p0) { super(null); }
    public LockTaskPolicy(java.util.Set<java.lang.String> p0, int p1) { super(null); }
    private void setPackagesInternal(java.util.Set<java.lang.String> p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getFlags() { return 0; }
    public java.util.Set<java.lang.String> getPackages() { return null; }
    public android.app.admin.LockTaskPolicy getValue() { return null; }
    public int hashCode() { return 0; }
    public void setFlags(int p0) {}
    public void setPackages(java.util.Set<java.lang.String> p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
