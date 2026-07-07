package android.credentials.selection;

@android.annotation.SystemApi
public final class RequestInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.credentials.selection.RequestInfo> CREATOR = null;
    public static final java.lang.String EXTRA_REQUEST_INFO = "android.credentials.selection.extra.REQUEST_INFO";
    public static final java.lang.String TYPE_CREATE = "android.credentials.selection.TYPE_CREATE";
    public static final java.lang.String TYPE_GET = "android.credentials.selection.TYPE_GET";
    public static final java.lang.String TYPE_GET_VIA_REGISTRY = "android.credentials.selection.TYPE_GET_VIA_REGISTRY";
    public static final java.lang.String TYPE_UNDEFINED = "android.credentials.selection.TYPE_UNDEFINED";
    private final android.credentials.CreateCredentialRequest mCreateCredentialRequest = null;
    private final java.util.List<java.lang.String> mDefaultProviderIds = null;
    private final android.credentials.GetCredentialRequest mGetCredentialRequest = null;
    private final boolean mHasPermissionToOverrideDefault = false;
    private final boolean mIsShowAllOptionsRequested = false;
    private final java.lang.String mPackageName = null;
    private final java.util.List<java.lang.String> mRegistryProviderIds = null;
    private final android.os.IBinder mToken = null;
    private final java.lang.String mType = null;
    private RequestInfo(android.os.IBinder p0, java.lang.String p1, java.lang.String p2, android.credentials.CreateCredentialRequest p3, android.credentials.GetCredentialRequest p4, boolean p5, java.util.List<java.lang.String> p6, boolean p7) {}
    private RequestInfo(android.os.Parcel p0) {}
    public static android.credentials.selection.RequestInfo newCreateRequestInfo(android.os.IBinder p0, android.credentials.CreateCredentialRequest p1, java.lang.String p2, boolean p3, java.util.List<java.lang.String> p4, boolean p5) { return null; }
    public static android.credentials.selection.RequestInfo newGetRequestInfo(android.os.IBinder p0, android.credentials.GetCredentialRequest p1, java.lang.String p2, boolean p3, boolean p4) { return null; }
    public int describeContents() { return 0; }
    public android.credentials.CreateCredentialRequest getCreateCredentialRequest() { return null; }
    public java.util.List<java.lang.String> getDefaultProviderIds() { return null; }
    public android.credentials.GetCredentialRequest getGetCredentialRequest() { return null; }
    public java.lang.String getPackageName() { return null; }
    public java.util.List<java.lang.String> getRegistryProviderIds() { return null; }
    public android.credentials.selection.RequestToken getRequestToken() { return null; }
    public android.os.IBinder getToken() { return null; }
    public java.lang.String getType() { return null; }
    public boolean hasPermissionToOverrideDefault() { return false; }
    public boolean isShowAllOptionsRequested() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RequestType {
    }
}
