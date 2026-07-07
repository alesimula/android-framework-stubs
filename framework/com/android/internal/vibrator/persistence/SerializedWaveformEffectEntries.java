package com.android.internal.vibrator.persistence;

final class SerializedWaveformEffectEntries implements com.android.internal.vibrator.persistence.SerializedComposedEffect.SerializedSegment {
    private final int[] mAmplitudes = null;
    private final long[] mStartTimesMillis = null;
    private final long[] mTimings = null;
    private SerializedWaveformEffectEntries(long[] p0, int[] p1, long[] p2) {}
    public void deserializeIntoComposition(android.os.VibrationEffect.Composition p0) {}
    public java.lang.String toString() { return null; }
    public void write(com.android.modules.utils.TypedXmlSerializer p0) throws java.io.IOException {}

    static final class Builder implements com.android.internal.vibrator.persistence.SerializedAmplitudeStepWaveform.StepSegmentBuilder {
        private final android.util.IntArray mAmplitudes = null;
        private final android.util.LongArray mStartTimesMillis = null;
        private final android.util.LongArray mTimings = null;
        Builder() {}
        public void addDurationAmplitudeAndStartTime(long p0, int p1, long p2) {}
        com.android.internal.vibrator.persistence.SerializedWaveformEffectEntries build() { return null; }
        boolean hasNonZeroDuration() { return false; }
    }

    static final class Parser {
        Parser() {}
        public static void parseWaveformEntry(com.android.modules.utils.TypedXmlPullParser p0, com.android.internal.vibrator.persistence.SerializedWaveformEffectEntries.Builder p1) throws com.android.internal.vibrator.persistence.XmlParserException, java.io.IOException {}
    }
}
