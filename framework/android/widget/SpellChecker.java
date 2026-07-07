package android.widget;

public class SpellChecker implements android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener {
    public static final int AVERAGE_WORD_LENGTH = 7;
    private static final boolean DBG = false;
    public static final int MAX_NUMBER_OF_WORDS = 50;
    private static final int MAX_SENTENCE_LENGTH = 350;
    private static final int SPELL_PAUSE_DURATION = 400;
    private static final java.lang.String TAG = null;
    private static final int USE_SPAN_RANGE = -1;
    public static final int WORD_ITERATOR_INTERVAL = 350;
    final int mCookie = 0;
    private java.util.Locale mCurrentLocale;
    private int[] mIds;
    private int mLength;
    private android.widget.SpellChecker.SentenceIteratorWrapper mSentenceIterator;
    private int mSpanSequenceCounter;
    private android.text.style.SpellCheckSpan[] mSpellCheckSpans;
    android.view.textservice.SpellCheckerSession mSpellCheckerSession;
    private android.widget.SpellChecker.SpellParser[] mSpellParsers;
    private java.lang.Runnable mSpellRunnable;
    private android.view.textservice.TextServicesManager mTextServicesManager;
    private final android.widget.TextView mTextView = null;
    public SpellChecker(android.widget.TextView p0) {}
    private void addSpellCheckSpan(android.text.Editable p0, int p1, int p2) {}
    private void createMisspelledSuggestionSpan(android.text.Editable p0, android.view.textservice.SuggestionsInfo p1, android.text.style.SpellCheckSpan p2, int p3, int p4) {}
    private android.util.Range<java.lang.Integer> detectSentenceBoundary(java.lang.CharSequence p0, int p1, int p2) { return null; }
    private static int findSeparator(java.lang.CharSequence p0, int p1, int p2) { return 0; }
    public static boolean haveWordBoundariesChanged(android.text.Editable p0, int p1, int p2, int p3, int p4) { return false; }
    private static boolean isSeparator(int p0) { return false; }
    private boolean isSessionActive() { return false; }
    private int nextSpellCheckSpanIndex() { return 0; }
    private android.text.style.SpellCheckSpan onGetSuggestionsInternal(android.view.textservice.SuggestionsInfo p0, int p1, int p2) { return null; }
    private static boolean removeErrorSuggestionSpan(android.text.Editable p0, int p1, int p2, android.widget.SpellChecker.RemoveReason p3) { return false; }
    private int roundUpToWordStart(java.lang.CharSequence p0, int p1, int p2) { return 0; }
    private void scheduleNewSpellCheck() {}
    private void setLocale(java.util.Locale p0) {}
    private void spellCheck() {}
    private void spellCheck(boolean p0) {}
    public void closeSession() {}
    public void onGetSentenceSuggestions(android.view.textservice.SentenceSuggestionsInfo[] p0) {}
    public void onGetSuggestions(android.view.textservice.SuggestionsInfo[] p0) {}
    void onPerformSpellCheck() {}
    public void onSelectionChanged() {}
    public void onSpellCheckSpanRemoved(android.text.style.SpellCheckSpan p0) {}
    void resetSession() {}
    public void spellCheck(int p0, int p1) {}
    public void spellCheck(int p0, int p1, boolean p2) {}

    private static enum RemoveReason {
        OBSOLETE,
        REPLACE;
        private static final android.widget.SpellChecker.RemoveReason[] $VALUES = null;
        private RemoveReason() {}
    }

    private static class SentenceIteratorWrapper {
        private int mEndOffset;
        private java.text.BreakIterator mSentenceIterator;
        private int mStartOffset;
        SentenceIteratorWrapper(java.text.BreakIterator p0) {}
        public int following(int p0) { return 0; }
        public boolean isBoundary(int p0) { return false; }
        public int preceding(int p0) { return 0; }
        public void setCharSequence(java.lang.CharSequence p0, int p1, int p2) {}
    }

    private class SpellParser {
        private boolean mForceCheckWhenEditingWord;
        private java.lang.Object mRange;
        private SpellParser(android.widget.SpellChecker p0) {}
        private void removeRangeSpan(android.text.Editable p0) {}
        private <T extends java.lang.Object> void removeSpansAt(android.text.Editable p0, int p1, T[] p2) {}
        private void setRangeSpan(android.text.Editable p0, int p1, int p2) {}
        public boolean isFinished() { return false; }
        public void parse() {}
        public void parse(int p0, int p1, boolean p2) {}
        public void stop() {}
    }
}
