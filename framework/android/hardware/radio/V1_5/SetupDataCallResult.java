package android.hardware.radio.V1_5;

public final class SetupDataCallResult {
    public int active;
    public java.util.ArrayList<android.hardware.radio.V1_5.LinkAddress> addresses;
    public int cause;
    public int cid;
    public java.util.ArrayList<java.lang.String> dnses;
    public java.util.ArrayList<java.lang.String> gateways;
    public java.lang.String ifname;
    public int mtuV4;
    public int mtuV6;
    public java.util.ArrayList<java.lang.String> pcscf;
    public int suggestedRetryTime;
    public int type;
    public SetupDataCallResult() {}
    public static final java.util.ArrayList<android.hardware.radio.V1_5.SetupDataCallResult> readVectorFromParcel(android.os.HwParcel p0) { return null; }
    public static final void writeVectorToParcel(android.os.HwParcel p0, java.util.ArrayList<android.hardware.radio.V1_5.SetupDataCallResult> p1) {}
    public final boolean equals(java.lang.Object p0) { return false; }
    public final int hashCode() { return 0; }
    public final void readEmbeddedFromParcel(android.os.HwParcel p0, android.os.HwBlob p1, long p2) {}
    public final void readFromParcel(android.os.HwParcel p0) {}
    public final java.lang.String toString() { return null; }
    public final void writeEmbeddedToBlob(android.os.HwBlob p0, long p1) {}
    public final void writeToParcel(android.os.HwParcel p0) {}
}
