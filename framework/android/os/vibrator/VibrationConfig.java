package android.os.vibrator;

public class VibrationConfig {
    private static final int DEFAULT_AMPLITUDE = 255;
    private static final float DEFAULT_SCALE_LEVEL_GAIN = 1.399999976158142f;
    private final int mDefaultAlarmVibrationIntensity = 0;
    private final int mDefaultHapticFeedbackIntensity = 0;
    private final int mDefaultKeyboardVibrationIntensity = 0;
    private final int mDefaultMediaVibrationIntensity = 0;
    private final int mDefaultNotificationVibrationIntensity = 0;
    private final int mDefaultRingVibrationIntensity = 0;
    private final int mDefaultVibrationAmplitude = 0;
    private final float mDefaultVibrationScaleLevelGain = 0.0f;
    private final float[] mExternalVibrationScaleFactors = null;
    private final float mHapticChannelMaxVibrationAmplitude = 0.0f;
    private final boolean mIgnoreVibrationsOnWirelessCharger = false;
    private final float[] mKeyboardVibrationScaleFactors = null;
    private final boolean mKeyboardVibrationSettingsIntensitySupported = false;
    private final boolean mKeyboardVibrationSettingsSupported = false;
    private final int mRampDownDurationMs = 0;
    private final int[] mRequestVibrationParamsForUsages = null;
    private final int mRequestVibrationParamsTimeoutMs = 0;
    private final int mVibrationPipelineMaxDurationMs = 0;
    private final float[] mVibrationScaleFactors = null;
    public VibrationConfig(android.content.res.Resources p0) {}
    public VibrationConfig(android.os.vibrator.VibrationConfig.Builder p0) {}
    private java.lang.String[] getRequestVibrationParamsForUsagesNames() { return null; }
    private static boolean loadBoolean(android.content.res.Resources p0, int p1) { return false; }
    private static int loadDefaultIntensity(android.content.res.Resources p0, int p1) { return 0; }
    private static float loadFloat(android.content.res.Resources p0, int p1) { return 0.0f; }
    private static float[] loadFloatArray(android.content.res.Resources p0, int p1) { return null; }
    private static int[] loadIntArray(android.content.res.Resources p0, int p1) { return null; }
    private static int loadInteger(android.content.res.Resources p0, int p1) { return 0; }
    private static int loadInteger(android.content.res.Resources p0, int p1, int p2) { return 0; }
    private static float[] loadIntensityScaleFactors(android.content.res.Resources p0, int p1) { return null; }
    public void dumpWithoutDefaultSettings(android.util.IndentingPrintWriter p0) {}
    public int getDefaultVibrationAmplitude() { return 0; }
    public int getDefaultVibrationIntensity(int p0) { return 0; }
    public float getDefaultVibrationScaleLevelGain() { return 0.0f; }
    public float getExternalVibrationScaleFactor(int p0, float p1) { return 0.0f; }
    public float getHapticChannelMaximumAmplitude() { return 0.0f; }
    public float getKeyboardVibrationScaleFactor(int p0, float p1) { return 0.0f; }
    public int getRampDownDurationMs() { return 0; }
    public int[] getRequestVibrationParamsForUsages() { return null; }
    public int getRequestVibrationParamsTimeoutMs() { return 0; }
    public int getVibrationPipelineMaxDurationMs() { return 0; }
    public float getVibrationScaleFactor(int p0, float p1) { return 0.0f; }
    public boolean hasExternalVibrationScaleFactors() { return false; }
    public boolean hasVibrationScaleFactors() { return false; }
    public boolean ignoreVibrationsOnWirelessCharger() { return false; }
    public boolean isKeyboardVibrationSettingsIntensitySupported() { return false; }
    public boolean isKeyboardVibrationSettingsSupported() { return false; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        private int mDefaultAlarmVibrationIntensity;
        private int mDefaultHapticFeedbackIntensity;
        private int mDefaultKeyboardVibrationIntensity;
        private int mDefaultMediaVibrationIntensity;
        private int mDefaultNotificationVibrationIntensity;
        private int mDefaultRingVibrationIntensity;
        private int mDefaultVibrationAmplitude;
        private float mDefaultVibrationScaleLevelGain;
        private float[] mExternalVibrationScaleFactors;
        private float mHapticChannelMaxVibrationAmplitude;
        private boolean mIgnoreVibrationsOnWirelessCharger;
        private float[] mKeyboardVibrationScaleFactors;
        private boolean mKeyboardVibrationSettingsIntensitySupported;
        private boolean mKeyboardVibrationSettingsSupported;
        private int mRampDownDurationMs;
        private int[] mRequestVibrationParamsForUsages;
        private int mRequestVibrationParamsTimeoutMs;
        private int mVibrationPipelineMaxDurationMs;
        private float[] mVibrationScaleFactors;
        public Builder(android.content.res.Resources p0) {}
        public android.os.vibrator.VibrationConfig build() { return null; }
        public void setDefaultAlarmVibrationIntensity(int p0) {}
        public void setDefaultHapticFeedbackIntensity(int p0) {}
        public void setDefaultKeyboardVibrationIntensity(int p0) {}
        public void setDefaultMediaVibrationIntensity(int p0) {}
        public void setDefaultNotificationVibrationIntensity(int p0) {}
        public void setDefaultRingVibrationIntensity(int p0) {}
        public void setDefaultVibrationAmplitude(int p0) {}
        public void setDefaultVibrationScaleLevelGain(float p0) {}
        public void setExternalVibrationScaleFactors(float[] p0) {}
        public void setHapticChannelMaxVibrationAmplitude(float p0) {}
        public void setIgnoreVibrationsOnWirelessCharger(boolean p0) {}
        public void setKeyboardVibrationScaleFactors(float[] p0) {}
        public void setKeyboardVibrationSettingsIntensitySupported(boolean p0) {}
        public void setKeyboardVibrationSettingsSupported(boolean p0) {}
        public void setRampDownDurationMs(int p0) {}
        public void setRequestVibrationParamsForUsages(int[] p0) {}
        public void setRequestVibrationParamsTimeoutMs(int p0) {}
        public void setVibrationPipelineMaxDurationMs(int p0) {}
        public void setVibrationScaleFactors(float[] p0) {}
    }
}
