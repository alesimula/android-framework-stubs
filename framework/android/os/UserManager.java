package android.os;

public class UserManager {
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_CREATE_SUPERVISED_USER = "android.os.action.CREATE_SUPERVISED_USER";
    private static final java.lang.String ACTION_CREATE_USER = "android.os.action.CREATE_USER";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_USER_ADMIN_STATUS_CHANGED = "android.os.action.USER_ADMIN_STATUS_CHANGED";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_USER_RESTRICTIONS_CHANGED = "android.os.action.USER_RESTRICTIONS_CHANGED";
    public static final java.lang.String ALLOW_PARENT_PROFILE_APP_LINKING = "allow_parent_profile_app_linking";
    public static final long ALWAYS_USE_CONTEXT_USER = 183155436L;
    private static final java.lang.String CACHE_KEY_STATIC_USER_PROPERTIES = null;
    public static final int CONTEXT_ISSUE_STORAGE_ACCESS_BACKUP = 5;
    public static final int CONTEXT_ISSUE_STORAGE_ACCESS_CACHE = 3;
    public static final int CONTEXT_ISSUE_STORAGE_ACCESS_CRATES = 6;
    public static final int CONTEXT_ISSUE_STORAGE_ACCESS_DATABASE = 4;
    public static final int CONTEXT_ISSUE_STORAGE_ACCESS_FILES = 1;
    public static final int CONTEXT_ISSUE_STORAGE_ACCESS_PREFS = 2;
    public static final int CONTEXT_ISSUE_USERLESS_METHOD_CALL_FROM_SYSTEM = 11;
    private static final boolean DEBUG_LOG_DEPRECATION = Boolean.valueOf(false);
    private static final java.lang.String DEPRECATION_LOG_TAG = "MultiuserDeprecation";
    public static final java.lang.String DEV_CREATE_OVERRIDE_PROPERTY = "debug.user.creation_override";
    public static final java.lang.String DISALLOW_ADD_CLONE_PROFILE = "no_add_clone_profile";
    public static final java.lang.String DISALLOW_ADD_GUEST = "no_add_guest";
    @java.lang.Deprecated
    public static final java.lang.String DISALLOW_ADD_MANAGED_PROFILE = "no_add_managed_profile";
    public static final java.lang.String DISALLOW_ADD_PRIVATE_PROFILE = "no_add_private_profile";
    public static final java.lang.String DISALLOW_ADD_USER = "no_add_user";
    public static final java.lang.String DISALLOW_ADD_WIFI_CONFIG = "no_add_wifi_config";
    public static final java.lang.String DISALLOW_ADJUST_VOLUME = "no_adjust_volume";
    public static final java.lang.String DISALLOW_AIRPLANE_MODE = "no_airplane_mode";
    public static final java.lang.String DISALLOW_AMBIENT_DISPLAY = "no_ambient_display";
    public static final java.lang.String DISALLOW_APPS_CONTROL = "no_control_apps";
    public static final java.lang.String DISALLOW_ASSIST_CONTENT = "no_assist_content";
    public static final java.lang.String DISALLOW_AUTOFILL = "no_autofill";
    public static final java.lang.String DISALLOW_BIOMETRIC = "disallow_biometric";
    public static final java.lang.String DISALLOW_BLUETOOTH = "no_bluetooth";
    public static final java.lang.String DISALLOW_BLUETOOTH_SHARING = "no_bluetooth_sharing";
    public static final java.lang.String DISALLOW_CAMERA = "no_camera";
    public static final java.lang.String DISALLOW_CAMERA_TOGGLE = "disallow_camera_toggle";
    public static final java.lang.String DISALLOW_CELLULAR_2G = "no_cellular_2g";
    public static final java.lang.String DISALLOW_CHANGE_NEAR_FIELD_COMMUNICATION_RADIO = "no_change_near_field_communication_radio";
    public static final java.lang.String DISALLOW_CHANGE_WIFI_STATE = "no_change_wifi_state";
    public static final java.lang.String DISALLOW_CONFIG_BLUETOOTH = "no_config_bluetooth";
    public static final java.lang.String DISALLOW_CONFIG_BRIGHTNESS = "no_config_brightness";
    public static final java.lang.String DISALLOW_CONFIG_CELL_BROADCASTS = "no_config_cell_broadcasts";
    public static final java.lang.String DISALLOW_CONFIG_CREDENTIALS = "no_config_credentials";
    public static final java.lang.String DISALLOW_CONFIG_DATE_TIME = "no_config_date_time";
    public static final java.lang.String DISALLOW_CONFIG_DEFAULT_APPS = "disallow_config_default_apps";
    public static final java.lang.String DISALLOW_CONFIG_LOCALE = "no_config_locale";
    public static final java.lang.String DISALLOW_CONFIG_LOCATION = "no_config_location";
    public static final java.lang.String DISALLOW_CONFIG_MOBILE_NETWORKS = "no_config_mobile_networks";
    public static final java.lang.String DISALLOW_CONFIG_PRIVATE_DNS = "disallow_config_private_dns";
    public static final java.lang.String DISALLOW_CONFIG_SCREEN_TIMEOUT = "no_config_screen_timeout";
    public static final java.lang.String DISALLOW_CONFIG_TETHERING = "no_config_tethering";
    public static final java.lang.String DISALLOW_CONFIG_VPN = "no_config_vpn";
    public static final java.lang.String DISALLOW_CONFIG_WIFI = "no_config_wifi";
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final java.lang.String DISALLOW_CONFIG_WIFI_PRIVATE = "no_config_wifi_private";
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final java.lang.String DISALLOW_CONFIG_WIFI_SHARED = "no_config_wifi_shared";
    public static final java.lang.String DISALLOW_CONTENT_CAPTURE = "no_content_capture";
    public static final java.lang.String DISALLOW_CONTENT_SUGGESTIONS = "no_content_suggestions";
    public static final java.lang.String DISALLOW_CREATE_WINDOWS = "no_create_windows";
    public static final java.lang.String DISALLOW_CROSS_PROFILE_COPY_PASTE = "no_cross_profile_copy_paste";
    public static final java.lang.String DISALLOW_DATA_ROAMING = "no_data_roaming";
    public static final java.lang.String DISALLOW_DEBUGGING_FEATURES = "no_debugging_features";
    public static final java.lang.String DISALLOW_FACTORY_RESET = "no_factory_reset";
    public static final java.lang.String DISALLOW_FUN = "no_fun";
    public static final java.lang.String DISALLOW_GRANT_ADMIN = "no_grant_admin";
    public static final java.lang.String DISALLOW_INSTALL_APPS = "no_install_apps";
    public static final java.lang.String DISALLOW_INSTALL_UNKNOWN_SOURCES = "no_install_unknown_sources";
    public static final java.lang.String DISALLOW_INSTALL_UNKNOWN_SOURCES_GLOBALLY = "no_install_unknown_sources_globally";
    public static final java.lang.String DISALLOW_MICROPHONE_TOGGLE = "disallow_microphone_toggle";
    public static final java.lang.String DISALLOW_MODIFY_ACCOUNTS = "no_modify_accounts";
    public static final java.lang.String DISALLOW_MOUNT_PHYSICAL_MEDIA = "no_physical_media";
    public static final java.lang.String DISALLOW_NEAR_FIELD_COMMUNICATION_RADIO = "no_near_field_communication_radio";
    public static final java.lang.String DISALLOW_NETWORK_RESET = "no_network_reset";
    public static final java.lang.String DISALLOW_NON_TOOL_ACCESSIBILITY_SERVICE = "no_non_tool_accessibility_service";
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public static final java.lang.String DISALLOW_OEM_UNLOCK = "no_oem_unlock";
    public static final java.lang.String DISALLOW_OUTGOING_BEAM = "no_outgoing_beam";
    public static final java.lang.String DISALLOW_OUTGOING_CALLS = "no_outgoing_calls";
    public static final java.lang.String DISALLOW_PRINTING = "no_printing";
    public static final java.lang.String DISALLOW_RECORD_AUDIO = "no_record_audio";
    @java.lang.Deprecated
    public static final java.lang.String DISALLOW_REMOVE_MANAGED_PROFILE = "no_remove_managed_profile";
    public static final java.lang.String DISALLOW_REMOVE_USER = "no_remove_user";
    @android.annotation.SystemApi
    public static final java.lang.String DISALLOW_RUN_IN_BACKGROUND = "no_run_in_background";
    public static final java.lang.String DISALLOW_SAFE_BOOT = "no_safe_boot";
    public static final java.lang.String DISALLOW_SET_USER_ICON = "no_set_user_icon";
    public static final java.lang.String DISALLOW_SET_WALLPAPER = "no_set_wallpaper";
    public static final java.lang.String DISALLOW_SHARE_INTO_MANAGED_PROFILE = "no_sharing_into_profile";
    public static final java.lang.String DISALLOW_SHARE_LOCATION = "no_share_location";
    public static final java.lang.String DISALLOW_SHARING_ADMIN_CONFIGURED_WIFI = "no_sharing_admin_configured_wifi";
    public static final java.lang.String DISALLOW_SIM_GLOBALLY = "no_sim_globally";
    public static final java.lang.String DISALLOW_SMS = "no_sms";
    public static final java.lang.String DISALLOW_SYSTEM_ERROR_DIALOGS = "no_system_error_dialogs";
    public static final java.lang.String DISALLOW_TASK_CONTINUITY_HANDOFF = "no_task_continuity_handoff";
    public static final java.lang.String DISALLOW_THREAD_NETWORK = "no_thread_network";
    public static final java.lang.String DISALLOW_ULTRA_WIDEBAND_RADIO = "no_ultra_wideband_radio";
    public static final java.lang.String DISALLOW_UNIFIED_PASSWORD = "no_unified_password";
    public static final java.lang.String DISALLOW_UNINSTALL_APPS = "no_uninstall_apps";
    public static final java.lang.String DISALLOW_UNMUTE_DEVICE = "disallow_unmute_device";
    public static final java.lang.String DISALLOW_UNMUTE_MICROPHONE = "no_unmute_microphone";
    public static final java.lang.String DISALLOW_USB_FILE_TRANSFER = "no_usb_file_transfer";
    public static final java.lang.String DISALLOW_USER_SWITCH = "no_user_switch";
    public static final java.lang.String DISALLOW_WALLPAPER = "no_wallpaper";
    public static final java.lang.String DISALLOW_WIFI_DIRECT = "no_wifi_direct";
    public static final java.lang.String DISALLOW_WIFI_TETHERING = "no_wifi_tethering";
    public static final java.lang.String ENSURE_VERIFY_APPS = "ensure_verify_apps";
    public static final java.lang.String EXTRA_USER_ACCOUNT_NAME = "android.os.extra.USER_ACCOUNT_NAME";
    public static final java.lang.String EXTRA_USER_ACCOUNT_OPTIONS = "android.os.extra.USER_ACCOUNT_OPTIONS";
    public static final java.lang.String EXTRA_USER_ACCOUNT_TYPE = "android.os.extra.USER_ACCOUNT_TYPE";
    public static final java.lang.String EXTRA_USER_NAME = "android.os.extra.USER_NAME";
    public static final java.lang.String KEY_RESTRICTIONS_PENDING = "restrictions_pending";
    public static final int LOGOUTABILITY_STATUS_CANNOT_LOGOUT_SYSTEM_USER = 1;
    public static final int LOGOUTABILITY_STATUS_CANNOT_SWITCH = 2;
    public static final int LOGOUTABILITY_STATUS_DEVICE_NOT_SUPPORTED = 3;
    public static final int LOGOUTABILITY_STATUS_OK = 0;
    public static final int MAX_ACCOUNT_OPTIONS_LENGTH = 1000;
    public static final int MAX_ACCOUNT_STRING_LENGTH = 500;
    public static final int MAX_USER_NAME_LENGTH = 100;
    public static final int PIN_VERIFICATION_FAILED_INCORRECT = -3;
    public static final int PIN_VERIFICATION_FAILED_NOT_SET = -2;
    public static final int PIN_VERIFICATION_SUCCESS = -1;
    public static final int QUIET_MODE_DISABLE_DONT_ASK_CREDENTIAL = 2;
    public static final int QUIET_MODE_DISABLE_ONLY_IF_CREDENTIAL_NOT_REQUIRED = 1;
    @android.annotation.SystemApi
    public static final int REMOVE_RESULT_ALREADY_BEING_REMOVED = 2;
    @android.annotation.SystemApi
    public static final int REMOVE_RESULT_DEFERRED = 1;
    @android.annotation.SystemApi
    public static final int REMOVE_RESULT_ERROR_DEVICE_OWNER = -7;
    @android.annotation.SystemApi
    public static final int REMOVE_RESULT_ERROR_LAST_ADMIN_USER = -6;
    @android.annotation.SystemApi
    public static final int REMOVE_RESULT_ERROR_MAIN_USER_PERMANENT_ADMIN = -5;
    @android.annotation.SystemApi
    public static final int REMOVE_RESULT_ERROR_SYSTEM_USER = -4;
    @android.annotation.SystemApi
    public static final int REMOVE_RESULT_ERROR_UNKNOWN = -1;
    @android.annotation.SystemApi
    public static final int REMOVE_RESULT_ERROR_USER_NOT_FOUND = -3;
    @android.annotation.SystemApi
    public static final int REMOVE_RESULT_ERROR_USER_RESTRICTION = -2;
    @android.annotation.SystemApi
    public static final int REMOVE_RESULT_REMOVED = 0;
    public static final int REMOVE_RESULT_USER_IS_REMOVABLE = 3;
    @android.annotation.SystemApi
    public static final int RESTRICTION_NOT_SET = 0;
    @android.annotation.SystemApi
    public static final int RESTRICTION_SOURCE_DEVICE_OWNER = 2;
    @android.annotation.SystemApi
    public static final int RESTRICTION_SOURCE_PROFILE_OWNER = 4;
    @android.annotation.SystemApi
    public static final int RESTRICTION_SOURCE_SYSTEM = 1;
    @android.annotation.SystemApi
    public static final int SWITCHABILITY_STATUS_OK = 0;
    @android.annotation.SystemApi
    public static final int SWITCHABILITY_STATUS_SYSTEM_USER_LOCKED = 4;
    @android.annotation.SystemApi
    public static final int SWITCHABILITY_STATUS_USER_IN_CALL = 1;
    @android.annotation.SystemApi
    public static final int SWITCHABILITY_STATUS_USER_SWITCH_DISALLOWED = 2;
    public static final java.lang.String SYSTEM_USER_MODE_EMULATION_DEFAULT = "default";
    public static final java.lang.String SYSTEM_USER_MODE_EMULATION_FULL = "full";
    public static final java.lang.String SYSTEM_USER_MODE_EMULATION_HEADLESS = "headless";
    public static final java.lang.String SYSTEM_USER_MODE_EMULATION_PROPERTY = "persist.debug.user_mode_emulation";
    private static final java.lang.String TAG = "UserManager";
    public static final int USER_CREATION_FAILED_NOT_PERMITTED = 1;
    public static final int USER_CREATION_FAILED_NO_MORE_USERS = 2;
    public static final int USER_LOCK_LOGGING_STATUS_LOCKED = 1;
    public static final int USER_LOCK_LOGGING_STATUS_UNKNOWN = 0;
    public static final int USER_LOCK_LOGGING_STATUS_UNLOCKED = 3;
    public static final int USER_LOCK_LOGGING_STATUS_UNLOCKING = 2;
    public static final int USER_OPERATION_ERROR_CURRENT_USER = 4;
    public static final int USER_OPERATION_ERROR_DISABLED_USER = 8;
    public static final int USER_OPERATION_ERROR_FEATURE_UNSUPPORTED = 9;
    public static final int USER_OPERATION_ERROR_LOW_STORAGE = 5;
    public static final int USER_OPERATION_ERROR_MANAGED_PROFILE = 2;
    public static final int USER_OPERATION_ERROR_MAX_RUNNING_USERS = 3;
    public static final int USER_OPERATION_ERROR_MAX_USERS = 6;
    public static final int USER_OPERATION_ERROR_UNKNOWN = 1;
    @android.annotation.SystemApi
    public static final int USER_OPERATION_ERROR_USER_ACCOUNT_ALREADY_EXISTS = 7;
    public static final int USER_OPERATION_ERROR_USER_RESTRICTED = 10;
    public static final int USER_OPERATION_SUCCESS = 0;
    public static final java.lang.String USER_TYPE_FULL_DEMO = "android.os.usertype.full.DEMO";
    @android.annotation.SystemApi
    public static final java.lang.String USER_TYPE_FULL_GUEST = "android.os.usertype.full.GUEST";
    public static final java.lang.String USER_TYPE_FULL_KIOSK = "android.os.usertype.full.KIOSK";
    public static final java.lang.String USER_TYPE_FULL_RESTRICTED = "android.os.usertype.full.RESTRICTED";
    @android.annotation.SystemApi
    public static final java.lang.String USER_TYPE_FULL_SECONDARY = "android.os.usertype.full.SECONDARY";
    @android.annotation.SystemApi
    public static final java.lang.String USER_TYPE_FULL_SYSTEM = "android.os.usertype.full.SYSTEM";
    public static final java.lang.String USER_TYPE_PROFILE_CLONE = "android.os.usertype.profile.CLONE";
    public static final java.lang.String USER_TYPE_PROFILE_COMMUNAL = "android.os.usertype.profile.COMMUNAL";
    public static final java.lang.String USER_TYPE_PROFILE_MANAGED = "android.os.usertype.profile.MANAGED";
    public static final java.lang.String USER_TYPE_PROFILE_PRIVATE = "android.os.usertype.profile.PRIVATE";
    @android.annotation.SystemApi
    public static final java.lang.String USER_TYPE_PROFILE_SUPERVISING = "android.os.usertype.profile.SUPERVISING";
    public static final java.lang.String USER_TYPE_PROFILE_TEST = "android.os.usertype.profile.TEST";
    @android.annotation.SystemApi
    public static final java.lang.String USER_TYPE_SYSTEM_HEADLESS = "android.os.usertype.system.HEADLESS";
    private static java.lang.Boolean sIsHeadlessSystemUser;
    private final android.content.Context mContext = null;
    private final java.lang.Object mIpcDataCache = null;
    private final android.app.PropertyInvalidatedCache<java.lang.Integer, java.lang.String> mProfileTypeCache = null;
    private java.lang.String mProfileTypeOfProcessUser;
    private final android.os.IUserManager mService = null;
    private final int mUserId = 0;
    public UserManager(android.content.Context p0, android.os.IUserManager p1) {}
    private java.util.List<android.os.UserHandle> convertUserIdsToUserHandles(int[] p0) { return null; }
    public static android.content.Intent createUserCreationIntent(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.os.PersistableBundle p3) { return null; }
    public static android.os.UserManager get(android.content.Context p0) { return null; }
    private int getContextUserIfAppropriate() { return 0; }
    private java.lang.String getDefaultProfileLabel(int p0) { return null; }
    private android.graphics.drawable.Drawable getDefaultUserBadge(int p0) { return null; }
    private java.lang.String getDefaultUserBadgedLabel(java.lang.CharSequence p0, int p1) { return null; }
    @java.lang.Deprecated
    public static int getMaxSupportedUsers() { return 0; }
    public static int getMaxSwitchableUsers() { return 0; }
    private java.lang.String getProfileAccessibilityLabel(int p0) { return null; }
    private java.lang.String getProfileType() { return null; }
    private java.lang.String getProfileType(int p0) { return null; }
    private java.util.List<android.os.UserHandle> getProfiles(boolean p0) { return null; }
    private java.lang.String getUpdatableUserBadgedLabelId(int p0) { return null; }
    private android.content.pm.UserProperties getUserPropertiesFromQuery(android.os.UserManager.QueryUserId p0) { return null; }
    private boolean getUserRestrictionFromQuery(android.util.Pair<java.lang.String, java.lang.Integer> p0) { return false; }
    private boolean hasUserRestrictionForUser(java.lang.String p0, int p1) { return false; }
    public static final void invalidateCacheOnUserDataChanged() {}
    public static final void invalidateCacheOnUserListChange() {}
    public static final void invalidateEnabledProfileIds() {}
    public static final void invalidateIsUserUnlockedCache() {}
    public static final void invalidateOnUserInfoFlagChange(int p0) {}
    public static final void invalidateQuietModeEnabledCache() {}
    public static final void invalidateStaticUserProperties() {}
    public static final void invalidateUserPropertiesCache() {}
    public static final void invalidateUserRestriction() {}
    private boolean isCommunalProfile(int p0) { return false; }
    public static boolean isCommunalProfileEnabled() { return false; }
    public static boolean isDeviceInDemoMode(android.content.Context p0) { return false; }
    public static boolean isGuestUserAllowEphemeralStateChange() { return false; }
    public static boolean isGuestUserAlwaysEphemeral() { return false; }
    public static boolean isHeadlessSystemUserMode() { return false; }
    public static boolean isMultipleAdminEnabled() { return false; }
    @android.annotation.SystemApi
    public static boolean isRemoveResultSuccessful(int p0) { return false; }
    public static boolean isUserTypeCloneProfile(java.lang.String p0) { return false; }
    public static boolean isUserTypeCommunalProfile(java.lang.String p0) { return false; }
    public static boolean isUserTypeDemo(java.lang.String p0) { return false; }
    public static boolean isUserTypeGuest(java.lang.String p0) { return false; }
    public static boolean isUserTypeManagedProfile(java.lang.String p0) { return false; }
    public static boolean isUserTypePrivateProfile(java.lang.String p0) { return false; }
    public static boolean isUserTypeRestricted(java.lang.String p0) { return false; }
    public static boolean isUserTypeSupervisingProfile(java.lang.String p0) { return false; }
    public static boolean isVisibleBackgroundUsersEnabled() { return false; }
    public static boolean isVisibleBackgroundUsersOnDefaultDisplayEnabled() { return false; }
    public static void logStaticDeprecation() {}
    private <T extends java.lang.Object> T returnNullOrThrowUserOperationException(android.os.ServiceSpecificException p0, boolean p1) throws android.os.UserManager.UserOperationException { return null; }
    public static boolean supportsMultipleUsers() { return false; }
    public static java.lang.String userLockLoggingStatusToString(int p0) { return null; }
    public void addUserRestrictionsListener(android.os.IUserRestrictionsListener p0) {}
    public boolean canAddMoreManagedProfiles(int p0, boolean p1) { return false; }
    public boolean canAddMoreProfilesToUser(java.lang.String p0, int p1) { return false; }
    public boolean canAddMoreUsers(java.lang.String p0) { return false; }
    @java.lang.Deprecated
    public boolean canAddPrivateProfile() { return false; }
    @android.annotation.SystemApi
    public boolean canHaveRestrictedProfile() { return false; }
    @java.lang.Deprecated
    public boolean canSwitchUsers() { return false; }
    @android.annotation.SystemApi
    public void clearSeedAccountData() {}
    public android.content.pm.UserInfo createGuest(android.content.Context p0) { return null; }
    @android.annotation.SystemApi
    public android.os.UserHandle createProfile(java.lang.String p0, java.lang.String p1, java.util.Set<java.lang.String> p2) throws android.os.UserManager.UserOperationException { return null; }
    @java.lang.Deprecated
    public android.content.pm.UserInfo createProfileForUser(java.lang.String p0, int p1, int p2) { return null; }
    public android.content.pm.UserInfo createProfileForUser(java.lang.String p0, java.lang.String p1, int p2, int p3) { return null; }
    public android.content.pm.UserInfo createProfileForUser(java.lang.String p0, java.lang.String p1, int p2, int p3, java.lang.String[] p4) { return null; }
    public android.content.pm.UserInfo createProfileForUserEvenWhenDisallowed(java.lang.String p0, java.lang.String p1, int p2, int p3, java.lang.String[] p4) { return null; }
    public android.content.pm.UserInfo createRestrictedProfile(java.lang.String p0) { return null; }
    @java.lang.Deprecated
    public android.content.pm.UserInfo createUser(java.lang.String p0, int p1) { return null; }
    public android.content.pm.UserInfo createUser(java.lang.String p0, java.lang.String p1, int p2) { return null; }
    @android.annotation.SystemApi
    public android.os.NewUserResponse createUser(android.os.NewUserRequest p0) { return null; }
    public void evictCredentialEncryptionKey(int p0) {}
    @java.lang.Deprecated
    public android.content.pm.UserInfo findCurrentGuestUser() { return null; }
    public java.util.List<android.content.pm.UserInfo> getAliveUsers() { return null; }
    @android.annotation.SystemApi
    public java.util.List<android.os.UserHandle> getAllProfiles() { return null; }
    public android.os.Bundle getApplicationRestrictions(java.lang.String p0) { return null; }
    public android.os.Bundle getApplicationRestrictions(java.lang.String p0, android.os.UserHandle p1) { return null; }
    public android.graphics.drawable.Drawable getBadgedDrawableForUser(android.graphics.drawable.Drawable p0, android.os.UserHandle p1, android.graphics.Rect p2, int p3) { return null; }
    public android.graphics.drawable.Drawable getBadgedIconForUser(android.graphics.drawable.Drawable p0, android.os.UserHandle p1) { return null; }
    public java.lang.CharSequence getBadgedLabelForUser(java.lang.CharSequence p0, android.os.UserHandle p1) { return null; }
    public android.os.UserHandle getBootUser() { return null; }
    public android.os.UserHandle getCommunalProfile() { return null; }
    public int getCredentialOwnerProfile(int p0) { return 0; }
    public int getCurrentAllowedNumberOfUsers(java.lang.String p0) { return 0; }
    public android.os.Bundle getDefaultGuestRestrictions() { return null; }
    public int[] getEnabledProfileIds(int p0) { return null; }
    @android.annotation.SystemApi
    public java.util.List<android.os.UserHandle> getEnabledProfiles() { return null; }
    @java.lang.Deprecated
    public java.util.List<android.content.pm.UserInfo> getEnabledProfiles(int p0) { return null; }
    public java.util.List<android.content.pm.UserInfo> getGuestUsers() { return null; }
    public int getMainDisplayIdAssignedToUser() { return 0; }
    @android.annotation.SystemApi
    public android.os.UserHandle getMainUser() { return null; }
    public java.util.Set<java.lang.String> getPreInstallableSystemPackages(java.lang.String p0) { return null; }
    @android.annotation.SystemApi
    public android.os.UserHandle getPreviousForegroundUser() { return null; }
    @java.lang.Deprecated
    public android.content.pm.UserInfo getPrimaryUser() { return null; }
    @java.lang.Deprecated
    public int getProcessUserId() { return 0; }
    public java.lang.String getProfileAccessibilityString(int p0) { return null; }
    public int[] getProfileIds(int p0, boolean p1) { return null; }
    public int[] getProfileIdsExcludingHidden(int p0, boolean p1) { return null; }
    public int[] getProfileIdsWithDisabled(int p0) { return null; }
    @android.annotation.SystemApi
    public java.lang.String getProfileLabel() { return null; }
    public android.content.pm.UserInfo getProfileParent(int p0) { return null; }
    @android.annotation.SystemApi
    public android.os.UserHandle getProfileParent(android.os.UserHandle p0) { return null; }
    public java.util.List<android.content.pm.UserInfo> getProfiles(int p0) { return null; }
    public java.util.List<android.content.pm.UserInfo> getProfilesIncludingCommunal(int p0) { return null; }
    @android.annotation.SystemApi
    public int getRemainingCreatableProfileCount(java.lang.String p0) { return 0; }
    @android.annotation.SystemApi
    public int getRemainingCreatableUserCount(java.lang.String p0) { return 0; }
    @android.annotation.SystemApi
    public android.os.UserHandle getRestrictedProfileParent() { return null; }
    @android.annotation.SystemApi
    public java.lang.String getSeedAccountName() { return null; }
    @android.annotation.SystemApi
    public android.os.PersistableBundle getSeedAccountOptions() { return null; }
    @android.annotation.SystemApi
    public java.lang.String getSeedAccountType() { return null; }
    public long getSerialNumberForUser(android.os.UserHandle p0) { return 0L; }
    @android.annotation.SystemApi
    public long[] getSerialNumbersOfUsers(boolean p0) { return null; }
    public java.lang.String getUserAccount(int p0) { return null; }
    @android.annotation.SystemApi
    public android.graphics.drawable.Drawable getUserBadge() { return null; }
    public int getUserBadgeColor(int p0) { return 0; }
    public int getUserBadgeDarkColor(int p0) { return 0; }
    public int getUserBadgeNoBackgroundResId(int p0) { return 0; }
    public int getUserBadgeResId(int p0) { return 0; }
    public int getUserCount() { return 0; }
    public long getUserCreationTime(android.os.UserHandle p0) { return 0L; }
    public android.os.UserHandle getUserForSerialNumber(long p0) { return null; }
    @java.lang.Deprecated
    public int getUserHandle() { return 0; }
    public int getUserHandle(int p0) { return 0; }
    @android.annotation.SystemApi
    public java.util.List<android.os.UserHandle> getUserHandles(boolean p0) { return null; }
    @android.annotation.SystemApi
    public android.graphics.Bitmap getUserIcon() { return null; }
    public android.graphics.Bitmap getUserIcon(int p0) { return null; }
    public int getUserIconBadgeResId(int p0) { return 0; }
    public android.content.pm.UserInfo getUserInfo(int p0) { return null; }
    public int getUserLockLoggingStatus() { return 0; }
    public int getUserLogoutability(int p0) { return 0; }
    public java.lang.String getUserName() { return null; }
    public java.util.List<android.os.UserHandle> getUserProfiles() { return null; }
    @android.annotation.SystemApi
    public android.content.pm.UserProperties getUserProperties(android.os.UserHandle p0) { return null; }
    public int getUserRemovability(int p0) { return 0; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public int getUserRestrictionSource(java.lang.String p0, android.os.UserHandle p1) { return 0; }
    @android.annotation.SystemApi
    public java.util.List<android.os.UserManager.EnforcingUser> getUserRestrictionSources(java.lang.String p0, android.os.UserHandle p1) { return null; }
    public android.os.Bundle getUserRestrictions() { return null; }
    public android.os.Bundle getUserRestrictions(android.os.UserHandle p0) { return null; }
    public int getUserSerialNumber(int p0) { return 0; }
    public long getUserStartRealtime() { return 0L; }
    public int getUserStatusBarIconResId(int p0) { return 0; }
    @android.annotation.SystemApi
    public int getUserSwitchability() { return 0; }
    public int getUserSwitchability(android.os.UserHandle p0) { return 0; }
    public java.lang.String getUserType() { return null; }
    public long getUserUnlockRealtime() { return 0L; }
    public java.util.List<android.content.pm.UserInfo> getUsers() { return null; }
    @java.lang.Deprecated
    public java.util.List<android.content.pm.UserInfo> getUsers(boolean p0) { return null; }
    @java.lang.Deprecated
    public java.util.List<android.content.pm.UserInfo> getUsers(boolean p0, boolean p1, boolean p2) { return null; }
    @android.annotation.SystemApi
    public java.util.Set<android.os.UserHandle> getVisibleUsers() { return null; }
    public boolean hasBadge() { return false; }
    public boolean hasBadge(int p0) { return false; }
    public boolean hasBaseUserRestriction(java.lang.String p0, android.os.UserHandle p1) { return false; }
    @android.annotation.SystemApi
    public boolean hasRestrictedProfiles() { return false; }
    public boolean hasUserRestriction(java.lang.String p0) { return false; }
    @java.lang.Deprecated
    public boolean hasUserRestriction(java.lang.String p0, android.os.UserHandle p1) { return false; }
    @android.annotation.SystemApi
    public boolean hasUserRestrictionForUser(java.lang.String p0, android.os.UserHandle p1) { return false; }
    public boolean hasUserRestrictionOnAnyUser(java.lang.String p0) { return false; }
    public boolean isAdminUser() { return false; }
    @android.annotation.SystemApi
    public boolean isCloneProfile() { return false; }
    public boolean isCommunalProfile() { return false; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public boolean isCredentialSharableWithParent() { return false; }
    public boolean isDemoUser() { return false; }
    public boolean isEphemeralUser() { return false; }
    public boolean isForegroundUserAdmin() { return false; }
    @android.annotation.SystemApi
    public boolean isGuestUser() { return false; }
    public boolean isGuestUser(int p0) { return false; }
    @java.lang.Deprecated
    public boolean isLinkedUser() { return false; }
    @android.annotation.SystemApi
    public boolean isMainUser() { return false; }
    public boolean isManagedProfile() { return false; }
    @android.annotation.SystemApi
    public boolean isManagedProfile(int p0) { return false; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public boolean isMediaSharedWithParent() { return false; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public boolean isPrimaryUser() { return false; }
    @android.annotation.SystemApi
    public boolean isPrivateProfile() { return false; }
    public boolean isProfile() { return false; }
    public boolean isProfile(int p0) { return false; }
    public boolean isQuietModeEnabled(android.os.UserHandle p0) { return false; }
    @android.annotation.SystemApi
    public boolean isRestrictedProfile() { return false; }
    @android.annotation.SystemApi
    public boolean isRestrictedProfile(android.os.UserHandle p0) { return false; }
    public boolean isSameProfileGroup(int p0, int p1) { return false; }
    @android.annotation.SystemApi
    public boolean isSameProfileGroup(android.os.UserHandle p0, android.os.UserHandle p1) { return false; }
    public boolean isSettingRestrictedForUser(java.lang.String p0, int p1, java.lang.String p2, int p3) { return false; }
    public boolean isSystemUser() { return false; }
    public boolean isUserAGoat() { return false; }
    public boolean isUserAdmin(int p0) { return false; }
    public boolean isUserEphemeral(int p0) { return false; }
    public boolean isUserForeground() { return false; }
    @android.annotation.SystemApi
    public boolean isUserNameSet() { return false; }
    @android.annotation.SystemApi
    public boolean isUserOfType(java.lang.String p0) { return false; }
    public boolean isUserRunning(int p0) { return false; }
    public boolean isUserRunning(android.os.UserHandle p0) { return false; }
    public boolean isUserRunningOrStopping(android.os.UserHandle p0) { return false; }
    public boolean isUserSwitcherEnabled() { return false; }
    public boolean isUserSwitcherEnabled(boolean p0) { return false; }
    @java.lang.Deprecated
    public boolean isUserTypeEnabled(java.lang.String p0) { return false; }
    public boolean isUserTypeSupported(java.lang.String p0) { return false; }
    public boolean isUserUnlocked() { return false; }
    public boolean isUserUnlocked(int p0) { return false; }
    public boolean isUserUnlocked(android.os.UserHandle p0) { return false; }
    public boolean isUserUnlockingOrUnlocked(int p0) { return false; }
    @android.annotation.SystemApi
    public boolean isUserUnlockingOrUnlocked(android.os.UserHandle p0) { return false; }
    @android.annotation.SystemApi
    public boolean isUserVisible() { return false; }
    public boolean isVisibleBackgroundUsersOnDefaultDisplaySupported() { return false; }
    @android.annotation.SystemApi
    public boolean isVisibleBackgroundUsersSupported() { return false; }
    public void logContextIssue(int p0, int p1, int p2, java.lang.String p3, java.lang.String p4) {}
    public void logDeprecation() {}
    public boolean markGuestForDeletion(int p0) { return false; }
    @java.lang.Deprecated
    public android.content.pm.UserInfo preCreateUser(java.lang.String p0) throws android.os.UserManager.UserOperationException { return null; }
    public boolean removeUser(int p0) { return false; }
    @android.annotation.SystemApi
    public boolean removeUser(android.os.UserHandle p0) { return false; }
    public boolean removeUserEvenWhenDisallowed(int p0) { return false; }
    @android.annotation.SystemApi
    public int removeUserWhenPossible(android.os.UserHandle p0, boolean p1) { return 0; }
    public boolean requestQuietModeEnabled(boolean p0, android.os.UserHandle p1) { return false; }
    public boolean requestQuietModeEnabled(boolean p0, android.os.UserHandle p1, int p2) { return false; }
    public boolean requestQuietModeEnabled(boolean p0, android.os.UserHandle p1, android.content.IntentSender p2) { return false; }
    public boolean requestQuietModeEnabled(boolean p0, android.os.UserHandle p1, android.content.IntentSender p2, int p3) { return false; }
    public void revokeUserAdmin(int p0) {}
    public void setApplicationRestrictions(java.lang.String p0, android.os.Bundle p1, android.os.UserHandle p2) {}
    @android.annotation.SystemApi
    public void setBootUser(android.os.UserHandle p0) {}
    public void setDefaultGuestRestrictions(android.os.Bundle p0) {}
    @java.lang.Deprecated
    public boolean setRestrictionsChallenge(java.lang.String p0) { return false; }
    public void setSeedAccountData(int p0, java.lang.String p1, java.lang.String p2, android.os.PersistableBundle p3) {}
    public void setTemporaryActivitiesAllowlist(java.lang.String p0, java.util.Set<android.content.ComponentName> p1) {}
    public void setUserAccount(int p0, java.lang.String p1) {}
    public void setUserAdmin(int p0) {}
    public void setUserEnabled(int p0) {}
    public boolean setUserEphemeral(int p0, boolean p1) { return false; }
    public void setUserIcon(int p0, android.graphics.Bitmap p1) {}
    @android.annotation.SystemApi
    public void setUserIcon(android.graphics.Bitmap p0) throws android.os.UserManager.UserOperationException {}
    public void setUserName(int p0, java.lang.String p1) {}
    @android.annotation.SystemApi
    public void setUserName(java.lang.String p0) {}
    @java.lang.Deprecated
    public void setUserRestriction(java.lang.String p0, boolean p1) {}
    @java.lang.Deprecated
    public void setUserRestriction(java.lang.String p0, boolean p1, android.os.UserHandle p2) {}
    @java.lang.Deprecated
    public void setUserRestrictions(android.os.Bundle p0) {}
    @java.lang.Deprecated
    public void setUserRestrictions(android.os.Bundle p0, android.os.UserHandle p1) {}
    @android.annotation.SystemApi
    public boolean someUserHasAccount(java.lang.String p0, java.lang.String p1) { return false; }
    public boolean someUserHasSeedAccount(java.lang.String p0, java.lang.String p1) { return false; }

    public static class CheckedUserOperationException extends android.util.AndroidException {
        private final int mUserOperationResult = 0;
        public CheckedUserOperationException(java.lang.String p0, int p1) { super(); }
        public int getUserOperationResult() { return 0; }
        public android.os.ServiceSpecificException toServiceSpecificException() { return null; }
    }

    public static @interface ContextIssueType {
    }

    @android.annotation.SystemApi
    public static final class EnforcingUser implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.os.UserManager.EnforcingUser> CREATOR = null;
        private final int userId = 0;
        private final int userRestrictionSource = 0;
        public EnforcingUser(int p0, int p1) {}
        private EnforcingUser(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
        public android.os.UserHandle getUserHandle() { return null; }
        public int getUserRestrictionSource() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    static final class QueryUserId extends android.util.Pair<java.lang.Integer, java.lang.Integer> {
        public QueryUserId(int p0) { super(null, null); }
        public int getUserId() { return 0; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface QuietModeFlag {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RemoveResult {
    }

    public static @interface UserLockLoggingStatus {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UserLogoutability {
    }

    public static class UserOperationException extends java.lang.RuntimeException {
        private final int mUserOperationResult = 0;
        public UserOperationException(java.lang.String p0, int p1) { super(); }
        public static android.os.UserManager.UserOperationException from(android.os.ServiceSpecificException p0) { return null; }
        public int getUserOperationResult() { return 0; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UserOperationResult {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UserRestrictionKey {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UserRestrictionSource {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UserSwitchabilityResult {
    }
}
