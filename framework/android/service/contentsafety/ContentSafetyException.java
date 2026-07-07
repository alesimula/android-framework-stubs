package android.service.contentsafety;

@android.annotation.SystemApi
public final class ContentSafetyException extends java.lang.Exception {
    public static final int CONTENT_SAFETY_GET_FEATURE_ERROR = 2;
    public static final int CONTENT_SAFETY_LOAD_FEATURE_ERROR = 1;
    private final int mErrorCode = 0;
    public ContentSafetyException(int p0) { super(); }
    public int getErrorCode() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ContentSafetyError {
    }
}
