package android.content;

public final class AutofillOptions implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.AutofillOptions> CREATOR = null;
    private static final java.lang.String TAG = null;
    public long appDisabledExpiration;
    public boolean augmentedAutofillEnabled;
    public final boolean compatModeEnabled = false;
    public android.util.ArrayMap<java.lang.String, java.lang.Long> disabledActivities;
    public final int loggingLevel = 0;
    public android.util.ArraySet<android.content.ComponentName> whitelistedActivitiesForAugmentedAutofill;
    public AutofillOptions(int p0, boolean p1) {}
    public static android.content.AutofillOptions forWhitelistingItself() { return null; }
    public int describeContents() { return 0; }
    public void dumpShort(java.io.PrintWriter p0) {}
    public boolean isAugmentedAutofillEnabled(android.content.Context p0) { return false; }
    public boolean isAutofillDisabledLocked(android.content.ComponentName p0) { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
