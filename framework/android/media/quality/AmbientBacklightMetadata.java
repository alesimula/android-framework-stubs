package android.media.quality;

public final class AmbientBacklightMetadata implements android.os.Parcelable {
    public static final int ALGORITHM_NONE = 0;
    public static final int ALGORITHM_RLE = 1;
    public static final android.os.Parcelable.Creator<android.media.quality.AmbientBacklightMetadata> CREATOR = null;
    private final int mColorFormat = 0;
    private final int mCompressAlgorithm = 0;
    private final int mHorizontalZonesNumber = 0;
    private final java.lang.String mPackageName = null;
    private final int mSource = 0;
    private final int mVerticalZonesNumber = 0;
    private final int[] mZonesColors = null;
    private AmbientBacklightMetadata(android.os.Parcel p0) {}
    public AmbientBacklightMetadata(java.lang.String p0, int p1, int p2, int p3, int p4, int p5, int[] p6) {}
    public int describeContents() { return 0; }
    public int getColorFormat() { return 0; }
    public int getCompressionAlgorithm() { return 0; }
    public int getHorizontalZonesCount() { return 0; }
    public java.lang.String getPackageName() { return null; }
    public int getSource() { return 0; }
    public int getVerticalZonesCount() { return 0; }
    public int[] getZoneColors() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CompressionAlgorithm {
    }
}
