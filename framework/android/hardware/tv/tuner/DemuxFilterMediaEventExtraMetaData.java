package android.hardware.tv.tuner;

public final class DemuxFilterMediaEventExtraMetaData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.DemuxFilterMediaEventExtraMetaData> CREATOR = null;
    public static final int audio = 1;
    public static final int audioPresentations = 2;
    public static final int noinit = 0;
    private int _tag;
    private java.lang.Object _value;
    public DemuxFilterMediaEventExtraMetaData() {}
    private DemuxFilterMediaEventExtraMetaData(int p0, java.lang.Object p1) {}
    private DemuxFilterMediaEventExtraMetaData(android.os.Parcel p0) {}
    private void _assertTag(int p0) {}
    private void _set(int p0, java.lang.Object p1) {}
    private java.lang.String _tagString(int p0) { return null; }
    public static android.hardware.tv.tuner.DemuxFilterMediaEventExtraMetaData audio(android.hardware.tv.tuner.AudioExtraMetaData p0) { return null; }
    public static android.hardware.tv.tuner.DemuxFilterMediaEventExtraMetaData audioPresentations(android.hardware.tv.tuner.AudioPresentation[] p0) { return null; }
    private int describeContents(java.lang.Object p0) { return 0; }
    public static android.hardware.tv.tuner.DemuxFilterMediaEventExtraMetaData noinit(boolean p0) { return null; }
    public int describeContents() { return 0; }
    public android.hardware.tv.tuner.AudioExtraMetaData getAudio() { return null; }
    public android.hardware.tv.tuner.AudioPresentation[] getAudioPresentations() { return null; }
    public boolean getNoinit() { return false; }
    public final int getStability() { return 0; }
    public int getTag() { return 0; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void setAudio(android.hardware.tv.tuner.AudioExtraMetaData p0) {}
    public void setAudioPresentations(android.hardware.tv.tuner.AudioPresentation[] p0) {}
    public void setNoinit(boolean p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static @interface Tag {
        public static final int audio = 1;
        public static final int audioPresentations = 2;
        public static final int noinit = 0;
    }
}
