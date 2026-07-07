package android.hardware.camera2.impl;

public class CameraMetadataNative implements android.os.Parcelable {
    private static final java.lang.String CELLID_PROCESS = "CELLID";
    public static final android.os.Parcelable.Creator<android.hardware.camera2.impl.CameraMetadataNative> CREATOR = null;
    private static final boolean DEBUG = false;
    private static final int FACE_LANDMARK_SIZE = 6;
    private static final java.lang.String GPS_PROCESS = "GPS";
    private static final int MANDATORY_STREAM_CONFIGURATIONS_10BIT = 3;
    private static final int MANDATORY_STREAM_CONFIGURATIONS_CONCURRENT = 2;
    private static final int MANDATORY_STREAM_CONFIGURATIONS_DEFAULT = 0;
    private static final int MANDATORY_STREAM_CONFIGURATIONS_MAX_RESOLUTION = 1;
    private static final int MANDATORY_STREAM_CONFIGURATIONS_PREVIEW_STABILIZATION = 5;
    private static final int MANDATORY_STREAM_CONFIGURATIONS_USE_CASE = 4;
    public static final int NATIVE_JPEG_FORMAT = 33;
    public static final int NUM_TYPES = 6;
    private static final java.lang.String TAG = "CameraMetadataJV";
    public static final int TYPE_BYTE = 0;
    public static final int TYPE_DOUBLE = 4;
    public static final int TYPE_FLOAT = 2;
    public static final int TYPE_INT32 = 1;
    public static final int TYPE_INT64 = 3;
    public static final int TYPE_RATIONAL = 5;
    private static final java.util.HashMap<android.hardware.camera2.impl.CameraMetadataNative.Key<?>, android.hardware.camera2.impl.GetCommand> sGetCommandMap = null;
    private static final java.util.HashMap<android.hardware.camera2.impl.CameraMetadataNative.Key<?>, android.hardware.camera2.impl.SetCommand> sSetCommandMap = null;
    private long mBufferSize;
    private int mCameraId;
    private android.util.Size mDisplaySize;
    private boolean mHasMandatoryConcurrentStreams;
    private long mMetadataPtr;
    private android.hardware.camera2.params.MultiResolutionStreamConfigurationMap mMultiResolutionStreamConfigurationMap;
    public CameraMetadataNative() {}
    public CameraMetadataNative(long p0) {}
    public CameraMetadataNative(android.hardware.camera2.impl.CameraMetadataNative p0) {}
    private static boolean areValuesAllNull(java.lang.Object... p0) { return false; }
    private void close() {}
    private int[] getAvailableFormats() { return null; }
    private <T extends java.lang.Object> T getBase(android.hardware.camera2.CameraCharacteristics.Key<T> p0) { return null; }
    private <T extends java.lang.Object> T getBase(android.hardware.camera2.CaptureRequest.Key<T> p0) { return null; }
    private <T extends java.lang.Object> T getBase(android.hardware.camera2.CaptureResult.Key<T> p0) { return null; }
    private <T extends java.lang.Object> T getBase(android.hardware.camera2.impl.CameraMetadataNative.Key<T> p0) { return null; }
    private android.hardware.camera2.params.ColorSpaceProfiles getColorSpaceProfiles() { return null; }
    private android.hardware.camera2.params.DeviceStateSensorOrientationMap getDeviceStateOrientationMap() { return null; }
    private android.hardware.camera2.params.DynamicRangeProfiles getDynamicRangeProfiles() { return null; }
    private android.hardware.camera2.params.Capability[] getExtendedSceneModeCapabilities() { return null; }
    private android.graphics.Rect[] getFaceRectangles() { return null; }
    private android.hardware.camera2.params.Face[] getFaces() { return null; }
    private android.location.Location getGpsLocation() { return null; }
    private android.hardware.camera2.params.LensIntrinsicsSample[] getLensIntrinsicSamples() { return null; }
    private android.hardware.camera2.params.LensShadingMap getLensShadingMap() { return null; }
    private android.hardware.camera2.params.MandatoryStreamCombination[] getMandatory10BitStreamCombinations() { return null; }
    private android.hardware.camera2.params.MandatoryStreamCombination[] getMandatoryConcurrentStreamCombinations() { return null; }
    private android.hardware.camera2.params.MandatoryStreamCombination[] getMandatoryMaximumResolutionStreamCombinations() { return null; }
    private android.hardware.camera2.params.MandatoryStreamCombination[] getMandatoryPreviewStabilizationStreamCombinations() { return null; }
    private android.hardware.camera2.params.MandatoryStreamCombination[] getMandatoryStreamCombinations() { return null; }
    private android.hardware.camera2.params.MandatoryStreamCombination[] getMandatoryStreamCombinationsHelper(int p0) { return null; }
    private android.hardware.camera2.params.MandatoryStreamCombination[] getMandatoryUseCaseStreamCombinations() { return null; }
    private static <T extends java.lang.Object> android.hardware.camera2.marshal.Marshaler<T> getMarshalerForKey(android.hardware.camera2.impl.CameraMetadataNative.Key<T> p0, int p1) { return null; }
    private <T extends java.lang.Object> java.lang.Integer getMaxNumOutputs(android.hardware.camera2.impl.CameraMetadataNative.Key<T> p0) { return null; }
    private <T extends java.lang.Object> java.lang.Integer getMaxRegions(android.hardware.camera2.impl.CameraMetadataNative.Key<T> p0) { return null; }
    public static int getNativeType(int p0, long p1) { return 0; }
    private android.hardware.camera2.params.OisSample[] getOisSamples() { return null; }
    private android.hardware.camera2.params.SharedSessionConfiguration getSharedSessionConfiguration() { return null; }
    private android.hardware.camera2.params.StreamConfigurationMap getStreamConfigurationMap() { return null; }
    private android.hardware.camera2.params.StreamConfigurationMap getStreamConfigurationMapMaximumResolution() { return null; }
    public static int getTag(java.lang.String p0) { return 0; }
    public static int getTag(java.lang.String p0, long p1) { return 0; }
    private <T extends java.lang.Object> android.hardware.camera2.params.TonemapCurve getTonemapCurve() { return null; }
    private boolean isBurstSupported() { return false; }
    private boolean isCapabilitySupported(int p0) { return false; }
    private boolean isCroppedRawSupported() { return false; }
    private boolean isPreviewStabilizationSupported() { return false; }
    public static android.hardware.camera2.impl.CameraMetadataNative move(android.hardware.camera2.impl.CameraMetadataNative p0) { return null; }
    private static native long nativeAllocate();
    private static native long nativeAllocateCopy(long p0) throws java.lang.NullPointerException;
    private static native void nativeClose(long p0);
    private static native void nativeDump(long p0) throws java.io.IOException;
    private static native java.util.ArrayList nativeGetAllVendorKeys(long p0, java.lang.Class p1);
    private static native long nativeGetBufferSize(long p0);
    private static native int nativeGetEntryCount(long p0);
    private static native int nativeGetTagFromKey(java.lang.String p0, long p1) throws java.lang.IllegalArgumentException;
    private static native int nativeGetTagFromKeyLocal(long p0, java.lang.String p1) throws java.lang.IllegalArgumentException;
    private static native int nativeGetTypeFromTag(int p0, long p1) throws java.lang.IllegalArgumentException;
    private static native int nativeGetTypeFromTagLocal(long p0, int p1) throws java.lang.IllegalArgumentException;
    private static native boolean nativeIsEmpty(long p0);
    private static native void nativeReadFromParcel(android.os.Parcel p0, long p1);
    private static native byte[] nativeReadValues(int p0, long p1);
    private static native void nativeSetVendorId(long p0, long p1);
    private static native int nativeSetupGlobalVendorTagDescriptor();
    private static native void nativeSwap(long p0, long p1) throws java.lang.NullPointerException;
    private static native void nativeUpdate(long p0, long p1);
    private static native void nativeWriteToParcel(android.os.Parcel p0, long p1);
    private static native void nativeWriteValues(int p0, byte[] p1, long p2);
    private void parseRecommendedConfigurations(android.hardware.camera2.params.RecommendedStreamConfiguration[] p0, android.hardware.camera2.params.StreamConfigurationMap p1, boolean p2, java.util.ArrayList<java.util.ArrayList<android.hardware.camera2.params.StreamConfiguration>> p3, java.util.ArrayList<java.util.ArrayList<android.hardware.camera2.params.StreamConfigurationDuration>> p4, java.util.ArrayList<java.util.ArrayList<android.hardware.camera2.params.StreamConfigurationDuration>> p5, boolean[] p6) {}
    private static void registerAllMarshalers() {}
    private <T extends java.lang.Object> boolean setAERegions(T p0) { return false; }
    private <T extends java.lang.Object> boolean setAFRegions(T p0) { return false; }
    private <T extends java.lang.Object> boolean setAWBRegions(T p0) { return false; }
    private boolean setAvailableFormats(int[] p0) { return false; }
    private <T extends java.lang.Object> void setBase(android.hardware.camera2.CameraCharacteristics.Key<T> p0, T p1) {}
    private <T extends java.lang.Object> void setBase(android.hardware.camera2.CaptureRequest.Key<T> p0, T p1) {}
    private <T extends java.lang.Object> void setBase(android.hardware.camera2.CaptureResult.Key<T> p0, T p1) {}
    private <T extends java.lang.Object> void setBase(android.hardware.camera2.impl.CameraMetadataNative.Key<T> p0, T p1) {}
    private boolean setFaceRectangles(android.graphics.Rect[] p0) { return false; }
    private boolean setFaces(android.hardware.camera2.params.Face[] p0) { return false; }
    private boolean setGpsLocation(android.location.Location p0) { return false; }
    private boolean setLensIntrinsicsSamples(android.hardware.camera2.params.LensIntrinsicsSample[] p0) { return false; }
    private boolean setLensShadingMap(android.hardware.camera2.params.LensShadingMap p0) { return false; }
    private <T extends java.lang.Object> boolean setScalerCropRegion(android.graphics.Rect p0) { return false; }
    private <T extends java.lang.Object> boolean setTonemapCurve(android.hardware.camera2.params.TonemapCurve p0) { return false; }
    public static void setupGlobalVendorTagDescriptor() throws android.os.ServiceSpecificException {}
    private static java.lang.String translateLocationProviderToProcess(java.lang.String p0) { return null; }
    private static java.lang.String translateProcessToLocationProvider(java.lang.String p0) { return null; }
    public static void update(android.hardware.camera2.impl.CameraMetadataNative p0, android.hardware.camera2.impl.CameraMetadataNative p1) {}
    private void updateNativeAllocation() {}
    public int describeContents() { return 0; }
    public void dumpToLog() {}
    protected void finalize() throws java.lang.Throwable {}
    public <T extends java.lang.Object> T get(android.hardware.camera2.CameraCharacteristics.Key<T> p0) { return null; }
    public <T extends java.lang.Object> T get(android.hardware.camera2.CaptureRequest.Key<T> p0) { return null; }
    public <T extends java.lang.Object> T get(android.hardware.camera2.CaptureResult.Key<T> p0) { return null; }
    public <T extends java.lang.Object> T get(android.hardware.camera2.impl.CameraMetadataNative.Key<T> p0) { return null; }
    public <K extends java.lang.Object> java.util.ArrayList<K> getAllVendorKeys(java.lang.Class<K> p0) { return null; }
    public int getEntryCount() { return 0; }
    public long getMetadataPtr() { return 0L; }
    public android.hardware.camera2.params.MultiResolutionStreamConfigurationMap getMultiResolutionStreamConfigurationMap() { return null; }
    public java.util.Set<java.lang.String> getPhysicalCameraIds() { return null; }
    public java.util.ArrayList<android.hardware.camera2.params.RecommendedStreamConfigurationMap> getRecommendedStreamConfigurations() { return null; }
    public void initializeStreamConfigurationData(java.util.ArrayList<android.hardware.camera2.params.StreamConfiguration> p0, java.util.ArrayList<android.hardware.camera2.params.StreamConfigurationDuration> p1, java.util.ArrayList<android.hardware.camera2.params.StreamConfigurationDuration> p2, android.hardware.camera2.impl.CameraMetadataNative.StreamConfigurationData p3) {}
    public boolean isEmpty() { return false; }
    public boolean isUltraHighResolutionSensor() { return false; }
    public void readFromParcel(android.os.Parcel p0) {}
    public byte[] readValues(int p0) { return null; }
    public <T extends java.lang.Object> void set(android.hardware.camera2.CameraCharacteristics.Key<T> p0, T p1) {}
    public <T extends java.lang.Object> void set(android.hardware.camera2.CaptureRequest.Key<T> p0, T p1) {}
    public <T extends java.lang.Object> void set(android.hardware.camera2.CaptureResult.Key<T> p0, T p1) {}
    public <T extends java.lang.Object> void set(android.hardware.camera2.impl.CameraMetadataNative.Key<T> p0, T p1) {}
    public void setCameraId(int p0) {}
    public void setDisplaySize(android.util.Size p0) {}
    public void setHasMandatoryConcurrentStreams(boolean p0) {}
    public void setMultiResolutionStreamConfigurationMap(java.util.Map<java.lang.String, android.hardware.camera2.params.StreamConfiguration[]> p0) {}
    public void setVendorId(long p0) {}
    public void swap(android.hardware.camera2.impl.CameraMetadataNative p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void writeValues(int p0, byte[] p1) {}

    public static class Key<T extends java.lang.Object> {
        private final java.lang.String mFallbackName = null;
        private boolean mHasTag;
        private final int mHash = 0;
        private final java.lang.String mName = null;
        private int mTag;
        private final java.lang.Class<T> mType = null;
        private final android.hardware.camera2.utils.TypeReference<T> mTypeReference = null;
        private long mVendorId;
        public Key(java.lang.String p0, android.hardware.camera2.utils.TypeReference<T> p1) {}
        public Key(java.lang.String p0, java.lang.Class<T> p1) {}
        public Key(java.lang.String p0, java.lang.Class<T> p1, long p2) {}
        public Key(java.lang.String p0, java.lang.String p1, java.lang.Class<T> p2) {}
        public final void cacheTag(int p0) {}
        public final boolean equals(java.lang.Object p0) { return false; }
        public final java.lang.String getName() { return null; }
        public final int getTag() { return 0; }
        public final java.lang.Class<T> getType() { return null; }
        public final android.hardware.camera2.utils.TypeReference<T> getTypeReference() { return null; }
        public final long getVendorId() { return 0L; }
        public final boolean hasTag() { return false; }
        public final int hashCode() { return 0; }
    }

    private class StreamConfigurationData {
        android.hardware.camera2.params.StreamConfigurationDuration[] minDurationArray;
        android.hardware.camera2.params.StreamConfigurationDuration[] stallDurationArray;
        android.hardware.camera2.params.StreamConfiguration[] streamConfigurationArray;
        private StreamConfigurationData(android.hardware.camera2.impl.CameraMetadataNative p0) {}
    }
}
