package android.hardware.gnss.measurement_corrections;

public class MeasurementCorrections implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.gnss.measurement_corrections.MeasurementCorrections> CREATOR = null;
    public double altitudeMeters;
    public float environmentBearingDegrees;
    public float environmentBearingUncertaintyDegrees;
    public boolean hasEnvironmentBearing;
    public double horizontalPositionUncertaintyMeters;
    public double latitudeDegrees;
    public double longitudeDegrees;
    public android.hardware.gnss.measurement_corrections.SingleSatCorrection[] satCorrections;
    public long toaGpsNanosecondsOfWeek;
    public double verticalPositionUncertaintyMeters;
    public MeasurementCorrections() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
