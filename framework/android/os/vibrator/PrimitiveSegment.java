package android.os.vibrator;

public final class PrimitiveSegment extends android.os.vibrator.VibrationEffectSegment {
    public static final android.os.Parcelable.Creator<android.os.vibrator.PrimitiveSegment> CREATOR = null;
    public static final int DEFAULT_DELAY_MILLIS = 0;
    public static final int DEFAULT_DELAY_TYPE = 0;
    public static final float DEFAULT_SCALE = 1.0f;
    private final int mDelay = 0;
    private final int mDelayType = 0;
    private final int mPrimitiveId = 0;
    private final float mScale = 0.0f;
    public PrimitiveSegment(int p0, float p1, int p2) { super(); }
    public PrimitiveSegment(int p0, float p1, int p2, int p3) { super(); }
    PrimitiveSegment(android.os.Parcel p0) { super(); }
    private static boolean isValidDelayType(int p0) { return false; }
    private static java.lang.String toDelayTypeDebugString(int p0) { return null; }
    public android.os.vibrator.PrimitiveSegment applyAdaptiveScale(float p0) { return null; }
    public android.os.vibrator.PrimitiveSegment applyEffectStrength(int p0) { return null; }
    public android.os.vibrator.PrimitiveSegment applyStartTime(long p0) { return null; }
    public boolean areVibrationFeaturesSupported(android.os.VibratorInfo p0) { return false; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getDelay() { return 0; }
    public int getDelayType() { return 0; }
    public long getDuration() { return 0L; }
    public long getDuration(android.os.VibratorInfo p0) { return 0L; }
    public int getPrimitiveId() { return 0; }
    public float getScale() { return 0.0f; }
    public int hashCode() { return 0; }
    public boolean isHapticFeedbackCandidate() { return false; }
    public android.os.vibrator.PrimitiveSegment resolve(int p0) { return null; }
    public android.os.vibrator.PrimitiveSegment scale(float p0) { return null; }
    public java.lang.String toDebugString() { return null; }
    public java.lang.String toString() { return null; }
    public void validate() {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
