package com.android.internal.vibrator.persistence;

final class SerializedPredefinedEffect implements com.android.internal.vibrator.persistence.SerializedComposedEffect.SerializedSegment {
    private final com.android.internal.vibrator.persistence.XmlConstants.PredefinedEffectName mEffectName = null;
    private final boolean mShouldFallback = false;
    private final long mStartTimeMillis = 0L;
    SerializedPredefinedEffect(com.android.internal.vibrator.persistence.XmlConstants.PredefinedEffectName p0, boolean p1) {}
    SerializedPredefinedEffect(com.android.internal.vibrator.persistence.XmlConstants.PredefinedEffectName p0, boolean p1, long p2) {}
    public void deserializeIntoComposition(android.os.VibrationEffect.Composition p0) {}
    public java.lang.String toString() { return null; }
    public void write(com.android.modules.utils.TypedXmlSerializer p0) throws java.io.IOException {}

    static final class Parser {
        Parser() {}
        static com.android.internal.vibrator.persistence.SerializedPredefinedEffect parseNext(com.android.modules.utils.TypedXmlPullParser p0, int p1) throws com.android.internal.vibrator.persistence.XmlParserException, java.io.IOException { return null; }
    }
}
