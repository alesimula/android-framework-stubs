package android.hardware.camera2.extension;

@android.annotation.SystemApi
public abstract class AdvancedExtender {
    private static final java.lang.String TAG = "AdvancedExtender";
    private final android.hardware.camera2.CameraManager mCameraManager = null;
    private android.hardware.camera2.extension.CameraUsageTracker mCameraUsageTracker;
    private java.util.HashMap<java.lang.String, java.lang.Long> mMetadataVendorIdMap;
    public AdvancedExtender(android.hardware.camera2.CameraManager p0) {}
    private static java.util.List<android.hardware.camera2.extension.SizeList> initializeParcelable(java.util.Map<java.lang.Integer, java.util.List<android.util.Size>> p0) { return null; }
    android.hardware.camera2.extension.IAdvancedExtenderImpl getAdvancedExtenderBinder() { return null; }
    public abstract java.util.List<android.hardware.camera2.CaptureRequest.Key> getAvailableCaptureRequestKeys(java.lang.String p0);
    public abstract java.util.List<android.hardware.camera2.CaptureResult.Key> getAvailableCaptureResultKeys(java.lang.String p0);
    public abstract java.util.List<android.util.Pair<android.hardware.camera2.CameraCharacteristics.Key, java.lang.Object>> getAvailableCharacteristicsKeyValues();
    public android.util.Range<java.lang.Long> getEstimatedCaptureLatencyRangeMillis(android.util.Size p0, int p1) { return null; }
    public long getMetadataVendorId(java.lang.String p0) { return 0L; }
    public abstract android.hardware.camera2.extension.SessionProcessor getSessionProcessor();
    public abstract java.util.Map<java.lang.Integer, java.util.List<android.util.Size>> getSupportedCaptureOutputResolutions(java.lang.String p0);
    public java.util.Map<java.lang.Integer, java.util.List<android.util.Size>> getSupportedPostviewOutputResolutions(android.util.Size p0) { return null; }
    public abstract java.util.Map<java.lang.Integer, java.util.List<android.util.Size>> getSupportedPreviewOutputResolutions(java.lang.String p0);
    public abstract void initialize(java.lang.String p0, android.hardware.camera2.extension.CharacteristicsMap p1);
    public boolean isCaptureProcessProgressAvailable() { return false; }
    public abstract boolean isExtensionAvailable(java.lang.String p0, android.hardware.camera2.extension.CharacteristicsMap p1);
    public boolean isPostviewAvailable() { return false; }
    void setCameraUsageTracker(android.hardware.camera2.extension.CameraUsageTracker p0) {}

    private final class AdvancedExtenderImpl extends android.hardware.camera2.extension.IAdvancedExtenderImpl.Stub {
        private AdvancedExtenderImpl(android.hardware.camera2.extension.AdvancedExtender p0) { super(); }
        public android.hardware.camera2.impl.CameraMetadataNative getAvailableCaptureRequestKeys(java.lang.String p0) { return null; }
        public android.hardware.camera2.impl.CameraMetadataNative getAvailableCaptureResultKeys(java.lang.String p0) { return null; }
        public android.hardware.camera2.impl.CameraMetadataNative getAvailableCharacteristicsKeyValues(java.lang.String p0) { return null; }
        public android.hardware.camera2.extension.LatencyRange getEstimatedCaptureLatencyRange(java.lang.String p0, android.hardware.camera2.extension.Size p1, int p2) { return null; }
        public android.hardware.camera2.extension.ISessionProcessorImpl getSessionProcessor() { return null; }
        public java.util.List<android.hardware.camera2.extension.SizeList> getSupportedCaptureOutputResolutions(java.lang.String p0) { return null; }
        public java.util.List<android.hardware.camera2.extension.SizeList> getSupportedPostviewResolutions(android.hardware.camera2.extension.Size p0) { return null; }
        public java.util.List<android.hardware.camera2.extension.SizeList> getSupportedPreviewOutputResolutions(java.lang.String p0) { return null; }
        public void init(java.lang.String p0, java.util.Map<java.lang.String, android.hardware.camera2.impl.CameraMetadataNative> p1) {}
        public boolean isCaptureProcessProgressAvailable() { return false; }
        public boolean isExtensionAvailable(java.lang.String p0, java.util.Map<java.lang.String, android.hardware.camera2.impl.CameraMetadataNative> p1) { return false; }
        public boolean isPostviewAvailable() { return false; }
    }
}
