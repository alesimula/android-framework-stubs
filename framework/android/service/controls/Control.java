package android.service.controls;

public final class Control implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.controls.Control> CREATOR = null;
    private static final int NUM_STATUS = 5;
    public static final int STATUS_DISABLED = 4;
    public static final int STATUS_ERROR = 3;
    public static final int STATUS_NOT_FOUND = 2;
    public static final int STATUS_OK = 1;
    public static final int STATUS_UNKNOWN = 0;
    private static final java.lang.String TAG = "Control";
    private final android.app.PendingIntent mAppIntent = null;
    private final boolean mAuthRequired = false;
    private final java.lang.String mControlId = null;
    private final android.service.controls.templates.ControlTemplate mControlTemplate = null;
    private final android.content.res.ColorStateList mCustomColor = null;
    private final android.graphics.drawable.Icon mCustomIcon = null;
    private final int mDeviceType = 0;
    private final int mStatus = 0;
    private final java.lang.CharSequence mStatusText = null;
    private final java.lang.CharSequence mStructure = null;
    private final java.lang.CharSequence mSubtitle = null;
    private final java.lang.CharSequence mTitle = null;
    private final java.lang.CharSequence mZone = null;
    Control(android.os.Parcel p0) {}
    Control(java.lang.String p0, int p1, java.lang.CharSequence p2, java.lang.CharSequence p3, java.lang.CharSequence p4, java.lang.CharSequence p5, android.app.PendingIntent p6, android.graphics.drawable.Icon p7, android.content.res.ColorStateList p8, int p9, android.service.controls.templates.ControlTemplate p10, java.lang.CharSequence p11, boolean p12) {}
    public int describeContents() { return 0; }
    public android.app.PendingIntent getAppIntent() { return null; }
    public java.lang.String getControlId() { return null; }
    public android.service.controls.templates.ControlTemplate getControlTemplate() { return null; }
    public android.content.res.ColorStateList getCustomColor() { return null; }
    public android.graphics.drawable.Icon getCustomIcon() { return null; }
    public int getDeviceType() { return 0; }
    public int getStatus() { return 0; }
    public java.lang.CharSequence getStatusText() { return null; }
    public java.lang.CharSequence getStructure() { return null; }
    public java.lang.CharSequence getSubtitle() { return null; }
    public java.lang.CharSequence getTitle() { return null; }
    public java.lang.CharSequence getZone() { return null; }
    public boolean isAuthRequired() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class StatefulBuilder {
        private static final java.lang.String TAG = "StatefulBuilder";
        private android.app.PendingIntent mAppIntent;
        private boolean mAuthRequired;
        private java.lang.String mControlId;
        private android.service.controls.templates.ControlTemplate mControlTemplate;
        private android.content.res.ColorStateList mCustomColor;
        private android.graphics.drawable.Icon mCustomIcon;
        private int mDeviceType;
        private int mStatus;
        private java.lang.CharSequence mStatusText;
        private java.lang.CharSequence mStructure;
        private java.lang.CharSequence mSubtitle;
        private java.lang.CharSequence mTitle;
        private java.lang.CharSequence mZone;
        public StatefulBuilder(android.service.controls.Control p0) {}
        public StatefulBuilder(java.lang.String p0, android.app.PendingIntent p1) {}
        public android.service.controls.Control build() { return null; }
        public android.service.controls.Control.StatefulBuilder setAppIntent(android.app.PendingIntent p0) { return null; }
        public android.service.controls.Control.StatefulBuilder setAuthRequired(boolean p0) { return null; }
        public android.service.controls.Control.StatefulBuilder setControlId(java.lang.String p0) { return null; }
        public android.service.controls.Control.StatefulBuilder setControlTemplate(android.service.controls.templates.ControlTemplate p0) { return null; }
        public android.service.controls.Control.StatefulBuilder setCustomColor(android.content.res.ColorStateList p0) { return null; }
        public android.service.controls.Control.StatefulBuilder setCustomIcon(android.graphics.drawable.Icon p0) { return null; }
        public android.service.controls.Control.StatefulBuilder setDeviceType(int p0) { return null; }
        public android.service.controls.Control.StatefulBuilder setStatus(int p0) { return null; }
        public android.service.controls.Control.StatefulBuilder setStatusText(java.lang.CharSequence p0) { return null; }
        public android.service.controls.Control.StatefulBuilder setStructure(java.lang.CharSequence p0) { return null; }
        public android.service.controls.Control.StatefulBuilder setSubtitle(java.lang.CharSequence p0) { return null; }
        public android.service.controls.Control.StatefulBuilder setTitle(java.lang.CharSequence p0) { return null; }
        public android.service.controls.Control.StatefulBuilder setZone(java.lang.CharSequence p0) { return null; }
    }

    public static final class StatelessBuilder {
        private static final java.lang.String TAG = "StatelessBuilder";
        private android.app.PendingIntent mAppIntent;
        private java.lang.String mControlId;
        private android.content.res.ColorStateList mCustomColor;
        private android.graphics.drawable.Icon mCustomIcon;
        private int mDeviceType;
        private java.lang.CharSequence mStructure;
        private java.lang.CharSequence mSubtitle;
        private java.lang.CharSequence mTitle;
        private java.lang.CharSequence mZone;
        public StatelessBuilder(android.service.controls.Control p0) {}
        public StatelessBuilder(java.lang.String p0, android.app.PendingIntent p1) {}
        public android.service.controls.Control build() { return null; }
        public android.service.controls.Control.StatelessBuilder setAppIntent(android.app.PendingIntent p0) { return null; }
        public android.service.controls.Control.StatelessBuilder setControlId(java.lang.String p0) { return null; }
        public android.service.controls.Control.StatelessBuilder setCustomColor(android.content.res.ColorStateList p0) { return null; }
        public android.service.controls.Control.StatelessBuilder setCustomIcon(android.graphics.drawable.Icon p0) { return null; }
        public android.service.controls.Control.StatelessBuilder setDeviceType(int p0) { return null; }
        public android.service.controls.Control.StatelessBuilder setStructure(java.lang.CharSequence p0) { return null; }
        public android.service.controls.Control.StatelessBuilder setSubtitle(java.lang.CharSequence p0) { return null; }
        public android.service.controls.Control.StatelessBuilder setTitle(java.lang.CharSequence p0) { return null; }
        public android.service.controls.Control.StatelessBuilder setZone(java.lang.CharSequence p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Status {
    }
}
