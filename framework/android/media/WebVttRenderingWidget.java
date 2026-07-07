package android.media;

class WebVttRenderingWidget extends android.view.ViewGroup implements android.media.SubtitleTrack.RenderingWidget {
    private static final boolean DEBUG = false;
    private static final int DEBUG_CUE_BACKGROUND = -2130771968;
    private static final int DEBUG_REGION_BACKGROUND = -2147483393;
    private static final android.view.accessibility.CaptioningManager.CaptionStyle DEFAULT_CAPTION_STYLE = null;
    private static final float LINE_HEIGHT_RATIO = 0.053300000727176666f;
    private android.view.accessibility.CaptioningManager.CaptionStyle mCaptionStyle;
    private final android.view.accessibility.CaptioningManager.CaptioningChangeListener mCaptioningListener = null;
    private final android.util.ArrayMap<android.media.TextTrackCue, android.media.WebVttRenderingWidget.CueLayout> mCueBoxes = null;
    private float mFontSize;
    private boolean mHasChangeListener;
    private android.media.SubtitleTrack.RenderingWidget.OnChangedListener mListener;
    private final android.view.accessibility.CaptioningManager mManager = null;
    private final android.util.ArrayMap<android.media.TextTrackRegion, android.media.WebVttRenderingWidget.RegionLayout> mRegionBoxes = null;
    public WebVttRenderingWidget(android.content.Context p0) { super((android.content.Context)null); }
    public WebVttRenderingWidget(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public WebVttRenderingWidget(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public WebVttRenderingWidget(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private int calculateLinePosition(android.media.WebVttRenderingWidget.CueLayout p0) { return 0; }
    private void layoutCue(int p0, int p1, android.media.WebVttRenderingWidget.CueLayout p2) {}
    private void layoutRegion(int p0, int p1, android.media.WebVttRenderingWidget.RegionLayout p2) {}
    private void manageChangeListener() {}
    private void prepForPrune() {}
    private void prune() {}
    private static int resolveCueAlignment(int p0, int p1) { return 0; }
    private void setCaptionStyle(android.view.accessibility.CaptioningManager.CaptionStyle p0, float p1) {}
    public void onAttachedToWindow() {}
    public void onDetachedFromWindow() {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    protected void onMeasure(int p0, int p1) {}
    public void setActiveCues(java.util.Vector<android.media.SubtitleTrack.Cue> p0) {}
    public void setOnChangedListener(android.media.SubtitleTrack.RenderingWidget.OnChangedListener p0) {}
    public void setSize(int p0, int p1) {}
    public void setVisible(boolean p0) {}

    private static class CueLayout extends android.widget.LinearLayout {
        private boolean mActive;
        private android.view.accessibility.CaptioningManager.CaptionStyle mCaptionStyle;
        public final android.media.TextTrackCue mCue = null;
        private float mFontSize;
        private int mOrder;
        public CueLayout(android.content.Context p0, android.media.TextTrackCue p1, android.view.accessibility.CaptioningManager.CaptionStyle p2, float p3) { super((android.content.Context)null); }
        public android.media.TextTrackCue getCue() { return null; }
        public boolean isActive() { return false; }
        public void measureForParent(int p0, int p1) {}
        protected void onMeasure(int p0, int p1) {}
        public void prepForPrune() {}
        public void setCaptionStyle(android.view.accessibility.CaptioningManager.CaptionStyle p0, float p1) {}
        public void setOrder(int p0) {}
        public void update() {}
    }

    private static class RegionLayout extends android.widget.LinearLayout {
        private android.view.accessibility.CaptioningManager.CaptionStyle mCaptionStyle;
        private float mFontSize;
        private final android.media.TextTrackRegion mRegion = null;
        private final java.util.ArrayList<android.media.WebVttRenderingWidget.CueLayout> mRegionCueBoxes = null;
        public RegionLayout(android.content.Context p0, android.media.TextTrackRegion p1, android.view.accessibility.CaptioningManager.CaptionStyle p2, float p3) { super((android.content.Context)null); }
        public android.media.TextTrackRegion getRegion() { return null; }
        public void measureForParent(int p0, int p1) {}
        public void prepForPrune() {}
        public boolean prune() { return false; }
        public void put(android.media.TextTrackCue p0) {}
        public void setCaptionStyle(android.view.accessibility.CaptioningManager.CaptionStyle p0, float p1) {}
    }

    private static class SpanLayout extends com.android.internal.widget.SubtitleView {
        private final android.text.SpannableStringBuilder mBuilder = null;
        private final android.media.TextTrackCueSpan[] mSpans = null;
        public SpanLayout(android.content.Context p0, android.media.TextTrackCueSpan[] p1) { super((android.content.Context)null); }
        public void setCaptionStyle(android.view.accessibility.CaptioningManager.CaptionStyle p0, float p1) {}
        public void update() {}
    }
}
