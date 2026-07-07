package com.android.internal.notification;

public class SystemNotificationChannels {
    public static final java.lang.String ABUSIVE_BACKGROUND_APPS = "ABUSIVE_BACKGROUND_APPS";
    public static final java.lang.String ACCESSIBILITY_HEARING_DEVICE = "ACCESSIBILITY_HEARING_DEVICE";
    public static final java.lang.String ACCESSIBILITY_MAGNIFICATION = "ACCESSIBILITY_MAGNIFICATION";
    public static final java.lang.String ACCESSIBILITY_SECURITY_POLICY = "ACCESSIBILITY_SECURITY_POLICY";
    public static final java.lang.String ACCOUNT = "ACCOUNT";
    public static final java.lang.String ALERTS = "ALERTS";
    public static final java.lang.String CAR_MODE = "CAR_MODE";
    public static final java.lang.String DEVELOPER = "DEVELOPER";
    public static final java.lang.String DEVELOPER_IMPORTANT = "DEVELOPER_IMPORTANT";
    public static final java.lang.String DEVICE_ADMIN = "DEVICE_ADMIN_ALERTS";
    @java.lang.Deprecated
    public static final java.lang.String DEVICE_ADMIN_DEPRECATED = "DEVICE_ADMIN";
    public static final java.lang.String FOREGROUND_SERVICE = "FOREGROUND_SERVICE";
    public static final java.lang.String HEAVY_WEIGHT_APP = "HEAVY_WEIGHT_APP";
    public static final java.lang.String NETWORK_ALERTS = "NETWORK_ALERTS";
    public static final java.lang.String NETWORK_AVAILABLE = "NETWORK_AVAILABLE";
    public static final java.lang.String NETWORK_STATUS = "NETWORK_STATUS";
    static final java.lang.String OBSOLETE_DO_NOT_DISTURB = "DO_NOT_DISTURB";
    public static final java.lang.String PARENTAL_CONTROLS = "PARENTAL_CONTROLS";
    public static final java.lang.String PHYSICAL_KEYBOARD = "PHYSICAL_KEYBOARD";
    public static final java.lang.String RETAIL_MODE = "RETAIL_MODE";
    public static final java.lang.String SECURITY = "SECURITY";
    public static final java.lang.String SYSTEM_CHANGES = "SYSTEM_CHANGES_ALERTS";
    @java.lang.Deprecated
    public static final java.lang.String SYSTEM_CHANGES_DEPRECATED = "SYSTEM_CHANGES";
    public static final java.lang.String TIME = "TIME";
    public static final java.lang.String UPDATES = "UPDATES";
    public static final java.lang.String USB = "USB";
    @java.lang.Deprecated
    public static java.lang.String VIRTUAL_KEYBOARD;
    public static final java.lang.String VPN = "VPN";
    private SystemNotificationChannels() {}
    public static void createAccountChannelForPackage(java.lang.String p0, int p1, android.content.Context p2) {}
    public static void createAll(android.content.Context p0) {}
    private static java.lang.String getDeviceAdminNotificationChannelName(android.content.Context p0) { return null; }
    private static android.app.NotificationChannel newAccountChannel(android.content.Context p0) { return null; }
    public static void removeDeprecated(android.content.Context p0) {}
}
