package android.window;

public class ProxyOnBackInvokedDispatcher implements android.window.OnBackInvokedDispatcher {
    private android.window.OnBackInvokedDispatcher mActualDispatcher;
    private final java.util.List<android.util.Pair<android.window.OnBackInvokedCallback, java.lang.Integer>> mCallbacks = null;
    private final android.window.WindowOnBackInvokedDispatcher.Checker mChecker = null;
    private android.window.ImeBackCallbackSender mImeBackCallbackSender;
    private final java.lang.Object mLock = null;
    public ProxyOnBackInvokedDispatcher(android.content.Context p0) {}
    private void clearCallbacksOnDispatcher() {}
    private void registerOnBackInvokedCallbackUnchecked(android.window.OnBackInvokedCallback p0, int p1) {}
    private void transferCallbacksToDispatcher() {}
    public void registerOnBackInvokedCallback(int p0, android.window.OnBackInvokedCallback p1) {}
    public void registerSystemOnBackInvokedCallback(android.window.OnBackInvokedCallback p0) {}
    public void reset() {}
    public void setActualDispatcher(android.window.OnBackInvokedDispatcher p0) {}
    public void setImeBackCallbackSender(android.window.ImeBackCallbackSender p0) {}
    public void unregisterOnBackInvokedCallback(android.window.OnBackInvokedCallback p0) {}
}
