package android.media;

class UnstyledTextExtractor implements android.media.Tokenizer.OnTokenListener {
    java.util.Vector<android.media.TextTrackCueSpan> mCurrentLine;
    long mLastTimestamp;
    java.lang.StringBuilder mLine;
    java.util.Vector<android.media.TextTrackCueSpan[]> mLines;
    UnstyledTextExtractor() {}
    private void init() {}
    public android.media.TextTrackCueSpan[][] getText() { return null; }
    public void onData(java.lang.String p0) {}
    public void onEnd(java.lang.String p0) {}
    public void onLineEnd() {}
    public void onStart(java.lang.String p0, java.lang.String[] p1, java.lang.String p2) {}
    public void onTimeStamp(long p0) {}
}
