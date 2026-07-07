package android.hardware.camera2.params;

public final class DynamicRangeProfiles {
    public static final long CURRENT_MAX = 33554432L;
    public static final long DOLBY_VISION_10B_HDR_OEM = 64L;
    public static final long DOLBY_VISION_10B_HDR_OEM_PO = 128L;
    public static final long DOLBY_VISION_10B_HDR_OEM_PO_SMPTE_2094_50 = 1048576L;
    public static final long DOLBY_VISION_10B_HDR_OEM_SMPTE_2094_50 = 524288L;
    public static final long DOLBY_VISION_10B_HDR_REF = 16L;
    public static final long DOLBY_VISION_10B_HDR_REF_PO = 32L;
    public static final long DOLBY_VISION_10B_HDR_REF_PO_SMPTE_2094_50 = 262144L;
    public static final long DOLBY_VISION_10B_HDR_REF_SMPTE_2094_50 = 131072L;
    public static final long DOLBY_VISION_8B_HDR_OEM = 1024L;
    public static final long DOLBY_VISION_8B_HDR_OEM_PO = 2048L;
    public static final long DOLBY_VISION_8B_HDR_OEM_PO_SMPTE_2094_50 = 16777216L;
    public static final long DOLBY_VISION_8B_HDR_OEM_SMPTE_2094_50 = 8388608L;
    public static final long DOLBY_VISION_8B_HDR_REF = 256L;
    public static final long DOLBY_VISION_8B_HDR_REF_PO = 512L;
    public static final long DOLBY_VISION_8B_HDR_REF_PO_SMPTE_2094_50 = 4194304L;
    public static final long DOLBY_VISION_8B_HDR_REF_SMPTE_2094_50 = 2097152L;
    public static final long HDR10 = 4L;
    public static final long HDR10_PLUS = 8L;
    public static final long HDR10_PLUS_SMPTE_2094_50 = 65536L;
    public static final long HDR10_SMPTE_2094_50 = 32768L;
    public static final long HLG10 = 2L;
    public static final long HLG10_SMPTE_2094_50 = 16384L;
    public static final long PUBLIC_MAX = 4096L;
    public static final long STANDARD = 1L;
    public static final long STANDARD_SMPTE_2094_50 = 8192L;
    private final java.util.HashMap<java.lang.Long, java.lang.Boolean> mLookahedLatencyMap = null;
    private final java.util.HashMap<java.lang.Long, java.util.Set<java.lang.Long>> mProfileMap = null;
    public DynamicRangeProfiles(long[] p0) {}
    public static void checkProfileValue(long p0) {}
    public java.util.Set<java.lang.Long> getProfileCaptureRequestConstraints(long p0) { return null; }
    public java.util.Set<java.lang.Long> getSupportedProfiles() { return null; }
    public boolean isExtraLatencyPresent(long p0) { return false; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Profile {
    }
}
