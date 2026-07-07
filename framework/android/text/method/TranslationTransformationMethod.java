package android.text.method;

public class TranslationTransformationMethod implements android.text.method.TransformationMethod2 {
    private static final java.util.regex.Pattern PATTERN_WHITESPACE = null;
    private static final java.lang.String TAG = "TranslationTransformationMethod";
    private boolean mAllowLengthChanges;
    private android.text.method.TransformationMethod mOriginalTranslationMethod;
    private final android.view.translation.ViewTranslationResponse mTranslationResponse = null;
    public TranslationTransformationMethod(android.view.translation.ViewTranslationResponse p0, android.text.method.TransformationMethod p1) {}
    private boolean isWhitespace(java.lang.String p0) { return false; }
    public android.text.method.TransformationMethod getOriginalTransformationMethod() { return null; }
    public java.lang.CharSequence getTransformation(java.lang.CharSequence p0, android.view.View p1) { return null; }
    public android.view.translation.ViewTranslationResponse getViewTranslationResponse() { return null; }
    public void onFocusChanged(android.view.View p0, java.lang.CharSequence p1, boolean p2, int p3, android.graphics.Rect p4) {}
    public void setLengthChangesAllowed(boolean p0) {}
}
