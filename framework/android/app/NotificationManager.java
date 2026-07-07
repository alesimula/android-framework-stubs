package android.app;

public class NotificationManager {
    public static final java.lang.String ACTION_APP_BLOCK_STATE_CHANGED = "android.app.action.APP_BLOCK_STATE_CHANGED";
    public static final java.lang.String ACTION_AUTOMATIC_ZEN_RULE = "android.app.action.AUTOMATIC_ZEN_RULE";
    public static final java.lang.String ACTION_AUTOMATIC_ZEN_RULE_STATUS_CHANGED = "android.app.action.AUTOMATIC_ZEN_RULE_STATUS_CHANGED";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_CLOSE_NOTIFICATION_HANDLER_PANEL = "android.app.action.CLOSE_NOTIFICATION_HANDLER_PANEL";
    public static final java.lang.String ACTION_CONSOLIDATED_NOTIFICATION_POLICY_CHANGED = "android.app.action.CONSOLIDATED_NOTIFICATION_POLICY_CHANGED";
    public static final java.lang.String ACTION_EFFECTS_SUPPRESSOR_CHANGED = "android.os.action.ACTION_EFFECTS_SUPPRESSOR_CHANGED";
    public static final java.lang.String ACTION_INTERRUPTION_FILTER_CHANGED = "android.app.action.INTERRUPTION_FILTER_CHANGED";
    public static final java.lang.String ACTION_INTERRUPTION_FILTER_CHANGED_INTERNAL = "android.app.action.INTERRUPTION_FILTER_CHANGED_INTERNAL";
    public static final java.lang.String ACTION_NOTIFICATION_CHANNEL_BLOCK_STATE_CHANGED = "android.app.action.NOTIFICATION_CHANNEL_BLOCK_STATE_CHANGED";
    public static final java.lang.String ACTION_NOTIFICATION_CHANNEL_GROUP_BLOCK_STATE_CHANGED = "android.app.action.NOTIFICATION_CHANNEL_GROUP_BLOCK_STATE_CHANGED";
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final java.lang.String ACTION_NOTIFICATION_LISTENER_ENABLED_CHANGED = "android.app.action.NOTIFICATION_LISTENER_ENABLED_CHANGED";
    public static final java.lang.String ACTION_NOTIFICATION_POLICY_ACCESS_GRANTED_CHANGED = "android.app.action.NOTIFICATION_POLICY_ACCESS_GRANTED_CHANGED";
    public static final java.lang.String ACTION_NOTIFICATION_POLICY_CHANGED = "android.app.action.NOTIFICATION_POLICY_CHANGED";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_OPEN_NOTIFICATION_HANDLER_PANEL = "android.app.action.OPEN_NOTIFICATION_HANDLER_PANEL";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_TOGGLE_NOTIFICATION_HANDLER_PANEL = "android.app.action.TOGGLE_NOTIFICATION_HANDLER_PANEL";
    public static final java.lang.String ACTION_ZEN_CONFIGURATION_CHANGED_INTERNAL = "android.app.action.ZEN_CONFIGURATION_CHANGED_INTERNAL";
    public static final java.lang.String ALLOWED_NAS_ADJUSTMENT_KEYS_CHANGED = "android.app.action.ALLOWED_NAS_ADJUSTMENT_KEYS_CHANGED";
    public static final int AUTOMATIC_RULE_STATUS_ACTIVATED = 4;
    public static final int AUTOMATIC_RULE_STATUS_DEACTIVATED = 5;
    public static final int AUTOMATIC_RULE_STATUS_DISABLED = 2;
    public static final int AUTOMATIC_RULE_STATUS_ENABLED = 1;
    public static final int AUTOMATIC_RULE_STATUS_REMOVED = 3;
    public static final int AUTOMATIC_RULE_STATUS_UNKNOWN = -1;
    public static final int BUBBLE_PREFERENCE_ALL = 1;
    public static final int BUBBLE_PREFERENCE_NONE = 0;
    public static final int BUBBLE_PREFERENCE_SELECTED = 2;
    public static final java.lang.String EXTRA_AUTOMATIC_RULE_ID = "android.app.extra.AUTOMATIC_RULE_ID";
    public static final java.lang.String EXTRA_AUTOMATIC_ZEN_RULE_ID = "android.app.extra.AUTOMATIC_ZEN_RULE_ID";
    public static final java.lang.String EXTRA_AUTOMATIC_ZEN_RULE_STATUS = "android.app.extra.AUTOMATIC_ZEN_RULE_STATUS";
    public static final java.lang.String EXTRA_BLOCKED_STATE = "android.app.extra.BLOCKED_STATE";
    public static final java.lang.String EXTRA_NOTIFICATION_CHANNEL_GROUP_ID = "android.app.extra.NOTIFICATION_CHANNEL_GROUP_ID";
    public static final java.lang.String EXTRA_NOTIFICATION_CHANNEL_ID = "android.app.extra.NOTIFICATION_CHANNEL_ID";
    public static final java.lang.String EXTRA_NOTIFICATION_POLICY = "android.app.extra.NOTIFICATION_POLICY";
    public static final int IMPORTANCE_DEFAULT = 3;
    public static final int IMPORTANCE_HIGH = 4;
    public static final int IMPORTANCE_LOW = 2;
    public static final int IMPORTANCE_MAX = 5;
    public static final int IMPORTANCE_MIN = 1;
    public static final int IMPORTANCE_NONE = 0;
    public static final int IMPORTANCE_UNSPECIFIED = -1000;
    public static final int INTERRUPTION_FILTER_ALARMS = 4;
    public static final int INTERRUPTION_FILTER_ALL = 1;
    public static final int INTERRUPTION_FILTER_NONE = 3;
    public static final int INTERRUPTION_FILTER_PRIORITY = 2;
    public static final int INTERRUPTION_FILTER_UNKNOWN = 0;
    private static final int KNOWN_STATUS_CANCELLED = 2;
    private static final int KNOWN_STATUS_ENQUEUED = 1;
    private static final float MAX_NOTIFICATION_UNNECESSARY_CANCEL_RATE = 5.0f;
    private static final float MAX_NOTIFICATION_UPDATE_RATE = 5.0f;
    public static int MAX_SERVICE_COMPONENT_NAME_LENGTH;
    public static final java.lang.String META_DATA_AUTOMATIC_RULE_TYPE = "android.service.zen.automatic.ruleType";
    public static final java.lang.String META_DATA_RULE_INSTANCE_LIMIT = "android.service.zen.automatic.ruleInstanceLimit";
    private static final java.lang.String NOTIFICATION_CHANNELS_CACHE_API = "getNotificationChannels";
    private static final int NOTIFICATION_CHANNELS_CACHE_SIZE = 10;
    private static final java.lang.String NOTIFICATION_CHANNEL_GROUPS_CACHE_API = "getNotificationChannelGroups";
    private static final int NOTIFICATION_CHANNEL_GROUPS_CACHE_SIZE = 10;
    public static final long SET_LISTENER_ACCESS_GRANTED_IS_USER_AWARE = 302563478L;
    public static final java.lang.String SUPPORTED_NAS_ADJUSTMENT_KEYS_CHANGED = "android.app.action.SUPPORTED_NAS_ADJUSTMENT_KEYS_CHANGED";
    private static java.lang.String TAG;
    public static final int VISIBILITY_NO_OVERRIDE = -1000;
    private static boolean localLOGV;
    private static android.app.INotificationManager sService;
    private final java.util.Map<android.app.NotificationManager.CallNotificationEventListener, android.app.NotificationManager.CallNotificationEventCallbackStub> mCallNotificationEventCallbacks = null;
    private final java.time.InstantSource mClock = null;
    private final android.content.Context mContext = null;
    private final android.util.LruCache<android.app.NotificationManager.NotificationKey, android.app.NotificationManager.KnownNotification> mKnownNotifications = null;
    private volatile android.app.modes.IContextualModeManager mModesService;
    private final java.lang.Object mModesServiceLock = null;
    private final android.os.IpcDataCache<java.lang.String, java.util.Map<java.lang.String, android.app.NotificationChannelGroup>> mNotificationChannelGroupsCache = null;
    private final android.os.IpcDataCache.QueryHandler<java.lang.String, java.util.Map<java.lang.String, android.app.NotificationChannelGroup>> mNotificationChannelGroupsQueryHandler = null;
    private final android.os.IpcDataCache<android.app.NotificationManager.NotificationChannelQuery, java.util.List<android.app.NotificationChannel>> mNotificationChannelListCache = null;
    private final android.os.IpcDataCache.QueryHandler<android.app.NotificationManager.NotificationChannelQuery, java.util.List<android.app.NotificationChannel>> mNotificationChannelListQueryHandler = null;
    private final java.lang.Object mThrottleLock = null;
    private final android.app.NotificationManager.RateLimiter mUnnecessaryCancelRateLimiter = null;
    private final android.app.NotificationManager.RateLimiter mUpdateRateLimiter = null;
    public NotificationManager(android.content.Context p0) {}
    public NotificationManager(android.content.Context p0, java.time.InstantSource p1) {}
    private static void checkRequired(java.lang.String p0, java.lang.Object p1) {}
    private boolean discardCancel(android.os.UserHandle p0, java.lang.String p1, java.lang.String p2, int p3) { return false; }
    private boolean discardNotify(android.os.UserHandle p0, java.lang.String p1, java.lang.String p2, int p3, android.app.Notification p4) { return false; }
    private void fixLegacySmallIcon(android.app.Notification p0, java.lang.String p1) {}
    private android.app.Notification fixNotification(android.app.Notification p0) { return null; }
    public static android.app.NotificationManager from(android.content.Context p0) { return null; }
    private static android.app.NotificationChannel getChannelFromList(java.lang.String p0, java.util.List<android.app.NotificationChannel> p1) { return null; }
    private static android.app.NotificationChannel getConversationChannelFromList(java.lang.String p0, java.lang.String p1, java.util.List<android.app.NotificationChannel> p2) { return null; }
    private android.app.modes.IContextualModeManager getModesService() { return null; }
    public static android.app.INotificationManager getService() { return null; }
    public static void invalidateNotificationChannelCache() {}
    public static void invalidateNotificationChannelGroupCache() {}
    public static int zenModeFromInterruptionFilter(int p0, int p1) { return 0; }
    public static int zenModeToInterruptionFilter(int p0) { return 0; }
    public java.lang.String addAutomaticZenRule(android.app.AutomaticZenRule p0) { return null; }
    public java.lang.String addAutomaticZenRule(android.app.AutomaticZenRule p0, boolean p1) { return null; }
    public android.app.NotificationRule addNotificationRule(android.app.NotificationRule p0, int p1) { return null; }
    public void allowAssistantAdjustment(java.lang.String p0) {}
    public boolean areAutomaticZenRulesUserManaged() { return false; }
    @java.lang.Deprecated
    public boolean areBubblesAllowed() { return false; }
    public boolean areBubblesEnabled() { return false; }
    public boolean areNotificationsEnabled() { return false; }
    public boolean areNotificationsPaused() { return false; }
    public boolean canNotifyAsPackage(java.lang.String p0) { return false; }
    public boolean canPostPromotedNotifications() { return false; }
    public boolean canUseFullScreenIntent() { return false; }
    public void cancel(int p0) {}
    public void cancel(java.lang.String p0, int p1) {}
    public void cancelAll() {}
    public void cancelAsPackage(java.lang.String p0, java.lang.String p1, int p2) {}
    public void cancelAsUser(java.lang.String p0, int p1, android.os.UserHandle p2) {}
    public void cleanUpCallersAfter(long p0) {}
    public void createNotificationChannel(android.app.NotificationChannel p0) {}
    public void createNotificationChannelGroup(android.app.NotificationChannelGroup p0) {}
    public void createNotificationChannelGroups(java.util.List<android.app.NotificationChannelGroup> p0) {}
    public void createNotificationChannels(java.util.List<android.app.NotificationChannel> p0) {}
    public void deleteNotificationChannel(java.lang.String p0) {}
    public void deleteNotificationChannelGroup(java.lang.String p0) {}
    public void disallowAssistantAdjustment(java.lang.String p0) {}
    public android.service.notification.StatusBarNotification[] getActiveNotifications() { return null; }
    @android.annotation.SystemApi
    public java.util.List<java.lang.String> getAllowedAssistantAdjustments() { return null; }
    @android.annotation.SystemApi
    public android.content.ComponentName getAllowedNotificationAssistant() { return null; }
    public android.app.AutomaticZenRule getAutomaticZenRule(java.lang.String p0) { return null; }
    public int getAutomaticZenRuleState(java.lang.String p0) { return 0; }
    public java.util.Map<java.lang.String, android.app.AutomaticZenRule> getAutomaticZenRules() { return null; }
    public int getBubblePreference() { return 0; }
    public android.app.NotificationManager.Policy getConsolidatedNotificationPolicy() { return null; }
    public final int getCurrentInterruptionFilter() { return 0; }
    public android.service.notification.ZenPolicy getDefaultZenPolicy() { return null; }
    public android.content.ComponentName getEffectsSuppressor() { return null; }
    public java.util.List<java.lang.String> getEnabledNotificationListenerPackages() { return null; }
    @android.annotation.SystemApi
    public java.util.List<android.content.ComponentName> getEnabledNotificationListeners() { return null; }
    public java.util.List<android.content.ComponentName> getEnabledNotificationListeners(int p0) { return null; }
    public java.util.List<java.lang.String> getEnabledZenPackages() { return null; }
    public int getImportance() { return 0; }
    public android.app.NotificationChannel getNotificationChannel(java.lang.String p0) { return null; }
    public android.app.NotificationChannel getNotificationChannel(java.lang.String p0, java.lang.String p1) { return null; }
    public android.app.NotificationChannelGroup getNotificationChannelGroup(java.lang.String p0) { return null; }
    public java.util.List<android.app.NotificationChannelGroup> getNotificationChannelGroups() { return null; }
    public java.util.List<android.app.NotificationChannel> getNotificationChannels() { return null; }
    public java.lang.String getNotificationDelegate() { return null; }
    public android.app.NotificationManager.Policy getNotificationPolicy() { return null; }
    public java.util.List<android.app.NotificationRule> getNotificationRules() { return null; }
    public int getRuleInstanceCount(android.content.ComponentName p0) { return 0; }
    public java.util.Set<java.lang.String> getUnsupportedAdjustmentTypes() { return null; }
    public int getZenMode() { return 0; }
    public android.service.notification.ZenModeConfig getZenModeConfig() { return null; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public boolean hasEnabledNotificationListener(java.lang.String p0, android.os.UserHandle p1) { return false; }
    @android.annotation.SystemApi
    public boolean isNotificationAssistantAccessGranted(android.content.ComponentName p0) { return false; }
    public boolean isNotificationListenerAccessGranted(android.content.ComponentName p0) { return false; }
    public boolean isNotificationPolicyAccessGranted() { return false; }
    public boolean isNotificationPolicyAccessGrantedForPackage(java.lang.String p0) { return false; }
    public void logHsuNotificationPostStatus(android.service.notification.StatusBarNotification p0, int p1) {}
    public boolean matchesCallFilter(android.net.Uri p0) { return false; }
    public boolean matchesCallFilter(android.os.Bundle p0) { return false; }
    public void notify(int p0, android.app.Notification p1) {}
    public void notify(java.lang.String p0, int p1, android.app.Notification p2) {}
    public void notifyAsPackage(java.lang.String p0, java.lang.String p1, int p2, android.app.Notification p3) {}
    public void notifyAsUser(java.lang.String p0, int p1, android.app.Notification p2, android.os.UserHandle p3) {}
    @android.annotation.SystemApi
    public void registerCallNotificationEventListener(java.lang.String p0, android.os.UserHandle p1, java.util.concurrent.Executor p2, android.app.NotificationManager.CallNotificationEventListener p3) {}
    public boolean removeAutomaticZenRule(java.lang.String p0) { return false; }
    public boolean removeAutomaticZenRule(java.lang.String p0, boolean p1) { return false; }
    public boolean removeAutomaticZenRules(java.lang.String p0) { return false; }
    public boolean removeAutomaticZenRules(java.lang.String p0, boolean p1) { return false; }
    public boolean removeNotificationRule(int p0) { return false; }
    public void requestSystemAdjustments(java.util.List<android.service.notification.Adjustment> p0) {}
    protected android.app.INotificationManager service() { return null; }
    public void setAssistantAdjustmentKeyTypeState(int p0, boolean p1) {}
    public void setAssistantClassificationTypeState(int p0, boolean p1) {}
    public void setAutomaticZenRuleState(java.lang.String p0, android.service.notification.Condition p1) {}
    public void setCanPostPromotedNotifications(java.lang.String p0, int p1, boolean p2) {}
    public void setChannelCachesToTestMode() {}
    public final void setInterruptionFilter(int p0) {}
    public final void setInterruptionFilter(int p0, boolean p1) {}
    public void setManualZenRuleDeviceEffects(android.service.notification.ZenDeviceEffects p0) {}
    @android.annotation.SystemApi
    public void setNotificationAssistantAccessGranted(android.content.ComponentName p0, boolean p1) {}
    public void setNotificationDelegate(java.lang.String p0) {}
    public void setNotificationListenerAccessGranted(android.content.ComponentName p0, boolean p1) {}
    @android.annotation.SystemApi
    public void setNotificationListenerAccessGranted(android.content.ComponentName p0, boolean p1, boolean p2) {}
    public void setNotificationListenerAccessGrantedForUser(android.content.ComponentName p0, int p1, boolean p2) {}
    public void setNotificationPolicy(android.app.NotificationManager.Policy p0) {}
    public void setNotificationPolicy(android.app.NotificationManager.Policy p0, boolean p1) {}
    @android.annotation.SystemApi
    public void setNotificationPolicyAccessGranted(java.lang.String p0, boolean p1) {}
    public void setToastRateLimitingEnabled(boolean p0) {}
    public void setZenMode(int p0, android.net.Uri p1, java.lang.String p2) {}
    public void setZenMode(int p0, android.net.Uri p1, java.lang.String p2, boolean p3) {}
    public boolean shouldHideSilentStatusBarIcons() { return false; }
    public void silenceNotificationSound() {}
    @android.annotation.SystemApi
    public void unregisterCallNotificationEventListener(android.app.NotificationManager.CallNotificationEventListener p0) {}
    public boolean updateAutomaticZenRule(java.lang.String p0, android.app.AutomaticZenRule p1) { return false; }
    public boolean updateAutomaticZenRule(java.lang.String p0, android.app.AutomaticZenRule p1, boolean p2) { return false; }
    public void updateNotificationChannel(java.lang.String p0, int p1, android.app.NotificationChannel p2) {}
    public android.app.NotificationRule updateNotificationRule(android.app.NotificationRule p0) { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AutomaticZenRuleStatus {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BubblePreference {
    }

    private static class CallNotificationEventCallbackStub extends android.app.ICallNotificationEventCallback.Stub {
        final java.util.concurrent.Executor mExecutor = null;
        final android.app.NotificationManager.CallNotificationEventListener mListener = null;
        final java.lang.String mPackageName = null;
        final android.os.UserHandle mUserHandle = null;
        CallNotificationEventCallbackStub(java.lang.String p0, android.os.UserHandle p1, java.util.concurrent.Executor p2, android.app.NotificationManager.CallNotificationEventListener p3) { super(); }
        public void onCallNotificationPosted(java.lang.String p0, android.os.UserHandle p1) {}
        public void onCallNotificationRemoved(java.lang.String p0, android.os.UserHandle p1) {}
    }

    @android.annotation.SystemApi
    public static interface CallNotificationEventListener {
        public void onCallNotificationPosted(java.lang.String p0, android.os.UserHandle p1);
        public void onCallNotificationRemoved(java.lang.String p0, android.os.UserHandle p1);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Importance {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface InterruptionFilter {
    }

    private static final class KnownNotification {
        private final int knownStatus = 0;
        private final java.util.OptionalInt progressState = null;
        private KnownNotification(int p0, java.util.OptionalInt p1) {}
        public final boolean equals(java.lang.Object p0) { return false; }
        public final int hashCode() { return 0; }
        public int knownStatus() { return 0; }
        public java.util.OptionalInt progressState() { return null; }
        public final java.lang.String toString() { return null; }
    }

    private static final class NotificationChannelQuery {
        private final java.lang.String callingPkg = null;
        private final java.lang.String targetPkg = null;
        private final int userId = 0;
        private NotificationChannelQuery(java.lang.String p0, java.lang.String p1, int p2) {}
        public java.lang.String callingPkg() { return null; }
        public final boolean equals(java.lang.Object p0) { return false; }
        public final int hashCode() { return 0; }
        public java.lang.String targetPkg() { return null; }
        public final java.lang.String toString() { return null; }
        public int userId() { return 0; }
    }

    private static final class NotificationKey {
        private final int id = 0;
        private final java.lang.String pkg = null;
        private final java.lang.String tag = null;
        private final android.os.UserHandle user = null;
        private NotificationKey(android.os.UserHandle p0, java.lang.String p1, java.lang.String p2, int p3) {}
        public final boolean equals(java.lang.Object p0) { return false; }
        public final int hashCode() { return 0; }
        public int id() { return 0; }
        public java.lang.String pkg() { return null; }
        public java.lang.String tag() { return null; }
        public final java.lang.String toString() { return null; }
        public android.os.UserHandle user() { return null; }
    }

    public static class Policy implements android.os.Parcelable {
        public static final int ALLOWED_INTERRUPTION_TYPE_UNSET = -1;
        public static final int[] ALL_PRIORITY_CATEGORIES = null;
        public static final int ALL_PRIORITY_CATEGORIES_MASK = Integer.valueOf(0);
        private static final int[] ALL_SUPPRESSED_EFFECTS = null;
        public static final int CONVERSATION_SENDERS_ANYONE = 1;
        public static final int CONVERSATION_SENDERS_IMPORTANT = 2;
        public static final int CONVERSATION_SENDERS_NONE = 3;
        public static final int CONVERSATION_SENDERS_UNSET = -1;
        public static final android.os.Parcelable.Creator<android.app.NotificationManager.Policy> CREATOR = null;
        public static final int PRIORITY_CATEGORY_ALARMS = 32;
        public static final int PRIORITY_CATEGORY_CALLS = 8;
        public static final int PRIORITY_CATEGORY_CONVERSATIONS = 256;
        public static final int PRIORITY_CATEGORY_EVENTS = 2;
        public static final int PRIORITY_CATEGORY_MEDIA = 64;
        public static final int PRIORITY_CATEGORY_MESSAGES = 4;
        public static final int PRIORITY_CATEGORY_REMINDERS = 1;
        public static final int PRIORITY_CATEGORY_REPEAT_CALLERS = 16;
        public static final int PRIORITY_CATEGORY_SYSTEM = 128;
        public static final int PRIORITY_SENDERS_ANY = 0;
        public static final int PRIORITY_SENDERS_CONTACTS = 1;
        public static final int PRIORITY_SENDERS_STARRED = 2;
        public static final int STATE_HAS_PRIORITY_CHANNELS = 1;
        public static final int STATE_PRIORITY_CHANNELS_BLOCKED = 2;
        public static final int STATE_UNSET = -1;
        public static final int SUPPRESSED_EFFECTS_UNSET = -1;
        public static final int SUPPRESSED_EFFECT_AMBIENT = 128;
        public static final int SUPPRESSED_EFFECT_BADGE = 64;
        public static final int SUPPRESSED_EFFECT_FULL_SCREEN_INTENT = 4;
        public static final int SUPPRESSED_EFFECT_LIGHTS = 8;
        public static final int SUPPRESSED_EFFECT_NOTIFICATION_LIST = 256;
        public static final int SUPPRESSED_EFFECT_PEEK = 16;
        @java.lang.Deprecated
        public static final int SUPPRESSED_EFFECT_SCREEN_OFF = 1;
        @java.lang.Deprecated
        public static final int SUPPRESSED_EFFECT_SCREEN_ON = 2;
        public static final int SUPPRESSED_EFFECT_STATUS_BAR = 32;
        public final int allowSoundForPriorityCategory = 0;
        public final int allowVibrationForPriorityCategory = 0;
        public final int priorityCallSenders = 0;
        public final int priorityCategories = 0;
        public final int priorityConversationSenders = 0;
        public final int priorityMessageSenders = 0;
        public final int state = 0;
        public final int suppressedVisualEffects = 0;
        public Policy(int p0, int p1, int p2) {}
        public Policy(int p0, int p1, int p2, int p3) {}
        public Policy(int p0, int p1, int p2, int p3, int p4) {}
        public Policy(int p0, int p1, int p2, int p3, int p4, int p5) {}
        public Policy(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7) {}
        public static boolean areAllVisualEffectsSuppressed(int p0) { return false; }
        private static void bitwiseToProtoEnum(android.util.proto.ProtoOutputStream p0, long p1, int p2) {}
        private static int buildAllCategoriesMask() { return 0; }
        public static java.lang.String conversationSendersToString(int p0) { return null; }
        private static java.lang.String effectToString(int p0) { return null; }
        public static int getAllSuppressedVisualEffects() { return 0; }
        public static int policyState(boolean p0, boolean p1) { return 0; }
        public static java.lang.String priorityCategoriesToString(int p0) { return null; }
        private static java.lang.String priorityCategoryToString(int p0) { return null; }
        public static java.lang.String prioritySendersToString(int p0) { return null; }
        public static java.lang.String suppressedEffectsToString(int p0) { return null; }
        private boolean suppressedVisualEffectsEqual(int p0, int p1) { return false; }
        private static int toggleEffects(int p0, int[] p1, boolean p2) { return 0; }
        private void validate() {}
        public boolean allowAlarms() { return false; }
        public boolean allowCalls() { return false; }
        public int allowCallsFrom() { return 0; }
        public boolean allowConversations() { return false; }
        public int allowConversationsFrom() { return 0; }
        public boolean allowEvents() { return false; }
        public boolean allowMedia() { return false; }
        public boolean allowMessages() { return false; }
        public int allowMessagesFrom() { return 0; }
        public boolean allowPriorityChannels() { return false; }
        public boolean allowReminders() { return false; }
        public boolean allowRepeatCallers() { return false; }
        public boolean allowSoundFor(int p0) { return false; }
        public boolean allowSystem() { return false; }
        public boolean allowVibrationFor(int p0) { return false; }
        public android.app.NotificationManager.Policy copy() { return null; }
        public int describeContents() { return 0; }
        public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public boolean hasPriorityChannels() { return false; }
        public int hashCode() { return 0; }
        public boolean showAmbient() { return false; }
        public boolean showBadges() { return false; }
        public boolean showFullScreenIntents() { return false; }
        public boolean showInNotificationList() { return false; }
        public boolean showLights() { return false; }
        public boolean showPeeking() { return false; }
        public boolean showStatusBarIcons() { return false; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface ConversationSenders {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface PrioritySenders {
        }
    }

    private class RateLimiter {
        private static final java.time.Duration RATE_LIMITER_LOG_INTERVAL = null;
        private final android.service.notification.RateEstimator mInputRateEstimator = null;
        private final float mLimitRate = 0.0f;
        private java.time.Instant mLogSilencedUntil;
        private final java.lang.String mName = null;
        private final android.service.notification.RateEstimator mOutputRateEstimator = null;
        private RateLimiter(android.app.NotificationManager p0, java.lang.String p1, float p2) {}
        boolean eventExceedsRate() { return false; }
        void recordAccepted() {}
        void recordRejected(android.app.NotificationManager.NotificationKey p0) {}
    }
}
