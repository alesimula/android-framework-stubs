package android.net.metrics;

@android.annotation.SystemApi
@java.lang.Deprecated
public final class ApfStats implements android.net.metrics.IpConnectivityLog.Event {
    public static final android.os.Parcelable.Creator<android.net.metrics.ApfStats> CREATOR = null;
    public final int droppedRas = 0;
    public final long durationMs = 0L;
    public final int matchingRas = 0;
    public final int maxProgramSize = 0;
    public final int parseErrors = 0;
    public final int programUpdates = 0;
    public final int programUpdatesAll = 0;
    public final int programUpdatesAllowingMulticast = 0;
    public final int receivedRas = 0;
    public final int zeroLifetimeRas = 0;
    private ApfStats(long p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9) {}
    private ApfStats(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.SystemApi
    public static final class Builder {
        private int mDroppedRas;
        private long mDurationMs;
        private int mMatchingRas;
        private int mMaxProgramSize;
        private int mParseErrors;
        private int mProgramUpdates;
        private int mProgramUpdatesAll;
        private int mProgramUpdatesAllowingMulticast;
        private int mReceivedRas;
        private int mZeroLifetimeRas;
        public Builder() {}
        public android.net.metrics.ApfStats build() { return null; }
        public android.net.metrics.ApfStats.Builder setDroppedRas(int p0) { return null; }
        public android.net.metrics.ApfStats.Builder setDurationMs(long p0) { return null; }
        public android.net.metrics.ApfStats.Builder setMatchingRas(int p0) { return null; }
        public android.net.metrics.ApfStats.Builder setMaxProgramSize(int p0) { return null; }
        public android.net.metrics.ApfStats.Builder setParseErrors(int p0) { return null; }
        public android.net.metrics.ApfStats.Builder setProgramUpdates(int p0) { return null; }
        public android.net.metrics.ApfStats.Builder setProgramUpdatesAll(int p0) { return null; }
        public android.net.metrics.ApfStats.Builder setProgramUpdatesAllowingMulticast(int p0) { return null; }
        public android.net.metrics.ApfStats.Builder setReceivedRas(int p0) { return null; }
        public android.net.metrics.ApfStats.Builder setZeroLifetimeRas(int p0) { return null; }
    }
}
