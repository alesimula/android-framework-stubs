package android.service.contentcapture;

@android.annotation.SystemApi
public abstract class ContentCaptureProcessingConfigurationProviderService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.service.contentcapture.ContentCaptureProcessingConfigurationProviderService";
    private static final java.lang.String TAG = "ContentCaptureConfProvider";
    private final android.service.contentcapture.IContentCaptureProcessingConfigurationProvider.Stub mBinder = null;
    public ContentCaptureProcessingConfigurationProviderService() { super(); }
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract java.util.List<android.service.contentcapture.ContentCaptureAllowlistEntry> onGetAllowlist();
    public abstract java.util.List<android.service.contentcapture.ContentCaptureProcessingRule> onGetRules();

    private final class ContentCaptureProcessingConfigurationProviderBinder extends android.service.contentcapture.IContentCaptureProcessingConfigurationProvider.Stub {
        private ContentCaptureProcessingConfigurationProviderBinder(android.service.contentcapture.ContentCaptureProcessingConfigurationProviderService p0) { super(); }
        public void requestAllowlist(android.service.contentcapture.IContentCaptureProcessingConfigurationCallback p0) {}
        public void requestRules(android.service.contentcapture.IContentCaptureProcessingConfigurationCallback p0) {}
    }
}
