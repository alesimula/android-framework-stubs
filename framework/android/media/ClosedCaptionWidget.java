package android.media;

abstract class ClosedCaptionWidget extends android.view.ViewGroup implements android.media.SubtitleTrack.RenderingWidget {
    private static final android.view.accessibility.CaptioningManager.CaptionStyle DEFAULT_CAPTION_STYLE = null;
    protected android.view.accessibility.CaptioningManager.CaptionStyle mCaptionStyle;
    private final android.view.accessibility.CaptioningManager.CaptioningChangeListener mCaptioningListener = null;
    protected android.media.ClosedCaptionWidget.ClosedCaptionLayout mClosedCaptionLayout;
    private boolean mHasChangeListener;
    protected android.media.SubtitleTrack.RenderingWidget.OnChangedListener mListener;
    private final android.view.accessibility.CaptioningManager mManager = null;
    public ClosedCaptionWidget(android.content.Context p0) { super((android.content.Context)null); }
    public ClosedCaptionWidget(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public ClosedCaptionWidget(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public ClosedCaptionWidget(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private void manageChangeListener() {}
    public abstract android.media.ClosedCaptionWidget.ClosedCaptionLayout createCaptionLayout(android.content.Context p0);
    public void onAttachedToWindow() {}
    public void onDetachedFromWindow() {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    protected void onMeasure(int p0, int p1) {}
    public void setOnChangedListener(android.media.SubtitleTrack.RenderingWidget.OnChangedListener p0) {}
    public void setSize(int p0, int p1) {}
    public void setVisible(boolean p0) {}

    static interface ClosedCaptionLayout {
        public void setCaptionStyle(android.view.accessibility.CaptioningManager.CaptionStyle p0);
        public void setFontScale(float p0);
    }
}
