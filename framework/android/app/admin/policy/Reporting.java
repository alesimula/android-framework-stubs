package android.app.admin.policy;

public final class Reporting {
    public static final android.app.admin.PolicyIdentifier<java.lang.Integer> DEVICE_SECURITY_LOGGING = null;
    public static final android.app.admin.PolicyIdentifier<java.lang.Integer> NETWORK_LOGGING = null;
    public static final int NETWORK_LOGGING_DISABLED = 2;
    public static final int NETWORK_LOGGING_ENABLED = 1;
    public static final int SECURITY_LOGGING_DISABLED = 2;
    public static final int SECURITY_LOGGING_ENABLED = 1;
    public static final android.app.admin.PolicyIdentifier<java.lang.Integer> USER_SECURITY_LOGGING = null;
    private Reporting() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface NetworkLoggingValue {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SecurityLoggingValue {
    }
}
