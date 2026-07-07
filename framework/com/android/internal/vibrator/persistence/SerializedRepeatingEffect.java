package com.android.internal.vibrator.persistence;

public class SerializedRepeatingEffect implements com.android.internal.vibrator.persistence.SerializedComposedEffect.SerializedSegment {
    private final com.android.internal.vibrator.persistence.SerializedComposedEffect mSerializedPreamble = null;
    private final com.android.internal.vibrator.persistence.SerializedComposedEffect mSerializedRepeating = null;
    SerializedRepeatingEffect(com.android.internal.vibrator.persistence.SerializedComposedEffect p0, com.android.internal.vibrator.persistence.SerializedComposedEffect p1) {}
    public void deserializeIntoComposition(android.os.VibrationEffect.Composition p0) {}
    public java.lang.String toString() { return null; }
    public void write(com.android.modules.utils.TypedXmlSerializer p0) throws java.io.IOException {}

    static final class Builder {
        private com.android.internal.vibrator.persistence.SerializedComposedEffect mPreamble;
        private com.android.internal.vibrator.persistence.SerializedComposedEffect mRepeating;
        Builder() {}
        com.android.internal.vibrator.persistence.SerializedRepeatingEffect build() { return null; }
        boolean hasRepeatingSegment() { return false; }
        void setPreamble(com.android.internal.vibrator.persistence.SerializedComposedEffect p0) {}
        void setRepeating(com.android.internal.vibrator.persistence.SerializedComposedEffect p0) {}
    }

    static final class Parser {
        Parser() {}
        private static com.android.internal.vibrator.persistence.SerializedComposedEffect parseEffect(com.android.modules.utils.TypedXmlPullParser p0, java.lang.String p1, int p2) throws com.android.internal.vibrator.persistence.XmlParserException, java.io.IOException { return null; }
        static com.android.internal.vibrator.persistence.SerializedRepeatingEffect parseNext(com.android.modules.utils.TypedXmlPullParser p0, int p1) throws com.android.internal.vibrator.persistence.XmlParserException, java.io.IOException { return null; }
        private static com.android.internal.vibrator.persistence.SerializedComposedEffect parsePrimitiveEffects(com.android.modules.utils.TypedXmlPullParser p0, int p1) throws java.io.IOException, com.android.internal.vibrator.persistence.XmlParserException { return null; }
        private static com.android.internal.vibrator.persistence.SerializedComposedEffect parseWaveformEntries(com.android.modules.utils.TypedXmlPullParser p0, int p1) throws java.io.IOException, com.android.internal.vibrator.persistence.XmlParserException { return null; }
    }
}
