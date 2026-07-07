package android.media.quality;

public final class EqualizerCapabilities implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.quality.EqualizerCapabilities> CREATOR = null;
    private final boolean mHasAdjustableQ = false;
    private final int mMaxLevelDb = 0;
    private final int mMinLevelDb = 0;
    private final java.util.List<java.lang.Integer> mSupportedFrequenciesHz = null;
    public EqualizerCapabilities(int p0, int p1, java.util.List<java.lang.Integer> p2, boolean p3) {}
    private EqualizerCapabilities(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public int getMaxLevelDb() { return 0; }
    public int getMinLevelDb() { return 0; }
    public java.util.List<java.lang.Integer> getSupportedFrequenciesHz() { return null; }
    public boolean hasAdjustableQ() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
