package android.hardware.radio.network;

public @interface ReasonCode {
    public static final int ATTRACTIVE_CELL_IMSI_CATCHER_PARAMETERS = 16;
    public static final int ATTRACTIVE_CELL_MISSING_NEIGHBOR_INFO = 15;
    public static final int ATTRACTIVE_CELL_UNEXPECTED_PLMN_ID = 14;
    public static final int ATTRACTIVE_CELL_VERY_HIGH_RX_LEVEL = 13;
    public static final int DOS_AUTHENTICATION_REQUEST_FLOOD = 11;
    public static final int DOS_CONNECTION_SETUP_FAIL_LOOP = 10;
    public static final int DOS_DETACH_ATTACH_CYCLE = 12;
    public static final int DOS_EXCESSIVE_PAGING_RATE = 9;
    public static final int DOWNGRADE_FORCED_HANDOVER = 4;
    public static final int DOWNGRADE_HIGHER_RAT_REJECTED = 2;
    public static final int DOWNGRADE_SIGNAL_STRENGTH_ANOMALY = 3;
    public static final int DOWNGRADE_WEAK_CIPHER_SUITES_OFFERED = 1;
    public static final int IMPRISONMENT_BARRING_OF_OTHER_CELLS = 7;
    public static final int IMPRISONMENT_CELL_RESELECTION_FAILURE = 5;
    public static final int IMPRISONMENT_NEIGHBOR_LIST_EMPTY_OR_INVALID = 6;
    public static final int IMPRISONMENT_REJECTED_FROM_NEIGHBORS = 8;
    public static final int JAMMING_NARROWBAND_INTERFERENCE = 18;
    public static final int JAMMING_SNR_DEGRADATION = 19;
    public static final int JAMMING_WIDEBAND_INTERFERENCE = 17;
    public static final int LOCATION_FREQUENT_TRACKING_AREA_UPDATES = 20;
    public static final int LOCATION_PAGING_WITHOUT_FOLLOWUP = 22;
    public static final int LOCATION_SILENT_SMS_DETECTED = 21;
    public static final int UNAUTH_EMERGENCY_SOURCE_CELL_NOT_AUTHENTICATED = 27;
    public static final int UNAUTH_SMS_INTEGRITY_CHECK_FAILED = 23;
    public static final int UNAUTH_SMS_KNOWN_SPOOFING_METHOD = 26;
    public static final int UNAUTH_SMS_MISSING_SECURITY_HEADERS = 24;
    public static final int UNAUTH_SMS_UNTRUSTED_SME = 25;
    public static final int UNSPECIFIED = 0;

    public static interface $ {
        public static java.lang.String arrayToString(java.lang.Object p0) { return null; }
        public static java.lang.String toString(int p0) { return null; }
    }
}
