package android.hardware.tv.tuner;

public final class DemuxFilterSectionSettingsCondition implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.DemuxFilterSectionSettingsCondition> CREATOR = null;
    public static final int sectionBits = 0;
    public static final int tableInfo = 1;
    private int _tag;
    private java.lang.Object _value;
    public DemuxFilterSectionSettingsCondition() {}
    private DemuxFilterSectionSettingsCondition(int p0, java.lang.Object p1) {}
    private DemuxFilterSectionSettingsCondition(android.os.Parcel p0) {}
    private void _assertTag(int p0) {}
    private void _set(int p0, java.lang.Object p1) {}
    private java.lang.String _tagString(int p0) { return null; }
    private int describeContents(java.lang.Object p0) { return 0; }
    public static android.hardware.tv.tuner.DemuxFilterSectionSettingsCondition sectionBits(android.hardware.tv.tuner.DemuxFilterSectionBits p0) { return null; }
    public static android.hardware.tv.tuner.DemuxFilterSectionSettingsCondition tableInfo(android.hardware.tv.tuner.DemuxFilterSectionSettingsConditionTableInfo p0) { return null; }
    public int describeContents() { return 0; }
    public android.hardware.tv.tuner.DemuxFilterSectionBits getSectionBits() { return null; }
    public final int getStability() { return 0; }
    public android.hardware.tv.tuner.DemuxFilterSectionSettingsConditionTableInfo getTableInfo() { return null; }
    public int getTag() { return 0; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void setSectionBits(android.hardware.tv.tuner.DemuxFilterSectionBits p0) {}
    public void setTableInfo(android.hardware.tv.tuner.DemuxFilterSectionSettingsConditionTableInfo p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static @interface Tag {
        public static final int sectionBits = 0;
        public static final int tableInfo = 1;
    }
}
