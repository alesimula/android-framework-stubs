package com.android.internal.policy;

public class WindowingExemptionsInfo {
    private final android.content.ComponentName mBaseActivity = null;
    private final boolean mIsActivityStackTransparent = false;
    private final boolean mIsTopActivityNoDisplay = false;
    private final int mNumActivities = 0;
    private final android.content.pm.ActivityInfo mTopActivityInfo = null;
    private final int mTopActivityType = 0;
    private final int mUserId = 0;
    private WindowingExemptionsInfo(com.android.internal.policy.WindowingExemptionsInfo.Builder p0) {}
    public static com.android.internal.policy.WindowingExemptionsInfo fromTaskInfo(android.app.TaskInfo p0) { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.content.ComponentName getBaseActivity() { return null; }
    public int getNumActivities() { return 0; }
    public android.content.pm.ActivityInfo getTopActivityInfo() { return null; }
    public int getTopActivityType() { return 0; }
    public int getUserId() { return 0; }
    public int hashCode() { return 0; }
    public boolean isActivityStackTransparent() { return false; }
    public boolean isTopActivityNoDisplay() { return false; }
    public java.lang.String toString() { return null; }

    public static class Builder {
        private android.content.ComponentName mBaseActivity;
        private boolean mIsActivityStackTransparent;
        private boolean mIsTopActivityNoDisplay;
        private int mNumActivities;
        private android.content.pm.ActivityInfo mTopActivityInfo;
        private int mTopActivityType;
        private int mUserId;
        public Builder() {}
        public com.android.internal.policy.WindowingExemptionsInfo build() { return null; }
        public com.android.internal.policy.WindowingExemptionsInfo.Builder setActivityStackTransparent(boolean p0) { return null; }
        public com.android.internal.policy.WindowingExemptionsInfo.Builder setBaseActivity(android.content.ComponentName p0) { return null; }
        public com.android.internal.policy.WindowingExemptionsInfo.Builder setIsActivityStackTransparent(boolean p0) { return null; }
        public com.android.internal.policy.WindowingExemptionsInfo.Builder setIsTopActivityNoDisplay(boolean p0) { return null; }
        public com.android.internal.policy.WindowingExemptionsInfo.Builder setNumActivities(int p0) { return null; }
        public com.android.internal.policy.WindowingExemptionsInfo.Builder setTopActivityInfo(android.content.pm.ActivityInfo p0) { return null; }
        public com.android.internal.policy.WindowingExemptionsInfo.Builder setTopActivityNoDisplay(boolean p0) { return null; }
        public com.android.internal.policy.WindowingExemptionsInfo.Builder setTopActivityType(int p0) { return null; }
        public com.android.internal.policy.WindowingExemptionsInfo.Builder setUserId(int p0) { return null; }
    }
}
