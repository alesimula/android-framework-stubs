package android.os;

public abstract class Vibrator {
    private static final java.lang.String TAG = "Vibrator";
    public static final int VIBRATION_EFFECT_SUPPORT_NO = 2;
    public static final int VIBRATION_EFFECT_SUPPORT_UNKNOWN = 0;
    public static final int VIBRATION_EFFECT_SUPPORT_YES = 1;
    public static final int VIBRATION_INTENSITY_HIGH = 3;
    public static final int VIBRATION_INTENSITY_LOW = 1;
    public static final int VIBRATION_INTENSITY_MEDIUM = 2;
    public static final int VIBRATION_INTENSITY_OFF = 0;
    private final java.lang.String mPackageName = null;
    private final android.content.res.Resources mResources = null;
    private volatile android.os.vibrator.VibrationConfig mVibrationConfig;
    private android.os.vibrator.VibratorEnvelopeEffectInfo mVibratorEnvelopeEffectInfo;
    private android.os.vibrator.VibratorFrequencyProfile mVibratorFrequencyProfile;
    public Vibrator() {}
    protected Vibrator(android.content.Context p0) {}
    private android.os.vibrator.VibrationConfig getConfig() { return null; }
    @android.annotation.SystemApi
    public void addVibratorStateListener(android.os.Vibrator.OnVibratorStateChangedListener p0) {}
    @android.annotation.SystemApi
    public void addVibratorStateListener(java.util.concurrent.Executor p0, android.os.Vibrator.OnVibratorStateChangedListener p1) {}
    public final int areAllEffectsSupported(int... p0) { return 0; }
    public final boolean areAllPrimitivesSupported(int... p0) { return false; }
    public int[] areEffectsSupported(int... p0) { return null; }
    public boolean areEnvelopeEffectsSupported() { return false; }
    public boolean[] arePrimitivesSupported(int... p0) { return null; }
    @android.annotation.SystemApi
    public boolean areVendorEffectsSupported() { return false; }
    @android.annotation.SystemApi
    public boolean areVendorSessionsSupported() { return false; }
    public boolean areVibrationFeaturesSupported(android.os.VibrationEffect p0) { return false; }
    public abstract void cancel();
    public abstract void cancel(int p0);
    public int getDefaultVibrationIntensity(int p0) { return 0; }
    public android.os.vibrator.VibratorEnvelopeEffectInfo getEnvelopeEffectInfo() { return null; }
    public android.os.vibrator.VibratorFrequencyProfile getFrequencyProfile() { return null; }
    public android.os.vibrator.VibratorFrequencyProfileLegacy getFrequencyProfileLegacy() { return null; }
    public float getHapticChannelMaximumAmplitude() { return 0.0f; }
    public int getId() { return 0; }
    public android.os.VibratorInfo getInfo() { return null; }
    public int[] getPrimitiveDurations(int... p0) { return null; }
    public float getQFactor() { return 0.0f; }
    public float getResonantFrequency() { return 0.0f; }
    public abstract boolean hasAmplitudeControl();
    public boolean hasExternalControl() { return false; }
    public boolean hasFrequencyControl() { return false; }
    public abstract boolean hasVibrator();
    @android.annotation.SystemApi
    public boolean isHapticGeneratorSupported() { return false; }
    @android.annotation.SystemApi
    public boolean isVibrating() { return false; }
    public void performHapticFeedback(int p0, int p1, java.lang.String p2, int p3, int p4) {}
    public void performHapticFeedbackForInputDevice(int p0, int p1, int p2, java.lang.String p3, int p4, int p5) {}
    @android.annotation.SystemApi
    public void removeVibratorStateListener(android.os.Vibrator.OnVibratorStateChangedListener p0) {}
    public boolean setAlwaysOnEffect(int p0, android.os.VibrationEffect p1, android.os.VibrationAttributes p2) { return false; }
    public boolean setAlwaysOnEffect(int p0, java.lang.String p1, int p2, android.os.VibrationEffect p3, android.os.VibrationAttributes p4) { return false; }
    @android.annotation.SystemApi
    public void startHapticGeneratorSession(android.os.vibrator.HapticGeneratorSession.Config p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<android.os.vibrator.HapticGeneratorSession, java.lang.Exception> p2) {}
    @android.annotation.SystemApi
    public void startVendorSession(android.os.VibrationAttributes p0, java.lang.String p1, android.os.CancellationSignal p2, java.util.concurrent.Executor p3, android.os.vibrator.VendorVibrationSession.Callback p4) {}
    public abstract void vibrate(int p0, java.lang.String p1, android.os.VibrationEffect p2, java.lang.String p3, android.os.VibrationAttributes p4);
    @java.lang.Deprecated
    public void vibrate(long p0) {}
    @java.lang.Deprecated
    public void vibrate(long p0, android.media.AudioAttributes p1) {}
    public void vibrate(android.os.VibrationEffect p0) {}
    public void vibrate(android.os.VibrationEffect p0, android.media.AudioAttributes p1) {}
    public void vibrate(android.os.VibrationEffect p0, android.os.VibrationAttributes p1) {}
    public void vibrate(android.os.VibrationEffect p0, android.os.VibrationAttributes p1, java.lang.String p2) {}
    @java.lang.Deprecated
    public void vibrate(long[] p0, int p1) {}
    @java.lang.Deprecated
    public void vibrate(long[] p0, int p1, android.media.AudioAttributes p2) {}

    @android.annotation.SystemApi
    public static interface OnVibratorStateChangedListener {
        public void onVibratorStateChanged(boolean p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VibrationEffectSupport {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VibrationIntensity {
    }
}
