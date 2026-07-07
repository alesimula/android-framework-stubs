package android.media.tv.interactive;

public class WebServiceClientInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.tv.interactive.WebServiceClientInfo> CREATOR = null;
    public static final int WEB_SERVICE_CLIENT_STATE_TRUSTED = 1;
    public static final int WEB_SERVICE_CLIENT_STATE_UNDEFINED = 0;
    public static final int WEB_SERVICE_CLIENT_STATE_UNTRUSTED = 2;
    private final int mClientState = 0;
    private final android.os.Bundle mExtra = null;
    private final int mHandle = 0;
    private final java.lang.String mName = null;
    private final java.lang.String mUuid = null;
    public WebServiceClientInfo(int p0, int p1, java.lang.String p2, java.lang.String p3, android.os.Bundle p4) {}
    WebServiceClientInfo(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getClientState() { return 0; }
    public android.os.Bundle getExtra() { return null; }
    public int getHandle() { return 0; }
    public java.lang.String getName() { return null; }
    public java.lang.String getUuid() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface WebServiceClientState {
    }
}
