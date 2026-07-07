package android.media.tv.interactive;

public final class TvInteractiveAppServiceInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.tv.interactive.TvInteractiveAppServiceInfo> CREATOR = null;
    private static final boolean DEBUG = false;
    public static final int INTERACTIVE_APP_SUBTYPE_HBBTV_BI_ONLY = 3;
    public static final int INTERACTIVE_APP_SUBTYPE_HBBTV_COMMON = 1;
    public static final int INTERACTIVE_APP_SUBTYPE_HBBTV_OPAPP = 2;
    public static final int INTERACTIVE_APP_SUBTYPE_NONE = 0;
    public static final int INTERACTIVE_APP_TYPE_ATSC = 2;
    public static final int INTERACTIVE_APP_TYPE_GINGA = 4;
    public static final int INTERACTIVE_APP_TYPE_HBBTV = 1;
    public static final int INTERACTIVE_APP_TYPE_OTHER = -2147483648;
    public static final int INTERACTIVE_APP_TYPE_TARGETED_AD = 8;
    private static final java.lang.String TAG = "TvInteractiveAppServiceInfo";
    private static final java.lang.String XML_START_TAG_NAME = "tv-interactive-app";
    private final java.util.List<java.lang.String> mExtraTypes = null;
    private final java.lang.String mId = null;
    private final android.content.pm.ResolveInfo mService = null;
    private int mTypes;
    public TvInteractiveAppServiceInfo(android.content.Context p0, android.content.ComponentName p1) {}
    TvInteractiveAppServiceInfo(android.content.pm.ResolveInfo p0, java.lang.String p1, int p2, java.util.List<java.lang.String> p3) {}
    private TvInteractiveAppServiceInfo(android.os.Parcel p0) {}
    private static java.lang.String generateInteractiveAppServiceId(android.content.ComponentName p0) { return null; }
    private static void parseServiceMetadata(android.content.pm.ResolveInfo p0, android.content.Context p1, java.util.List<java.lang.String> p2) {}
    private void toTypesFlag(java.util.List<java.lang.String> p0) {}
    public int describeContents() { return 0; }
    public android.content.ComponentName getComponent() { return null; }
    public java.util.List<java.lang.String> getCustomSupportedTypes() { return null; }
    public java.lang.String getId() { return null; }
    public android.content.pm.ServiceInfo getServiceInfo() { return null; }
    public int getSupportedTypes() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface InteractiveAppSubtype {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface InteractiveAppType {
    }
}
