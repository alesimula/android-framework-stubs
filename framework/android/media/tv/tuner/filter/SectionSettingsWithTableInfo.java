package android.media.tv.tuner.filter;

@android.annotation.SystemApi
public class SectionSettingsWithTableInfo extends android.media.tv.tuner.filter.SectionSettings {
    public static final int INVALID_TABLE_INFO_VERSION = -1;
    private final int mTableId = 0;
    private final int mVersion = 0;
    private SectionSettingsWithTableInfo(int p0, boolean p1, boolean p2, boolean p3, int p4, int p5, int p6) { super(0, false, false, false, 0); }
    public static android.media.tv.tuner.filter.SectionSettingsWithTableInfo.Builder builder(int p0) { return null; }
    public int getTableId() { return 0; }
    public int getVersion() { return 0; }

    public static class Builder extends android.media.tv.tuner.filter.SectionSettings.Builder<android.media.tv.tuner.filter.SectionSettingsWithTableInfo.Builder> {
        private int mTableId;
        private int mVersion;
        private Builder(int p0) { super(0); }
        public android.media.tv.tuner.filter.SectionSettingsWithTableInfo build() { return null; }
        android.media.tv.tuner.filter.SectionSettingsWithTableInfo.Builder self() { return null; }
        public android.media.tv.tuner.filter.SectionSettingsWithTableInfo.Builder setTableId(int p0) { return null; }
        public android.media.tv.tuner.filter.SectionSettingsWithTableInfo.Builder setVersion(int p0) { return null; }
    }
}
