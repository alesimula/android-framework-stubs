package android.widget;

final class AccessibilityIterators {
    AccessibilityIterators() {}

    static class LineTextSegmentIterator extends android.view.AccessibilityIterators.AbstractTextSegmentIterator {
        protected static final int DIRECTION_END = 1;
        protected static final int DIRECTION_START = -1;
        private static android.widget.AccessibilityIterators.LineTextSegmentIterator sLineInstance;
        protected android.text.Layout mLayout;
        LineTextSegmentIterator() { super(); }
        public static android.widget.AccessibilityIterators.LineTextSegmentIterator getInstance() { return null; }
        public int[] following(int p0) { return null; }
        protected int getLineEdgeIndex(int p0, int p1) { return 0; }
        public void initialize(android.text.Spannable p0, android.text.Layout p1) {}
        public int[] preceding(int p0) { return null; }
    }

    static class PageTextSegmentIterator extends android.widget.AccessibilityIterators.LineTextSegmentIterator {
        private static android.widget.AccessibilityIterators.PageTextSegmentIterator sPageInstance;
        private final android.graphics.Rect mTempRect = null;
        private android.widget.TextView mView;
        PageTextSegmentIterator() { super(); }
        public static android.widget.AccessibilityIterators.PageTextSegmentIterator getInstance() { return null; }
        public int[] following(int p0) { return null; }
        public void initialize(android.widget.TextView p0) {}
        public int[] preceding(int p0) { return null; }
    }
}
