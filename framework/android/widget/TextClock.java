package android.widget;

@android.widget.RemoteViews.RemoteView
public class TextClock extends android.widget.TextView {
    @java.lang.Deprecated
    public static final java.lang.CharSequence DEFAULT_FORMAT_12_HOUR = null;
    @java.lang.Deprecated
    public static final java.lang.CharSequence DEFAULT_FORMAT_24_HOUR = null;
    private android.widget.TextClock.ClockEventDelegate mClockEventDelegate;
    private java.lang.CharSequence mDescFormat;
    private java.lang.CharSequence mDescFormat12;
    private java.lang.CharSequence mDescFormat24;
    @android.view.ViewDebug.ExportedProperty
    private java.lang.CharSequence mFormat;
    private java.lang.CharSequence mFormat12;
    private java.lang.CharSequence mFormat24;
    private android.database.ContentObserver mFormatChangeObserver;
    @android.view.ViewDebug.ExportedProperty
    private boolean mHasSeconds;
    private final android.content.BroadcastReceiver mIntentReceiver = null;
    private boolean mRegistered;
    private boolean mShouldRunTicker;
    private boolean mShowCurrentUserTime;
    private boolean mStopTicking;
    private final java.lang.Runnable mTicker = null;
    private java.util.Calendar mTime;
    private java.lang.String mTimeZone;
    public TextClock(android.content.Context p0) { super((android.content.Context)null); }
    public TextClock(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public TextClock(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public TextClock(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private static java.lang.CharSequence abc(java.lang.CharSequence p0, java.lang.CharSequence p1, java.lang.CharSequence p2) { return null; }
    private void chooseFormat() {}
    private void createTime(java.lang.String p0) {}
    private java.lang.String getBestDateTimePattern(java.lang.String p0) { return null; }
    private void init() {}
    private void onTimeChanged() {}
    private void registerObserver() {}
    private void unregisterObserver() {}
    public void disableClockTick() {}
    protected void encodeProperties(android.view.ViewHierarchyEncoder p0) {}
    public java.lang.CharSequence getFormat() { return null; }
    @android.view.ViewDebug.ExportedProperty
    public java.lang.CharSequence getFormat12Hour() { return null; }
    @android.view.ViewDebug.ExportedProperty
    public java.lang.CharSequence getFormat24Hour() { return null; }
    public java.lang.String getTimeZone() { return null; }
    public boolean is24HourModeEnabled() { return false; }
    protected void onAttachedToWindow() {}
    protected void onDetachedFromWindow() {}
    public void onVisibilityAggregated(boolean p0) {}
    public void refreshTime() {}
    public void setClockEventDelegate(android.widget.TextClock.ClockEventDelegate p0) {}
    public void setContentDescriptionFormat12Hour(java.lang.CharSequence p0) {}
    public void setContentDescriptionFormat24Hour(java.lang.CharSequence p0) {}
    @android.view.RemotableViewMethod
    public void setFormat12Hour(java.lang.CharSequence p0) {}
    @android.view.RemotableViewMethod
    public void setFormat24Hour(java.lang.CharSequence p0) {}
    public void setShowCurrentUserTime(boolean p0) {}
    @android.view.RemotableViewMethod
    public void setTimeZone(java.lang.String p0) {}

    public static class ClockEventDelegate {
        private final android.content.Context mContext = null;
        public ClockEventDelegate(android.content.Context p0) {}
        public void registerFormatChangeObserver(android.database.ContentObserver p0, int p1) {}
        public void registerTimeChangeReceiver(android.content.BroadcastReceiver p0, android.os.Handler p1) {}
        public void unregisterFormatChangeObserver(android.database.ContentObserver p0) {}
        public void unregisterTimeChangeReceiver(android.content.BroadcastReceiver p0) {}
    }

    private class FormatChangeObserver extends android.database.ContentObserver {
        public FormatChangeObserver(android.widget.TextClock p0, android.os.Handler p1) { super((android.os.Handler)null); }
        public void onChange(boolean p0) {}
        public void onChange(boolean p0, android.net.Uri p1) {}
    }

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.widget.TextClock> {
        private int mFormat12HourId;
        private int mFormat24HourId;
        private int mIs24HourModeEnabledId;
        private boolean mPropertiesMapped;
        private int mTimeZoneId;
        public InspectionCompanion() {}
        public void mapProperties(android.view.inspector.PropertyMapper p0) {}
        public void readProperties(android.widget.TextClock p0, android.view.inspector.PropertyReader p1) {}
    }
}
