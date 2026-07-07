package android.widget;

@android.widget.RemoteViews.RemoteView
public class Chronometer extends android.widget.TextView {
    private static final int HOUR_IN_SEC = 3600;
    private static final int MIN_IN_SEC = 60;
    private static final long SIGNIFICANT_DRIFT_MILLIS = 500L;
    private static final java.lang.String TAG = "Chronometer";
    private long mBase;
    private java.time.Instant mBaseInstant;
    private boolean mCountDown;
    private final java.util.function.LongSupplier mElapsedRealtimeClock = null;
    private java.lang.String mFormat;
    private java.lang.StringBuilder mFormatBuilder;
    private java.util.Formatter mFormatter;
    private java.lang.Object[] mFormatterArgs;
    private java.util.Locale mFormatterLocale;
    private boolean mLogged;
    private boolean mLowFrequency;
    private long mNow;
    private android.widget.Chronometer.OnChronometerTickListener mOnChronometerTickListener;
    private java.time.Duration mPausedDuration;
    private java.lang.StringBuilder mRecycle;
    private boolean mRunning;
    private boolean mStarted;
    private final java.time.InstantSource mSystemClock = null;
    private final java.lang.Runnable mTickRunnable = null;
    private boolean mUseAdaptiveFormat;
    private boolean mVisible;
    public Chronometer(android.content.Context p0) { super((android.content.Context)null); }
    public Chronometer(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public Chronometer(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public Chronometer(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public Chronometer(android.content.Context p0, java.util.function.LongSupplier p1, java.time.InstantSource p2, android.util.AttributeSet p3, int p4, int p5) { super((android.content.Context)null); }
    private java.lang.String applyFormat(java.lang.String p0) { return null; }
    private static java.lang.String formatDuration(long p0) { return null; }
    private void init() {}
    private long instantToElapsedRealtime(java.time.Instant p0) { return 0L; }
    private void postTickOnNextChange() {}
    private java.util.ArrayList<java.lang.String> secondsToString(long p0) { return null; }
    private void updateAll(boolean p0) {}
    private void updateBaseTimeIfSystemClockChanged() {}
    private void updateRunning() {}
    private void updateText(long p0) {}
    private void updateTextLegacy(long p0) {}
    void dispatchChronometerTick() {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public long getBase() { return 0L; }
    public java.lang.CharSequence getContentDescription() { return null; }
    public java.lang.String getFormat() { return null; }
    public android.widget.Chronometer.OnChronometerTickListener getOnChronometerTickListener() { return null; }
    public boolean isCountDown() { return false; }
    public boolean isTheFinalCountDown() { return false; }
    public boolean isUseAdaptiveFormat() { return false; }
    protected void onDetachedFromWindow() {}
    protected void onVisibilityChanged(android.view.View p0, int p1) {}
    protected void onWindowVisibilityChanged(int p0) {}
    @android.view.RemotableViewMethod
    public void setBase(long p0) {}
    @android.view.RemotableViewMethod
    public void setBase(java.time.Instant p0) {}
    protected void setChronometerText(java.util.List<java.lang.String> p0) {}
    @android.view.RemotableViewMethod
    public void setCountDown(boolean p0) {}
    @android.view.RemotableViewMethod
    public void setFormat(java.lang.String p0) {}
    @android.view.RemotableViewMethod
    public void setLowFrequency(boolean p0) {}
    public void setOnChronometerTickListener(android.widget.Chronometer.OnChronometerTickListener p0) {}
    @android.view.RemotableViewMethod
    public void setPausedDuration(java.time.Duration p0) {}
    @android.view.RemotableViewMethod
    public void setStarted(boolean p0) {}
    @android.view.RemotableViewMethod
    public void setUseAdaptiveFormat(boolean p0) {}
    public void start() {}
    public void stop() {}
    public void updateText() {}

    public static interface OnChronometerTickListener {
        public void onChronometerTick(android.widget.Chronometer p0);
    }

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.widget.Chronometer> {
        private int mCountDownId;
        private int mFormatId;
        private boolean mPropertiesMapped;
        public InspectionCompanion() {}
        public void mapProperties(android.view.inspector.PropertyMapper p0) {}
        public void readProperties(android.widget.Chronometer p0, android.view.inspector.PropertyReader p1) {}
    }
}
