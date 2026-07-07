package android.media.tv.tuner.frontend;

@android.annotation.SystemApi
public class FrontendInfo {
    private final long mAcquireRange = 0L;
    private final int mExclusiveGroupId = 0;
    private final android.util.Range<java.lang.Long> mFrequencyRange = null;
    private final android.media.tv.tuner.frontend.FrontendCapabilities mFrontendCap = null;
    private final int mId = 0;
    private final int[] mStatusCaps = null;
    private final android.util.Range<java.lang.Integer> mSymbolRateRange = null;
    private final int mType = 0;
    private FrontendInfo(int p0, int p1, long p2, long p3, int p4, int p5, long p6, int p7, int[] p8, android.media.tv.tuner.frontend.FrontendCapabilities p9) {}
    public boolean equals(java.lang.Object p0) { return false; }
    @java.lang.Deprecated
    public int getAcquireRange() { return 0; }
    public long getAcquireRangeLong() { return 0L; }
    public int getExclusiveGroupId() { return 0; }
    @java.lang.Deprecated
    public android.util.Range<java.lang.Integer> getFrequencyRange() { return null; }
    public android.util.Range<java.lang.Long> getFrequencyRangeLong() { return null; }
    public android.media.tv.tuner.frontend.FrontendCapabilities getFrontendCapabilities() { return null; }
    public int getId() { return 0; }
    public int[] getStatusCapabilities() { return null; }
    public android.util.Range<java.lang.Integer> getSymbolRateRange() { return null; }
    public int getType() { return 0; }
    public int hashCode() { return 0; }
}
