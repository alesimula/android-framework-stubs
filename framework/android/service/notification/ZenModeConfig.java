package android.service.notification;

public class ZenModeConfig implements android.os.Parcelable {
    private static final java.lang.String ALLOW_ATT_ALARMS = "alarms";
    private static final java.lang.String ALLOW_ATT_CALLS = "calls";
    private static final java.lang.String ALLOW_ATT_CALLS_FROM = "callsFrom";
    private static final java.lang.String ALLOW_ATT_CHANNELS = "priorityChannelsAllowed";
    private static final java.lang.String ALLOW_ATT_CONV = "convos";
    private static final java.lang.String ALLOW_ATT_CONV_FROM = "convosFrom";
    private static final java.lang.String ALLOW_ATT_EVENTS = "events";
    private static final java.lang.String ALLOW_ATT_FROM = "from";
    private static final java.lang.String ALLOW_ATT_INTERRUPTION_TYPE_ALARMS = "interruptionTypeAlarms";
    private static final java.lang.String ALLOW_ATT_MEDIA = "media";
    private static final java.lang.String ALLOW_ATT_MESSAGES = "messages";
    private static final java.lang.String ALLOW_ATT_MESSAGES_FROM = "messagesFrom";
    private static final java.lang.String ALLOW_ATT_REMINDERS = "reminders";
    private static final java.lang.String ALLOW_ATT_REPEAT_CALLERS = "repeatCallers";
    private static final java.lang.String ALLOW_ATT_SCREEN_OFF = "visualScreenOff";
    private static final java.lang.String ALLOW_ATT_SCREEN_ON = "visualScreenOn";
    private static final java.lang.String ALLOW_ATT_SYSTEM = "system";
    public static final int[] ALL_DAYS = null;
    private static final java.lang.String AUTOMATIC_DELETED_TAG = "deleted";
    private static final java.lang.String AUTOMATIC_TAG = "automatic";
    private static final java.lang.String CONDITION_ATT_FLAGS = "flags";
    private static final java.lang.String CONDITION_ATT_ICON = "icon";
    private static final java.lang.String CONDITION_ATT_ID = "id";
    private static final java.lang.String CONDITION_ATT_LINE1 = "line1";
    private static final java.lang.String CONDITION_ATT_LINE2 = "line2";
    private static final java.lang.String CONDITION_ATT_SOURCE = "source";
    private static final java.lang.String CONDITION_ATT_STATE = "state";
    private static final java.lang.String CONDITION_ATT_SUMMARY = "summary";
    public static final java.lang.String COUNTDOWN_PATH = "countdown";
    public static final android.os.Parcelable.Creator<android.service.notification.ZenModeConfig> CREATOR = null;
    private static final android.net.Uri CUSTOM_MANUAL_CONDITION_ID = null;
    public static final java.lang.String CUSTOM_MANUAL_PATH = "custom_manual";
    private static final int DAY_MINUTES = 1440;
    private static final boolean DEFAULT_ALLOW_ALARMS = true;
    private static final boolean DEFAULT_ALLOW_CALLS = true;
    private static final boolean DEFAULT_ALLOW_CONV = true;
    private static final int DEFAULT_ALLOW_CONV_FROM = 2;
    private static final boolean DEFAULT_ALLOW_EVENTS = false;
    private static final boolean DEFAULT_ALLOW_MEDIA = true;
    private static final boolean DEFAULT_ALLOW_MESSAGES = true;
    private static final boolean DEFAULT_ALLOW_PRIORITY_CHANNELS = true;
    private static final boolean DEFAULT_ALLOW_REMINDERS = false;
    private static final boolean DEFAULT_ALLOW_REPEAT_CALLERS = true;
    private static final boolean DEFAULT_ALLOW_SYSTEM = false;
    private static final int DEFAULT_CALLS_SOURCE = 2;
    private static final boolean DEFAULT_HAS_PRIORITY_CHANNELS = false;
    private static final int DEFAULT_SOURCE = 2;
    private static final int DEFAULT_SUPPRESSED_VISUAL_EFFECTS = 157;
    private static final java.lang.String DEVICE_EFFECT_CAP_BRIGHTNESS = "zdeCapBrightness";
    private static final java.lang.String DEVICE_EFFECT_DIM_WALLPAPER = "zdeDimWallpaper";
    private static final java.lang.String DEVICE_EFFECT_DISABLE_AUTO_BRIGHTNESS = "zdeDisableAutoBrightness";
    private static final java.lang.String DEVICE_EFFECT_DISABLE_TAP_TO_WAKE = "zdeDisableTapToWake";
    private static final java.lang.String DEVICE_EFFECT_DISABLE_TILT_TO_WAKE = "zdeDisableTiltToWake";
    private static final java.lang.String DEVICE_EFFECT_DISABLE_TOUCH = "zdeDisableTouch";
    private static final java.lang.String DEVICE_EFFECT_DISPLAY_GRAYSCALE = "zdeDisplayGrayscale";
    private static final java.lang.String DEVICE_EFFECT_EXTRAS = "zdeExtraEffects";
    private static final java.lang.String DEVICE_EFFECT_MAXIMIZE_DOZE = "zdeMaximizeDoze";
    private static final java.lang.String DEVICE_EFFECT_MINIMIZE_RADIO_USAGE = "zdeMinimizeRadioUsage";
    private static final java.lang.String DEVICE_EFFECT_SUPPRESS_AMBIENT_DISPLAY = "zdeSuppressAmbientDisplay";
    private static final java.lang.String DEVICE_EFFECT_USER_MODIFIED_FIELDS = "zdeUserModifiedFields";
    private static final java.lang.String DEVICE_EFFECT_USE_NIGHT_LIGHT = "zdeUseNightLight";
    private static final java.lang.String DEVICE_EFFECT_USE_NIGHT_MODE = "zdeUseNightMode";
    private static final java.lang.String DISALLOW_ATT_VISUAL_EFFECTS = "visualEffects";
    public static final java.lang.String EVENTS_OBSOLETE_RULE_ID = "EVENTS_DEFAULT_RULE";
    public static final java.lang.String EVENT_PATH = "event";
    public static final java.lang.String EVERY_NIGHT_DEFAULT_RULE_ID = "EVERY_NIGHT_DEFAULT_RULE";
    private static final java.lang.String IMPLICIT_RULE_ID_PREFIX = "implicit_";
    public static final java.lang.String IS_ALARM_PATH = "alarm";
    private static final java.lang.String ITEM_SEPARATOR = ",";
    private static final java.lang.String ITEM_SEPARATOR_ESCAPE = "\\";
    private static final java.util.regex.Pattern ITEM_SPLITTER_REGEX = null;
    private static final int LEGACY_SUPPRESSED_EFFECTS = 3;
    public static final java.lang.String MANUAL_RULE_ID = "MANUAL_RULE";
    private static final java.lang.String MANUAL_TAG = "manual";
    private static final int MAX_SOURCE = 2;
    private static final int MINUTES_MS = 60000;
    public static final int[] MINUTE_BUCKETS = null;
    private static final java.lang.String OLD_ALLOW_TAG = "allow";
    private static final java.lang.String OLD_DISALLOW_TAG = "disallow";
    public static final int ORIGIN_APP = 4;
    public static final int ORIGIN_INIT = 1;
    public static final int ORIGIN_INIT_USER = 2;
    public static final int ORIGIN_RESTORE_BACKUP = 6;
    public static final int ORIGIN_SYSTEM = 5;
    public static final int ORIGIN_UNKNOWN = 0;
    public static final int ORIGIN_USER_IN_APP = 7;
    public static final int ORIGIN_USER_IN_SYSTEMUI = 3;
    private static final java.lang.String POLICY_USER_MODIFIED_FIELDS = "policyUserModifiedFields";
    private static final java.lang.String RULE_ATT_ALLOW_MANUAL = "userInvokable";
    private static final java.lang.String RULE_ATT_COMPONENT = "component";
    private static final java.lang.String RULE_ATT_CONDITION_ID = "conditionId";
    private static final java.lang.String RULE_ATT_CONDITION_OVERRIDE = "conditionOverride";
    private static final java.lang.String RULE_ATT_CONFIG_ACTIVITY = "configActivity";
    private static final java.lang.String RULE_ATT_CREATION_TIME = "creationTime";
    private static final java.lang.String RULE_ATT_DELETION_INSTANT = "deletionInstant";
    private static final java.lang.String RULE_ATT_DISABLED_ORIGIN = "disabledOrigin";
    private static final java.lang.String RULE_ATT_ENABLED = "enabled";
    private static final java.lang.String RULE_ATT_ENABLER = "enabler";
    private static final java.lang.String RULE_ATT_ICON = "rule_icon";
    private static final java.lang.String RULE_ATT_ID = "ruleId";
    private static final java.lang.String RULE_ATT_LAST_ACTIVATION = "lastActivation";
    private static final java.lang.String RULE_ATT_LAST_DEACTIVATION = "lastDeactivation";
    private static final java.lang.String RULE_ATT_LAST_MANUAL_ACTIVATION = "lastManualActivation";
    private static final java.lang.String RULE_ATT_LAST_MANUAL_DEACTIVATION = "lastManualDeactivation";
    private static final java.lang.String RULE_ATT_LEGACY_SUPPRESSED_EFFECTS = "legacySuppressedEffects";
    private static final java.lang.String RULE_ATT_NAME = "name";
    private static final java.lang.String RULE_ATT_PKG = "pkg";
    private static final java.lang.String RULE_ATT_TRIGGER_DESC = "triggerDesc";
    private static final java.lang.String RULE_ATT_TYPE = "type";
    private static final java.lang.String RULE_ATT_USER_MODIFIED_FIELDS = "userModifiedFields";
    private static final java.lang.String RULE_ATT_ZEN = "zen";
    public static final java.lang.String SCHEDULE_PATH = "schedule";
    private static final int SECONDS_MS = 1000;
    private static final java.lang.String SHOW_ATT_AMBIENT = "showAmbient";
    private static final java.lang.String SHOW_ATT_BADGES = "showBadges";
    private static final java.lang.String SHOW_ATT_FULL_SCREEN_INTENT = "showFullScreenIntent";
    private static final java.lang.String SHOW_ATT_LIGHTS = "showLights";
    private static final java.lang.String SHOW_ATT_NOTIFICATION_LIST = "showNotificationList";
    private static final java.lang.String SHOW_ATT_PEEK = "shoePeek";
    private static final java.lang.String SHOW_ATT_STATUS_BAR_ICONS = "showStatusBarIcons";
    public static final int SOURCE_ANYONE = 0;
    public static final int SOURCE_CONTACT = 1;
    public static final int SOURCE_STAR = 2;
    private static final java.lang.String STATE_HAS_PRIORITY_CHANNELS = "areChannelsBypassingDnd";
    private static final java.lang.String STATE_TAG = "state";
    public static final java.lang.String SYSTEM_AUTHORITY = "android";
    private static final java.lang.String TAG = "ZenModeConfig";
    public static final int XML_VERSION_MODES_API = 11;
    public static final int XML_VERSION_MODES_UI = 12;
    public static final int XML_VERSION_ZEN_UPGRADE = 8;
    private static final java.lang.String ZEN_ATT_USER = "user";
    private static final java.lang.String ZEN_ATT_VERSION = "version";
    public static final java.lang.String ZEN_TAG = "zen";
    private static final int ZERO_VALUE_MS = 10000;
    public android.util.ArrayMap<java.lang.String, android.service.notification.ZenModeConfig.ZenRule> automaticRules;
    public final android.util.ArrayMap<java.lang.String, android.service.notification.ZenModeConfig.ZenRule> deletedRules = null;
    public boolean hasPriorityChannels;
    public android.service.notification.ZenModeConfig.ZenRule manualRule;
    public int user;
    public int version;
    public ZenModeConfig() {}
    public ZenModeConfig(android.os.Parcel p0) {}
    public static boolean areAllPriorityOnlyRingerSoundsMuted(android.app.NotificationManager.Policy p0) { return false; }
    public static boolean areAllPriorityOnlyRingerSoundsMuted(android.service.notification.ZenModeConfig p0) { return false; }
    public static boolean areAllZenBehaviorSoundsMuted(android.app.NotificationManager.Policy p0) { return false; }
    public static java.lang.String deletedRuleKey(android.service.notification.ZenModeConfig.ZenRule p0) { return null; }
    private static int[] generateMinuteBuckets() { return null; }
    public static android.content.ComponentName getCountdownConditionProvider() { return null; }
    public static int getCurrentXmlVersion() { return 0; }
    public static android.content.ComponentName getCustomManualConditionProvider() { return null; }
    public static android.service.notification.ZenModeConfig getDefaultConfig() { return null; }
    public static java.util.List<java.lang.String> getDefaultRuleIds() { return null; }
    public static android.service.notification.ZenPolicy getDefaultZenPolicy() { return null; }
    public static android.content.ComponentName getEventConditionProvider() { return null; }
    public static java.lang.CharSequence getFormattedTime(android.content.Context p0, long p1, boolean p2, int p3) { return null; }
    public static android.content.ComponentName getScheduleConditionProvider() { return null; }
    public static java.lang.String implicitRuleId(java.lang.String p0) { return null; }
    public static boolean isImplicitRuleId(java.lang.String p0) { return false; }
    private boolean isPriorityCategoryEnabled(int p0, android.app.NotificationManager.Policy p1) { return false; }
    public static boolean isToday(long p0) { return false; }
    private static boolean isValidAutomaticRule(android.service.notification.ZenModeConfig.ZenRule p0) { return false; }
    public static boolean isValidCountdownConditionId(android.net.Uri p0) { return false; }
    public static boolean isValidCountdownToAlarmConditionId(android.net.Uri p0) { return false; }
    public static boolean isValidCustomManualConditionId(android.net.Uri p0) { return false; }
    public static boolean isValidEventConditionId(android.net.Uri p0) { return false; }
    public static boolean isValidHour(int p0) { return false; }
    private static boolean isValidManualRule(android.service.notification.ZenModeConfig.ZenRule p0) { return false; }
    public static boolean isValidMinute(int p0) { return false; }
    public static boolean isValidScheduleConditionId(android.net.Uri p0) { return false; }
    private static boolean isValidSource(int p0) { return false; }
    private boolean isVisualEffectAllowed(int p0, int p1) { return false; }
    private boolean isVisualEffectAllowed(int p0, android.app.NotificationManager.Policy p1) { return false; }
    public static boolean isZenOverridingRinger(int p0, android.app.NotificationManager.Policy p1) { return false; }
    private static android.service.notification.ZenPolicy migrateToManualRuleZenPolicy(boolean p0, boolean p1, boolean p2, boolean p3, boolean p4, boolean p5, boolean p6, boolean p7, int p8, int p9, boolean p10, int p11, int p12, boolean p13) { return null; }
    public static java.lang.String newRuleId() { return null; }
    public static android.service.notification.Condition readConditionXml(com.android.modules.utils.TypedXmlPullParser p0) { return null; }
    public static android.service.notification.ZenModeConfig.ZenRule readRuleXml(com.android.modules.utils.TypedXmlPullParser p0) { return null; }
    private static void readRulesFromParcel(android.util.ArrayMap<java.lang.String, android.service.notification.ZenModeConfig.ZenRule> p0, android.os.Parcel p1) {}
    public static android.service.notification.ZenModeConfig readXml(com.android.modules.utils.TypedXmlPullParser p0, android.app.backup.BackupRestoreEventLogger p1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    private static android.service.notification.ZenDeviceEffects readZenDeviceEffectsXml(com.android.modules.utils.TypedXmlPullParser p0) { return null; }
    public static android.service.notification.ZenPolicy readZenPolicyXml(com.android.modules.utils.TypedXmlPullParser p0) { return null; }
    private static java.lang.String rulesToString(android.util.ArrayMap<java.lang.String, android.service.notification.ZenModeConfig.ZenRule> p0) { return null; }
    private static boolean safeBoolean(com.android.modules.utils.TypedXmlPullParser p0, java.lang.String p1, boolean p2) { return false; }
    private static boolean safeBoolean(java.lang.String p0, boolean p1) { return false; }
    private static android.content.ComponentName safeComponentName(com.android.modules.utils.TypedXmlPullParser p0, java.lang.String p1) { return null; }
    private static java.time.Instant safeInstant(com.android.modules.utils.TypedXmlPullParser p0, java.lang.String p1, java.time.Instant p2) { return null; }
    private static int safeInt(com.android.modules.utils.TypedXmlPullParser p0, java.lang.String p1, int p2) { return 0; }
    private static long safeLong(com.android.modules.utils.TypedXmlPullParser p0, java.lang.String p1, long p2) { return 0L; }
    private static java.util.Set<java.lang.String> safeStringSet(com.android.modules.utils.TypedXmlPullParser p0, java.lang.String p1) { return null; }
    private static android.net.Uri safeUri(com.android.modules.utils.TypedXmlPullParser p0, java.lang.String p1) { return null; }
    private static boolean sameCondition(android.service.notification.ZenModeConfig.ZenRule p0) { return false; }
    public static java.lang.String sourceToString(int p0) { return null; }
    public static android.net.Uri toCountdownConditionId(long p0, boolean p1) { return null; }
    public static android.net.Uri toCustomManualConditionId() { return null; }
    private static java.lang.String toDayList(int[] p0) { return null; }
    public static android.net.Uri toEventConditionId(android.service.notification.ZenModeConfig.EventInfo p0) { return null; }
    public static android.service.notification.Condition toNextAlarmCondition(android.content.Context p0, long p1, int p2) { return null; }
    public static android.service.notification.ScheduleCalendar toScheduleCalendar(android.net.Uri p0) { return null; }
    public static android.net.Uri toScheduleConditionId(android.service.notification.ZenModeConfig.ScheduleInfo p0) { return null; }
    public static android.service.notification.Condition toTimeCondition(android.content.Context p0, int p1, int p2) { return null; }
    public static android.service.notification.Condition toTimeCondition(android.content.Context p0, int p1, int p2, boolean p3) { return null; }
    public static android.service.notification.Condition toTimeCondition(android.content.Context p0, long p1, int p2, int p3, boolean p4) { return null; }
    public static long tryParseCountdownConditionId(android.net.Uri p0) { return 0L; }
    private static int[] tryParseDayList(java.lang.String p0, java.lang.String p1) { return null; }
    public static android.service.notification.ZenModeConfig.EventInfo tryParseEventConditionId(android.net.Uri p0) { return null; }
    private static int[] tryParseHourAndMinute(java.lang.String p0) { return null; }
    private static int tryParseInt(java.lang.String p0, int p1) { return 0; }
    private static long tryParseLong(java.lang.String p0, long p1) { return 0L; }
    private static java.lang.Long tryParseLong(java.lang.String p0, java.lang.Long p1) { return null; }
    public static android.service.notification.ZenModeConfig.ScheduleInfo tryParseScheduleConditionId(android.net.Uri p0) { return null; }
    private static int tryParseZenMode(java.lang.String p0, int p1) { return 0; }
    private static java.lang.Boolean unsafeBoolean(com.android.modules.utils.TypedXmlPullParser p0, java.lang.String p1) { return null; }
    private static java.lang.Float unsafeFloat(com.android.modules.utils.TypedXmlPullParser p0, java.lang.String p1) { return null; }
    private static void writeBooleanIfTrue(com.android.modules.utils.TypedXmlSerializer p0, java.lang.String p1, boolean p2) throws java.io.IOException {}
    public static void writeConditionXml(android.service.notification.Condition p0, com.android.modules.utils.TypedXmlSerializer p1) throws java.io.IOException {}
    private static void writeFloatIfNotNull(com.android.modules.utils.TypedXmlSerializer p0, java.lang.String p1, java.lang.Float p2) throws java.io.IOException {}
    public static void writeRuleXml(android.service.notification.ZenModeConfig.ZenRule p0, com.android.modules.utils.TypedXmlSerializer p1, boolean p2) throws java.io.IOException {}
    private static void writeRulesToParcel(android.util.ArrayMap<java.lang.String, android.service.notification.ZenModeConfig.ZenRule> p0, android.os.Parcel p1, int p2) {}
    private static void writeStringSet(com.android.modules.utils.TypedXmlSerializer p0, java.lang.String p1, java.util.Set<java.lang.String> p2) throws java.io.IOException {}
    private static void writeXmlAttributeInstant(com.android.modules.utils.TypedXmlSerializer p0, java.lang.String p1, java.time.Instant p2) throws java.io.IOException {}
    private static void writeZenDeviceEffectsXml(android.service.notification.ZenDeviceEffects p0, com.android.modules.utils.TypedXmlSerializer p1) throws java.io.IOException {}
    private static void writeZenPolicyState(java.lang.String p0, int p1, com.android.modules.utils.TypedXmlSerializer p2) throws java.io.IOException {}
    public static void writeZenPolicyXml(android.service.notification.ZenPolicy p0, com.android.modules.utils.TypedXmlSerializer p1) throws java.io.IOException {}
    public void applyNotificationPolicy(android.app.NotificationManager.Policy p0) {}
    public android.service.notification.ZenModeConfig copy() { return null; }
    public int describeContents() { return 0; }
    void ensureManualZenRule() {}
    public boolean equals(java.lang.Object p0) { return false; }
    public android.service.notification.ZenPolicy getZenPolicy() { return null; }
    public int hashCode() { return 0; }
    public boolean isManualActive() { return false; }
    public boolean isValid() { return false; }
    public android.app.NotificationManager.Policy toNotificationPolicy() { return null; }
    public android.app.NotificationManager.Policy toNotificationPolicy(android.service.notification.ZenPolicy p0) { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void writeXml(com.android.modules.utils.TypedXmlSerializer p0, java.lang.Integer p1, boolean p2, android.app.backup.BackupRestoreEventLogger p3) throws java.io.IOException {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ConfigOrigin {
    }

    public static class EventInfo {
        public static final int REPLY_ANY_EXCEPT_NO = 0;
        public static final int REPLY_YES = 2;
        public static final int REPLY_YES_OR_MAYBE = 1;
        public java.lang.String calName;
        public java.lang.Long calendarId;
        public int reply;
        public int userId;
        public EventInfo() {}
        public static int resolveUserId(int p0) { return 0; }
        public android.service.notification.ZenModeConfig.EventInfo copy() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    public static class ScheduleInfo {
        public int[] days;
        public int endHour;
        public int endMinute;
        public boolean exitAtAlarm;
        public long nextAlarm;
        public int startHour;
        public int startMinute;
        public ScheduleInfo() {}
        protected static java.lang.String ts(long p0) { return null; }
        public android.service.notification.ZenModeConfig.ScheduleInfo copy() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }

    public static class ZenRule implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.service.notification.ZenModeConfig.ZenRule> CREATOR = null;
        public static final int OVERRIDE_ACTIVATE = 1;
        public static final int OVERRIDE_DEACTIVATE = 2;
        public static final int OVERRIDE_NONE = 0;
        public boolean allowManualInvocation;
        public android.content.ComponentName component;
        public android.service.notification.Condition condition;
        public android.net.Uri conditionId;
        int conditionOverride;
        public android.content.ComponentName configurationActivity;
        public long creationTime;
        public java.time.Instant deletionInstant;
        public int disabledOrigin;
        public boolean enabled;
        public java.lang.String enabler;
        public java.lang.String iconResName;
        public java.lang.String id;
        public java.time.Instant lastActivation;
        public java.time.Instant lastDeactivation;
        public java.time.Instant lastManualActivation;
        public java.time.Instant lastManualDeactivation;
        int legacySuppressedEffects;
        public java.lang.String name;
        public java.lang.String pkg;
        public java.lang.String triggerDescription;
        public int type;
        public int userModifiedFields;
        public android.service.notification.ZenDeviceEffects zenDeviceEffects;
        public int zenDeviceEffectsUserModifiedFields;
        public int zenMode;
        public android.service.notification.ZenPolicy zenPolicy;
        public int zenPolicyUserModifiedFields;
        public ZenRule() {}
        public ZenRule(android.os.Parcel p0) {}
        private static java.lang.String conditionOverrideToString(int p0) { return null; }
        private static void writeInstantToParcel(android.os.Parcel p0, java.time.Instant p1) {}
        public android.service.notification.ZenModeConfig.ZenRule copy() { return null; }
        public int describeContents() { return 0; }
        public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int getConditionOverride() { return 0; }
        public java.lang.String getPkg() { return null; }
        public int hashCode() { return 0; }
        public boolean isActive() { return false; }
        public boolean isTrueOrUnknown() { return false; }
        public boolean isUserModified() { return false; }
        public void reconsiderConditionOverride() {}
        public void resetConditionOverride() {}
        public void setConditionOverride(int p0) {}
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface ConditionOverride {
        }
    }
}
