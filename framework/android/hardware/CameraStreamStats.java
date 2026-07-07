package android.hardware;

public class CameraStreamStats implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.CameraStreamStats> CREATOR = null;
    public static final int HISTOGRAM_TYPE_CAPTURE_LATENCY = 1;
    public static final int HISTOGRAM_TYPE_UNKNOWN = 0;
    private static final java.lang.String TAG = "CameraStreamStats";
    private int mColorSpace;
    private int mCurrentSurfaceId;
    private int mDataSpace;
    private long mDynamicRangeProfile;
    private long mErrorCount;
    private int mFormat;
    private int mHeight;
    private float[] mHistogramBins;
    private long[] mHistogramCounts;
    private int mHistogramType;
    private int mMaxAppBuffers;
    private int mMaxHalBuffers;
    private float mMaxPreviewFps;
    private int mMultiResMode;
    private long mRequestCount;
    private int mStartLatencyMs;
    private long mStreamUseCase;
    private long mUsage;
    private int mWidth;
    public CameraStreamStats() {}
    public CameraStreamStats(int p0, int p1, int p2, float p3, int p4, long p5, long p6, long p7, int p8, int p9, int p10, long p11, long p12, int p13, int p14, int p15) {}
    private CameraStreamStats(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public int getColorSpace() { return 0; }
    public int getCurrentSurfaceId() { return 0; }
    public int getDataSpace() { return 0; }
    public long getDynamicRangeProfile() { return 0L; }
    public long getErrorCount() { return 0L; }
    public int getFormat() { return 0; }
    public int getHeight() { return 0; }
    public float[] getHistogramBins() { return null; }
    public long[] getHistogramCounts() { return null; }
    public int getHistogramType() { return 0; }
    public int getMaxAppBuffers() { return 0; }
    public int getMaxHalBuffers() { return 0; }
    public float getMaxPreviewFps() { return 0.0f; }
    public int getMultiResMode() { return 0; }
    public long getRequestCount() { return 0L; }
    public int getStartLatencyMs() { return 0; }
    public long getStreamUseCase() { return 0L; }
    public long getUsage() { return 0L; }
    public int getWidth() { return 0; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
