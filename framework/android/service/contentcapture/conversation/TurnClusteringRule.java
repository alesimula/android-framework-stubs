package android.service.contentcapture.conversation;

public final class TurnClusteringRule implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.contentcapture.conversation.TurnClusteringRule> CREATOR = null;
    public static final int DEFAULT_FEW_MESSAGES_THRESHOLD = 3;
    private final java.util.List<android.service.contentcapture.conversation.TurnClusteringRule.AggregationStrategy> mAggregationStrategies = null;
    private final int mAncestorDepth = 0;
    private final boolean mApplyRtlAdjustments = false;
    private final int mContentCheckStrategy = 0;
    private final int mFewMessagesThreshold = 0;
    private final boolean mInputBoxStatusDetectionEnabled = false;
    private final boolean mNeedsRevision = false;
    private final boolean mSortingByLayoutIndexEnabled = false;
    private final boolean mStartsFromTop = false;
    private final boolean mZeroStateTitleOnly = false;
    private TurnClusteringRule(android.os.Parcel p0) {}
    private TurnClusteringRule(android.service.contentcapture.conversation.TurnClusteringRule.Builder p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.List<android.service.contentcapture.conversation.TurnClusteringRule.AggregationStrategy> getAggregationStrategies() { return null; }
    public int getAncestorDepth() { return 0; }
    public int getContentCheckStrategy() { return 0; }
    public int getInitialBurstMessageThreshold() { return 0; }
    public int hashCode() { return 0; }
    public boolean isApplyRtlAdjustments() { return false; }
    public boolean isInputBoxStatusDetectionEnabled() { return false; }
    public boolean isSortingByLayoutIndexEnabled() { return false; }
    public boolean isTopToBottomOrder() { return false; }
    public boolean isTurnAlignmentRevisionEnabled() { return false; }
    public boolean isZeroStateTitleHeaderOnly() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class AggregationStrategy implements android.os.Parcelable {
        public static final int AGGREGATION_STRATEGY_NONE = 0;
        public static final int AGGREGATION_STRATEGY_SIMPLE_LOWEST_COMMON_ANCESTOR = 1;
        public static final int AGGREGATION_STRATEGY_ZERO_STATE = 2;
        public static final android.os.Parcelable.Creator<android.service.contentcapture.conversation.TurnClusteringRule.AggregationStrategy> CREATOR = null;
        private final java.util.List<java.lang.Integer> mAssociatedViewTypes = null;
        private final int mSource = 0;
        private final int mStrategy = 0;
        public AggregationStrategy(int p0, int p1, java.util.List<java.lang.Integer> p2) {}
        private AggregationStrategy(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.util.List<java.lang.Integer> getAssociatedViewTypes() { return null; }
        public int getSourceViewType() { return 0; }
        public int getStrategy() { return 0; }
        public int hashCode() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface AggregationStrategyType {
        }

        public static final class Builder {
            private java.util.List<java.lang.Integer> mAssociatedViewTypes;
            private int mSource;
            private int mStrategy;
            public Builder() {}
            public android.service.contentcapture.conversation.TurnClusteringRule.AggregationStrategy build() { return null; }
            public android.service.contentcapture.conversation.TurnClusteringRule.AggregationStrategy.Builder setAssociatedViewTypes(java.util.List<java.lang.Integer> p0) { return null; }
            public android.service.contentcapture.conversation.TurnClusteringRule.AggregationStrategy.Builder setSourceViewType(int p0) { return null; }
            public android.service.contentcapture.conversation.TurnClusteringRule.AggregationStrategy.Builder setStrategy(int p0) { return null; }
        }
    }

    public static final class Builder {
        private java.util.List<android.service.contentcapture.conversation.TurnClusteringRule.AggregationStrategy> mAggregationStrategies;
        private int mAncestorDepth;
        private boolean mApplyRtlAdjustments;
        private int mContentCheckStrategy;
        private int mFewMessagesThreshold;
        private boolean mInputBoxStatusDetectionEnabled;
        private boolean mNeedsRevision;
        private boolean mSortingByLayoutIndexEnabled;
        private boolean mStartsFromTop;
        private boolean mZeroStateTitleOnly;
        public Builder() {}
        public Builder(android.service.contentcapture.conversation.TurnClusteringRule p0) {}
        public android.service.contentcapture.conversation.TurnClusteringRule build() { return null; }
        public android.service.contentcapture.conversation.TurnClusteringRule.Builder setAggregationStrategies(java.util.List<android.service.contentcapture.conversation.TurnClusteringRule.AggregationStrategy> p0) { return null; }
        public android.service.contentcapture.conversation.TurnClusteringRule.Builder setAncestorDepth(int p0) { return null; }
        public android.service.contentcapture.conversation.TurnClusteringRule.Builder setApplyRtlAdjustments(boolean p0) { return null; }
        public android.service.contentcapture.conversation.TurnClusteringRule.Builder setContentCheckStrategy(int p0) { return null; }
        public android.service.contentcapture.conversation.TurnClusteringRule.Builder setInitialBurstMessageThreshold(int p0) { return null; }
        public android.service.contentcapture.conversation.TurnClusteringRule.Builder setInputBoxStatusDetectionEnabled(boolean p0) { return null; }
        public android.service.contentcapture.conversation.TurnClusteringRule.Builder setSortingByLayoutIndexEnabled(boolean p0) { return null; }
        public android.service.contentcapture.conversation.TurnClusteringRule.Builder setTopToBottomOrder(boolean p0) { return null; }
        public android.service.contentcapture.conversation.TurnClusteringRule.Builder setTurnAlignmentRevisionEnabled(boolean p0) { return null; }
        public android.service.contentcapture.conversation.TurnClusteringRule.Builder setZeroStateTitleHeaderOnly(boolean p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ContentCheckStrategy {
        public static final int MATCH_DEFAULT = 0;
        public static final int MATCH_EXACT = 1;
        public static final int MATCH_TEXT_AND_DIRECTION = 2;
        public static final int MATCH_TEXT_IGNORE_CONTAINER = 4;
        public static final int MATCH_TEXT_ONLY = 3;
    }
}
