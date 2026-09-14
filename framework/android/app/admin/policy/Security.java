package android.app.admin.policy;

public final class Security {
    public static final android.app.admin.PolicyIdentifier<java.lang.Integer> FACTORY_RESET = null;
    public static final int FACTORY_RESET_ALLOWED = 2;
    public static final int FACTORY_RESET_DISALLOWED = 1;
    private Security() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FactoryResetValue {
    }
}
