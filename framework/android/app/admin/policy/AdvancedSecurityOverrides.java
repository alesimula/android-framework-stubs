package android.app.admin.policy;

public class AdvancedSecurityOverrides {
    public static final android.app.admin.PolicyIdentifier<java.lang.Integer> UNTRUSTED_APPS = null;
    public static final int UNTRUSTED_APPS_ALLOWED = 1;
    public static final int UNTRUSTED_APPS_DISALLOWED = 2;
    public static final android.app.admin.PolicyIdentifier<java.lang.Integer> VERIFY_APPS = null;
    public static final int VERIFY_APPS_ENFORCED = 1;
    public static final int VERIFY_APPS_USER_CHOICE = 2;
    private AdvancedSecurityOverrides() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UntrustedAppsValue {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VerifyAppsValue {
    }
}
