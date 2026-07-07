package android.uilatencystats;

public interface UiLatencyEventListener {
    public static java.lang.String getPerfettoTriggerName(java.lang.String p0) { return null; }
    public java.util.List<java.lang.Integer> getEventIdsToListen();
    public void onEvent(android.uilatencystats.Event p0);
}
