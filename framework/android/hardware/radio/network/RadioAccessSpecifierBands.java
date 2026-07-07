package android.hardware.radio.network;

public final class RadioAccessSpecifierBands implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.radio.network.RadioAccessSpecifierBands> CREATOR = null;
    public static final int eutranBands = 3;
    public static final int geranBands = 1;
    public static final int ngranBands = 4;
    public static final int noinit = 0;
    public static final int utranBands = 2;
    private int _tag;
    private java.lang.Object _value;
    public RadioAccessSpecifierBands() {}
    private RadioAccessSpecifierBands(int p0, java.lang.Object p1) {}
    private RadioAccessSpecifierBands(android.os.Parcel p0) {}
    private void _assertTag(int p0) {}
    private void _set(int p0, java.lang.Object p1) {}
    private java.lang.String _tagString(int p0) { return null; }
    public static android.hardware.radio.network.RadioAccessSpecifierBands eutranBands(int[] p0) { return null; }
    public static android.hardware.radio.network.RadioAccessSpecifierBands geranBands(int[] p0) { return null; }
    public static android.hardware.radio.network.RadioAccessSpecifierBands ngranBands(int[] p0) { return null; }
    public static android.hardware.radio.network.RadioAccessSpecifierBands noinit(boolean p0) { return null; }
    public static android.hardware.radio.network.RadioAccessSpecifierBands utranBands(int[] p0) { return null; }
    public int describeContents() { return 0; }
    public int[] getEutranBands() { return null; }
    public int[] getGeranBands() { return null; }
    public int[] getNgranBands() { return null; }
    public boolean getNoinit() { return false; }
    public final int getStability() { return 0; }
    public int getTag() { return 0; }
    public int[] getUtranBands() { return null; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void setEutranBands(int[] p0) {}
    public void setGeranBands(int[] p0) {}
    public void setNgranBands(int[] p0) {}
    public void setNoinit(boolean p0) {}
    public void setUtranBands(int[] p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static @interface Tag {
        public static final int eutranBands = 3;
        public static final int geranBands = 1;
        public static final int ngranBands = 4;
        public static final int noinit = 0;
        public static final int utranBands = 2;
    }
}
