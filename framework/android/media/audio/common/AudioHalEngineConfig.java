package android.media.audio.common;

public class AudioHalEngineConfig implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.audio.common.AudioHalEngineConfig> CREATOR = null;
    public android.media.audio.common.AudioHalEngineConfig.CapSpecificConfig capSpecificConfig;
    public int defaultProductStrategyId;
    public android.media.audio.common.AudioHalProductStrategy[] productStrategies;
    public android.media.audio.common.AudioHalVolumeGroup[] volumeGroups;
    public AudioHalEngineConfig() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public final int getStability() { return 0; }
    public int hashCode() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class CapSpecificConfig implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.media.audio.common.AudioHalEngineConfig.CapSpecificConfig> CREATOR = null;
        public android.media.audio.common.AudioHalCapCriterion[] criteria;
        public android.media.audio.common.AudioHalCapCriterionV2[] criteriaV2;
        public android.media.audio.common.AudioHalCapCriterionType[] criterionTypes;
        public android.media.audio.common.AudioHalCapDomain[] domains;
        public CapSpecificConfig() {}
        private int describeContents(java.lang.Object p0) { return 0; }
        public int describeContents() { return 0; }
        public final int getStability() { return 0; }
        public final void readFromParcel(android.os.Parcel p0) {}
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
