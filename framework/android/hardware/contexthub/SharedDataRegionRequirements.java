package android.hardware.contexthub;

public class SharedDataRegionRequirements implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.contexthub.SharedDataRegionRequirements> CREATOR = null;
    public java.lang.String[] permissions;
    public long sizeBytes;
    public long[] targetHubIds;
    public SharedDataRegionRequirements() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
