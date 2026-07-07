package android.os;

public abstract class VibrationEffect implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.VibrationEffect> CREATOR = null;
    public static final int DEFAULT_AMPLITUDE = -1;
    public static final int EFFECT_CLICK = 0;
    public static final int EFFECT_DOUBLE_CLICK = 1;
    public static final int EFFECT_HEAVY_CLICK = 5;
    public static final int EFFECT_POP = 4;
    public static final int EFFECT_STRENGTH_LIGHT = 0;
    public static final int EFFECT_STRENGTH_MEDIUM = 1;
    public static final int EFFECT_STRENGTH_STRONG = 2;
    public static final int EFFECT_TEXTURE_TICK = 21;
    public static final int EFFECT_THUD = 3;
    public static final int EFFECT_TICK = 2;
    public static final int MAX_AMPLITUDE = 255;
    private static final long MAX_HAPTIC_FEEDBACK_COMPOSITION_SIZE = 3L;
    private static final long MAX_HAPTIC_FEEDBACK_DURATION = 1000L;
    private static final int PARCEL_TOKEN_COMPOSED = 1;
    private static final int PARCEL_TOKEN_VENDOR_EFFECT = 2;
    public static final float RESONANT_FREQUENCY_SHARPNESS = 0.699999988079071f;
    public static final int[] RINGTONES = null;
    public VibrationEffect() {}
    public static android.os.VibrationEffect createOneShot(long p0, int p1) { return null; }
    public static android.os.VibrationEffect createPredefined(int p0) { return null; }
    public static android.os.VibrationEffect createRepeatingEffect(android.os.VibrationEffect p0) { return null; }
    public static android.os.VibrationEffect createRepeatingEffect(android.os.VibrationEffect p0, android.os.VibrationEffect p1) { return null; }
    @android.annotation.SystemApi
    public static android.os.VibrationEffect createVendorEffect(android.os.PersistableBundle p0) { return null; }
    public static android.os.VibrationEffect createWaveform(long[] p0, int p1) { return null; }
    public static android.os.VibrationEffect createWaveform(long[] p0, int[] p1, int p2) { return null; }
    public static java.lang.String effectIdToString(int p0) { return null; }
    public static java.lang.String effectStrengthToString(int p0) { return null; }
    public static android.os.VibrationEffect get(int p0) { return null; }
    public static android.os.VibrationEffect get(int p0, boolean p1) { return null; }
    public static android.os.VibrationEffect get(android.net.Uri p0, android.content.Context p1) { return null; }
    private static long getEstimatedDurationForSegment(android.os.vibrator.VibrationEffectSegment p0) { return 0L; }
    public static long getEstimatedPredefinedDuration(int p0) { return 0L; }
    public static long getEstimatedPrimitiveDuration(int p0) { return 0L; }
    public static float scale(float p0, float p1) { return 0.0f; }
    public static android.os.VibrationEffect.Composition startComposition() { return null; }
    public abstract android.os.VibrationEffect applyAdaptiveScale(float p0);
    public abstract android.os.VibrationEffect applyEffectStrength(int p0);
    public abstract android.os.VibrationEffect applyRepeatingIndefinitely(boolean p0, int p1);
    public abstract boolean areVibrationFeaturesSupported(android.os.VibratorInfo p0);
    public abstract long[] computeCreateWaveformOffOnTimingsOrNull();
    public abstract android.os.VibrationEffect cropToLengthOrNull(int p0);
    public int describeContents() { return 0; }
    public abstract long getDuration();
    public long getDuration(android.os.VibratorInfo p0) { return 0L; }
    public abstract java.util.List<android.os.VibrationEffect.Event> getEvents();
    public long getRepeatingDurationMillis() { return 0L; }
    public boolean isHapticFeedbackCandidate() { return false; }
    public boolean isTimelineAnchored() { return false; }
    public abstract android.os.VibrationEffect resolve(int p0);
    public abstract android.os.VibrationEffect scale(float p0);
    public abstract java.lang.String toDebugString();
    public abstract void validate();

    public static final class BasicEnvelopeBuilder {
        private float mLastIntensity;
        private float mLastSharpness;
        private java.util.ArrayList<android.os.vibrator.BasicPwleSegment> mSegments;
        public BasicEnvelopeBuilder() {}
        public android.os.VibrationEffect.BasicEnvelopeBuilder addControlPoint(float p0, float p1, long p2) { return null; }
        public android.os.VibrationEffect build() { return null; }
        public android.os.VibrationEffect.BasicEnvelopeBuilder setInitialSharpness(float p0) { return null; }
    }

    public static final class Builder {
        private long mLastEndTime;
        private int mRepeatIndex;
        private long mRepeatingDurationMillis;
        private final java.util.ArrayList<android.os.vibrator.VibrationEffectSegment> mSegments = null;
        public Builder() {}
        public Builder(android.os.VibrationEffect p0) {}
        private void addSegment(android.os.vibrator.VibrationEffectSegment p0) {}
        private void checkNotRepeating() {}
        private void validateAndRecordSegmentTimeline(android.os.vibrator.VibrationEffectSegment p0) {}
        public android.os.VibrationEffect.Builder addEnvelope(long p0, android.os.VibrationEffect.Envelope p1) { return null; }
        public android.os.VibrationEffect.Builder addEvents(long p0, java.util.List<android.os.VibrationEffect.Event> p1) { return null; }
        public android.os.VibrationEffect.Builder addPreset(long p0, android.os.VibrationEffect.Preset p1) { return null; }
        public android.os.VibrationEffect build() { return null; }
        public android.os.VibrationEffect.Builder setRepeatingEffect(long p0, android.os.VibrationEffect p1, long p2) { return null; }
    }

    public static final class Composed extends android.os.VibrationEffect {
        public static final android.os.Parcelable.Creator<android.os.VibrationEffect.Composed> CREATOR = null;
        private static final java.util.function.Function<android.os.vibrator.VibrationEffectSegment, java.lang.Long> DEFAULT_DURATION_FN = null;
        private volatile long mCachedDuration;
        private final int mRepeatIndex = 0;
        private final long mRepeatingDurationMillis = 0L;
        private final java.util.ArrayList<android.os.vibrator.VibrationEffectSegment> mSegments = null;
        Composed(android.os.Parcel p0) { super(); }
        Composed(android.os.vibrator.VibrationEffectSegment p0) { super(); }
        public Composed(java.util.List<? extends android.os.vibrator.VibrationEffectSegment> p0, int p1) { super(); }
        public Composed(java.util.List<? extends android.os.vibrator.VibrationEffectSegment> p0, int p1, long p2) { super(); }
        private <T extends java.lang.Object> android.os.VibrationEffect.Composed applyToSegments(java.util.function.BiFunction<android.os.vibrator.VibrationEffectSegment, T, android.os.vibrator.VibrationEffectSegment> p0, T p1) { return null; }
        private static long calculateTotalDuration(java.util.List<android.os.vibrator.VibrationEffectSegment> p0, java.util.function.Function<android.os.vibrator.VibrationEffectSegment, java.lang.Long> p1) { return 0L; }
        private static android.os.vibrator.StepSegment castToValidStepSegmentForOffOnTimingsOrNull(android.os.vibrator.VibrationEffectSegment p0) { return null; }
        private java.util.List<android.os.vibrator.VibrationEffectSegment> convertToPresetSegments(java.util.List<android.os.vibrator.VibrationEffectSegment> p0, long p1) { return null; }
        private android.os.VibrationEffect.Event createEventFromSegments(java.util.List<android.os.vibrator.VibrationEffectSegment> p0, long p1) { return null; }
        private long getDuration(java.util.function.Function<android.os.vibrator.VibrationEffectSegment, java.lang.Long> p0) { return 0L; }
        private long getLegacyPrimitiveCompositionDuration(java.util.function.Function<android.os.vibrator.VibrationEffectSegment, java.lang.Long> p0) { return 0L; }
        private static long getTimelineAnchoredDuration(java.util.List<android.os.vibrator.VibrationEffectSegment> p0, java.util.function.Function<android.os.vibrator.VibrationEffectSegment, java.lang.Long> p1) { return 0L; }
        private boolean isLegacyPrimitiveComposition() { return false; }
        public android.os.VibrationEffect.Composed applyAdaptiveScale(float p0) { return null; }
        public android.os.VibrationEffect applyEffectStrength(int p0) { return null; }
        public android.os.VibrationEffect.Composed applyRepeatingIndefinitely(boolean p0, int p1) { return null; }
        public boolean areVibrationFeaturesSupported(android.os.VibratorInfo p0) { return false; }
        public long[] computeCreateWaveformOffOnTimingsOrNull() { return null; }
        public android.os.VibrationEffect cropToLengthOrNull(int p0) { return null; }
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public long getDuration() { return 0L; }
        public long getDuration(android.os.VibratorInfo p0) { return 0L; }
        public long getEstimatedDuration() { return 0L; }
        public java.util.List<android.os.VibrationEffect.Event> getEvents() { return null; }
        public int getRepeatIndex() { return 0; }
        public long getRepeatingDurationMillis() { return 0L; }
        public java.util.List<android.os.vibrator.VibrationEffectSegment> getSegments() { return null; }
        public int hashCode() { return 0; }
        public boolean isHapticFeedbackCandidate() { return false; }
        public boolean isTimelineAnchored() { return false; }
        public android.os.VibrationEffect.Composed resolve(int p0) { return null; }
        public android.os.VibrationEffect.Composed scale(float p0) { return null; }
        public java.lang.String toDebugString() { return null; }
        public java.lang.String toString() { return null; }
        public void validate() {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static final class Composition {
        public static final int DELAY_TYPE_PAUSE = 0;
        public static final int DELAY_TYPE_RELATIVE_START_OFFSET = 1;
        public static final int PRIMITIVE_CLICK = 1;
        public static final int PRIMITIVE_LOW_TICK = 8;
        public static final int PRIMITIVE_NOOP = 0;
        public static final int PRIMITIVE_QUICK_FALL = 6;
        public static final int PRIMITIVE_QUICK_RISE = 4;
        public static final int PRIMITIVE_SLOW_RISE = 5;
        public static final int PRIMITIVE_SPIN = 3;
        public static final int PRIMITIVE_THUD = 2;
        public static final int PRIMITIVE_TICK = 7;
        private int mRepeatIndex;
        private final java.util.ArrayList<android.os.vibrator.VibrationEffectSegment> mSegments = null;
        Composition() {}
        private android.os.VibrationEffect.Composition addSegment(android.os.vibrator.VibrationEffectSegment p0) { return null; }
        private android.os.VibrationEffect.Composition addSegments(android.os.VibrationEffect p0) { return null; }
        public static java.lang.String delayTypeToString(int p0) { return null; }
        public static java.lang.String primitiveToString(int p0) { return null; }
        public android.os.VibrationEffect.Composition addEffect(android.os.VibrationEffect p0) { return null; }
        public android.os.VibrationEffect.Composition addPrimitive(int p0) { return null; }
        public android.os.VibrationEffect.Composition addPrimitive(int p0, float p1) { return null; }
        public android.os.VibrationEffect.Composition addPrimitive(int p0, float p1, int p2) { return null; }
        public android.os.VibrationEffect.Composition addPrimitive(int p0, float p1, int p2, int p3) { return null; }
        public android.os.VibrationEffect compose() { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface DelayType {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface PrimitiveType {
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EffectType {
    }

    public static final class Envelope {
        private final android.os.VibrationEffect mEffect = null;
        Envelope(android.os.VibrationEffect p0) {}
        public static android.os.VibrationEffect.Envelope create(android.os.VibrationEffect.BasicEnvelopeBuilder p0) { return null; }
        public static android.os.VibrationEffect.Envelope create(android.os.VibrationEffect.WaveformEnvelopeBuilder p0) { return null; }

        public static final class BeatingEnvelopeBuilder {
            private float mBeatsPerSecond;
            private final java.util.ArrayList<android.os.VibrationEffect.Envelope.BeatingEnvelopeBuilder.ControlPoint> mControlPoints = null;
            private float mSharpness;
            public BeatingEnvelopeBuilder(float p0, float p1) {}
            public android.os.VibrationEffect.Envelope.BeatingEnvelopeBuilder addControlPoint(float p0, long p1) { return null; }
            public android.os.VibrationEffect.Envelope build() { return null; }

            public static final class ControlPoint {
                private final long mDurationMillis = 0L;
                private final float mIntensity = 0.0f;
                ControlPoint(float p0, long p1) {}
                public long getDurationMillis() { return 0L; }
                public float getIntensity() { return 0.0f; }
            }
        }
    }

    public static final class Event {
        private final android.os.VibrationEffect mEffect = null;
        private final long mStartTimeMillis = 0L;
        Event(android.os.VibrationEffect p0, long p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public android.os.VibrationEffect getEffect() { return null; }
        public long getStartTimeMillis() { return 0L; }
        public int hashCode() { return 0; }
    }

    public static final class Preset {
        public static final int PRESET_CLICK = 1;
        public static final int PRESET_LOW_TICK = 8;
        public static final int PRESET_NOOP = 0;
        public static final int PRESET_QUICK_FALL = 6;
        public static final int PRESET_QUICK_RISE = 4;
        public static final int PRESET_SLOW_RISE = 5;
        public static final int PRESET_SPIN = 3;
        public static final int PRESET_THUD = 2;
        public static final int PRESET_TICK = 7;
        private final int mId = 0;
        private final float mScale = 0.0f;
        Preset(int p0, float p1) {}
        public static android.os.VibrationEffect.Preset create(int p0) { return null; }
        public static android.os.VibrationEffect.Preset create(int p0, float p1) { return null; }
        public static boolean isPrimitive(int p0) { return false; }
        public static java.lang.String presetToString(int p0) { return null; }
        public int getId() { return 0; }
        public float getScale() { return 0.0f; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface PresetType {
        }
    }

    public static interface Transformation<ParamT extends java.lang.Object> {
        public android.os.VibrationEffect transform(android.os.VibrationEffect p0, ParamT p1);
    }

    public static final class VendorEffect extends android.os.VibrationEffect {
        public static final android.os.Parcelable.Creator<android.os.VibrationEffect.VendorEffect> CREATOR = null;
        public static final float DEFAULT_SCALE = 1.0f;
        public static final int DEFAULT_STRENGTH = 1;
        private final float mAdaptiveScale = 0.0f;
        private final int mEffectStrength = 0;
        private final float mScale = 0.0f;
        private final android.os.PersistableBundle mVendorData = null;
        VendorEffect(android.os.Parcel p0) { super(); }
        public VendorEffect(android.os.PersistableBundle p0, int p1, float p2, float p3) { super(); }
        private static boolean isPersistableBundleEquals(android.os.PersistableBundle p0, android.os.PersistableBundle p1) { return false; }
        private static boolean isPersistableBundleSupportedValueEquals(java.lang.Object p0, java.lang.Object p1) { return false; }
        public android.os.VibrationEffect applyAdaptiveScale(float p0) { return null; }
        public android.os.VibrationEffect applyEffectStrength(int p0) { return null; }
        public android.os.VibrationEffect.VendorEffect applyRepeatingIndefinitely(boolean p0, int p1) { return null; }
        public boolean areVibrationFeaturesSupported(android.os.VibratorInfo p0) { return false; }
        public long[] computeCreateWaveformOffOnTimingsOrNull() { return null; }
        public android.os.VibrationEffect cropToLengthOrNull(int p0) { return null; }
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public float getAdaptiveScale() { return 0.0f; }
        public long getDuration() { return 0L; }
        public int getEffectStrength() { return 0; }
        public java.util.List<android.os.VibrationEffect.Event> getEvents() { return null; }
        public float getScale() { return 0.0f; }
        public android.os.PersistableBundle getVendorData() { return null; }
        public int hashCode() { return 0; }
        public boolean isHapticFeedbackCandidate() { return false; }
        public android.os.VibrationEffect.VendorEffect resolve(int p0) { return null; }
        public android.os.VibrationEffect.VendorEffect scale(float p0) { return null; }
        public java.lang.String toDebugString() { return null; }
        public java.lang.String toString() { return null; }
        public void validate() {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static final class WaveformEnvelopeBuilder {
        private float mLastAmplitude;
        private float mLastFrequencyHz;
        private java.util.ArrayList<android.os.vibrator.PwleSegment> mSegments;
        public WaveformEnvelopeBuilder() {}
        public android.os.VibrationEffect.WaveformEnvelopeBuilder addControlPoint(float p0, float p1, long p2) { return null; }
        public android.os.VibrationEffect build() { return null; }
        public android.os.VibrationEffect.WaveformEnvelopeBuilder setInitialFrequencyHz(float p0) { return null; }
    }
}
