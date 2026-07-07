package android.telephony.ims.feature;

@android.annotation.SystemApi
public final class ConnectionFailureInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.ims.feature.ConnectionFailureInfo> CREATOR = null;
    public static final int REASON_ACCESS_DENIED = 1;
    public static final int REASON_NAS_FAILURE = 2;
    public static final int REASON_NONE = 0;
    public static final int REASON_NO_SERVICE = 7;
    public static final int REASON_PDN_NOT_AVAILABLE = 8;
    public static final int REASON_RACH_FAILURE = 3;
    public static final int REASON_RF_BUSY = 9;
    public static final int REASON_RLC_FAILURE = 4;
    public static final int REASON_RRC_REJECT = 5;
    public static final int REASON_RRC_TIMEOUT = 6;
    public static final int REASON_UNSPECIFIED = 65535;
    private static final android.util.SparseArray<java.lang.String> sReasonMap = null;
    private final int mCauseCode = 0;
    private final int mReason = 0;
    private final int mWaitTimeMillis = 0;
    public ConnectionFailureInfo(int p0, int p1, int p2) {}
    private ConnectionFailureInfo(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public int getCauseCode() { return 0; }
    public int getReason() { return 0; }
    public int getWaitTimeMillis() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FailureReason {
    }
}
