package android.companion.virtual.sensor;

@android.annotation.SystemApi
public final class VirtualSensorDirectChannelWriter implements java.lang.AutoCloseable {
    private static final java.lang.String TAG = "VirtualSensorWriter";
    private static final long UINT32_MAX = 4294967295L;
    private final android.util.SparseArray<android.companion.virtual.sensor.VirtualSensorDirectChannelWriter.SharedMemoryWrapper> mChannels = null;
    private final java.lang.Object mChannelsLock = null;
    private final android.util.SparseArray<android.util.SparseArray<android.companion.virtual.sensor.VirtualSensorDirectChannelWriter.DirectChannelConfiguration>> mConfiguredChannels = null;
    public VirtualSensorDirectChannelWriter() {}
    public void addChannel(int p0, android.os.SharedMemory p1) throws android.system.ErrnoException {}
    public void close() {}
    public boolean configureChannel(int p0, android.companion.virtual.sensor.VirtualSensor p1, int p2, int p3) { return false; }
    public void removeChannel(int p0) {}
    public boolean writeSensorEvent(android.companion.virtual.sensor.VirtualSensor p0, android.companion.virtual.sensor.VirtualSensorEvent p1) { return false; }

    private static final class DirectChannelConfiguration {
        private final java.util.concurrent.atomic.AtomicLong mEventCounter = null;
        private final int mReportToken = 0;
        private final int mSensorType = 0;
        private final android.companion.virtual.sensor.VirtualSensorDirectChannelWriter.SharedMemoryWrapper mSharedMemoryWrapper = null;
        DirectChannelConfiguration(int p0, int p1, android.companion.virtual.sensor.VirtualSensorDirectChannelWriter.SharedMemoryWrapper p2) {}
        void write(android.companion.virtual.sensor.VirtualSensorEvent p0) {}
    }

    private static final class SharedMemoryWrapper {
        private static final int MAXIMUM_NUMBER_OF_SENSOR_VALUES = 16;
        private static final int SENSOR_EVENT_SIZE = 104;
        private final java.nio.ByteBuffer mEventBuffer = null;
        private final java.nio.ByteBuffer mMemoryMapping = null;
        private final android.os.SharedMemory mSharedMemory = null;
        private final java.lang.Object mWriteLock = null;
        private int mWriteOffset;
        SharedMemoryWrapper(android.os.SharedMemory p0) throws android.system.ErrnoException {}
        void close() {}
        void write(int p0, int p1, long p2, android.companion.virtual.sensor.VirtualSensorEvent p3) {}
    }
}
