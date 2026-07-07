package android.hardware.camera2;

public final class CaptureRequest extends android.hardware.camera2.CameraMetadata<android.hardware.camera2.CaptureRequest.Key<?>> implements android.os.Parcelable {
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Boolean> BLACK_LEVEL_LOCK = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> COLOR_CORRECTION_ABERRATION_MODE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> COLOR_CORRECTION_COLOR_TEMPERATURE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> COLOR_CORRECTION_COLOR_TINT = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<android.hardware.camera2.params.RggbChannelVector> COLOR_CORRECTION_GAINS = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> COLOR_CORRECTION_MODE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<android.hardware.camera2.params.ColorSpaceTransform> COLOR_CORRECTION_TRANSFORM = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> CONTROL_AE_ANTIBANDING_MODE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> CONTROL_AE_EXPOSURE_COMPENSATION = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Boolean> CONTROL_AE_LOCK = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> CONTROL_AE_MODE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> CONTROL_AE_PRECAPTURE_TRIGGER = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> CONTROL_AE_PRIORITY_MODE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<android.hardware.camera2.params.MeteringRectangle[]> CONTROL_AE_REGIONS = null;
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Boolean> CONTROL_AE_REGIONS_SET = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<android.util.Range<java.lang.Integer>> CONTROL_AE_TARGET_FPS_RANGE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> CONTROL_AF_MODE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<android.hardware.camera2.params.MeteringRectangle[]> CONTROL_AF_REGIONS = null;
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Boolean> CONTROL_AF_REGIONS_SET = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> CONTROL_AF_TRIGGER = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> CONTROL_AUTOFRAMING = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Boolean> CONTROL_AWB_LOCK = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> CONTROL_AWB_MODE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<android.hardware.camera2.params.MeteringRectangle[]> CONTROL_AWB_REGIONS = null;
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Boolean> CONTROL_AWB_REGIONS_SET = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> CONTROL_CAPTURE_INTENT = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> CONTROL_EFFECT_MODE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Boolean> CONTROL_ENABLE_ZSL = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> CONTROL_EXTENDED_SCENE_MODE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> CONTROL_MODE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> CONTROL_POST_RAW_SENSITIVITY_BOOST = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> CONTROL_SCENE_MODE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> CONTROL_SETTINGS_OVERRIDE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> CONTROL_VIDEO_STABILIZATION_MODE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> CONTROL_ZOOM_METHOD = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Float> CONTROL_ZOOM_RATIO = null;
    public static final android.os.Parcelable.Creator<android.hardware.camera2.CaptureRequest> CREATOR = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> DISTORTION_CORRECTION_MODE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> EDGE_MODE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> EXTENSION_STRENGTH = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> FLASH_MODE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> FLASH_STRENGTH_LEVEL = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> HOT_PIXEL_MODE = null;
    public static final android.hardware.camera2.CaptureRequest.Key<double[]> JPEG_GPS_COORDINATES = null;
    @android.hardware.camera2.impl.PublicKey
    @android.hardware.camera2.impl.SyntheticKey
    public static final android.hardware.camera2.CaptureRequest.Key<android.location.Location> JPEG_GPS_LOCATION = null;
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.String> JPEG_GPS_PROCESSING_METHOD = null;
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Long> JPEG_GPS_TIMESTAMP = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> JPEG_ORIENTATION = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Byte> JPEG_QUALITY = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Byte> JPEG_THUMBNAIL_QUALITY = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<android.util.Size> JPEG_THUMBNAIL_SIZE = null;
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Boolean> LED_TRANSMIT = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Float> LENS_APERTURE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Float> LENS_FILTER_DENSITY = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Float> LENS_FOCAL_LENGTH = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Float> LENS_FOCUS_DISTANCE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> LENS_OPTICAL_STABILIZATION_MODE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Boolean> LOGICAL_MULTI_CAMERA_ADDITIONAL_RESULTS = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> NOISE_REDUCTION_MODE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Float> REPROCESS_EFFECTIVE_EXPOSURE_FACTOR = null;
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> REQUEST_ID = null;
    public static final int REQUEST_TYPE_COUNT = 3;
    public static final int REQUEST_TYPE_REGULAR = 0;
    public static final int REQUEST_TYPE_REPROCESS = 1;
    public static final int REQUEST_TYPE_ZSL_STILL = 2;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<android.graphics.Rect> SCALER_CROP_REGION = null;
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Boolean> SCALER_CROP_REGION_SET = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> SCALER_ROTATE_AND_CROP = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Long> SENSOR_EXPOSURE_TIME = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Long> SENSOR_FRAME_DURATION = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> SENSOR_PIXEL_MODE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> SENSOR_SENSITIVITY = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<int[]> SENSOR_TEST_PATTERN_DATA = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> SENSOR_TEST_PATTERN_MODE = null;
    private static final java.lang.String SET_TAG_STRING_PREFIX = "android.hardware.camera2.CaptureRequest.setTag.";
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> SHADING_MODE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> STATISTICS_FACE_DETECT_MODE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Boolean> STATISTICS_HOT_PIXEL_MAP_MODE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> STATISTICS_LENS_SHADING_MAP_MODE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> STATISTICS_OIS_DATA_MODE = null;
    @android.hardware.camera2.impl.PublicKey
    @android.hardware.camera2.impl.SyntheticKey
    public static final android.hardware.camera2.CaptureRequest.Key<android.hardware.camera2.params.TonemapCurve> TONEMAP_CURVE = null;
    public static final android.hardware.camera2.CaptureRequest.Key<float[]> TONEMAP_CURVE_BLUE = null;
    public static final android.hardware.camera2.CaptureRequest.Key<float[]> TONEMAP_CURVE_GREEN = null;
    public static final android.hardware.camera2.CaptureRequest.Key<float[]> TONEMAP_CURVE_RED = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Float> TONEMAP_GAMMA = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> TONEMAP_MODE = null;
    @android.hardware.camera2.impl.PublicKey
    public static final android.hardware.camera2.CaptureRequest.Key<java.lang.Integer> TONEMAP_PRESET_CURVE = null;
    private static final android.util.ArraySet<android.view.Surface> mEmptySurfaceSet = null;
    private final java.lang.String TAG = null;
    private boolean mIsPartOfCHSRequestList;
    private boolean mIsReprocess;
    private java.lang.String mLogicalCameraId;
    private android.hardware.camera2.impl.CameraMetadataNative mLogicalCameraSettings;
    private final java.util.HashMap<java.lang.String, android.hardware.camera2.impl.CameraMetadataNative> mPhysicalCameraSettings = null;
    private boolean mReleaseSurfaces;
    private int mReprocessableSessionId;
    private int mRequestType;
    private int[] mStreamIdxArray;
    private boolean mSurfaceConverted;
    private int[] mSurfaceIdxArray;
    private final android.util.ArraySet<android.view.Surface> mSurfaceSet = null;
    private final java.lang.Object mSurfacesLock = null;
    private java.lang.Object mUserTag;
    private CaptureRequest() { super(); }
    private CaptureRequest(android.hardware.camera2.CaptureRequest p0) { super(); }
    private CaptureRequest(android.hardware.camera2.impl.CameraMetadataNative p0, boolean p1, int p2, java.lang.String p3, java.util.Set<java.lang.String> p4) { super(); }
    private boolean equals(android.hardware.camera2.CaptureRequest p0) { return false; }
    private void readFromParcel(android.os.Parcel p0) {}
    public boolean containsTarget(android.view.Surface p0) { return false; }
    public void convertSurfaceToStreamId(android.util.SparseArray<android.hardware.camera2.params.OutputConfiguration> p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    protected void finalize() {}
    public <T extends java.lang.Object> T get(android.hardware.camera2.CaptureRequest.Key<T> p0) { return null; }
    protected java.lang.Class<android.hardware.camera2.CaptureRequest.Key<?>> getKeyClass() { return null; }
    public java.util.List<android.hardware.camera2.CaptureRequest.Key<?>> getKeys() { return null; }
    public java.lang.String getLogicalCameraId() { return null; }
    public android.hardware.camera2.impl.CameraMetadataNative getNativeCopy() { return null; }
    protected <T extends java.lang.Object> T getProtected(android.hardware.camera2.CaptureRequest.Key<?> p0) { return null; }
    public int getReprocessableSessionId() { return 0; }
    public int getRequestType() { return 0; }
    public int[] getStreamIds() { return null; }
    public int[] getSurfaceIds() { return null; }
    public java.lang.Object getTag() { return null; }
    public java.util.Collection<android.view.Surface> getTargets() { return null; }
    public int hashCode() { return 0; }
    public boolean isPartOfCRequestList() { return false; }
    public boolean isReprocess() { return false; }
    public void recoverStreamIdToSurface() {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private final android.hardware.camera2.CaptureRequest mRequest = null;
        public Builder(android.hardware.camera2.impl.CameraMetadataNative p0, boolean p1, int p2, java.lang.String p3, java.util.Set<java.lang.String> p4) {}
        public void addTarget(android.view.Surface p0) {}
        public android.hardware.camera2.CaptureRequest build() { return null; }
        public <T extends java.lang.Object> T get(android.hardware.camera2.CaptureRequest.Key<T> p0) { return null; }
        public <T extends java.lang.Object> T getPhysicalCameraKey(android.hardware.camera2.CaptureRequest.Key<T> p0, java.lang.String p1) { return null; }
        public boolean isEmpty() { return false; }
        public void removeTarget(android.view.Surface p0) {}
        public <T extends java.lang.Object> void set(android.hardware.camera2.CaptureRequest.Key<T> p0, T p1) {}
        public void setPartOfCHSRequestList(boolean p0) {}
        public <T extends java.lang.Object> android.hardware.camera2.CaptureRequest.Builder setPhysicalCameraKey(android.hardware.camera2.CaptureRequest.Key<T> p0, T p1, java.lang.String p2) { return null; }
        public void setTag(java.lang.Object p0) {}
    }

    public static final class Key<T extends java.lang.Object> {
        private final android.hardware.camera2.impl.CameraMetadataNative.Key<T> mKey = null;
        Key(android.hardware.camera2.impl.CameraMetadataNative.Key<?> p0) {}
        public Key(java.lang.String p0, android.hardware.camera2.utils.TypeReference<T> p1) {}
        public Key(java.lang.String p0, java.lang.Class<T> p1) {}
        public Key(java.lang.String p0, java.lang.Class<T> p1, long p2) {}
        public final boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String getName() { return null; }
        public android.hardware.camera2.impl.CameraMetadataNative.Key<T> getNativeKey() { return null; }
        public long getVendorId() { return 0L; }
        public final int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }
}
