package android.credentials.selection;

@android.annotation.SystemApi
public final class Entry implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.credentials.selection.Entry> CREATOR = null;
    private android.content.Intent mFrameworkExtrasIntent;
    private final java.lang.String mKey = null;
    private android.app.PendingIntent mPendingIntent;
    private final android.app.slice.Slice mSlice = null;
    private final java.lang.String mSubkey = null;
    private Entry(android.os.Parcel p0) {}
    public Entry(java.lang.String p0, java.lang.String p1, android.app.slice.Slice p2, android.content.Intent p3) {}
    public int describeContents() { return 0; }
    public android.content.Intent getFrameworkExtrasIntent() { return null; }
    public java.lang.String getKey() { return null; }
    public android.app.slice.Slice getSlice() { return null; }
    public java.lang.String getSubkey() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
