package android.media.audio.common;

public class AudioHalCapRule implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.audio.common.AudioHalCapRule> CREATOR = null;
    public byte compoundRule;
    public android.media.audio.common.AudioHalCapRule.CriterionRule[] criterionRules;
    public android.media.audio.common.AudioHalCapRule[] nestedRules;
    public AudioHalCapRule() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public final int getStability() { return 0; }
    public int hashCode() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static @interface CompoundRule {
        public static final byte ALL = 2;
        public static final byte ANY = 1;
        public static final byte INVALID = 0;
    }

    public static class CriterionRule implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.media.audio.common.AudioHalCapRule.CriterionRule> CREATOR = null;
        public android.media.audio.common.AudioHalCapCriterionV2 criterionAndValue;
        public byte matchingRule;
        public CriterionRule() {}
        private int describeContents(java.lang.Object p0) { return 0; }
        public int describeContents() { return 0; }
        public final int getStability() { return 0; }
        public final void readFromParcel(android.os.Parcel p0) {}
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static @interface MatchingRule {
        public static final byte EXCLUDES = 3;
        public static final byte INCLUDES = 2;
        public static final byte INVALID = -1;
        public static final byte IS = 0;
        public static final byte IS_NOT = 1;
    }
}
