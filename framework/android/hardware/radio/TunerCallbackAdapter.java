package android.hardware.radio;

final class TunerCallbackAdapter extends android.hardware.radio.ITunerCallback.Stub {
    private static final java.lang.String TAG = "BroadcastRadio.TunerCallbackAdapter";
    private final android.hardware.radio.RadioTuner.Callback mCallback = null;
    android.hardware.radio.RadioManager.ProgramInfo mCurrentProgramInfo;
    private boolean mDelayedCompleteCallback;
    private final android.os.Handler mHandler = null;
    boolean mIsAntennaConnected;
    java.util.List<android.hardware.radio.RadioManager.ProgramInfo> mLastCompleteList;
    private final java.lang.Object mLock = null;
    android.hardware.radio.ProgramList mProgramList;
    TunerCallbackAdapter(android.hardware.radio.RadioTuner.Callback p0, android.os.Handler p1) { super(); }
    private void sendBackgroundScanCompleteLocked() {}
    void clearLastCompleteList() {}
    void close() {}
    android.hardware.radio.RadioManager.ProgramInfo getCurrentProgramInformation() { return null; }
    java.util.List<android.hardware.radio.RadioManager.ProgramInfo> getLastCompleteList() { return null; }
    boolean isAntennaConnected() { return false; }
    public void onAntennaState(boolean p0) {}
    public void onBackgroundScanAvailabilityChange(boolean p0) {}
    public void onBackgroundScanComplete() {}
    public void onConfigFlagUpdated(int p0, boolean p1) {}
    public void onConfigurationChanged(android.hardware.radio.RadioManager.BandConfig p0) {}
    public void onCurrentProgramInfoChanged(android.hardware.radio.RadioManager.ProgramInfo p0) {}
    public void onEmergencyAnnouncement(boolean p0) {}
    public void onError(int p0) {}
    public void onParametersUpdated(java.util.Map<java.lang.String, java.lang.String> p0) {}
    public void onProgramListChanged() {}
    public void onProgramListUpdated(android.hardware.radio.ProgramList.Chunk p0) {}
    public void onTrafficAnnouncement(boolean p0) {}
    public void onTuneFailed(int p0, android.hardware.radio.ProgramSelector p1) {}
    void setProgramListObserver(android.hardware.radio.ProgramList p0, android.hardware.radio.ProgramList.OnCloseListener p1) {}
}
