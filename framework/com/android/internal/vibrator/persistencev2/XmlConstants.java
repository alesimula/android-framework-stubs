package com.android.internal.vibrator.persistencev2;

public final class XmlConstants {
    public static final java.lang.String ATTRIBUTE_AMPLITUDE = "amplitude";
    public static final java.lang.String ATTRIBUTE_DURATION_MILLIS = "durationMillis";
    public static final java.lang.String ATTRIBUTE_FREQUENCY_HZ = "frequencyHz";
    public static final java.lang.String ATTRIBUTE_INITIAL_FREQUENCY = "initialFrequency";
    public static final java.lang.String ATTRIBUTE_INITIAL_SHARPNESS = "initialSharpness";
    public static final java.lang.String ATTRIBUTE_INTENSITY = "intensity";
    public static final java.lang.String ATTRIBUTE_PRESET_ENUM = "presetEnum";
    public static final java.lang.String ATTRIBUTE_REPETITIONS = "repetitions";
    public static final java.lang.String ATTRIBUTE_SCALE = "scale";
    public static final java.lang.String ATTRIBUTE_SHARPNESS = "sharpness";
    public static final java.lang.String ATTRIBUTE_START_TIME_MILLIS = "startTimeMillis";
    public static final java.lang.String ATTRIBUTE_VERSION = "version";
    public static final java.lang.String NAMESPACE = null;
    public static final int REPETITIONS_INFINITE = -1;
    public static final java.lang.String TAG_ADVANCED_ENVELOPE = "advancedEnvelope";
    public static final java.lang.String TAG_BASIC_ENVELOPE = "basicEnvelope";
    public static final java.lang.String TAG_CONTROL_POINT = "controlPoint";
    public static final java.lang.String TAG_EVENT = "event";
    public static final java.lang.String TAG_HAPTIC_EFFECT = "hapticEffect";
    public static final java.lang.String TAG_HAPTIC_PATTERN = "hapticPattern";
    public static final java.lang.String TAG_PRESET = "preset";
    public XmlConstants() {}

    public static enum PresetEnum {
        CLICK,
        LOW_TICK,
        TICK;
        private static final com.android.internal.vibrator.persistencev2.XmlConstants.PresetEnum[] $VALUES = null;
        private final int mPresetId = 0;
        private PresetEnum() {}
        public static com.android.internal.vibrator.persistencev2.XmlConstants.PresetEnum findById(int p0) { return null; }
        public static com.android.internal.vibrator.persistencev2.XmlConstants.PresetEnum findByName(java.lang.String p0) { return null; }
        public int getPresetId() { return 0; }
        public java.lang.String toString() { return null; }
    }
}
