package android.webkit;

public class JsResult {
    private final android.webkit.JsResult.ResultReceiver mReceiver = null;
    private boolean mResult;
    @android.annotation.SystemApi
    public JsResult(android.webkit.JsResult.ResultReceiver p0) {}
    private final void wakeUp() {}
    public final void cancel() {}
    public final void confirm() {}
    @android.annotation.SystemApi
    public final boolean getResult() { return false; }

    @android.annotation.SystemApi
    public static interface ResultReceiver {
        public void onJsResultComplete(android.webkit.JsResult p0);
    }
}
