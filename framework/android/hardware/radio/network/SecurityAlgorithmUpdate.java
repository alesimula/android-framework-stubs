package android.hardware.radio.network;

public class SecurityAlgorithmUpdate implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.radio.network.SecurityAlgorithmUpdate> CREATOR = null;
    public int connectionEvent;
    public int encryption;
    public int integrity;
    public boolean isUnprotectedEmergency;
    public SecurityAlgorithmUpdate() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
