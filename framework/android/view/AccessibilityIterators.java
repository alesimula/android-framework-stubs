package android.view;

public final class AccessibilityIterators {
    public AccessibilityIterators() {}

    public static abstract class AbstractTextSegmentIterator implements android.view.AccessibilityIterators.TextSegmentIterator {
        private final int[] mSegment = null;
        protected java.lang.String mText;
        public AbstractTextSegmentIterator() {}
        protected int[] getRange(int p0, int p1) { return null; }
        public void initialize(java.lang.String p0) {}
    }

    static class CharacterTextSegmentIterator extends android.view.AccessibilityIterators.AbstractTextSegmentIterator implements android.view.ViewRootImpl.ConfigChangedCallback {
        private static android.view.AccessibilityIterators.CharacterTextSegmentIterator sInstance;
        protected java.text.BreakIterator mImpl;
        private java.util.Locale mLocale;
        private CharacterTextSegmentIterator(java.util.Locale p0) { super(); }
        public static android.view.AccessibilityIterators.CharacterTextSegmentIterator getInstance(java.util.Locale p0) { return null; }
        public int[] following(int p0) { return null; }
        public void initialize(java.lang.String p0) {}
        public void onConfigurationChanged(android.content.res.Configuration p0) {}
        protected void onLocaleChanged(java.util.Locale p0) {}
        public int[] preceding(int p0) { return null; }
    }

    static class ParagraphTextSegmentIterator extends android.view.AccessibilityIterators.AbstractTextSegmentIterator {
        private static android.view.AccessibilityIterators.ParagraphTextSegmentIterator sInstance;
        ParagraphTextSegmentIterator() { super(); }
        public static android.view.AccessibilityIterators.ParagraphTextSegmentIterator getInstance() { return null; }
        private boolean isEndBoundary(int p0) { return false; }
        private boolean isStartBoundary(int p0) { return false; }
        public int[] following(int p0) { return null; }
        public int[] preceding(int p0) { return null; }
    }

    public static interface TextSegmentIterator {
        public int[] following(int p0);
        public int[] preceding(int p0);
    }

    static class WordTextSegmentIterator extends android.view.AccessibilityIterators.CharacterTextSegmentIterator {
        private static android.view.AccessibilityIterators.WordTextSegmentIterator sInstance;
        private WordTextSegmentIterator(java.util.Locale p0) { super(null); }
        public static android.view.AccessibilityIterators.WordTextSegmentIterator getInstance(java.util.Locale p0) { return null; }
        private boolean isEndBoundary(int p0) { return false; }
        private boolean isLetterOrDigit(int p0) { return false; }
        private boolean isStartBoundary(int p0) { return false; }
        public int[] following(int p0) { return null; }
        protected void onLocaleChanged(java.util.Locale p0) {}
        public int[] preceding(int p0) { return null; }
    }
}
