package android.os;

public class EventLogTags {
    public static final int SERVICE_MANAGER_SLOW = 230001;
    public static final int SERVICE_MANAGER_STATS = 230000;
    private EventLogTags() {}
    public static void writeServiceManagerSlow(int p0, java.lang.String p1) {}
    public static void writeServiceManagerStats(int p0, int p1, int p2) {}
}
