package android.app.admin.policy;

public class DataLeakPrevention {
    public static final android.app.admin.PolicyIdentifier<java.lang.Integer> ASSIST_CONTENT = null;
    public static final int ASSIST_CONTENT_ALLOWED = 2;
    public static final int ASSIST_CONTENT_DISALLOWED = 1;
    public static final android.app.admin.PolicyIdentifier<java.lang.Integer> SCREEN_CAPTURE = null;
    public static final int SCREEN_CAPTURE_ALLOWED = 2;
    public static final int SCREEN_CAPTURE_DISALLOWED = 1;
    public static final android.app.admin.PolicyIdentifier<java.lang.Integer> UNIVERSAL_CLIPBOARD = null;
    public static final int UNIVERSAL_CLIPBOARD_ALLOWED = 2;
    public static final int UNIVERSAL_CLIPBOARD_DISALLOWED = 1;
    private DataLeakPrevention() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AssistContentValue {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ScreenCaptureValue {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UniversalClipboardValue {
    }
}
