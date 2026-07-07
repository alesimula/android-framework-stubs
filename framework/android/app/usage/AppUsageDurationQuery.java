package android.app.usage;

public final class AppUsageDurationQuery implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.usage.AppUsageDurationQuery> CREATOR = null;
    private final long mEndTimeMillis = 0L;
    private final int mIntervalType = 0;
    private final long mStartTimeMillis = 0L;
    private AppUsageDurationQuery(android.app.usage.AppUsageDurationQuery.Builder p0) {}
    private AppUsageDurationQuery(android.os.Parcel p0) {}
    private static void validate(long p0, long p1, int p2) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public long getEndTimeMillis() { return 0L; }
    public int getIntervalType() { return 0; }
    public long getStartTimeMillis() { return 0L; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private long mEndTimeMillis;
        private int mIntervalType;
        private long mStartTimeMillis;
        public Builder(long p0, long p1, int p2) {}
        public android.app.usage.AppUsageDurationQuery build() { return null; }
        public android.app.usage.AppUsageDurationQuery.Builder setEndTimeMillis(long p0) { return null; }
        public android.app.usage.AppUsageDurationQuery.Builder setIntervalType(int p0) { return null; }
        public android.app.usage.AppUsageDurationQuery.Builder setStartTimeMillis(long p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface IntervalType {
    }
}
