package android.media.audiofx;

public class EnvironmentalReverb extends android.media.audiofx.AudioEffect {
    public static final int PARAM_DECAY_HF_RATIO = 3;
    public static final int PARAM_DECAY_TIME = 2;
    public static final int PARAM_DENSITY = 9;
    public static final int PARAM_DIFFUSION = 8;
    private static final int PARAM_PROPERTIES = 10;
    public static final int PARAM_REFLECTIONS_DELAY = 5;
    public static final int PARAM_REFLECTIONS_LEVEL = 4;
    public static final int PARAM_REVERB_DELAY = 7;
    public static final int PARAM_REVERB_LEVEL = 6;
    public static final int PARAM_ROOM_HF_LEVEL = 1;
    public static final int PARAM_ROOM_LEVEL = 0;
    private static int PROPERTY_SIZE;
    private static final java.lang.String TAG = "EnvironmentalReverb";
    private android.media.audiofx.EnvironmentalReverb.BaseParameterListener mBaseParamListener;
    private android.media.audiofx.EnvironmentalReverb.OnParameterChangeListener mParamListener;
    private final java.lang.Object mParamListenerLock = null;
    public EnvironmentalReverb(int p0, int p1) throws java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException, java.lang.RuntimeException { super((java.util.UUID)null, (android.media.AudioDeviceAttributes)null); }
    public short getDecayHFRatio() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { return 0; }
    public int getDecayTime() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { return 0; }
    public short getDensity() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { return 0; }
    public short getDiffusion() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { return 0; }
    public android.media.audiofx.EnvironmentalReverb.Settings getProperties() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { return null; }
    public int getReflectionsDelay() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { return 0; }
    public short getReflectionsLevel() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { return 0; }
    public int getReverbDelay() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { return 0; }
    public short getReverbLevel() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { return 0; }
    public short getRoomHFLevel() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { return 0; }
    public short getRoomLevel() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException { return 0; }
    public void setDecayHFRatio(short p0) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException {}
    public void setDecayTime(int p0) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException {}
    public void setDensity(short p0) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException {}
    public void setDiffusion(short p0) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException {}
    public void setParameterListener(android.media.audiofx.EnvironmentalReverb.OnParameterChangeListener p0) {}
    public void setProperties(android.media.audiofx.EnvironmentalReverb.Settings p0) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException {}
    public void setReflectionsDelay(int p0) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException {}
    public void setReflectionsLevel(short p0) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException {}
    public void setReverbDelay(int p0) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException {}
    public void setReverbLevel(short p0) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException {}
    public void setRoomHFLevel(short p0) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException {}
    public void setRoomLevel(short p0) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException {}

    private class BaseParameterListener implements android.media.audiofx.AudioEffect.OnParameterChangeListener {
        private BaseParameterListener(android.media.audiofx.EnvironmentalReverb p0) {}
        public void onParameterChange(android.media.audiofx.AudioEffect p0, int p1, byte[] p2, byte[] p3) {}
    }

    public static interface OnParameterChangeListener {
        public void onParameterChange(android.media.audiofx.EnvironmentalReverb p0, int p1, int p2, int p3);
    }

    public static class Settings {
        public short decayHFRatio;
        public int decayTime;
        public short density;
        public short diffusion;
        public int reflectionsDelay;
        public short reflectionsLevel;
        public int reverbDelay;
        public short reverbLevel;
        public short roomHFLevel;
        public short roomLevel;
        public Settings() {}
        public Settings(java.lang.String p0) {}
        public java.lang.String toString() { return null; }
    }
}
