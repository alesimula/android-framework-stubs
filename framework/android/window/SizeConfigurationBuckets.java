package android.window;

public final class SizeConfigurationBuckets implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.window.SizeConfigurationBuckets> CREATOR = null;
    private final int[] mHorizontal = null;
    private final boolean mScreenLayoutLongSet = false;
    private final int[] mScreenLayoutSize = null;
    private final int[] mSmallest = null;
    private final int[] mVertical = null;
    SizeConfigurationBuckets(android.os.Parcel p0) {}
    public SizeConfigurationBuckets(int[] p0, int[] p1, int[] p2, int[] p3, boolean p4) {}
    public SizeConfigurationBuckets(android.content.res.Configuration[] p0) {}
    @java.lang.Deprecated
    private void __metadata() {}
    public static boolean areNonSizeLayoutFieldsUnchanged(int p0, int p1) { return false; }
    private boolean crossesHorizontalSizeThreshold(int p0, int p1) { return false; }
    private boolean crossesScreenLayoutLongThreshold(int p0, int p1) { return false; }
    public static boolean crossesSizeThreshold(int[] p0, int p1, int p2) { return false; }
    private boolean crossesSmallestSizeThreshold(int p0, int p1) { return false; }
    private boolean crossesVerticalSizeThreshold(int p0, int p1) { return false; }
    public static int filterDiff(int p0, android.content.res.Configuration p1, android.content.res.Configuration p2, android.window.SizeConfigurationBuckets p3) { return 0; }
    public boolean crossesScreenLayoutSizeThreshold(android.content.res.Configuration p0, android.content.res.Configuration p1) { return false; }
    public int describeContents() { return 0; }
    public int[] getHorizontal() { return null; }
    public int[] getScreenLayoutSize() { return null; }
    public int[] getSmallest() { return null; }
    public int[] getVertical() { return null; }
    public boolean isScreenLayoutLongSet() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
