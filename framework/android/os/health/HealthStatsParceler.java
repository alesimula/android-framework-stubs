package android.os.health;

public class HealthStatsParceler implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.health.HealthStatsParceler> CREATOR = null;
    private android.os.health.HealthStats mHealthStats;
    private android.os.health.HealthStatsWriter mWriter;
    public HealthStatsParceler(android.os.Parcel p0) {}
    public HealthStatsParceler(android.os.health.HealthStatsWriter p0) {}
    public int describeContents() { return 0; }
    public android.os.health.HealthStats getHealthStats() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
