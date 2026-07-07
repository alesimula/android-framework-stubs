package android.app;

@android.annotation.SystemApi
public final class NotificationRule implements android.os.Parcelable {
    private static final java.lang.String ACTION_TAG = "action";
    private static final java.lang.String CAN_BE_DISABLED_ATTR = "canBeDisabled";
    private static final java.lang.String CATEGORY_TAG = "category";
    private static final java.lang.String CONDITIONS_TAG = "conditions";
    private static final java.lang.String CONDITION_TAG = "condition";
    private static final java.lang.String CONDITION_TYPE_ATTR = "conditionType";
    private static final java.lang.String CONTACTS_TAG = "contacts";
    private static final java.lang.String CONTACT_LEVEL_ATTR = "contactLevel";
    private static final java.lang.String CONTACT_TAG = "contact";
    private static final java.lang.String CONVERSATION_LEVEL_ATTR = "conversationLevel";
    private static final java.lang.String CREATION_TIME_TAG = "creationTime";
    public static final android.os.Parcelable.Creator<android.app.NotificationRule> CREATOR = null;
    private static final java.lang.String DAY_TAG = "day";
    private static final java.lang.String DELIMITER = ",";
    private static final java.lang.String DYNAMIC_BUNDLE_EMOJI_ICON_ATTR = "dynamicBundleEmojiIcon";
    private static final java.lang.String DYNAMIC_BUNDLE_NAME_ATTR = "dynamicBundleName";
    private static final java.lang.String EDIT_INTENT_ACTION_ATTR = "editIntentAction";
    private static final java.lang.String ENABLED_ATTR = "enabled";
    private static final java.lang.String END_HOUR_ATTR = "endHour";
    private static final java.lang.String END_MINUTE_ATTR = "endMinute";
    private static final java.lang.String END_TIME_ATTR = "endTime";
    private static final java.lang.String EXCLUDED_PACKAGES_TAG = "excludedPackages";
    private static final java.lang.String EXCLUDED_WITHOUT_UIDS_TAG = "excludedWithoutUids";
    private static final java.lang.String FILTERS_TAG = "filters";
    private static final java.lang.String FILTER_TAG = "filter";
    private static final java.lang.String FLAGS_TAG = "flags";
    private static final java.lang.String ID_ATTR = "id";
    private static final java.lang.String INCLUDED_PACKAGES_TAG = "includedPackages";
    private static final java.lang.String INCLUDED_WITHOUT_UIDS_TAG = "includedWithoutUids";
    private static final java.lang.String KEYWORD_TAG = "keyword";
    private static final java.lang.String LATITUDE_ATTR = "latitude";
    private static final java.lang.String LIGHT_COLOR_ATTR = "lightColor";
    private static final java.lang.String LOCATION_TAG = "location";
    private static final java.lang.String LONGITUDE_ATTR = "longitude";
    private static final java.lang.String MESSAGE_TYPE_TAG = "messageType";
    private static final java.lang.String MODE_BREAKTHROUGH_ATTR = "modeBreakthroughs";
    private static final java.lang.String ONE_TIME_TAG = "onetime";
    private static final java.lang.String PKG_ATTR = "pkg";
    private static final java.lang.String PRIMARY_ACTION_ATTR = "primaryAction";
    private static final java.lang.String RADIUS_ATTR = "radius";
    public static final int RESERVED_ID_IMPORTANT_NOTIFICATIONS = 204;
    public static final int RESERVED_ID_PRIORITY_CONVERSATIONS = 202;
    public static final int RESERVED_ID_PROMOTED = 201;
    public static final int RESERVED_ID_STATIC_BUNDLES = 203;
    public static final long RESTORED_DATA_GRACE_PERIOD_MS = Long.valueOf(0L);
    private static final java.lang.String RESTORED_UNKNOWN_USERS_TAG = "restoredUnknownUsers";
    public static final java.lang.String RULE_TAG = "rule";
    private static final java.lang.String SHORTCUT_ID_TAG = "shortcutId";
    private static final java.lang.String SOUND_ATTR = "sound";
    private static final java.lang.String START_HOUR_ATTR = "startHour";
    private static final java.lang.String START_MINUTE_ATTR = "startMinute";
    private static final java.lang.String START_TIME_ATTR = "startTime";
    private static final java.lang.String STATIC_BUNDLE_TYPE_TAG = "staticBundleType";
    private static final java.lang.String STORE_TAG = "storeCategory";
    private static final java.lang.String TAG = "NotificationRule";
    private static final java.lang.String TIME_TAG = "time";
    public static final java.lang.String USER_ATTR = "user";
    public static final int USER_RULE_ID_END = 200;
    public static final int USER_RULE_ID_START = 100;
    private static final java.lang.String USER_TAG = "user";
    private static final java.lang.String USER_TYPE_ATTR = "userType";
    private static final java.lang.String VALUE_ATTR = "value";
    private final android.app.NotificationRule.Action mAction = null;
    private boolean mCanBeDisabled;
    private final java.util.List<android.app.NotificationRule.Condition> mConditions = null;
    private final java.lang.String mEditIntentAction = null;
    private boolean mEnabled;
    private final java.util.List<android.app.NotificationRule.Filter> mFilters = null;
    private int mId;
    private NotificationRule(android.os.Parcel p0) {}
    private NotificationRule(java.util.List<android.app.NotificationRule.Filter> p0, boolean p1, int p2, java.lang.String p3, android.app.NotificationRule.Action p4, boolean p5, java.util.List<android.app.NotificationRule.Condition> p6) {}
    public static boolean isSystemRule(int p0) { return false; }
    public static android.app.NotificationRule readXml(com.android.modules.utils.TypedXmlPullParser p0, boolean p1, int p2, long p3, android.content.Context p4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    private static int userIdForType(int p0, int p1, android.os.UserManager p2) { return 0; }
    private static int userTypeForId(int p0, int p1, android.os.UserManager p2) { return 0; }
    public boolean canBeDisabled() { return false; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.app.NotificationRule.Action getAction() { return null; }
    public java.util.List<android.app.NotificationRule.Condition> getConditions() { return null; }
    public java.lang.String getEditIntentAction() { return null; }
    public java.util.List<android.app.NotificationRule.Filter> getFilters() { return null; }
    public int getId() { return 0; }
    public int hashCode() { return 0; }
    public boolean isEnabled() { return false; }
    public void setEnabled(boolean p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void writeXml(com.android.modules.utils.TypedXmlSerializer p0, boolean p1, int p2, android.content.Context p3) throws java.io.IOException {}

    public static final class Action implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.app.NotificationRule.Action> CREATOR = null;
        public static final int PRIMARY_ACTION_BLOCK = 5;
        public static final int PRIMARY_ACTION_BUNDLE = 4;
        public static final int PRIMARY_ACTION_HIGHLIGHT = 2;
        public static final int PRIMARY_ACTION_HIGHLIGHT_AND_ALERT = 1;
        public static final int PRIMARY_ACTION_LOW = 3;
        public static final int PRIMARY_ACTION_NONE = 0;
        private final java.lang.String mBundleName = null;
        private final java.lang.String mEmojiIcon = null;
        private int mLightColor;
        private final java.util.List<java.lang.String> mModeBreakthroughs = null;
        private int mPrimaryAction;
        private final android.net.Uri mSoundHapticOverride = null;
        public Action(int p0) {}
        private Action(int p0, android.net.Uri p1, int p2, java.util.List<java.lang.String> p3, java.lang.String p4, java.lang.String p5) {}
        private Action(android.os.Parcel p0) {}
        public static android.app.NotificationRule.Action readXml(com.android.modules.utils.TypedXmlPullParser p0, boolean p1, android.content.Context p2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String getDynamicBundleEmojiIcon() { return null; }
        public java.lang.String getDynamicBundleName() { return null; }
        public int getLightColorOverride() { return 0; }
        public java.util.List<java.lang.String> getModeBreakthroughIds() { return null; }
        public int getPrimaryAction() { return 0; }
        public android.net.Uri getSoundHapticOverride() { return null; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void writeXml(com.android.modules.utils.TypedXmlSerializer p0, boolean p1, android.content.Context p2) throws java.io.IOException {}

        public static final class Builder {
            private java.lang.String mBundleName;
            private java.lang.String mEmojiIcon;
            private int mLightColor;
            private final java.util.List<java.lang.String> mModeBreakthroughs = null;
            private int mPrimaryAction;
            private android.net.Uri mSoundHapticOverride;
            public Builder(int p0) {}
            public Builder(android.app.NotificationRule.Action p0) {}
            public android.app.NotificationRule.Action build() { return null; }
            public android.app.NotificationRule.Action.Builder setDynamicBundleEmojiIcon(java.lang.String p0) { return null; }
            public android.app.NotificationRule.Action.Builder setDynamicBundleName(java.lang.String p0) { return null; }
            public android.app.NotificationRule.Action.Builder setLightColorOverride(int p0) { return null; }
            public android.app.NotificationRule.Action.Builder setModeBreakthroughIds(java.util.List<java.lang.String> p0) { return null; }
            public android.app.NotificationRule.Action.Builder setSoundHapticOverride(android.net.Uri p0) { return null; }
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface PrimaryAction {
        }
    }

    public static final class Builder {
        private android.app.NotificationRule.Action mAction;
        private boolean mCanBeDisabled;
        private final java.util.List<android.app.NotificationRule.Condition> mConditions = null;
        private java.lang.String mEditIntentAction;
        private boolean mEnabled;
        private final java.util.List<android.app.NotificationRule.Filter> mFilters = null;
        private int mId;
        public Builder(int p0, android.app.NotificationRule.Action p1) {}
        public Builder(android.app.NotificationRule p0) {}
        public android.app.NotificationRule.Builder addCondition(android.app.NotificationRule.Condition p0) { return null; }
        public android.app.NotificationRule.Builder addFilter(android.app.NotificationRule.Filter p0) { return null; }
        public android.app.NotificationRule build() { return null; }
        public android.app.NotificationRule.Builder setAction(android.app.NotificationRule.Action p0) { return null; }
        public android.app.NotificationRule.Builder setCanBeDisabled(boolean p0) { return null; }
        public android.app.NotificationRule.Builder setConditions(java.util.List<android.app.NotificationRule.Condition> p0) { return null; }
        public android.app.NotificationRule.Builder setEditIntentAction(java.lang.String p0) { return null; }
        public android.app.NotificationRule.Builder setEnabled(boolean p0) { return null; }
        public android.app.NotificationRule.Builder setFilters(java.util.List<android.app.NotificationRule.Filter> p0) { return null; }
    }

    public static final class Condition implements android.os.Parcelable {
        public static final int CONDITION_TYPE_LOCATION = 1;
        public static final int CONDITION_TYPE_ONE_TIME = 3;
        public static final int CONDITION_TYPE_TIME = 2;
        public static final int CONDITION_TYPE_UNKNOWN = 0;
        public static final android.os.Parcelable.Creator<android.app.NotificationRule.Condition> CREATOR = null;
        private int mConditionType;
        private final java.util.List<java.lang.Integer> mDays = null;
        private int mEndHour;
        private int mEndMinute;
        private double mLatitude;
        private double mLongitude;
        private java.time.LocalDateTime mOneTimeEnd;
        private java.time.LocalDateTime mOneTimeStart;
        private float mRadiusMeters;
        private int mStartHour;
        private int mStartMinute;
        private Condition(double p0, double p1, float p2) {}
        private Condition(android.os.Parcel p0) {}
        private Condition(java.time.LocalDateTime p0, java.time.LocalDateTime p1) {}
        private Condition(java.util.List<java.lang.Integer> p0, int p1, int p2, int p3, int p4) {}
        public static android.app.NotificationRule.Condition createLocationCondition(double p0, double p1, float p2) { return null; }
        public static android.app.NotificationRule.Condition createOneTimeCondition(java.time.LocalDateTime p0, java.time.LocalDateTime p1) { return null; }
        public static android.app.NotificationRule.Condition createTimeCondition(java.util.List<java.lang.Integer> p0, int p1, int p2, int p3, int p4) { return null; }
        public static android.app.NotificationRule.Condition readXml(com.android.modules.utils.TypedXmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int getConditionType() { return 0; }
        public java.util.List<java.lang.Integer> getDays() { return null; }
        public int getEndHour() { return 0; }
        public int getEndMinute() { return 0; }
        public double getLatitude() { return 0.0; }
        public double getLongitude() { return 0.0; }
        public java.time.LocalDateTime getOneTimeEnd() { return null; }
        public java.time.LocalDateTime getOneTimeStart() { return null; }
        public float getRadiusMeters() { return 0.0f; }
        public int getStartHour() { return 0; }
        public int getStartMinute() { return 0; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void writeXml(com.android.modules.utils.TypedXmlSerializer p0) throws java.io.IOException {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface ConditionType {
        }
    }

    public static final class DynamicBundle implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.app.NotificationRule.DynamicBundle> CREATOR = null;
        private final java.lang.String mBundleName = null;
        private final java.lang.String mChannelId = null;
        private final java.lang.String mEmojiIcon = null;
        private DynamicBundle(android.os.Parcel p0) {}
        public DynamicBundle(java.lang.String p0, java.lang.String p1, java.lang.String p2) {}
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String getBundleName() { return null; }
        public java.lang.String getChannelId() { return null; }
        public java.lang.String getEmojiIcon() { return null; }
        public int hashCode() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static final class Filter implements android.os.Parcelable {
        public static final int APP_STORE_CATEGORY_ANY = 0;
        public static final int APP_STORE_CATEGORY_ENTERTAINMENT = 2;
        public static final int APP_STORE_CATEGORY_FINANCE = 5;
        public static final int APP_STORE_CATEGORY_FOOD_AND_DRINK = 4;
        public static final int APP_STORE_CATEGORY_GAMES = 8;
        public static final int APP_STORE_CATEGORY_MAPS_AND_NAV = 7;
        public static final int APP_STORE_CATEGORY_MUSIC_AND_AUDIO = 3;
        public static final int APP_STORE_CATEGORY_SHOPPING = 1;
        public static final int APP_STORE_CATEGORY_SPORTS = 6;
        public static final int CONTACT_LEVEL_ANY = 0;
        public static final int CONTACT_LEVEL_CONTACT = 1;
        public static final int CONTACT_LEVEL_STARRED = 2;
        public static final int CONVERSATION_LEVEL_ANY = 0;
        public static final int CONVERSATION_LEVEL_PRIORITY = 1;
        public static final android.os.Parcelable.Creator<android.app.NotificationRule.Filter> CREATOR = null;
        public static final int MESSAGE_TYPE_ANY = 0;
        public static final int MESSAGE_TYPE_DIRECT = 1;
        public static final int MESSAGE_TYPE_GROUP = 2;
        final java.util.List<java.lang.Integer> mAppStoreCategories = null;
        final java.util.List<java.lang.String> mCategories = null;
        int mContactLevel;
        final java.util.List<android.net.Uri> mContacts = null;
        int mConversationLevel;
        private long mCreationTime;
        final java.util.List<java.lang.Integer> mExcludedPackages = null;
        private final java.util.List<java.lang.String> mExcludedPackagesWithoutUids = null;
        int mFlags;
        final java.util.List<java.lang.Integer> mIncludedPackages = null;
        private final java.util.List<java.lang.String> mIncludedPackagesWithoutUids = null;
        final java.util.List<java.lang.String> mKeywords = null;
        int mMessageType;
        private final java.util.List<java.lang.Integer> mRestoredUnknownUsers = null;
        final java.util.List<android.app.NotificationRule.PerUserPackageIdentifier> mShortcutIds = null;
        final java.util.List<java.lang.Integer> mStaticBundleTypes = null;
        final java.util.List<android.os.UserHandle> mUsers = null;
        private Filter(android.os.Parcel p0) {}
        private Filter(java.util.List<java.lang.Integer> p0, java.util.List<java.lang.Integer> p1, int p2, int p3, java.util.List<android.net.Uri> p4, java.util.List<android.app.NotificationRule.PerUserPackageIdentifier> p5, java.util.List<java.lang.String> p6, java.util.List<android.os.UserHandle> p7, java.util.List<java.lang.String> p8, java.util.List<java.lang.Integer> p9, int p10, int p11, java.util.List<java.lang.Integer> p12, java.util.List<java.lang.String> p13, java.util.List<java.lang.String> p14, java.util.List<java.lang.Integer> p15, long p16) {}
        private long getCreationTime() { return 0L; }
        private java.util.List<java.lang.String> getExcludedPackagesWithoutUids() { return null; }
        private java.util.List<java.lang.String> getIncludedPackagesWithoutUids() { return null; }
        private java.util.List<java.lang.Integer> getRestoredUnknownUsers() { return null; }
        public static android.app.NotificationRule.Filter readXml(com.android.modules.utils.TypedXmlPullParser p0, boolean p1, int p2, long p3, android.content.Context p4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
        private static java.lang.String unrestoredPackageDescriptor(java.lang.String p0, int p1) { return null; }
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.util.List<java.lang.Integer> getAppStoreCategories() { return null; }
        public java.util.List<java.lang.String> getCategories() { return null; }
        public int getContactLevel() { return 0; }
        public java.util.List<android.net.Uri> getContacts() { return null; }
        public int getConversationLevel() { return 0; }
        public java.util.List<java.lang.Integer> getExcludedPackageUids() { return null; }
        public int getFlags() { return 0; }
        public java.util.List<java.lang.Integer> getIncludedPackageUids() { return null; }
        public java.util.List<java.lang.String> getKeywords() { return null; }
        public int getMessageType() { return 0; }
        public java.util.List<android.app.NotificationRule.PerUserPackageIdentifier> getShortcutIds() { return null; }
        public java.util.List<java.lang.Integer> getStaticBundleTypes() { return null; }
        public java.util.List<android.os.UserHandle> getUsers() { return null; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void writeXml(com.android.modules.utils.TypedXmlSerializer p0, boolean p1, int p2, android.content.Context p3) throws java.io.IOException {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface AppStoreCategory {
        }

        public static final class Builder {
            java.util.List<java.lang.Integer> mAppStoreCategories;
            final java.util.List<java.lang.String> mCategories = null;
            int mContactLevel;
            final java.util.List<android.net.Uri> mContacts = null;
            int mConversationLevel;
            private long mCreationTime;
            final java.util.List<java.lang.Integer> mExcludedPackages = null;
            private final java.util.List<java.lang.String> mExcludedPackagesWithoutUids = null;
            int mFlags;
            final java.util.List<java.lang.Integer> mIncludedPackages = null;
            private final java.util.List<java.lang.String> mIncludedPackagesWithoutUids = null;
            final java.util.List<java.lang.String> mKeywords = null;
            int mMessageType;
            private final java.util.List<java.lang.Integer> mRestoredUnknownUsers = null;
            final java.util.List<android.app.NotificationRule.PerUserPackageIdentifier> mShortcutIds = null;
            final java.util.List<java.lang.Integer> mStaticBundleTypes = null;
            final java.util.List<android.os.UserHandle> mUsers = null;
            public Builder() {}
            public Builder(android.app.NotificationRule.Filter p0) {}
            private android.app.NotificationRule.Filter.Builder addIncludedPackageWithoutUid(java.lang.String p0) { return null; }
            private android.app.NotificationRule.Filter.Builder maybeClearRestoredDataFields(long p0) { return null; }
            public android.app.NotificationRule.Filter.Builder addAppStoreCategory(int p0) { return null; }
            public android.app.NotificationRule.Filter.Builder addCategory(java.lang.String p0) { return null; }
            public android.app.NotificationRule.Filter.Builder addContact(android.net.Uri p0) { return null; }
            public android.app.NotificationRule.Filter.Builder addExcludedPackageUid(int p0) { return null; }
            public android.app.NotificationRule.Filter.Builder addExcludedPackageWithoutUid(java.lang.String p0) { return null; }
            public android.app.NotificationRule.Filter.Builder addIncludedPackageUid(int p0) { return null; }
            public android.app.NotificationRule.Filter.Builder addKeyword(java.lang.String p0) { return null; }
            public android.app.NotificationRule.Filter.Builder addRestoredUnknownUser(int p0) { return null; }
            public android.app.NotificationRule.Filter.Builder addShortcutId(android.app.NotificationRule.PerUserPackageIdentifier p0) { return null; }
            public android.app.NotificationRule.Filter.Builder addStaticBundleType(int p0) { return null; }
            public android.app.NotificationRule.Filter.Builder addUser(android.os.UserHandle p0) { return null; }
            public android.app.NotificationRule.Filter build() { return null; }
            public android.app.NotificationRule.Filter.Builder setAppStoreCategories(java.util.List<java.lang.Integer> p0) { return null; }
            public android.app.NotificationRule.Filter.Builder setCategories(java.util.List<java.lang.String> p0) { return null; }
            public android.app.NotificationRule.Filter.Builder setContactLevel(int p0) { return null; }
            public android.app.NotificationRule.Filter.Builder setContacts(java.util.List<android.net.Uri> p0) { return null; }
            public android.app.NotificationRule.Filter.Builder setConversationLevel(int p0) { return null; }
            public android.app.NotificationRule.Filter.Builder setCreationTime(long p0) { return null; }
            public android.app.NotificationRule.Filter.Builder setExcludedPackageUids(java.util.List<java.lang.Integer> p0) { return null; }
            public android.app.NotificationRule.Filter.Builder setExcludedPackagesWithoutUids(java.util.List<java.lang.String> p0) { return null; }
            public android.app.NotificationRule.Filter.Builder setFlags(int p0) { return null; }
            public android.app.NotificationRule.Filter.Builder setIncludedPackageUids(java.util.List<java.lang.Integer> p0) { return null; }
            public android.app.NotificationRule.Filter.Builder setIncludedPackagesWithoutUids(java.util.List<java.lang.String> p0) { return null; }
            public android.app.NotificationRule.Filter.Builder setKeywords(java.util.List<java.lang.String> p0) { return null; }
            public android.app.NotificationRule.Filter.Builder setMessageType(int p0) { return null; }
            public android.app.NotificationRule.Filter.Builder setRestoredUnknownUsers(java.util.List<java.lang.Integer> p0) { return null; }
            public android.app.NotificationRule.Filter.Builder setShortcutIds(java.util.List<android.app.NotificationRule.PerUserPackageIdentifier> p0) { return null; }
            public android.app.NotificationRule.Filter.Builder setStaticBundleTypes(java.util.List<java.lang.Integer> p0) { return null; }
            public android.app.NotificationRule.Filter.Builder setUsers(java.util.List<android.os.UserHandle> p0) { return null; }
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface ContactLevel {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface ConversationLevel {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface MessageType {
        }
    }

    public static final class PerUserPackageIdentifier implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.app.NotificationRule.PerUserPackageIdentifier> CREATOR = null;
        private final java.lang.String mIdentifier = null;
        private final java.lang.String mPkg = null;
        private final android.os.UserHandle mUser = null;
        private PerUserPackageIdentifier(android.os.Parcel p0) {}
        public PerUserPackageIdentifier(android.os.UserHandle p0, java.lang.String p1, java.lang.String p2) {}
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String getIdentifier() { return null; }
        public java.lang.String getPackageName() { return null; }
        public android.os.UserHandle getUser() { return null; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
