package android.hardware.tv.tuner;

public final class DemuxTsFilterSettingsFilterSettings implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.DemuxTsFilterSettingsFilterSettings> CREATOR = null;
    public static final int av = 2;
    public static final int noinit = 0;
    public static final int pesData = 3;
    public static final int record = 4;
    public static final int section = 1;
    private int _tag;
    private java.lang.Object _value;
    public DemuxTsFilterSettingsFilterSettings() {}
    private DemuxTsFilterSettingsFilterSettings(int p0, java.lang.Object p1) {}
    private DemuxTsFilterSettingsFilterSettings(android.os.Parcel p0) {}
    private void _assertTag(int p0) {}
    private void _set(int p0, java.lang.Object p1) {}
    private java.lang.String _tagString(int p0) { return null; }
    public static android.hardware.tv.tuner.DemuxTsFilterSettingsFilterSettings av(android.hardware.tv.tuner.DemuxFilterAvSettings p0) { return null; }
    private int describeContents(java.lang.Object p0) { return 0; }
    public static android.hardware.tv.tuner.DemuxTsFilterSettingsFilterSettings noinit(boolean p0) { return null; }
    public static android.hardware.tv.tuner.DemuxTsFilterSettingsFilterSettings pesData(android.hardware.tv.tuner.DemuxFilterPesDataSettings p0) { return null; }
    public static android.hardware.tv.tuner.DemuxTsFilterSettingsFilterSettings record(android.hardware.tv.tuner.DemuxFilterRecordSettings p0) { return null; }
    public static android.hardware.tv.tuner.DemuxTsFilterSettingsFilterSettings section(android.hardware.tv.tuner.DemuxFilterSectionSettings p0) { return null; }
    public int describeContents() { return 0; }
    public android.hardware.tv.tuner.DemuxFilterAvSettings getAv() { return null; }
    public boolean getNoinit() { return false; }
    public android.hardware.tv.tuner.DemuxFilterPesDataSettings getPesData() { return null; }
    public android.hardware.tv.tuner.DemuxFilterRecordSettings getRecord() { return null; }
    public android.hardware.tv.tuner.DemuxFilterSectionSettings getSection() { return null; }
    public final int getStability() { return 0; }
    public int getTag() { return 0; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void setAv(android.hardware.tv.tuner.DemuxFilterAvSettings p0) {}
    public void setNoinit(boolean p0) {}
    public void setPesData(android.hardware.tv.tuner.DemuxFilterPesDataSettings p0) {}
    public void setRecord(android.hardware.tv.tuner.DemuxFilterRecordSettings p0) {}
    public void setSection(android.hardware.tv.tuner.DemuxFilterSectionSettings p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static @interface Tag {
        public static final int av = 2;
        public static final int noinit = 0;
        public static final int pesData = 3;
        public static final int record = 4;
        public static final int section = 1;
    }
}
