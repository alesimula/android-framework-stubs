package com.android.internal.os;

public class BinderLatencyObserver {
    public static final int BUCKET_COUNT_DEFAULT = 100;
    public static final float BUCKET_SCALE_FACTOR_DEFAULT = 1.125f;
    public static final int FIRST_BUCKET_SIZE_DEFAULT = 5;
    private static final int LAST_HISTOGRAM_BUFFER_SIZE_BYTES = 1000;
    private static final int MAX_ATOM_SIZE_BYTES = 4064;
    public static final int PERIODIC_SAMPLING_INTERVAL_DEFAULT = 10;
    public static final int SHARDING_MODULO_DEFAULT = 1;
    public static final int STATSD_PUSH_INTERVAL_MINUTES_DEFAULT = 360;
    private static final java.lang.String TAG = "BinderLatencyObserver";
    private int mBucketCount;
    private float mBucketScaleFactor;
    private int mFirstBucketSize;
    private com.android.internal.os.BinderLatencyBuckets mLatencyBuckets;
    private final android.util.ArrayMap<com.android.internal.os.BinderLatencyObserver.LatencyDims, int[]> mLatencyHistograms = null;
    private final android.os.Handler mLatencyObserverHandler = null;
    private java.lang.Runnable mLatencyObserverRunnable;
    private final java.lang.Object mLock = null;
    private int mPeriodicSamplingInterval;
    private final int mProcessSource = 0;
    private final java.util.Random mRandom = null;
    private int mShardingModulo;
    private int mShardingOffset;
    private int mStatsdPushIntervalMinutes;
    public BinderLatencyObserver(com.android.internal.os.BinderLatencyObserver.Injector p0, int p1) {}
    private void fillApiStatsProto(android.util.proto.ProtoOutputStream p0, com.android.internal.os.BinderLatencyObserver.LatencyDims p1, java.lang.String p2, int[] p3) {}
    private void noteLatencyDelayed() {}
    public void callEnded(com.android.internal.os.BinderInternal.CallSession p0) {}
    protected long getElapsedRealtimeMicro() { return 0L; }
    public android.util.ArrayMap<com.android.internal.os.BinderLatencyObserver.LatencyDims, int[]> getLatencyHistograms() { return null; }
    protected int getMaxAtomSizeBytes() { return 0; }
    public int getProcessSource() { return 0; }
    public java.lang.Runnable getStatsdPushRunnable() { return null; }
    public void reset() {}
    public void setHistogramBucketsParams(int p0, int p1, float p2) {}
    public void setPushInterval(int p0) {}
    public void setSamplingInterval(int p0) {}
    public void setShardingModulo(int p0) {}
    protected boolean shouldCollect(com.android.internal.os.BinderLatencyObserver.LatencyDims p0) { return false; }
    protected boolean shouldKeepSample() { return false; }
    protected void writeAtomToStatsd(android.util.proto.ProtoOutputStream p0) {}

    public static class Injector {
        public Injector() {}
        public android.os.Handler getHandler() { return null; }
        public java.util.Random getRandomGenerator() { return null; }
    }

    public static class LatencyDims {
        private java.lang.Class<? extends android.os.Binder> mBinderClass;
        private int mHashCode;
        private int mTransactionCode;
        private LatencyDims(java.lang.Class<? extends android.os.Binder> p0, int p1) {}
        public static com.android.internal.os.BinderLatencyObserver.LatencyDims create(java.lang.Class<? extends android.os.Binder> p0, int p1) { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.Class<? extends android.os.Binder> getBinderClass() { return null; }
        public int getTransactionCode() { return 0; }
        public int hashCode() { return 0; }
    }
}
