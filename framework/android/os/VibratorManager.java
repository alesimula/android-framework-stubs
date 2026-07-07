package android.os;

public abstract class VibratorManager {
    private static final java.lang.String TAG = "VibratorManager";
    protected final java.lang.String mPackageName = null;
    public VibratorManager() {}
    protected VibratorManager(android.content.Context p0) {}
    public abstract void cancel();
    public abstract void cancel(int p0);
    public abstract android.os.Vibrator getDefaultVibrator();
    public abstract android.os.Vibrator getVibrator(int p0);
    public abstract int[] getVibratorIds();
    public boolean hasCapabilities(int p0) { return false; }
    public void performHapticFeedback(int p0, int p1, java.lang.String p2, int p3, int p4) {}
    public void performHapticFeedbackForInputDevice(int p0, int p1, int p2, java.lang.String p3, int p4, int p5) {}
    public boolean setAlwaysOnEffect(int p0, java.lang.String p1, int p2, android.os.CombinedVibration p3, android.os.VibrationAttributes p4) { return false; }
    public void startHapticGeneratorSession(int p0, android.os.vibrator.HapticGeneratorSession.Config p1, java.util.concurrent.Executor p2, android.os.OutcomeReceiver<android.os.vibrator.HapticGeneratorSession, java.lang.Exception> p3) {}
    public void startVendorSession(int[] p0, android.os.VibrationAttributes p1, java.lang.String p2, android.os.CancellationSignal p3, java.util.concurrent.Executor p4, android.os.vibrator.VendorVibrationSession.Callback p5) {}
    public abstract void vibrate(int p0, java.lang.String p1, android.os.CombinedVibration p2, java.lang.String p3, android.os.VibrationAttributes p4);
    public final void vibrate(android.os.CombinedVibration p0) {}
    public final void vibrate(android.os.CombinedVibration p0, android.os.VibrationAttributes p1) {}
}
