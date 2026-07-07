package android.hardware.radio;

final class TunerAdapter extends android.hardware.radio.RadioTuner {
    private static final java.lang.String TAG = "BroadcastRadio.TunerAdapter";
    private int mBand;
    private final android.hardware.radio.TunerCallbackAdapter mCallback = null;
    private boolean mIsClosed;
    private java.util.Map<java.lang.String, java.lang.String> mLegacyListFilter;
    private android.hardware.radio.ProgramList mLegacyListProxy;
    private final java.lang.Object mLock = null;
    private final android.hardware.radio.ITuner mTuner = null;
    TunerAdapter(android.hardware.radio.ITuner p0, android.hardware.radio.TunerCallbackAdapter p1, int p2) { super(); }
    private int convertForceAnalogConfigFlag(int p0) throws android.os.RemoteException { return 0; }
    public int cancel() { return 0; }
    public void cancelAnnouncement() {}
    public void close() {}
    public int getConfiguration(android.hardware.radio.RadioManager.BandConfig[] p0) { return 0; }
    public android.hardware.radio.ProgramList getDynamicProgramList(android.hardware.radio.ProgramList.Filter p0) { return null; }
    public android.graphics.Bitmap getMetadataImage(int p0) { return null; }
    public boolean getMute() { return false; }
    public java.util.Map<java.lang.String, java.lang.String> getParameters(java.util.List<java.lang.String> p0) { return null; }
    public int getProgramInformation(android.hardware.radio.RadioManager.ProgramInfo[] p0) { return 0; }
    public java.util.List<android.hardware.radio.RadioManager.ProgramInfo> getProgramList(java.util.Map<java.lang.String, java.lang.String> p0) { return null; }
    public boolean hasControl() { return false; }
    public boolean isAnalogForced() { return false; }
    public boolean isAntennaConnected() { return false; }
    public boolean isConfigFlagSet(int p0) { return false; }
    public boolean isConfigFlagSupported(int p0) { return false; }
    public int scan(int p0, boolean p1) { return 0; }
    public int seek(int p0, boolean p1) { return 0; }
    public void setAnalogForced(boolean p0) {}
    public void setConfigFlag(int p0, boolean p1) {}
    public int setConfiguration(android.hardware.radio.RadioManager.BandConfig p0) { return 0; }
    public int setMute(boolean p0) { return 0; }
    public java.util.Map<java.lang.String, java.lang.String> setParameters(java.util.Map<java.lang.String, java.lang.String> p0) { return null; }
    public boolean startBackgroundScan() { return false; }
    public int step(int p0, boolean p1) { return 0; }
    public int tune(int p0, int p1) { return 0; }
    public void tune(android.hardware.radio.ProgramSelector p0) {}
}
