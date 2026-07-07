package android.hardware.camera2.params;

public final class MandatoryStreamCombination {
    private static final long STREAM_USE_CASE_CROPPED_RAW = 6L;
    private static final long STREAM_USE_CASE_PREVIEW = 1L;
    private static final long STREAM_USE_CASE_PREVIEW_VIDEO_STILL = 4L;
    private static final long STREAM_USE_CASE_RECORD = 3L;
    private static final long STREAM_USE_CASE_STILL_CAPTURE = 2L;
    private static final long STREAM_USE_CASE_VIDEO_CALL = 5L;
    private static final java.lang.String TAG = "MandatoryStreamCombination";
    private static android.hardware.camera2.params.MandatoryStreamCombination.StreamCombinationTemplate[] s10BitOutputStreamCombinations;
    private static android.hardware.camera2.params.MandatoryStreamCombination.StreamCombinationTemplate[] sBurstCombinations;
    private static android.hardware.camera2.params.MandatoryStreamCombination.StreamCombinationTemplate[] sConcurrentDepthOnlyStreamCombinations;
    private static android.hardware.camera2.params.MandatoryStreamCombination.StreamCombinationTemplate[] sConcurrentStreamCombinations;
    private static android.hardware.camera2.params.MandatoryStreamCombination.StreamCombinationTemplate[] sCroppedRawStreamUseCaseCombinations;
    private static android.hardware.camera2.params.MandatoryStreamCombination.StreamCombinationTemplate[] sFullCombinations;
    private static android.hardware.camera2.params.MandatoryStreamCombination.StreamCombinationTemplate[] sFullPrivateReprocCombinations;
    private static android.hardware.camera2.params.MandatoryStreamCombination.StreamCombinationTemplate[] sFullYUVReprocCombinations;
    private static android.hardware.camera2.params.MandatoryStreamCombination.StreamCombinationTemplate[] sLegacyCombinations;
    private static android.hardware.camera2.params.MandatoryStreamCombination.StreamCombinationTemplate[] sLevel3Combinations;
    private static android.hardware.camera2.params.MandatoryStreamCombination.StreamCombinationTemplate[] sLevel3PrivateReprocCombinations;
    private static android.hardware.camera2.params.MandatoryStreamCombination.StreamCombinationTemplate[] sLevel3YUVReprocCombinations;
    private static android.hardware.camera2.params.MandatoryStreamCombination.StreamCombinationTemplate[] sLimitedCombinations;
    private static android.hardware.camera2.params.MandatoryStreamCombination.StreamCombinationTemplate[] sLimitedPrivateReprocCombinations;
    private static android.hardware.camera2.params.MandatoryStreamCombination.StreamCombinationTemplate[] sLimitedYUVReprocCombinations;
    private static android.hardware.camera2.params.MandatoryStreamCombination.StreamCombinationTemplate[] sPreviewStabilizedStreamCombinations;
    private static android.hardware.camera2.params.MandatoryStreamCombination.StreamCombinationTemplate[] sRAWPrivateReprocCombinations;
    private static android.hardware.camera2.params.MandatoryStreamCombination.StreamCombinationTemplate[] sRAWYUVReprocCombinations;
    private static android.hardware.camera2.params.MandatoryStreamCombination.StreamCombinationTemplate[] sRawCombinations;
    private static android.hardware.camera2.params.MandatoryStreamCombination.StreamCombinationTemplate[] sStreamUseCaseCombinations;
    private static android.hardware.camera2.params.MandatoryStreamCombination.StreamCombinationTemplate[] sUltraHighResolutionPRIVReprocStreamCombinations;
    private static android.hardware.camera2.params.MandatoryStreamCombination.StreamCombinationTemplate[] sUltraHighResolutionReprocStreamCombinations;
    private static android.hardware.camera2.params.MandatoryStreamCombination.StreamCombinationTemplate[] sUltraHighResolutionStreamCombinations;
    private static android.hardware.camera2.params.MandatoryStreamCombination.StreamCombinationTemplate[] sUltraHighResolutionYUVReprocStreamCombinations;
    private final java.lang.String mDescription = null;
    private final boolean mIsReprocessable = false;
    private final java.util.ArrayList<android.hardware.camera2.params.MandatoryStreamCombination.MandatoryStreamInformation> mStreamsInformation = null;
    public MandatoryStreamCombination(java.util.List<android.hardware.camera2.params.MandatoryStreamCombination.MandatoryStreamInformation> p0, java.lang.String p1, boolean p2) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.CharSequence getDescription() { return null; }
    public java.util.List<android.hardware.camera2.params.MandatoryStreamCombination.MandatoryStreamInformation> getStreamsInformation() { return null; }
    public int hashCode() { return 0; }
    public boolean isReprocessable() { return false; }

    public static final class Builder {
        private final android.util.Size kPreviewSizeBound = null;
        private int mCameraId;
        private java.util.List<java.lang.Integer> mCapabilities;
        private android.util.Size mDisplaySize;
        private int mHwLevel;
        private boolean mIsCroppedRawSupported;
        private boolean mIsHiddenPhysicalCamera;
        private boolean mIsPreviewStabilizationSupported;
        private android.hardware.camera2.params.StreamConfigurationMap mStreamConfigMap;
        private android.hardware.camera2.params.StreamConfigurationMap mStreamConfigMapMaximumResolution;
        public Builder(int p0, int p1, android.util.Size p2, java.util.List<java.lang.Integer> p3, android.hardware.camera2.params.StreamConfigurationMap p4, android.hardware.camera2.params.StreamConfigurationMap p5, boolean p6, boolean p7) {}
        private android.hardware.camera2.params.MandatoryStreamCombination createUHSensorMandatoryStreamCombination(android.hardware.camera2.params.MandatoryStreamCombination.StreamCombinationTemplate p0, int p1) { return null; }
        private java.util.HashMap<android.util.Pair<android.hardware.camera2.params.MandatoryStreamCombination.SizeThreshold, java.lang.Integer>, java.util.List<android.util.Size>> enumerateAvailableSizes() { return null; }
        private void fillUHMandatoryStreamCombinations(java.util.ArrayList<android.hardware.camera2.params.MandatoryStreamCombination> p0, java.util.ArrayList<android.hardware.camera2.params.MandatoryStreamCombination.StreamCombinationTemplate> p1) {}
        private java.util.List<android.hardware.camera2.params.MandatoryStreamCombination> generateAvailableCombinations(java.util.ArrayList<android.hardware.camera2.params.MandatoryStreamCombination.StreamCombinationTemplate> p0) { return null; }
        private static java.util.List<android.util.Size> getAscendingOrderSizes(java.util.List<android.util.Size> p0, boolean p1) { return null; }
        private java.util.List<android.hardware.camera2.params.MandatoryStreamCombination> getAvailableMandatoryStreamCombinationsInternal(android.hardware.camera2.params.MandatoryStreamCombination.StreamCombinationTemplate[] p0, boolean p1) { return null; }
        private android.util.Size getMaxCameraRecordingSize() { return null; }
        private android.util.Size getMaxPreviewSize(java.util.List<android.util.Size> p0) { return null; }
        private android.util.Size getMaxRecordingSize() { return null; }
        public static android.util.Size getMaxSize(android.util.Size... p0) { return null; }
        public static android.util.Size getMaxSizeOrNull(android.util.Size... p0) { return null; }
        public static android.util.Size getMinSize(android.util.Size p0, android.util.Size p1) { return null; }
        private static java.util.List<android.util.Size> getSizesWithinBound(android.util.Size[] p0, android.util.Size p1) { return null; }
        private boolean is10BitOutputSupported() { return false; }
        private boolean isCapabilitySupported(int p0) { return false; }
        private boolean isColorOutputSupported() { return false; }
        private boolean isExternalCamera() { return false; }
        private boolean isHardwareLevelAtLeast(int p0) { return false; }
        private boolean isHardwareLevelAtLeastFull() { return false; }
        private boolean isHardwareLevelAtLeastLegacy() { return false; }
        private boolean isHardwareLevelAtLeastLevel3() { return false; }
        private boolean isHardwareLevelAtLeastLimited() { return false; }
        private boolean isPrivateReprocessingSupported() { return false; }
        private boolean isRemosaicReprocessingSupported() { return false; }
        private boolean isYUVReprocessingSupported() { return false; }
        public java.util.List<android.hardware.camera2.params.MandatoryStreamCombination> getAvailableMandatory10BitStreamCombinations() { return null; }
        public java.util.List<android.hardware.camera2.params.MandatoryStreamCombination> getAvailableMandatoryConcurrentStreamCombinations() { return null; }
        public java.util.List<android.hardware.camera2.params.MandatoryStreamCombination> getAvailableMandatoryMaximumResolutionStreamCombinations() { return null; }
        public java.util.List<android.hardware.camera2.params.MandatoryStreamCombination> getAvailableMandatoryPreviewStabilizedStreamCombinations() { return null; }
        public java.util.List<android.hardware.camera2.params.MandatoryStreamCombination> getAvailableMandatoryStreamCombinations() { return null; }
        public java.util.List<android.hardware.camera2.params.MandatoryStreamCombination> getAvailableMandatoryStreamUseCaseCombinations() { return null; }

        public static class SizeComparator implements java.util.Comparator<android.util.Size> {
            public SizeComparator() {}
            public int compare(android.util.Size p0, android.util.Size p1) { return 0; }
        }
    }

    public static final class MandatoryStreamInformation {
        private final java.util.ArrayList<android.util.Size> mAvailableSizes = null;
        private final int mFormat = 0;
        private final boolean mIs10BitCapable = false;
        private final boolean mIsInput = false;
        private final boolean mIsMaximumSize = false;
        private final boolean mIsUltraHighResolution = false;
        private final long mStreamUseCase = 0L;
        public MandatoryStreamInformation(java.util.List<android.util.Size> p0, int p1, boolean p2) {}
        public MandatoryStreamInformation(java.util.List<android.util.Size> p0, int p1, boolean p2, boolean p3) {}
        public MandatoryStreamInformation(java.util.List<android.util.Size> p0, int p1, boolean p2, boolean p3, boolean p4) {}
        public MandatoryStreamInformation(java.util.List<android.util.Size> p0, int p1, boolean p2, boolean p3, boolean p4, boolean p5) {}
        public MandatoryStreamInformation(java.util.List<android.util.Size> p0, int p1, boolean p2, boolean p3, boolean p4, boolean p5, long p6) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int get10BitFormat() { return 0; }
        public java.util.List<android.util.Size> getAvailableSizes() { return null; }
        public int getFormat() { return 0; }
        public long getStreamUseCase() { return 0L; }
        public int hashCode() { return 0; }
        public boolean is10BitCapable() { return false; }
        public boolean isInput() { return false; }
        public boolean isMaximumSize() { return false; }
        public boolean isUltraHighResolution() { return false; }
    }

    private static enum ReprocessType {
        NONE,
        PRIVATE,
        REMOSAIC,
        YUV;
        private static final android.hardware.camera2.params.MandatoryStreamCombination.ReprocessType[] $VALUES = null;
        private ReprocessType() {}
    }

    private static enum SizeThreshold {
        FULL_RES,
        MAXIMUM,
        PREVIEW,
        RECORD,
        VGA,
        s1440p,
        s720p;
        private static final android.hardware.camera2.params.MandatoryStreamCombination.SizeThreshold[] $VALUES = null;
        private SizeThreshold() {}
    }

    private static final class StreamCombinationTemplate {
        public java.lang.String mDescription;
        public android.hardware.camera2.params.MandatoryStreamCombination.ReprocessType mReprocessType;
        public android.hardware.camera2.params.MandatoryStreamCombination.StreamTemplate[] mStreamTemplates;
        public boolean mSubstituteYUV;
        public StreamCombinationTemplate(android.hardware.camera2.params.MandatoryStreamCombination.StreamTemplate[] p0, java.lang.String p1) {}
        public StreamCombinationTemplate(android.hardware.camera2.params.MandatoryStreamCombination.StreamTemplate[] p0, java.lang.String p1, android.hardware.camera2.params.MandatoryStreamCombination.ReprocessType p2) {}
        public StreamCombinationTemplate(android.hardware.camera2.params.MandatoryStreamCombination.StreamTemplate[] p0, java.lang.String p1, android.hardware.camera2.params.MandatoryStreamCombination.ReprocessType p2, boolean p3) {}
        public StreamCombinationTemplate(android.hardware.camera2.params.MandatoryStreamCombination.StreamTemplate[] p0, java.lang.String p1, boolean p2) {}
    }

    private static final class StreamTemplate {
        public int mFormat;
        public android.hardware.camera2.params.MandatoryStreamCombination.SizeThreshold mSizeThreshold;
        public long mStreamUseCase;
        public StreamTemplate(int p0, android.hardware.camera2.params.MandatoryStreamCombination.SizeThreshold p1) {}
        public StreamTemplate(int p0, android.hardware.camera2.params.MandatoryStreamCombination.SizeThreshold p1, long p2) {}
    }
}
