package android.widget;

public class MediaController extends android.widget.FrameLayout {
    private static final int sDefaultTimeout = 3000;
    private final android.view.accessibility.AccessibilityManager mAccessibilityManager = null;
    private android.view.View mAnchor;
    private final android.view.View.OnAttachStateChangeListener mAttachStateListener = null;
    private final android.window.OnBackInvokedCallback mBackCallback = null;
    private boolean mBackCallbackRegistered;
    private final android.content.Context mContext = null;
    private android.widget.TextView mCurrentTime;
    private android.view.View mDecor;
    private android.view.WindowManager.LayoutParams mDecorLayoutParams;
    private boolean mDragging;
    private android.widget.TextView mEndTime;
    private final java.lang.Runnable mFadeOut = null;
    private android.widget.ImageButton mFfwdButton;
    private final android.view.View.OnClickListener mFfwdListener = null;
    java.lang.StringBuilder mFormatBuilder;
    java.util.Formatter mFormatter;
    private boolean mFromXml;
    private final android.view.View.OnLayoutChangeListener mLayoutChangeListener = null;
    private boolean mListenersSet;
    private android.widget.ImageButton mNextButton;
    private android.view.View.OnClickListener mNextListener;
    private android.widget.ImageButton mPauseButton;
    private java.lang.CharSequence mPauseDescription;
    private final android.view.View.OnClickListener mPauseListener = null;
    private java.lang.CharSequence mPlayDescription;
    private android.widget.MediaController.MediaPlayerControl mPlayer;
    private android.widget.ImageButton mPrevButton;
    private android.view.View.OnClickListener mPrevListener;
    private android.widget.ProgressBar mProgress;
    private android.widget.ImageButton mRewButton;
    private final android.view.View.OnClickListener mRewListener = null;
    private android.view.View mRoot;
    private final android.widget.SeekBar.OnSeekBarChangeListener mSeekListener = null;
    private final java.lang.Runnable mShowProgress = null;
    private boolean mShowing;
    private final android.view.View.OnTouchListener mTouchListener = null;
    private final boolean mUseFastForward = false;
    private android.view.Window mWindow;
    private android.view.WindowManager mWindowManager;
    public MediaController(android.content.Context p0) { super((android.content.Context)null); }
    public MediaController(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public MediaController(android.content.Context p0, boolean p1) { super((android.content.Context)null); }
    private void disableUnsupportedButtons() {}
    private void doPauseResume() {}
    private void initControllerView(android.view.View p0) {}
    private void initFloatingWindow() {}
    private void initFloatingWindowLayout() {}
    private void installPrevNextListeners() {}
    private void registerOnBackInvokedCallback() {}
    private int setProgress() { return 0; }
    private java.lang.String stringForTime(int p0) { return null; }
    private void unregisterOnBackInvokedCallback() {}
    private void updateFloatingWindowLayout() {}
    private void updatePausePlay() {}
    public boolean dispatchKeyEvent(android.view.KeyEvent p0) { return false; }
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public void hide() {}
    public boolean isShowing() { return false; }
    protected android.view.View makeControllerView() { return null; }
    public void onFinishInflate() {}
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean onTrackballEvent(android.view.MotionEvent p0) { return false; }
    public void setAnchorView(android.view.View p0) {}
    public void setEnabled(boolean p0) {}
    public void setMediaPlayer(android.widget.MediaController.MediaPlayerControl p0) {}
    public void setPrevNextListeners(android.view.View.OnClickListener p0, android.view.View.OnClickListener p1) {}
    public void show() {}
    public void show(int p0) {}

    public static interface MediaPlayerControl {
        public boolean canPause();
        public boolean canSeekBackward();
        public boolean canSeekForward();
        public int getAudioSessionId();
        public int getBufferPercentage();
        public int getCurrentPosition();
        public int getDuration();
        public boolean isPlaying();
        public void pause();
        public void seekTo(int p0);
        public void start();
    }
}
