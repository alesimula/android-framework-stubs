package android.app.admin.policy;

public class AdvancedSecurityOverrides {
    public static final android.app.admin.PolicyIdentifier<java.lang.Integer> CONTENT_PROTECTION = null;
    public static final int CONTENT_PROTECTION_DISABLED = 1;
    public static final int CONTENT_PROTECTION_ENABLED = 2;
    public static final int CONTENT_PROTECTION_USER_CHOICE = 0;
    public static final android.app.admin.PolicyIdentifier<java.lang.Integer> DEVELOPER_OPTIONS = null;
    public static final int DEVELOPER_OPTIONS_ALLOWED = 2;
    public static final int DEVELOPER_OPTIONS_DISALLOWED = 1;
    public static final android.app.admin.PolicyIdentifier<java.lang.Integer> MEMORY_TAGGING_EXTENSION = null;
    public static final int MEMORY_TAGGING_EXTENSION_DISABLED = 2;
    public static final int MEMORY_TAGGING_EXTENSION_ENABLED = 1;
    public static final int MEMORY_TAGGING_EXTENSION_USER_CHOICE = 0;
    public static final android.app.admin.PolicyIdentifier<java.lang.Integer> SAFE_BOOT = null;
    public static final int SAFE_BOOT_ALLOWED = 2;
    public static final int SAFE_BOOT_DISALLOWED = 1;
    public static final android.app.admin.PolicyIdentifier<java.lang.Integer> UNTRUSTED_APPS = null;
    public static final int UNTRUSTED_APPS_ALLOWED = 1;
    public static final int UNTRUSTED_APPS_DISALLOWED = 2;
    public static final android.app.admin.PolicyIdentifier<java.lang.Integer> VERIFY_APPS = null;
    public static final int VERIFY_APPS_ENABLED = 1;
    public static final int VERIFY_APPS_USER_CHOICE = 2;
    private AdvancedSecurityOverrides() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ContentProtectionValue {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DeveloperOptionsValue {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MemoryTaggingExtensionValue {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SafeBootValue {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UntrustedAppsValue {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VerifyAppsValue {
    }
}
