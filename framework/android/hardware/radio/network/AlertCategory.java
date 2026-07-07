package android.hardware.radio.network;

public @interface AlertCategory {
    public static final int ATTRACTIVE_CELL = 7;
    public static final int AUTH_PASSED = 10;
    public static final int DOS_NETWORK = 6;
    public static final int DOWNGRADE = 1;
    public static final int DOWNGRADE_2G = 2;
    public static final int DOWNGRADE_3G = 3;
    public static final int DOWNGRADE_4G = 4;
    public static final int IMPRISONMENT = 5;
    public static final int JAMMING = 8;
    public static final int LOCATION_TRACKING = 9;
    public static final int UNAUTH_EMERGENCY_MSG = 12;
    public static final int UNAUTH_SMS = 11;
    public static final int UNSPECIFIED = 0;

    public static interface $ {
        public static java.lang.String arrayToString(java.lang.Object p0) { return null; }
        public static java.lang.String toString(int p0) { return null; }
    }
}
