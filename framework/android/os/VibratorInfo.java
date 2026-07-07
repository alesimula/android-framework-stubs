package android.os;

public class VibratorInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.VibratorInfo> CREATOR = null;
    public static final android.os.VibratorInfo EMPTY_VIBRATOR_INFO = null;
    private static final java.lang.String TAG = "VibratorInfo";
    private final long mCapabilities = 0L;
    private final int mCompositionSizeMax = 0;
    private final android.os.VibratorInfo.FrequencyProfile mFrequencyProfile = null;
    private final android.os.VibratorInfo.FrequencyProfileLegacy mFrequencyProfileLegacy = null;
    private final int mId = 0;
    private final int mMaxEnvelopeEffectControlPointDurationMillis = 0;
    private final int mMaxEnvelopeEffectSize = 0;
    private final int mMinEnvelopeEffectControlPointDurationMillis = 0;
    private final int mPrimitiveDelayMax = 0;
    private final float mQFactor = 0.0f;
    private final android.util.SparseBooleanArray mSupportedEffects = null;
    private final android.util.SparseIntArray mSupportedPrimitives = null;
    public VibratorInfo(int p0, long p1, android.util.SparseBooleanArray p2, android.util.SparseIntArray p3, int p4, int p5, float p6, android.os.VibratorInfo.FrequencyProfileLegacy p7, android.os.VibratorInfo.FrequencyProfile p8, int p9, int p10, int p11) {}
    public VibratorInfo(int p0, android.os.VibratorInfo p1) {}
    VibratorInfo(android.os.Parcel p0) {}
    private java.lang.String[] getCapabilitiesNames() { return null; }
    private java.lang.String[] getSupportedEffectsNames() { return null; }
    private java.lang.String[] getSupportedPrimitivesNames() { return null; }
    public boolean areEnvelopeEffectsSupported() { return false; }
    public boolean areVibrationFeaturesSupported(android.os.VibrationEffect p0) { return false; }
    public int describeContents() { return 0; }
    public void dump(android.util.IndentingPrintWriter p0) {}
    public boolean equalContent(android.os.VibratorInfo p0) { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public long getCapabilities() { return 0L; }
    public int getCompositionSizeMax() { return 0; }
    public android.os.VibratorInfo.FrequencyProfile getFrequencyProfile() { return null; }
    public android.os.VibratorInfo.FrequencyProfileLegacy getFrequencyProfileLegacy() { return null; }
    public int getId() { return 0; }
    public int getMaxEnvelopeEffectControlPointDurationMillis() { return 0; }
    public int getMaxEnvelopeEffectDurationMillis() { return 0; }
    public int getMaxEnvelopeEffectSize() { return 0; }
    public int getMinEnvelopeEffectControlPointDurationMillis() { return 0; }
    public int getPrimitiveDelayMax() { return 0; }
    public int getPrimitiveDuration(int p0) { return 0; }
    public float getQFactor() { return 0.0f; }
    public float getResonantFrequencyHz() { return 0.0f; }
    public android.util.SparseBooleanArray getSupportedEffects() { return null; }
    public android.util.SparseIntArray getSupportedPrimitives() { return null; }
    public boolean hasAmplitudeControl() { return false; }
    public boolean hasCapability(long p0) { return false; }
    public boolean hasFrequencyControl() { return false; }
    public int hashCode() { return 0; }
    public boolean isEffectSupportKnown() { return false; }
    public int isEffectSupported(int p0) { return 0; }
    public boolean isPrimitiveSupported(int p0) { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private long mCapabilities;
        private int mCompositionSizeMax;
        private android.os.VibratorInfo.FrequencyProfile mFrequencyProfile;
        private android.os.VibratorInfo.FrequencyProfileLegacy mFrequencyProfileLegacy;
        private final int mId = 0;
        private int mMaxEnvelopeEffectControlPointDurationMillis;
        private int mMaxEnvelopeEffectSize;
        private int mMinEnvelopeEffectControlPointDurationMillis;
        private int mPrimitiveDelayMax;
        private float mQFactor;
        private android.util.SparseBooleanArray mSupportedEffects;
        private android.util.SparseIntArray mSupportedPrimitives;
        public Builder(int p0) {}
        private static android.util.SparseBooleanArray toSparseBooleanArray(int[] p0) { return null; }
        public android.os.VibratorInfo build() { return null; }
        public android.os.VibratorInfo.Builder setCapabilities(long p0) { return null; }
        public android.os.VibratorInfo.Builder setCompositionSizeMax(int p0) { return null; }
        public android.os.VibratorInfo.Builder setFrequencyProfile(android.os.VibratorInfo.FrequencyProfile p0) { return null; }
        public android.os.VibratorInfo.Builder setFrequencyProfileLegacy(android.os.VibratorInfo.FrequencyProfileLegacy p0) { return null; }
        public android.os.VibratorInfo.Builder setMaxEnvelopeEffectControlPointDurationMillis(int p0) { return null; }
        public android.os.VibratorInfo.Builder setMaxEnvelopeEffectSize(int p0) { return null; }
        public android.os.VibratorInfo.Builder setMinEnvelopeEffectControlPointDurationMillis(int p0) { return null; }
        public android.os.VibratorInfo.Builder setPrimitiveDelayMax(int p0) { return null; }
        public android.os.VibratorInfo.Builder setQFactor(float p0) { return null; }
        public android.os.VibratorInfo.Builder setSupportedEffects(int... p0) { return null; }
        public android.os.VibratorInfo.Builder setSupportedPrimitive(int p0, int p1) { return null; }
    }

    public static final class FrequencyProfile implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.os.VibratorInfo.FrequencyProfile> CREATOR = null;
        private final float[] mFrequenciesHz = null;
        private final float mMaxFrequencyHz = 0.0f;
        private final float mMaxOutputAccelerationGs = 0.0f;
        private final float mMinFrequencyHz = 0.0f;
        private final float[] mOutputAccelerationsGs = null;
        private final float mResonantFrequencyHz = 0.0f;
        public FrequencyProfile(float p0, float[] p1, float[] p2) {}
        public FrequencyProfile(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public float[] getFrequenciesHz() { return null; }
        public android.util.Range<java.lang.Float> getFrequencyRangeHz(float p0) { return null; }
        public float getMaxFrequencyHz() { return 0.0f; }
        public float getMaxOutputAccelerationGs() { return 0.0f; }
        public float getMinFrequencyHz() { return 0.0f; }
        public float getOutputAccelerationGs(float p0) { return 0.0f; }
        public float[] getOutputAccelerationsGs() { return null; }
        public int hashCode() { return 0; }
        public boolean isEmpty() { return false; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static final class FrequencyProfileLegacy implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.os.VibratorInfo.FrequencyProfileLegacy> CREATOR = null;
        private final android.util.Range<java.lang.Float> mFrequencyRangeHz = null;
        private final float mFrequencyResolutionHz = 0.0f;
        private final float[] mMaxAmplitudes = null;
        private final float mMinFrequencyHz = 0.0f;
        private final float mResonantFrequencyHz = 0.0f;
        public FrequencyProfileLegacy(float p0, float p1, float p2, float[] p3) {}
        FrequencyProfileLegacy(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public android.util.Range<java.lang.Float> getFrequencyRangeHz() { return null; }
        public float getFrequencyResolutionHz() { return 0.0f; }
        public float getMaxAmplitude(float p0) { return 0.0f; }
        public float[] getMaxAmplitudes() { return null; }
        public int hashCode() { return 0; }
        public boolean isEmpty() { return false; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
