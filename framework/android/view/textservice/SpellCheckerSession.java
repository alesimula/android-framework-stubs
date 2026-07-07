package android.view.textservice;

public class SpellCheckerSession {
    private static final boolean DBG = false;
    public static final java.lang.String SERVICE_META_DATA = "android.view.textservice.scs";
    private static final java.lang.String TAG = null;
    private final java.util.concurrent.Executor mExecutor = null;
    private final android.view.textservice.SpellCheckerSession.InternalListener mInternalListener = null;
    private final android.view.textservice.SpellCheckerInfo mSpellCheckerInfo = null;
    private final android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener mSpellCheckerSessionListener = null;
    private final android.view.textservice.SpellCheckerSession.SpellCheckerSessionListenerImpl mSpellCheckerSessionListenerImpl = null;
    private final android.view.textservice.TextServicesManager mTextServicesManager = null;
    public SpellCheckerSession(android.view.textservice.SpellCheckerInfo p0, android.view.textservice.TextServicesManager p1, android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener p2, java.util.concurrent.Executor p3) {}
    public void cancel() {}
    public void close() {}
    protected void finalize() throws java.lang.Throwable {}
    public void getSentenceSuggestions(android.view.textservice.TextInfo[] p0, int p1) {}
    public android.view.textservice.SpellCheckerInfo getSpellChecker() { return null; }
    public com.android.internal.textservice.ISpellCheckerSessionListener getSpellCheckerSessionListener() { return null; }
    @java.lang.Deprecated
    public void getSuggestions(android.view.textservice.TextInfo p0, int p1) {}
    @java.lang.Deprecated
    public void getSuggestions(android.view.textservice.TextInfo[] p0, int p1, boolean p2) {}
    public com.android.internal.textservice.ITextServicesSessionListener getTextServicesSessionListener() { return null; }
    void handleOnGetSentenceSuggestionsMultiple(android.view.textservice.SentenceSuggestionsInfo[] p0) {}
    void handleOnGetSuggestionsMultiple(android.view.textservice.SuggestionsInfo[] p0) {}
    public boolean isSessionDisconnected() { return false; }

    private static final class InternalListener extends com.android.internal.textservice.ITextServicesSessionListener.Stub {
        private final android.view.textservice.SpellCheckerSession.SpellCheckerSessionListenerImpl mParentSpellCheckerSessionListenerImpl = null;
        public InternalListener(android.view.textservice.SpellCheckerSession.SpellCheckerSessionListenerImpl p0) { super(); }
        public void onServiceConnected(com.android.internal.textservice.ISpellCheckerSession p0) {}
    }

    public static interface SpellCheckerSessionListener {
        public void onGetSentenceSuggestions(android.view.textservice.SentenceSuggestionsInfo[] p0);
        public void onGetSuggestions(android.view.textservice.SuggestionsInfo[] p0);
    }

    private static final class SpellCheckerSessionListenerImpl extends com.android.internal.textservice.ISpellCheckerSessionListener.Stub {
        private static final int STATE_CLOSED_AFTER_CONNECTION = 2;
        private static final int STATE_CLOSED_BEFORE_CONNECTION = 3;
        private static final int STATE_CONNECTED = 1;
        private static final int STATE_WAIT_CONNECTION = 0;
        private static final int TASK_CANCEL = 1;
        private static final int TASK_CLOSE = 3;
        private static final int TASK_GET_SUGGESTIONS_MULTIPLE = 2;
        private static final int TASK_GET_SUGGESTIONS_MULTIPLE_FOR_SENTENCE = 4;
        private android.os.Handler mAsyncHandler;
        private com.android.internal.textservice.ISpellCheckerSession mISpellCheckerSession;
        private final java.util.Queue<android.view.textservice.SpellCheckerSession.SpellCheckerSessionListenerImpl.SpellCheckerParams> mPendingTasks = null;
        private final java.lang.ref.WeakReference<android.view.textservice.SpellCheckerSession> mSpellCheckerSession = null;
        private int mState;
        private android.os.HandlerThread mThread;
        SpellCheckerSessionListenerImpl(android.view.textservice.SpellCheckerSession p0) { super(); }
        private android.view.textservice.SpellCheckerSession getSpellCheckerSession() { return null; }
        private void processCloseLocked() {}
        private void processOrEnqueueTask(android.view.textservice.SpellCheckerSession.SpellCheckerSessionListenerImpl.SpellCheckerParams p0) {}
        private void processTask(com.android.internal.textservice.ISpellCheckerSession p0, android.view.textservice.SpellCheckerSession.SpellCheckerSessionListenerImpl.SpellCheckerParams p1, boolean p2) {}
        private static java.lang.String stateToString(int p0) { return null; }
        private static java.lang.String taskToString(int p0) { return null; }
        public void cancel() {}
        public void close() {}
        public void getSentenceSuggestionsMultiple(android.view.textservice.TextInfo[] p0, int p1) {}
        public void getSuggestionsMultiple(android.view.textservice.TextInfo[] p0, int p1, boolean p2) {}
        public boolean isDisconnected() { return false; }
        public void onGetSentenceSuggestions(android.view.textservice.SentenceSuggestionsInfo[] p0) {}
        public void onGetSuggestions(android.view.textservice.SuggestionsInfo[] p0) {}
        public void onServiceConnected(com.android.internal.textservice.ISpellCheckerSession p0) {}

        private static class SpellCheckerParams {
            public final boolean mSequentialWords = false;
            public com.android.internal.textservice.ISpellCheckerSession mSession;
            public final int mSuggestionsLimit = 0;
            public final android.view.textservice.TextInfo[] mTextInfos = null;
            public final int mWhat = 0;
            public SpellCheckerParams(int p0, android.view.textservice.TextInfo[] p1, int p2, boolean p3) {}
        }
    }

    public static class SpellCheckerSessionParams {
        private final android.os.Bundle mExtras = null;
        private final java.util.Locale mLocale = null;
        private final boolean mShouldReferToSpellCheckerLanguageSettings = false;
        private final int mSupportedAttributes = 0;
        private SpellCheckerSessionParams(java.util.Locale p0, boolean p1, int p2, android.os.Bundle p3) {}
        public android.os.Bundle getExtras() { return null; }
        public java.util.Locale getLocale() { return null; }
        public int getSupportedAttributes() { return 0; }
        public boolean shouldReferToSpellCheckerLanguageSettings() { return false; }

        public static final class Builder {
            private android.os.Bundle mExtras;
            private java.util.Locale mLocale;
            private boolean mShouldReferToSpellCheckerLanguageSettings;
            private int mSupportedAttributes;
            public Builder() {}
            public android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams build() { return null; }
            public android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams.Builder setExtras(android.os.Bundle p0) { return null; }
            public android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams.Builder setLocale(java.util.Locale p0) { return null; }
            public android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams.Builder setShouldReferToSpellCheckerLanguageSettings(boolean p0) { return null; }
            public android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams.Builder setSupportedAttributes(int p0) { return null; }
        }
    }
}
