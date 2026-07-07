package android.media;

class WebVttParser {
    private static final java.lang.String TAG = "WebVttParser";
    private java.lang.String mBuffer;
    private android.media.TextTrackCue mCue;
    private java.util.Vector<java.lang.String> mCueTexts;
    private android.media.WebVttCueListener mListener;
    private final android.media.WebVttParser.Phase mParseCueId = null;
    private final android.media.WebVttParser.Phase mParseCueText = null;
    private final android.media.WebVttParser.Phase mParseCueTime = null;
    private final android.media.WebVttParser.Phase mParseHeader = null;
    private final android.media.WebVttParser.Phase mParseStart = null;
    private android.media.WebVttParser.Phase mPhase;
    private final android.media.WebVttParser.Phase mSkipRest = null;
    WebVttParser(android.media.WebVttCueListener p0) {}
    private void log_warning(java.lang.String p0, java.lang.String p1) {}
    private void log_warning(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) {}
    private void log_warning(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) {}
    public static float parseFloatPercentage(java.lang.String p0) throws java.lang.NumberFormatException { return 0.0f; }
    public static int parseIntPercentage(java.lang.String p0) throws java.lang.NumberFormatException { return 0; }
    public static long parseTimestampMs(java.lang.String p0) throws java.lang.NumberFormatException { return 0L; }
    public static java.lang.String timeToString(long p0) { return null; }
    public void eos() {}
    public void parse(java.lang.String p0) {}
    public void yieldCue() {}

    static interface Phase {
        public void parse(java.lang.String p0);
    }
}
