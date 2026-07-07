package android.os;

public abstract class CombinedVibration implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.CombinedVibration> CREATOR = null;
    private static final int PARCEL_TOKEN_MONO = 1;
    private static final int PARCEL_TOKEN_STEREO = 2;
    CombinedVibration() {}
    public static android.os.CombinedVibration createParallel(android.os.VibrationEffect p0) { return null; }
    public static android.os.CombinedVibration.ParallelCombination startParallel() { return null; }
    public abstract android.os.CombinedVibration adapt(android.os.CombinedVibration.VibratorAdapter p0);
    public int describeContents() { return 0; }
    public abstract long getDuration();
    public abstract long getDuration(android.util.SparseArray<android.os.VibratorInfo> p0);
    public abstract boolean hasVendorEffects();
    public abstract boolean hasVibrator(int p0);
    public boolean isHapticFeedbackCandidate() { return false; }
    public abstract boolean isTimelineAnchored();
    public abstract java.lang.String toDebugString();
    public abstract <ParamT extends java.lang.Object> android.os.CombinedVibration transform(android.os.VibrationEffect.Transformation<ParamT> p0, ParamT p1);
    public abstract void validate();

    public static final class Mono extends android.os.CombinedVibration {
        public static final android.os.Parcelable.Creator<android.os.CombinedVibration.Mono> CREATOR = null;
        private final android.os.VibrationEffect mEffect = null;
        Mono(android.os.Parcel p0) { super(); }
        Mono(android.os.VibrationEffect p0) { super(); }
        public android.os.CombinedVibration adapt(android.os.CombinedVibration.VibratorAdapter p0) { return null; }
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public long getDuration() { return 0L; }
        public long getDuration(android.util.SparseArray<android.os.VibratorInfo> p0) { return 0L; }
        public android.os.VibrationEffect getEffect() { return null; }
        public boolean hasVendorEffects() { return false; }
        public boolean hasVibrator(int p0) { return false; }
        public int hashCode() { return 0; }
        public boolean isHapticFeedbackCandidate() { return false; }
        public boolean isTimelineAnchored() { return false; }
        public java.lang.String toDebugString() { return null; }
        public java.lang.String toString() { return null; }
        public <ParamT extends java.lang.Object> android.os.CombinedVibration transform(android.os.VibrationEffect.Transformation<ParamT> p0, ParamT p1) { return null; }
        public void validate() {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static final class ParallelCombination {
        private final android.util.SparseArray<android.os.VibrationEffect> mEffects = null;
        ParallelCombination() {}
        public android.os.CombinedVibration.ParallelCombination addVibrator(int p0, android.os.VibrationEffect p1) { return null; }
        public android.os.CombinedVibration combine() { return null; }
    }

    public static final class Stereo extends android.os.CombinedVibration {
        public static final android.os.Parcelable.Creator<android.os.CombinedVibration.Stereo> CREATOR = null;
        private final android.util.SparseArray<android.os.VibrationEffect> mEffects = null;
        Stereo(android.os.Parcel p0) { super(); }
        Stereo(android.util.SparseArray<android.os.VibrationEffect> p0) { super(); }
        private long getDuration(java.util.function.Function<java.lang.Integer, java.lang.Long> p0) { return 0L; }
        public android.os.CombinedVibration adapt(android.os.CombinedVibration.VibratorAdapter p0) { return null; }
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public long getDuration() { return 0L; }
        public long getDuration(android.util.SparseArray<android.os.VibratorInfo> p0) { return 0L; }
        public android.util.SparseArray<android.os.VibrationEffect> getEffects() { return null; }
        public boolean hasVendorEffects() { return false; }
        public boolean hasVibrator(int p0) { return false; }
        public int hashCode() { return 0; }
        public boolean isHapticFeedbackCandidate() { return false; }
        public boolean isTimelineAnchored() { return false; }
        public java.lang.String toDebugString() { return null; }
        public java.lang.String toString() { return null; }
        public <ParamT extends java.lang.Object> android.os.CombinedVibration transform(android.os.VibrationEffect.Transformation<ParamT> p0, ParamT p1) { return null; }
        public void validate() {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static interface VibratorAdapter {
        public android.os.VibrationEffect adaptToVibrator(int p0, android.os.VibrationEffect p1);
        public int[] getAvailableVibratorIds();
    }
}
