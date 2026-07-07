package android.os;

public class SystemVibrator extends android.os.Vibrator {
    private static final java.lang.String TAG = "Vibrator";
    private final java.util.ArrayList<android.os.SystemVibrator.MultiVibratorStateListener> mBrokenListeners = null;
    private final android.content.Context mContext = null;
    private final java.lang.Object mLock = null;
    private final android.util.ArrayMap<android.os.Vibrator.OnVibratorStateChangedListener, android.os.SystemVibrator.MultiVibratorStateListener> mRegisteredListeners = null;
    private int[] mVibratorIds;
    private android.os.VibratorInfo mVibratorInfo;
    private final android.os.VibratorManager mVibratorManager = null;
    public SystemVibrator(android.content.Context p0) { super(); }
    private int[] getVibratorIds() { return null; }
    private void tryUnregisterBrokenListeners() {}
    public void addVibratorStateListener(android.os.Vibrator.OnVibratorStateChangedListener p0) {}
    public void addVibratorStateListener(java.util.concurrent.Executor p0, android.os.Vibrator.OnVibratorStateChangedListener p1) {}
    public boolean areVendorSessionsSupported() { return false; }
    public void cancel() {}
    public void cancel(int p0) {}
    public android.os.VibratorInfo getInfo() { return null; }
    public boolean hasAmplitudeControl() { return false; }
    public boolean hasVibrator() { return false; }
    public boolean isHapticGeneratorSupported() { return false; }
    public boolean isVibrating() { return false; }
    public void performHapticFeedback(int p0, int p1, java.lang.String p2, int p3, int p4) {}
    public void performHapticFeedbackForInputDevice(int p0, int p1, int p2, java.lang.String p3, int p4, int p5) {}
    public void removeVibratorStateListener(android.os.Vibrator.OnVibratorStateChangedListener p0) {}
    public boolean setAlwaysOnEffect(int p0, java.lang.String p1, int p2, android.os.VibrationEffect p3, android.os.VibrationAttributes p4) { return false; }
    public void startHapticGeneratorSession(android.os.vibrator.HapticGeneratorSession.Config p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<android.os.vibrator.HapticGeneratorSession, java.lang.Exception> p2) {}
    public void startVendorSession(android.os.VibrationAttributes p0, java.lang.String p1, android.os.CancellationSignal p2, java.util.concurrent.Executor p3, android.os.vibrator.VendorVibrationSession.Callback p4) {}
    public void vibrate(int p0, java.lang.String p1, android.os.VibrationEffect p2, java.lang.String p3, android.os.VibrationAttributes p4) {}

    public static class MultiVibratorStateListener {
        private final android.os.Vibrator.OnVibratorStateChangedListener mDelegate = null;
        private final java.util.concurrent.Executor mExecutor = null;
        private int mInitializedMask;
        private final java.lang.Object mLock = null;
        private int mVibratingMask;
        private final android.util.SparseArray<android.os.SystemVibrator.SingleVibratorStateListener> mVibratorListeners = null;
        public MultiVibratorStateListener(java.util.concurrent.Executor p0, android.os.Vibrator.OnVibratorStateChangedListener p1) {}
        public boolean hasRegisteredListeners() { return false; }
        public void onVibrating(int p0, boolean p1) {}
        public void register(android.os.VibratorManager p0, int[] p1) {}
        public void unregister(android.os.VibratorManager p0) {}
    }

    private static class SingleVibratorStateListener implements android.os.Vibrator.OnVibratorStateChangedListener {
        private final android.os.SystemVibrator.MultiVibratorStateListener mAllVibratorsListener = null;
        private final int mVibratorIdx = 0;
        SingleVibratorStateListener(android.os.SystemVibrator.MultiVibratorStateListener p0, int p1) {}
        public void onVibratorStateChanged(boolean p0) {}
    }
}
