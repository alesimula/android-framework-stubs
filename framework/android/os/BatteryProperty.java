package android.os;

public class BatteryProperty implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.BatteryProperty> CREATOR = null;
    private boolean mValueBoolean;
    private long mValueLong;
    private java.lang.String mValueString;
    public BatteryProperty() {}
    private BatteryProperty(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean getBoolean() { return false; }
    public long getLong() { return 0L; }
    public java.lang.String getString() { return null; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void setBoolean(boolean p0) {}
    public void setLong(long p0) {}
    public void setString(java.lang.String p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
