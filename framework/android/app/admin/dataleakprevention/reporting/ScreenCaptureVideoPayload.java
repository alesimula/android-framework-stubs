package android.app.admin.dataleakprevention.reporting;

public final class ScreenCaptureVideoPayload implements android.app.admin.dataleakprevention.reporting.Payload {
    public static final int SESSION_EVENT_TYPE_START = 1;
    public static final int SESSION_EVENT_TYPE_STOP = 3;
    public static final int SESSION_EVENT_TYPE_UNSPECIFIED = 0;
    public static final int SESSION_EVENT_TYPE_UPDATE = 2;
    private final int mEventType = 0;
    private final java.util.List<android.app.admin.dataleakprevention.reporting.ScreenCaptureItem> mItems = null;
    private final java.lang.String mSessionId = null;
    private ScreenCaptureVideoPayload(android.app.admin.dataleakprevention.reporting.ScreenCaptureVideoPayload.Builder p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int getEventType() { return 0; }
    public java.util.List<android.app.admin.dataleakprevention.reporting.ScreenCaptureItem> getItems() { return null; }
    public java.lang.String getSessionId() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        private int mEventType;
        private java.util.List<android.app.admin.dataleakprevention.reporting.ScreenCaptureItem> mItems;
        private java.lang.String mSessionId;
        public Builder() {}
        public android.app.admin.dataleakprevention.reporting.ScreenCaptureVideoPayload build() { return null; }
        public android.app.admin.dataleakprevention.reporting.ScreenCaptureVideoPayload.Builder setEventType(int p0) { return null; }
        public android.app.admin.dataleakprevention.reporting.ScreenCaptureVideoPayload.Builder setItems(java.util.List<android.app.admin.dataleakprevention.reporting.ScreenCaptureItem> p0) { return null; }
        public android.app.admin.dataleakprevention.reporting.ScreenCaptureVideoPayload.Builder setSessionId(java.lang.String p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SessionEventType {
    }
}
