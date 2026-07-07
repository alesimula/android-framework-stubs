package android.media.tv.tuner;

@android.annotation.SystemApi
public class Tuner implements java.lang.AutoCloseable {
    private static final boolean DEBUG = Boolean.valueOf(false);
    public static final int DVR_TYPE_PLAYBACK = 1;
    public static final int DVR_TYPE_RECORD = 0;
    private static final int FILTER_CLEANUP_THRESHOLD = 256;
    public static final int INVALID_AV_SYNC_ID = -1;
    public static final int INVALID_FILTER_ID = -1;
    public static final long INVALID_FILTER_ID_LONG = -1L;
    public static final int INVALID_FIRST_MACROBLOCK_IN_SLICE = -1;
    public static final int INVALID_FRONTEND_ID = -1;
    public static final int INVALID_FRONTEND_SETTING_FREQUENCY = -1;
    public static final int INVALID_LNB_ID = -1;
    public static final int INVALID_LTS_ID = -1;
    public static final int INVALID_MMTP_RECORD_EVENT_MPT_SEQUENCE_NUM = -1;
    public static final int INVALID_STREAM_ID = 65535;
    public static final long INVALID_TIMESTAMP = -1L;
    public static final int INVALID_TS_PID = 65535;
    private static final int MSG_ON_FILTER_EVENT = 2;
    private static final int MSG_ON_FILTER_STATUS = 3;
    private static final int MSG_ON_LNB_EVENT = 4;
    private static final int MSG_RESOURCE_LOST = 1;
    public static final int RESULT_INVALID_ARGUMENT = 4;
    public static final int RESULT_INVALID_STATE = 3;
    public static final int RESULT_NOT_INITIALIZED = 2;
    public static final int RESULT_OUT_OF_MEMORY = 5;
    public static final int RESULT_SUCCESS = 0;
    public static final int RESULT_UNAVAILABLE = 1;
    public static final int RESULT_UNKNOWN_ERROR = 6;
    public static final int SCAN_TYPE_AUTO = 1;
    public static final int SCAN_TYPE_BLIND = 2;
    public static final int SCAN_TYPE_UNDEFINED = 0;
    private static final java.lang.String TAG = "MediaTvTuner";
    public static final byte[] VOID_KEYTOKEN = null;
    private static int sTunerVersion;
    private final int mClientId = 0;
    private boolean mClosed;
    private final android.content.Context mContext = null;
    private java.lang.Long mDemuxHandle;
    private final java.util.concurrent.locks.ReentrantLock mDemuxLock = null;
    private java.util.Map<java.lang.Long, java.lang.ref.WeakReference<android.media.tv.tuner.Descrambler>> mDescramblers;
    private android.media.tv.tuner.DemuxInfo mDesiredDemuxInfo;
    private java.lang.Integer mDesiredFrontendId;
    private android.media.tv.tuner.Tuner mFeOwnerTuner;
    private java.util.List<java.lang.ref.WeakReference<android.media.tv.tuner.filter.Filter>> mFilters;
    private android.media.tv.tuner.Tuner.Frontend mFrontend;
    private java.lang.Long mFrontendCiCamHandle;
    private java.lang.Integer mFrontendCiCamId;
    private final java.util.concurrent.locks.ReentrantLock mFrontendCiCamLock = null;
    private java.lang.Long mFrontendHandle;
    private android.media.tv.tuner.frontend.FrontendInfo mFrontendInfo;
    private final java.util.concurrent.locks.ReentrantLock mFrontendLock = null;
    private int mFrontendType;
    private android.media.tv.tuner.Tuner.EventHandler mHandler;
    private android.media.tv.tuner.Lnb mLnb;
    private java.lang.Long mLnbHandle;
    private final java.util.concurrent.locks.ReentrantLock mLnbLock = null;
    private long mNativeContext;
    private android.media.tv.tuner.Tuner.OnResourceLostListener mOnResourceLostListener;
    private java.util.concurrent.Executor mOnResourceLostListenerExecutor;
    private final java.lang.Object mOnResourceLostListenerLock = null;
    private java.util.concurrent.Executor mOnTuneEventExecutor;
    private android.media.tv.tuner.frontend.OnTuneEventListener mOnTuneEventListener;
    private final java.lang.Object mOnTuneEventLock = null;
    private int mRequestedCiCamId;
    private final android.media.tv.tunerresourcemanager.TunerResourceManager.ResourcesReclaimListener mResourceListener = null;
    private android.media.tv.tuner.frontend.ScanCallback mScanCallback;
    private java.util.concurrent.Executor mScanCallbackExecutor;
    private final java.lang.Object mScanCallbackLock = null;
    private final android.media.tv.tunerresourcemanager.TunerResourceManager mTunerResourceManager = null;
    private int mUserId;
    public Tuner(android.content.Context p0, java.lang.String p1, int p2) {}
    private void acquireTRMSLock(java.lang.String p0) {}
    private boolean checkResource(int p0, java.util.concurrent.locks.ReentrantLock p1) { return false; }
    private void closeLnb() {}
    private int configureDemuxInternal(android.media.tv.tuner.DemuxInfo p0, boolean p1) { return 0; }
    private android.media.tv.tuner.Tuner.EventHandler createEventHandler() { return null; }
    private android.media.tv.tuner.frontend.FrontendInfo[] getFrontendInfoListInternal() { return null; }
    private int getPhysicalFrontendCount(int p0) { return 0; }
    public static int getTunerVersion() { return 0; }
    private boolean isFrontendOwner() { return false; }
    private boolean isNewOwnerQualifiedForTransfer(android.media.tv.tuner.Tuner p0) { return false; }
    private native int nativeClose();
    private native int nativeCloseDemux(long p0);
    private native int nativeCloseFrontend(long p0);
    private native int nativeConnectCiCam(int p0);
    private native int nativeDisconnectCiCam();
    private native java.lang.Integer nativeGetAvSyncHwId(android.media.tv.tuner.filter.Filter p0);
    private native java.lang.Long nativeGetAvSyncTime(int p0);
    private native android.media.tv.tuner.DemuxCapabilities nativeGetDemuxCapabilities();
    private native android.media.tv.tuner.DemuxInfo nativeGetDemuxInfo(long p0);
    private native java.lang.String nativeGetFrontendHardwareInfo();
    private native java.util.List<java.lang.Integer> nativeGetFrontendIds();
    private native android.media.tv.tuner.frontend.FrontendInfo nativeGetFrontendInfo(int p0);
    private native android.media.tv.tuner.frontend.FrontendStatus nativeGetFrontendStatus(int[] p0);
    private native android.media.tv.tuner.frontend.FrontendStatusReadiness[] nativeGetFrontendStatusReadiness(int[] p0);
    private native int nativeGetMaxNumberOfFrontends(int p0);
    private native int nativeGetTunerVersion();
    private static native void nativeInit();
    private native boolean nativeIsLnaSupported();
    private native int nativeLinkCiCam(int p0);
    private native int nativeOpenDemuxByhandle(long p0);
    private native android.media.tv.tuner.Descrambler nativeOpenDescramblerByHandle(long p0);
    private native android.media.tv.tuner.dvr.DvrPlayback nativeOpenDvrPlayback(long p0);
    private native android.media.tv.tuner.dvr.DvrRecorder nativeOpenDvrRecorder(long p0);
    private native android.media.tv.tuner.filter.Filter nativeOpenFilter(int p0, int p1, long p2);
    private native android.media.tv.tuner.Tuner.Frontend nativeOpenFrontendByHandle(long p0);
    private native android.media.tv.tuner.Lnb nativeOpenLnbByHandle(long p0);
    private native android.media.tv.tuner.Lnb nativeOpenLnbByName(java.lang.String p0);
    private static native android.media.tv.tuner.filter.SharedFilter nativeOpenSharedFilter(java.lang.String p0);
    private native android.media.tv.tuner.filter.TimeFilter nativeOpenTimeFilter();
    private native void nativeRegisterFeCbListener(long p0);
    private native int nativeRemoveOutputPid(int p0);
    private native int nativeScan(int p0, android.media.tv.tuner.frontend.FrontendSettings p1, int p2);
    private native int nativeSetLna(boolean p0);
    private native int nativeSetLnb(android.media.tv.tuner.Lnb p0);
    private native int nativeSetMaxNumberOfFrontends(int p0, int p1);
    private native void nativeSetup();
    private native int nativeShareFrontend(int p0);
    private native int nativeStopScan();
    private native int nativeStopTune();
    private native int nativeTune(int p0, android.media.tv.tuner.frontend.FrontendSettings p1);
    private native int nativeUnlinkCiCam(int p0);
    private native void nativeUnregisterFeCbListener(long p0);
    private native int nativeUnshareFrontend();
    private native void nativeUpdateFrontend(long p0);
    private void onAnalogSifStandard(int p0) {}
    private void onAtsc3PlpInfos(android.media.tv.tuner.frontend.Atsc3PlpInfo[] p0) {}
    private void onDvbcAnnexReported(int p0) {}
    private void onDvbsStandard(int p0) {}
    private void onDvbtCellIdsReported(int[] p0) {}
    private void onDvbtStandard(int p0) {}
    private void onFrequenciesReport(long[] p0) {}
    private void onFrontendEvent(int p0) {}
    private void onGroupIds(int[] p0) {}
    private void onHierarchy(int p0) {}
    private void onInputStreamIds(int[] p0) {}
    private void onLocked() {}
    private void onModulationReported(int p0) {}
    private void onPlpIds(int[] p0) {}
    private void onPriorityReported(boolean p0) {}
    private void onProgress(int p0) {}
    private void onScanStopped() {}
    private void onSignalType(int p0) {}
    private void onSymbolRates(int[] p0) {}
    private void onUnlocked() {}
    public static android.media.tv.tuner.filter.SharedFilter openSharedFilter(android.content.Context p0, java.lang.String p1, java.util.concurrent.Executor p2, android.media.tv.tuner.filter.SharedFilterCallback p3) { return null; }
    private void registerFrontendCallbackListener(android.media.tv.tuner.Tuner p0) {}
    private void releaseAll() {}
    private void releaseCiCam() {}
    private void releaseDemux() {}
    private void releaseDescramblers() {}
    private void releaseFilters() {}
    private void releaseFrontend() {}
    private void releaseTRMSLock() {}
    private void replicateCiCamSettings(android.media.tv.tuner.Tuner p0) {}
    private void replicateFrontendSettings(android.media.tv.tuner.Tuner p0) {}
    private void replicateLnbSettings(android.media.tv.tuner.Tuner p0) {}
    private boolean requestDemux() { return false; }
    private android.media.tv.tuner.Descrambler requestDescrambler() { return null; }
    private boolean requestFrontend() { return false; }
    private boolean requestFrontendCiCam(int p0) { return false; }
    private boolean requestLnb() { return false; }
    private boolean requestResource(int p0, java.util.concurrent.locks.ReentrantLock p1) { return false; }
    private void setFrontendOwner(android.media.tv.tuner.Tuner p0) {}
    private int setLnb(android.media.tv.tuner.Lnb p0) { return 0; }
    private int transferCiCamOwner(android.media.tv.tuner.Tuner p0) { return 0; }
    private int transferFeOwner(android.media.tv.tuner.Tuner p0) { return 0; }
    private int transferLnbOwner(android.media.tv.tuner.Tuner p0) { return 0; }
    private void unregisterFrontendCallbackListener(android.media.tv.tuner.Tuner p0) {}
    public int applyFrontend(android.media.tv.tuner.frontend.FrontendInfo p0) { return 0; }
    public int applyFrontendByType(int p0) { return 0; }
    public int cancelScanning() { return 0; }
    public int cancelTuning() { return 0; }
    public void clearOnTuneEventListener() {}
    public void clearResourceLostListener() {}
    public void close() {}
    public void closeFrontend() {}
    public int configureDemux(android.media.tv.tuner.DemuxInfo p0) { return 0; }
    public int connectCiCam(int p0) { return 0; }
    public int connectFrontendToCiCam(int p0) { return 0; }
    public int disconnectCiCam() { return 0; }
    public int disconnectFrontendToCiCam(int p0) { return 0; }
    public int getAvSyncHwId(android.media.tv.tuner.filter.Filter p0) { return 0; }
    public long getAvSyncTime(int p0) { return 0L; }
    public java.util.List<android.media.tv.tuner.frontend.FrontendInfo> getAvailableFrontendInfos() { return null; }
    public int getClientId() { return 0; }
    public android.media.tv.tuner.DemuxInfo getCurrentDemuxInfo() { return null; }
    public java.lang.String getCurrentFrontendHardwareInfo() { return null; }
    public android.media.tv.tuner.DemuxCapabilities getDemuxCapabilities() { return null; }
    public android.media.tv.tuner.DemuxInfo getDesiredDemuxInfo() { return null; }
    public java.util.List<java.lang.Integer> getFrontendIds() { return null; }
    public android.media.tv.tuner.frontend.FrontendInfo getFrontendInfo() { return null; }
    public android.media.tv.tuner.frontend.FrontendInfo getFrontendInfoById(int p0) { return null; }
    public android.media.tv.tuner.frontend.FrontendStatus getFrontendStatus(int[] p0) { return null; }
    public java.util.List<android.media.tv.tuner.frontend.FrontendStatusReadiness> getFrontendStatusReadiness(int[] p0) { return null; }
    public int getMaxNumberOfFrontends(int p0) { return 0; }
    long getNativeContext() { return 0L; }
    android.media.tv.tunerresourcemanager.TunerResourceManager getTunerResourceManager() { return null; }
    public boolean hasUnusedFrontend(int p0) { return false; }
    public boolean isLnaSupported() { return false; }
    public boolean isLowestPriority(int p0) { return false; }
    public android.media.tv.tuner.Descrambler openDescrambler() { return null; }
    public android.media.tv.tuner.dvr.DvrPlayback openDvrPlayback(long p0, java.util.concurrent.Executor p1, android.media.tv.tuner.dvr.OnPlaybackStatusChangedListener p2) { return null; }
    public android.media.tv.tuner.dvr.DvrRecorder openDvrRecorder(long p0, java.util.concurrent.Executor p1, android.media.tv.tuner.dvr.OnRecordStatusChangedListener p2) { return null; }
    public android.media.tv.tuner.filter.Filter openFilter(int p0, int p1, long p2, java.util.concurrent.Executor p3, android.media.tv.tuner.filter.FilterCallback p4) { return null; }
    public android.media.tv.tuner.Lnb openLnb(java.util.concurrent.Executor p0, android.media.tv.tuner.LnbCallback p1) { return null; }
    public android.media.tv.tuner.Lnb openLnbByName(java.lang.String p0, java.util.concurrent.Executor p1, android.media.tv.tuner.LnbCallback p2) { return null; }
    public android.media.tv.tuner.filter.TimeFilter openTimeFilter() { return null; }
    void releaseLnb() {}
    public int removeOutputPid(int p0) { return 0; }
    public int scan(android.media.tv.tuner.frontend.FrontendSettings p0, int p1, java.util.concurrent.Executor p2, android.media.tv.tuner.frontend.ScanCallback p3) { return 0; }
    public int setLnaEnabled(boolean p0) { return 0; }
    public int setMaxNumberOfFrontends(int p0, int p1) { return 0; }
    public void setOnTuneEventListener(java.util.concurrent.Executor p0, android.media.tv.tuner.frontend.OnTuneEventListener p1) {}
    public void setResourceLostListener(java.util.concurrent.Executor p0, android.media.tv.tuner.Tuner.OnResourceLostListener p1) {}
    public void setResourceOwnershipRetention(boolean p0) {}
    public void shareFrontendFromTuner(android.media.tv.tuner.Tuner p0) {}
    public int transferOwner(android.media.tv.tuner.Tuner p0) { return 0; }
    public int tune(android.media.tv.tuner.frontend.FrontendSettings p0) { return 0; }
    public void updateResourcePriority(int p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DvrType {
    }

    private class EventHandler extends android.os.Handler {
        private EventHandler(android.media.tv.tuner.Tuner p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    private class Frontend {
        private int mId;
        private Frontend(android.media.tv.tuner.Tuner p0, int p1) {}
    }

    public static interface OnResourceLostListener {
        public void onResourceLost(android.media.tv.tuner.Tuner p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Result {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ScanType {
    }
}
