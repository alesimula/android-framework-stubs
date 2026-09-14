package android.service.contentcapture.conversation;

public final class ViewRule implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.contentcapture.conversation.ViewRule> CREATOR = null;
    private final java.util.List<android.service.contentcapture.conversation.ViewRule.ContentDescriptionRule> mContentDescriptionRules = null;
    private final android.service.contentcapture.conversation.ViewRule.ParentNodeRectangleOverrideRule mOverrideRule = null;
    private final java.util.List<android.service.contentcapture.conversation.ViewRule.RectangleRule> mRules = null;
    private final int mViewType = 0;
    private ViewRule(android.os.Parcel p0) {}
    private ViewRule(android.service.contentcapture.conversation.ViewRule.Builder p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.List<android.service.contentcapture.conversation.ViewRule.ContentDescriptionRule> getContentDescriptionRules() { return null; }
    public android.service.contentcapture.conversation.ViewRule.ParentNodeRectangleOverrideRule getOverrideRule() { return null; }
    public java.util.List<android.service.contentcapture.conversation.ViewRule.RectangleRule> getRectangleRules() { return null; }
    public int getViewType() { return 0; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private java.util.List<android.service.contentcapture.conversation.ViewRule.ContentDescriptionRule> mContentDescriptionRules;
        private android.service.contentcapture.conversation.ViewRule.ParentNodeRectangleOverrideRule mOverrideRule;
        private java.util.List<android.service.contentcapture.conversation.ViewRule.RectangleRule> mRules;
        private int mViewType;
        public Builder() {}
        public Builder(java.util.List<android.service.contentcapture.conversation.ViewRule.RectangleRule> p0, int p1) {}
        public android.service.contentcapture.conversation.ViewRule build() { return null; }
        public android.service.contentcapture.conversation.ViewRule.Builder setContentDescriptionRules(java.util.List<android.service.contentcapture.conversation.ViewRule.ContentDescriptionRule> p0) { return null; }
        public android.service.contentcapture.conversation.ViewRule.Builder setOverrideRule(android.service.contentcapture.conversation.ViewRule.ParentNodeRectangleOverrideRule p0) { return null; }
        public android.service.contentcapture.conversation.ViewRule.Builder setRectangleRules(java.util.List<android.service.contentcapture.conversation.ViewRule.RectangleRule> p0) { return null; }
        public android.service.contentcapture.conversation.ViewRule.Builder setViewType(int p0) { return null; }
    }

    public static final class ClassNameRule implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.service.contentcapture.conversation.ViewRule.ClassNameRule> CREATOR = null;
        private final java.lang.String mClassName = null;
        private final int mLookupDepth = 0;
        private final java.util.List<java.lang.String> mParentClassNames = null;
        private ClassNameRule(android.os.Parcel p0) {}
        public ClassNameRule(java.lang.String p0) {}
        public ClassNameRule(java.lang.String p0, java.util.List<java.lang.String> p1, int p2) {}
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String getClassName() { return null; }
        public int getLookupDepth() { return 0; }
        public java.util.List<java.lang.String> getParentClassNames() { return null; }
        public int hashCode() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static final class ContentDescriptionRule implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.service.contentcapture.conversation.ViewRule.ContentDescriptionRule> CREATOR = null;
        private final java.lang.String mExtractionDelimiter = null;
        private final java.lang.String mLanguage = null;
        private final java.util.List<java.lang.String> mPrefixes = null;
        private ContentDescriptionRule(android.os.Parcel p0) {}
        public ContentDescriptionRule(java.util.List<java.lang.String> p0) {}
        public ContentDescriptionRule(java.util.List<java.lang.String> p0, java.lang.String p1, java.lang.String p2) {}
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String getExtractionDelimiter() { return null; }
        public java.lang.String getLanguage() { return null; }
        public java.util.List<java.lang.String> getPrefixes() { return null; }
        public int hashCode() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static final class ParentNodeRectangleOverrideRule implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.service.contentcapture.conversation.ViewRule.ParentNodeRectangleOverrideRule> CREATOR = null;
        private final boolean mInheritHorizontalBoundaries = false;
        private final boolean mInheritVerticalBoundaries = false;
        private final int mMaxLookupDepth = 0;
        private final int mParentAncestorLevel = 0;
        private final java.util.List<java.lang.String> mResourceIds = null;
        public ParentNodeRectangleOverrideRule(int p0) {}
        public ParentNodeRectangleOverrideRule(int p0, int p1, java.util.List<java.lang.String> p2, boolean p3, boolean p4) {}
        private ParentNodeRectangleOverrideRule(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int getMaxLookupDepth() { return 0; }
        public int getParentAncestorLevel() { return 0; }
        public java.util.List<java.lang.String> getResourceIds() { return null; }
        public int hashCode() { return 0; }
        public boolean shouldInheritHorizontalBoundaries() { return false; }
        public boolean shouldInheritVerticalBoundaries() { return false; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        public static final class Builder {
            private boolean mInheritHorizontalBoundaries;
            private boolean mInheritVerticalBoundaries;
            private int mMaxLookupDepth;
            private int mParentAncestorLevel;
            private java.util.List<java.lang.String> mResourceIds;
            public Builder() {}
            public android.service.contentcapture.conversation.ViewRule.ParentNodeRectangleOverrideRule build() { return null; }
            public android.service.contentcapture.conversation.ViewRule.ParentNodeRectangleOverrideRule.Builder setInheritHorizontalBoundaries(boolean p0) { return null; }
            public android.service.contentcapture.conversation.ViewRule.ParentNodeRectangleOverrideRule.Builder setInheritVerticalBoundaries(boolean p0) { return null; }
            public android.service.contentcapture.conversation.ViewRule.ParentNodeRectangleOverrideRule.Builder setMaxLookupDepth(int p0) { return null; }
            public android.service.contentcapture.conversation.ViewRule.ParentNodeRectangleOverrideRule.Builder setParentAncestorLevel(int p0) { return null; }
            public android.service.contentcapture.conversation.ViewRule.ParentNodeRectangleOverrideRule.Builder setResourceIds(java.util.List<java.lang.String> p0) { return null; }
        }
    }

    public static final class RectangleRule implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.service.contentcapture.conversation.ViewRule.RectangleRule> CREATOR = null;
        public static final int RESOURCE_ID_MATCH_RULE_ANY = 1;
        public static final int RESOURCE_ID_MATCH_RULE_CONTAINS = 2;
        public static final int RESOURCE_ID_MATCH_RULE_EQUALS = 3;
        public static final int RESOURCE_ID_MATCH_RULE_UNKNOWN = 0;
        private final android.service.contentcapture.conversation.ViewRule.ClassNameRule mAncestorClassNameRule = null;
        private final android.service.contentcapture.conversation.ViewRule.ResourceIdRule mAncestorResourceIdRule = null;
        private final android.service.contentcapture.conversation.ViewRule.ClassNameRule mClassNameRule = null;
        private final java.util.List<java.lang.String> mClassNames = null;
        private final android.service.contentcapture.conversation.ViewRule.ResourceIdRule mParentRule = null;
        private final android.graphics.RectF mRectangle = null;
        private final int mResourceIdMatchRule = 0;
        private final android.service.contentcapture.conversation.ViewRule.ResourceIdRule mResourceIdRule = null;
        private final java.util.List<java.lang.String> mResourceIds = null;
        private RectangleRule(android.os.Parcel p0) {}
        public RectangleRule(android.service.contentcapture.conversation.ViewRule.ResourceIdRule p0, android.service.contentcapture.conversation.ViewRule.ClassNameRule p1) {}
        public RectangleRule(android.service.contentcapture.conversation.ViewRule.ResourceIdRule p0, android.service.contentcapture.conversation.ViewRule.ClassNameRule p1, int p2, java.util.List<java.lang.String> p3, java.util.List<java.lang.String> p4, android.graphics.RectF p5, android.service.contentcapture.conversation.ViewRule.ResourceIdRule p6, android.service.contentcapture.conversation.ViewRule.ResourceIdRule p7, android.service.contentcapture.conversation.ViewRule.ClassNameRule p8) {}
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public android.service.contentcapture.conversation.ViewRule.ClassNameRule getAncestorClassNameRule() { return null; }
        public android.service.contentcapture.conversation.ViewRule.ResourceIdRule getAncestorResourceIdRule() { return null; }
        public android.graphics.RectF getBoundingRect() { return null; }
        public android.service.contentcapture.conversation.ViewRule.ClassNameRule getClassNameRule() { return null; }
        public java.util.List<java.lang.String> getClassNames() { return null; }
        public android.service.contentcapture.conversation.ViewRule.ResourceIdRule getParentRule() { return null; }
        public int getResourceIdMatchRule() { return 0; }
        public android.service.contentcapture.conversation.ViewRule.ResourceIdRule getResourceIdRule() { return null; }
        public java.util.List<java.lang.String> getResourceIds() { return null; }
        public int hashCode() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        public static final class Builder {
            private android.service.contentcapture.conversation.ViewRule.ClassNameRule mAncestorClassNameRule;
            private android.service.contentcapture.conversation.ViewRule.ResourceIdRule mAncestorResourceIdRule;
            private android.service.contentcapture.conversation.ViewRule.ClassNameRule mClassNameRule;
            private java.util.List<java.lang.String> mClassNames;
            private android.service.contentcapture.conversation.ViewRule.ResourceIdRule mParentRule;
            private android.graphics.RectF mRectangle;
            private int mResourceIdMatchRule;
            private android.service.contentcapture.conversation.ViewRule.ResourceIdRule mResourceIdRule;
            private java.util.List<java.lang.String> mResourceIds;
            public Builder() {}
            public android.service.contentcapture.conversation.ViewRule.RectangleRule build() { return null; }
            public android.service.contentcapture.conversation.ViewRule.RectangleRule.Builder setAncestorClassNameRule(android.service.contentcapture.conversation.ViewRule.ClassNameRule p0) { return null; }
            public android.service.contentcapture.conversation.ViewRule.RectangleRule.Builder setAncestorResourceIdRule(android.service.contentcapture.conversation.ViewRule.ResourceIdRule p0) { return null; }
            public android.service.contentcapture.conversation.ViewRule.RectangleRule.Builder setBoundingRect(android.graphics.RectF p0) { return null; }
            public android.service.contentcapture.conversation.ViewRule.RectangleRule.Builder setClassNameRule(android.service.contentcapture.conversation.ViewRule.ClassNameRule p0) { return null; }
            public android.service.contentcapture.conversation.ViewRule.RectangleRule.Builder setClassNames(java.util.List<java.lang.String> p0) { return null; }
            public android.service.contentcapture.conversation.ViewRule.RectangleRule.Builder setParentRule(android.service.contentcapture.conversation.ViewRule.ResourceIdRule p0) { return null; }
            public android.service.contentcapture.conversation.ViewRule.RectangleRule.Builder setResourceIdMatchRule(int p0) { return null; }
            public android.service.contentcapture.conversation.ViewRule.RectangleRule.Builder setResourceIdRule(android.service.contentcapture.conversation.ViewRule.ResourceIdRule p0) { return null; }
            public android.service.contentcapture.conversation.ViewRule.RectangleRule.Builder setResourceIds(java.util.List<java.lang.String> p0) { return null; }
        }
    }

    public static final class ResourceIdRule implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.service.contentcapture.conversation.ViewRule.ResourceIdRule> CREATOR = null;
        private final java.lang.String mId = null;
        private final int mLookupDepth = 0;
        private final java.util.List<java.lang.String> mParentResourceIds = null;
        private final java.util.List<java.lang.String> mSkipPrefixes = null;
        private ResourceIdRule(android.os.Parcel p0) {}
        public ResourceIdRule(java.lang.String p0) {}
        public ResourceIdRule(java.lang.String p0, java.util.List<java.lang.String> p1, java.util.List<java.lang.String> p2, int p3) {}
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String getId() { return null; }
        public int getLookupDepth() { return 0; }
        public java.util.List<java.lang.String> getParentResourceIds() { return null; }
        public java.util.List<java.lang.String> getSkipPrefixes() { return null; }
        public int hashCode() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        public static final class Builder {
            private java.lang.String mId;
            private int mLookupDepth;
            private java.util.List<java.lang.String> mParentResourceIds;
            private java.util.List<java.lang.String> mSkipPrefixes;
            public Builder() {}
            public android.service.contentcapture.conversation.ViewRule.ResourceIdRule build() { return null; }
            public android.service.contentcapture.conversation.ViewRule.ResourceIdRule.Builder setId(java.lang.String p0) { return null; }
            public android.service.contentcapture.conversation.ViewRule.ResourceIdRule.Builder setLookupDepth(int p0) { return null; }
            public android.service.contentcapture.conversation.ViewRule.ResourceIdRule.Builder setParentResourceIds(java.util.List<java.lang.String> p0) { return null; }
            public android.service.contentcapture.conversation.ViewRule.ResourceIdRule.Builder setSkipPrefixes(java.util.List<java.lang.String> p0) { return null; }
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ViewType {
        public static final int VIEW_TYPE_CHROME = 7;
        public static final int VIEW_TYPE_CONTACT_NAME = 4;
        public static final int VIEW_TYPE_CONVERSATION_STATUS = 10;
        public static final int VIEW_TYPE_DATE = 5;
        public static final int VIEW_TYPE_DATE_TIME = 20;
        public static final int VIEW_TYPE_DELETION_REQUESTED = 19;
        public static final int VIEW_TYPE_EXITED_VIEW = 14;
        public static final int VIEW_TYPE_GENERIC_MESSAGE_TEXT = 3;
        public static final int VIEW_TYPE_IMAGE = 8;
        public static final int VIEW_TYPE_INPUT_BOX = 18;
        public static final int VIEW_TYPE_PROFILE_IMAGE = 16;
        public static final int VIEW_TYPE_QUOTED_CONTACT_NAME = 13;
        public static final int VIEW_TYPE_RECEIVED_MESSAGE_TEXT = 2;
        public static final int VIEW_TYPE_RECEIVER_QUOTED_TEXT = 11;
        public static final int VIEW_TYPE_SENDER_QUOTED_TEXT = 12;
        public static final int VIEW_TYPE_SENT_MESSAGE_TEXT = 1;
        public static final int VIEW_TYPE_STATUS_TEXT = 15;
        public static final int VIEW_TYPE_SUBTITLE = 21;
        public static final int VIEW_TYPE_TIME = 6;
        public static final int VIEW_TYPE_TITLE = 9;
        public static final int VIEW_TYPE_UNKNOWN = 0;
        public static final int VIEW_TYPE_UNSURE_SENT_RECEIVED_TEXT = 17;
    }
}
