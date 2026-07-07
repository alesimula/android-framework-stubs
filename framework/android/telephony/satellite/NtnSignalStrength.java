package android.telephony.satellite;

public final class NtnSignalStrength implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.satellite.NtnSignalStrength> CREATOR = null;
    public static final int NTN_SIGNAL_STRENGTH_GOOD = 3;
    public static final int NTN_SIGNAL_STRENGTH_GREAT = 4;
    public static final int NTN_SIGNAL_STRENGTH_MODERATE = 2;
    public static final int NTN_SIGNAL_STRENGTH_NONE = 0;
    public static final int NTN_SIGNAL_STRENGTH_POOR = 1;
    private int mLevel;
    public NtnSignalStrength(int p0) {}
    private NtnSignalStrength(android.os.Parcel p0) {}
    public NtnSignalStrength(android.telephony.satellite.NtnSignalStrength p0) {}
    private void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getLevel() { return 0; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface NtnSignalStrengthLevel {
    }
}
