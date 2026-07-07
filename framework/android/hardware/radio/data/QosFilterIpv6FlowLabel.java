package android.hardware.radio.data;

public final class QosFilterIpv6FlowLabel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.radio.data.QosFilterIpv6FlowLabel> CREATOR = null;
    public static final int noinit = 0;
    public static final int value = 1;
    private int _tag;
    private java.lang.Object _value;
    public QosFilterIpv6FlowLabel() {}
    private QosFilterIpv6FlowLabel(int p0, java.lang.Object p1) {}
    private QosFilterIpv6FlowLabel(android.os.Parcel p0) {}
    private void _assertTag(int p0) {}
    private void _set(int p0, java.lang.Object p1) {}
    private java.lang.String _tagString(int p0) { return null; }
    public static android.hardware.radio.data.QosFilterIpv6FlowLabel noinit(boolean p0) { return null; }
    public static android.hardware.radio.data.QosFilterIpv6FlowLabel value(int p0) { return null; }
    public int describeContents() { return 0; }
    public boolean getNoinit() { return false; }
    public final int getStability() { return 0; }
    public int getTag() { return 0; }
    public int getValue() { return 0; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void setNoinit(boolean p0) {}
    public void setValue(int p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static @interface Tag {
        public static final int noinit = 0;
        public static final int value = 1;
    }
}
