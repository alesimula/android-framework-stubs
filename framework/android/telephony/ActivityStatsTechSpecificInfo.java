package android.telephony;

public final class ActivityStatsTechSpecificInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.ActivityStatsTechSpecificInfo> CREATOR = null;
    private static final int TX_POWER_LEVELS = 5;
    private int mFrequencyRange;
    private int mRat;
    private int mRxTimeMs;
    private int[] mTxTimeMs;
    public ActivityStatsTechSpecificInfo(int p0, int p1, int[] p2, int p3) {}
    private static java.lang.String ratToString(int p0) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getFrequencyRange() { return 0; }
    public int getRat() { return 0; }
    public long getReceiveTimeMillis() { return 0L; }
    public long getTransmitTimeMillis(int p0) { return 0L; }
    public int[] getTransmitTimeMillis() { return null; }
    public int hashCode() { return 0; }
    public boolean isRxPowerEmpty() { return false; }
    public boolean isRxPowerValid() { return false; }
    public boolean isTxPowerEmpty() { return false; }
    public boolean isTxPowerValid() { return false; }
    public void setFrequencyRange(int p0) {}
    public void setRat(int p0) {}
    public void setReceiveTimeMillis(int p0) {}
    public void setReceiveTimeMillis(long p0) {}
    public void setTransmitTimeMillis(int[] p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
