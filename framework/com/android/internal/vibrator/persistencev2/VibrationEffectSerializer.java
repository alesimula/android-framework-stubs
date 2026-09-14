package com.android.internal.vibrator.persistencev2;

public class VibrationEffectSerializer {
    public VibrationEffectSerializer() {}
    private static void serializeAdvancedEnvelope(com.android.modules.utils.TypedXmlSerializer p0, java.util.List<android.os.vibrator.VibrationEffectSegment> p1) throws com.android.internal.vibrator.persistence.XmlSerializerException, java.io.IOException {}
    private static void serializeBasicEnvelope(com.android.modules.utils.TypedXmlSerializer p0, java.util.List<android.os.vibrator.VibrationEffectSegment> p1) throws com.android.internal.vibrator.persistence.XmlSerializerException, java.io.IOException {}
    public static void serializeDocument(com.android.modules.utils.TypedXmlSerializer p0, android.os.VibrationEffect p1) throws com.android.internal.vibrator.persistence.XmlSerializerException, java.io.IOException {}
    private static void serializeEvent(com.android.modules.utils.TypedXmlSerializer p0, android.os.VibrationEffect.Event p1) throws com.android.internal.vibrator.persistence.XmlSerializerException, java.io.IOException {}
    private static void serializeHapticEffect(com.android.modules.utils.TypedXmlSerializer p0, android.os.VibrationEffect p1, int p2, int p3) throws com.android.internal.vibrator.persistence.XmlSerializerException, java.io.IOException {}
    private static void serializePreset(com.android.modules.utils.TypedXmlSerializer p0, android.os.vibrator.PresetSegment p1) throws com.android.internal.vibrator.persistence.XmlSerializerException, java.io.IOException {}
}
