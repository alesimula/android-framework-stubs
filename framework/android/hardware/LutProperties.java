package android.hardware;

public final class LutProperties {
    public static final int ONE_DIMENSION = 1;
    public static final int SAMPLING_KEY_CIE_Y = 2;
    public static final int SAMPLING_KEY_MAX_RGB = 1;
    public static final int SAMPLING_KEY_RGB = 0;
    public static final int THREE_DIMENSION = 3;
    private final int mDimension = 0;
    private final int[] mSamplingKeys = null;
    private final int mSize = 0;
    private LutProperties(int p0, int p1, int[] p2) {}
    private java.lang.String samplingKeyToString(int p0) { return null; }
    private java.lang.String samplingKeysToString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getDimension() { return 0; }
    public int[] getSamplingKeys() { return null; }
    public int getSize() { return 0; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Dimension {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SamplingKey {
    }
}
