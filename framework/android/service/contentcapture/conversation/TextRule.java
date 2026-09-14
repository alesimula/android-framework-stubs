package android.service.contentcapture.conversation;

public final class TextRule implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.contentcapture.conversation.TextRule> CREATOR = null;
    private final java.lang.String mContactNameDelimiter = null;
    private final java.util.List<java.lang.String> mDeletionPrefixes = null;
    private final java.lang.String mQuotedSelfContactName = null;
    private final java.lang.String mSelfRepresentation = null;
    private final android.service.contentcapture.conversation.TextRule.TitleModifier mTitleModifier = null;
    private TextRule(android.os.Parcel p0) {}
    private TextRule(android.service.contentcapture.conversation.TextRule.Builder p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String getContactNameDelimiter() { return null; }
    public java.util.List<java.lang.String> getDeletionPrefixes() { return null; }
    public java.lang.String getQuotedSelfContactName() { return null; }
    public java.lang.String getSelfRepresentation() { return null; }
    public android.service.contentcapture.conversation.TextRule.TitleModifier getTitleModifier() { return null; }
    public int hashCode() { return 0; }
    public boolean isContactNameSplittingEnabled() { return false; }
    public boolean isDeletionDetectionEnabled() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private java.lang.String mContactNameDelimiter;
        private java.util.List<java.lang.String> mDeletionPrefixes;
        private java.lang.String mQuotedSelfContactName;
        private java.lang.String mSelfRepresentation;
        private android.service.contentcapture.conversation.TextRule.TitleModifier mTitleModifier;
        public Builder() {}
        public Builder(android.service.contentcapture.conversation.TextRule p0) {}
        public android.service.contentcapture.conversation.TextRule build() { return null; }
        public android.service.contentcapture.conversation.TextRule.Builder setContactNameDelimiter(java.lang.String p0) { return null; }
        public android.service.contentcapture.conversation.TextRule.Builder setDeletionPrefixes(java.util.List<java.lang.String> p0) { return null; }
        public android.service.contentcapture.conversation.TextRule.Builder setQuotedSelfContactName(java.lang.String p0) { return null; }
        public android.service.contentcapture.conversation.TextRule.Builder setSelfRepresentation(java.lang.String p0) { return null; }
        public android.service.contentcapture.conversation.TextRule.Builder setTitleModifier(android.service.contentcapture.conversation.TextRule.TitleModifier p0) { return null; }
    }

    public static final class TitleModifier implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.service.contentcapture.conversation.TextRule.TitleModifier> CREATOR = null;
        private final java.util.List<java.lang.String> mDeleteTextSuffixes = null;
        private TitleModifier(android.os.Parcel p0) {}
        public TitleModifier(java.util.List<java.lang.String> p0) {}
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.util.List<java.lang.String> getDeleteTextSuffixes() { return null; }
        public int hashCode() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
