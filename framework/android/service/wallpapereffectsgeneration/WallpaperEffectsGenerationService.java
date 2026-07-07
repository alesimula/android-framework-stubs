package android.service.wallpapereffectsgeneration;

@android.annotation.SystemApi
public abstract class WallpaperEffectsGenerationService extends android.app.Service {
    private static final boolean DEBUG = false;
    public static final java.lang.String SERVICE_INTERFACE = "android.service.wallpapereffectsgeneration.WallpaperEffectsGenerationService";
    private static final java.lang.String TAG = "WallpaperEffectsGenerationService";
    private android.os.Handler mHandler;
    private final android.service.wallpapereffectsgeneration.IWallpaperEffectsGenerationService mInterface = null;
    private android.app.wallpapereffectsgeneration.IWallpaperEffectsGenerationManager mService;
    public WallpaperEffectsGenerationService() { super(); }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public void onCreate() {}
    public abstract void onGenerateCinematicEffect(android.app.wallpapereffectsgeneration.CinematicEffectRequest p0);
    public final void returnCinematicEffectResponse(android.app.wallpapereffectsgeneration.CinematicEffectResponse p0) {}
}
