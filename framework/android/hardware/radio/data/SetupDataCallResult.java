package android.hardware.radio.data;

public class SetupDataCallResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.radio.data.SetupDataCallResult> CREATOR = null;
    public static final int DATA_CONNECTION_STATUS_ACTIVE = 2;
    public static final int DATA_CONNECTION_STATUS_DORMANT = 1;
    public static final int DATA_CONNECTION_STATUS_INACTIVE = 0;
    public static final byte HANDOVER_FAILURE_MODE_DO_FALLBACK = 1;
    public static final byte HANDOVER_FAILURE_MODE_LEGACY = 0;
    public static final byte HANDOVER_FAILURE_MODE_NO_FALLBACK_RETRY_HANDOVER = 2;
    public static final byte HANDOVER_FAILURE_MODE_NO_FALLBACK_RETRY_SETUP_NORMAL = 3;
    public int active;
    public android.hardware.radio.data.LinkAddress[] addresses;
    public int cause;
    public int cid;
    public android.hardware.radio.data.Qos defaultQos;
    public java.lang.String[] dnses;
    public java.lang.String[] gateways;
    public byte handoverFailureMode;
    public java.lang.String ifname;
    public int mtuV4;
    public int mtuV6;
    public java.lang.String[] pcscf;
    public int pduSessionId;
    public android.hardware.radio.data.QosSession[] qosSessions;
    public android.hardware.radio.data.SliceInfo sliceInfo;
    public long suggestedRetryTime;
    public android.hardware.radio.data.TrafficDescriptor[] trafficDescriptors;
    public int type;
    public SetupDataCallResult() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
