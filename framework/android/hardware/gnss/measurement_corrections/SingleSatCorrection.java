package android.hardware.gnss.measurement_corrections;

public class SingleSatCorrection implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.gnss.measurement_corrections.SingleSatCorrection> CREATOR = null;
    public static final int SINGLE_SAT_CORRECTION_HAS_COMBINED_ATTENUATION = 16;
    public static final int SINGLE_SAT_CORRECTION_HAS_COMBINED_EXCESS_PATH_LENGTH = 2;
    public static final int SINGLE_SAT_CORRECTION_HAS_COMBINED_EXCESS_PATH_LENGTH_UNC = 4;
    public static final int SINGLE_SAT_CORRECTION_HAS_SAT_IS_LOS_PROBABILITY = 1;
    public long carrierFrequencyHz;
    public float combinedAttenuationDb;
    public float combinedExcessPathLengthMeters;
    public float combinedExcessPathLengthUncertaintyMeters;
    public int constellation;
    public android.hardware.gnss.measurement_corrections.SingleSatCorrection.ExcessPathInfo[] excessPathInfos;
    public float probSatIsLos;
    public int singleSatCorrectionFlags;
    public int svid;
    public SingleSatCorrection() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class ExcessPathInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.gnss.measurement_corrections.SingleSatCorrection.ExcessPathInfo> CREATOR = null;
        public static final int EXCESS_PATH_INFO_HAS_ATTENUATION = 8;
        public static final int EXCESS_PATH_INFO_HAS_EXCESS_PATH_LENGTH = 1;
        public static final int EXCESS_PATH_INFO_HAS_EXCESS_PATH_LENGTH_UNC = 2;
        public static final int EXCESS_PATH_INFO_HAS_REFLECTING_PLANE = 4;
        public float attenuationDb;
        public int excessPathInfoFlags;
        public float excessPathLengthMeters;
        public float excessPathLengthUncertaintyMeters;
        public android.hardware.gnss.measurement_corrections.ReflectingPlane reflectingPlane;
        public ExcessPathInfo() {}
        private int describeContents(java.lang.Object p0) { return 0; }
        public int describeContents() { return 0; }
        public final int getStability() { return 0; }
        public final void readFromParcel(android.os.Parcel p0) {}
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
