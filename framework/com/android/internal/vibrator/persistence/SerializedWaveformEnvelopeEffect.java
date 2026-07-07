package com.android.internal.vibrator.persistence;

final class SerializedWaveformEnvelopeEffect implements com.android.internal.vibrator.persistence.SerializedComposedEffect.SerializedSegment {
    private final com.android.internal.vibrator.persistence.SerializedWaveformEnvelopeEffect.WaveformControlPoint[] mControlPoints = null;
    private final float mInitialFrequency = 0.0f;
    private final long mStartTimeMillis = 0L;
    SerializedWaveformEnvelopeEffect(com.android.internal.vibrator.persistence.SerializedWaveformEnvelopeEffect.WaveformControlPoint[] p0, float p1) {}
    SerializedWaveformEnvelopeEffect(com.android.internal.vibrator.persistence.SerializedWaveformEnvelopeEffect.WaveformControlPoint[] p0, float p1, long p2) {}
    public void deserializeIntoComposition(android.os.VibrationEffect.Composition p0) {}
    public java.lang.String toString() { return null; }
    public void write(com.android.modules.utils.TypedXmlSerializer p0) throws java.io.IOException {}

    static final class Builder {
        private final java.util.List<com.android.internal.vibrator.persistence.SerializedWaveformEnvelopeEffect.WaveformControlPoint> mControlPoints = null;
        private float mInitialFrequencyHz;
        private long mStartTimeMillis;
        Builder() {}
        void addControlPoint(float p0, float p1, long p2) {}
        com.android.internal.vibrator.persistence.SerializedWaveformEnvelopeEffect build() { return null; }
        void setInitialFrequencyHz(float p0) {}
        void setStartTimeMillis(long p0) {}
    }

    static final class Parser {
        Parser() {}
        private static void parseControlPoint(com.android.modules.utils.TypedXmlPullParser p0, com.android.internal.vibrator.persistence.SerializedWaveformEnvelopeEffect.Builder p1) throws com.android.internal.vibrator.persistence.XmlParserException {}
        static com.android.internal.vibrator.persistence.SerializedWaveformEnvelopeEffect parseNext(com.android.modules.utils.TypedXmlPullParser p0, int p1) throws com.android.internal.vibrator.persistence.XmlParserException, java.io.IOException { return null; }
    }

    private static final class WaveformControlPoint {
        private final float mAmplitude = 0.0f;
        private final long mDurationMs = 0L;
        private final float mFrequency = 0.0f;
        WaveformControlPoint(float p0, float p1, long p2) {}
        public java.lang.String toString() { return null; }
    }
}
