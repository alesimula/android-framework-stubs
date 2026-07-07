package android.view.inputmethod;

public final class InlineSuggestion implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.inputmethod.InlineSuggestion> CREATOR = null;
    private static final java.lang.String TAG = "InlineSuggestion";
    static com.android.internal.util.Parcelling<android.view.inputmethod.InlineSuggestion.InlineContentCallbackImpl> sParcellingForInlineContentCallback;
    static com.android.internal.util.Parcelling<com.android.internal.view.inline.InlineTooltipUi> sParcellingForInlineTooltipUi;
    private final com.android.internal.view.inline.IInlineContentProvider mContentProvider = null;
    private final android.view.inputmethod.InlineSuggestionInfo mInfo = null;
    private android.view.inputmethod.InlineSuggestion.InlineContentCallbackImpl mInlineContentCallback;
    private com.android.internal.view.inline.InlineTooltipUi mInlineTooltipUi;
    InlineSuggestion(android.os.Parcel p0) {}
    public InlineSuggestion(android.view.inputmethod.InlineSuggestionInfo p0, com.android.internal.view.inline.IInlineContentProvider p1) {}
    public InlineSuggestion(android.view.inputmethod.InlineSuggestionInfo p0, com.android.internal.view.inline.IInlineContentProvider p1, android.view.inputmethod.InlineSuggestion.InlineContentCallbackImpl p2, com.android.internal.view.inline.InlineTooltipUi p3) {}
    @java.lang.Deprecated
    private void __metadata() {}
    private android.view.inputmethod.InlineSuggestion.InlineContentCallbackImpl getInlineContentCallback(android.content.Context p0, java.util.concurrent.Executor p1, java.util.function.Consumer<android.widget.inline.InlineContentView> p2, com.android.internal.view.inline.InlineTooltipUi p3) { return null; }
    private static boolean isValid(int p0, int p1, int p2) { return false; }
    public static android.view.inputmethod.InlineSuggestion newInlineSuggestion(android.view.inputmethod.InlineSuggestionInfo p0) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public com.android.internal.view.inline.IInlineContentProvider getContentProvider() { return null; }
    public android.view.inputmethod.InlineSuggestionInfo getInfo() { return null; }
    public android.view.inputmethod.InlineSuggestion.InlineContentCallbackImpl getInlineContentCallback() { return null; }
    public com.android.internal.view.inline.InlineTooltipUi getInlineTooltipUi() { return null; }
    public int hashCode() { return 0; }
    public void inflate(android.content.Context p0, android.util.Size p1, java.util.concurrent.Executor p2, java.util.function.Consumer<android.widget.inline.InlineContentView> p3) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    private static final class InlineContentCallbackImpl {
        private final java.util.function.Consumer<android.widget.inline.InlineContentView> mCallback = null;
        private final java.util.concurrent.Executor mCallbackExecutor = null;
        private final android.content.Context mContext = null;
        private boolean mFirstContentReceived;
        private final com.android.internal.view.inline.IInlineContentProvider mInlineContentProvider = null;
        private com.android.internal.view.inline.InlineTooltipUi mInlineTooltipUi;
        private final android.os.Handler mMainHandler = null;
        private android.view.SurfaceControlViewHost.SurfacePackage mSurfacePackage;
        private java.util.function.Consumer<android.view.SurfaceControlViewHost.SurfacePackage> mSurfacePackageConsumer;
        private android.widget.inline.InlineContentView mView;
        InlineContentCallbackImpl(android.content.Context p0, com.android.internal.view.inline.IInlineContentProvider p1, java.util.concurrent.Executor p2, java.util.function.Consumer<android.widget.inline.InlineContentView> p3, com.android.internal.view.inline.InlineTooltipUi p4) {}
        private android.widget.inline.InlineContentView.SurfacePackageUpdater getSurfacePackageUpdater() { return null; }
        private void handleGetSurfacePackage(java.util.function.Consumer<android.view.SurfaceControlViewHost.SurfacePackage> p0) {}
        private void handleOnContent(android.view.SurfaceControlViewHost.SurfacePackage p0, int p1, int p2) {}
        private void handleOnFirstContentReceived(android.view.SurfaceControlViewHost.SurfacePackage p0, int p1, int p2) {}
        private void handleOnSurfacePackage(android.view.SurfaceControlViewHost.SurfacePackage p0) {}
        private void handleOnSurfacePackageReleased() {}
        public void onClick() {}
        public void onContent(android.view.SurfaceControlViewHost.SurfacePackage p0, int p1, int p2) {}
        public void onLongClick() {}
    }

    private static class InlineContentCallbackImplParceling implements com.android.internal.util.Parcelling<android.view.inputmethod.InlineSuggestion.InlineContentCallbackImpl> {
        private InlineContentCallbackImplParceling() {}
        public void parcel(android.view.inputmethod.InlineSuggestion.InlineContentCallbackImpl p0, android.os.Parcel p1, int p2) {}
        public android.view.inputmethod.InlineSuggestion.InlineContentCallbackImpl unparcel(android.os.Parcel p0) { return null; }
    }

    private static final class InlineContentCallbackWrapper extends com.android.internal.view.inline.IInlineContentCallback.Stub {
        private final java.lang.ref.WeakReference<android.view.inputmethod.InlineSuggestion.InlineContentCallbackImpl> mCallbackImpl = null;
        InlineContentCallbackWrapper(android.view.inputmethod.InlineSuggestion.InlineContentCallbackImpl p0) { super(); }
        public void onClick() {}
        public void onContent(android.view.SurfaceControlViewHost.SurfacePackage p0, int p1, int p2) {}
        public void onLongClick() {}
    }

    private static class InlineTooltipUiParceling implements com.android.internal.util.Parcelling<com.android.internal.view.inline.InlineTooltipUi> {
        private InlineTooltipUiParceling() {}
        public void parcel(com.android.internal.view.inline.InlineTooltipUi p0, android.os.Parcel p1, int p2) {}
        public com.android.internal.view.inline.InlineTooltipUi unparcel(android.os.Parcel p0) { return null; }
    }
}
