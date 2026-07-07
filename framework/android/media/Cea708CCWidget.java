package android.media;

class Cea708CCWidget extends android.media.ClosedCaptionWidget implements android.media.Cea708CCParser.DisplayListener {
    private final android.media.Cea708CCWidget.CCHandler mCCHandler = null;
    public Cea708CCWidget(android.content.Context p0) { super((android.content.Context)null); }
    public Cea708CCWidget(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public Cea708CCWidget(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public Cea708CCWidget(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public android.media.ClosedCaptionWidget.ClosedCaptionLayout createCaptionLayout(android.content.Context p0) { return null; }
    public void emitEvent(android.media.Cea708CCParser.CaptionEvent p0) {}
    public void onDraw(android.graphics.Canvas p0) {}

    static class CCHandler implements android.os.Handler.Callback {
        private static final int CAPTION_ALL_WINDOWS_BITMAP = 255;
        private static final long CAPTION_CLEAR_INTERVAL_MS = 60000L;
        private static final int CAPTION_WINDOWS_MAX = 8;
        private static final boolean DEBUG = false;
        private static final int MSG_CAPTION_CLEAR = 2;
        private static final int MSG_DELAY_CANCEL = 1;
        private static final java.lang.String TAG = "CCHandler";
        private static final int TENTHS_OF_SECOND_IN_MILLIS = 100;
        private final android.media.Cea708CCWidget.CCLayout mCCLayout = null;
        private final android.media.Cea708CCWidget.CCWindowLayout[] mCaptionWindowLayouts = null;
        private android.media.Cea708CCWidget.CCWindowLayout mCurrentWindowLayout;
        private final android.os.Handler mHandler = null;
        private boolean mIsDelayed;
        private final java.util.ArrayList<android.media.Cea708CCParser.CaptionEvent> mPendingCaptionEvents = null;
        public CCHandler(android.media.Cea708CCWidget.CCLayout p0) {}
        private void clearWindows(int p0) {}
        private void defineWindow(android.media.Cea708CCParser.CaptionWindow p0) {}
        private void delay(int p0) {}
        private void delayCancel() {}
        private void deleteWindows(int p0) {}
        private void displayWindows(int p0) {}
        private java.util.ArrayList<android.media.Cea708CCWidget.CCWindowLayout> getWindowsFromBitmap(int p0) { return null; }
        private void hideWindows(int p0) {}
        private void processPendingBuffer() {}
        private void sendBufferToCurrentWindow(java.lang.String p0) {}
        private void sendControlToCurrentWindow(char p0) {}
        private void setCurrentWindowLayout(int p0) {}
        private void setPenAttr(android.media.Cea708CCParser.CaptionPenAttr p0) {}
        private void setPenColor(android.media.Cea708CCParser.CaptionPenColor p0) {}
        private void setPenLocation(android.media.Cea708CCParser.CaptionPenLocation p0) {}
        private void setWindowAttr(android.media.Cea708CCParser.CaptionWindowAttr p0) {}
        private void toggleWindows(int p0) {}
        public boolean handleMessage(android.os.Message p0) { return false; }
        public void processCaptionEvent(android.media.Cea708CCParser.CaptionEvent p0) {}
        public void reset() {}
    }

    static class CCLayout extends android.media.Cea708CCWidget.ScaledLayout implements android.media.ClosedCaptionWidget.ClosedCaptionLayout {
        private static final float SAFE_TITLE_AREA_SCALE_END_X = 0.8999999761581421f;
        private static final float SAFE_TITLE_AREA_SCALE_END_Y = 0.8999999761581421f;
        private static final float SAFE_TITLE_AREA_SCALE_START_X = 0.10000000149011612f;
        private static final float SAFE_TITLE_AREA_SCALE_START_Y = 0.10000000149011612f;
        private final android.media.Cea708CCWidget.ScaledLayout mSafeTitleAreaLayout = null;
        public CCLayout(android.content.Context p0) { super(null); }
        public void addOrUpdateViewToSafeTitleArea(android.media.Cea708CCWidget.CCWindowLayout p0, android.media.Cea708CCWidget.ScaledLayout.ScaledLayoutParams p1) {}
        public void removeViewFromSafeTitleArea(android.media.Cea708CCWidget.CCWindowLayout p0) {}
        public void setCaptionStyle(android.view.accessibility.CaptioningManager.CaptionStyle p0) {}
        public void setFontScale(float p0) {}
    }

    static class CCView extends com.android.internal.widget.SubtitleView {
        private static final android.view.accessibility.CaptioningManager.CaptionStyle DEFAULT_CAPTION_STYLE = null;
        public CCView(android.content.Context p0) { super((android.content.Context)null); }
        public CCView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
        public CCView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
        public CCView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
        public void setCaptionStyle(android.view.accessibility.CaptioningManager.CaptionStyle p0) {}
    }

    static class CCWindowLayout extends android.widget.RelativeLayout implements android.view.View.OnLayoutChangeListener {
        private static final int ANCHOR_HORIZONTAL_16_9_MAX = 209;
        private static final int ANCHOR_HORIZONTAL_MODE_CENTER = 1;
        private static final int ANCHOR_HORIZONTAL_MODE_LEFT = 0;
        private static final int ANCHOR_HORIZONTAL_MODE_RIGHT = 2;
        private static final int ANCHOR_MODE_DIVIDER = 3;
        private static final int ANCHOR_RELATIVE_POSITIONING_MAX = 99;
        private static final int ANCHOR_VERTICAL_MAX = 74;
        private static final int ANCHOR_VERTICAL_MODE_BOTTOM = 2;
        private static final int ANCHOR_VERTICAL_MODE_CENTER = 1;
        private static final int ANCHOR_VERTICAL_MODE_TOP = 0;
        private static final int MAX_COLUMN_COUNT_16_9 = 42;
        private static final float PROPORTION_PEN_SIZE_LARGE = 1.25f;
        private static final float PROPORTION_PEN_SIZE_SMALL = 0.75f;
        private static final java.lang.String TAG = "CCWindowLayout";
        private final android.text.SpannableStringBuilder mBuilder = null;
        private android.media.Cea708CCWidget.CCLayout mCCLayout;
        private android.media.Cea708CCWidget.CCView mCCView;
        private android.view.accessibility.CaptioningManager.CaptionStyle mCaptionStyle;
        private int mCaptionWindowId;
        private final java.util.List<android.text.style.CharacterStyle> mCharacterStyles = null;
        private float mFontScale;
        private int mLastCaptionLayoutHeight;
        private int mLastCaptionLayoutWidth;
        private int mRow;
        private int mRowLimit;
        private float mTextSize;
        private java.lang.String mWidestChar;
        public CCWindowLayout(android.content.Context p0) { super((android.content.Context)null); }
        public CCWindowLayout(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
        public CCWindowLayout(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
        public CCWindowLayout(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
        private int getScreenColumnCount() { return 0; }
        private void updateText(java.lang.String p0, boolean p1) {}
        private void updateTextSize() {}
        private void updateWidestChar() {}
        public void appendText(java.lang.String p0) {}
        public void clear() {}
        public void clearText() {}
        public int getCaptionWindowId() { return 0; }
        public void hide() {}
        public void initWindow(android.media.Cea708CCWidget.CCLayout p0, android.media.Cea708CCParser.CaptionWindow p1) {}
        public void onLayoutChange(android.view.View p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8) {}
        public void removeFromCaptionView() {}
        public void sendBuffer(java.lang.String p0) {}
        public void sendControl(char p0) {}
        public void setCaptionStyle(android.view.accessibility.CaptioningManager.CaptionStyle p0) {}
        public void setCaptionWindowId(int p0) {}
        public void setFontScale(float p0) {}
        public void setPenAttr(android.media.Cea708CCParser.CaptionPenAttr p0) {}
        public void setPenColor(android.media.Cea708CCParser.CaptionPenColor p0) {}
        public void setPenLocation(int p0, int p1) {}
        public void setRowLimit(int p0) {}
        public void setText(java.lang.String p0) {}
        public void setWindowAttr(android.media.Cea708CCParser.CaptionWindowAttr p0) {}
        public void show() {}
    }

    static class ScaledLayout extends android.view.ViewGroup {
        private static final boolean DEBUG = false;
        private static final java.lang.String TAG = "ScaledLayout";
        private static final java.util.Comparator<android.graphics.Rect> mRectTopLeftSorter = null;
        private android.graphics.Rect[] mRectArray;
        public ScaledLayout(android.content.Context p0) { super((android.content.Context)null); }
        protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p0) { return false; }
        public void dispatchDraw(android.graphics.Canvas p0) {}
        public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet p0) { return null; }
        protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
        protected void onMeasure(int p0, int p1) {}

        static class ScaledLayoutParams extends android.view.ViewGroup.LayoutParams {
            public static final float SCALE_UNSPECIFIED = -1.0f;
            public float scaleEndCol;
            public float scaleEndRow;
            public float scaleStartCol;
            public float scaleStartRow;
            public ScaledLayoutParams(float p0, float p1, float p2, float p3) { super((android.view.ViewGroup.LayoutParams)null); }
            public ScaledLayoutParams(android.content.Context p0, android.util.AttributeSet p1) { super((android.view.ViewGroup.LayoutParams)null); }
        }
    }
}
