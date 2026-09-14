package com.android.internal.vibrator.persistencev2;

public class VibrationEffectXmlParser {
    public VibrationEffectXmlParser() {}
    private static int getDurationMillis(com.android.internal.vibrator.persistencev2.VibrationEffectXmlParser.HapticEffectData p0) { return 0; }
    private static android.os.VibrationEffect.Envelope parseAdvancedEnvelope(com.android.modules.utils.TypedXmlPullParser p0) throws com.android.internal.vibrator.persistence.XmlParserException, java.io.IOException { return null; }
    private static android.os.VibrationEffect.Envelope parseBasicEnvelope(com.android.modules.utils.TypedXmlPullParser p0) throws com.android.internal.vibrator.persistence.XmlParserException, java.io.IOException { return null; }
    public static android.os.VibrationEffect parseDocument(com.android.modules.utils.TypedXmlPullParser p0) throws com.android.internal.vibrator.persistence.XmlParserException, java.io.IOException { return null; }
    private static void parseEvent(com.android.modules.utils.TypedXmlPullParser p0, android.os.VibrationEffect.Builder p1) throws com.android.internal.vibrator.persistence.XmlParserException, java.io.IOException {}
    private static com.android.internal.vibrator.persistencev2.VibrationEffectXmlParser.HapticEffectData parseHapticEffect(com.android.modules.utils.TypedXmlPullParser p0) throws com.android.internal.vibrator.persistence.XmlParserException, java.io.IOException { return null; }
    private static android.os.VibrationEffect.Preset parsePreset(com.android.modules.utils.TypedXmlPullParser p0) throws com.android.internal.vibrator.persistence.XmlParserException, java.io.IOException { return null; }
    public static android.os.VibrationEffect parseTag(com.android.modules.utils.TypedXmlPullParser p0) throws com.android.internal.vibrator.persistence.XmlParserException, java.io.IOException { return null; }

    private static final class HapticEffectData {
        final int durationMillis = 0;
        final android.os.VibrationEffect effect = null;
        final int repetitions = 0;
        HapticEffectData(android.os.VibrationEffect p0, int p1, int p2) {}
    }
}
