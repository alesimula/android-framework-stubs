package android.app.admin.dataleakprevention;

public final class AppDestinationMatcher implements android.app.admin.dataleakprevention.DestinationMatcher, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.admin.dataleakprevention.AppDestinationMatcher> CREATOR = null;
    private final android.app.admin.dataleakprevention.AppMatcher mAppMatcher = null;
    private final int[] mUserAffiliatedStates = null;
    private AppDestinationMatcher(android.os.Parcel p0) {}
    public AppDestinationMatcher(int[] p0, android.app.admin.dataleakprevention.AppMatcher p1) {}
    private void checkUserAffiliatedState(int p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.app.admin.dataleakprevention.AppMatcher getAppMatcher() { return null; }
    public int[] getUserAffiliatedStates() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
