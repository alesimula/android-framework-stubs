package android.media.audiofx;

public class BassBoost extends android.media.audiofx.AudioEffect {
    public static final int PARAM_STRENGTH = 1;
    public static final int PARAM_STRENGTH_SUPPORTED = 0;
    private static final java.lang.String TAG = "BassBoost";
    private android.media.audiofx.BassBoost.BaseParameterListener mBaseParamListener;
    private android.media.audiofx.BassBoost.OnParameterChangeListener mParamListener;
    private final java.lang.Object mParamListenerLock = null;
    private boolean mStrengthSupported;
    public BassBoost(int p0, int p1) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException, java.lang.RuntimeException { super((java.util.UUID)null, (android.media.AudioDeviceAttributes)null); }
    public android.media.audiofx.BassBoost.Settings getProperties() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { return null; }
    public short getRoundedStrength() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { return 0; }
    public boolean getStrengthSupported() { return false; }
    public void setParameterListener(android.media.audiofx.BassBoost.OnParameterChangeListener p0) {}
    public void setProperties(android.media.audiofx.BassBoost.Settings p0) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException {}
    public void setStrength(short p0) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException {}

    private class BaseParameterListener implements android.media.audiofx.AudioEffect.OnParameterChangeListener {
        private BaseParameterListener(android.media.audiofx.BassBoost p0) {}
        public void onParameterChange(android.media.audiofx.AudioEffect p0, int p1, byte[] p2, byte[] p3) {}
    }

    public static interface OnParameterChangeListener {
        public void onParameterChange(android.media.audiofx.BassBoost p0, int p1, int p2, short p3);
    }

    public static class Settings {
        public short strength;
        public Settings() {}
        public Settings(java.lang.String p0) {}
        public java.lang.String toString() { return null; }
    }
}
