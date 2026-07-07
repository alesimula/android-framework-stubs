package com.android.internal.telephony;

public final class NetworkScanResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.android.internal.telephony.NetworkScanResult> CREATOR = null;
    public static final int SCAN_STATUS_COMPLETE = 2;
    public static final int SCAN_STATUS_PARTIAL = 1;
    public java.util.List<android.telephony.CellInfo> networkInfos;
    public int scanError;
    public int scanStatus;
    public NetworkScanResult(int p0, int p1, java.util.List<android.telephony.CellInfo> p2) {}
    private NetworkScanResult(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
