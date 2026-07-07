package android.hardware.lights;

public final class MultiLightEffect implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.lights.MultiLightEffect> CREATOR = null;
    private final android.hardware.lights.ColorSequence[] mColorSequences = null;
    private final int mIterations = 0;
    private final int[] mLightIds = null;
    private final boolean mPreemptive = false;
    private MultiLightEffect(int p0, boolean p1, int[] p2, android.hardware.lights.ColorSequence[] p3) {}
    private MultiLightEffect(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public android.hardware.lights.ColorSequence[] getColorSequences() { return null; }
    public long getIterationDurationMillis() { return 0L; }
    public int getIterations() { return 0; }
    public int[] getLights() { return null; }
    public java.util.Map<java.lang.Integer, android.hardware.lights.ColorSequence> getSequences() { return null; }
    public long getTotalDurationMillis() { return 0L; }
    public boolean isPreemptive() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private java.util.ArrayList<android.hardware.lights.ColorSequence> mColorSequences;
        private int mIterations;
        private android.util.IntArray mLightIds;
        private boolean mPreemptive;
        public Builder() {}
        public android.hardware.lights.MultiLightEffect.Builder addLightSequence(android.hardware.lights.Light p0, android.hardware.lights.ColorSequence p1) { return null; }
        public android.hardware.lights.MultiLightEffect build() { return null; }
        public android.hardware.lights.MultiLightEffect.Builder setIterations(int p0) { return null; }
        public android.hardware.lights.MultiLightEffect.Builder setPreemptive(boolean p0) { return null; }
    }
}
