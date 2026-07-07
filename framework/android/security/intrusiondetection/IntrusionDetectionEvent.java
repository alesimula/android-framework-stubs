package android.security.intrusiondetection;

@android.annotation.SystemApi
public final class IntrusionDetectionEvent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.security.intrusiondetection.IntrusionDetectionEvent> CREATOR = null;
    public static final int NETWORK_EVENT_CONNECT = 2;
    public static final int NETWORK_EVENT_DNS = 1;
    public static final int SECURITY_EVENT = 0;
    private static final java.lang.String TAG = "IntrusionDetectionEvent";
    private final android.app.admin.ConnectEvent mNetworkEventConnect = null;
    private final android.app.admin.DnsEvent mNetworkEventDns = null;
    private final android.app.admin.SecurityLog.SecurityEvent mSecurityEvent = null;
    private final int mType = 0;
    private IntrusionDetectionEvent(android.app.admin.ConnectEvent p0) {}
    private IntrusionDetectionEvent(android.app.admin.DnsEvent p0) {}
    private IntrusionDetectionEvent(android.app.admin.SecurityLog.SecurityEvent p0) {}
    private IntrusionDetectionEvent(android.os.Parcel p0) {}
    public static android.security.intrusiondetection.IntrusionDetectionEvent createForConnectEvent(android.app.admin.ConnectEvent p0) { return null; }
    public static android.security.intrusiondetection.IntrusionDetectionEvent createForDnsEvent(android.app.admin.DnsEvent p0) { return null; }
    public static android.security.intrusiondetection.IntrusionDetectionEvent createForSecurityEvent(android.app.admin.SecurityLog.SecurityEvent p0) { return null; }
    public int describeContents() { return 0; }
    public android.app.admin.ConnectEvent getConnectEvent() { return null; }
    public android.app.admin.DnsEvent getDnsEvent() { return null; }
    public android.app.admin.SecurityLog.SecurityEvent getSecurityEvent() { return null; }
    public int getType() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EventType {
    }
}
