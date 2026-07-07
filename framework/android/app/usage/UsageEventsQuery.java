package android.app.usage;

public final class UsageEventsQuery implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.usage.UsageEventsQuery> CREATOR = null;
    private final long mBeginTimeMillis = 0L;
    private final long mEndTimeMillis = 0L;
    private final int[] mEventTypes = null;
    private final java.lang.String[] mPackageNames = null;
    private final int mUserId = 0;
    private UsageEventsQuery(android.app.usage.UsageEventsQuery.Builder p0) {}
    private UsageEventsQuery(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public long getBeginTimeMillis() { return 0L; }
    public long getEndTimeMillis() { return 0L; }
    public int[] getEventTypes() { return null; }
    public java.util.Set<java.lang.String> getPackageNames() { return null; }
    public int getUserId() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private final long mBeginTimeMillis = 0L;
        private final long mEndTimeMillis = 0L;
        private final android.util.ArraySet<java.lang.Integer> mEventTypes = null;
        private final android.util.ArraySet<java.lang.String> mPackageNames = null;
        private int mUserId;
        public Builder(long p0, long p1) {}
        public android.app.usage.UsageEventsQuery build() { return null; }
        public android.app.usage.UsageEventsQuery.Builder setEventTypes(int... p0) { return null; }
        public android.app.usage.UsageEventsQuery.Builder setPackageNames(java.lang.String... p0) { return null; }
        public android.app.usage.UsageEventsQuery.Builder setUserId(int p0) { return null; }
    }
}
