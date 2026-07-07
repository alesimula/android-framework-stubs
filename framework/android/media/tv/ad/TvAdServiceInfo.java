package android.media.tv.ad;

public final class TvAdServiceInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.tv.ad.TvAdServiceInfo> CREATOR = null;
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "TvAdServiceInfo";
    private static final java.lang.String XML_START_TAG_NAME = "tv-ad-service";
    private final java.lang.String mId = null;
    private final android.content.pm.ResolveInfo mService = null;
    private final java.util.List<java.lang.String> mTypes = null;
    public TvAdServiceInfo(android.content.Context p0, android.content.ComponentName p1) {}
    private TvAdServiceInfo(android.content.pm.ResolveInfo p0, java.lang.String p1, java.util.List<java.lang.String> p2) {}
    private TvAdServiceInfo(android.os.Parcel p0) {}
    private static java.lang.String generateAdServiceId(android.content.ComponentName p0) { return null; }
    private static void parseServiceMetadata(android.content.pm.ResolveInfo p0, android.content.Context p1, java.util.List<java.lang.String> p2) {}
    public int describeContents() { return 0; }
    public android.content.ComponentName getComponent() { return null; }
    public java.lang.String getId() { return null; }
    public android.content.pm.ServiceInfo getServiceInfo() { return null; }
    public java.util.List<java.lang.String> getSupportedTypes() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
