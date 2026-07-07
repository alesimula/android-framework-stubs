package android.service.notification;

public final class ZenPolicy implements android.os.Parcelable {
    public static final int ALLOWED_INTERRUPTION_TYPE_ALL = 0;
    public static final int ALLOWED_INTERRUPTION_TYPE_SOUND_ONLY = 1;
    public static final int ALLOWED_INTERRUPTION_TYPE_UNSET = -1;
    public static final int ALLOWED_INTERRUPTION_TYPE_VIBRATION_ONLY = 2;
    public static final int CHANNEL_POLICY_NONE = 2;
    public static final int CHANNEL_POLICY_PRIORITY = 1;
    public static final int CHANNEL_POLICY_UNSET = 0;
    public static final int CONVERSATION_SENDERS_ANYONE = 1;
    public static final int CONVERSATION_SENDERS_IMPORTANT = 2;
    public static final int CONVERSATION_SENDERS_NONE = 3;
    public static final int CONVERSATION_SENDERS_UNSET = 0;
    public static final android.os.Parcelable.Creator<android.service.notification.ZenPolicy> CREATOR = null;
    public static final int FIELD_ALLOW_CHANNELS = 8;
    public static final int FIELD_CALLS = 2;
    public static final int FIELD_CONVERSATIONS = 4;
    public static final int FIELD_INTERRUPTION_TYPE_ALARMS = 131072;
    public static final int FIELD_MESSAGES = 1;
    public static final int FIELD_PRIORITY_CATEGORY_ALARMS = 128;
    public static final int FIELD_PRIORITY_CATEGORY_EVENTS = 32;
    public static final int FIELD_PRIORITY_CATEGORY_MEDIA = 256;
    public static final int FIELD_PRIORITY_CATEGORY_REMINDERS = 16;
    public static final int FIELD_PRIORITY_CATEGORY_REPEAT_CALLERS = 64;
    public static final int FIELD_PRIORITY_CATEGORY_SYSTEM = 512;
    public static final int FIELD_VISUAL_EFFECT_AMBIENT = 32768;
    public static final int FIELD_VISUAL_EFFECT_BADGE = 16384;
    public static final int FIELD_VISUAL_EFFECT_FULL_SCREEN_INTENT = 1024;
    public static final int FIELD_VISUAL_EFFECT_LIGHTS = 2048;
    public static final int FIELD_VISUAL_EFFECT_NOTIFICATION_LIST = 65536;
    public static final int FIELD_VISUAL_EFFECT_PEEK = 4096;
    public static final int FIELD_VISUAL_EFFECT_STATUS_BAR = 8192;
    public static final int NUM_PRIORITY_CATEGORIES = 9;
    public static final int NUM_VISUAL_EFFECTS = 7;
    public static final int PEOPLE_TYPE_ANYONE = 1;
    public static final int PEOPLE_TYPE_CONTACTS = 2;
    public static final int PEOPLE_TYPE_NONE = 4;
    public static final int PEOPLE_TYPE_STARRED = 3;
    public static final int PEOPLE_TYPE_UNSET = 0;
    public static final int PRIORITY_CATEGORY_ALARMS = 5;
    public static final int PRIORITY_CATEGORY_CALLS = 3;
    public static final int PRIORITY_CATEGORY_CONVERSATIONS = 8;
    public static final int PRIORITY_CATEGORY_EVENTS = 1;
    public static final int PRIORITY_CATEGORY_MEDIA = 6;
    public static final int PRIORITY_CATEGORY_MESSAGES = 2;
    public static final int PRIORITY_CATEGORY_REMINDERS = 0;
    public static final int PRIORITY_CATEGORY_REPEAT_CALLERS = 4;
    public static final int PRIORITY_CATEGORY_SYSTEM = 7;
    public static final int STATE_ALLOW = 1;
    public static final int STATE_DISALLOW = 2;
    public static final int STATE_UNSET = 0;
    private static final java.lang.String TAG = "ZenPolicy";
    public static final int VISUAL_EFFECT_AMBIENT = 5;
    public static final int VISUAL_EFFECT_BADGE = 4;
    public static final int VISUAL_EFFECT_FULL_SCREEN_INTENT = 0;
    public static final int VISUAL_EFFECT_LIGHTS = 1;
    public static final int VISUAL_EFFECT_NOTIFICATION_LIST = 6;
    public static final int VISUAL_EFFECT_PEEK = 2;
    public static final int VISUAL_EFFECT_STATUS_BAR = 3;
    private int mAllowChannels;
    private int mConversationSenders;
    private java.util.List<java.lang.Integer> mInterruptionTypes;
    private int mPriorityCalls;
    private java.util.List<java.lang.Integer> mPriorityCategories;
    private int mPriorityMessages;
    private java.util.List<java.lang.Integer> mVisualEffects;
    public ZenPolicy() {}
    public ZenPolicy(java.util.List<java.lang.Integer> p0, java.util.List<java.lang.Integer> p1, java.util.List<java.lang.Integer> p2, int p3, int p4, int p5, int p6) {}
    public static java.lang.String channelTypeToString(int p0) { return null; }
    public static java.lang.String conversationTypeToString(int p0) { return null; }
    public static java.lang.String fieldsToString(int p0) { return null; }
    public static android.service.notification.ZenPolicy getBasePolicyInterruptionFilterAlarms() { return null; }
    public static android.service.notification.ZenPolicy getBasePolicyInterruptionFilterNone() { return null; }
    private int getZenPolicyPriorityCategoryState(int p0) { return 0; }
    private int getZenPolicyVisualEffectState(int p0) { return 0; }
    private static java.lang.String indexToCategory(int p0) { return null; }
    private java.lang.String indexToVisualEffect(int p0) { return null; }
    public static java.lang.String interruptionTypeToString(int p0) { return null; }
    private java.lang.String interruptionTypesToString() { return null; }
    public static java.lang.String peopleTypeToString(int p0) { return null; }
    private java.lang.String priorityCategoriesToString() { return null; }
    public static boolean stateToBoolean(int p0, boolean p1) { return false; }
    private static java.lang.String stateToString(int p0) { return null; }
    private static java.util.ArrayList<java.lang.Integer> trimList(java.util.ArrayList<java.lang.Integer> p0, int p1) { return null; }
    private void validate() {}
    private java.lang.String visualEffectsToString() { return null; }
    public void apply(android.service.notification.ZenPolicy p0) {}
    public android.service.notification.ZenPolicy copy() { return null; }
    public int describeContents() { return 0; }
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int getAllowedChannels() { return 0; }
    public int getInterruptionTypeAlarms() { return 0; }
    public int getInterruptionTypeForPriorityCategory(int p0) { return 0; }
    public int getPriorityCallSenders() { return 0; }
    public int getPriorityCategoryAlarms() { return 0; }
    public int getPriorityCategoryCalls() { return 0; }
    public int getPriorityCategoryConversations() { return 0; }
    public int getPriorityCategoryEvents() { return 0; }
    public int getPriorityCategoryMedia() { return 0; }
    public int getPriorityCategoryMessages() { return 0; }
    public int getPriorityCategoryReminders() { return 0; }
    public int getPriorityCategoryRepeatCallers() { return 0; }
    public int getPriorityCategorySystem() { return 0; }
    public int getPriorityChannelsAllowed() { return 0; }
    public int getPriorityConversationSenders() { return 0; }
    public int getPriorityMessageSenders() { return 0; }
    public int getVisualEffectAmbient() { return 0; }
    public int getVisualEffectBadge() { return 0; }
    public int getVisualEffectFullScreenIntent() { return 0; }
    public int getVisualEffectLights() { return 0; }
    public int getVisualEffectNotificationList() { return 0; }
    public int getVisualEffectPeek() { return 0; }
    public int getVisualEffectStatusBar() { return 0; }
    public int hashCode() { return 0; }
    public boolean isCategoryAllowed(int p0, boolean p1) { return false; }
    public boolean isSoundAllowed(int p0, boolean p1) { return false; }
    public boolean isVibrationAllowed(int p0, boolean p1) { return false; }
    public boolean isVisualEffectAllowed(int p0, boolean p1) { return false; }
    public android.service.notification.ZenPolicy overwrittenWith(android.service.notification.ZenPolicy p0) { return null; }
    public boolean shouldHideAllVisualEffects() { return false; }
    public boolean shouldShowAllVisualEffects() { return false; }
    public byte[] toProto() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.service.notification.ZenPolicy mZenPolicy;
        public Builder() {}
        public Builder(android.service.notification.ZenPolicy p0) {}
        private void setBreakthroughForPriorityCategory(boolean p0, boolean p1, int p2) {}
        private android.service.notification.ZenPolicy.Builder unsetInterruptionType(int p0) { return null; }
        public android.service.notification.ZenPolicy.Builder allowAlarms(boolean p0) { return null; }
        public android.service.notification.ZenPolicy.Builder allowAlarms(boolean p0, boolean p1) { return null; }
        public android.service.notification.ZenPolicy.Builder allowAllSounds() { return null; }
        public android.service.notification.ZenPolicy.Builder allowCalls(int p0) { return null; }
        public android.service.notification.ZenPolicy.Builder allowCategory(int p0, boolean p1) { return null; }
        public android.service.notification.ZenPolicy.Builder allowChannels(int p0) { return null; }
        public android.service.notification.ZenPolicy.Builder allowConversations(int p0) { return null; }
        public android.service.notification.ZenPolicy.Builder allowEvents(boolean p0) { return null; }
        public android.service.notification.ZenPolicy.Builder allowMedia(boolean p0) { return null; }
        public android.service.notification.ZenPolicy.Builder allowMessages(int p0) { return null; }
        public android.service.notification.ZenPolicy.Builder allowPriorityChannels(boolean p0) { return null; }
        public android.service.notification.ZenPolicy.Builder allowReminders(boolean p0) { return null; }
        public android.service.notification.ZenPolicy.Builder allowRepeatCallers(boolean p0) { return null; }
        public android.service.notification.ZenPolicy.Builder allowSystem(boolean p0) { return null; }
        public android.service.notification.ZenPolicy build() { return null; }
        public android.service.notification.ZenPolicy.Builder disallowAllSounds() { return null; }
        public android.service.notification.ZenPolicy.Builder hideAllVisualEffects() { return null; }
        public android.service.notification.ZenPolicy.Builder showAllVisualEffects() { return null; }
        public android.service.notification.ZenPolicy.Builder showBadges(boolean p0) { return null; }
        public android.service.notification.ZenPolicy.Builder showFullScreenIntent(boolean p0) { return null; }
        public android.service.notification.ZenPolicy.Builder showInAmbientDisplay(boolean p0) { return null; }
        public android.service.notification.ZenPolicy.Builder showInNotificationList(boolean p0) { return null; }
        public android.service.notification.ZenPolicy.Builder showLights(boolean p0) { return null; }
        public android.service.notification.ZenPolicy.Builder showPeeking(boolean p0) { return null; }
        public android.service.notification.ZenPolicy.Builder showStatusBarIcons(boolean p0) { return null; }
        public android.service.notification.ZenPolicy.Builder showVisualEffect(int p0, boolean p1) { return null; }
        public android.service.notification.ZenPolicy.Builder unsetAllInterruptionTypes() { return null; }
        public android.service.notification.ZenPolicy.Builder unsetPriorityCategory(int p0) { return null; }
        public android.service.notification.ZenPolicy.Builder unsetVisualEffect(int p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface ChannelType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ConversationSenders {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface InterruptionType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ModifiableField {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PeopleType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PriorityCategory {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface State {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VisualEffect {
    }
}
