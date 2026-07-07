package android.gui;

public class EarlyWakeupInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.gui.EarlyWakeupInfo> CREATOR = null;
    public boolean isStartRequest;
    public android.os.IBinder token;
    public java.lang.String trace;
    public EarlyWakeupInfo() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
