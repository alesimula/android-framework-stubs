package android.hardware.camera2.params;

@android.annotation.SystemApi
public final class SharedSessionConfiguration {
    private static final int SHARED_OUTPUT_CONFIG_NUM_OF_ENTRIES = 11;
    private static final java.lang.String TAG = "SharedSessionConfiguration";
    private int mColorSpace;
    private final java.util.ArrayList<android.hardware.camera2.params.SharedSessionConfiguration.SharedOutputConfiguration> mOutputStreamConfigurations = null;
    public SharedSessionConfiguration(int p0, long[] p1) {}
    public android.graphics.ColorSpace getColorSpace() { return null; }
    public java.util.List<android.hardware.camera2.params.SharedSessionConfiguration.SharedOutputConfiguration> getOutputStreamsInformation() { return null; }

    public static final class SharedOutputConfiguration {
        private final int mDataspace = 0;
        private final int mFormat = 0;
        private int mMirrorMode;
        private java.lang.String mPhysicalCameraId;
        private boolean mReadoutTimestampEnabled;
        private final android.util.Size mSize = null;
        private final long mStreamUseCase = 0L;
        private final int mSurfaceType = 0;
        private int mTimestampBase;
        private final long mUsage = 0L;
        public SharedOutputConfiguration(int p0, android.util.Size p1, int p2, int p3, boolean p4, int p5, int p6, long p7, long p8, java.lang.String p9) {}
        public int getDataspace() { return 0; }
        public int getFormat() { return 0; }
        public int getMirrorMode() { return 0; }
        public java.lang.String getPhysicalCameraId() { return null; }
        public android.util.Size getSize() { return null; }
        public long getStreamUseCase() { return 0L; }
        public int getSurfaceType() { return 0; }
        public int getTimestampBase() { return 0; }
        public long getUsage() { return 0L; }
        public boolean isReadoutTimestampEnabled() { return false; }
    }
}
