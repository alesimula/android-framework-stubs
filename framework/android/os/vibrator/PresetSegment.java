package android.os.vibrator;

public final class PresetSegment extends android.os.vibrator.VibrationEffectSegment {
    public static final android.os.Parcelable.Creator<android.os.vibrator.PresetSegment> CREATOR = null;
    private final int mPresetId = 0;
    private final float mScale = 0.0f;
    public PresetSegment(int p0, float p1, long p2) { super(); }
    PresetSegment(android.os.Parcel p0) { super(); }
    public android.os.vibrator.PresetSegment applyAdaptiveScale(float p0) { return null; }
    public android.os.vibrator.PresetSegment applyEffectStrength(int p0) { return null; }
    public android.os.vibrator.PresetSegment applyStartTime(long p0) { return null; }
    public boolean areVibrationFeaturesSupported(android.os.VibratorInfo p0) { return false; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public long getDuration() { return 0L; }
    public long getDuration(android.os.VibratorInfo p0) { return 0L; }
    public int getPresetId() { return 0; }
    public float getScale() { return 0.0f; }
    public int hashCode() { return 0; }
    public boolean isHapticFeedbackCandidate() { return false; }
    public android.os.vibrator.PresetSegment resolve(int p0) { return null; }
    public android.os.vibrator.PresetSegment scale(float p0) { return null; }
    public java.lang.String toDebugString() { return null; }
    public java.lang.String toString() { return null; }
    public void validate() {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
