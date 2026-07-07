package android.hardware;

public final class ConsumerIrManager {
    private static final java.lang.String TAG = "ConsumerIr";
    private final java.lang.String mPackageName = null;
    private final android.hardware.IConsumerIrService mService = null;
    public ConsumerIrManager(android.content.Context p0) throws android.os.ServiceManager.ServiceNotFoundException {}
    public android.hardware.ConsumerIrManager.CarrierFrequencyRange[] getCarrierFrequencies() { return null; }
    public boolean hasIrEmitter() { return false; }
    public void transmit(int p0, int[] p1) {}

    public final class CarrierFrequencyRange {
        private final int mMaxFrequency = 0;
        private final int mMinFrequency = 0;
        public CarrierFrequencyRange(android.hardware.ConsumerIrManager p0, int p1, int p2) {}
        public int getMaxFrequency() { return 0; }
        public int getMinFrequency() { return 0; }
    }
}
