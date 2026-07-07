package android.app.privatecompute;

public abstract class DataMigrationToPccService extends android.app.Service {
    public static final long MIGRATION_TIMEOUT_MS = 60000L;
    public static final java.lang.String SERVICE_INTERFACE = "android.app.privatecompute.DataMigrationToPccService";
    private final android.app.privatecompute.IDataMigrationToPccService mInterface = null;
    public DataMigrationToPccService() { super(); }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract void onMigrationRequested(java.util.function.Consumer<android.app.privatecompute.MigrationRequestResult> p0);
}
