package android.service.contentcapture.conversation;

public final class ScreenRule implements android.os.Parcelable {
    public static final int ACTIVITY_TYPE_CONVERSATION_LIST = 2;
    public static final int ACTIVITY_TYPE_CONVERSATION_VIEW = 1;
    public static final int ACTIVITY_TYPE_UNKNOWN = 0;
    public static final android.os.Parcelable.Creator<android.service.contentcapture.conversation.ScreenRule> CREATOR = null;
    private final java.util.List<android.service.contentcapture.conversation.ScreenRule.ActivityMappingStrategy> mActivityMappingStrategies = null;
    private ScreenRule(android.os.Parcel p0) {}
    public ScreenRule(java.util.List<android.service.contentcapture.conversation.ScreenRule.ActivityMappingStrategy> p0) {}
    public ScreenRule(java.util.List<java.lang.String> p0, int p1) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.List<android.service.contentcapture.conversation.ScreenRule.ActivityMappingStrategy> getActivityMappingStrategies() { return null; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class ActivityMappingStrategy implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.service.contentcapture.conversation.ScreenRule.ActivityMappingStrategy> CREATOR = null;
        private final java.util.List<java.lang.String> mActivityClassNames = null;
        private final int mActivityType = 0;
        private final java.util.List<android.service.contentcapture.conversation.ViewRule> mViewRules = null;
        private ActivityMappingStrategy(android.os.Parcel p0) {}
        public ActivityMappingStrategy(java.util.List<java.lang.String> p0, int p1) {}
        public ActivityMappingStrategy(java.util.List<java.lang.String> p0, java.util.List<android.service.contentcapture.conversation.ViewRule> p1) {}
        public ActivityMappingStrategy(java.util.List<java.lang.String> p0, java.util.List<android.service.contentcapture.conversation.ViewRule> p1, int p2) {}
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.util.List<java.lang.String> getActivityClassNames() { return null; }
        public int getAppliedActivityType() { return 0; }
        public java.util.List<android.service.contentcapture.conversation.ViewRule> getViewRules() { return null; }
        public int hashCode() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ActivityType {
    }

    public static final class Builder {
        private java.util.List<android.service.contentcapture.conversation.ScreenRule.ActivityMappingStrategy> mActivityMappingStrategies;
        public Builder() {}
        public android.service.contentcapture.conversation.ScreenRule build() { return null; }
        public android.service.contentcapture.conversation.ScreenRule.Builder setActivityMappingStrategies(java.util.List<android.service.contentcapture.conversation.ScreenRule.ActivityMappingStrategy> p0) { return null; }
    }
}
