package android.telephony;

public final class SubscriptionPlan implements android.os.Parcelable {
    public static final long BITRATE_UNKNOWN = -1L;
    public static final long BYTES_UNKNOWN = -1L;
    public static final long BYTES_UNLIMITED = 9223372036854775807L;
    public static final android.os.Parcelable.Creator<android.telephony.SubscriptionPlan> CREATOR = null;
    public static final int LIMIT_BEHAVIOR_BILLED = 1;
    public static final int LIMIT_BEHAVIOR_DISABLED = 0;
    public static final int LIMIT_BEHAVIOR_THROTTLED = 2;
    public static final int LIMIT_BEHAVIOR_UNKNOWN = -1;
    public static final int PLAN_TYPE_BUSINESS = 8;
    public static final int PLAN_TYPE_CELLULAR = 1;
    public static final int PLAN_TYPE_DATA_ONLY = 6;
    public static final int PLAN_TYPE_FAMILY = 7;
    public static final int PLAN_TYPE_IOT = 3;
    public static final int PLAN_TYPE_POSTPAID = 4;
    public static final int PLAN_TYPE_PREPAID = 5;
    public static final int PLAN_TYPE_ROAMING = 9;
    public static final int PLAN_TYPE_SATELLITE = 2;
    public static final int PLAN_TYPE_TETHERING = 10;
    public static final int SUBSCRIPTION_STATUS_ACTIVE = 1;
    public static final int SUBSCRIPTION_STATUS_INACTIVE = 2;
    public static final int SUBSCRIPTION_STATUS_SUSPENDED = 4;
    public static final int SUBSCRIPTION_STATUS_TRIAL = 3;
    public static final int SUBSCRIPTION_STATUS_UNKNOWN = 0;
    public static final long TIME_UNKNOWN = -1L;
    public static final int UNSPECIFIED_ID = -1;
    private final android.util.RecurrenceRule mCycleRule = null;
    private final int mDataLimitBehavior = 0;
    private final long mDataLimitBytes = 0L;
    private final long mDataUsageBytes = 0L;
    private final java.time.ZonedDateTime mDataUsageResetTime = null;
    private final long mDataUsageTime = 0L;
    private final int mId = 0;
    private final java.util.Set<java.lang.Integer> mNetworkTypes = null;
    private final long mStreamingAppMaxDownlinkKbps = 0L;
    private final long mStreamingAppMaxUplinkKbps = 0L;
    private final int mSubscriptionStatus = 0;
    private final java.lang.CharSequence mSummary = null;
    private final java.lang.CharSequence mTitle = null;
    private final java.util.Set<java.lang.Integer> mTypes = null;
    private SubscriptionPlan(android.os.Parcel p0) {}
    private SubscriptionPlan(android.telephony.SubscriptionPlan.Builder p0) {}
    private static java.lang.String limitBehaviorToString(int p0) { return null; }
    private static java.lang.String planTypeToString(int p0) { return null; }
    private static java.lang.String subscriptionStatusToString(int p0) { return null; }
    private static java.lang.String timeToString(long p0) { return null; }
    public java.util.Iterator<android.util.Range<java.time.ZonedDateTime>> cycleIterator() { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.util.RecurrenceRule getCycleRule() { return null; }
    public int getDataLimitBehavior() { return 0; }
    public long getDataLimitBytes() { return 0L; }
    public long getDataUsageBytes() { return 0L; }
    public java.time.ZonedDateTime getDataUsageResetTime() { return null; }
    public long getDataUsageTime() { return 0L; }
    public int getId() { return 0; }
    public int[] getNetworkTypes() { return null; }
    public java.time.ZonedDateTime getPlanEndDate() { return null; }
    public long getStreamingAppMaxDownlinkKbps() { return 0L; }
    public long getStreamingAppMaxUplinkKbps() { return 0L; }
    public int getSubscriptionStatus() { return 0; }
    public java.lang.CharSequence getSummary() { return null; }
    public java.lang.CharSequence getTitle() { return null; }
    public java.util.Set<java.lang.Integer> getTypes() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class Builder {
        private final android.util.RecurrenceRule mCycleRule = null;
        private int mDataLimitBehavior;
        private long mDataLimitBytes;
        private long mDataUsageBytes;
        private java.time.ZonedDateTime mDataUsageResetTime;
        private long mDataUsageTime;
        private int mId;
        private int[] mNetworkTypes;
        private long mStreamingAppMaxDownlinkKbps;
        private long mStreamingAppMaxUplinkKbps;
        private int mSubscriptionStatus;
        private java.lang.CharSequence mSummary;
        private java.lang.CharSequence mTitle;
        private int[] mTypes;
        public Builder(java.time.ZonedDateTime p0, java.time.ZonedDateTime p1, java.time.Period p2) {}
        public static android.telephony.SubscriptionPlan.Builder createNonrecurring(java.time.Period p0) { return null; }
        public static android.telephony.SubscriptionPlan.Builder createNonrecurring(java.time.ZonedDateTime p0, java.time.ZonedDateTime p1) { return null; }
        public static android.telephony.SubscriptionPlan.Builder createRecurring(java.time.ZonedDateTime p0, java.time.Period p1) { return null; }
        @android.annotation.SystemApi
        @java.lang.Deprecated
        public static android.telephony.SubscriptionPlan.Builder createRecurringDaily(java.time.ZonedDateTime p0) { return null; }
        @android.annotation.SystemApi
        @java.lang.Deprecated
        public static android.telephony.SubscriptionPlan.Builder createRecurringMonthly(java.time.ZonedDateTime p0) { return null; }
        @android.annotation.SystemApi
        @java.lang.Deprecated
        public static android.telephony.SubscriptionPlan.Builder createRecurringWeekly(java.time.ZonedDateTime p0) { return null; }
        public android.telephony.SubscriptionPlan build() { return null; }
        public android.telephony.SubscriptionPlan.Builder resetNetworkTypes() { return null; }
        public android.telephony.SubscriptionPlan.Builder setDataLimit(long p0, int p1) { return null; }
        public android.telephony.SubscriptionPlan.Builder setDataUsage(long p0, long p1) { return null; }
        public android.telephony.SubscriptionPlan.Builder setDataUsageResetTime(java.time.ZonedDateTime p0) { return null; }
        public android.telephony.SubscriptionPlan.Builder setId(int p0) { return null; }
        public android.telephony.SubscriptionPlan.Builder setNetworkTypes(int[] p0) { return null; }
        public android.telephony.SubscriptionPlan.Builder setStreamingAppMaxDownlinkKbps(long p0) { return null; }
        public android.telephony.SubscriptionPlan.Builder setStreamingAppMaxUplinkKbps(long p0) { return null; }
        public android.telephony.SubscriptionPlan.Builder setSubscriptionStatus(int p0) { return null; }
        public android.telephony.SubscriptionPlan.Builder setSummary(java.lang.CharSequence p0) { return null; }
        public android.telephony.SubscriptionPlan.Builder setTitle(java.lang.CharSequence p0) { return null; }
        public android.telephony.SubscriptionPlan.Builder setTypes(int[] p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LimitBehavior {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PlanType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SubscriptionStatus {
    }
}
