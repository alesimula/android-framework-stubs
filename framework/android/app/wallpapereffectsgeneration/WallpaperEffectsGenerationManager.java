package android.app.wallpapereffectsgeneration;

@android.annotation.SystemApi
public final class WallpaperEffectsGenerationManager {
    private final android.app.wallpapereffectsgeneration.IWallpaperEffectsGenerationManager mService = null;
    public WallpaperEffectsGenerationManager(android.app.wallpapereffectsgeneration.IWallpaperEffectsGenerationManager p0) {}
    @android.annotation.SystemApi
    public void generateCinematicEffect(android.app.wallpapereffectsgeneration.CinematicEffectRequest p0, java.util.concurrent.Executor p1, android.app.wallpapereffectsgeneration.WallpaperEffectsGenerationManager.CinematicEffectListener p2) {}

    public static interface CinematicEffectListener {
        public void onCinematicEffectGenerated(android.app.wallpapereffectsgeneration.CinematicEffectResponse p0);
    }

    private static final class CinematicEffectListenerWrapper extends android.app.wallpapereffectsgeneration.ICinematicEffectListener.Stub {
        private final java.util.concurrent.Executor mExecutor = null;
        private final android.app.wallpapereffectsgeneration.WallpaperEffectsGenerationManager.CinematicEffectListener mListener = null;
        CinematicEffectListenerWrapper(android.app.wallpapereffectsgeneration.WallpaperEffectsGenerationManager.CinematicEffectListener p0, java.util.concurrent.Executor p1) { super(); }
        public void onCinematicEffectGenerated(android.app.wallpapereffectsgeneration.CinematicEffectResponse p0) {}
    }
}
