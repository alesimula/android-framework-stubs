package android.service.contentsafety;

public abstract class ContentSafetyAppService extends android.app.Service {
    public static final java.lang.String ACTION_CONTENT_SAFETY_APP_SERVICE = "android.app.action.CONTENT_SAFETY_SERVICE";
    private static final java.lang.String TAG = "ContentSafetyAppService";
    private final android.service.contentsafety.IContentSafetyAppService.Stub mBinder = null;
    private final android.os.Handler mHandler = null;
    public ContentSafetyAppService() { super(); }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract android.app.contentsafety.ContentClassificationResult onClassifyContent(android.app.contentsafety.ClassifiableContent p0);
    public void onContentSafetyDisabled() {}
    public void onContentSafetyEnabled() {}
    public void onServiceBound(android.content.Intent p0) {}
}
