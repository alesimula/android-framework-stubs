package android.media.quality;

public final class AmbientBacklightSettings implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.quality.AmbientBacklightSettings> CREATOR = null;
    public static final int SOURCE_AUDIO = 1;
    public static final int SOURCE_AUDIO_VIDEO = 3;
    public static final int SOURCE_NONE = 0;
    public static final int SOURCE_VIDEO = 2;
    private final int mColorFormat = 0;
    private final int mHorizontalZonesNumber = 0;
    private final boolean mIsLetterboxOmitted = false;
    private final int mMaxFps = 0;
    private final int mSource = 0;
    private final int mThreshold = 0;
    private final int mVerticalZonesNumber = 0;
    public AmbientBacklightSettings(int p0, int p1, int p2, int p3, int p4, boolean p5, int p6) {}
    private AmbientBacklightSettings(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public int getColorFormat() { return 0; }
    public int getHorizontalZonesCount() { return 0; }
    public int getMaxFps() { return 0; }
    public int getSource() { return 0; }
    public int getThreshold() { return 0; }
    public int getVerticalZonesCount() { return 0; }
    public boolean isLetterboxOmitted() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Source {
    }
}
