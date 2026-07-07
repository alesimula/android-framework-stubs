package android.agenticon;

public final class AgentTaskEvent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.agenticon.AgentTaskEvent> CREATOR = null;
    private final android.app.PendingIntent mClickAction = null;
    private final android.graphics.drawable.Icon mIcon = null;
    private final java.lang.CharSequence mText = null;
    private final android.graphics.drawable.Icon mTextBackground = null;
    private AgentTaskEvent(android.os.Parcel p0) {}
    private AgentTaskEvent(java.lang.CharSequence p0, android.graphics.drawable.Icon p1, android.graphics.drawable.Icon p2, android.app.PendingIntent p3) {}
    public int describeContents() { return 0; }
    public android.app.PendingIntent getClickAction() { return null; }
    public android.graphics.drawable.Icon getIcon() { return null; }
    public java.lang.CharSequence getText() { return null; }
    public android.graphics.drawable.Icon getTextBackground() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.app.PendingIntent mClickAction;
        private android.graphics.drawable.Icon mIcon;
        private java.lang.CharSequence mText;
        private android.graphics.drawable.Icon mTextBackground;
        public Builder(android.agenticon.AgentTaskEvent.Builder p0) {}
        public Builder(java.lang.CharSequence p0, android.app.PendingIntent p1) {}
        public android.agenticon.AgentTaskEvent build() { return null; }
        public android.agenticon.AgentTaskEvent.Builder setClickAction(android.app.PendingIntent p0) { return null; }
        public android.agenticon.AgentTaskEvent.Builder setIcon(android.graphics.drawable.Icon p0) { return null; }
        public android.agenticon.AgentTaskEvent.Builder setText(java.lang.CharSequence p0) { return null; }
        public android.agenticon.AgentTaskEvent.Builder setTextBackground(android.graphics.drawable.Icon p0) { return null; }
    }
}
