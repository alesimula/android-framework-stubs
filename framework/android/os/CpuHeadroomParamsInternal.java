package android.os;

public class CpuHeadroomParamsInternal implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.CpuHeadroomParamsInternal> CREATOR = null;
    public byte calculationType;
    public int calculationWindowMillis;
    public int[] tids;
    public boolean usesDeviceHeadroom;
    public CpuHeadroomParamsInternal() {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
