package android.content.pm;

@android.annotation.SystemApi
public final class InstantAppIntentFilter implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.pm.InstantAppIntentFilter> CREATOR = null;
    private final java.util.List<android.content.IntentFilter> mFilters = null;
    private final java.lang.String mSplitName = null;
    InstantAppIntentFilter(android.os.Parcel p0) {}
    public InstantAppIntentFilter(java.lang.String p0, java.util.List<android.content.IntentFilter> p1) {}
    public int describeContents() { return 0; }
    public java.util.List<android.content.IntentFilter> getFilters() { return null; }
    public java.lang.String getSplitName() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
