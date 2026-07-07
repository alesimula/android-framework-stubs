package android.app;

public class BroadcastOptions extends android.app.ComponentOptions {
    public static final long CHANGE_ALWAYS_DISABLED = 210856463L;
    public static final long CHANGE_ALWAYS_ENABLED = 209888056L;
    public static final long CHANGE_INVALID = -9223372036854775808L;
    public static final int DEFERRAL_POLICY_DEFAULT = 0;
    public static final int DEFERRAL_POLICY_NONE = 1;
    public static final int DEFERRAL_POLICY_UNTIL_ACTIVE = 2;
    public static final int DELIVERY_GROUP_POLICY_ALL = 0;
    public static final int DELIVERY_GROUP_POLICY_MERGED = 2;
    public static final int DELIVERY_GROUP_POLICY_MOST_RECENT = 1;
    private static final int FLAG_ALLOW_BACKGROUND_ACTIVITY_STARTS = 2;
    private static final int FLAG_DEBUG_LOG = 64;
    private static final int FLAG_DONT_SEND_TO_RESTRICTED_APPS = 1;
    private static final int FLAG_INTERACTIVE = 32;
    private static final int FLAG_IS_ALARM_BROADCAST = 8;
    private static final int FLAG_REQUIRE_COMPAT_CHANGE_ENABLED = 4;
    private static final int FLAG_SHARE_IDENTITY = 16;
    private static final java.lang.String KEY_DEBUG_REASON = "android:broadcast.debugReason";
    private static final java.lang.String KEY_DEFERRAL_POLICY = "android:broadcast.deferralPolicy";
    private static final java.lang.String KEY_DELIVERY_GROUP_EXTRAS_MERGER = "android:broadcast.deliveryGroupExtrasMerger";
    private static final java.lang.String KEY_DELIVERY_GROUP_KEY = "android:broadcast.deliveryGroupMatchingKey";
    private static final java.lang.String KEY_DELIVERY_GROUP_MATCHING_FILTER = "android:broadcast.deliveryGroupMatchingFilter";
    private static final java.lang.String KEY_DELIVERY_GROUP_NAMESPACE = "android:broadcast.deliveryGroupMatchingNamespace";
    private static final java.lang.String KEY_DELIVERY_GROUP_POLICY = "android:broadcast.deliveryGroupPolicy";
    private static final java.lang.String KEY_FLAGS = "android:broadcast.flags";
    private static final java.lang.String KEY_ID_FOR_RESPONSE_EVENT = "android:broadcast.idForResponseEvent";
    private static final java.lang.String KEY_INCLUDED_PACKAGES = "android:broadcast.includedPackageNames";
    private static final java.lang.String KEY_MAX_MANIFEST_RECEIVER_API_LEVEL = "android:broadcast.maxManifestReceiverApiLevel";
    private static final java.lang.String KEY_MIN_MANIFEST_RECEIVER_API_LEVEL = "android:broadcast.minManifestReceiverApiLevel";
    public static final java.lang.String KEY_REQUIRE_ALL_OF_PERMISSIONS = "android:broadcast.requireAllOfPermissions";
    private static final java.lang.String KEY_REQUIRE_COMPAT_CHANGE_ID = "android:broadcast.requireCompatChangeId";
    public static final java.lang.String KEY_REQUIRE_NONE_OF_PERMISSIONS = "android:broadcast.requireNoneOfPermissions";
    private static final java.lang.String KEY_TEMPORARY_APP_ALLOWLIST_DURATION = "android:broadcast.temporaryAppAllowlistDuration";
    private static final java.lang.String KEY_TEMPORARY_APP_ALLOWLIST_REASON = "android:broadcast.temporaryAppAllowlistReason";
    private static final java.lang.String KEY_TEMPORARY_APP_ALLOWLIST_REASON_CODE = "android:broadcast.temporaryAppAllowlistReasonCode";
    private static final java.lang.String KEY_TEMPORARY_APP_ALLOWLIST_TYPE = "android:broadcast.temporaryAppAllowlistType";
    @java.lang.Deprecated
    public static final int TEMPORARY_WHITELIST_TYPE_FOREGROUND_SERVICE_ALLOWED = 0;
    @java.lang.Deprecated
    public static final int TEMPORARY_WHITELIST_TYPE_FOREGROUND_SERVICE_NOT_ALLOWED = 1;
    private java.lang.String mDebugReason;
    private int mDeferralPolicy;
    private android.os.BundleMerger mDeliveryGroupExtrasMerger;
    private android.content.IntentFilter mDeliveryGroupMatchingFilter;
    private java.lang.String mDeliveryGroupMatchingKeyFragment;
    private java.lang.String mDeliveryGroupMatchingNamespaceFragment;
    private int mDeliveryGroupPolicy;
    private int mFlags;
    private long mIdForResponseEvent;
    private java.lang.String[] mIncludedPackages;
    private int mMaxManifestReceiverApiLevel;
    private int mMinManifestReceiverApiLevel;
    private java.lang.String[] mRequireAllOfPermissions;
    private long mRequireCompatChangeId;
    private java.lang.String[] mRequireNoneOfPermissions;
    private long mTemporaryAppAllowlistDuration;
    private java.lang.String mTemporaryAppAllowlistReason;
    private int mTemporaryAppAllowlistReasonCode;
    private int mTemporaryAppAllowlistType;
    public BroadcastOptions() { super(); }
    public BroadcastOptions(android.os.Bundle p0) { super(); }
    public static android.app.BroadcastOptions fromBundle(android.os.Bundle p0) { return null; }
    public static android.app.BroadcastOptions fromBundleNullable(android.os.Bundle p0) { return null; }
    private boolean isTemporaryAppAllowlistSet() { return false; }
    public static android.app.BroadcastOptions makeBasic() { return null; }
    public static android.app.BroadcastOptions makeWithDeferUntilActive(boolean p0) { return null; }
    private void resetTemporaryAppAllowlist() {}
    @java.lang.Deprecated
    public boolean allowsBackgroundActivityStarts() { return false; }
    public void clearDeferralPolicy() {}
    public void clearDeliveryGroupExtrasMerger() {}
    public void clearDeliveryGroupMatchingFilter() {}
    public void clearDeliveryGroupMatchingKey() {}
    public void clearDeliveryGroupPolicy() {}
    @android.annotation.SystemApi
    public void clearRequireCompatChange() {}
    public java.lang.String getDebugReason() { return null; }
    public int getDeferralPolicy() { return 0; }
    public android.os.BundleMerger getDeliveryGroupExtrasMerger() { return null; }
    public android.content.IntentFilter getDeliveryGroupMatchingFilter() { return null; }
    public java.lang.String getDeliveryGroupMatchingKey() { return null; }
    public java.lang.String getDeliveryGroupMatchingKeyFragment() { return null; }
    public java.lang.String getDeliveryGroupMatchingNamespaceFragment() { return null; }
    public int getDeliveryGroupPolicy() { return 0; }
    public long getIdForResponseEvent() { return 0L; }
    public java.lang.String[] getIncludedPackages() { return null; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @java.lang.Deprecated
    public int getMaxManifestReceiverApiLevel() { return 0; }
    @java.lang.Deprecated
    public int getMinManifestReceiverApiLevel() { return 0; }
    @android.annotation.SystemApi
    public int getPendingIntentBackgroundActivityStartMode() { return 0; }
    public long getRequireCompatChangeId() { return 0L; }
    public long getTemporaryAppAllowlistDuration() { return 0L; }
    public java.lang.String getTemporaryAppAllowlistReason() { return null; }
    public int getTemporaryAppAllowlistReasonCode() { return 0; }
    public int getTemporaryAppAllowlistType() { return 0; }
    public boolean isAlarmBroadcast() { return false; }
    public boolean isDebugLogEnabled() { return false; }
    public boolean isDontSendToRestrictedApps() { return false; }
    public boolean isInteractive() { return false; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public boolean isPendingIntentBackgroundActivityLaunchAllowed() { return false; }
    public boolean isPushMessagingBroadcast() { return false; }
    public boolean isPushMessagingOverQuotaBroadcast() { return false; }
    public boolean isShareIdentityEnabled() { return false; }
    @android.annotation.SystemApi
    public void recordResponseEventWhileInBackground(long p0) {}
    public void setAlarmBroadcast(boolean p0) {}
    @android.annotation.SystemApi
    public void setBackgroundActivityStartsAllowed(boolean p0) {}
    public android.app.BroadcastOptions setDebugLogEnabled(boolean p0) { return null; }
    public android.app.BroadcastOptions setDebugReason(java.lang.String p0) { return null; }
    public android.app.BroadcastOptions setDeferralPolicy(int p0) { return null; }
    public android.app.BroadcastOptions setDeliveryGroupExtrasMerger(android.os.BundleMerger p0) { return null; }
    public android.app.BroadcastOptions setDeliveryGroupMatchingFilter(android.content.IntentFilter p0) { return null; }
    public android.app.BroadcastOptions setDeliveryGroupMatchingKey(java.lang.String p0, java.lang.String p1) { return null; }
    public android.app.BroadcastOptions setDeliveryGroupPolicy(int p0) { return null; }
    @android.annotation.SystemApi
    public void setDontSendToRestrictedApps(boolean p0) {}
    public android.app.BroadcastOptions setIncludedPackages(java.lang.String[] p0) { return null; }
    public android.app.BroadcastOptions setInteractive(boolean p0) { return null; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @java.lang.Deprecated
    public void setMaxManifestReceiverApiLevel(int p0) {}
    @java.lang.Deprecated
    public void setMinManifestReceiverApiLevel(int p0) {}
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public void setPendingIntentBackgroundActivityLaunchAllowed(boolean p0) {}
    @android.annotation.SystemApi
    public android.app.BroadcastOptions setPendingIntentBackgroundActivityStartMode(int p0) { return null; }
    @android.annotation.SystemApi
    public void setRequireAllOfPermissions(java.lang.String[] p0) {}
    @android.annotation.SystemApi
    public void setRequireCompatChange(long p0, boolean p1) {}
    @android.annotation.SystemApi
    public void setRequireNoneOfPermissions(java.lang.String[] p0) {}
    public android.app.BroadcastOptions setShareIdentityEnabled(boolean p0) { return null; }
    @android.annotation.SystemApi
    public void setTemporaryAppAllowlist(long p0, int p1, int p2, java.lang.String p3) {}
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public void setTemporaryAppWhitelistDuration(long p0) {}
    public boolean testRequireCompatChange(int p0) { return false; }
    public android.os.Bundle toBundle() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DeferralPolicy {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DeliveryGroupPolicy {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Flags {
    }
}
