package android.security.advancedprotection;

public final class AdvancedProtectionManager {
    public static final java.lang.String ACTION_SHOW_ADVANCED_PROTECTION_SUPPORT_DIALOG = "android.security.advancedprotection.action.SHOW_ADVANCED_PROTECTION_SUPPORT_DIALOG";
    public static final java.lang.String ADVANCED_PROTECTION_SYSTEM_ENTITY = "android.security.advancedprotection";
    public static final java.util.Set<java.lang.Integer> ALL_FEATURE_IDS = null;
    private static final java.util.Set<java.lang.Integer> ALL_SUPPORT_DIALOG_TYPES = null;
    public static final java.lang.String EXTRA_SUPPORT_DIALOG_FEATURE = "android.security.advancedprotection.extra.SUPPORT_DIALOG_FEATURE";
    public static final java.lang.String EXTRA_SUPPORT_DIALOG_TYPE = "android.security.advancedprotection.extra.SUPPORT_DIALOG_TYPE";
    @android.annotation.SystemApi
    public static final int FEATURE_ID_DISALLOW_CELLULAR_2G = 0;
    @android.annotation.SystemApi
    public static final int FEATURE_ID_DISALLOW_DEBUGGING_FEATURES = 7;
    @android.annotation.SystemApi
    public static final int FEATURE_ID_DISALLOW_INSECURE_WIFI_AUTOJOIN = 5;
    @android.annotation.SystemApi
    public static final int FEATURE_ID_DISALLOW_INSTALL_UNKNOWN_SOURCES = 1;
    @android.annotation.SystemApi
    public static final int FEATURE_ID_DISALLOW_STATE_CHANGE_VIA_ADB = 8;
    @android.annotation.SystemApi
    public static final int FEATURE_ID_DISALLOW_USB = 2;
    @android.annotation.SystemApi
    public static final int FEATURE_ID_DISALLOW_WEP = 3;
    @android.annotation.SystemApi
    public static final int FEATURE_ID_ENABLE_MTE = 4;
    @android.annotation.SystemApi
    public static final int FEATURE_ID_RESTRICT_NON_TOOL_A11Y_SERVICES = 6;
    private static final android.util.ArrayMap<java.lang.Integer, java.lang.String> FEATURE_ID_TO_NAME = null;
    private static final java.lang.String MEMORY_TAGGING_POLICY = "memoryTagging";
    private static final java.lang.String PKG_SETTINGS = "com.android.settings";
    public static final int SUPPORT_DIALOG_TYPE_BLOCKED_INTERACTION = 1;
    public static final int SUPPORT_DIALOG_TYPE_DISABLED_SETTING = 2;
    public static final int SUPPORT_DIALOG_TYPE_UNKNOWN = 0;
    private static final java.lang.String TAG = "AdvancedProtectionMgr";
    private final java.util.concurrent.ConcurrentHashMap<android.security.advancedprotection.AdvancedProtectionManager.Callback, android.security.advancedprotection.IAdvancedProtectionCallback> mCallbackMap = null;
    private final java.util.concurrent.ConcurrentHashMap<java.util.function.Consumer<java.util.List<android.security.advancedprotection.AdvancedProtectionFeature>>, android.security.advancedprotection.IAdvancedProtectionFeatureCallback> mFeatureCallbackMap = null;
    private final android.security.advancedprotection.IAdvancedProtectionService mService = null;
    public AdvancedProtectionManager(android.security.advancedprotection.IAdvancedProtectionService p0) {}
    private static android.util.ArrayMap<java.lang.Integer, java.lang.String> buildFeatureIdToNameMap() { return null; }
    public static android.content.Intent createSupportIntent(int p0, int p1) { return null; }
    public static android.content.Intent createSupportIntentForPolicyIdentifierOrRestriction(java.lang.String p0, int p1) { return null; }
    public static java.lang.String featureIdToString(int p0) throws java.lang.IllegalArgumentException { return null; }
    public static int featureStringToId(java.lang.String p0) throws java.lang.IllegalArgumentException { return 0; }
    public static java.lang.String supportDialogTypeToString(int p0) { return null; }
    @android.annotation.SystemApi
    public java.util.List<android.security.advancedprotection.AdvancedProtectionFeature> getAdvancedProtectionFeatures() { return null; }
    @android.annotation.SystemApi
    public java.util.List<android.security.advancedprotection.AdvancedProtectionFeature> getAdvancedProtectionFeatures(int[] p0) { return null; }
    public boolean isAdvancedProtectionEnabled() { return false; }
    public void logDialogShown(int p0, int p1, boolean p2) {}
    public void registerAdvancedProtectionCallback(java.util.concurrent.Executor p0, android.security.advancedprotection.AdvancedProtectionManager.Callback p1) {}
    @android.annotation.SystemApi
    public void registerAdvancedProtectionFeatureCallback(int[] p0, java.util.concurrent.Executor p1, java.util.function.Consumer<java.util.List<android.security.advancedprotection.AdvancedProtectionFeature>> p2) {}
    @android.annotation.SystemApi
    public void setAdvancedProtectionEnabled(boolean p0) {}
    public void unregisterAdvancedProtectionCallback(android.security.advancedprotection.AdvancedProtectionManager.Callback p0) {}
    @android.annotation.SystemApi
    public void unregisterAdvancedProtectionFeatureCallback(java.util.function.Consumer<java.util.List<android.security.advancedprotection.AdvancedProtectionFeature>> p0) {}
    @android.annotation.SystemApi
    public java.util.List<android.security.advancedprotection.AdvancedProtectionFeature> updateAdvancedProtectionFeaturesProvisioning(int[] p0, int[] p1) { return null; }

    public static interface Callback {
        public void onAdvancedProtectionChanged(boolean p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FeatureId {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SupportDialogType {
    }
}
