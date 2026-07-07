package android.os;

public class SystemVibratorManager extends android.os.VibratorManager {
    private static final java.lang.String TAG = "VibratorManager";
    private int mCapabilities;
    private final android.content.Context mContext = null;
    private final android.util.ArrayMap<android.os.Vibrator.OnVibratorStateChangedListener, android.os.SystemVibratorManager.OnVibratorStateChangedListenerDelegate> mListeners = null;
    private final java.lang.Object mLock = null;
    private final android.os.IVibratorManagerService mService = null;
    private final android.os.Binder mToken = null;
    private final int mUid = 0;
    private int[] mVibratorIds;
    private final android.util.SparseArray<android.os.Vibrator> mVibrators = null;
    public SystemVibratorManager(android.content.Context p0) { super(); }
    private void cancelVibration(int p0) {}
    private int getCapabilities() { return 0; }
    public void cancel() {}
    public void cancel(int p0) {}
    public android.os.Vibrator getDefaultVibrator() { return null; }
    public android.os.Vibrator getVibrator(int p0) { return null; }
    public int[] getVibratorIds() { return null; }
    public boolean hasCapabilities(int p0) { return false; }
    public void performHapticFeedback(int p0, int p1, java.lang.String p2, int p3, int p4) {}
    public void performHapticFeedbackForInputDevice(int p0, int p1, int p2, java.lang.String p3, int p4, int p5) {}
    public boolean setAlwaysOnEffect(int p0, java.lang.String p1, int p2, android.os.CombinedVibration p3, android.os.VibrationAttributes p4) { return false; }
    public void startHapticGeneratorSession(int p0, android.os.vibrator.HapticGeneratorSession.Config p1, java.util.concurrent.Executor p2, android.os.OutcomeReceiver<android.os.vibrator.HapticGeneratorSession, java.lang.Exception> p3) {}
    public void startVendorSession(int[] p0, android.os.VibrationAttributes p1, java.lang.String p2, android.os.CancellationSignal p3, java.util.concurrent.Executor p4, android.os.vibrator.VendorVibrationSession.Callback p5) {}
    public void vibrate(int p0, java.lang.String p1, android.os.CombinedVibration p2, java.lang.String p3, android.os.VibrationAttributes p4) {}

    private static class HapticGeneratorSessionCallback extends android.os.vibrator.IHapticGeneratorSessionCallback.Stub {
        private final android.os.OutcomeReceiver<android.os.vibrator.HapticGeneratorSession, java.lang.Exception> mCallback = null;
        private final java.util.concurrent.Executor mExecutor = null;
        HapticGeneratorSessionCallback(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<android.os.vibrator.HapticGeneratorSession, java.lang.Exception> p1) { super(); }
        public void onError(int p0) {}
        public void onSessionStarted(android.os.vibrator.IHapticGeneratorSession p0) {}
    }

    private static class OnVibratorStateChangedListenerDelegate extends android.os.IVibratorStateListener.Stub {
        private final java.util.concurrent.Executor mExecutor = null;
        private final android.os.Vibrator.OnVibratorStateChangedListener mListener = null;
        OnVibratorStateChangedListenerDelegate(android.os.Vibrator.OnVibratorStateChangedListener p0, java.util.concurrent.Executor p1) { super(); }
        public void onVibrating(boolean p0) {}
    }

    private final class SingleVibrator extends android.os.Vibrator {
        private final int[] mVibratorId = null;
        private final android.os.VibratorInfo mVibratorInfo = null;
        SingleVibrator(android.os.SystemVibratorManager p0, android.os.VibratorInfo p1) { super(); }
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
        public void removeVibratorStateListener(android.os.Vibrator.OnVibratorStateChangedListener p0) {}
        public boolean setAlwaysOnEffect(int p0, java.lang.String p1, int p2, android.os.VibrationEffect p3, android.os.VibrationAttributes p4) { return false; }
        public void startHapticGeneratorSession(android.os.vibrator.HapticGeneratorSession.Config p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<android.os.vibrator.HapticGeneratorSession, java.lang.Exception> p2) {}
        public void startVendorSession(android.os.VibrationAttributes p0, java.lang.String p1, android.os.CancellationSignal p2, java.util.concurrent.Executor p3, android.os.vibrator.VendorVibrationSession.Callback p4) {}
        public void vibrate(int p0, java.lang.String p1, android.os.VibrationEffect p2, java.lang.String p3, android.os.VibrationAttributes p4) {}
    }

    private static class VendorVibrationSessionCallbackDelegate extends android.os.vibrator.IVibrationSessionCallback.Stub {
        private final android.os.vibrator.VendorVibrationSession.Callback mCallback = null;
        private final java.util.concurrent.Executor mExecutor = null;
        VendorVibrationSessionCallbackDelegate(java.util.concurrent.Executor p0, android.os.vibrator.VendorVibrationSession.Callback p1) { super(); }
        public void onFinished(int p0) {}
        public void onFinishing() {}
        public void onStarted(android.os.vibrator.IVibrationSession p0) {}
    }
}
