package android.service.notification;

public final class SystemZenRules {
    private static final java.lang.String OLD_COUNTDOWN_COMPONENT = "com.android.server.notification.CountdownConditionProvider";
    private static final java.lang.String OLD_CUSTOM_MANUAL_COMPONENT = "com.android.server.notification.CustomManualConditionProvider";
    private static final java.lang.String OLD_EVENT_COMPONENT = "com.android.server.notification.EventConditionProvider";
    private static final java.lang.String OLD_SCHEDULE_COMPONENT = "com.android.server.notification.ScheduleConditionProvider";
    public static final java.lang.String PACKAGE_ANDROID = "android";
    private static final java.lang.String TAG = "SystemZenRules";
    private SystemZenRules() {}
    private static int[] getDaysOfWeekForLocale(java.util.Calendar p0) { return null; }
    public static java.lang.String getDaysOfWeekFull(android.content.Context p0, android.service.notification.ZenModeConfig.ScheduleInfo p1) { return null; }
    public static java.lang.String getDaysOfWeekShort(android.content.Context p0, android.service.notification.ZenModeConfig.ScheduleInfo p1) { return null; }
    private static java.lang.String getDaysSummary(android.content.Context p0, int p1, java.text.SimpleDateFormat p2, android.service.notification.ZenModeConfig.ScheduleInfo p3) { return null; }
    private static java.util.Locale getLocale(android.content.Context p0) { return null; }
    public static java.lang.String getTimeSummary(android.content.Context p0, android.service.notification.ZenModeConfig.ScheduleInfo p1) { return null; }
    public static java.lang.String getTriggerDescriptionForScheduleEvent(android.content.Context p0, android.service.notification.ZenModeConfig.EventInfo p1) { return null; }
    public static java.lang.String getTriggerDescriptionForScheduleTime(android.content.Context p0, android.service.notification.ZenModeConfig.ScheduleInfo p1) { return null; }
    public static boolean isSystemOwnedRule(android.service.notification.ZenModeConfig.ZenRule p0) { return false; }
    private static void maybeFixSystemRuleWithIncorrectOwner(android.service.notification.ZenModeConfig.ZenRule p0) {}
    private static void maybeFixSystemRulesWithIncorrectComponent(android.service.notification.ZenModeConfig.ZenRule p0) {}
    public static void maybeUpgradeRules(android.content.Context p0, android.service.notification.ZenModeConfig p1) {}
    private static java.lang.String timeString(android.content.Context p0, int p1, int p2) { return null; }
    public static boolean updateTriggerDescription(android.content.Context p0, android.service.notification.ZenModeConfig.ZenRule p1) { return false; }
    private static boolean updateTriggerDescription(android.service.notification.ZenModeConfig.ZenRule p0, java.lang.String p1) { return false; }
    private static void upgradeSystemProviderRule(android.content.Context p0, android.service.notification.ZenModeConfig.ZenRule p1) {}
}
