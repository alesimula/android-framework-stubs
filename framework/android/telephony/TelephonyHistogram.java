package android.telephony;

@android.annotation.SystemApi
public final class TelephonyHistogram implements android.os.Parcelable {
    private static final int ABSENT = 0;
    public static final android.os.Parcelable.Creator<android.telephony.TelephonyHistogram> CREATOR = null;
    private static final int PRESENT = 1;
    private static final int RANGE_CALCULATION_COUNT = 10;
    public static final int TELEPHONY_CATEGORY_RIL = 1;
    private int mAverageTimeMs;
    private final int mBucketCount = 0;
    private final int[] mBucketCounters = null;
    private final int[] mBucketEndPoints = null;
    private final int mCategory = 0;
    private final int mId = 0;
    private int[] mInitialTimings;
    private int mMaxTimeMs;
    private int mMinTimeMs;
    private int mSampleCount;
    public TelephonyHistogram(int p0, int p1, int p2) {}
    public TelephonyHistogram(android.os.Parcel p0) {}
    public TelephonyHistogram(android.telephony.TelephonyHistogram p0) {}
    private void addToBucketCounter(int[] p0, int[] p1, int p2) {}
    private void calculateBucketEndPoints(int[] p0) {}
    private int[] getDeepCopyOfArray(int[] p0) { return null; }
    private int[] getInitialTimings() { return null; }
    public void addTimeTaken(int p0) {}
    public int describeContents() { return 0; }
    public int getAverageTime() { return 0; }
    public int getBucketCount() { return 0; }
    public int[] getBucketCounters() { return null; }
    public int[] getBucketEndPoints() { return null; }
    public int getCategory() { return 0; }
    public int getId() { return 0; }
    public int getMaxTime() { return 0; }
    public int getMinTime() { return 0; }
    public int getSampleCount() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
