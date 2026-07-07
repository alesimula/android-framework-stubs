package com.android.modules.expresslog;

@java.lang.Deprecated
public final class Histogram {
    private final com.android.modules.expresslog.Histogram.BinOptions mBinOptions = null;
    private final java.lang.String mMetricId = null;
    public Histogram(java.lang.String p0, com.android.modules.expresslog.Histogram.BinOptions p1) {}
    public void logSample(float p0) {}
    public void logSampleWithUid(int p0, float p1) {}

    public static interface BinOptions {
        public int getBinForSample(float p0);
        public int getBinsCount();
    }

    public static final class ScaledRangeOptions implements com.android.modules.expresslog.Histogram.BinOptions {
        final long[] mBins = null;
        public ScaledRangeOptions(int p0, int p1, float p2, float p3) {}
        private static long[] initBins(int p0, int p1, float p2, float p3) { return null; }
        private static int lower_bound(long[] p0, long p1) { return 0; }
        public int getBinForSample(float p0) { return 0; }
        public int getBinsCount() { return 0; }
    }

    public static final class UniformOptions implements com.android.modules.expresslog.Histogram.BinOptions {
        private final int mBinCount = 0;
        private final float mBinSize = 0.0f;
        private final float mExclusiveMaxValue = 0.0f;
        private final float mMinValue = 0.0f;
        public UniformOptions(int p0, float p1, float p2) {}
        public int getBinForSample(float p0) { return 0; }
        public int getBinsCount() { return 0; }
    }
}
