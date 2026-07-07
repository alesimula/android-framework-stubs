package android.telephony;

public final class SignalStrengthUpdateRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.SignalStrengthUpdateRequest> CREATOR = null;
    private final boolean mIsReportingRequestedWhileIdle = false;
    private final boolean mIsSystemThresholdReportingRequestedWhileIdle = false;
    private final android.os.IBinder mLiveToken = null;
    private final java.util.List<android.telephony.SignalThresholdInfo> mSignalThresholdInfos = null;
    private SignalStrengthUpdateRequest(android.os.Parcel p0) {}
    private SignalStrengthUpdateRequest(java.util.List<android.telephony.SignalThresholdInfo> p0, boolean p1, boolean p2) {}
    private static void validate(java.util.Collection<android.telephony.SignalThresholdInfo> p0, boolean p1) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.os.IBinder getLiveToken() { return null; }
    public java.util.Collection<android.telephony.SignalThresholdInfo> getSignalThresholdInfos() { return null; }
    public int hashCode() { return 0; }
    public boolean isReportingRequestedWhileIdle() { return false; }
    @android.annotation.SystemApi
    public boolean isSystemThresholdReportingRequestedWhileIdle() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private boolean mIsReportingRequestedWhileIdle;
        private boolean mIsSystemThresholdReportingRequestedWhileIdle;
        private java.util.List<android.telephony.SignalThresholdInfo> mSignalThresholdInfos;
        public Builder() {}
        public android.telephony.SignalStrengthUpdateRequest build() { return null; }
        public android.telephony.SignalStrengthUpdateRequest.Builder setReportingRequestedWhileIdle(boolean p0) { return null; }
        public android.telephony.SignalStrengthUpdateRequest.Builder setSignalThresholdInfos(java.util.Collection<android.telephony.SignalThresholdInfo> p0) { return null; }
        @android.annotation.SystemApi
        public android.telephony.SignalStrengthUpdateRequest.Builder setSystemThresholdReportingRequestedWhileIdle(boolean p0) { return null; }
    }
}
