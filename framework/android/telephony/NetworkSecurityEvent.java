package android.telephony;

@android.annotation.SystemApi
public final class NetworkSecurityEvent implements android.os.Parcelable {
    public static final int ALERT_CATEGORY_ATTRACTIVE_CELL = 7;
    public static final int ALERT_CATEGORY_AUTH_PASSED = 10;
    public static final int ALERT_CATEGORY_DOS_NETWORK = 6;
    public static final int ALERT_CATEGORY_DOWNGRADE = 1;
    public static final int ALERT_CATEGORY_DOWNGRADE_2G = 2;
    public static final int ALERT_CATEGORY_DOWNGRADE_3G = 3;
    public static final int ALERT_CATEGORY_DOWNGRADE_4G = 4;
    public static final int ALERT_CATEGORY_IMPRISONMENT = 5;
    public static final int ALERT_CATEGORY_JAMMING = 8;
    public static final int ALERT_CATEGORY_LOCATION_TRACKING = 9;
    public static final int ALERT_CATEGORY_UNAUTH_EMERGENCY_MSG = 12;
    public static final int ALERT_CATEGORY_UNAUTH_SMS = 11;
    public static final int ALERT_CATEGORY_UNSPECIFIED = 0;
    public static final int ALERT_STATUS_DETECTED = 2;
    public static final int ALERT_STATUS_MITIGATED_CELL_BARRED = 3;
    public static final int ALERT_STATUS_MITIGATED_CELL_DEPRIORITIZED = 4;
    public static final int ALERT_STATUS_MITIGATED_UNSPECIFIED = 5;
    public static final int ALERT_STATUS_NOT_DETECTED = 1;
    public static final int ALERT_STATUS_UNSPECIFIED = 0;
    public static final android.os.Parcelable.Creator<android.telephony.NetworkSecurityEvent> CREATOR = null;
    public static final int REASON_CODE_ATTRACTIVE_CELL_IMSI_CATCHER_PARAMETERS = 16;
    public static final int REASON_CODE_ATTRACTIVE_CELL_MISSING_NEIGHBOR_INFO = 15;
    public static final int REASON_CODE_ATTRACTIVE_CELL_UNEXPECTED_PLMN_ID = 14;
    public static final int REASON_CODE_ATTRACTIVE_CELL_VERY_HIGH_RX_LEVEL = 13;
    public static final int REASON_CODE_DOS_AUTHENTICATION_REQUEST_FLOOD = 11;
    public static final int REASON_CODE_DOS_CONNECTION_SETUP_FAIL_LOOP = 10;
    public static final int REASON_CODE_DOS_DETACH_ATTACH_CYCLE = 12;
    public static final int REASON_CODE_DOS_EXCESSIVE_PAGING_RATE = 9;
    public static final int REASON_CODE_DOWNGRADE_FORCED_HANDOVER = 4;
    public static final int REASON_CODE_DOWNGRADE_HIGHER_RAT_REJECTED = 2;
    public static final int REASON_CODE_DOWNGRADE_SIGNAL_STRENGTH_ANOMALY = 3;
    public static final int REASON_CODE_DOWNGRADE_WEAK_CIPHER_SUITES_OFFERED = 1;
    public static final int REASON_CODE_IMPRISONMENT_BARRING_OF_OTHER_CELLS = 7;
    public static final int REASON_CODE_IMPRISONMENT_CELL_RESELECTION_FAILURE = 5;
    public static final int REASON_CODE_IMPRISONMENT_NEIGHBOR_LIST_EMPTY_OR_INVALID = 6;
    public static final int REASON_CODE_IMPRISONMENT_REJECTED_FROM_NEIGHBORS = 8;
    public static final int REASON_CODE_JAMMING_NARROWBAND_INTERFERENCE = 18;
    public static final int REASON_CODE_JAMMING_SNR_DEGRADATION = 19;
    public static final int REASON_CODE_JAMMING_WIDEBAND_INTERFERENCE = 17;
    public static final int REASON_CODE_LOCATION_FREQUENT_TRACKING_AREA_UPDATES = 20;
    public static final int REASON_CODE_LOCATION_PAGING_WITHOUT_FOLLOWUP = 22;
    public static final int REASON_CODE_LOCATION_SILENT_SMS_DETECTED = 21;
    public static final int REASON_CODE_UNAUTH_EMERGENCY_SOURCE_CELL_NOT_AUTHENTICATED = 27;
    public static final int REASON_CODE_UNAUTH_SMS_INTEGRITY_CHECK_FAILED = 23;
    public static final int REASON_CODE_UNAUTH_SMS_KNOWN_SPOOFING_METHOD = 26;
    public static final int REASON_CODE_UNAUTH_SMS_MISSING_SECURITY_HEADERS = 24;
    public static final int REASON_CODE_UNAUTH_SMS_UNTRUSTED_SME = 25;
    public static final int REASON_CODE_UNSPECIFIED = 0;
    private static final java.lang.String TAG = "NetworkSecurityEvent";
    private final int mAlertCategory = 0;
    private final int mAlertStatus = 0;
    private final int mArfcn = 0;
    private final long mCellId = 0L;
    private final boolean mIsEmergency = false;
    private final int mPhysicalCellId = 0;
    private final java.lang.String mPlmn = null;
    private final int mRat = 0;
    private final int[] mReasonCodes = null;
    public NetworkSecurityEvent(int p0, int p1, int[] p2, long p3, int p4, int p5, java.lang.String p6, int p7, boolean p8) {}
    private NetworkSecurityEvent(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getAlertCategory() { return 0; }
    public int getAlertStatus() { return 0; }
    public int getArfcn() { return 0; }
    public long getCellId() { return 0L; }
    public int getPhysicalCellId() { return 0; }
    public java.lang.String getPlmn() { return null; }
    public int getRat() { return 0; }
    public int[] getReasonCodes() { return null; }
    public int hashCode() { return 0; }
    public boolean isEmergency() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AlertCategory {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AlertStatus {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ReasonCode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RilRadioTechnology {
    }
}
