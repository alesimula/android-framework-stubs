package android.agenticon;

public final class AgentTaskState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.agenticon.AgentTaskState> CREATOR = null;
    private final android.app.PendingIntent mClickAction = null;
    private final java.lang.CharSequence mContentDescription = null;
    private final android.graphics.drawable.Icon mIcon = null;
    private final boolean mShouldInterruptPreviousAnimation = false;
    private AgentTaskState(android.graphics.drawable.Icon p0, java.lang.CharSequence p1, boolean p2, android.app.PendingIntent p3) {}
    private AgentTaskState(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public android.app.PendingIntent getClickAction() { return null; }
    public java.lang.CharSequence getContentDescription() { return null; }
    public android.graphics.drawable.Icon getIcon() { return null; }
    public boolean shouldInterruptPreviousAnimation() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.app.PendingIntent mClickAction;
        private java.lang.CharSequence mContentDescription;
        private android.graphics.drawable.Icon mIcon;
        private boolean mShouldInterruptPreviousAnimation;
        public Builder(android.agenticon.AgentTaskState.Builder p0) {}
        public Builder(android.graphics.drawable.Icon p0, java.lang.CharSequence p1, android.app.PendingIntent p2) {}
        public android.agenticon.AgentTaskState build() { return null; }
        public android.agenticon.AgentTaskState.Builder setClickAction(android.app.PendingIntent p0) { return null; }
        public android.agenticon.AgentTaskState.Builder setIconAndContentDescription(android.graphics.drawable.Icon p0, java.lang.CharSequence p1) { return null; }
        public android.agenticon.AgentTaskState.Builder setShouldInterruptPreviousAnimation(boolean p0) { return null; }
    }
}
