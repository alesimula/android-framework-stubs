package android.hardware.input;

public class InputDeviceVibratorManager extends android.os.VibratorManager implements android.hardware.input.InputManager.InputDeviceListener {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "InputDeviceVibratorManager";
    private final int mDeviceId = 0;
    private final android.hardware.input.InputManagerGlobal mGlobal = null;
    private final android.os.Binder mToken = null;
    private final android.util.SparseArray<android.os.Vibrator> mVibrators = null;
    public InputDeviceVibratorManager(int p0) { super(); }
    private void initializeVibrators() {}
    public void cancel() {}
    public void cancel(int p0) {}
    public android.os.Vibrator getDefaultVibrator() { return null; }
    public android.os.Vibrator getVibrator(int p0) { return null; }
    public int[] getVibratorIds() { return null; }
    public void onInputDeviceAdded(int p0) {}
    public void onInputDeviceChanged(int p0) {}
    public void onInputDeviceRemoved(int p0) {}
    public void vibrate(int p0, java.lang.String p1, android.os.CombinedVibration p2, java.lang.String p3, android.os.VibrationAttributes p4) {}
}
