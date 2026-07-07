package android.service.autofill;

@android.annotation.SystemApi
public abstract class InlineSuggestionRenderService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.service.autofill.InlineSuggestionRenderService";
    private static final java.lang.String TAG = "InlineSuggestionRenderService";
    private final android.util.LruCache<android.service.autofill.InlineSuggestionRenderService.InlineSuggestionUiImpl, java.lang.Boolean> mActiveInlineSuggestions = null;
    private android.service.autofill.IInlineSuggestionUiCallback mCallback;
    private final android.os.Handler mMainHandler = null;
    public InlineSuggestionRenderService() { super(); }
    private void handleDestroySuggestionViews(int p0, int p1) {}
    private void handleGetInlineSuggestionsRendererInfo(android.os.RemoteCallback p0) {}
    private void handleRenderSuggestion(android.service.autofill.IInlineSuggestionUiCallback p0, android.service.autofill.InlinePresentation p1, int p2, int p3, android.os.IBinder p4, int p5, int p6, int p7) {}
    private android.util.Size measuredSize(android.view.View p0, int p1, int p2, android.util.Size p3, android.util.Size p4) { return null; }
    protected final void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public android.os.Bundle onGetInlineSuggestionsRendererInfo() { return null; }
    public android.view.View onRenderSuggestion(android.service.autofill.InlinePresentation p0, int p1, int p2) { return null; }
    public final void startIntentSender(android.content.IntentSender p0) {}

    private final class InlineSuggestionUiImpl {
        private final android.os.Handler mHandler = null;
        private final int mSessionId = 0;
        private final int mUserId = 0;
        private android.view.SurfaceControlViewHost mViewHost;
        InlineSuggestionUiImpl(android.service.autofill.InlineSuggestionRenderService p0, android.view.SurfaceControlViewHost p1, android.os.Handler p2, int p3, int p4) {}
        public void getSurfacePackage(android.service.autofill.ISurfacePackageResultCallback p0) {}
        public void releaseSurfaceControlViewHost() {}
    }

    private static final class InlineSuggestionUiWrapper extends android.service.autofill.IInlineSuggestionUi.Stub {
        private final java.lang.ref.WeakReference<android.service.autofill.InlineSuggestionRenderService.InlineSuggestionUiImpl> mUiImpl = null;
        InlineSuggestionUiWrapper(android.service.autofill.InlineSuggestionRenderService.InlineSuggestionUiImpl p0) { super(); }
        public void getSurfacePackage(android.service.autofill.ISurfacePackageResultCallback p0) {}
        public void releaseSurfaceControlViewHost() {}
    }
}
