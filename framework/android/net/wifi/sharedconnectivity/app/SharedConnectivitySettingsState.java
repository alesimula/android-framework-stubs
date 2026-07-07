package android.net.wifi.sharedconnectivity.app;

@android.annotation.SystemApi
public final class SharedConnectivitySettingsState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.net.wifi.sharedconnectivity.app.SharedConnectivitySettingsState> CREATOR = null;
    private final android.os.Bundle mExtras = null;
    private final boolean mInstantTetherEnabled = false;
    private final android.app.PendingIntent mInstantTetherSettingsPendingIntent = null;
    private SharedConnectivitySettingsState(boolean p0, android.app.PendingIntent p1, android.os.Bundle p2) {}
    public static android.net.wifi.sharedconnectivity.app.SharedConnectivitySettingsState readFromParcel(android.os.Parcel p0) { return null; }
    private static void validate(android.app.PendingIntent p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.os.Bundle getExtras() { return null; }
    public android.app.PendingIntent getInstantTetherSettingsPendingIntent() { return null; }
    public int hashCode() { return 0; }
    public boolean isInstantTetherEnabled() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.os.Bundle mExtras;
        private boolean mInstantTetherEnabled;
        private android.app.PendingIntent mInstantTetherSettingsPendingIntent;
        public Builder() {}
        public android.net.wifi.sharedconnectivity.app.SharedConnectivitySettingsState build() { return null; }
        public android.net.wifi.sharedconnectivity.app.SharedConnectivitySettingsState.Builder setExtras(android.os.Bundle p0) { return null; }
        public android.net.wifi.sharedconnectivity.app.SharedConnectivitySettingsState.Builder setInstantTetherEnabled(boolean p0) { return null; }
        public android.net.wifi.sharedconnectivity.app.SharedConnectivitySettingsState.Builder setInstantTetherSettingsPendingIntent(android.app.PendingIntent p0) { return null; }
    }
}
