package android.telephony.ims;

@android.annotation.SystemApi
public final class SrvccCall implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.ims.SrvccCall> CREATOR = null;
    private static final java.lang.String TAG = "SrvccCall";
    private java.lang.String mCallId;
    private int mCallState;
    private android.telephony.ims.ImsCallProfile mImsCallProfile;
    private SrvccCall(android.os.Parcel p0) {}
    public SrvccCall(java.lang.String p0, int p1, android.telephony.ims.ImsCallProfile p2) {}
    private void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String getCallId() { return null; }
    public android.telephony.ims.ImsCallProfile getImsCallProfile() { return null; }
    public int getPreciseCallState() { return 0; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
