package android.speech;

public final class RecognitionPart implements android.os.Parcelable {
    public static final int CONFIDENCE_LEVEL_HIGH = 5;
    public static final int CONFIDENCE_LEVEL_LOW = 1;
    public static final int CONFIDENCE_LEVEL_MEDIUM = 3;
    public static final int CONFIDENCE_LEVEL_MEDIUM_HIGH = 4;
    public static final int CONFIDENCE_LEVEL_MEDIUM_LOW = 2;
    public static final int CONFIDENCE_LEVEL_UNKNOWN = 0;
    public static final android.os.Parcelable.Creator<android.speech.RecognitionPart> CREATOR = null;
    private final int mConfidenceLevel = 0;
    private final java.lang.String mFormattedText = null;
    private final java.lang.String mRawText = null;
    private final long mTimestampMillis = 0L;
    RecognitionPart(android.os.Parcel p0) {}
    RecognitionPart(java.lang.String p0, java.lang.String p1, long p2, int p3) {}
    @java.lang.Deprecated
    private void __metadata() {}
    public static java.lang.String confidenceLevelToString(int p0) { return null; }
    private static int defaultConfidenceLevel() { return 0; }
    private static java.lang.String defaultFormattedText() { return null; }
    private static long defaultTimestampMillis() { return 0L; }
    private void onConstructed() {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getConfidenceLevel() { return 0; }
    public java.lang.String getFormattedText() { return null; }
    public java.lang.String getRawText() { return null; }
    public long getTimestampMillis() { return 0L; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    static abstract class BaseBuilder {
        BaseBuilder() {}
        public android.speech.RecognitionPart.Builder setFormattedText(java.lang.String p0) { return null; }
    }

    public static final class Builder extends android.speech.RecognitionPart.BaseBuilder {
        private long mBuilderFieldsSet;
        private int mConfidenceLevel;
        private java.lang.String mFormattedText;
        private java.lang.String mRawText;
        private long mTimestampMillis;
        public Builder(java.lang.String p0) { super(); }
        private void checkNotUsed() {}
        public android.speech.RecognitionPart build() { return null; }
        public android.speech.RecognitionPart.Builder setConfidenceLevel(int p0) { return null; }
        public android.speech.RecognitionPart.Builder setRawText(java.lang.String p0) { return null; }
        public android.speech.RecognitionPart.Builder setTimestampMillis(long p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ConfidenceLevel {
    }
}
