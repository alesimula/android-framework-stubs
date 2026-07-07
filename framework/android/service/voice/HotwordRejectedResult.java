package android.service.voice;

@android.annotation.SystemApi
public final class HotwordRejectedResult implements android.os.Parcelable {
    public static final int CONFIDENCE_LEVEL_HIGH = 3;
    public static final int CONFIDENCE_LEVEL_LOW = 1;
    public static final int CONFIDENCE_LEVEL_MEDIUM = 2;
    public static final int CONFIDENCE_LEVEL_NONE = 0;
    public static final int CONFIDENCE_LEVEL_VERY_HIGH = 4;
    public static final android.os.Parcelable.Creator<android.service.voice.HotwordRejectedResult> CREATOR = null;
    private final int mConfidenceLevel = 0;
    HotwordRejectedResult(int p0) {}
    HotwordRejectedResult(android.os.Parcel p0) {}
    @java.lang.Deprecated
    private void __metadata() {}
    public static java.lang.String confidenceLevelToString(int p0) { return null; }
    private static int defaultConfidenceLevel() { return 0; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getConfidenceLevel() { return 0; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private long mBuilderFieldsSet;
        private int mConfidenceLevel;
        public Builder() {}
        private void checkNotUsed() {}
        public android.service.voice.HotwordRejectedResult build() { return null; }
        public android.service.voice.HotwordRejectedResult.Builder setConfidenceLevel(int p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ConfidenceLevel {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface HotwordConfidenceLevelValue {
    }
}
