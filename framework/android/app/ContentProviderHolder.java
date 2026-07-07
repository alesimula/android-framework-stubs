package android.app;

public class ContentProviderHolder implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.ContentProviderHolder> CREATOR = null;
    public android.os.IBinder connection;
    public final android.content.pm.ProviderInfo info = null;
    public boolean mLocal;
    public boolean noReleaseNeeded;
    public boolean noReleaseNeededIfUnstable;
    public android.content.IContentProvider provider;
    public ContentProviderHolder(android.content.pm.ProviderInfo p0) {}
    private ContentProviderHolder(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
