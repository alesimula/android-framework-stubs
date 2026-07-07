package android.content.pm;

public final class MemoryBudget implements android.os.Parcelable {
    private static final long BYTES_PER_MB = 1048576L;
    public static final android.os.Parcelable.Creator<android.content.pm.MemoryBudget> CREATOR = null;
    public static final long MAX_ADDITIONAL_BYTES_PER_DISPLAY_PIXEL = 4096L;
    public static final long MAX_ADDITIONAL_MB_PER_DENSITY = 4096L;
    public static final int MAX_BUDGETS = 100;
    public static final int MAX_FEATURE_LENGTH = 256;
    public static final long MAX_MAXMB = 1048576L;
    public static final int STATE_BACKGROUND = 3;
    public static final int STATE_FOREGROUND = 1;
    public static final int STATE_PERCEPTIBLE = 2;
    private final long mAdditionalBytesPerDisplayPixel = 0L;
    private final long mAdditionalMbPerDensity = 0L;
    private final java.lang.String mFeature = null;
    private final long mMaxMb = 0L;
    private final int mState = 0;
    public MemoryBudget(long p0, int p1) {}
    public MemoryBudget(long p0, int p1, long p2, long p3) {}
    public MemoryBudget(long p0, int p1, long p2, long p3, java.lang.String p4) {}
    public MemoryBudget(android.content.pm.MemoryBudget p0) {}
    private MemoryBudget(android.os.Parcel p0) {}
    public static void addBudget(java.util.List<android.content.pm.MemoryBudget> p0, android.content.pm.MemoryBudget p1) {}
    public static java.lang.String stateString(int p0) { return null; }
    private static boolean validState(int p0) { return false; }
    private void validate() {}
    public long calculateBudgetInBytes(android.view.WindowMetrics p0) { return 0L; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public long getAdditionalBytesPerDisplayPixel() { return 0L; }
    public long getAdditionalMbPerDensity() { return 0L; }
    public java.lang.String getFeature() { return null; }
    public long getMaxMb() { return 0L; }
    public int getState() { return 0; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface State {
    }
}
