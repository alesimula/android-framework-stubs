package android.service.autofill;

public abstract class AutofillService extends android.app.Service {
    public static final java.lang.String EXTRA_ERROR = "error";
    public static final java.lang.String EXTRA_FILL_RESPONSE = "android.service.autofill.extra.FILL_RESPONSE";
    public static final java.lang.String EXTRA_RESULT = "result";
    public static final java.lang.String SERVICE_INTERFACE = "android.service.autofill.AutofillService";
    public static final java.lang.String SERVICE_META_DATA = "android.autofill";
    private static final java.lang.String TAG = "AutofillService";
    public static final java.lang.String WEBVIEW_REQUESTED_CREDENTIAL_KEY = "webview_requested_credential";
    private android.os.Handler mHandler;
    private final android.service.autofill.IAutoFillService mInterface = null;
    public AutofillService() { super(); }
    @java.lang.Deprecated
    public final android.service.autofill.FillEventHistory getFillEventHistory() { return null; }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public void onConnected() {}
    public void onConvertCredentialRequest(android.service.autofill.ConvertCredentialRequest p0, android.service.autofill.ConvertCredentialCallback p1) {}
    public void onCreate() {}
    public void onDisconnected() {}
    public void onFillCredentialRequest(android.service.autofill.FillRequest p0, android.os.CancellationSignal p1, android.service.autofill.FillCallback p2, android.os.IBinder p3) {}
    public abstract void onFillRequest(android.service.autofill.FillRequest p0, android.os.CancellationSignal p1, android.service.autofill.FillCallback p2);
    public abstract void onSaveRequest(android.service.autofill.SaveRequest p0, android.service.autofill.SaveCallback p1);
    public void onSavedDatasetsInfoRequest(android.service.autofill.SavedDatasetsInfoCallback p0) {}
    public void onSessionDestroyed(android.service.autofill.FillEventHistory p0) {}
}
