package android.hardware.lights;

public final class ColorSequence implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.lights.ColorSequence> CREATOR = null;
    public static final int INTERPOLATION_MODE_LINEAR = 1;
    public static final int INTERPOLATION_MODE_NONE = 0;
    private final int[] mColors = null;
    private final long[] mDelaysMillis = null;
    private final int mInterpolationMode = 0;
    ColorSequence(int p0, long[] p1, int[] p2) {}
    private ColorSequence(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public int[] getColors() { return null; }
    public long[] getDelaysMillis() { return null; }
    public long getDurationMillis() { return 0L; }
    public int getInterpolationMode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.util.IntArray mColors;
        private android.util.LongArray mDelaysMillis;
        private int mInterpolationMode;
        public Builder() {}
        public android.hardware.lights.ColorSequence.Builder addControlPoint(long p0, int p1) { return null; }
        public android.hardware.lights.ColorSequence.Builder addControlPoints(android.hardware.lights.ColorSequence p0) { return null; }
        public android.hardware.lights.ColorSequence.Builder addControlPoints(long[] p0, int[] p1) { return null; }
        public android.hardware.lights.ColorSequence build() { return null; }
        public android.hardware.lights.ColorSequence.Builder setInterpolationMode(int p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface InterpolationMode {
    }
}
