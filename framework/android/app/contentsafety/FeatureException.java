package android.app.contentsafety;

@android.annotation.SystemApi
public class FeatureException extends java.lang.Exception {
    public static final int FEATURE_SETTINGS_ERROR = 1;
    public static final int FEATURE_SETTINGS_ERROR_UNKNOWN = 0;
    public static final int FEATURE_SETTINGS_SERVICE_UNAVAILABLE = 2;
    private final int mErrorCode = 0;
    public FeatureException(int p0) { super(); }
    public int getErrorCode() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.FIELD})
    static @interface FeatureSettingsFailureStatus {
    }
}
