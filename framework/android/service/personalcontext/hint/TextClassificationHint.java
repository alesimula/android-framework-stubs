package android.service.personalcontext.hint;

@android.annotation.SystemApi
public class TextClassificationHint extends android.service.personalcontext.hint.ContextHint {
    static final java.lang.String KEY_TEXT_CLASSIFICATION_REQUEST = "key_text_classification_request";
    static final java.lang.String KEY_TEXT_CLASSIFICATION_SESSION_ID = "key_text_classification_session_id";
    private final android.view.textclassifier.TextClassification.Request mTextClassificationRequest = null;
    private final java.lang.String mTextClassificationSessionId = null;
    TextClassificationHint(android.service.personalcontext.hint.ContextHint.ConstructorParams p0, android.os.Bundle p1) { super(null); }
    TextClassificationHint(android.service.personalcontext.hint.ContextHint.ConstructorParams p0, android.view.textclassifier.TextClassification.Request p1, java.lang.String p2) { super(null); }
    public boolean equals(java.lang.Object p0) { return false; }
    int getHintType() { return 0; }
    public java.lang.String getSessionId() { return null; }
    public android.view.textclassifier.TextClassification.Request getTextClassificationRequest() { return null; }
    public int hashCode() { return 0; }
    android.os.Bundle toBundleImpl() { return null; }

    public static final class Builder {
        private final android.service.personalcontext.hint.ContextHint.ConstructorParams.Builder mBaseBuilder = null;
        private final android.view.textclassifier.TextClassification.Request mTextClassificationRequest = null;
        private final java.lang.String mTextClassificationSessionId = null;
        public Builder(android.view.textclassifier.TextClassification.Request p0, java.lang.String p1) {}
        public android.service.personalcontext.hint.TextClassificationHint.Builder addToken(android.service.personalcontext.Token p0) { return null; }
        public android.service.personalcontext.hint.TextClassificationHint build() { return null; }
    }
}
