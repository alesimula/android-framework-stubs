package com.android.internal.telephony;

public class CellNetworkScanResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.android.internal.telephony.CellNetworkScanResult> CREATOR = null;
    public static final int STATUS_RADIO_GENERIC_FAILURE = 3;
    public static final int STATUS_RADIO_NOT_AVAILABLE = 2;
    public static final int STATUS_SUCCESS = 1;
    public static final int STATUS_UNKNOWN_ERROR = 4;
    private final java.util.List<com.android.internal.telephony.OperatorInfo> mOperators = null;
    private final int mStatus = 0;
    public CellNetworkScanResult(int p0, java.util.List<com.android.internal.telephony.OperatorInfo> p1) {}
    private CellNetworkScanResult(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public java.util.List<com.android.internal.telephony.OperatorInfo> getOperators() { return null; }
    public int getStatus() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
