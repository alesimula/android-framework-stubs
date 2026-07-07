package com.android.internal.vibrator.persistence;

final class SerializedBasicEnvelopeEffect implements com.android.internal.vibrator.persistence.SerializedComposedEffect.SerializedSegment {
    private final com.android.internal.vibrator.persistence.SerializedBasicEnvelopeEffect.BasicControlPoint[] mControlPoints = null;
    private final float mInitialSharpness = 0.0f;
    private final long mStartTimeMillis = 0L;
    SerializedBasicEnvelopeEffect(com.android.internal.vibrator.persistence.SerializedBasicEnvelopeEffect.BasicControlPoint[] p0, float p1) {}
    SerializedBasicEnvelopeEffect(com.android.internal.vibrator.persistence.SerializedBasicEnvelopeEffect.BasicControlPoint[] p0, float p1, long p2) {}
    public void deserializeIntoComposition(android.os.VibrationEffect.Composition p0) {}
    public java.lang.String toString() { return null; }
    public void write(com.android.modules.utils.TypedXmlSerializer p0) throws java.io.IOException {}

    private static final class BasicControlPoint {
        private final long mDurationMs = 0L;
        private final float mIntensity = 0.0f;
        private final float mSharpness = 0.0f;
        BasicControlPoint(float p0, float p1, long p2) {}
        public java.lang.String toString() { return null; }
    }

    static final class Builder {
        private final java.util.List<com.android.internal.vibrator.persistence.SerializedBasicEnvelopeEffect.BasicControlPoint> mControlPoints = null;
        private float mInitialSharpness;
        private long mStartTimeMillis;
        Builder() {}
        void addControlPoint(float p0, float p1, long p2) {}
        com.android.internal.vibrator.persistence.SerializedBasicEnvelopeEffect build() { return null; }
        void setInitialSharpness(float p0) {}
        void setStartTimeMillis(long p0) {}
    }

    static final class Parser {
        Parser() {}
        private static void parseControlPoint(com.android.modules.utils.TypedXmlPullParser p0, com.android.internal.vibrator.persistence.SerializedBasicEnvelopeEffect.Builder p1) throws com.android.internal.vibrator.persistence.XmlParserException {}
        static com.android.internal.vibrator.persistence.SerializedBasicEnvelopeEffect parseNext(com.android.modules.utils.TypedXmlPullParser p0, int p1) throws com.android.internal.vibrator.persistence.XmlParserException, java.io.IOException { return null; }
    }
}
