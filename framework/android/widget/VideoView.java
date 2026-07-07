package android.widget;

public class VideoView extends android.view.SurfaceView implements android.widget.MediaController.MediaPlayerControl, android.media.SubtitleController.Anchor {
    private static final int STATE_ERROR = -1;
    private static final int STATE_IDLE = 0;
    private static final int STATE_PAUSED = 4;
    private static final int STATE_PLAYBACK_COMPLETED = 5;
    private static final int STATE_PLAYING = 3;
    private static final int STATE_PREPARED = 2;
    private static final int STATE_PREPARING = 1;
    private static final java.lang.String TAG = "VideoView";
    private android.media.AudioAttributes mAudioAttributes;
    private int mAudioFocusType;
    private android.media.AudioManager mAudioManager;
    private int mAudioSession;
    private android.media.MediaPlayer.OnBufferingUpdateListener mBufferingUpdateListener;
    private boolean mCanPause;
    private boolean mCanSeekBack;
    private boolean mCanSeekForward;
    private android.media.MediaPlayer.OnCompletionListener mCompletionListener;
    private int mCurrentBufferPercentage;
    private int mCurrentState;
    private android.media.MediaPlayer.OnErrorListener mErrorListener;
    private java.util.Map<java.lang.String, java.lang.String> mHeaders;
    private android.media.MediaPlayer.OnInfoListener mInfoListener;
    private android.widget.MediaController mMediaController;
    private android.media.MediaPlayer mMediaPlayer;
    private android.media.MediaPlayer.OnCompletionListener mOnCompletionListener;
    private android.media.MediaPlayer.OnErrorListener mOnErrorListener;
    private android.media.MediaPlayer.OnInfoListener mOnInfoListener;
    private android.media.MediaPlayer.OnPreparedListener mOnPreparedListener;
    private final java.util.Vector<android.util.Pair<java.io.InputStream, android.media.MediaFormat>> mPendingSubtitleTracks = null;
    android.media.MediaPlayer.OnPreparedListener mPreparedListener;
    android.view.SurfaceHolder.Callback mSHCallback;
    private int mSeekWhenPrepared;
    android.media.MediaPlayer.OnVideoSizeChangedListener mSizeChangedListener;
    private android.media.SubtitleTrack.RenderingWidget mSubtitleWidget;
    private android.media.SubtitleTrack.RenderingWidget.OnChangedListener mSubtitlesChangedListener;
    private int mSurfaceHeight;
    private android.view.SurfaceHolder mSurfaceHolder;
    private int mSurfaceWidth;
    private int mTargetState;
    private android.net.Uri mUri;
    private int mVideoHeight;
    private int mVideoWidth;
    public VideoView(android.content.Context p0) { super((android.content.Context)null); }
    public VideoView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public VideoView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public VideoView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private void attachMediaController() {}
    private boolean isInPlaybackState() { return false; }
    private void measureAndLayoutSubtitleWidget() {}
    private void openVideo() {}
    private void release(boolean p0) {}
    private void toggleMediaControlsVisiblity() {}
    public void addSubtitleSource(java.io.InputStream p0, android.media.MediaFormat p1) {}
    public boolean canPause() { return false; }
    public boolean canSeekBackward() { return false; }
    public boolean canSeekForward() { return false; }
    public void draw(android.graphics.Canvas p0) {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public int getAudioSessionId() { return 0; }
    public int getBufferPercentage() { return 0; }
    public int getCurrentPosition() { return 0; }
    public int getDuration() { return 0; }
    public android.os.Looper getSubtitleLooper() { return null; }
    public boolean isPlaying() { return false; }
    protected void onAttachedToWindow() {}
    protected void onDetachedFromWindow() {}
    public boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    protected void onMeasure(int p0, int p1) {}
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean onTrackballEvent(android.view.MotionEvent p0) { return false; }
    public void pause() {}
    public int resolveAdjustedSize(int p0, int p1) { return 0; }
    public void resume() {}
    public void seekTo(int p0) {}
    public void setAudioAttributes(android.media.AudioAttributes p0) {}
    public void setAudioFocusRequest(int p0) {}
    public void setMediaController(android.widget.MediaController p0) {}
    public void setOnCompletionListener(android.media.MediaPlayer.OnCompletionListener p0) {}
    public void setOnErrorListener(android.media.MediaPlayer.OnErrorListener p0) {}
    public void setOnInfoListener(android.media.MediaPlayer.OnInfoListener p0) {}
    public void setOnPreparedListener(android.media.MediaPlayer.OnPreparedListener p0) {}
    public void setSubtitleWidget(android.media.SubtitleTrack.RenderingWidget p0) {}
    public void setVideoPath(java.lang.String p0) {}
    public void setVideoURI(android.net.Uri p0) {}
    public void setVideoURI(android.net.Uri p0, java.util.Map<java.lang.String, java.lang.String> p1) {}
    public void start() {}
    public void stopPlayback() {}
    public void suspend() {}
}
