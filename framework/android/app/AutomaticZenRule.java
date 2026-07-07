package android.app;

public final class AutomaticZenRule implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.AutomaticZenRule> CREATOR = null;
    private static final int DISABLED = 0;
    private static final int ENABLED = 1;
    public static final int FIELD_ICON = 4;
    public static final int FIELD_INTERRUPTION_FILTER = 2;
    public static final int FIELD_NAME = 1;
    public static final int MAX_DESC_LENGTH = 150;
    public static final int MAX_STRING_LENGTH = 500;
    public static final int TYPE_BEDTIME = 3;
    public static final int TYPE_DRIVING = 4;
    public static final int TYPE_IMMERSIVE = 5;
    public static final int TYPE_MANAGED = 7;
    public static final int TYPE_OTHER = 0;
    public static final int TYPE_SCHEDULE_CALENDAR = 2;
    public static final int TYPE_SCHEDULE_TIME = 1;
    public static final int TYPE_THEATER = 6;
    public static final int TYPE_TRANSIT = 8;
    public static final int TYPE_UNKNOWN = -1;
    private android.net.Uri conditionId;
    private android.content.ComponentName configurationActivity;
    private long creationTime;
    private boolean enabled;
    private int interruptionFilter;
    private boolean mAllowManualInvocation;
    private android.service.notification.ZenDeviceEffects mDeviceEffects;
    private int mIconResId;
    private java.lang.String mPkg;
    private java.lang.String mTriggerDescription;
    private int mType;
    private android.service.notification.ZenPolicy mZenPolicy;
    private java.lang.String name;
    private android.content.ComponentName owner;
    public AutomaticZenRule(android.os.Parcel p0) {}
    public AutomaticZenRule(java.lang.String p0, android.content.ComponentName p1, android.content.ComponentName p2, android.net.Uri p3, android.service.notification.ZenPolicy p4, int p5, boolean p6) {}
    @java.lang.Deprecated
    public AutomaticZenRule(java.lang.String p0, android.content.ComponentName p1, android.net.Uri p2, int p3, boolean p4) {}
    private static int checkValidType(int p0) { return 0; }
    public static java.lang.String fieldsToString(int p0) { return null; }
    private static android.content.ComponentName getTrimmedComponentName(android.content.ComponentName p0) { return null; }
    private static java.lang.String getTrimmedString(java.lang.String p0) { return null; }
    private static java.lang.String getTrimmedString(java.lang.String p0, int p1) { return null; }
    private static android.net.Uri getTrimmedUri(android.net.Uri p0) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.net.Uri getConditionId() { return null; }
    public android.content.ComponentName getConfigurationActivity() { return null; }
    public long getCreationTime() { return 0L; }
    public android.service.notification.ZenDeviceEffects getDeviceEffects() { return null; }
    public int getIconResId() { return 0; }
    public int getInterruptionFilter() { return 0; }
    public java.lang.String getName() { return null; }
    public android.content.ComponentName getOwner() { return null; }
    public java.lang.String getPackageName() { return null; }
    public java.lang.String getTriggerDescription() { return null; }
    public int getType() { return 0; }
    public android.service.notification.ZenPolicy getZenPolicy() { return null; }
    public int hashCode() { return 0; }
    public boolean isEnabled() { return false; }
    public boolean isManualInvocationAllowed() { return false; }
    public void setConditionId(android.net.Uri p0) {}
    public void setConfigurationActivity(android.content.ComponentName p0) {}
    public void setDeviceEffects(android.service.notification.ZenDeviceEffects p0) {}
    public void setEnabled(boolean p0) {}
    public void setIconResId(int p0) {}
    public void setInterruptionFilter(int p0) {}
    public void setManualInvocationAllowed(boolean p0) {}
    public void setName(java.lang.String p0) {}
    public void setOwner(android.content.ComponentName p0) {}
    public void setPackageName(java.lang.String p0) {}
    public void setTriggerDescription(java.lang.String p0) {}
    public void setType(int p0) {}
    public void setZenPolicy(android.service.notification.ZenPolicy p0) {}
    public java.lang.String toString() { return null; }
    public void validate() {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class AzrWithId implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.app.AutomaticZenRule.AzrWithId> CREATOR = null;
        public final java.lang.String mId = null;
        public final android.app.AutomaticZenRule mRule = null;
        public AzrWithId(java.lang.String p0, android.app.AutomaticZenRule p1) {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static final class Builder {
        private boolean mAllowManualInvocation;
        private android.net.Uri mConditionId;
        private android.content.ComponentName mConfigurationActivity;
        private long mCreationTime;
        private java.lang.String mDescription;
        private android.service.notification.ZenDeviceEffects mDeviceEffects;
        private boolean mEnabled;
        private int mIconResId;
        private int mInterruptionFilter;
        private java.lang.String mName;
        private android.content.ComponentName mOwner;
        private java.lang.String mPkg;
        private android.service.notification.ZenPolicy mPolicy;
        private int mType;
        public Builder(android.app.AutomaticZenRule p0) {}
        public Builder(java.lang.String p0, android.net.Uri p1) {}
        public android.app.AutomaticZenRule build() { return null; }
        public android.app.AutomaticZenRule.Builder setConditionId(android.net.Uri p0) { return null; }
        public android.app.AutomaticZenRule.Builder setConfigurationActivity(android.content.ComponentName p0) { return null; }
        public android.app.AutomaticZenRule.Builder setCreationTime(long p0) { return null; }
        public android.app.AutomaticZenRule.Builder setDeviceEffects(android.service.notification.ZenDeviceEffects p0) { return null; }
        public android.app.AutomaticZenRule.Builder setEnabled(boolean p0) { return null; }
        public android.app.AutomaticZenRule.Builder setIconResId(int p0) { return null; }
        public android.app.AutomaticZenRule.Builder setInterruptionFilter(int p0) { return null; }
        public android.app.AutomaticZenRule.Builder setManualInvocationAllowed(boolean p0) { return null; }
        public android.app.AutomaticZenRule.Builder setName(java.lang.String p0) { return null; }
        public android.app.AutomaticZenRule.Builder setOwner(android.content.ComponentName p0) { return null; }
        public android.app.AutomaticZenRule.Builder setPackage(java.lang.String p0) { return null; }
        public android.app.AutomaticZenRule.Builder setTriggerDescription(java.lang.String p0) { return null; }
        public android.app.AutomaticZenRule.Builder setType(int p0) { return null; }
        public android.app.AutomaticZenRule.Builder setZenPolicy(android.service.notification.ZenPolicy p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ModifiableField {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Type {
    }
}
