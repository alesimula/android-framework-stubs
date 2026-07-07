package android.hardware.radio.messaging;

public class GsmBroadcastSmsConfigInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.radio.messaging.GsmBroadcastSmsConfigInfo> CREATOR = null;
    public int fromCodeScheme;
    public int fromServiceId;
    public boolean selected;
    public int toCodeScheme;
    public int toServiceId;
    public GsmBroadcastSmsConfigInfo() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
