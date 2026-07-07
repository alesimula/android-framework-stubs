package com.android.internal.telephony;

public class MessagingReadRestrictionAllowlistMonitor {
    private static final java.lang.String CERTIFICATE_SEPARATOR = ":";
    private static final java.lang.String KEY_READ_RESTRICTION_ALLOWLIST = "messaging_read_restriction_allowlist";
    private static final java.lang.String READ_RESTRICTION_ALLOWLIST_FILE_NAME = "messaging_read_restriction_allowlist.txt";
    private static final java.lang.String SIGNED_PACKAGE_SEPARATOR = ",";
    private static final java.lang.String TAG = "MessagingReadRestrictionAllowlistMonitor";
    private static final java.lang.String TELEPHONY_DIR = "telephony";
    private com.android.internal.telephony.MessagingReadRestrictionAllowlistMonitor.Allowlist mAllowlist;
    private final java.util.List<com.android.internal.telephony.MessagingReadRestrictionAllowlistMonitor.AllowlistProvider> mAllowlistProviders = null;
    private final java.util.concurrent.Executor mBackgroundExecutor = null;
    private final android.content.Context mContext = null;
    private final android.content.BroadcastReceiver mPackageReceiver = null;
    private final com.android.internal.telephony.MessagingReadRestrictionAllowlistMonitor.ValueStorage mStorage = null;
    public MessagingReadRestrictionAllowlistMonitor(android.content.Context p0) {}
    public MessagingReadRestrictionAllowlistMonitor(android.content.Context p0, java.io.File p1, java.util.concurrent.Executor p2) {}
    private static android.content.pm.ApplicationInfo getApplicationInfoAsUser(java.lang.String p0, android.content.pm.PackageManager p1, int p2) { return null; }
    private static android.content.pm.SigningDetails getSigningDetails(java.lang.String p0, android.content.pm.PackageManager p1, int p2) { return null; }
    private void initializeAllowlistFromStorage() {}
    private static boolean isPreInstalledApp(android.content.pm.ApplicationInfo p0) { return false; }
    private static boolean packageSignatureMatches(com.android.internal.telephony.MessagingReadRestrictionAllowlistMonitor.AllowlistedPackage p0, android.content.pm.SigningDetails p1, boolean p2) { return false; }
    private void refreshAllowlistAndApplyAppOps() {}
    private static void setAppOpMode(android.app.AppOpsManager p0, java.lang.String p1, int p2, int p3) {}
    private static boolean updateAppOps(android.content.Context p0, com.android.internal.telephony.MessagingReadRestrictionAllowlistMonitor.Allowlist p1, com.android.internal.telephony.MessagingReadRestrictionAllowlistMonitor.Allowlist p2) { return false; }
    public com.android.internal.telephony.MessagingReadRestrictionAllowlistMonitor.Allowlist computeAllowlistLocked() { return null; }
    public void initialize() {}
    public void onPackageInstalled(java.lang.String p0, int p1) {}
    public void onPropertiesChanged(android.provider.DeviceConfig.Properties p0) {}

    static final class Allowlist {
        static final com.android.internal.telephony.MessagingReadRestrictionAllowlistMonitor.Allowlist EMPTY_ALLOWLIST = null;
        private final java.util.Set<com.android.internal.telephony.MessagingReadRestrictionAllowlistMonitor.AllowlistedPackage> packages = null;
        Allowlist(java.util.Set<com.android.internal.telephony.MessagingReadRestrictionAllowlistMonitor.AllowlistedPackage> p0) {}
        static com.android.internal.telephony.MessagingReadRestrictionAllowlistMonitor.Allowlist parse(java.lang.String p0) { return null; }
        public final boolean equals(java.lang.Object p0) { return false; }
        java.util.List<com.android.internal.telephony.MessagingReadRestrictionAllowlistMonitor.AppOpChange> getAppOpChanges(com.android.internal.telephony.MessagingReadRestrictionAllowlistMonitor.Allowlist p0) { return null; }
        java.lang.String getEncodedValue() { return null; }
        public final int hashCode() { return 0; }
        public java.util.Set<com.android.internal.telephony.MessagingReadRestrictionAllowlistMonitor.AllowlistedPackage> packages() { return null; }
        public final java.lang.String toString() { return null; }
    }

    static final class AllowlistedPackage {
        static final java.lang.String ANY_CERTIFICATE = "*";
        private final java.lang.String packageName = null;
        private final java.lang.String sha256Certificate = null;
        AllowlistedPackage(java.lang.String p0, java.lang.String p1) {}
        static com.android.internal.telephony.MessagingReadRestrictionAllowlistMonitor.AllowlistedPackage parse(java.lang.String p0) { return null; }
        public final boolean equals(java.lang.Object p0) { return false; }
        public final int hashCode() { return 0; }
        public java.lang.String packageName() { return null; }
        public java.lang.String sha256Certificate() { return null; }
        public java.lang.String toString() { return null; }
    }

    static interface AllowlistProvider {
        public java.util.Set<com.android.internal.telephony.MessagingReadRestrictionAllowlistMonitor.AllowlistedPackage> getAllowlistedPackages();
    }

    static final class AppOpChange {
        private final int mode = 0;
        private final com.android.internal.telephony.MessagingReadRestrictionAllowlistMonitor.AllowlistedPackage packageEntry = null;
        AppOpChange(int p0, com.android.internal.telephony.MessagingReadRestrictionAllowlistMonitor.AllowlistedPackage p1) {}
        void apply(android.content.pm.PackageManager p0, android.app.AppOpsManager p1, int p2) {}
        public final boolean equals(java.lang.Object p0) { return false; }
        public final int hashCode() { return 0; }
        public int mode() { return 0; }
        public com.android.internal.telephony.MessagingReadRestrictionAllowlistMonitor.AllowlistedPackage packageEntry() { return null; }
        public final java.lang.String toString() { return null; }
    }

    private static final class DeviceConfigAllowlist implements com.android.internal.telephony.MessagingReadRestrictionAllowlistMonitor.AllowlistProvider {
        private final java.lang.String mDeviceConfigKey = null;
        DeviceConfigAllowlist(android.content.Context p0, java.lang.String p1) {}
        private com.android.internal.telephony.MessagingReadRestrictionAllowlistMonitor.Allowlist readDeviceConfig() { return null; }
        public java.util.Set<com.android.internal.telephony.MessagingReadRestrictionAllowlistMonitor.AllowlistedPackage> getAllowlistedPackages() { return null; }
    }

    private static final class StaticResourcesAllowlist implements com.android.internal.telephony.MessagingReadRestrictionAllowlistMonitor.AllowlistProvider {
        private com.android.internal.telephony.MessagingReadRestrictionAllowlistMonitor.Allowlist mAllowlist;
        private final android.content.Context mContext = null;
        private final int mResourceId = 0;
        StaticResourcesAllowlist(android.content.Context p0, int p1) {}
        private static com.android.internal.telephony.MessagingReadRestrictionAllowlistMonitor.AllowlistedPackage parseResourceArrayItemEntry(java.lang.String p0) { return null; }
        private com.android.internal.telephony.MessagingReadRestrictionAllowlistMonitor.Allowlist readFromResources() { return null; }
        public java.util.Set<com.android.internal.telephony.MessagingReadRestrictionAllowlistMonitor.AllowlistedPackage> getAllowlistedPackages() { return null; }
    }

    private static final class ValueStorage {
        private final android.util.AtomicFile mAtomicFile = null;
        ValueStorage(java.io.File p0) {}
        com.android.internal.telephony.MessagingReadRestrictionAllowlistMonitor.Allowlist readPersistedValue() { return null; }
        void writeValue(java.lang.String p0) {}
    }
}
