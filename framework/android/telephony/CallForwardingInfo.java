package android.telephony;

@android.annotation.SystemApi
public final class CallForwardingInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.CallForwardingInfo> CREATOR = null;
    public static final int REASON_ALL = 4;
    public static final int REASON_ALL_CONDITIONAL = 5;
    public static final int REASON_BUSY = 1;
    public static final int REASON_NOT_REACHABLE = 3;
    public static final int REASON_NO_REPLY = 2;
    public static final int REASON_UNCONDITIONAL = 0;
    private static final java.lang.String TAG = "CallForwardingInfo";
    private boolean mEnabled;
    private java.lang.String mNumber;
    private int mReason;
    private int mTimeSeconds;
    private CallForwardingInfo(android.os.Parcel p0) {}
    public CallForwardingInfo(boolean p0, int p1, java.lang.String p2, int p3) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String getNumber() { return null; }
    public int getReason() { return 0; }
    public int getTimeoutSeconds() { return 0; }
    public int hashCode() { return 0; }
    public boolean isEnabled() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CallForwardingReason {
    }
}
