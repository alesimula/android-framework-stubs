package android.telephony;

@android.annotation.SystemApi
public final class CallState implements android.os.Parcelable {
    public static final int CALL_CLASSIFICATION_BACKGROUND = 2;
    public static final int CALL_CLASSIFICATION_FOREGROUND = 1;
    public static final int CALL_CLASSIFICATION_MAX = 3;
    public static final int CALL_CLASSIFICATION_RINGING = 0;
    public static final int CALL_CLASSIFICATION_UNKNOWN = -1;
    public static final android.os.Parcelable.Creator<android.telephony.CallState> CREATOR = null;
    private final int mCallClassification = 0;
    private final android.telephony.CallQuality mCallQuality = null;
    private java.lang.String mImsCallId;
    private int mImsCallServiceType;
    private int mImsCallType;
    private final int mNetworkType = 0;
    private final int mPreciseCallState = 0;
    private CallState(int p0, int p1, android.telephony.CallQuality p2, int p3, java.lang.String p4, int p5, int p6) {}
    private CallState(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getCallClassification() { return 0; }
    public android.telephony.CallQuality getCallQuality() { return null; }
    public int getCallState() { return 0; }
    public int getImsCallServiceType() { return 0; }
    public java.lang.String getImsCallSessionId() { return null; }
    public int getImsCallType() { return 0; }
    public int getNetworkType() { return 0; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private int mCallClassification;
        private android.telephony.CallQuality mCallQuality;
        private java.lang.String mImsCallId;
        private int mImsCallServiceType;
        private int mImsCallType;
        private int mNetworkType;
        private int mPreciseCallState;
        public Builder(int p0) {}
        public android.telephony.CallState build() { return null; }
        public android.telephony.CallState.Builder setCallClassification(int p0) { return null; }
        public android.telephony.CallState.Builder setCallQuality(android.telephony.CallQuality p0) { return null; }
        public android.telephony.CallState.Builder setImsCallServiceType(int p0) { return null; }
        public android.telephony.CallState.Builder setImsCallSessionId(java.lang.String p0) { return null; }
        public android.telephony.CallState.Builder setImsCallType(int p0) { return null; }
        public android.telephony.CallState.Builder setNetworkType(int p0) { return null; }
    }
}
