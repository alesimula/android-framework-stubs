package android.media.tv.tuner.frontend;

@android.annotation.SystemApi
public class FrontendStatus {
    public static final int FRONTEND_STATUS_TYPE_AGC = 14;
    public static final int FRONTEND_STATUS_TYPE_ATSC3_ALL_PLP_INFO = 41;
    public static final int FRONTEND_STATUS_TYPE_ATSC3_PLP_INFO = 21;
    public static final int FRONTEND_STATUS_TYPE_BANDWIDTH = 25;
    public static final int FRONTEND_STATUS_TYPE_BER = 2;
    public static final int FRONTEND_STATUS_TYPE_BERS = 23;
    public static final int FRONTEND_STATUS_TYPE_CODERATES = 24;
    public static final int FRONTEND_STATUS_TYPE_DEMOD_LOCK = 0;
    public static final int FRONTEND_STATUS_TYPE_DVBT_CELL_IDS = 40;
    public static final int FRONTEND_STATUS_TYPE_EWBS = 13;
    public static final int FRONTEND_STATUS_TYPE_FEC = 8;
    public static final int FRONTEND_STATUS_TYPE_FREQ_OFFSET = 18;
    public static final int FRONTEND_STATUS_TYPE_GUARD_INTERVAL = 26;
    public static final int FRONTEND_STATUS_TYPE_HIERARCHY = 19;
    public static final int FRONTEND_STATUS_TYPE_INTERLEAVINGS = 30;
    public static final int FRONTEND_STATUS_TYPE_IPTV_AVERAGE_JITTER_MS = 46;
    public static final int FRONTEND_STATUS_TYPE_IPTV_CONTENT_URL = 42;
    public static final int FRONTEND_STATUS_TYPE_IPTV_PACKETS_LOST = 43;
    public static final int FRONTEND_STATUS_TYPE_IPTV_PACKETS_RECEIVED = 44;
    public static final int FRONTEND_STATUS_TYPE_IPTV_WORST_JITTER_MS = 45;
    public static final int FRONTEND_STATUS_TYPE_ISDBT_MODE = 37;
    public static final int FRONTEND_STATUS_TYPE_ISDBT_PARTIAL_RECEPTION_FLAG = 38;
    public static final int FRONTEND_STATUS_TYPE_ISDBT_SEGMENTS = 31;
    public static final int FRONTEND_STATUS_TYPE_IS_LINEAR = 35;
    public static final int FRONTEND_STATUS_TYPE_IS_MISO_ENABLED = 34;
    public static final int FRONTEND_STATUS_TYPE_IS_SHORT_FRAMES_ENABLED = 36;
    public static final int FRONTEND_STATUS_TYPE_LAYER_ERROR = 16;
    public static final int FRONTEND_STATUS_TYPE_LNA = 15;
    public static final int FRONTEND_STATUS_TYPE_LNB_VOLTAGE = 11;
    public static final int FRONTEND_STATUS_TYPE_MER = 17;
    public static final int FRONTEND_STATUS_TYPE_MODULATION = 9;
    public static final int FRONTEND_STATUS_TYPE_MODULATIONS_EXT = 22;
    public static final int FRONTEND_STATUS_TYPE_PER = 3;
    public static final int FRONTEND_STATUS_TYPE_PLP_ID = 12;
    public static final int FRONTEND_STATUS_TYPE_PRE_BER = 4;
    public static final int FRONTEND_STATUS_TYPE_RF_LOCK = 20;
    public static final int FRONTEND_STATUS_TYPE_ROLL_OFF = 33;
    public static final int FRONTEND_STATUS_TYPE_SIGNAL_QUALITY = 5;
    public static final int FRONTEND_STATUS_TYPE_SIGNAL_STRENGTH = 6;
    public static final int FRONTEND_STATUS_TYPE_SNR = 1;
    public static final int FRONTEND_STATUS_TYPE_SPECTRAL = 10;
    public static final int FRONTEND_STATUS_TYPE_STANDARD_EXTENSION = 47;
    public static final int FRONTEND_STATUS_TYPE_STREAM_IDS = 39;
    public static final int FRONTEND_STATUS_TYPE_SYMBOL_RATE = 7;
    public static final int FRONTEND_STATUS_TYPE_T2_SYSTEM_ID = 29;
    public static final int FRONTEND_STATUS_TYPE_TRANSMISSION_MODE = 27;
    public static final int FRONTEND_STATUS_TYPE_TS_DATA_RATES = 32;
    public static final int FRONTEND_STATUS_TYPE_UEC = 28;
    private java.lang.Integer mAgc;
    private android.media.tv.tuner.frontend.Atsc3PlpInfo[] mAllPlpInfo;
    private java.lang.Integer mBandwidth;
    private java.lang.Integer mBer;
    private int[] mBers;
    private int[] mCodeRates;
    private int[] mDvbtCellIds;
    private java.lang.Long mFreqOffset;
    private java.lang.Integer mGuardInterval;
    private java.lang.Integer mHierarchy;
    private java.lang.Long mInnerFec;
    private int[] mInterleaving;
    private java.lang.Integer mInversion;
    private java.lang.Integer mIptvAverageJitterMs;
    private java.lang.String mIptvContentUrl;
    private java.lang.Long mIptvPacketsLost;
    private java.lang.Long mIptvPacketsReceived;
    private java.lang.Integer mIptvWorstJitterMs;
    private java.lang.Boolean mIsDemodLocked;
    private java.lang.Boolean mIsEwbs;
    private boolean[] mIsLayerErrors;
    private java.lang.Boolean mIsLinear;
    private java.lang.Boolean mIsLnaOn;
    private java.lang.Boolean mIsMisoEnabled;
    private java.lang.Boolean mIsRfLocked;
    private java.lang.Boolean mIsShortFrames;
    private java.lang.Integer mIsdbtMode;
    private java.lang.Integer mIsdbtPartialReceptionFlag;
    private int[] mIsdbtSegment;
    private java.lang.Integer mLnbVoltage;
    private java.lang.Integer mMer;
    private java.lang.Integer mModulation;
    private int[] mModulationsExt;
    private java.lang.Integer mPer;
    private java.lang.Integer mPerBer;
    private java.lang.Integer mPlpId;
    private android.media.tv.tuner.frontend.FrontendStatus.Atsc3PlpTuningInfo[] mPlpInfo;
    private java.lang.Integer mRollOff;
    private java.lang.Integer mSignalQuality;
    private java.lang.Integer mSignalStrength;
    private java.lang.Integer mSnr;
    private android.media.tv.tuner.frontend.StandardExtension mStandardExtension;
    private int[] mStreamIds;
    private java.lang.Integer mSymbolRate;
    private java.lang.Integer mSystemId;
    private java.lang.Integer mTransmissionMode;
    private int[] mTsDataRate;
    private java.lang.Integer mUec;
    private FrontendStatus() {}
    public int getAgc() { return 0; }
    public java.util.List<android.media.tv.tuner.frontend.Atsc3PlpInfo> getAllAtsc3PlpInfo() { return null; }
    public android.media.tv.tuner.frontend.FrontendStatus.Atsc3PlpTuningInfo[] getAtsc3PlpTuningInfo() { return null; }
    public int getBandwidth() { return 0; }
    public int getBer() { return 0; }
    public int[] getBers() { return null; }
    public int[] getCodeRates() { return null; }
    public int[] getDvbtCellIds() { return null; }
    public int[] getExtendedModulations() { return null; }
    @java.lang.Deprecated
    public int getFreqOffset() { return 0; }
    public long getFreqOffsetLong() { return 0L; }
    public int getGuardInterval() { return 0; }
    public int getHierarchy() { return 0; }
    public long getInnerFec() { return 0L; }
    public int[] getInterleaving() { return null; }
    public int getIptvAverageJitterMillis() { return 0; }
    public java.lang.String getIptvContentUrl() { return null; }
    public long getIptvPacketsLost() { return 0L; }
    public long getIptvPacketsReceived() { return 0L; }
    public int getIptvWorstJitterMillis() { return 0; }
    public int getIsdbtMode() { return 0; }
    public int getIsdbtPartialReceptionFlag() { return 0; }
    public int[] getIsdbtSegment() { return null; }
    public boolean[] getLayerErrors() { return null; }
    public int getLnbVoltage() { return 0; }
    public int getMer() { return 0; }
    public int getModulation() { return 0; }
    public int getPer() { return 0; }
    public int getPerBer() { return 0; }
    public int getPlpId() { return 0; }
    public int getRollOff() { return 0; }
    public int getSignalQuality() { return 0; }
    public int getSignalStrength() { return 0; }
    public int getSnr() { return 0; }
    public int getSpectralInversion() { return 0; }
    public android.media.tv.tuner.frontend.StandardExtension getStandardExtension() { return null; }
    public int[] getStreamIds() { return null; }
    public int getSymbolRate() { return 0; }
    public int getSystemId() { return 0; }
    public int getTransmissionMode() { return 0; }
    public int[] getTsDataRate() { return null; }
    public int getUec() { return 0; }
    public boolean isDemodLocked() { return false; }
    public boolean isEwbs() { return false; }
    public boolean isLinear() { return false; }
    public boolean isLnaOn() { return false; }
    public boolean isMisoEnabled() { return false; }
    public boolean isRfLocked() { return false; }
    public boolean isShortFramesEnabled() { return false; }

    public static class Atsc3PlpTuningInfo {
        private final boolean mIsLocked = false;
        private final int mPlpId = 0;
        private final int mUec = 0;
        private Atsc3PlpTuningInfo(int p0, boolean p1, int p2) {}
        public int getPlpId() { return 0; }
        public int getUec() { return 0; }
        public boolean isLocked() { return false; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FrontendBandwidth {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FrontendGuardInterval {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FrontendInterleaveMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FrontendModulation {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FrontendRollOff {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FrontendStatusType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FrontendTransmissionMode {
    }
}
