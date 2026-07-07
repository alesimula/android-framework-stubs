package android.hardware.radio.network;

public class Cdma2000RegistrationInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.radio.network.Cdma2000RegistrationInfo> CREATOR = null;
    @java.lang.Deprecated
    public static final int PRL_INDICATOR_IN_PRL = 1;
    @java.lang.Deprecated
    public static final int PRL_INDICATOR_NOT_IN_PRL = 0;
    @java.lang.Deprecated
    public static final int PRL_INDICATOR_NOT_REGISTERED = -1;
    @java.lang.Deprecated
    public boolean cssSupported;
    @java.lang.Deprecated
    public int defaultRoamingIndicator;
    @java.lang.Deprecated
    public int roamingIndicator;
    @java.lang.Deprecated
    public int systemIsInPrl;
    public Cdma2000RegistrationInfo() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
