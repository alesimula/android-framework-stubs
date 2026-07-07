package android.uilatencystats;

public abstract class UiLatencyStatsManagerInternal {
    public UiLatencyStatsManagerInternal() {}
    public abstract void publishEvent(android.uilatencystats.Event p0);
    public abstract void registerUiLatencyEventListener(android.uilatencystats.UiLatencyEventListener p0);
}
