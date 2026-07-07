package android.media;

public class SubtitleController {
    static final boolean $assertionsDisabled = false;
    private static final int WHAT_HIDE = 2;
    private static final int WHAT_SELECT_DEFAULT_TRACK = 4;
    private static final int WHAT_SELECT_TRACK = 3;
    private static final int WHAT_SHOW = 1;
    private android.media.SubtitleController.Anchor mAnchor;
    private final android.os.Handler.Callback mCallback = null;
    private android.view.accessibility.CaptioningManager.CaptioningChangeListener mCaptioningChangeListener;
    private android.view.accessibility.CaptioningManager mCaptioningManager;
    private android.os.Handler mHandler;
    private android.media.SubtitleController.Listener mListener;
    private java.util.Vector<android.media.SubtitleController.Renderer> mRenderers;
    private android.media.SubtitleTrack mSelectedTrack;
    private boolean mShowing;
    private android.media.MediaTimeProvider mTimeProvider;
    private boolean mTrackIsExplicit;
    private java.util.Vector<android.media.SubtitleTrack> mTracks;
    private boolean mVisibilityIsExplicit;
    public SubtitleController(android.content.Context p0, android.media.MediaTimeProvider p1, android.media.SubtitleController.Listener p2) {}
    private void checkAnchorLooper() {}
    private void doHide() {}
    private void doSelectDefaultTrack() {}
    private void doSelectTrack(android.media.SubtitleTrack p0) {}
    private void doShow() {}
    private android.media.SubtitleTrack.RenderingWidget getRenderingWidget() { return null; }
    private void processOnAnchor(android.os.Message p0) {}
    public android.media.SubtitleTrack addTrack(android.media.MediaFormat p0) { return null; }
    protected void finalize() throws java.lang.Throwable {}
    public android.media.SubtitleTrack getDefaultTrack() { return null; }
    public android.media.SubtitleTrack getSelectedTrack() { return null; }
    public android.media.SubtitleTrack[] getTracks() { return null; }
    public boolean hasRendererFor(android.media.MediaFormat p0) { return false; }
    public void hide() {}
    public void registerRenderer(android.media.SubtitleController.Renderer p0) {}
    public void reset() {}
    public void selectDefaultTrack() {}
    public boolean selectTrack(android.media.SubtitleTrack p0) { return false; }
    public void setAnchor(android.media.SubtitleController.Anchor p0) {}
    public void show() {}

    public static interface Anchor {
        public android.os.Looper getSubtitleLooper();
        public void setSubtitleWidget(android.media.SubtitleTrack.RenderingWidget p0);
    }

    public static interface Listener {
        public void onSubtitleTrackSelected(android.media.SubtitleTrack p0);
    }

    public static abstract class Renderer {
        public Renderer() {}
        public abstract android.media.SubtitleTrack createTrack(android.media.MediaFormat p0);
        public abstract boolean supports(android.media.MediaFormat p0);
    }
}
