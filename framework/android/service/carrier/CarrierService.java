package android.service.carrier;

public abstract class CarrierService extends android.app.Service {
    public static final java.lang.String CARRIER_SERVICE_INTERFACE = "android.service.carrier.CarrierService";
    private static final java.lang.String LOG_TAG = "CarrierService";
    private final android.service.carrier.ICarrierService.Stub mStubWrapper = null;
    public CarrierService() { super(); }
    public final void notifyCarrierNetworkChange(int p0, boolean p1) {}
    @java.lang.Deprecated
    public final void notifyCarrierNetworkChange(boolean p0) {}
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public android.os.PersistableBundle onLoadConfig(int p0, android.service.carrier.CarrierIdentifier p1) { return null; }
    @java.lang.Deprecated
    public abstract android.os.PersistableBundle onLoadConfig(android.service.carrier.CarrierIdentifier p0);

    public class ICarrierServiceWrapper extends android.service.carrier.ICarrierService.Stub {
        public static final java.lang.String KEY_CONFIG_BUNDLE = "config_bundle";
        public static final int RESULT_ERROR = 1;
        public static final int RESULT_OK = 0;
        public ICarrierServiceWrapper(android.service.carrier.CarrierService p0) { super(); }
        protected void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
        public void getCarrierConfig(int p0, android.service.carrier.CarrierIdentifier p1, android.os.ResultReceiver p2) {}
    }
}
