package android.os.vibrator;

public final class HapticFeedbackRequest {
    private final int mFeedbackConstant = 0;
    private final int mFlags = 0;
    private final int mUsage = 0;
    private HapticFeedbackRequest(int p0, int p1, int p2) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int getFeedbackConstant() { return 0; }
    public int getFlags() { return 0; }
    public int getUsage() { return 0; }
    public int hashCode() { return 0; }

    public static final class Builder {
        private final int mFeedbackConstant = 0;
        private int mFlags;
        private int mUsage;
        public Builder(int p0) {}
        public Builder(android.os.vibrator.HapticFeedbackRequest p0) {}
        public android.os.vibrator.HapticFeedbackRequest build() { return null; }
        public android.os.vibrator.HapticFeedbackRequest.Builder setFlags(int p0) { return null; }
        public android.os.vibrator.HapticFeedbackRequest.Builder setUsage(int p0) { return null; }
    }
}
