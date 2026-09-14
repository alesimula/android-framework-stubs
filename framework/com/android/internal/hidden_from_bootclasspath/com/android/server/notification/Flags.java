package com.android.internal.hidden_from_bootclasspath.com.android.server.notification;

public final class Flags {
    private static com.android.internal.hidden_from_bootclasspath.com.android.server.notification.FeatureFlags FEATURE_FLAGS;
    public static final java.lang.String FLAG_ALLOW_FREEZING_IDLE_NLS = "com.android.server.notification.allow_freezing_idle_nls";
    public static final java.lang.String FLAG_AUTOGROUP_SUMMARY_ICON_UPDATE = "com.android.server.notification.autogroup_summary_icon_update";
    public static final java.lang.String FLAG_EXIT_INVALID_CANCEL_EARLY = "com.android.server.notification.exit_invalid_cancel_early";
    public static final java.lang.String FLAG_EXPIRE_BITMAPS = "com.android.server.notification.expire_bitmaps";
    public static final java.lang.String FLAG_FAVORITES_INCOMING_CALL_LIGHTS = "com.android.server.notification.favorites_incoming_call_lights";
    public static final java.lang.String FLAG_IGNORE_DUPLICATE_BINDINGS = "com.android.server.notification.ignore_duplicate_bindings";
    public static final java.lang.String FLAG_MANAGED_SERVICES_CONCURRENT_MULTIUSER = "com.android.server.notification.managed_services_concurrent_multiuser";
    public static final java.lang.String FLAG_MANAGED_SERVICES_DISCARD_ZOMBIE_CALLBACKS = "com.android.server.notification.managed_services_discard_zombie_callbacks";
    public static final java.lang.String FLAG_NOTIFICATION_FORCE_GROUP_CONVERSATIONS = "com.android.server.notification.notification_force_group_conversations";
    public static final java.lang.String FLAG_NOTIFICATION_LOCK_SCREEN_SETTINGS = "com.android.server.notification.notification_lock_screen_settings";
    public static final java.lang.String FLAG_NOTIFICATION_MINIMALISM = "com.android.server.notification.notification_minimalism";
    public static final java.lang.String FLAG_NOTIFICATION_VIBRATION_IN_SOUND_URI = "com.android.server.notification.notification_vibration_in_sound_uri";
    public static final java.lang.String FLAG_NOTIFICATION_VIBRATION_IN_SOUND_URI_FOR_CHANNEL = "com.android.server.notification.notification_vibration_in_sound_uri_for_channel";
    public static final java.lang.String FLAG_STRICT_ZEN_RULE_COMPONENT_VALIDATION = "com.android.server.notification.strict_zen_rule_component_validation";
    public static final java.lang.String FLAG_TRACE_CANCEL_EVENTS = "com.android.server.notification.trace_cancel_events";
    public static final java.lang.String FLAG_VIBRATE_WHILE_UNLOCKED = "com.android.server.notification.vibrate_while_unlocked";
    public Flags() {}
    public static boolean allowFreezingIdleNls() { return false; }
    public static boolean autogroupSummaryIconUpdate() { return false; }
    public static boolean exitInvalidCancelEarly() { return false; }
    public static boolean expireBitmaps() { return false; }
    public static boolean favoritesIncomingCallLights() { return false; }
    public static boolean ignoreDuplicateBindings() { return false; }
    public static boolean managedServicesConcurrentMultiuser() { return false; }
    public static boolean managedServicesDiscardZombieCallbacks() { return false; }
    public static boolean notificationForceGroupConversations() { return false; }
    public static boolean notificationLockScreenSettings() { return false; }
    public static boolean notificationMinimalism() { return false; }
    public static boolean notificationVibrationInSoundUri() { return false; }
    public static boolean notificationVibrationInSoundUriForChannel() { return false; }
    public static boolean strictZenRuleComponentValidation() { return false; }
    public static boolean traceCancelEvents() { return false; }
    public static boolean vibrateWhileUnlocked() { return false; }
}
