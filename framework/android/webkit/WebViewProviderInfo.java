package android.webkit;

@android.annotation.SystemApi
public final class WebViewProviderInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.webkit.WebViewProviderInfo> CREATOR = null;
    public final boolean availableByDefault = false;
    public final java.lang.String description = null;
    public final boolean isFallback = false;
    public final java.lang.String packageName = null;
    public final android.content.pm.Signature[] signatures = null;
    private WebViewProviderInfo(android.os.Parcel p0) {}
    public WebViewProviderInfo(java.lang.String p0, java.lang.String p1, boolean p2, boolean p3, java.lang.String[] p4) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
