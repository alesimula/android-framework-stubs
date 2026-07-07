package android.media.tv.tuner.filter;

@android.annotation.SystemApi
public final class IpFilterConfiguration extends android.media.tv.tuner.filter.FilterConfiguration {
    public static final int INVALID_IP_FILTER_CONTEXT_ID = -1;
    private final byte[] mDstIpAddress = null;
    private final int mDstPort = 0;
    private final int mIpFilterContextId = 0;
    private final boolean mPassthrough = false;
    private final byte[] mSrcIpAddress = null;
    private final int mSrcPort = 0;
    private IpFilterConfiguration(android.media.tv.tuner.filter.Settings p0, byte[] p1, byte[] p2, int p3, int p4, boolean p5, int p6) { super(null); }
    public static android.media.tv.tuner.filter.IpFilterConfiguration.Builder builder() { return null; }
    public byte[] getDstIpAddress() { return null; }
    public int getDstPort() { return 0; }
    public int getIpFilterContextId() { return 0; }
    public byte[] getSrcIpAddress() { return null; }
    public int getSrcPort() { return 0; }
    public int getType() { return 0; }
    public boolean isPassthrough() { return false; }

    public static final class Builder {
        private byte[] mDstIpAddress;
        private int mDstPort;
        private int mIpCid;
        private boolean mPassthrough;
        private android.media.tv.tuner.filter.Settings mSettings;
        private byte[] mSrcIpAddress;
        private int mSrcPort;
        private Builder() {}
        public android.media.tv.tuner.filter.IpFilterConfiguration build() { return null; }
        public android.media.tv.tuner.filter.IpFilterConfiguration.Builder setDstIpAddress(byte[] p0) { return null; }
        public android.media.tv.tuner.filter.IpFilterConfiguration.Builder setDstPort(int p0) { return null; }
        public android.media.tv.tuner.filter.IpFilterConfiguration.Builder setIpFilterContextId(int p0) { return null; }
        public android.media.tv.tuner.filter.IpFilterConfiguration.Builder setPassthrough(boolean p0) { return null; }
        public android.media.tv.tuner.filter.IpFilterConfiguration.Builder setSettings(android.media.tv.tuner.filter.Settings p0) { return null; }
        public android.media.tv.tuner.filter.IpFilterConfiguration.Builder setSrcIpAddress(byte[] p0) { return null; }
        public android.media.tv.tuner.filter.IpFilterConfiguration.Builder setSrcPort(int p0) { return null; }
    }
}
