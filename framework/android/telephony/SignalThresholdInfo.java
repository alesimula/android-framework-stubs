package android.telephony;

public final class SignalThresholdInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.SignalThresholdInfo> CREATOR = null;
    private static final int HYSTERESIS_DB_DEFAULT = 2;
    public static final int HYSTERESIS_DB_MINIMUM = 0;
    public static final int HYSTERESIS_MS_DISABLED = 0;
    public static final int MAXIMUM_NUMBER_OF_THRESHOLDS_ALLOWED = 4;
    public static final int MINIMUM_NUMBER_OF_THRESHOLDS_ALLOWED = 1;
    public static final int SIGNAL_ECNO_MAX_VALUE = 1;
    public static final int SIGNAL_ECNO_MIN_VALUE = -24;
    public static final int SIGNAL_MEASUREMENT_TYPE_ECNO = 9;
    public static final int SIGNAL_MEASUREMENT_TYPE_RSCP = 2;
    public static final int SIGNAL_MEASUREMENT_TYPE_RSRP = 3;
    public static final int SIGNAL_MEASUREMENT_TYPE_RSRQ = 4;
    public static final int SIGNAL_MEASUREMENT_TYPE_RSSI = 1;
    public static final int SIGNAL_MEASUREMENT_TYPE_RSSNR = 5;
    public static final int SIGNAL_MEASUREMENT_TYPE_SSRSRP = 6;
    public static final int SIGNAL_MEASUREMENT_TYPE_SSRSRQ = 7;
    public static final int SIGNAL_MEASUREMENT_TYPE_SSSINR = 8;
    public static final int SIGNAL_MEASUREMENT_TYPE_UNKNOWN = 0;
    public static final int SIGNAL_RSCP_MAX_VALUE = -25;
    public static final int SIGNAL_RSCP_MIN_VALUE = -120;
    public static final int SIGNAL_RSRP_MAX_VALUE = -44;
    public static final int SIGNAL_RSRP_MIN_VALUE = -140;
    public static final int SIGNAL_RSRQ_MAX_VALUE = 3;
    public static final int SIGNAL_RSRQ_MIN_VALUE = -34;
    public static final int SIGNAL_RSSI_MAX_VALUE = -51;
    public static final int SIGNAL_RSSI_MIN_VALUE = -113;
    public static final int SIGNAL_RSSNR_MAX_VALUE = 30;
    public static final int SIGNAL_RSSNR_MIN_VALUE = -20;
    public static final int SIGNAL_SSRSRP_MAX_VALUE = -44;
    public static final int SIGNAL_SSRSRP_MIN_VALUE = -140;
    public static final int SIGNAL_SSRSRQ_MAX_VALUE = 20;
    public static final int SIGNAL_SSRSRQ_MIN_VALUE = -43;
    public static final int SIGNAL_SSSINR_MAX_VALUE = 40;
    public static final int SIGNAL_SSSINR_MIN_VALUE = -23;
    private final int mHysteresisDb = 0;
    private final int mHysteresisMs = 0;
    private final boolean mIsEnabled = false;
    private final int mRan = 0;
    private final int mSignalMeasurementType = 0;
    private final int[] mThresholds = null;
    private SignalThresholdInfo(int p0, int p1, int p2, int p3, int[] p4, boolean p5) {}
    private SignalThresholdInfo(android.os.Parcel p0) {}
    public static int getMaximumNumberOfThresholdsAllowed() { return 0; }
    public static int getMinimumNumberOfThresholdsAllowed() { return 0; }
    private static boolean isValidRanWithMeasurementType(int p0, int p1) { return false; }
    private static boolean isValidThreshold(int p0, int p1) { return false; }
    private void validateRanWithMeasurementType(int p0, int p1) {}
    private void validateThresholdRange(int p0, int[] p1) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getHysteresisDb() { return 0; }
    public int getHysteresisMs() { return 0; }
    public int getRadioAccessNetworkType() { return 0; }
    public int getSignalMeasurementType() { return 0; }
    public int[] getThresholds() { return null; }
    public int hashCode() { return 0; }
    public boolean isEnabled() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private int mHysteresisDb;
        private int mHysteresisMs;
        private boolean mIsEnabled;
        private int mRan;
        private int mSignalMeasurementType;
        private int[] mThresholds;
        public Builder() {}
        public android.telephony.SignalThresholdInfo build() { return null; }
        public android.telephony.SignalThresholdInfo.Builder setHysteresisDb(int p0) { return null; }
        public android.telephony.SignalThresholdInfo.Builder setHysteresisMs(int p0) { return null; }
        public android.telephony.SignalThresholdInfo.Builder setIsEnabled(boolean p0) { return null; }
        public android.telephony.SignalThresholdInfo.Builder setRadioAccessNetworkType(int p0) { return null; }
        public android.telephony.SignalThresholdInfo.Builder setSignalMeasurementType(int p0) { return null; }
        public android.telephony.SignalThresholdInfo.Builder setThresholds(int[] p0) { return null; }
        public android.telephony.SignalThresholdInfo.Builder setThresholds(int[] p0, boolean p1) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SignalMeasurementType {
    }
}
