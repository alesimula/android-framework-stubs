package android.service.games;

public final class GameSessionTrampolineActivity extends android.app.Activity {
    static final java.lang.String FUTURE_KEY = "GameSessionTrampolineActivity.future";
    private static final java.lang.String HAS_LAUNCHED_INTENT_KEY = "GameSessionTrampolineActivity.hasLaunchedIntent";
    static final java.lang.String INTENT_KEY = "GameSessionTrampolineActivity.intent";
    static final java.lang.String OPTIONS_KEY = "GameSessionTrampolineActivity.options";
    private static final int REQUEST_CODE = 1;
    private static final java.lang.String TAG = "GameSessionTrampoline";
    private boolean mHasLaunchedIntent;
    public GameSessionTrampolineActivity() { super(); }
    public static android.content.Intent createIntent(android.content.Intent p0, android.os.Bundle p1, com.android.internal.infra.AndroidFuture<android.service.games.GameSessionActivityResult> p2) { return null; }
    protected void onActivityResult(int p0, int p1, android.content.Intent p2) {}
    protected void onCreate(android.os.Bundle p0) {}
    protected void onSaveInstanceState(android.os.Bundle p0) {}
}
