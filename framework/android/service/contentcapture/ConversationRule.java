package android.service.contentcapture;

public final class ConversationRule extends android.service.contentcapture.ContentCaptureProcessingRule {
    public static final android.os.Parcelable.Creator<android.service.contentcapture.ConversationRule> CREATOR = null;
    private final android.service.contentcapture.conversation.AppScope mAppScope = null;
    private final android.service.contentcapture.conversation.NodeExtraMetadataSpec mNodeExtraMetadataSpec = null;
    private final android.service.contentcapture.conversation.ScreenRule mScreenRule = null;
    private final android.service.contentcapture.conversation.TextRule mTextRule = null;
    private final android.service.contentcapture.conversation.TurnClusteringRule mTurnClusteringRule = null;
    ConversationRule(android.os.Parcel p0) { super(0); }
    private ConversationRule(android.service.contentcapture.ConversationRule.Builder p0) { super(0); }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.service.contentcapture.conversation.AppScope getAppScope() { return null; }
    public android.service.contentcapture.conversation.NodeExtraMetadataSpec getNodeExtraMetadataSpec() { return null; }
    public android.service.contentcapture.conversation.ScreenRule getScreenRule() { return null; }
    public android.service.contentcapture.conversation.TextRule getTextRule() { return null; }
    public android.service.contentcapture.conversation.TurnClusteringRule getTurnClusteringRule() { return null; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    protected void writeToParcelImpl(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.service.contentcapture.conversation.AppScope mAppScope;
        private android.service.contentcapture.conversation.NodeExtraMetadataSpec mNodeExtraMetadataSpec;
        private android.service.contentcapture.conversation.ScreenRule mScreenRule;
        private android.service.contentcapture.conversation.TextRule mTextRule;
        private android.service.contentcapture.conversation.TurnClusteringRule mTurnClusteringRule;
        public Builder() {}
        public Builder(android.service.contentcapture.ConversationRule p0) {}
        public android.service.contentcapture.ConversationRule build() { return null; }
        android.service.contentcapture.conversation.AppScope buildAppScope() { return null; }
        android.service.contentcapture.conversation.NodeExtraMetadataSpec buildNodeExtraMetadataSpec() { return null; }
        android.service.contentcapture.conversation.ScreenRule buildScreenRule() { return null; }
        android.service.contentcapture.conversation.TextRule buildTextRule() { return null; }
        android.service.contentcapture.conversation.TurnClusteringRule buildTurnClusteringRule() { return null; }
        public android.service.contentcapture.ConversationRule.Builder setAppScope(android.service.contentcapture.conversation.AppScope p0) { return null; }
        public android.service.contentcapture.ConversationRule.Builder setNodeExtraMetadataSpec(android.service.contentcapture.conversation.NodeExtraMetadataSpec p0) { return null; }
        public android.service.contentcapture.ConversationRule.Builder setScreenRule(android.service.contentcapture.conversation.ScreenRule p0) { return null; }
        public android.service.contentcapture.ConversationRule.Builder setTextRule(android.service.contentcapture.conversation.TextRule p0) { return null; }
        public android.service.contentcapture.ConversationRule.Builder setTurnClusteringRule(android.service.contentcapture.conversation.TurnClusteringRule p0) { return null; }
    }
}
