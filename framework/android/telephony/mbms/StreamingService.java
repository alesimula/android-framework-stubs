package android.telephony.mbms;

public class StreamingService implements java.lang.AutoCloseable {
    public static final int BROADCAST_METHOD = 1;
    private static final java.lang.String LOG_TAG = "MbmsStreamingService";
    public static final int REASON_BY_USER_REQUEST = 1;
    public static final int REASON_END_OF_SESSION = 2;
    public static final int REASON_FREQUENCY_CONFLICT = 3;
    public static final int REASON_LEFT_MBMS_BROADCAST_AREA = 6;
    public static final int REASON_NONE = 0;
    public static final int REASON_NOT_CONNECTED_TO_HOMECARRIER_LTE = 5;
    public static final int REASON_OUT_OF_MEMORY = 4;
    public static final int STATE_STALLED = 3;
    public static final int STATE_STARTED = 2;
    public static final int STATE_STOPPED = 1;
    public static final int UNICAST_METHOD = 2;
    private final android.telephony.mbms.InternalStreamingServiceCallback mCallback = null;
    private final android.telephony.MbmsStreamingSession mParentSession = null;
    private android.telephony.mbms.vendor.IMbmsStreamingService mService;
    private final android.telephony.mbms.StreamingServiceInfo mServiceInfo = null;
    private final int mSubscriptionId = 0;
    public StreamingService(int p0, android.telephony.mbms.vendor.IMbmsStreamingService p1, android.telephony.MbmsStreamingSession p2, android.telephony.mbms.StreamingServiceInfo p3, android.telephony.mbms.InternalStreamingServiceCallback p4) {}
    private void sendErrorToApp(int p0, java.lang.String p1) {}
    public void close() {}
    public android.telephony.mbms.InternalStreamingServiceCallback getCallback() { return null; }
    public android.telephony.mbms.StreamingServiceInfo getInfo() { return null; }
    public android.net.Uri getPlaybackUri() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface StreamingState {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface StreamingStateChangeReason {
    }
}
