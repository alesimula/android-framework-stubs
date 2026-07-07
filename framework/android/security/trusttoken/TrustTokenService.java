package android.security.trusttoken;

@android.annotation.SystemApi
public abstract class TrustTokenService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.security.trusttoken.TrustTokenService";
    private static final java.lang.String TAG = "TrustTokenService";
    private final android.security.trusttoken.ITrustTokenService.Stub mBinder = null;
    public TrustTokenService() { super(); }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract void onRequestTrustTokens(android.security.trusttoken.TrustTokenRequest p0, android.os.CancellationSignal p1, android.os.OutcomeReceiver<android.security.trusttoken.TrustTokenResponse, android.security.trusttoken.TrustTokenServiceException> p2);
}
