package android.hardware.power;

public class SupportInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.power.SupportInfo> CREATOR = null;
    public long boosts;
    public android.hardware.power.SupportInfo.CompositionDataSupportInfo compositionData;
    public android.hardware.power.SupportInfo.HeadroomSupportInfo headroom;
    public long modes;
    public long sessionHints;
    public long sessionModes;
    public long sessionTags;
    public boolean usesSessions;
    public SupportInfo() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class CompositionDataSupportInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.power.SupportInfo.CompositionDataSupportInfo> CREATOR = null;
        public boolean alwaysBatch;
        public boolean disableGpuFences;
        public boolean isSupported;
        public int maxBatchSize;
        public CompositionDataSupportInfo() {}
        public int describeContents() { return 0; }
        public final int getStability() { return 0; }
        public final void readFromParcel(android.os.Parcel p0) {}
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static class HeadroomSupportInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.power.SupportInfo.HeadroomSupportInfo> CREATOR = null;
        public int cpuMaxCalculationWindowMillis;
        public int cpuMaxTidCount;
        public int cpuMinCalculationWindowMillis;
        public int cpuMinIntervalMillis;
        public int gpuMaxCalculationWindowMillis;
        public int gpuMinCalculationWindowMillis;
        public int gpuMinIntervalMillis;
        public boolean isCpuSupported;
        public boolean isGpuSupported;
        public HeadroomSupportInfo() {}
        public int describeContents() { return 0; }
        public final int getStability() { return 0; }
        public final void readFromParcel(android.os.Parcel p0) {}
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
