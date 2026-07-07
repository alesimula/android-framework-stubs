package android.telephony.satellite;

@android.annotation.SystemApi
public final class PointingUiAppLaunchIntentAttributes implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.satellite.PointingUiAppLaunchIntentAttributes> CREATOR = null;
    private boolean mIsDemoMode;
    private boolean mIsEmergencyMode;
    private boolean mNeedFullScreen;
    private PointingUiAppLaunchIntentAttributes(android.os.Parcel p0) {}
    public PointingUiAppLaunchIntentAttributes(boolean p0, boolean p1, boolean p2) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public boolean isDemoMode() { return false; }
    public boolean isEmergencyMode() { return false; }
    public boolean isFullScreen() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private boolean mIsDemoMode;
        private boolean mIsEmergencyMode;
        private boolean mNeedFullScreen;
        public Builder() {}
        public android.telephony.satellite.PointingUiAppLaunchIntentAttributes build() { return null; }
        public android.telephony.satellite.PointingUiAppLaunchIntentAttributes.Builder setDemoMode(boolean p0) { return null; }
        public android.telephony.satellite.PointingUiAppLaunchIntentAttributes.Builder setEmergencyMode(boolean p0) { return null; }
        public android.telephony.satellite.PointingUiAppLaunchIntentAttributes.Builder setFullScreen(boolean p0) { return null; }
    }
}
