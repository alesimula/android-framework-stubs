package android.hardware.gnss;

public class GnssPowerStats implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.gnss.GnssPowerStats> CREATOR = null;
    public android.hardware.gnss.ElapsedRealtime elapsedRealtime;
    public double multibandAcquisitionModeEnergyMilliJoule;
    public double multibandTrackingModeEnergyMilliJoule;
    public double[] otherModesEnergyMilliJoule;
    public double singlebandAcquisitionModeEnergyMilliJoule;
    public double singlebandTrackingModeEnergyMilliJoule;
    public double totalEnergyMilliJoule;
    public GnssPowerStats() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
