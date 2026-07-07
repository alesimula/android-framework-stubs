package com.android.internal.widget;

@android.widget.RemoteViews.RemoteView
public class TextProgressBar extends android.widget.RelativeLayout implements android.widget.Chronometer.OnChronometerTickListener {
    static final int CHRONOMETER_ID = 16908308;
    static final int PROGRESSBAR_ID = 16908301;
    public static final java.lang.String TAG = "TextProgressBar";
    android.widget.Chronometer mChronometer;
    boolean mChronometerFollow;
    int mChronometerGravity;
    int mDuration;
    long mDurationBase;
    android.widget.ProgressBar mProgressBar;
    public TextProgressBar(android.content.Context p0) { super((android.content.Context)null); }
    public TextProgressBar(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public TextProgressBar(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public TextProgressBar(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public void addView(android.view.View p0, int p1, android.view.ViewGroup.LayoutParams p2) {}
    public void onChronometerTick(android.widget.Chronometer p0) {}
    @android.view.RemotableViewMethod
    public void setDurationBase(long p0) {}
}
