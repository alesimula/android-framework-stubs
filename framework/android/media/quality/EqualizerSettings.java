package android.media.quality;

public final class EqualizerSettings implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.quality.EqualizerSettings> CREATOR = null;
    private final java.util.List<android.media.quality.EqualizerBand> mBands = null;
    private EqualizerSettings(android.os.Parcel p0) {}
    private EqualizerSettings(java.util.List<android.media.quality.EqualizerBand> p0) {}
    public int describeContents() { return 0; }
    public java.util.List<android.media.quality.EqualizerBand> getBands() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private java.util.List<android.media.quality.EqualizerBand> mBands;
        public Builder() {}
        public android.media.quality.EqualizerSettings.Builder addBands(java.util.List<android.media.quality.EqualizerBand> p0) { return null; }
        public android.media.quality.EqualizerSettings build() { return null; }
    }
}
