package android.content.pm;

public final class MemoryBudgetInfo implements android.os.Parcelable {
    private static final long BYTES_PER_MB = 1048576L;
    public static final android.os.Parcelable.Creator<android.content.pm.MemoryBudgetInfo> CREATOR = null;
    public static final int FEATURE_AUTOMOTIVE = 1;
    public static final int FEATURE_LEANBACK = 2;
    private static final int FEATURE_MAX = 3;
    public static final int FEATURE_UNSPECIFIED = 0;
    public static final int FEATURE_WATCH = 3;
    public static final long MAX_ADDITIONAL_BYTES_PER_DISPLAY_PIXEL = 4096L;
    public static final long MAX_ADDITIONAL_MB_PER_DENSITY = 4096L;
    public static final int MAX_BUDGETS = 100;
    public static final long MAX_MAXMB = 1048576L;
    public static final int STATE_BACKGROUND = 300;
    public static final int STATE_FOREGROUND = 100;
    public static final int STATE_PERCEPTIBLE = 200;
    private final long mAdditionalBytesPerDisplayPixel = 0L;
    private final long mAdditionalMbPerDensity = 0L;
    private final int mFeature = 0;
    private final long mMaxMb = 0L;
    private final int mState = 0;
    public MemoryBudgetInfo(long p0, int p1) {}
    public MemoryBudgetInfo(long p0, int p1, int p2, long p3, long p4) {}
    public MemoryBudgetInfo(long p0, int p1, long p2, long p3) {}
    public MemoryBudgetInfo(android.content.pm.MemoryBudgetInfo p0) {}
    private MemoryBudgetInfo(android.os.Parcel p0) {}
    public static void addBudget(java.util.List<android.content.pm.MemoryBudgetInfo> p0, android.content.pm.MemoryBudgetInfo p1) {}
    public static java.lang.String featureString(int p0) { return null; }
    public static java.lang.String stateString(int p0) { return null; }
    public static boolean supportedFeature(int p0) { return false; }
    private void validate() {}
    public long calculateBudgetInBytes(android.view.WindowMetrics p0) { return 0L; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public long getAdditionalBytesPerDisplayPixel() { return 0L; }
    public long getAdditionalMbPerDensity() { return 0L; }
    public int getFeature() { return 0; }
    public long getMaxMb() { return 0L; }
    public int getState() { return 0; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Feature {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface State {
    }
}
