package com.android.internal.telephony;

public class OperatorInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.android.internal.telephony.OperatorInfo> CREATOR = null;
    private java.lang.String mOperatorAlphaLong;
    private java.lang.String mOperatorAlphaShort;
    private java.lang.String mOperatorNumeric;
    private int mRan;
    private com.android.internal.telephony.OperatorInfo.State mState;
    public OperatorInfo(java.lang.String p0, java.lang.String p1, java.lang.String p2) {}
    public OperatorInfo(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3) {}
    OperatorInfo(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.android.internal.telephony.OperatorInfo.State p3) {}
    OperatorInfo(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.android.internal.telephony.OperatorInfo.State p3, int p4) {}
    public OperatorInfo(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) {}
    private static com.android.internal.telephony.OperatorInfo.State rilStateToState(java.lang.String p0) { return null; }
    public int describeContents() { return 0; }
    public java.lang.String getOperatorAlphaLong() { return null; }
    public java.lang.String getOperatorAlphaShort() { return null; }
    public java.lang.String getOperatorNumeric() { return null; }
    public int getRan() { return 0; }
    public com.android.internal.telephony.OperatorInfo.State getState() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static enum State {
        AVAILABLE,
        CURRENT,
        FORBIDDEN,
        UNKNOWN;
        private static final com.android.internal.telephony.OperatorInfo.State[] $VALUES = null;
        private State() {}
    }
}
