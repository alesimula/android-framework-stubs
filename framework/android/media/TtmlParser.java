package android.media;

class TtmlParser {
    private static final int DEFAULT_FRAMERATE = 30;
    private static final int DEFAULT_SUBFRAMERATE = 1;
    private static final int DEFAULT_TICKRATE = 1;
    static final java.lang.String TAG = "TtmlParser";
    private long mCurrentRunId;
    private final android.media.TtmlNodeListener mListener = null;
    private org.xmlpull.v1.XmlPullParser mParser;
    public TtmlParser(android.media.TtmlNodeListener p0) {}
    private void extractAttribute(org.xmlpull.v1.XmlPullParser p0, int p1, java.lang.StringBuilder p2) {}
    private boolean isEndOfDoc() throws org.xmlpull.v1.XmlPullParserException { return false; }
    private static boolean isSupportedTag(java.lang.String p0) { return false; }
    private void loadParser(java.lang.String p0) throws org.xmlpull.v1.XmlPullParserException {}
    private android.media.TtmlNode parseNode(android.media.TtmlNode p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    private void parseTtml() throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public void parse(java.lang.String p0, long p1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
}
