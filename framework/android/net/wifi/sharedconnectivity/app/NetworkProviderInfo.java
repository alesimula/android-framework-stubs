package android.net.wifi.sharedconnectivity.app;

@android.annotation.SystemApi
public final class NetworkProviderInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.net.wifi.sharedconnectivity.app.NetworkProviderInfo> CREATOR = null;
    public static final int DEVICE_TYPE_AUTO = 5;
    public static final int DEVICE_TYPE_LAPTOP = 3;
    public static final int DEVICE_TYPE_PHONE = 1;
    public static final int DEVICE_TYPE_TABLET = 2;
    public static final int DEVICE_TYPE_UNKNOWN = 0;
    public static final int DEVICE_TYPE_WATCH = 4;
    private final int mBatteryPercentage = 0;
    private final int mConnectionStrength = 0;
    private final java.lang.String mDeviceName = null;
    private final int mDeviceType = 0;
    private final android.os.Bundle mExtras = null;
    private final boolean mIsBatteryCharging = false;
    private final java.lang.String mModelName = null;
    private NetworkProviderInfo(int p0, java.lang.String p1, java.lang.String p2, int p3, boolean p4, int p5, android.os.Bundle p6) {}
    public static android.net.wifi.sharedconnectivity.app.NetworkProviderInfo readFromParcel(android.os.Parcel p0) { return null; }
    private static void validate(int p0, java.lang.String p1, java.lang.String p2, int p3, int p4) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getBatteryPercentage() { return 0; }
    public int getConnectionStrength() { return 0; }
    public java.lang.String getDeviceName() { return null; }
    public int getDeviceType() { return 0; }
    public android.os.Bundle getExtras() { return null; }
    public java.lang.String getModelName() { return null; }
    public int hashCode() { return 0; }
    public boolean isBatteryCharging() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private int mBatteryPercentage;
        private int mConnectionStrength;
        private java.lang.String mDeviceName;
        private int mDeviceType;
        private android.os.Bundle mExtras;
        private boolean mIsBatteryCharging;
        private java.lang.String mModelName;
        public Builder(java.lang.String p0, java.lang.String p1) {}
        public android.net.wifi.sharedconnectivity.app.NetworkProviderInfo build() { return null; }
        public android.net.wifi.sharedconnectivity.app.NetworkProviderInfo.Builder setBatteryCharging(boolean p0) { return null; }
        public android.net.wifi.sharedconnectivity.app.NetworkProviderInfo.Builder setBatteryPercentage(int p0) { return null; }
        public android.net.wifi.sharedconnectivity.app.NetworkProviderInfo.Builder setConnectionStrength(int p0) { return null; }
        public android.net.wifi.sharedconnectivity.app.NetworkProviderInfo.Builder setDeviceName(java.lang.String p0) { return null; }
        public android.net.wifi.sharedconnectivity.app.NetworkProviderInfo.Builder setDeviceType(int p0) { return null; }
        public android.net.wifi.sharedconnectivity.app.NetworkProviderInfo.Builder setExtras(android.os.Bundle p0) { return null; }
        public android.net.wifi.sharedconnectivity.app.NetworkProviderInfo.Builder setModelName(java.lang.String p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DeviceType {
    }
}
