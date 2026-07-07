package com.android.internal.vibrator.persistence;

final class SerializedAmplitudeStepWaveform implements com.android.internal.vibrator.persistence.SerializedComposedEffect.SerializedSegment {
    private final int[] mAmplitudes = null;
    private final int mRepeatIndex = 0;
    private final long[] mStartTimesMillis = null;
    private final long[] mTimings = null;
    private SerializedAmplitudeStepWaveform(long[] p0, int[] p1, long[] p2, int p3) {}
    private void writeWaveformEntry(com.android.modules.utils.TypedXmlSerializer p0, int p1) throws java.io.IOException {}
    public void deserializeIntoComposition(android.os.VibrationEffect.Composition p0) {}
    public java.lang.String toString() { return null; }
    public void write(com.android.modules.utils.TypedXmlSerializer p0) throws java.io.IOException {}

    static final class Builder implements com.android.internal.vibrator.persistence.SerializedAmplitudeStepWaveform.StepSegmentBuilder {
        private final android.util.IntArray mAmplitudes = null;
        private int mRepeatIndex;
        private final android.util.LongArray mStartTimesMillis = null;
        private final android.util.LongArray mTimings = null;
        Builder() {}
        public void addDurationAmplitudeAndStartTime(long p0, int p1, long p2) {}
        com.android.internal.vibrator.persistence.SerializedAmplitudeStepWaveform build() { return null; }
        boolean hasNonZeroDuration() { return false; }
        void setRepeatIndexToCurrentEntry() {}
    }

    static final class Parser {
        Parser() {}
        static com.android.internal.vibrator.persistence.SerializedAmplitudeStepWaveform parseNext(com.android.modules.utils.TypedXmlPullParser p0) throws com.android.internal.vibrator.persistence.XmlParserException, java.io.IOException { return null; }
        private static void parseRepeating(com.android.modules.utils.TypedXmlPullParser p0, com.android.internal.vibrator.persistence.SerializedAmplitudeStepWaveform.Builder p1) throws com.android.internal.vibrator.persistence.XmlParserException, java.io.IOException {}
        static void parseWaveformEntry(com.android.modules.utils.TypedXmlPullParser p0, com.android.internal.vibrator.persistence.SerializedAmplitudeStepWaveform.StepSegmentBuilder p1) throws com.android.internal.vibrator.persistence.XmlParserException, java.io.IOException {}
    }

    static interface StepSegmentBuilder {
        public void addDurationAmplitudeAndStartTime(long p0, int p1, long p2);
    }
}
