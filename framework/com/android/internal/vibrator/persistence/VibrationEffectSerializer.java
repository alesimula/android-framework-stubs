package com.android.internal.vibrator.persistence;

public class VibrationEffectSerializer {
    private static final java.lang.String TAG = "VibrationEffectSerializer";
    public VibrationEffectSerializer() {}
    public static com.android.internal.vibrator.persistence.XmlSerializedVibration<? extends android.os.VibrationEffect> serialize(android.os.VibrationEffect p0, int p1) throws com.android.internal.vibrator.persistence.XmlSerializerException { return null; }
    private static com.android.internal.vibrator.persistence.SerializedComposedEffect serializeBasicEnvelopeEffect(java.util.List<android.os.vibrator.VibrationEffectSegment> p0) throws com.android.internal.vibrator.persistence.XmlSerializerException { return null; }
    private static com.android.internal.vibrator.persistence.SerializedComposedEffect serializeEffectEntries(java.util.List<android.os.vibrator.VibrationEffectSegment> p0, int p1) throws com.android.internal.vibrator.persistence.XmlSerializerException { return null; }
    private static com.android.internal.vibrator.persistence.SerializedComposedEffect serializeNonRepeatingEffect(java.util.List<android.os.vibrator.VibrationEffectSegment> p0, int p1) throws com.android.internal.vibrator.persistence.XmlSerializerException { return null; }
    private static com.android.internal.vibrator.persistence.SerializedPredefinedEffect serializePrebakedSegment(android.os.vibrator.VibrationEffectSegment p0, int p1) throws com.android.internal.vibrator.persistence.XmlSerializerException { return null; }
    private static com.android.internal.vibrator.persistence.SerializedComposedEffect serializePredefinedEffect(java.util.List<android.os.vibrator.VibrationEffectSegment> p0, int p1) throws com.android.internal.vibrator.persistence.XmlSerializerException { return null; }
    private static com.android.internal.vibrator.persistence.SerializedComposedEffect serializePrimitiveEffect(java.util.List<android.os.vibrator.VibrationEffectSegment> p0) throws com.android.internal.vibrator.persistence.XmlSerializerException { return null; }
    private static com.android.internal.vibrator.persistence.SerializedCompositionPrimitive serializePrimitiveSegment(android.os.vibrator.VibrationEffectSegment p0) throws com.android.internal.vibrator.persistence.XmlSerializerException { return null; }
    private static com.android.internal.vibrator.persistence.SerializedComposedEffect serializeRepeatingEffect(java.util.List<android.os.vibrator.VibrationEffectSegment> p0, int p1, int p2) throws com.android.internal.vibrator.persistence.XmlSerializerException { return null; }
    private static void serializeStepSegment(android.os.vibrator.VibrationEffectSegment p0, com.android.internal.vibrator.persistence.SerializedAmplitudeStepWaveform.StepSegmentBuilder p1) throws com.android.internal.vibrator.persistence.XmlSerializerException {}
    private static com.android.internal.vibrator.persistence.SerializedVendorEffect serializeVendorEffect(android.os.VibrationEffect.VendorEffect p0) { return null; }
    private static com.android.internal.vibrator.persistence.SerializedComposedEffect serializeWaveformEffect(java.util.List<android.os.vibrator.VibrationEffectSegment> p0) throws com.android.internal.vibrator.persistence.XmlSerializerException { return null; }
    private static com.android.internal.vibrator.persistence.SerializedComposedEffect serializeWaveformEffectEntries(java.util.List<android.os.vibrator.VibrationEffectSegment> p0) throws com.android.internal.vibrator.persistence.XmlSerializerException { return null; }
    private static com.android.internal.vibrator.persistence.SerializedComposedEffect serializeWaveformEnvelopeEffect(java.util.List<android.os.vibrator.VibrationEffectSegment> p0) throws com.android.internal.vibrator.persistence.XmlSerializerException { return null; }
    private static int toAmplitudeInt(float p0) { return 0; }
    private static com.android.internal.vibrator.persistence.SerializedComposedEffect trySerializeNonWaveformEffect(java.util.List<android.os.vibrator.VibrationEffectSegment> p0, int p1) throws com.android.internal.vibrator.persistence.XmlSerializerException { return null; }
    private static com.android.internal.vibrator.persistence.SerializedComposedEffect trySerializeRepeatingAmplitudeWaveformEffect(java.util.List<android.os.vibrator.VibrationEffectSegment> p0, int p1) { return null; }
}
