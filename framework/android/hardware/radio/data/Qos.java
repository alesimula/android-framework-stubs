package android.hardware.radio.data;

public final class Qos implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.radio.data.Qos> CREATOR = null;
    public static final int eps = 1;
    public static final int noinit = 0;
    public static final int nr = 2;
    private int _tag;
    private java.lang.Object _value;
    public Qos() {}
    private Qos(int p0, java.lang.Object p1) {}
    private Qos(android.os.Parcel p0) {}
    private void _assertTag(int p0) {}
    private void _set(int p0, java.lang.Object p1) {}
    private java.lang.String _tagString(int p0) { return null; }
    private int describeContents(java.lang.Object p0) { return 0; }
    public static android.hardware.radio.data.Qos eps(android.hardware.radio.data.EpsQos p0) { return null; }
    public static android.hardware.radio.data.Qos noinit(boolean p0) { return null; }
    public static android.hardware.radio.data.Qos nr(android.hardware.radio.data.NrQos p0) { return null; }
    public int describeContents() { return 0; }
    public android.hardware.radio.data.EpsQos getEps() { return null; }
    public boolean getNoinit() { return false; }
    public android.hardware.radio.data.NrQos getNr() { return null; }
    public final int getStability() { return 0; }
    public int getTag() { return 0; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void setEps(android.hardware.radio.data.EpsQos p0) {}
    public void setNoinit(boolean p0) {}
    public void setNr(android.hardware.radio.data.NrQos p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static @interface Tag {
        public static final int eps = 1;
        public static final int noinit = 0;
        public static final int nr = 2;
    }
}
