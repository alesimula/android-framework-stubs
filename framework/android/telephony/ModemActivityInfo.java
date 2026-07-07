package android.telephony;

@android.annotation.SystemApi
public final class ModemActivityInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.ModemActivityInfo> CREATOR = null;
    private static final int TX_POWER_LEVELS = 5;
    public static final int TX_POWER_LEVEL_0 = 0;
    public static final int TX_POWER_LEVEL_1 = 1;
    public static final int TX_POWER_LEVEL_2 = 2;
    public static final int TX_POWER_LEVEL_3 = 3;
    public static final int TX_POWER_LEVEL_4 = 4;
    private static final android.util.Range<java.lang.Integer>[] TX_POWER_RANGES = null;
    private android.telephony.ActivityStatsTechSpecificInfo[] mActivityStatsTechSpecificInfo;
    private int mIdleTimeMs;
    private int mSizeOfSpecificInfo;
    private int mSleepTimeMs;
    private long mTimestamp;
    private int mTotalRxTimeMs;
    private int[] mTotalTxTimeMs;
    public ModemActivityInfo(long p0, int p1, int p2, int[] p3, int p4) {}
    public ModemActivityInfo(long p0, int p1, int p2, android.telephony.ActivityStatsTechSpecificInfo[] p3) {}
    public ModemActivityInfo(long p0, long p1, long p2, int[] p3, long p4) {}
    public ModemActivityInfo(long p0, long p1, long p2, android.telephony.ActivityStatsTechSpecificInfo[] p3) {}
    public static int getNumTxPowerLevels() { return 0; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.telephony.ModemActivityInfo getDelta(android.telephony.ModemActivityInfo p0) { return null; }
    public long getIdleTimeMillis() { return 0L; }
    public long getReceiveTimeMillis() { return 0L; }
    public long getReceiveTimeMillis(int p0) { return 0L; }
    public long getReceiveTimeMillis(int p0, int p1) { return 0L; }
    public long getSleepTimeMillis() { return 0L; }
    public int getSpecificInfoFrequencyRange(int p0) { return 0; }
    public int getSpecificInfoLength() { return 0; }
    public int getSpecificInfoRat(int p0) { return 0; }
    public long getTimestampMillis() { return 0L; }
    public long getTransmitDurationMillisAtPowerLevel(int p0) { return 0L; }
    public long getTransmitDurationMillisAtPowerLevel(int p0, int p1) { return 0L; }
    public long getTransmitDurationMillisAtPowerLevel(int p0, int p1, int p2) { return 0L; }
    public android.util.Range<java.lang.Integer> getTransmitPowerRange(int p0) { return null; }
    public int[] getTransmitTimeMillis() { return null; }
    public int[] getTransmitTimeMillis(int p0) { return null; }
    public int[] getTransmitTimeMillis(int p0, int p1) { return null; }
    public int hashCode() { return 0; }
    public boolean isEmpty() { return false; }
    public boolean isValid() { return false; }
    public void setIdleTimeMillis(int p0) {}
    public void setIdleTimeMillis(long p0) {}
    public void setReceiveTimeMillis(int p0) {}
    public void setReceiveTimeMillis(int p0, int p1, long p2) {}
    public void setReceiveTimeMillis(int p0, long p1) {}
    public void setReceiveTimeMillis(long p0) {}
    public void setSleepTimeMillis(int p0) {}
    public void setSleepTimeMillis(long p0) {}
    public void setTimestamp(long p0) {}
    public void setTransmitTimeMillis(int p0, int p1, int[] p2) {}
    public void setTransmitTimeMillis(int p0, int[] p1) {}
    public void setTransmitTimeMillis(int[] p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TxPowerLevel {
    }
}
