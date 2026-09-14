package android.app.admin.dataleakprevention.reporting;

public final class ScreenCaptureItem {
    public static final int ELEMENT_TYPE_APP_WINDOW = 1;
    public static final int ELEMENT_TYPE_UNSPECIFIED = 0;
    private final int mElementType = 0;
    private final java.lang.String mPackageName = null;
    private final boolean mRedacted = false;
    private ScreenCaptureItem(android.app.admin.dataleakprevention.reporting.ScreenCaptureItem.Builder p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int getElementType() { return 0; }
    public java.lang.String getPackageName() { return null; }
    public int hashCode() { return 0; }
    public boolean isRedacted() { return false; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        private int mElementType;
        private java.lang.String mPackageName;
        private boolean mRedacted;
        public Builder() {}
        public android.app.admin.dataleakprevention.reporting.ScreenCaptureItem build() { return null; }
        public android.app.admin.dataleakprevention.reporting.ScreenCaptureItem.Builder setElementType(int p0) { return null; }
        public android.app.admin.dataleakprevention.reporting.ScreenCaptureItem.Builder setPackageName(java.lang.String p0) { return null; }
        public android.app.admin.dataleakprevention.reporting.ScreenCaptureItem.Builder setRedacted(boolean p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ElementType {
    }
}
