package android.agenticon;

public final class AgentTaskEvent implements android.os.Parcelable, android.agenticon.IconUriPermissionCheckable {
    public static final android.os.Parcelable.Creator<android.agenticon.AgentTaskEvent> CREATOR = null;
    private final android.graphics.drawable.Icon mBackground = null;
    private final android.app.PendingIntent mClickAction = null;
    private final java.lang.CharSequence mContentDescription = null;
    private final android.agenticon.AgentTaskEvent.ExtraContent mExtraContent = null;
    private final java.util.ArrayList<android.graphics.drawable.Icon> mLeadingIcons = null;
    private final java.lang.CharSequence mText = null;
    private final java.util.ArrayList<android.graphics.drawable.Icon> mTrailingIcons = null;
    private AgentTaskEvent(android.os.Parcel p0) {}
    private AgentTaskEvent(java.lang.CharSequence p0, android.graphics.drawable.Icon p1, java.util.ArrayList<android.graphics.drawable.Icon> p2, java.util.ArrayList<android.graphics.drawable.Icon> p3, android.app.PendingIntent p4, java.lang.CharSequence p5, android.agenticon.AgentTaskEvent.ExtraContent p6) {}
    private static <T extends java.lang.Object> java.util.ArrayList<T> constrainToSize(java.util.ArrayList<T> p0, int p1) { return null; }
    public static int getMaxAllowedLeadingIcons() { return 0; }
    public static int getMaxAllowedTrailingIcons() { return 0; }
    private void scaleDownIconsIfNecessary() {}
    private static void validateIconList(java.util.List<android.graphics.drawable.Icon> p0) {}
    public void checkPermissionForIcons(java.util.function.Consumer<android.graphics.drawable.Icon> p0) {}
    public int describeContents() { return 0; }
    public android.graphics.drawable.Icon getBackground() { return null; }
    public android.app.PendingIntent getClickAction() { return null; }
    public java.lang.CharSequence getContentDescription() { return null; }
    public android.agenticon.AgentTaskEvent.ExtraContent getExtraContent() { return null; }
    @java.lang.Deprecated(forRemoval=true)
    public android.graphics.drawable.Icon getIcon() { return null; }
    public java.util.List<android.graphics.drawable.Icon> getLeadingIcons() { return null; }
    public java.lang.CharSequence getText() { return null; }
    @java.lang.Deprecated(forRemoval=true)
    public android.graphics.drawable.Icon getTextBackground() { return null; }
    public java.util.List<android.graphics.drawable.Icon> getTrailingIcons() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.graphics.drawable.Icon mBackground;
        private android.app.PendingIntent mClickAction;
        private java.lang.CharSequence mContentDescription;
        private android.agenticon.AgentTaskEvent.ExtraContent mExtraContent;
        private java.util.ArrayList<android.graphics.drawable.Icon> mLeadingIcons;
        private java.lang.CharSequence mText;
        private java.util.ArrayList<android.graphics.drawable.Icon> mTrailingIcons;
        public Builder(android.agenticon.AgentTaskEvent.Builder p0) {}
        public Builder(java.lang.CharSequence p0) {}
        @java.lang.Deprecated(forRemoval=true)
        public Builder(java.lang.CharSequence p0, android.app.PendingIntent p1) {}
        public Builder(java.util.List<android.graphics.drawable.Icon> p0, java.util.List<android.graphics.drawable.Icon> p1) {}
        public android.agenticon.AgentTaskEvent build() { return null; }
        public android.agenticon.AgentTaskEvent.Builder setBackground(android.graphics.drawable.Icon p0) { return null; }
        public android.agenticon.AgentTaskEvent.Builder setClickAction(android.app.PendingIntent p0) { return null; }
        public android.agenticon.AgentTaskEvent.Builder setContentDescription(java.lang.CharSequence p0) { return null; }
        public android.agenticon.AgentTaskEvent.Builder setExtraContent(android.agenticon.AgentTaskEvent.ExtraContent p0) { return null; }
        @java.lang.Deprecated(forRemoval=true)
        public android.agenticon.AgentTaskEvent.Builder setIcon(android.graphics.drawable.Icon p0) { return null; }
        public android.agenticon.AgentTaskEvent.Builder setLeadingIcons(java.util.List<android.graphics.drawable.Icon> p0) { return null; }
        public android.agenticon.AgentTaskEvent.Builder setText(java.lang.CharSequence p0) { return null; }
        @java.lang.Deprecated(forRemoval=true)
        public android.agenticon.AgentTaskEvent.Builder setTextBackground(android.graphics.drawable.Icon p0) { return null; }
        public android.agenticon.AgentTaskEvent.Builder setTrailingIcons(java.util.List<android.graphics.drawable.Icon> p0) { return null; }
    }

    public static final class ExtraContent implements android.os.Parcelable, android.agenticon.IconUriPermissionCheckable {
        public static final android.os.Parcelable.Creator<android.agenticon.AgentTaskEvent.ExtraContent> CREATOR = null;
        private final java.util.ArrayList<android.graphics.drawable.Icon> mLeadingIcons = null;
        private final java.lang.CharSequence mText = null;
        private final java.util.ArrayList<android.graphics.drawable.Icon> mTrailingIcons = null;
        private ExtraContent(android.os.Parcel p0) {}
        private ExtraContent(java.lang.CharSequence p0, java.util.ArrayList<android.graphics.drawable.Icon> p1, java.util.ArrayList<android.graphics.drawable.Icon> p2) {}
        public static int getMaxAllowedLeadingIcons() { return 0; }
        public static int getMaxAllowedTrailingIcons() { return 0; }
        private void scaleDownIconsIfNecessary() {}
        public void checkPermissionForIcons(java.util.function.Consumer<android.graphics.drawable.Icon> p0) {}
        public int describeContents() { return 0; }
        public java.util.List<android.graphics.drawable.Icon> getLeadingIcons() { return null; }
        public java.lang.CharSequence getText() { return null; }
        public java.util.List<android.graphics.drawable.Icon> getTrailingIcons() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        public static final class Builder {
            private java.util.ArrayList<android.graphics.drawable.Icon> mLeadingIcons;
            private java.lang.CharSequence mText;
            private java.util.ArrayList<android.graphics.drawable.Icon> mTrailingIcons;
            public Builder(android.agenticon.AgentTaskEvent.ExtraContent.Builder p0) {}
            public Builder(java.lang.CharSequence p0) {}
            public Builder(java.util.List<android.graphics.drawable.Icon> p0, java.util.List<android.graphics.drawable.Icon> p1) {}
            public android.agenticon.AgentTaskEvent.ExtraContent build() { return null; }
            public android.agenticon.AgentTaskEvent.ExtraContent.Builder setLeadingIcons(java.util.List<android.graphics.drawable.Icon> p0) { return null; }
            public android.agenticon.AgentTaskEvent.ExtraContent.Builder setText(java.lang.CharSequence p0) { return null; }
            public android.agenticon.AgentTaskEvent.ExtraContent.Builder setTrailingIcons(java.util.List<android.graphics.drawable.Icon> p0) { return null; }
        }
    }
}
