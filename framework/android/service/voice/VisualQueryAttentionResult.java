package android.service.voice;

@android.annotation.SystemApi
public final class VisualQueryAttentionResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.voice.VisualQueryAttentionResult> CREATOR = null;
    public static final int INTERACTION_INTENTION_AUDIO_VISUAL = 0;
    public static final int INTERACTION_INTENTION_VISUAL_ACCESSIBILITY = 1;
    private final int mEngagementLevel = 0;
    private final int mInteractionIntention = 0;
    VisualQueryAttentionResult(int p0, int p1) {}
    VisualQueryAttentionResult(android.os.Parcel p0) {}
    @java.lang.Deprecated
    private void __metadata() {}
    private static int defaultEngagementLevel() { return 0; }
    private static int defaultInteractionIntention() { return 0; }
    public static java.lang.String interactionIntentionToString(int p0) { return null; }
    public android.service.voice.VisualQueryAttentionResult.Builder buildUpon() { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getEngagementLevel() { return 0; }
    public int getInteractionIntention() { return 0; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private long mBuilderFieldsSet;
        private int mEngagementLevel;
        private int mInteractionIntention;
        public Builder() {}
        private void checkNotUsed() {}
        public android.service.voice.VisualQueryAttentionResult build() { return null; }
        public android.service.voice.VisualQueryAttentionResult.Builder setEngagementLevel(int p0) { return null; }
        public android.service.voice.VisualQueryAttentionResult.Builder setInteractionIntention(int p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface InteractionIntention {
    }
}
