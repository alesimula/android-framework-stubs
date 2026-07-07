package android.hardware.power;

public final class GpuHeadroomResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.power.GpuHeadroomResult> CREATOR = null;
    public static final int globalHeadroom = 0;
    private int _tag;
    private java.lang.Object _value;
    public GpuHeadroomResult() {}
    private GpuHeadroomResult(int p0, java.lang.Object p1) {}
    private GpuHeadroomResult(android.os.Parcel p0) {}
    private void _assertTag(int p0) {}
    private void _set(int p0, java.lang.Object p1) {}
    private java.lang.String _tagString(int p0) { return null; }
    public static android.hardware.power.GpuHeadroomResult globalHeadroom(float p0) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public float getGlobalHeadroom() { return 0.0f; }
    public final int getStability() { return 0; }
    public int getTag() { return 0; }
    public int hashCode() { return 0; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void setGlobalHeadroom(float p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static @interface Tag {
        public static final int globalHeadroom = 0;
    }
}
