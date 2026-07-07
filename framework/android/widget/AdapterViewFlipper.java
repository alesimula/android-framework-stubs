package android.widget;

@android.widget.RemoteViews.RemoteView
public class AdapterViewFlipper extends android.widget.AdapterViewAnimator {
    private static final int DEFAULT_INTERVAL = 10000;
    private static final boolean LOGD = false;
    private static final java.lang.String TAG = "ViewFlipper";
    private boolean mAdvancedByHost;
    private boolean mAutoStart;
    private int mFlipInterval;
    private final java.lang.Runnable mFlipRunnable = null;
    private boolean mRunning;
    private boolean mStarted;
    private boolean mVisible;
    public AdapterViewFlipper(android.content.Context p0) { super((android.content.Context)null); }
    public AdapterViewFlipper(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public AdapterViewFlipper(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public AdapterViewFlipper(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private void updateRunning() {}
    private void updateRunning(boolean p0) {}
    public void fyiWillBeAdvancedByHostKThx() {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public int getFlipInterval() { return 0; }
    public boolean isAutoStart() { return false; }
    public boolean isFlipping() { return false; }
    protected void onAttachedToWindow() {}
    protected void onDetachedFromWindow() {}
    protected void onWindowVisibilityChanged(int p0) {}
    public void setAdapter(android.widget.Adapter p0) {}
    public void setAutoStart(boolean p0) {}
    public void setFlipInterval(int p0) {}
    @android.view.RemotableViewMethod
    public void showNext() {}
    @android.view.RemotableViewMethod
    public void showPrevious() {}
    public void startFlipping() {}
    public void stopFlipping() {}
}
