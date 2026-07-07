package android.service.games;

@android.annotation.SystemApi
public class GameService extends android.app.Service {
    public static final java.lang.String ACTION_GAME_SERVICE = "android.service.games.action.GAME_SERVICE";
    public static final java.lang.String SERVICE_META_DATA = "android.game_service";
    private static final java.lang.String TAG = "GameService";
    private android.app.IGameManagerService mGameManagerService;
    private final android.os.IBinder.DeathRecipient mGameManagerServiceDeathRecipient = null;
    private android.service.games.IGameServiceController mGameServiceController;
    private final android.service.games.IGameService mInterface = null;
    public GameService() { super(); }
    private void doOnConnected(android.service.games.IGameServiceController p0) {}
    public final void createGameSession(int p0) {}
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public void onConnected() {}
    public void onDisconnected() {}
    public void onGameStarted(android.service.games.GameStartedEvent p0) {}
}
