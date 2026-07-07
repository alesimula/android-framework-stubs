package android.inputmethodservice;

@java.lang.Deprecated
public class Keyboard {
    public static final int EDGE_BOTTOM = 8;
    public static final int EDGE_LEFT = 1;
    public static final int EDGE_RIGHT = 2;
    public static final int EDGE_TOP = 4;
    private static final int GRID_HEIGHT = 5;
    private static final int GRID_SIZE = 50;
    private static final int GRID_WIDTH = 10;
    public static final int KEYCODE_ALT = -6;
    public static final int KEYCODE_CANCEL = -3;
    public static final int KEYCODE_DELETE = -5;
    public static final int KEYCODE_DONE = -4;
    public static final int KEYCODE_MODE_CHANGE = -2;
    public static final int KEYCODE_SHIFT = -1;
    private static float SEARCH_DISTANCE;
    static final java.lang.String TAG = "Keyboard";
    private static final java.lang.String TAG_KEY = "Key";
    private static final java.lang.String TAG_KEYBOARD = "Keyboard";
    private static final java.lang.String TAG_ROW = "Row";
    private int mCellHeight;
    private int mCellWidth;
    private int mDefaultHeight;
    private int mDefaultHorizontalGap;
    private int mDefaultVerticalGap;
    private int mDefaultWidth;
    private int mDisplayHeight;
    private int mDisplayWidth;
    private int[][] mGridNeighbors;
    private int mKeyHeight;
    private int mKeyWidth;
    private int mKeyboardMode;
    private java.util.List<android.inputmethodservice.Keyboard.Key> mKeys;
    private java.lang.CharSequence mLabel;
    private java.util.List<android.inputmethodservice.Keyboard.Key> mModifierKeys;
    private int mProximityThreshold;
    private int[] mShiftKeyIndices;
    private android.inputmethodservice.Keyboard.Key[] mShiftKeys;
    private boolean mShifted;
    private int mTotalHeight;
    private int mTotalWidth;
    private java.util.ArrayList<android.inputmethodservice.Keyboard.Row> rows;
    public Keyboard(android.content.Context p0, int p1) {}
    public Keyboard(android.content.Context p0, int p1, int p2) {}
    public Keyboard(android.content.Context p0, int p1, int p2, int p3, int p4) {}
    public Keyboard(android.content.Context p0, int p1, java.lang.CharSequence p2, int p3, int p4) {}
    private void computeNearestNeighbors() {}
    static int getDimensionOrFraction(android.content.res.TypedArray p0, int p1, int p2, int p3) { return 0; }
    private void loadKeyboard(android.content.Context p0, android.content.res.XmlResourceParser p1) {}
    private void parseKeyboardAttributes(android.content.res.Resources p0, android.content.res.XmlResourceParser p1) {}
    private void skipToEndOfRow(android.content.res.XmlResourceParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    protected android.inputmethodservice.Keyboard.Key createKeyFromXml(android.content.res.Resources p0, android.inputmethodservice.Keyboard.Row p1, int p2, int p3, android.content.res.XmlResourceParser p4) { return null; }
    protected android.inputmethodservice.Keyboard.Row createRowFromXml(android.content.res.Resources p0, android.content.res.XmlResourceParser p1) { return null; }
    public int getHeight() { return 0; }
    protected int getHorizontalGap() { return 0; }
    protected int getKeyHeight() { return 0; }
    protected int getKeyWidth() { return 0; }
    public java.util.List<android.inputmethodservice.Keyboard.Key> getKeys() { return null; }
    public int getMinWidth() { return 0; }
    public java.util.List<android.inputmethodservice.Keyboard.Key> getModifierKeys() { return null; }
    public int[] getNearestKeys(int p0, int p1) { return null; }
    public int getShiftKeyIndex() { return 0; }
    public int[] getShiftKeyIndices() { return null; }
    protected int getVerticalGap() { return 0; }
    public boolean isShifted() { return false; }
    final void resize(int p0, int p1) {}
    protected void setHorizontalGap(int p0) {}
    protected void setKeyHeight(int p0) {}
    protected void setKeyWidth(int p0) {}
    public boolean setShifted(boolean p0) { return false; }
    protected void setVerticalGap(int p0) {}

    public static class Key {
        private static final int[] KEY_STATE_NORMAL = null;
        private static final int[] KEY_STATE_NORMAL_OFF = null;
        private static final int[] KEY_STATE_NORMAL_ON = null;
        private static final int[] KEY_STATE_PRESSED = null;
        private static final int[] KEY_STATE_PRESSED_OFF = null;
        private static final int[] KEY_STATE_PRESSED_ON = null;
        public int[] codes;
        public int edgeFlags;
        public int gap;
        public int height;
        public android.graphics.drawable.Drawable icon;
        public android.graphics.drawable.Drawable iconPreview;
        private android.inputmethodservice.Keyboard keyboard;
        public java.lang.CharSequence label;
        public boolean modifier;
        public boolean on;
        public java.lang.CharSequence popupCharacters;
        public int popupResId;
        public boolean pressed;
        public boolean repeatable;
        public boolean sticky;
        public java.lang.CharSequence text;
        public int width;
        public int x;
        public int y;
        public Key(android.content.res.Resources p0, android.inputmethodservice.Keyboard.Row p1, int p2, int p3, android.content.res.XmlResourceParser p4) {}
        public Key(android.inputmethodservice.Keyboard.Row p0) {}
        public int[] getCurrentDrawableState() { return null; }
        public boolean isInside(int p0, int p1) { return false; }
        public void onPressed() {}
        public void onReleased(boolean p0) {}
        int[] parseCSV(java.lang.String p0) { return null; }
        public int squaredDistanceFrom(int p0, int p1) { return 0; }
    }

    public static class Row {
        public int defaultHeight;
        public int defaultHorizontalGap;
        public int defaultWidth;
        java.util.ArrayList<android.inputmethodservice.Keyboard.Key> mKeys;
        public int mode;
        private android.inputmethodservice.Keyboard parent;
        public int rowEdgeFlags;
        public int verticalGap;
        public Row(android.content.res.Resources p0, android.inputmethodservice.Keyboard p1, android.content.res.XmlResourceParser p2) {}
        public Row(android.inputmethodservice.Keyboard p0) {}
    }
}
