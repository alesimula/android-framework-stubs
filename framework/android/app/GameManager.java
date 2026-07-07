package android.app;

public final class GameManager {
    public static final int GAME_MODE_BATTERY = 3;
    public static final int GAME_MODE_CUSTOM = 4;
    public static final int GAME_MODE_PERFORMANCE = 2;
    public static final int GAME_MODE_STANDARD = 1;
    public static final int GAME_MODE_UNSUPPORTED = 0;
    private static final java.lang.String TAG = "GameManager";
    private final android.content.Context mContext = null;
    private final android.app.IGameManagerService mService = null;
    GameManager(android.content.Context p0, android.app.IGameManagerService p1) {}
    private int getGameModeImpl(java.lang.String p0, int p1) { return 0; }
    public int[] getAvailableGameModes(java.lang.String p0) { return null; }
    public int getGameMode() { return 0; }
    public int getGameMode(java.lang.String p0) { return 0; }
    @android.annotation.SystemApi
    public android.app.GameModeInfo getGameModeInfo(java.lang.String p0) { return null; }
    public boolean isAngleEnabled(java.lang.String p0) { return false; }
    public void notifyGraphicsEnvironmentSetup() {}
    @android.annotation.SystemApi
    public void setGameMode(java.lang.String p0, int p1) {}
    public void setGameServiceProvider(java.lang.String p0) {}
    public void setGameState(android.app.GameState p0) {}
    @android.annotation.SystemApi
    public void updateCustomGameModeConfiguration(java.lang.String p0, android.app.GameModeConfiguration p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface GameMode {
    }
}
