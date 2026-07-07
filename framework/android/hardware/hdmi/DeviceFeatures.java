package android.hardware.hdmi;

public class DeviceFeatures {
    public static final android.hardware.hdmi.DeviceFeatures ALL_FEATURES_SUPPORT_UNKNOWN = null;
    public static final int FEATURE_NOT_SUPPORTED = 0;
    public static final int FEATURE_SUPPORTED = 1;
    public static final int FEATURE_SUPPORT_UNKNOWN = 2;
    public static final android.hardware.hdmi.DeviceFeatures NO_FEATURES_SUPPORTED = null;
    private final int mArcRxSupport = 0;
    private final int mArcTxSupport = 0;
    private final int mDeckControlSupport = 0;
    private final int mRecordTvScreenSupport = 0;
    private final int mSetAudioRateSupport = 0;
    private final int mSetAudioVolumeLevelSupport = 0;
    private final int mSetOsdStringSupport = 0;
    private DeviceFeatures(android.hardware.hdmi.DeviceFeatures.Builder p0) {}
    private static int bitToFeatureSupportStatus(boolean p0) { return 0; }
    private static java.lang.String featureSupportStatusToString(int p0) { return null; }
    public static android.hardware.hdmi.DeviceFeatures fromOperand(byte[] p0) { return null; }
    private static int updateFeatureSupportStatus(int p0, int p1) { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getArcRxSupport() { return 0; }
    public int getArcTxSupport() { return 0; }
    public int getDeckControlSupport() { return 0; }
    public int getRecordTvScreenSupport() { return 0; }
    public int getSetAudioRateSupport() { return 0; }
    public int getSetAudioVolumeLevelSupport() { return 0; }
    public int getSetOsdStringSupport() { return 0; }
    public int hashCode() { return 0; }
    public android.hardware.hdmi.DeviceFeatures.Builder toBuilder() { return null; }
    public byte[] toOperand() { return null; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        private int mArcRxSupport;
        private int mArcTxSupport;
        private int mDeckControlSupport;
        private int mOsdStringSupport;
        private int mRecordTvScreenSupport;
        private int mSetAudioRateSupport;
        private int mSetAudioVolumeLevelSupport;
        private Builder(int p0) {}
        private Builder(android.hardware.hdmi.DeviceFeatures p0) {}
        public android.hardware.hdmi.DeviceFeatures build() { return null; }
        public android.hardware.hdmi.DeviceFeatures.Builder setArcRxSupport(int p0) { return null; }
        public android.hardware.hdmi.DeviceFeatures.Builder setArcTxSupport(int p0) { return null; }
        public android.hardware.hdmi.DeviceFeatures.Builder setDeckControlSupport(int p0) { return null; }
        public android.hardware.hdmi.DeviceFeatures.Builder setRecordTvScreenSupport(int p0) { return null; }
        public android.hardware.hdmi.DeviceFeatures.Builder setSetAudioRateSupport(int p0) { return null; }
        public android.hardware.hdmi.DeviceFeatures.Builder setSetAudioVolumeLevelSupport(int p0) { return null; }
        public android.hardware.hdmi.DeviceFeatures.Builder setSetOsdStringSupport(int p0) { return null; }
        public android.hardware.hdmi.DeviceFeatures.Builder update(android.hardware.hdmi.DeviceFeatures p0) { return null; }
    }

    public static @interface FeatureSupportStatus {
    }
}
