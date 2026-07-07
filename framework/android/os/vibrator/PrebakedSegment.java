package android.os.vibrator;

public final class PrebakedSegment extends android.os.vibrator.VibrationEffectSegment {
    public static final android.os.Parcelable.Creator<android.os.vibrator.PrebakedSegment> CREATOR = null;
    public static final boolean DEFAULT_SHOULD_FALLBACK = true;
    public static final int DEFAULT_STRENGTH = 1;
    private final int mEffectId = 0;
    private final int mEffectStrength = 0;
    private final boolean mFallback = false;
    public PrebakedSegment(int p0, boolean p1, int p2) { super(); }
    public PrebakedSegment(int p0, boolean p1, int p2, long p3) { super(); }
    PrebakedSegment(android.os.Parcel p0) { super(); }
    private long estimateFromPrimitiveDuration(android.os.VibratorInfo p0, int p1) { return 0L; }
    private static boolean isValidEffectStrength(int p0) { return false; }
    public android.os.vibrator.PrebakedSegment applyAdaptiveScale(float p0) { return null; }
    public android.os.vibrator.PrebakedSegment applyEffectStrength(int p0) { return null; }
    public android.os.vibrator.PrebakedSegment applyStartTime(long p0) { return null; }
    public boolean areVibrationFeaturesSupported(android.os.VibratorInfo p0) { return false; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public long getDuration() { return 0L; }
    public long getDuration(android.os.VibratorInfo p0) { return 0L; }
    public int getEffectId() { return 0; }
    public int getEffectStrength() { return 0; }
    public int hashCode() { return 0; }
    public boolean isHapticFeedbackCandidate() { return false; }
    public android.os.vibrator.PrebakedSegment resolve(int p0) { return null; }
    public android.os.vibrator.PrebakedSegment scale(float p0) { return null; }
    public boolean shouldFallback() { return false; }
    public java.lang.String toDebugString() { return null; }
    public java.lang.String toString() { return null; }
    public void validate() {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
