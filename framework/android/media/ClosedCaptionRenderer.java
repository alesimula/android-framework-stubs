package android.media;

public class ClosedCaptionRenderer extends android.media.SubtitleController.Renderer {
    private android.media.Cea608CCWidget mCCWidget;
    private final android.content.Context mContext = null;
    public ClosedCaptionRenderer(android.content.Context p0) { super(); }
    public android.media.SubtitleTrack createTrack(android.media.MediaFormat p0) { return null; }
    public boolean supports(android.media.MediaFormat p0) { return false; }
}
