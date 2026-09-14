package android.app.admin.dataleakprevention;

public final class DataLeakPreventionVerdictRedact implements android.app.admin.dataleakprevention.DataLeakPreventionVerdict, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.admin.dataleakprevention.DataLeakPreventionVerdictRedact> CREATOR = null;
    private final java.util.Set<java.lang.Integer> mRedactAppUids = null;
    private DataLeakPreventionVerdictRedact(android.os.Parcel p0) {}
    public DataLeakPreventionVerdictRedact(java.util.List<java.lang.Integer> p0) {}
    public DataLeakPreventionVerdictRedact(java.util.Set<java.lang.Integer> p0) {}
    public DataLeakPreventionVerdictRedact(int[] p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.Set<java.lang.Integer> getRedactAppUids() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
