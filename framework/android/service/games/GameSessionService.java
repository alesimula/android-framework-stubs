package android.service.games;

@android.annotation.SystemApi
public abstract class GameSessionService extends android.app.Service {
    public static final java.lang.String ACTION_GAME_SESSION_SERVICE = "android.service.games.action.GAME_SESSION_SERVICE";
    private android.hardware.display.DisplayManager mDisplayManager;
    private final android.service.games.IGameSessionService mInterface = null;
    public GameSessionService() { super(); }
    private void doCreate(android.service.games.IGameSessionController p0, android.service.games.CreateGameSessionRequest p1, android.service.games.GameSessionViewHostConfiguration p2, com.android.internal.infra.AndroidFuture<android.service.games.CreateGameSessionResult> p3) {}
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public void onCreate() {}
    public abstract android.service.games.GameSession onNewSession(android.service.games.CreateGameSessionRequest p0);
}
