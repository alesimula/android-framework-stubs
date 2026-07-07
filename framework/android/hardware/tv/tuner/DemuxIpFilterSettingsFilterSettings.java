package android.hardware.tv.tuner;

public final class DemuxIpFilterSettingsFilterSettings implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.DemuxIpFilterSettingsFilterSettings> CREATOR = null;
    public static final int bPassthrough = 2;
    public static final int noinit = 0;
    public static final int section = 1;
    private int _tag;
    private java.lang.Object _value;
    public DemuxIpFilterSettingsFilterSettings() {}
    private DemuxIpFilterSettingsFilterSettings(int p0, java.lang.Object p1) {}
    private DemuxIpFilterSettingsFilterSettings(android.os.Parcel p0) {}
    private void _assertTag(int p0) {}
    private void _set(int p0, java.lang.Object p1) {}
    private java.lang.String _tagString(int p0) { return null; }
    public static android.hardware.tv.tuner.DemuxIpFilterSettingsFilterSettings bPassthrough(boolean p0) { return null; }
    private int describeContents(java.lang.Object p0) { return 0; }
    public static android.hardware.tv.tuner.DemuxIpFilterSettingsFilterSettings noinit(boolean p0) { return null; }
    public static android.hardware.tv.tuner.DemuxIpFilterSettingsFilterSettings section(android.hardware.tv.tuner.DemuxFilterSectionSettings p0) { return null; }
    public int describeContents() { return 0; }
    public boolean getBPassthrough() { return false; }
    public boolean getNoinit() { return false; }
    public android.hardware.tv.tuner.DemuxFilterSectionSettings getSection() { return null; }
    public final int getStability() { return 0; }
    public int getTag() { return 0; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void setBPassthrough(boolean p0) {}
    public void setNoinit(boolean p0) {}
    public void setSection(android.hardware.tv.tuner.DemuxFilterSectionSettings p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static @interface Tag {
        public static final int bPassthrough = 2;
        public static final int noinit = 0;
        public static final int section = 1;
    }
}
