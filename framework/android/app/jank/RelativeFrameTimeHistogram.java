package android.app.jank;

public class RelativeFrameTimeHistogram {
    private static int[] sBucketEndpoints;
    private int[] mBucketCounts;
    public RelativeFrameTimeHistogram() {}
    public static int getHistogramBucketCount() { return 0; }
    public static int getRelativeFrameTimeBucketIndex(int p0) { return 0; }
    public void addRelativeFrameTimeMillis(int p0) {}
    public int[] getBucketCounters() { return null; }
    public int[] getBucketEndpointsMillis() { return null; }
}
