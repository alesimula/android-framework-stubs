package android.telephony.ims;

public class ImsMmTelManager implements android.telephony.ims.RegistrationManager {
    private static final java.lang.String TAG = "ImsMmTelManager";
    public static final int WIFI_MODE_CELLULAR_PREFERRED = 1;
    public static final int WIFI_MODE_UNKNOWN = -1;
    public static final int WIFI_MODE_WIFI_ONLY = 0;
    public static final int WIFI_MODE_WIFI_PREFERRED = 2;
    private static final android.telephony.BinderCacheManager<com.android.internal.telephony.ITelephony> sTelephonyCache = null;
    private final android.telephony.BinderCacheManager<com.android.internal.telephony.ITelephony> mBinderCache = null;
    private final android.content.Context mContext = null;
    private final int mSubId = 0;
    public ImsMmTelManager(int p0, android.telephony.BinderCacheManager<com.android.internal.telephony.ITelephony> p1) {}
    public ImsMmTelManager(android.content.Context p0, int p1, android.telephony.BinderCacheManager<com.android.internal.telephony.ITelephony> p2) {}
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public static android.telephony.ims.ImsMmTelManager createForSubscriptionId(int p0) { return null; }
    private com.android.internal.telephony.ITelephony getITelephony() { return null; }
    private static com.android.internal.telephony.ITelephony getITelephonyInterface() { return null; }
    private java.lang.String getOpPackageName() { return null; }
    public static java.lang.String wifiCallingModeToString(int p0) { return null; }
    @android.annotation.SystemApi
    public void getFeatureState(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Integer> p1) throws android.telephony.ims.ImsException {}
    @android.annotation.SystemApi
    public void getRegistrationState(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Integer> p1) {}
    public void getRegistrationTransportType(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Integer> p1) {}
    public int getVoWiFiModeSetting() { return 0; }
    @android.annotation.SystemApi
    public int getVoWiFiRoamingModeSetting() { return 0; }
    public boolean isAdvancedCallingSettingEnabled() { return false; }
    @android.annotation.SystemApi
    public boolean isAvailable(int p0, int p1) { return false; }
    @android.annotation.SystemApi
    public boolean isCapable(int p0, int p1) { return false; }
    public boolean isCrossSimCallingEnabled() throws android.telephony.ims.ImsException { return false; }
    @android.annotation.SystemApi
    public void isSupported(int p0, int p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.lang.Boolean> p3) throws android.telephony.ims.ImsException {}
    public boolean isTtyOverVolteEnabled() { return false; }
    public boolean isVoWiFiRoamingSettingEnabled() { return false; }
    public boolean isVoWiFiSettingEnabled() { return false; }
    public boolean isVtSettingEnabled() { return false; }
    @android.annotation.SystemApi
    public void registerImsEmergencyRegistrationCallback(java.util.concurrent.Executor p0, android.telephony.ims.RegistrationManager.RegistrationCallback p1) throws android.telephony.ims.ImsException {}
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public void registerImsRegistrationCallback(java.util.concurrent.Executor p0, android.telephony.ims.ImsMmTelManager.RegistrationCallback p1) throws android.telephony.ims.ImsException {}
    public void registerImsRegistrationCallback(java.util.concurrent.Executor p0, android.telephony.ims.RegistrationManager.RegistrationCallback p1) throws android.telephony.ims.ImsException {}
    public void registerImsStateCallback(java.util.concurrent.Executor p0, android.telephony.ims.ImsStateCallback p1) throws android.telephony.ims.ImsException {}
    public void registerMmTelCapabilityCallback(java.util.concurrent.Executor p0, android.telephony.ims.ImsMmTelManager.CapabilityCallback p1) throws android.telephony.ims.ImsException {}
    @android.annotation.SystemApi
    public void setAdvancedCallingSettingEnabled(boolean p0) {}
    @android.annotation.SystemApi
    public void setCrossSimCallingEnabled(boolean p0) throws android.telephony.ims.ImsException {}
    @android.annotation.SystemApi
    public void setRttCapabilitySetting(boolean p0) {}
    @android.annotation.SystemApi
    public void setVoWiFiModeSetting(int p0) {}
    @android.annotation.SystemApi
    public void setVoWiFiNonPersistent(boolean p0, int p1) {}
    @android.annotation.SystemApi
    public void setVoWiFiRoamingModeSetting(int p0) {}
    @android.annotation.SystemApi
    public void setVoWiFiRoamingSettingEnabled(boolean p0) {}
    @android.annotation.SystemApi
    public void setVoWiFiSettingEnabled(boolean p0) {}
    @android.annotation.SystemApi
    public void setVtSettingEnabled(boolean p0) {}
    @android.annotation.SystemApi
    public void unregisterImsEmergencyRegistrationCallback(android.telephony.ims.RegistrationManager.RegistrationCallback p0) {}
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public void unregisterImsRegistrationCallback(android.telephony.ims.ImsMmTelManager.RegistrationCallback p0) {}
    public void unregisterImsRegistrationCallback(android.telephony.ims.RegistrationManager.RegistrationCallback p0) {}
    public void unregisterImsStateCallback(android.telephony.ims.ImsStateCallback p0) {}
    public void unregisterMmTelCapabilityCallback(android.telephony.ims.ImsMmTelManager.CapabilityCallback p0) {}

    public static class CapabilityCallback {
        private final android.telephony.ims.ImsMmTelManager.CapabilityCallback.CapabilityBinder mBinder = null;
        public CapabilityCallback() {}
        public final android.telephony.ims.aidl.IImsCapabilityCallback getBinder() { return null; }
        public void onCapabilitiesStatusChanged(android.telephony.ims.feature.MmTelFeature.MmTelCapabilities p0) {}
        public final void setExecutor(java.util.concurrent.Executor p0) {}

        private static class CapabilityBinder extends android.telephony.ims.aidl.IImsCapabilityCallback.Stub {
            private java.util.concurrent.Executor mExecutor;
            private final android.telephony.ims.ImsMmTelManager.CapabilityCallback mLocalCallback = null;
            CapabilityBinder(android.telephony.ims.ImsMmTelManager.CapabilityCallback p0) { super(); }
            private void setExecutor(java.util.concurrent.Executor p0) {}
            public void onCapabilitiesStatusChanged(int p0) {}
            public void onChangeCapabilityConfigurationError(int p0, int p1, int p2) {}
            public void onQueryCapabilityConfiguration(int p0, int p1, boolean p2) {}
        }
    }

    @android.annotation.SystemApi
    @java.lang.Deprecated
    public static class RegistrationCallback extends android.telephony.ims.RegistrationManager.RegistrationCallback {
        public RegistrationCallback() { super(); }
        public void onRegistered(int p0) {}
        public void onRegistering(int p0) {}
        public void onTechnologyChangeFailed(int p0, android.telephony.ims.ImsReasonInfo p1) {}
        public void onUnregistered(android.telephony.ims.ImsReasonInfo p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface WiFiCallingMode {
    }
}
