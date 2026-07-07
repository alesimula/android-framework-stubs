package android.widget;

@android.widget.RemoteViews.RemoteView
public class ViewFlipper extends android.widget.ViewAnimator {
    private static final int DEFAULT_INTERVAL = 3000;
    private static final boolean LOGD = Boolean.valueOf(false);
    private static final java.lang.String TAG = "ViewFlipper";
    private boolean mAutoStart;
    private int mFlipInterval;
    private final java.lang.Runnable mFlipRunnable = null;
    private boolean mInhibited;
    private boolean mRunning;
    private boolean mStarted;
    private boolean mVisible;
    public ViewFlipper(android.content.Context p0) { super((android.content.Context)null); }
    public ViewFlipper(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    private void updateRunning() {}
    private void updateRunning(boolean p0) {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public int getFlipInterval() { return 0; }
    public boolean isAutoStart() { return false; }
    public boolean isFlipping() { return false; }
    protected void onAttachedToWindow() {}
    protected void onDetachedFromWindow() {}
    protected void onWindowVisibilityChanged(int p0) {}
    public void setAutoStart(boolean p0) {}
    @android.view.RemotableViewMethod
    public void setFlipInterval(int p0) {}
    public void setInhibited(boolean p0) {}
    public void startFlipping() {}
    public void stopFlipping() {}

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.widget.ViewFlipper> {
        private int mAutoStartId;
        private int mFlipIntervalId;
        private int mFlippingId;
        private boolean mPropertiesMapped;
        public InspectionCompanion() {}
        public void mapProperties(android.view.inspector.PropertyMapper p0) {}
        public void readProperties(android.widget.ViewFlipper p0, android.view.inspector.PropertyReader p1) {}
    }
}
