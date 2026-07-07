package android.hardware.power;

public class CpuHeadroomParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.power.CpuHeadroomParams> CREATOR = null;
    public byte calculationType;
    public int calculationWindowMillis;
    public int[] tids;
    public CpuHeadroomParams() {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public final int getStability() { return 0; }
    public int hashCode() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static @interface CalculationType {
        public static final byte AVERAGE = 1;
        public static final byte MIN = 0;
    }
}
