package com.android.internal.hidden_from_bootclasspath.android.server;

public final class Flags {
    public static final java.lang.String FLAG_DISABLE_DISPLAY_OFFLOAD = "android.server.disable_display_offload";
    public static final java.lang.String FLAG_ENABLE_THEME_SERVICE = "android.server.enable_theme_service";
    public static final java.lang.String FLAG_ENABLE_WEAR_THEME_SERVICE = "android.server.enable_wear_theme_service";
    public static final java.lang.String FLAG_IMMUTABLE_BACKGROUND_DATA_AND_DATA_SAVER_TOGGLES = "android.server.immutable_background_data_and_data_saver_toggles";
    public static final java.lang.String FLAG_REMOVE_AD_SERVICES_MANAGER_SERVICE_FROM_WEAR = "android.server.remove_ad_services_manager_service_from_wear";
    public static final java.lang.String FLAG_REMOVE_APP_INTEGRITY_MANAGER_SERVICE = "android.server.remove_app_integrity_manager_service";
    public static final java.lang.String FLAG_WEAR_GESTURE_API = "android.server.wear_gesture_api";
    public Flags() {}
    public static boolean disableDisplayOffload() { return false; }
    public static boolean enableThemeService() { return false; }
    public static boolean enableWearThemeService() { return false; }
    public static boolean immutableBackgroundDataAndDataSaverToggles() { return false; }
    public static boolean removeAdServicesManagerServiceFromWear() { return false; }
    public static boolean removeAppIntegrityManagerService() { return false; }
    public static boolean wearGestureApi() { return false; }
}
