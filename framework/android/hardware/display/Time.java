package android.hardware.display;

public final class Time implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.display.Time> CREATOR = null;
    private final int mHour = 0;
    private final int mMinute = 0;
    private final int mNano = 0;
    private final int mSecond = 0;
    public Time(android.os.Parcel p0) {}
    public Time(java.time.LocalTime p0) {}
    public int describeContents() { return 0; }
    public java.time.LocalTime getLocalTime() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
