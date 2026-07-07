package android.media.tv.tuner.frontend;

@android.annotation.SystemApi
public class IsdbtFrontendSettings extends android.media.tv.tuner.frontend.FrontendSettings {
    public static final int BANDWIDTH_6MHZ = 8;
    public static final int BANDWIDTH_7MHZ = 4;
    public static final int BANDWIDTH_8MHZ = 2;
    public static final int BANDWIDTH_AUTO = 1;
    public static final int BANDWIDTH_UNDEFINED = 0;
    public static final int MODE_1 = 2;
    public static final int MODE_2 = 4;
    public static final int MODE_3 = 8;
    public static final int MODE_AUTO = 1;
    public static final int MODE_UNDEFINED = 0;
    public static final int MODULATION_AUTO = 1;
    public static final int MODULATION_MOD_16QAM = 8;
    public static final int MODULATION_MOD_64QAM = 16;
    public static final int MODULATION_MOD_DQPSK = 2;
    public static final int MODULATION_MOD_QPSK = 4;
    public static final int MODULATION_UNDEFINED = 0;
    public static final int PARTIAL_RECEPTION_FLAG_FALSE = 2;
    public static final int PARTIAL_RECEPTION_FLAG_TRUE = 4;
    public static final int PARTIAL_RECEPTION_FLAG_UNDEFINED = 0;
    private static final java.lang.String TAG = "IsdbtFrontendSettings";
    public static final int TIME_INTERLEAVE_MODE_1_0 = 2;
    public static final int TIME_INTERLEAVE_MODE_1_16 = 16;
    public static final int TIME_INTERLEAVE_MODE_1_4 = 4;
    public static final int TIME_INTERLEAVE_MODE_1_8 = 8;
    public static final int TIME_INTERLEAVE_MODE_2_0 = 32;
    public static final int TIME_INTERLEAVE_MODE_2_2 = 64;
    public static final int TIME_INTERLEAVE_MODE_2_4 = 128;
    public static final int TIME_INTERLEAVE_MODE_2_8 = 256;
    public static final int TIME_INTERLEAVE_MODE_3_0 = 512;
    public static final int TIME_INTERLEAVE_MODE_3_1 = 1024;
    public static final int TIME_INTERLEAVE_MODE_3_2 = 2048;
    public static final int TIME_INTERLEAVE_MODE_3_4 = 4096;
    public static final int TIME_INTERLEAVE_MODE_AUTO = 1;
    public static final int TIME_INTERLEAVE_MODE_UNDEFINED = 0;
    private final int mBandwidth = 0;
    private final int mGuardInterval = 0;
    private final android.media.tv.tuner.frontend.IsdbtFrontendSettings.IsdbtLayerSettings[] mLayerSettings = null;
    private final int mMode = 0;
    private final int mPartialReceptionFlag = 0;
    private final int mServiceAreaId = 0;
    private IsdbtFrontendSettings(long p0, int p1, int p2, int p3, int p4, android.media.tv.tuner.frontend.IsdbtFrontendSettings.IsdbtLayerSettings[] p5, int p6) { super(0L); }
    public static android.media.tv.tuner.frontend.IsdbtFrontendSettings.Builder builder() { return null; }
    public int getBandwidth() { return 0; }
    @java.lang.Deprecated
    public int getCodeRate() { return 0; }
    public int getGuardInterval() { return 0; }
    public android.media.tv.tuner.frontend.IsdbtFrontendSettings.IsdbtLayerSettings[] getLayerSettings() { return null; }
    public int getMode() { return 0; }
    @java.lang.Deprecated
    public int getModulation() { return 0; }
    public int getPartialReceptionFlag() { return 0; }
    public int getServiceAreaId() { return 0; }
    public int getType() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Bandwidth {
    }

    public static class Builder {
        private int mBandwidth;
        private long mFrequency;
        private int mGuardInterval;
        private android.media.tv.tuner.frontend.IsdbtFrontendSettings.IsdbtLayerSettings[] mLayerSettings;
        private int mMode;
        private int mPartialReceptionFlag;
        private int mServiceAreaId;
        private Builder() {}
        public android.media.tv.tuner.frontend.IsdbtFrontendSettings build() { return null; }
        public android.media.tv.tuner.frontend.IsdbtFrontendSettings.Builder setBandwidth(int p0) { return null; }
        @java.lang.Deprecated
        public android.media.tv.tuner.frontend.IsdbtFrontendSettings.Builder setCodeRate(int p0) { return null; }
        @java.lang.Deprecated
        public android.media.tv.tuner.frontend.IsdbtFrontendSettings.Builder setFrequency(int p0) { return null; }
        public android.media.tv.tuner.frontend.IsdbtFrontendSettings.Builder setFrequencyLong(long p0) { return null; }
        public android.media.tv.tuner.frontend.IsdbtFrontendSettings.Builder setGuardInterval(int p0) { return null; }
        public android.media.tv.tuner.frontend.IsdbtFrontendSettings.Builder setLayerSettings(android.media.tv.tuner.frontend.IsdbtFrontendSettings.IsdbtLayerSettings[] p0) { return null; }
        public android.media.tv.tuner.frontend.IsdbtFrontendSettings.Builder setMode(int p0) { return null; }
        @java.lang.Deprecated
        public android.media.tv.tuner.frontend.IsdbtFrontendSettings.Builder setModulation(int p0) { return null; }
        public android.media.tv.tuner.frontend.IsdbtFrontendSettings.Builder setPartialReceptionFlag(int p0) { return null; }
        public android.media.tv.tuner.frontend.IsdbtFrontendSettings.Builder setServiceAreaId(int p0) { return null; }
    }

    public static final class IsdbtLayerSettings {
        private final int mCodeRate = 0;
        private final int mModulation = 0;
        private final int mNumOfSegments = 0;
        private final int mTimeInterleaveMode = 0;
        private IsdbtLayerSettings(int p0, int p1, int p2, int p3) {}
        public static android.media.tv.tuner.frontend.IsdbtFrontendSettings.IsdbtLayerSettings.Builder builder() { return null; }
        public int getCodeRate() { return 0; }
        public int getModulation() { return 0; }
        public int getNumberOfSegments() { return 0; }
        public int getTimeInterleaveMode() { return 0; }

        public static final class Builder {
            private int mCodeRate;
            private int mModulation;
            private int mNumOfSegments;
            private int mTimeInterleaveMode;
            private Builder() {}
            public android.media.tv.tuner.frontend.IsdbtFrontendSettings.IsdbtLayerSettings build() { return null; }
            public android.media.tv.tuner.frontend.IsdbtFrontendSettings.IsdbtLayerSettings.Builder setCodeRate(int p0) { return null; }
            public android.media.tv.tuner.frontend.IsdbtFrontendSettings.IsdbtLayerSettings.Builder setModulation(int p0) { return null; }
            public android.media.tv.tuner.frontend.IsdbtFrontendSettings.IsdbtLayerSettings.Builder setNumberOfSegments(int p0) { return null; }
            public android.media.tv.tuner.frontend.IsdbtFrontendSettings.IsdbtLayerSettings.Builder setTimeInterleaveMode(int p0) { return null; }
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Mode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Modulation {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PartialReceptionFlag {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TimeInterleaveMode {
    }
}
