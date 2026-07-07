package android.os.vibrator;

public final class BeatingSegment extends android.os.vibrator.VibrationEffectSegment {
    public static final android.os.Parcelable.Creator<android.os.vibrator.BeatingSegment> CREATOR = null;
    private final float mBeatsPerSecond = 0.0f;
    private final long mDuration = 0L;
    private final float mEndIntensity = 0.0f;
    private final float mSharpness = 0.0f;
    private final float mStartIntensity = 0.0f;
    public BeatingSegment(float p0, float p1, long p2, float p3, float p4) { super(); }
    public BeatingSegment(float p0, float p1, long p2, float p3, float p4, long p5) { super(); }
    BeatingSegment(android.os.Parcel p0) { super(); }
    public android.os.vibrator.BeatingSegment applyAdaptiveScale(float p0) { return null; }
    public android.os.vibrator.BeatingSegment applyEffectStrength(int p0) { return null; }
    public android.os.vibrator.BeatingSegment applyStartTime(long p0) { return null; }
    public boolean areVibrationFeaturesSupported(android.os.VibratorInfo p0) { return false; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public float getBeatsPerSecond() { return 0.0f; }
    public long getDuration() { return 0L; }
    public float getEndIntensity() { return 0.0f; }
    public float getSharpness() { return 0.0f; }
    public float getStartIntensity() { return 0.0f; }
    public int hashCode() { return 0; }
    public boolean isHapticFeedbackCandidate() { return false; }
    public android.os.vibrator.BeatingSegment resolve(int p0) { return null; }
    public android.os.vibrator.BeatingSegment scale(float p0) { return null; }
    public java.lang.String toDebugString() { return null; }
    public java.lang.String toString() { return null; }
    public void validate() {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
