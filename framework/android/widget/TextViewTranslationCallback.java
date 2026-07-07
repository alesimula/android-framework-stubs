package android.widget;

public class TextViewTranslationCallback implements android.view.translation.ViewTranslationCallback {
    private static final char COMPAT_PAD_CHARACTER = (char)0x2002;
    private static final boolean DEBUG = Boolean.valueOf(false);
    private static final java.lang.String TAG = "TextViewTranslationCb";
    private int mAnimationDurationMillis;
    private boolean mAnimationRunning;
    private android.animation.ValueAnimator mAnimator;
    private java.lang.CharSequence mContentDescription;
    private boolean mIsShowingTranslation;
    private boolean mIsTextPaddingEnabled;
    private boolean mOriginalClickable;
    private int mOriginalFocusable;
    private boolean mOriginalFocusableInTouchMode;
    private boolean mOriginalIsTextSelectable;
    private boolean mOriginalLongClickable;
    private java.lang.CharSequence mPaddedText;
    private android.text.method.TranslationTransformationMethod mTranslationTransformation;
    public TextViewTranslationCallback() {}
    private void clearTranslationTransformation() {}
    private static int colorWithAlpha(int p0, int p1) { return 0; }
    private java.lang.CharSequence computePaddedText(java.lang.CharSequence p0, java.lang.CharSequence p1) { return null; }
    private void runChangeTextWithAnimationIfNeeded(android.widget.TextView p0, java.lang.Runnable p1) {}
    public void enableContentPadding() {}
    java.lang.CharSequence getPaddedText(java.lang.CharSequence p0, java.lang.CharSequence p1) { return null; }
    public boolean isAnimationRunning() { return false; }
    public boolean isShowingTranslation() { return false; }
    boolean isTextPaddingEnabled() { return false; }
    public boolean onClearTranslation(android.view.View p0) { return false; }
    public boolean onHideTranslation(android.view.View p0) { return false; }
    public boolean onShowTranslation(android.view.View p0) { return false; }
    public void setAnimationDurationMillis(int p0) {}
}
