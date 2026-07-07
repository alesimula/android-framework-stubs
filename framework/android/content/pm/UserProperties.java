package android.content.pm;

@android.annotation.SystemApi
public final class UserProperties implements android.os.Parcelable {
    private static final java.lang.String ATTR_ALLOW_STOPPING_USER_WITH_DELAYED_LOCKING = "allowStoppingUserWithDelayedLocking";
    private static final java.lang.String ATTR_ALWAYS_VISIBLE = "alwaysVisible";
    private static final java.lang.String ATTR_AUTH_ALWAYS_REQUIRED_TO_DISABLE_QUIET_MODE = "authAlwaysRequiredToDisableQuietMode";
    private static final java.lang.String ATTR_CREDENTIAL_SHAREABLE_WITH_PARENT = "credentialShareableWithParent";
    private static final java.lang.String ATTR_CROSS_PROFILE_CONTENT_SHARING_STRATEGY = "crossProfileContentSharingStrategy";
    private static final java.lang.String ATTR_CROSS_PROFILE_INTENT_FILTER_ACCESS_CONTROL = "crossProfileIntentFilterAccessControl";
    private static final java.lang.String ATTR_CROSS_PROFILE_INTENT_RESOLUTION_STRATEGY = "crossProfileIntentResolutionStrategy";
    private static final java.lang.String ATTR_DELETE_APP_WITH_PARENT = "deleteAppWithParent";
    private static final java.lang.String ATTR_INHERIT_DEVICE_POLICY = "inheritDevicePolicy";
    private static final java.lang.String ATTR_ITEMS_RESTRICTED_ON_HOME_SCREEN = "itemsRestrictedOnHomeScreen";
    private static final java.lang.String ATTR_MEDIA_SHARED_WITH_PARENT = "mediaSharedWithParent";
    private static final java.lang.String ATTR_PROFILE_API_VISIBILITY = "profileApiVisibility";
    private static final java.lang.String ATTR_SHOW_IN_LAUNCHER = "showInLauncher";
    private static final java.lang.String ATTR_SHOW_IN_QUIET_MODE = "showInQuietMode";
    private static final java.lang.String ATTR_SHOW_IN_SETTINGS = "showInSettings";
    private static final java.lang.String ATTR_SHOW_IN_SHARING_SURFACES = "showInSharingSurfaces";
    private static final java.lang.String ATTR_SHOW_IN_USER_SWITCHER = "showInUserSwitcher";
    private static final java.lang.String ATTR_START_WITH_PARENT = "startWithParent";
    private static final java.lang.String ATTR_UPDATE_CROSS_PROFILE_INTENT_FILTERS_ON_OTA = "updateCrossProfileIntentFiltersOnOTA";
    private static final java.lang.String ATTR_USE_PARENTS_CONTACTS = "useParentsContacts";
    public static final android.os.Parcelable.Creator<android.content.pm.UserProperties> CREATOR = null;
    public static final int CROSS_PROFILE_CONTENT_SHARING_DELEGATE_FROM_PARENT = 1;
    public static final int CROSS_PROFILE_CONTENT_SHARING_NO_DELEGATION = 0;
    public static final int CROSS_PROFILE_CONTENT_SHARING_UNKNOWN = -1;
    public static final int CROSS_PROFILE_INTENT_FILTER_ACCESS_LEVEL_ALL = 0;
    public static final int CROSS_PROFILE_INTENT_FILTER_ACCESS_LEVEL_SYSTEM = 10;
    public static final int CROSS_PROFILE_INTENT_FILTER_ACCESS_LEVEL_SYSTEM_ADD_ONLY = 20;
    public static final int CROSS_PROFILE_INTENT_RESOLUTION_STRATEGY_DEFAULT = 0;
    public static final int CROSS_PROFILE_INTENT_RESOLUTION_STRATEGY_NO_FILTERING = 1;
    private static final int INDEX_ALLOW_STOPPING_USER_WITH_DELAYED_LOCKING = 16;
    private static final int INDEX_ALWAYS_VISIBLE = 11;
    private static final int INDEX_AUTH_ALWAYS_REQUIRED_TO_DISABLE_QUIET_MODE = 13;
    private static final int INDEX_CREDENTIAL_SHAREABLE_WITH_PARENT = 9;
    private static final int INDEX_CROSS_PROFILE_CONTENT_SHARING_STRATEGY = 15;
    private static final int INDEX_CROSS_PROFILE_INTENT_FILTER_ACCESS_CONTROL = 6;
    private static final int INDEX_CROSS_PROFILE_INTENT_RESOLUTION_STRATEGY = 7;
    private static final int INDEX_DELETE_APP_WITH_PARENT = 10;
    private static final int INDEX_INHERIT_DEVICE_POLICY = 3;
    private static final int INDEX_ITEMS_RESTRICTED_ON_HOME_SCREEN = 18;
    private static final int INDEX_MEDIA_SHARED_WITH_PARENT = 8;
    private static final int INDEX_PROFILE_API_VISIBILITY = 17;
    private static final int INDEX_SHOW_IN_LAUNCHER = 0;
    private static final int INDEX_SHOW_IN_QUIET_MODE = 12;
    private static final int INDEX_SHOW_IN_SETTINGS = 2;
    private static final int INDEX_SHOW_IN_SHARING_SURFACES = 14;
    private static final int INDEX_SHOW_IN_USER_SWITCHER = 19;
    private static final int INDEX_START_WITH_PARENT = 1;
    private static final int INDEX_UPDATE_CROSS_PROFILE_INTENT_FILTERS_ON_OTA = 5;
    private static final int INDEX_USE_PARENTS_CONTACTS = 4;
    public static final int INHERIT_DEVICE_POLICY_FROM_PARENT = 1;
    public static final int INHERIT_DEVICE_POLICY_NO = 0;
    private static final java.lang.String LOG_TAG = null;
    public static final int PROFILE_API_VISIBILITY_HIDDEN = 1;
    public static final int PROFILE_API_VISIBILITY_UNKNOWN = -1;
    public static final int PROFILE_API_VISIBILITY_VISIBLE = 0;
    public static final int SHOW_IN_LAUNCHER_NO = 2;
    public static final int SHOW_IN_LAUNCHER_SEPARATE = 1;
    public static final int SHOW_IN_LAUNCHER_UNKNOWN = -1;
    public static final int SHOW_IN_LAUNCHER_WITH_PARENT = 0;
    public static final int SHOW_IN_QUIET_MODE_DEFAULT = 2;
    public static final int SHOW_IN_QUIET_MODE_HIDDEN = 1;
    public static final int SHOW_IN_QUIET_MODE_PAUSED = 0;
    public static final int SHOW_IN_QUIET_MODE_UNKNOWN = -1;
    public static final int SHOW_IN_SETTINGS_NO = 2;
    public static final int SHOW_IN_SETTINGS_SEPARATE = 1;
    public static final int SHOW_IN_SETTINGS_UNKNOWN = -1;
    public static final int SHOW_IN_SETTINGS_WITH_PARENT = 0;
    public static final int SHOW_IN_SHARING_SURFACES_NO = 2;
    public static final int SHOW_IN_SHARING_SURFACES_SEPARATE = 1;
    public static final int SHOW_IN_SHARING_SURFACES_UNKNOWN = -1;
    public static final int SHOW_IN_SHARING_SURFACES_WITH_PARENT = 0;
    public static final int SHOW_IN_USER_SWITCHER_NO = 0;
    public static final int SHOW_IN_USER_SWITCHER_YES = 1;
    private boolean mAllowStoppingUserWithDelayedLocking;
    private boolean mAlwaysVisible;
    private boolean mAuthAlwaysRequiredToDisableQuietMode;
    private boolean mCredentialShareableWithParent;
    private int mCrossProfileContentSharingStrategy;
    private int mCrossProfileIntentFilterAccessControl;
    private int mCrossProfileIntentResolutionStrategy;
    private final android.content.pm.UserProperties mDefaultProperties = null;
    private boolean mDeleteAppWithParent;
    private int mInheritDevicePolicy;
    private boolean mItemsRestrictedOnHomeScreen;
    private boolean mMediaSharedWithParent;
    private int mProfileApiVisibility;
    private long mPropertiesPresent;
    private int mShowInLauncher;
    private int mShowInQuietMode;
    private int mShowInSettings;
    private int mShowInSharingSurfaces;
    private int mShowInUserSwitcher;
    private boolean mStartWithParent;
    private boolean mUpdateCrossProfileIntentFiltersOnOTA;
    private boolean mUseParentsContacts;
    private UserProperties(int p0, boolean p1, int p2, int p3, int p4, int p5, int p6, boolean p7, boolean p8, int p9, int p10, boolean p11, boolean p12, boolean p13, boolean p14, boolean p15, boolean p16, int p17, int p18, boolean p19) {}
    public UserProperties(android.content.pm.UserProperties p0) {}
    public UserProperties(android.content.pm.UserProperties p0, boolean p1, boolean p2, boolean p3) {}
    private UserProperties(android.os.Parcel p0) {}
    public UserProperties(com.android.modules.utils.TypedXmlPullParser p0, android.content.pm.UserProperties p1) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {}
    private boolean isPresent(long p0) { return false; }
    private java.lang.StringBuilder listPropertiesAsStringBuilder() { return null; }
    private void setPresent(long p0) {}
    public boolean areItemsRestrictedOnHomeScreen() { return false; }
    public int describeContents() { return 0; }
    public boolean getAllowStoppingUserWithDelayedLocking() { return false; }
    public boolean getAlwaysVisible() { return false; }
    public int getCrossProfileContentSharingStrategy() { return 0; }
    public int getCrossProfileIntentFilterAccessControl() { return 0; }
    public int getCrossProfileIntentResolutionStrategy() { return 0; }
    public boolean getDeleteAppWithParent() { return false; }
    public int getInheritDevicePolicy() { return 0; }
    public int getProfileApiVisibility() { return 0; }
    public long getPropertiesPresent() { return 0L; }
    public int getShowInLauncher() { return 0; }
    public int getShowInQuietMode() { return 0; }
    public int getShowInSettings() { return 0; }
    public int getShowInSharingSurfaces() { return 0; }
    public int getShowInUserSwitcher() { return 0; }
    public boolean getStartWithParent() { return false; }
    public boolean getUpdateCrossProfileIntentFiltersOnOTA() { return false; }
    public boolean getUseParentsContacts() { return false; }
    public boolean isAuthAlwaysRequiredToDisableQuietMode() { return false; }
    public boolean isCredentialShareableWithParent() { return false; }
    public boolean isMediaSharedWithParent() { return false; }
    public void println(java.io.PrintWriter p0, java.lang.String p1) {}
    public void setAllowStoppingUserWithDelayedLocking(boolean p0) {}
    public void setAlwaysVisible(boolean p0) {}
    public void setAuthAlwaysRequiredToDisableQuietMode(boolean p0) {}
    public void setCredentialShareableWithParent(boolean p0) {}
    public void setCrossProfileContentSharingStrategy(int p0) {}
    public void setCrossProfileIntentFilterAccessControl(int p0) {}
    public void setCrossProfileIntentResolutionStrategy(int p0) {}
    public void setDeleteAppWithParent(boolean p0) {}
    public void setInheritDevicePolicy(int p0) {}
    public void setItemsRestrictedOnHomeScreen(boolean p0) {}
    public void setMediaSharedWithParent(boolean p0) {}
    public void setProfileApiVisibility(int p0) {}
    public void setShowInLauncher(int p0) {}
    public void setShowInQuietMode(int p0) {}
    public void setShowInSettings(int p0) {}
    public void setShowInSharingSurfaces(int p0) {}
    public void setShowInUserSwitcher(int p0) {}
    public void setStartWithParent(boolean p0) {}
    public void setUpdateCrossProfileIntentFiltersOnOTA(boolean p0) {}
    public void setUseParentsContacts(boolean p0) {}
    public java.lang.String toString() { return null; }
    public void updateFromXml(com.android.modules.utils.TypedXmlPullParser p0) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void writeToXml(com.android.modules.utils.TypedXmlSerializer p0) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {}

    public static final class Builder {
        private boolean mAllowStoppingUserWithDelayedLocking;
        private boolean mAlwaysVisible;
        private boolean mAuthAlwaysRequiredToDisableQuietMode;
        private boolean mCredentialShareableWithParent;
        private int mCrossProfileContentSharingStrategy;
        private int mCrossProfileIntentFilterAccessControl;
        private int mCrossProfileIntentResolutionStrategy;
        private boolean mDeleteAppWithParent;
        private int mInheritDevicePolicy;
        private boolean mItemsRestrictedOnHomeScreen;
        private boolean mMediaSharedWithParent;
        private int mProfileApiVisibility;
        private int mShowInLauncher;
        private int mShowInQuietMode;
        private int mShowInSettings;
        private int mShowInSharingSurfaces;
        private int mShowInUserSwitcher;
        private boolean mStartWithParent;
        private boolean mUpdateCrossProfileIntentFiltersOnOTA;
        private boolean mUseParentsContacts;
        public Builder() {}
        public android.content.pm.UserProperties build() { return null; }
        public android.content.pm.UserProperties.Builder setAllowStoppingUserWithDelayedLocking(boolean p0) { return null; }
        public android.content.pm.UserProperties.Builder setAlwaysVisible(boolean p0) { return null; }
        public android.content.pm.UserProperties.Builder setAuthAlwaysRequiredToDisableQuietMode(boolean p0) { return null; }
        public android.content.pm.UserProperties.Builder setCredentialShareableWithParent(boolean p0) { return null; }
        public android.content.pm.UserProperties.Builder setCrossProfileContentSharingStrategy(int p0) { return null; }
        public android.content.pm.UserProperties.Builder setCrossProfileIntentFilterAccessControl(int p0) { return null; }
        public android.content.pm.UserProperties.Builder setCrossProfileIntentResolutionStrategy(int p0) { return null; }
        public android.content.pm.UserProperties.Builder setDeleteAppWithParent(boolean p0) { return null; }
        public android.content.pm.UserProperties.Builder setInheritDevicePolicy(int p0) { return null; }
        public android.content.pm.UserProperties.Builder setItemsRestrictedOnHomeScreen(boolean p0) { return null; }
        public android.content.pm.UserProperties.Builder setMediaSharedWithParent(boolean p0) { return null; }
        public android.content.pm.UserProperties.Builder setProfileApiVisibility(int p0) { return null; }
        public android.content.pm.UserProperties.Builder setShowInLauncher(int p0) { return null; }
        public android.content.pm.UserProperties.Builder setShowInQuietMode(int p0) { return null; }
        public android.content.pm.UserProperties.Builder setShowInSettings(int p0) { return null; }
        public android.content.pm.UserProperties.Builder setShowInSharingSurfaces(int p0) { return null; }
        public android.content.pm.UserProperties.Builder setShowInUserSwitcher(int p0) { return null; }
        public android.content.pm.UserProperties.Builder setStartWithParent(boolean p0) { return null; }
        public android.content.pm.UserProperties.Builder setUpdateCrossProfileIntentFiltersOnOTA(boolean p0) { return null; }
        public android.content.pm.UserProperties.Builder setUseParentsContacts(boolean p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CrossProfileContentSharingStrategy {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CrossProfileIntentFilterAccessControlLevel {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CrossProfileIntentResolutionStrategy {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface InheritDevicePolicy {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ProfileApiVisibility {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface PropertyIndex {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ShowInLauncher {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ShowInQuietMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ShowInSettings {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ShowInSharingSurfaces {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ShowInUserSwitcher {
    }
}
