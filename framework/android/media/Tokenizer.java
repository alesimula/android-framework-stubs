package android.media;

class Tokenizer {
    private static final java.lang.String TAG = "Tokenizer";
    private android.media.Tokenizer.TokenizerPhase mDataTokenizer;
    private int mHandledLen;
    private java.lang.String mLine;
    private android.media.Tokenizer.OnTokenListener mListener;
    private android.media.Tokenizer.TokenizerPhase mPhase;
    private android.media.Tokenizer.TokenizerPhase mTagTokenizer;
    Tokenizer(android.media.Tokenizer.OnTokenListener p0) {}
    void reset() {}
    void tokenize(java.lang.String p0) {}

    class DataTokenizer implements android.media.Tokenizer.TokenizerPhase {
        private java.lang.StringBuilder mData;
        DataTokenizer(android.media.Tokenizer p0) {}
        private boolean replaceEscape(java.lang.String p0, java.lang.String p1, int p2) { return false; }
        public android.media.Tokenizer.TokenizerPhase start() { return null; }
        public void tokenize() {}
    }

    static interface OnTokenListener {
        public void onData(java.lang.String p0);
        public void onEnd(java.lang.String p0);
        public void onLineEnd();
        public void onStart(java.lang.String p0, java.lang.String[] p1, java.lang.String p2);
        public void onTimeStamp(long p0);
    }

    class TagTokenizer implements android.media.Tokenizer.TokenizerPhase {
        private java.lang.String mAnnotation;
        private boolean mAtAnnotation;
        private java.lang.String mName;
        TagTokenizer(android.media.Tokenizer p0) {}
        private void yield_tag() {}
        public android.media.Tokenizer.TokenizerPhase start() { return null; }
        public void tokenize() {}
    }

    static interface TokenizerPhase {
        public android.media.Tokenizer.TokenizerPhase start();
        public void tokenize();
    }
}
