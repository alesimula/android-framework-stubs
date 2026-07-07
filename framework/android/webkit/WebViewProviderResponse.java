package android.webkit;

@android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
public final class WebViewProviderResponse implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.webkit.WebViewProviderResponse> CREATOR = null;
    public static final int STATUS_FAILED_LISTING_WEBVIEW_PACKAGES = 4;
    public static final int STATUS_FAILED_OTHER = 11;
    public static final int STATUS_FAILED_WAITING_FOR_RELRO = 3;
    public static final int STATUS_SUCCESS = 0;
    public final android.content.pm.PackageInfo packageInfo = null;
    public final int status = 0;
    public WebViewProviderResponse(android.content.pm.PackageInfo p0, int p1) {}
    private WebViewProviderResponse(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface WebViewProviderStatus {
    }
}
