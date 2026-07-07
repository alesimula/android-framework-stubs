package android.service.voice;

@android.annotation.SystemApi
public final class VisualQueryDetectedResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.voice.VisualQueryDetectedResult> CREATOR = null;
    private final byte[] mAccessibilityDetectionData = null;
    private final java.lang.String mPartialQuery = null;
    private final int mSpeakerId = 0;
    VisualQueryDetectedResult(android.os.Parcel p0) {}
    VisualQueryDetectedResult(java.lang.String p0, int p1, byte[] p2) {}
    @java.lang.Deprecated
    private void __metadata() {}
    private static byte[] defaultAccessibilityDetectionData() { return null; }
    private static java.lang.String defaultPartialQuery() { return null; }
    private static int defaultSpeakerId() { return 0; }
    public static int getMaxSpeakerId() { return 0; }
    private void onConstructed() {}
    public android.service.voice.VisualQueryDetectedResult.Builder buildUpon() { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public byte[] getAccessibilityDetectionData() { return null; }
    public java.lang.String getPartialQuery() { return null; }
    public int getSpeakerId() { return 0; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private byte[] mAccessibilityDetectionData;
        private long mBuilderFieldsSet;
        private java.lang.String mPartialQuery;
        private int mSpeakerId;
        public Builder() {}
        private void checkNotUsed() {}
        public android.service.voice.VisualQueryDetectedResult build() { return null; }
        public android.service.voice.VisualQueryDetectedResult.Builder setAccessibilityDetectionData(byte... p0) { return null; }
        public android.service.voice.VisualQueryDetectedResult.Builder setPartialQuery(java.lang.String p0) { return null; }
        public android.service.voice.VisualQueryDetectedResult.Builder setSpeakerId(int p0) { return null; }
    }
}
