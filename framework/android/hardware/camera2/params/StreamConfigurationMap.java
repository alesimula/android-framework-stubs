package android.hardware.camera2.params;

public final class StreamConfigurationMap {
    private static final long DURATION_20FPS_NS = 50000000L;
    private static final int DURATION_MIN_FRAME = 0;
    private static final int DURATION_STALL = 1;
    public static final int HAL_DATASPACE_ARBITRARY = 1;
    public static final int HAL_DATASPACE_DEPTH = 4096;
    public static final int HAL_DATASPACE_DYNAMIC_DEPTH = 4098;
    public static final int HAL_DATASPACE_HEIF = 4100;
    public static final int HAL_DATASPACE_JFIF = 146931712;
    public static final int HAL_DATASPACE_JPEG_R = 4101;
    private static final int HAL_DATASPACE_RANGE_SHIFT = 27;
    private static final int HAL_DATASPACE_STANDARD_SHIFT = 16;
    private static final int HAL_DATASPACE_TRANSFER_SHIFT = 22;
    private static final int HAL_DATASPACE_UNKNOWN = 0;
    public static final int HAL_DATASPACE_V0_JFIF = 146931712;
    public static final int HAL_PIXEL_FORMAT_BLOB = 33;
    private static final int HAL_PIXEL_FORMAT_IMPLEMENTATION_DEFINED = 34;
    private static final int HAL_PIXEL_FORMAT_RAW10 = 37;
    private static final int HAL_PIXEL_FORMAT_RAW12 = 38;
    private static final int HAL_PIXEL_FORMAT_RAW16 = 32;
    private static final int HAL_PIXEL_FORMAT_RAW_OPAQUE = 36;
    private static final int HAL_PIXEL_FORMAT_RGBA_8888 = 1;
    private static final int HAL_PIXEL_FORMAT_RGBX_8888 = 2;
    private static final int HAL_PIXEL_FORMAT_RGB_565 = 4;
    private static final int HAL_PIXEL_FORMAT_RGB_888 = 3;
    private static final int HAL_PIXEL_FORMAT_Y16 = 540422489;
    private static final int HAL_PIXEL_FORMAT_Y8 = 538982489;
    private static final int HAL_PIXEL_FORMAT_YCBCR_420_888 = 35;
    private static final int HAL_PIXEL_FORMAT_YCBCR_422_I = 20;
    private static final int HAL_PIXEL_FORMAT_YCBCR_422_SP = 16;
    private static final int HAL_PIXEL_FORMAT_YCBCR_P010 = 54;
    private static final int HAL_PIXEL_FORMAT_YCBCR_P210 = 60;
    private static final int HAL_PIXEL_FORMAT_YCRCB_420_SP = 17;
    private static final int HAL_PIXEL_FORMAT_YV12 = 842094169;
    private static final int MAX_DIMEN_FOR_ROUNDING = 1920;
    private static final java.lang.String TAG = "StreamConfigurationMap";
    private final android.util.SparseIntArray mAllOutputFormats = null;
    private final android.hardware.camera2.params.StreamConfiguration[] mConfigurations = null;
    private final android.hardware.camera2.params.StreamConfiguration[] mDepthConfigurations = null;
    private final android.hardware.camera2.params.StreamConfigurationDuration[] mDepthMinFrameDurations = null;
    private final android.util.SparseIntArray mDepthOutputFormats = null;
    private final android.hardware.camera2.params.StreamConfigurationDuration[] mDepthStallDurations = null;
    private final android.hardware.camera2.params.StreamConfiguration[] mDynamicDepthConfigurations = null;
    private final android.hardware.camera2.params.StreamConfigurationDuration[] mDynamicDepthMinFrameDurations = null;
    private final android.util.SparseIntArray mDynamicDepthOutputFormats = null;
    private final android.hardware.camera2.params.StreamConfigurationDuration[] mDynamicDepthStallDurations = null;
    private final android.hardware.camera2.params.StreamConfiguration[] mHeicConfigurations = null;
    private final android.hardware.camera2.params.StreamConfigurationDuration[] mHeicMinFrameDurations = null;
    private final android.util.SparseIntArray mHeicOutputFormats = null;
    private final android.hardware.camera2.params.StreamConfigurationDuration[] mHeicStallDurations = null;
    private final android.hardware.camera2.params.StreamConfiguration[] mHeicUltraHDRConfigurations = null;
    private final android.hardware.camera2.params.StreamConfigurationDuration[] mHeicUltraHDRMinFrameDurations = null;
    private final android.util.SparseIntArray mHeicUltraHDROutputFormats = null;
    private final android.hardware.camera2.params.StreamConfigurationDuration[] mHeicUltraHDRStallDurations = null;
    private final android.util.SparseIntArray mHighResOutputFormats = null;
    private final android.hardware.camera2.params.HighSpeedVideoConfiguration[] mHighSpeedVideoConfigurations = null;
    private final java.util.HashMap<android.util.Range<java.lang.Integer>, java.lang.Integer> mHighSpeedVideoFpsRangeMap = null;
    private final java.util.HashMap<android.util.Size, java.lang.Integer> mHighSpeedVideoSizeMap = null;
    private final android.util.SparseIntArray mInputFormats = null;
    private final android.hardware.camera2.params.ReprocessFormatsMap mInputOutputFormatsMap = null;
    private final android.hardware.camera2.params.StreamConfiguration[] mJpegRConfigurations = null;
    private final android.hardware.camera2.params.StreamConfigurationDuration[] mJpegRMinFrameDurations = null;
    private final android.util.SparseIntArray mJpegROutputFormats = null;
    private final android.hardware.camera2.params.StreamConfigurationDuration[] mJpegRStallDurations = null;
    private final boolean mListHighResolution = false;
    private final android.hardware.camera2.params.StreamConfigurationDuration[] mMinFrameDurations = null;
    private final android.util.SparseIntArray mOutputFormats = null;
    private final android.hardware.camera2.params.StreamConfigurationDuration[] mStallDurations = null;
    public StreamConfigurationMap(android.hardware.camera2.params.StreamConfiguration[] p0, android.hardware.camera2.params.StreamConfigurationDuration[] p1, android.hardware.camera2.params.StreamConfigurationDuration[] p2, android.hardware.camera2.params.StreamConfiguration[] p3, android.hardware.camera2.params.StreamConfigurationDuration[] p4, android.hardware.camera2.params.StreamConfigurationDuration[] p5, android.hardware.camera2.params.StreamConfiguration[] p6, android.hardware.camera2.params.StreamConfigurationDuration[] p7, android.hardware.camera2.params.StreamConfigurationDuration[] p8, android.hardware.camera2.params.StreamConfiguration[] p9, android.hardware.camera2.params.StreamConfigurationDuration[] p10, android.hardware.camera2.params.StreamConfigurationDuration[] p11, android.hardware.camera2.params.StreamConfiguration[] p12, android.hardware.camera2.params.StreamConfigurationDuration[] p13, android.hardware.camera2.params.StreamConfigurationDuration[] p14, android.hardware.camera2.params.StreamConfiguration[] p15, android.hardware.camera2.params.StreamConfigurationDuration[] p16, android.hardware.camera2.params.StreamConfigurationDuration[] p17, android.hardware.camera2.params.HighSpeedVideoConfiguration[] p18, android.hardware.camera2.params.ReprocessFormatsMap p19, boolean p20) {}
    public StreamConfigurationMap(android.hardware.camera2.params.StreamConfiguration[] p0, android.hardware.camera2.params.StreamConfigurationDuration[] p1, android.hardware.camera2.params.StreamConfigurationDuration[] p2, android.hardware.camera2.params.StreamConfiguration[] p3, android.hardware.camera2.params.StreamConfigurationDuration[] p4, android.hardware.camera2.params.StreamConfigurationDuration[] p5, android.hardware.camera2.params.StreamConfiguration[] p6, android.hardware.camera2.params.StreamConfigurationDuration[] p7, android.hardware.camera2.params.StreamConfigurationDuration[] p8, android.hardware.camera2.params.StreamConfiguration[] p9, android.hardware.camera2.params.StreamConfigurationDuration[] p10, android.hardware.camera2.params.StreamConfigurationDuration[] p11, android.hardware.camera2.params.StreamConfiguration[] p12, android.hardware.camera2.params.StreamConfigurationDuration[] p13, android.hardware.camera2.params.StreamConfigurationDuration[] p14, android.hardware.camera2.params.StreamConfiguration[] p15, android.hardware.camera2.params.StreamConfigurationDuration[] p16, android.hardware.camera2.params.StreamConfigurationDuration[] p17, android.hardware.camera2.params.HighSpeedVideoConfiguration[] p18, android.hardware.camera2.params.ReprocessFormatsMap p19, boolean p20, boolean p21) {}
    private void appendHighResOutputsString(java.lang.StringBuilder p0) {}
    private void appendHighSpeedVideoConfigurationsString(java.lang.StringBuilder p0) {}
    private void appendInputsString(java.lang.StringBuilder p0) {}
    private void appendOutputsString(java.lang.StringBuilder p0) {}
    private void appendValidOutputFormatsForInputString(java.lang.StringBuilder p0) {}
    private static <T extends java.lang.Object> boolean arrayContains(T[] p0, T p1) { return false; }
    static int checkArgumentFormat(int p0) { return 0; }
    static int checkArgumentFormatInternal(int p0) { return 0; }
    private int checkArgumentFormatSupported(int p0, boolean p1) { return 0; }
    public static int compareSizes(int p0, int p1, int p2, int p3) { return 0; }
    public static int depthFormatToPublic(int p0) { return 0; }
    public static java.lang.String formatToString(int p0) { return null; }
    private android.hardware.camera2.params.StreamConfigurationDuration[] getDurations(int p0, int p1) { return null; }
    private android.util.SparseIntArray getFormatsMap(boolean p0) { return null; }
    private long getInternalFormatDuration(int p0, int p1, android.util.Size p2, int p3) { return 0L; }
    private android.util.Size[] getInternalFormatSizes(int p0, int p1, boolean p2, boolean p3) { return null; }
    private int getPublicFormatCount(boolean p0) { return 0; }
    private android.util.Size[] getPublicFormatSizes(int p0, boolean p1, boolean p2) { return null; }
    private int[] getPublicFormats(boolean p0) { return null; }
    static int imageFormatToDataspace(int p0) { return 0; }
    static int imageFormatToInternal(int p0) { return 0; }
    public static int[] imageFormatToInternal(int[] p0) { return null; }
    public static int imageFormatToPublic(int p0) { return 0; }
    static int[] imageFormatToPublic(int[] p0) { return null; }
    static int internalFormatAndDataspaceToImageFormat(int p0, int p1) { return 0; }
    public static <T extends java.lang.Object> boolean isOutputSupportedFor(java.lang.Class<T> p0) { return false; }
    private boolean isSupportedInternalConfiguration(int p0, int p1, android.util.Size p2) { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.util.Size[] getHighResolutionOutputSizes(int p0) { return null; }
    public android.util.Range<java.lang.Integer>[] getHighSpeedVideoFpsRanges() { return null; }
    public android.util.Range<java.lang.Integer>[] getHighSpeedVideoFpsRangesFor(android.util.Size p0) { return null; }
    public android.util.Size[] getHighSpeedVideoSizes() { return null; }
    public android.util.Size[] getHighSpeedVideoSizesFor(android.util.Range<java.lang.Integer> p0) { return null; }
    public int[] getInputFormats() { return null; }
    public android.util.Size[] getInputSizes(int p0) { return null; }
    public int[] getOutputFormats() { return null; }
    public long getOutputMinFrameDuration(int p0, android.util.Size p1) { return 0L; }
    public <T extends java.lang.Object> long getOutputMinFrameDuration(java.lang.Class<T> p0, android.util.Size p1) { return 0L; }
    public android.util.Size[] getOutputSizes(int p0) { return null; }
    public <T extends java.lang.Object> android.util.Size[] getOutputSizes(java.lang.Class<T> p0) { return null; }
    public long getOutputStallDuration(int p0, android.util.Size p1) { return 0L; }
    public <T extends java.lang.Object> long getOutputStallDuration(java.lang.Class<T> p0, android.util.Size p1) { return 0L; }
    public int[] getValidOutputFormatsForInput(int p0) { return null; }
    public int hashCode() { return 0; }
    public boolean isOutputSupportedFor(int p0) { return false; }
    public boolean isOutputSupportedFor(android.util.Size p0, int p1) { return false; }
    public boolean isOutputSupportedFor(android.view.Surface p0) { return false; }
    public java.lang.String toString() { return null; }
}
